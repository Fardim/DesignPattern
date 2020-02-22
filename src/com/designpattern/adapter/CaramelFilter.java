package com.designpattern.adapter;

import com.designpattern.adapter.avaFilters.Caramel;

public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        this.caramel.init();
        this.caramel.render(image);
    }
}
