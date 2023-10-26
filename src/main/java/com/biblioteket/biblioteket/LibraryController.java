package com.biblioteket.biblioteket;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {
    
    @GetMapping("/")
    String getStart(Model model) {
        model.addAttribute("books", BiblioteketApplication.library.books);
        return "start";
    }

}
