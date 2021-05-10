package com.curso.mayo.prototypess.services;

import com.curso.mayo.prototypess.config.ExampleClass;
import com.curso.mayo.prototypess.config.MyExplicitBean;
import com.curso.mayo.prototypess.entities.PrototypesEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrototypesServiceImpl implements IPrototypes{

    @Autowired
    private MyExplicitBean bean;

    @Override
    public List<PrototypesEntity> getPrototypes() {
        List<PrototypesEntity> arrProto = new ArrayList<>(4);
        arrProto.add(new PrototypesEntity("@Component", "Use when don't have a specific category about prototypes"));
        arrProto.add(new PrototypesEntity("@Service", "Use when you need apply Business logic"));
        arrProto.add(new PrototypesEntity("@Controller", "Use when you need expose data to another components"));
        arrProto.add(new PrototypesEntity("@Repository", "Use when you need access to data"));

        return arrProto;
    }

    @Override
    public ExampleClass getExplicitBean() {
        return bean.getMyBean();
    }


}
