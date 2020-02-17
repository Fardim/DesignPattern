package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<String>();
    private String[] arrUrls = new String[10];
    private int count;


    public void push(String url) {
        urls.add(url);
    }
    public void arrpush(String url) {
        arrUrls[count++] = url;
    }

    public String pop() {
        int lastIndex = urls.size()-1;
        String lastItem = urls.get(lastIndex);
        urls.remove(lastItem);
        return lastItem;
    }
    public String arrpop() {
        return arrUrls[--count];
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }
    public Iterator<String> createArrayIterator() {
        return new ArrayIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            this.index++;
        }

        @Override
        public String current() {
            return this.history.urls.get(this.index);
        }

        @Override
        public Boolean hasNext() {
            return (index < history.urls.size());
        }
    }

    public class ArrayIterator implements Iterator<String> {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public void next() {
            this.index++;
        }

        @Override
        public String current() {
            return history.arrUrls[this.index];
        }

        @Override
        public Boolean hasNext() {
            return (index < history.count);
        }
    }
}
