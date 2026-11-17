package com.facebook.aura.agentpermission;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public interface LodgingPriceLabel {

    public final class BaseRate implements LodgingPriceLabel {
        public static final int $stable = 0;
        public static final BaseRate INSTANCE = new BaseRate();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof BaseRate);
        }

        public String toString() {
            return "BaseRate";
        }

        public int hashCode() {
            return -485679582;
        }
    }

    public final class DueAtProperty implements LodgingPriceLabel {
        public static final int $stable = 0;
        public static final DueAtProperty INSTANCE = new DueAtProperty();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DueAtProperty);
        }

        public String toString() {
            return "DueAtProperty";
        }

        public int hashCode() {
            return -649306101;
        }
    }

    public final class Nights extends C06G implements LodgingPriceLabel {
        public static final int $stable = 0;
        public final int count;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Nights) && this.count == ((Nights) obj).count);
        }

        public static /* synthetic */ Nights copy$default(Nights nights, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nights.count;
            }
            return new Nights(i);
        }

        public final int component1() {
            return this.count;
        }

        public final Nights copy(int i) {
            return new Nights(i);
        }

        public final int getCount() {
            return this.count;
        }

        public int hashCode() {
            return this.count;
        }

        public Nights(int i) {
            this.count = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class PayNow implements LodgingPriceLabel {
        public static final int $stable = 0;
        public static final PayNow INSTANCE = new PayNow();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PayNow);
        }

        public String toString() {
            return "PayNow";
        }

        public int hashCode() {
            return 1839564831;
        }
    }

    public final class PropertyFees implements LodgingPriceLabel {
        public static final int $stable = 0;
        public static final PropertyFees INSTANCE = new PropertyFees();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PropertyFees);
        }

        public String toString() {
            return "PropertyFees";
        }

        public int hashCode() {
            return 1411029875;
        }
    }

    public final class Provided extends C06G implements LodgingPriceLabel {
        public static final int $stable = 0;
        public final String text;

        public Provided(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final Provided copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Provided(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Provided) && C7384Etj.areEqual(this.text, ((Provided) obj).text));
        }

        public static /* synthetic */ Provided copy$default(Provided provided, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = provided.text;
            }
            C7384Etj.A0Y(str, 0);
            return new Provided(str);
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

    public final class TaxesAndFees implements LodgingPriceLabel {
        public static final int $stable = 0;
        public static final TaxesAndFees INSTANCE = new TaxesAndFees();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof TaxesAndFees);
        }

        public String toString() {
            return "TaxesAndFees";
        }

        public int hashCode() {
            return 1244635804;
        }
    }

    public final class Total extends C06G implements LodgingPriceLabel {
        public static final int $stable = 0;
        public final String currency;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Total) && C7384Etj.areEqual(this.currency, ((Total) obj).currency));
        }

        public static /* synthetic */ Total copy$default(Total total, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = total.currency;
            }
            return new Total(str);
        }

        public final String component1() {
            return this.currency;
        }

        public final Total copy(String str) {
            return new Total(str);
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.currency);
        }

        public Total(String str) {
            this.currency = str;
        }

        public String toString() {
            return super.toString();
        }
    }
}
