package jpabook;

import jpabook.jpashop.JpashopApplication;
import jpabook.jpashop.domain.wink.BankRepository;
import jpabook.jpashop.domain.wink.domain.Deposit;
import jpabook.jpashop.domain.wink.domain.Investment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest(classes = JpashopApplication.class)
public class AccountTest {

    @Autowired private BankRepository bankRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void depositSave(){
        Deposit deposit = new Deposit();
        deposit.setProduct("예금 상품");
        deposit.setOwner("이지율");
        bankRepository.save(deposit);

        Investment investment = new Investment();
        investment.setEmployee("가나다");
        investment.setCustomer("라마바");
        bankRepository.save(investment);
    }
}
