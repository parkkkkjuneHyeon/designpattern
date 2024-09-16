package com.junhyun.designpattern.createinstancepattern.builder.pattern;

public class Calzone extends Pizza{
    private final boolean sauceInside;

    public Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public static class Builder extends Pizza.Builder {
        private Boolean sauceInside = false;

        public Builder sauceInside() {
            this.sauceInside = true;
            return self();
        }

        @Override
        public Pizza build() {
            return new Calzone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    public String toString() {
        return toppings.toString() + " sauceInside: " + sauceInside;
    }
}
