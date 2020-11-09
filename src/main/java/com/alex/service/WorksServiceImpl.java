package com.alex.service;

import com.alex.dao.WorksMapper;
import com.alex.pojo.Works;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorksServiceImpl implements WorksService {
    @Autowired
    private WorksMapper worksMapper;

    @Override
    public int addWorks(Works works) {
        return worksMapper.addWorks(works);
    }


    @Override
    public List<Works> getAllworkers() {
        return worksMapper.getAllworkers();
    }


    @Override
    public Works getDetail(int works_id) {
        return worksMapper.getDetail(works_id);
    }

    @Override
    public List<String> getUserImage(int id) {
        List<String> list=worksMapper.getUserImage(id);
        return list;
    }
}
