package com.facebook.aura.shopping.viewmodel;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface ShoppingProductDetailsCouponTag {

    public final class Discount extends C06G implements ShoppingProductDetailsCouponTag {
        public static final int $stable = 0;
        public final String text;

        public Discount(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final Discount copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Discount(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Discount) && C7384Etj.areEqual(this.text, ((Discount) obj).text));
        }

        public static /* synthetic */ Discount copy$default(Discount discount, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = discount.text;
            }
            C7384Etj.A0Y(str, 0);
            return new Discount(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
