package com.example.mysite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String main() {
        return "index";
    }

   @GetMapping("/projects")
    public String projects() {
        return "projects";
    }
    
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }

    @GetMapping("/project/{id}")
    public String projectDetail(@PathVariable("id") int id, Model model) {

        model.addAttribute("projectId", id);

        if (id==1) {
            model.addAttribute("title", "프로젝트이름");
            model.addAttribute("location", "위치");
            model.addAttribute("use", "시설용도");
            model.addAttribute("area", "면적");
            model.addAttribute("year", "연도");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "사진");
            model.addAttribute("img2", "사진");
        } else if (id==2) {
            model.addAttribute("title", "프로젝트이름");
            model.addAttribute("location", "위치");
            model.addAttribute("use", "시설용도");
            model.addAttribute("area", "면적");
            model.addAttribute("year", "연도");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "사진");
            model.addAttribute("img2", "사진");
        } else if (id==3) {
            model.addAttribute("title", "프로젝트이름");
            model.addAttribute("location", "위치");
            model.addAttribute("use", "시설용도");
            model.addAttribute("area", "면적");
            model.addAttribute("year", "연도");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "사진");
            model.addAttribute("img2", "사진");
        }
        return "project-detail";
    }
}
