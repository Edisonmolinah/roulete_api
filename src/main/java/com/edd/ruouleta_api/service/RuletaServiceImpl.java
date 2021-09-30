package com.edd.ruouleta_api.service;

import com.edd.ruouleta_api.dtos.RuletaDTO;
import com.edd.ruouleta_api.model.Ruleta;
import com.edd.ruouleta_api.repository.IRuletaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RuletaServiceImpl implements IRuletaService{

    final IRuletaRepository ruletaRepository;

    public RuletaServiceImpl(IRuletaRepository ruletaRepository) {
        this.ruletaRepository = ruletaRepository;
    }

    @Override
    public void createRuleta() {
        ruletaRepository.save(new Ruleta());
    }

    @Override
    public List<Ruleta> getRuleta() {
        List<Ruleta> ruletas= ruletaRepository.findAll();
        return ruletas;
    }
}
