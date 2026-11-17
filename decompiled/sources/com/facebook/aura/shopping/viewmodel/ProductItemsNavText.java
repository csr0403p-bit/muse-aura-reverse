package com.facebook.aura.shopping.viewmodel;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface ProductItemsNavText {

    public final class ProductCount extends C06G implements ProductItemsNavText {
        public static final int $stable = 0;
        public final int count;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ProductCount) && this.count == ((ProductCount) obj).count);
        }

        public static /* synthetic */ ProductCount copy$default(ProductCount productCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = productCount.count;
            }
            return new ProductCount(i);
        }

        public final int component1() {
            return this.count;
        }

        public final ProductCount copy(int i) {
            return new ProductCount(i);
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return this.count;
        }

        public ProductCount(int i) {
            this.count = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ResultsTitle implements ProductItemsNavText {
        public static final int $stable = 0;
        public static final ResultsTitle INSTANCE = new ResultsTitle();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ResultsTitle);
        }

        public String toString() {
            return "ResultsTitle";
        }

        public int hashCode() {
            return -183196815;
        }
    }

    public final class Text extends C06G implements ProductItemsNavText {
        public static final int $stable = 0;
        public final String value;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Text copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Text) && C7384Etj.areEqual(this.value, ((Text) obj).value));
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
