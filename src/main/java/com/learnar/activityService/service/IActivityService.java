package com.learnar.activityService.service;



import com.learnar.activityService.models.Activities;


import java.util.List;

public interface IActivityService {




    List<Activities> listarActivity();

    Activities registrarActivities(Activities body);

//    Experiences actualizar(Experiences body, Long id);

    String eliminar(Long idActivity);
}
