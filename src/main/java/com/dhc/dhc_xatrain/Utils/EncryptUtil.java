package com.dhc.dhc_xatrain.Utils;


import org.springframework.util.Base64Utils;
import sun.misc.BASE64Decoder;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class EncryptUtil {
	private static final String KEY = "o7H8uIM2O5qv65l2";
	private static final String ALGORITHMSTR = "AES/ECB/PKCS5Padding";
	private final static Random random = new Random();
	
	public static String base64Encode(byte[] bytes) {
		return Base64Utils.encodeToString(bytes);
	}

	public static byte[] base64Decode(String base64Code) throws Exception {
		return new BASE64Decoder().decodeBuffer(base64Code);
	}

	public static byte[] aesEncryptToBytes(String content, String encryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(encryptKey.getBytes(), "AES"));
		return cipher.doFinal(content.getBytes("utf-8"));
	}

	public static String aesEncrypt(String content, String encryptKey) throws Exception {
		return base64Encode(aesEncryptToBytes(content, encryptKey));
	}

	public static String aesDecryptByBytes(byte[] encryptBytes, String decryptKey) throws Exception {
		KeyGenerator kgen = KeyGenerator.getInstance("AES");
		kgen.init(128);
		Cipher cipher = Cipher.getInstance(ALGORITHMSTR);
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(decryptKey.getBytes(), "AES"));
		byte[] decryptBytes = cipher.doFinal(encryptBytes);
		return new String(decryptBytes);
	}

	public static String aesDecrypt(String encryptStr, String decryptKey) throws Exception {
		return aesDecryptByBytes(base64Decode(encryptStr), decryptKey);
	}
	

	/**
	 * 随机生成秘钥
	 */
	public static String getKey() {
		String s = KEY;
		try {
			KeyGenerator kg = KeyGenerator.getInstance("AES");
			kg.init(128);
			// 要生成多少位，只需要修改这里即可128, 192或256
			SecretKey sk = kg.generateKey();
			byte[] b = sk.getEncoded();
			s = toHexString(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}

	/**
	 * 使用指定的字符串生成秘钥
	 */
	public static String getKeyByPass() {
		// 生成秘钥
		String password = "PickFruit";
		String s = KEY;
		try {
			KeyGenerator kg = KeyGenerator.getInstance("AES");
			// kg.init(128);//要生成多少位，只需要修改这里即可128, 192或256
			// SecureRandom是生成安全随机数序列，password.getBytes()是种子，只要种子相同，序列就一样，所以生成的秘钥就一样。
			kg.init(128, new SecureRandom(password.getBytes()));
			SecretKey sk = kg.generateKey();
			byte[] b = sk.getEncoded();
			s = toHexString(b);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			System.out.println("没有此算法。");
		}
		return s;
	}

	/**
	 * byte数组转化为16进制字符串
	 * 
	 * @param byteArray
	 * @return
	 */
	public static String toHexString(byte[] byteArray) {
		if (byteArray == null || byteArray.length < 1)
			throw new IllegalArgumentException("this byteArray must not be null or empty");

		final StringBuilder hexString = new StringBuilder();
		for (int i = 0; i < byteArray.length; i++) {
			if ((byteArray[i] & 0xff) < 0x10)// 0~F前面不零
				hexString.append("0");
			hexString.append(Integer.toHexString(0xFF & byteArray[i]));
		}
		
		return hexString.toString().substring(16);
	}

	public static String getRandomCode(){
		return UUID.randomUUID().toString();
	}

	/**
	 * 
	 * 测试
	 *
	 * 
	 * 
	 */
//
//	public static void main(String[] args) throws Exception {
//
//		String content = "19890617"; 
//
//		System.out.println("加密前：" + content);
//
//		System.out.println("加密密钥和解密密钥：" + KEY);
//
//		String encrypt = aesEncrypt(content, KEY);
//
//		System.out.println(encrypt.length() + ":加密后：" + encrypt);
//
//		String decrypt = aesDecrypt(encrypt, KEY);
//
//		System.out.println("解密后：" + decrypt);
//
//	}
}
