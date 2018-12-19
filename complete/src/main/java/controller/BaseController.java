package controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import modules.FeedModule;
import modules.IBaseModule;
import modules.ModuleEnum;

@RestController
public class BaseController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/feed")
    public List<IBaseModule> feed() {

        // return feed info.
        List<IBaseModule> list = new ArrayList<>();
        //
        FeedModule fmodule1 = new FeedModule();
        fmodule1.setId("7c80d70a-c4bc");
        fmodule1.setProperties("align:left, flow: flex, direction: row");
        fmodule1.setModuleType(ModuleEnum.ACTION);
        list.add(fmodule1);
        //
        FeedModule fmodule2 = new FeedModule();
        fmodule2.setId("41928b45-06cb");
        fmodule2.setModuleType(ModuleEnum.TEXT);
        list.add(fmodule2);
        //
        return list;
    }

}
