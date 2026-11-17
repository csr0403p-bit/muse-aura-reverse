package com.facebook.aura.model;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultProduct$$serializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchTextEntitySegment extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchNamedTextEntity namedEntity;
    public final ShoppingResultProduct product;
    public final String text;

    public final class Companion {
        public final C9hr<HatchTextEntitySegment> serializer() {
            return HatchTextEntitySegment$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(HatchTextEntitySegment hatchTextEntitySegment, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchTextEntitySegment.text != null) {
            c9j5.AAP(hatchTextEntitySegment.text, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchTextEntitySegment.product != null) {
            c9j5.AAP(hatchTextEntitySegment.product, ShoppingResultProduct$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || hatchTextEntitySegment.namedEntity != null) {
            c9j5.AAP(hatchTextEntitySegment.namedEntity, HatchNamedTextEntity$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchTextEntitySegment) {
                HatchTextEntitySegment hatchTextEntitySegment = (HatchTextEntitySegment) obj;
                if (!C7384Etj.areEqual(this.text, hatchTextEntitySegment.text) || !C7384Etj.areEqual(this.product, hatchTextEntitySegment.product) || !C7384Etj.areEqual(this.namedEntity, hatchTextEntitySegment.namedEntity)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchTextEntitySegment copy$default(HatchTextEntitySegment hatchTextEntitySegment, String str, ShoppingResultProduct shoppingResultProduct, HatchNamedTextEntity hatchNamedTextEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchTextEntitySegment.text;
        }
        if ((i & 2) != 0) {
            shoppingResultProduct = hatchTextEntitySegment.product;
        }
        if ((i & 4) != 0) {
            hatchNamedTextEntity = hatchTextEntitySegment.namedEntity;
        }
        return new HatchTextEntitySegment(str, shoppingResultProduct, hatchNamedTextEntity);
    }

    public final String component1() {
        return this.text;
    }

    public final ShoppingResultProduct component2() {
        return this.product;
    }

    public final HatchNamedTextEntity component3() {
        return this.namedEntity;
    }

    public final HatchTextEntitySegment copy(String str, ShoppingResultProduct shoppingResultProduct, HatchNamedTextEntity hatchNamedTextEntity) {
        return new HatchTextEntitySegment(str, shoppingResultProduct, hatchNamedTextEntity);
    }

    public final HatchNamedTextEntity getNamedEntity() {
        return this.namedEntity;
    }

    public final ShoppingResultProduct getProduct() {
        return this.product;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.text) * 31) + AnonymousClass006.A0D(this.product)) * 31) + C3cH.A02(this.namedEntity);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final boolean isSupported() {
        ?? A1X = AnonymousClass002.A1X(this.text);
        int i = A1X;
        if (this.product != null) {
            i = A1X + 1;
        }
        int i2 = i;
        if (this.namedEntity != null) {
            i2 = i + 1;
        }
        return i2 == 1;
    }

    public HatchTextEntitySegment(String str, ShoppingResultProduct shoppingResultProduct, HatchNamedTextEntity hatchNamedTextEntity) {
        this.text = str;
        this.product = shoppingResultProduct;
        this.namedEntity = hatchNamedTextEntity;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchTextEntitySegment(int i, String str, ShoppingResultProduct shoppingResultProduct, HatchNamedTextEntity hatchNamedTextEntity, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.product = null;
        } else {
            this.product = shoppingResultProduct;
        }
        if ((i & 4) == 0) {
            this.namedEntity = null;
        } else {
            this.namedEntity = hatchNamedTextEntity;
        }
    }

    public /* synthetic */ HatchTextEntitySegment(String str, ShoppingResultProduct shoppingResultProduct, HatchNamedTextEntity hatchNamedTextEntity, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : shoppingResultProduct, (i & 4) != 0 ? null : hatchNamedTextEntity);
    }

    public HatchTextEntitySegment() {
        this(null, null, null);
    }
}
