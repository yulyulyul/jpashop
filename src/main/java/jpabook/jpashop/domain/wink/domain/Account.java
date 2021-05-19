package jpabook.jpashop.domain.wink.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "account_type")
public class Account {

    @Id @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    @Column(name = "account_number")
    private String accountNum;

    @Column(name = "is_consent")
    private Boolean isConsent;

    @Column(name = "seqno")
    private String seqNo;

    @Column(name = "is_foreign_deposit")
    private Boolean isForeignDeposit;

    @Column(name = "is_minus")
    private Boolean isMinus;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_status")
    private String accountStatus;
}
