package com.wangzhen.spbsecurityjpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName FKRole
 * @Description
 * @Author momo
 * @Date 2019/2/7 下午8:02
 **/
@Entity
@Table(name="tb_role")
public class FKRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="authority")
    private String authority;

    public FKRole() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    @Override
    public String toString() {
        return "FKRole [id=" + id + ", authority=" + authority + "]";
    }

}
