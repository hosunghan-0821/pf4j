package org.pf4j.demo.hosung;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.pf4j.demo.api.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HosungPlugin extends Plugin {
    private static final Logger logger = LoggerFactory.getLogger(HosungPlugin.class);

    public HosungPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        logger.info("HosungPlugin.start()");
    }

    @Override
    public void stop() {
        logger.info("HosungPlugin.stop()");
    }

    @Extension(ordinal=1)
    public static class HelloGreeting implements Greeting {

        @Override
        public String getGreeting() {
            return "HOSUNG";
        }

    }
}
