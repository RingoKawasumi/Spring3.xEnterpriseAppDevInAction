package com.baobaotao.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zhujie on 16/7/27.
 */
@Component
public class TwoPlugin implements Plugin {

    @Autowired(required = false)
    private List<Plugin> plugins;

    public List<Plugin> getPlugins() {
        return plugins;
    }
}
