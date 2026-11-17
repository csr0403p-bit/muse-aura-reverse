package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCollectionList extends C06G {
    public static final int $stable = 0;
    public final String label;
    public final List<Integer> productWireIndices;
    public final String subtitle;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1V(C79.A01, null, null, ShoppingCollectionList$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ShoppingCollectionList> serializer() {
            return ShoppingCollectionList$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCollectionList) {
                ShoppingCollectionList shoppingCollectionList = (ShoppingCollectionList) obj;
                if (!C7384Etj.areEqual(this.label, shoppingCollectionList.label) || !C7384Etj.areEqual(this.subtitle, shoppingCollectionList.subtitle) || !C7384Etj.areEqual(this.productWireIndices, shoppingCollectionList.productWireIndices)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCollectionList copy$default(ShoppingCollectionList shoppingCollectionList, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCollectionList.label;
        }
        if ((i & 2) != 0) {
            str2 = shoppingCollectionList.subtitle;
        }
        if ((i & 4) != 0) {
            list = shoppingCollectionList.productWireIndices;
        }
        return shoppingCollectionList.copy(str, str2, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCollectionList shoppingCollectionList, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(shoppingCollectionList.label, c9iZ, 0);
        if (c9j5.AfR() || shoppingCollectionList.subtitle != null) {
            c9j5.AAP(shoppingCollectionList.subtitle, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAQ(shoppingCollectionList.productWireIndices, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final List<Integer> component3() {
        return this.productWireIndices;
    }

    public final String getLabel() {
        return this.label;
    }

    public final List<Integer> getProductWireIndices() {
        return this.productWireIndices;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.productWireIndices, (AnonymousClass001.A0G(this.label) + AnonymousClass006.A0G(this.subtitle)) * 31);
    }

    public ShoppingCollectionList(String str, String str2, List<Integer> list) {
        AnonymousClass003.A0v(str, list);
        this.label = str;
        this.subtitle = str2;
        this.productWireIndices = list;
    }

    public final ShoppingCollectionList copy(String str, String str2, List<Integer> list) {
        AnonymousClass003.A0v(str, list);
        return new ShoppingCollectionList(str, str2, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCollectionList(int i, String str, String str2, List list, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(ShoppingCollectionList$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.label = str;
        this.subtitle = (i & 2) == 0 ? null : str2;
        this.productWireIndices = list;
    }

    public /* synthetic */ ShoppingCollectionList(String str, String str2, List list, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), list);
    }
}
