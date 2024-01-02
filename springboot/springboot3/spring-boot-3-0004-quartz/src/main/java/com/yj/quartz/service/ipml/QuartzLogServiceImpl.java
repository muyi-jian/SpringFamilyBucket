package com.yj.quartz.service.ipml;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yj.quartz.entity.QuartzLog;
import com.yj.quartz.mapper.QuartzLogMapper;
import com.yj.quartz.service.QuartzLogService;
import org.springframework.stereotype.Service;

/**
 * @author YangJian
 * @date 2024/1/2 9:11
 * @description
 */
@Service
public class QuartzLogServiceImpl extends ServiceImpl<QuartzLogMapper, QuartzLog> implements QuartzLogService {

    @Override
    public Integer insert(QuartzLog quartzLog) {
        return baseMapper.insert(quartzLog);
    }
}
