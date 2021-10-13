package com.inonity.justpay.account.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface SpringDataAccountRepository extends JpaRepository<AccountJpaEntity, Long> {
}
