package com.asodc.karaf.feature;

import org.apache.camel.builder.RouteBuilder;

public class Bundle1 extends RouteBuilder {
    @Override
    public void configure() {
        from("timer:myTimer?").routeId("bundle1")
                .log("{{message}}");
    }
}
