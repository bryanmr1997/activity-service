package com.learnar.activityService.service;




import com.learnar.activityService.feing.ExperienceFeignClient;
import com.learnar.activityService.models.Activities;
import com.learnar.activityService.models.Experiences;
import com.learnar.activityService.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityServiceImpl implements IActivityService {



    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private ExperienceFeignClient experienceFeignClient;


    @Override
    public List<Activities> listarActivity() {
        return activityRepository.findAll();
    }

    @Override
    public Activities registrarActivities(Activities body) {

        Long idExperience=body.getExperienceId().getId();
        Experiences responseExperience=experienceFeignClient.buscarExperiencia(idExperience);

        if (responseExperience != null) {
            Activities actividadRegistrada=new Activities(body.getName(), body.getDescription(),responseExperience, "E");

            activityRepository.save(actividadRegistrada);
            return actividadRegistrada;
        }


        return null;
    }

    @Override
    public String eliminar(Long idActivity) {
        Optional<Activities> encontrado=activityRepository.findById(idActivity);

        if(encontrado.isPresent()){

            Activities activityDisabled=encontrado.get();
            activityDisabled.setState("D");
            activityRepository.save(activityDisabled);
            return "Actividad deshabilitada";
        }

        return "No se encontro el id";
    }
}
