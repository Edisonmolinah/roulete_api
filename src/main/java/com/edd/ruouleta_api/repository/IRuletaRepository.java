package com.edd.ruouleta_api.repository;

import com.edd.ruouleta_api.model.Ruleta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRuletaRepository extends JpaRepository<Ruleta,Long>{

}
