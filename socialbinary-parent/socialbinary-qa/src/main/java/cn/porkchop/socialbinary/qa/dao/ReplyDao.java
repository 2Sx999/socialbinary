package cn.porkchop.socialbinary.qa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.porkchop.socialbinary.qa.pojo.Reply;

/**
 * 数据访问接口
 *
 * @author Administrator
 */
public interface ReplyDao extends JpaRepository<Reply, String>, JpaSpecificationExecutor<Reply> {

}
