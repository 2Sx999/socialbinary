package cn.porkchop.socialbinary.recruit.dao;

import cn.porkchop.socialbinary.recruit.pojo.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * 数据访问接口
 *
 * @author Administrator
 */
public interface EnterpriseDao extends JpaRepository<Enterprise, String>, JpaSpecificationExecutor<Enterprise> {
    /**
     * 根据热门状态获取企业列表
     *
     * @param ishot
     * @return
     */
    public List<Enterprise> findByIshot(String ishot);

}
