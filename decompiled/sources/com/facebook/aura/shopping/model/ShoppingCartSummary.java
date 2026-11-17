package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface ShoppingCartSummary {

    public final class Empty implements ShoppingCartSummary {
        public static final int $stable = 0;
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return -1238430718;
        }
    }

    public final class ItemCount extends C06G implements ShoppingCartSummary {
        public static final int $stable = 0;
        public final int itemCount;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ItemCount) && this.itemCount == ((ItemCount) obj).itemCount);
        }

        public static /* synthetic */ ItemCount copy$default(ItemCount itemCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = itemCount.itemCount;
            }
            return new ItemCount(i);
        }

        public final int component1() {
            return this.itemCount;
        }

        public final ItemCount copy(int i) {
            return new ItemCount(i);
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public int hashCode() {
            return this.itemCount;
        }

        public ItemCount(int i) {
            this.itemCount = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Subtotal extends C06G implements ShoppingCartSummary {
        public static final int $stable = 0;
        public final int itemCount;
        public final String subtotal;

        public Subtotal(int i, String str) {
            C7384Etj.A0Y(str, 1);
            this.itemCount = i;
            this.subtotal = str;
        }

        public final Subtotal copy(int i, String str) {
            C7384Etj.A0Y(str, 1);
            return new Subtotal(i, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Subtotal) {
                    Subtotal subtotal = (Subtotal) obj;
                    if (this.itemCount != subtotal.itemCount || !C7384Etj.areEqual(this.subtotal, subtotal.subtotal)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Subtotal copy$default(Subtotal subtotal, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = subtotal.itemCount;
            }
            if ((i2 & 2) != 0) {
                str = subtotal.subtotal;
            }
            C7384Etj.A0Y(str, 1);
            return new Subtotal(i, str);
        }

        public final int component1() {
            return this.itemCount;
        }

        public final String component2() {
            return this.subtotal;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final String getSubtotal() {
            return this.subtotal;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.subtotal, this.itemCount * 31);
        }

        public String toString() {
            return super.toString();
        }
    }
}
