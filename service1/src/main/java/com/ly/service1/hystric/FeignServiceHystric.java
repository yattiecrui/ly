package com.ly.service1.hystric;

import com.ly.service1.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceHystric implements FeignService {
    @Override
    public Object getTeacherByFeign() {
        return "GG思密达";
    }
}
