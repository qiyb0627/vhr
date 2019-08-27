package xin.qicloud.vhr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import xin.qicloud.vhr.bean.Hr;
import xin.qicloud.vhr.mapper.HrMapper;

/**
 * @author qiyb
 * @version 1.0
 * @date 2019/8/27 20:20
 */
public class HrService  implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr = hrMapper.loadUserByUsername(s);
        if (hr == null){
            throw  new UsernameNotFoundException("用户不存在");
        }
        return hr;
    }
}
