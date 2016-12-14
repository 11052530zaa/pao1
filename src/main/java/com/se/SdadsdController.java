package com.se;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/sdadsds")
@Controller
@RooWebScaffold(path = "sdadsds", formBackingObject = Sdadsd.class)
public class SdadsdController {
}
