package com.designpattern.Strategy;

import com.designpattern.Strategy.Compressor.Compressor;
import com.designpattern.Strategy.Filter.Filter;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
