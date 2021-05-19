package jpabook.jpashop.domain.wink.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@DiscriminatorValue("investment")
public class Investment extends Account {

    private String employee;
    private String customer;
}
