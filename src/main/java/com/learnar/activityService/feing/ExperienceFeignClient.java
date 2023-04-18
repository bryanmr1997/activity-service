package com.learnar.activityService.feing;

import com.learnar.activityService.models.Experiences;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "experiences-services",path = "/experience")
public interface ExperienceFeignClient {

    @GetMapping("/buscar/{id}")
    public Experiences buscarExperiencia(@PathVariable("id") Long idExperiences);

}
