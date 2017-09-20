package org.opendevup.dao;

import org.opendevup.entities.Societe;
import org.springframework.data.jpa.repository.*;

public interface SocieteRepository extends JpaRepository<Societe, Long> {
    
}