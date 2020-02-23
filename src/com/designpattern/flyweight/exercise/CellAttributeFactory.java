package com.designpattern.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellAttributeFactory {
    private Map<Integer, CellAttribute> attributeMap = new HashMap<Integer, CellAttribute>();

    public CellAttribute getCellAttribute(String fontFamily, int fontSize, boolean isBold) {
        int hash = Objects.hash(fontFamily, fontSize, isBold);
        if(!attributeMap.containsKey(hash)) {
            CellAttribute attribute = new CellAttribute(fontFamily, fontSize, isBold);
            attributeMap.put(hash, attribute);
        }
        return attributeMap.get(hash);
    }
}
