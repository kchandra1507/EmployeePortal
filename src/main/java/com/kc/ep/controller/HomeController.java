/*
 * Copyright (c) Kratagya Chandra.
 */
package com.kc.ep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String homepage() {
    return "index";
  }

}
