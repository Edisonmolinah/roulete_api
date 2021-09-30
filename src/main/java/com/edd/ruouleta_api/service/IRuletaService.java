package com.edd.ruouleta_api.service;

import com.edd.ruouleta_api.dtos.RuletaDTO;
import com.edd.ruouleta_api.model.Ruleta;

import java.util.List;

public interface IRuletaService {
    void createRuleta();

    List<Ruleta> getRuleta();
}
