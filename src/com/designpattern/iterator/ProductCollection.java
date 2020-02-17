package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<Product>();

    public void push(Product product) {
        products.add(product);
    }
    public Product pop() {
        int lastIndex = products.size()-1;
        Product lastItem = products.get(lastIndex);
        products.remove(lastItem);
        return lastItem;
    }

    public Iterator<Product> createProductIterator() {
        return new ProductIterator(this);
    }

    public class ProductIterator implements Iterator<Product> {
        private ProductCollection productCollection;
        public int index;

        public ProductIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }


        @Override
        public void next() {
            this.index++;
        }

        @Override
        public Product current() {
            return this.productCollection.products.get(this.index);
        }

        @Override
        public Boolean hasNext() {
            return (index < this.productCollection.products.size() );
        }
    }
}
