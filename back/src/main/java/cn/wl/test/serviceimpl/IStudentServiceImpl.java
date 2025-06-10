package cn.wl.test.serviceimpl;

import cn.wl.test.mapper.StudentMapper;
import cn.wl.test.entity.Student;
import cn.wl.test.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 郑为中
 * CSDN: Designer 小郑
 */
@Slf4j
@Service
@Transactional
public class IStudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;
}