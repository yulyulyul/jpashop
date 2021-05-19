package jpabook.jpashop.domain.wink.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter @Setter
@DiscriminatorValue("deposit")
public class Deposit extends Account {

    private String product;
    private String owner;
}
