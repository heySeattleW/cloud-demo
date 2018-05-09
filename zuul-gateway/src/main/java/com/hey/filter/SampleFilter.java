package com.hey.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by heer on 2018/5/8.
 */
public class SampleFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(SampleFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        logger.info("this is just a pre!");
        return null;
    }

    private void doSomething() {
        throw new RuntimeException();
    }
}
