package com.facebook.aura.shopping.model;

import X.A6B;
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
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCollectionJson extends C06G {
    public static final int $stable = 8;
    public final String layout;
    public final List<ShoppingCollectionListJson> lists;
    public final String title;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ShoppingCollectionJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ShoppingCollectionJson> serializer() {
            return ShoppingCollectionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCollectionJson) {
                ShoppingCollectionJson shoppingCollectionJson = (ShoppingCollectionJson) obj;
                if (!C7384Etj.areEqual(this.title, shoppingCollectionJson.title) || !C7384Etj.areEqual(this.layout, shoppingCollectionJson.layout) || !C7384Etj.areEqual(this.lists, shoppingCollectionJson.lists)) {
                }
            }
            return false;
        }
        return true;
    }

    public final ShoppingCollection toDomain(List<ShoppingResultProduct> list) {
        C7384Etj.A0Y(list, 0);
        String singleLineOrNull = ShoppingResultsPresentationJsonKt.toSingleLineOrNull(this.title);
        if (singleLineOrNull == null) {
            return null;
        }
        HashSet hashSetA13 = C60O.A13();
        Iterator<ShoppingResultProduct> it = list.iterator();
        while (it.hasNext()) {
            Integer num = it.next().wireIndex;
            if (num != null) {
                hashSetA13.add(num);
            }
        }
        List listA02 = A6B.A02(A6B.A07(A6B.A04(new ShoppingCollectionJson$toDomain$cleanLists$1(hashSetA13), AbstractC0878AGe.A06(this.lists)), 10));
        if (listA02.size() < 2) {
            return null;
        }
        int i = ShoppingCollection.$stable;
        return new ShoppingCollection(singleLineOrNull, ShoppingResultsPresentationJsonKt.toShoppingCollectionLayout(this.layout), listA02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCollectionJson copy$default(ShoppingCollectionJson shoppingCollectionJson, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCollectionJson.title;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCollectionJson.layout;
        }
        if ((i & 4) != 0) {
            list = shoppingCollectionJson.lists;
        }
        return shoppingCollectionJson.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCollectionJson shoppingCollectionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingCollectionJson.title)) {
            c9j5.AAV(shoppingCollectionJson.title, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingCollectionJson.layout)) {
            c9j5.AAV(shoppingCollectionJson.layout, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(shoppingCollectionJson.lists)) {
            c9j5.AAQ(shoppingCollectionJson.lists, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.layout;
    }

    public final List<ShoppingCollectionListJson> component3() {
        return this.lists;
    }

    public final String getLayout() {
        return this.layout;
    }

    public final List<ShoppingCollectionListJson> getLists() {
        return this.lists;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.lists, AnonymousClass005.A0I(this.layout, AnonymousClass001.A0G(this.title)));
    }

    public ShoppingCollectionJson(String str, String str2, List<ShoppingCollectionListJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        this.title = str;
        this.layout = str2;
        this.lists = list;
    }

    public final ShoppingCollectionJson copy(String str, String str2, List<ShoppingCollectionListJson> list) {
        AnonymousClass005.A0x(str, str2, list);
        return new ShoppingCollectionJson(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCollectionJson(int i, String str, String str2, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.layout = "";
        } else {
            this.layout = str2;
        }
        if ((i & 4) == 0) {
            this.lists = C0881AGi.A00;
        } else {
            this.lists = list;
        }
    }

    public /* synthetic */ ShoppingCollectionJson(String str, String str2, List list, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, C3cI.A12(list, i));
    }

    public ShoppingCollectionJson() {
        this("", "", C0881AGi.A00);
    }
}
