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
            model.addAttribute("title", "K 기숙사");
            model.addAttribute("location", "충남 금산");
            model.addAttribute("use", "교육연구시설");
            model.addAttribute("area", "2,824 ㎡");
            model.addAttribute("year", "2019");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "/images/project1.jpg");
        } else if (id==2) {
            model.addAttribute("title", "단남초 체육관");
            model.addAttribute("location", "경기 성남시");
            model.addAttribute("use", "교육연구시설");
            model.addAttribute("area", "894 ㎡");
            model.addAttribute("year", "2021");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "/images/project2.png");
        } else if (id==3) {
            model.addAttribute("title", "문화복합시설 공모 참가작");
            model.addAttribute("location", "충남 영동군");
            model.addAttribute("use", "문화시설");
            model.addAttribute("area", "747 ㎡");
            model.addAttribute("year", "2023");
            model.addAttribute("desc", "설명");
            model.addAttribute("img1", "/images/투시도-3.jpg");
            model.addAttribute("img2", "/images/가로수길.jpg");
            model.addAttribute("img3", "/images/project3-1.jpg");
            model.addAttribute("img4", "/images/project3-2.jpg");
        }
        return "project-detail";
    }
}
