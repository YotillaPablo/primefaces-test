package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;
import org.primefaces.model.*;

@Data
@Named
@ViewScoped
public class TestView extends LazyDataModel<TestObject> implements Serializable {

    @Override
    public int count(Map<String, FilterMeta> filterBy) {
        return TestService.count();
    }

    @Override
    public List<TestObject> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
        return TestService.get(first, pageSize);
    }
}
