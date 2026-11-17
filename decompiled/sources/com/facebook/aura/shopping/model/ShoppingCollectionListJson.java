package com.facebook.aura.shopping.model;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCollectionListJson extends C06G {
    public static final int $stable = 8;
    public final String label;
    public final List<Integer> product_indices;
    public final String subtitle;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ShoppingCollectionListJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ShoppingCollectionListJson> serializer() {
            return ShoppingCollectionListJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCollectionListJson) {
                ShoppingCollectionListJson shoppingCollectionListJson = (ShoppingCollectionListJson) obj;
                if (!C7384Etj.areEqual(this.label, shoppingCollectionListJson.label) || !C7384Etj.areEqual(this.subtitle, shoppingCollectionListJson.subtitle) || !C7384Etj.areEqual(this.product_indices, shoppingCollectionListJson.product_indices)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ShoppingCollectionList toDomain(Set<Integer> set) {
        C7384Etj.A0Y(set, 0);
        String singleLineOrNull = ShoppingResultsPresentationJsonKt.toSingleLineOrNull(this.label);
        if (singleLineOrNull == null) {
            return null;
        }
        List listA0T = AbstractC0878AGe.A0T(this.product_indices);
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0T) {
            C60Q.A1G(Integer.valueOf(AnonymousClass001.A0F(obj)), obj, arrayListA0h, set);
        }
        List listA0a = AbstractC0878AGe.A0a(arrayListA0h, 50);
        if (listA0a.isEmpty()) {
            return null;
        }
        int i = ShoppingCollectionList.$stable;
        return new ShoppingCollectionList(singleLineOrNull, ShoppingResultsPresentationJsonKt.toSingleLineOrNull(this.subtitle), listA0a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCollectionListJson copy$default(ShoppingCollectionListJson shoppingCollectionListJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCollectionListJson.label;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCollectionListJson.subtitle;
        }
        if ((i & 4) != 0) {
            list = shoppingCollectionListJson.product_indices;
        }
        return shoppingCollectionListJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCollectionListJson shoppingCollectionListJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCollectionListJson.label)) {
            c9j5.AAV(shoppingCollectionListJson.label, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCollectionListJson.subtitle)) {
            c9j5.AAV(shoppingCollectionListJson.subtitle, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(shoppingCollectionListJson.product_indices)) {
            c9j5.AAQ(shoppingCollectionListJson.product_indices, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<Integer> component3() {
        return this.product_indices;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Integer> getProduct_indices() {
        return this.product_indices;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.product_indices, AnonymousClass005.A0I(this.subtitle, AnonymousClass001.A0G(this.label)));
    }

    public ShoppingCollectionListJson(String str, String str2, List<Integer> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.label = str;
        this.subtitle = str2;
        this.product_indices = list;
    }

    public final ShoppingCollectionListJson copy(String str, String str2, List<Integer> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new ShoppingCollectionListJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCollectionListJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.product_indices = C0881AGi.A00;
        } else {
            this.product_indices = list;
        }
    }

    public /* synthetic */ ShoppingCollectionListJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i));
    }

    public ShoppingCollectionListJson() {
        this("", "", C0881AGi.A00);
    }
}
