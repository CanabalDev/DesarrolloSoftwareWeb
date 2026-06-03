package com.example.demo.servicio;

import com.example.demo.domain.model.Equipo;
import com.example.demo.dao.ImpEquipoCrud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lm-carlos
 */
@Service
public class EquipoServicioImp implements IntEquipoServicio {

    @Autowired
    ImpEquipoCrud crudEquipo;

    @Transactional(readOnly = true)
    @Override
    public List<Equipo> listarTodos() {
        return (List<Equipo>) crudEquipo.findAll();
    }

    @Transactional
    @Override
    public void guardar(Equipo equipo) {
        crudEquipo.save(equipo);
    }

    @Transactional
    @Override
    public void eliminar(Equipo equipo) {
        crudEquipo.delete(equipo);
    }

    @Transactional
    @Override
    public Equipo buscar(Equipo equipo) {
        return crudEquipo.findById(equipo.getId()).orElse(null);
    }

}
