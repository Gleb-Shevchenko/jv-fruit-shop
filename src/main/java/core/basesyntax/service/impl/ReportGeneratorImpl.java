package core.basesyntax.service.impl;

import core.basesyntax.db.Storage;
import core.basesyntax.service.ReportGenerator;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private static final String TITLE_OF_REPORT = "fruit,quantity";

    @Override
    public String createReport() {
        StringBuilder builder = new StringBuilder();
        builder.append(TITLE_OF_REPORT);
        for (Map.Entry<String, Integer> fruit : Storage.fruits.entrySet()) {
            builder.append(System.lineSeparator())
                    .append(fruit.getKey())
                    .append(",")
                    .append(fruit.getValue());
        }
        return builder.toString();
    }
}