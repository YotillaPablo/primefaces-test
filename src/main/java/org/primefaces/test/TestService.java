package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@ApplicationScoped
public class TestService implements Serializable {
    private static final List<TestObject> list = initList();

    private static List<TestObject> initList() {
        return IntStream.rangeClosed(1,500).mapToObj(i->new TestObject("Item " + i)).collect(Collectors.toList());
    }

    static int count(){
        return list.size();
    }

    static List<TestObject> get(int first, int pageSize){
        return list.subList(first, first + pageSize);
    }
}
