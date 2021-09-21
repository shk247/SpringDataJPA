package stusy.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stusy.datajpa.entitiy.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
