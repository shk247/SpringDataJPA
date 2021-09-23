package study.datajpa.repository;

import study.datajpa.entitiy.Member;

import java.util.List;

public interface MemberRepositoryCustom {
    List<Member> findMemberCustom();
}
