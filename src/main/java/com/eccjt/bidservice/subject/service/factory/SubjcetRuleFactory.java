package com.eccjt.bidservice.subject.service.factory;

public class SubjcetRuleFactory {

    SubjectRule createSubjectRule(String subjectType){
        switch (subjectType){
            case "A":
                return new AddSubject();
            case "M":
                return new MinusSubject();
            case "O":
                return new OnceSubject();
            case "D":
                return new DutchSubject();
        }

        return null;
    }


}
