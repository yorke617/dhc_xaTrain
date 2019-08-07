package com.dhc.dhc_xatrain.welcome.service;

import com.dhc.dhc_xatrain.daos.WebsitesMapper;
import com.dhc.dhc_xatrain.mapper.Websites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelcomeImpl implements WelcomeService {

    @Autowired
    private WebsitesMapper websitesMapper;
    @Override
    public List<Websites> getWebSites() {
        return websitesMapper.selectAll();
    }
}
