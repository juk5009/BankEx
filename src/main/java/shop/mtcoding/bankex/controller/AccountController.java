package shop.mtcoding.bankex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping({ "/", "main" })
    public String main() {

        return "account/main";

    }

    @GetMapping("/depositForm")
    public String depositForm() {

        return "account/depositForm";
    }

    @GetMapping("/detail")
    public String detail() {

        return "account/detail";
    }

    @GetMapping("/saveForm")
    public String saveForm() {

        return "account/saveForm";
    }

    @GetMapping("/transferForm")
    public String transferForm() {

        return "account/transferForm";
    }

    @GetMapping("/withdrawForm")
    public String withdrawForm() {

        return "account/withdrawForm";
    }

}