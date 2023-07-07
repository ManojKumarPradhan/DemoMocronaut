package com.bigob;

import io.micronaut.http.annotation.*;

@Controller("/demoMocronaut")
public class DemoMocronautController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}