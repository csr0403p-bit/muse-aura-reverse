package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
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
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ShoppingCollection extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ShoppingCollectionLayout layout;
    public final List<ShoppingCollectionList> lists;
    public final int productCount;
    public final String title;

    public final class Companion {
        public final C9hr<ShoppingCollection> serializer() {
            return ShoppingCollection$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, null, AbstractC5321DgF.A02(num, ShoppingCollection$Companion$$childSerializers$1.INSTANCE), ShoppingCollection$Companion$$childSerializers$2.INSTANCE);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCollection) {
                ShoppingCollection shoppingCollection = (ShoppingCollection) obj;
                if (!C7384Etj.areEqual(this.title, shoppingCollection.title) || this.layout != shoppingCollection.layout || !C7384Etj.areEqual(this.lists, shoppingCollection.lists)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingCollection copy$default(ShoppingCollection shoppingCollection, String str, ShoppingCollectionLayout shoppingCollectionLayout, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shoppingCollection.title;
        }
        if ((i & 2) != 0) {
            shoppingCollectionLayout = shoppingCollection.layout;
        }
        if ((i & 4) != 0) {
            list = shoppingCollection.lists;
        }
        return shoppingCollection.copy(str, shoppingCollectionLayout, list);
    }

    public static /* synthetic */ void getProductCount$annotations() {
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(ShoppingCollection shoppingCollection, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(shoppingCollection.title, c9iZ, 0);
        c9j5.AAQ(shoppingCollection.layout, C3cH.A15(f0cArr, 1), c9iZ, 1);
        c9j5.AAQ(shoppingCollection.lists, C3cH.A15(f0cArr, 2), c9iZ, 2);
    }

    public final String component1() {
        return this.title;
    }

    public final ShoppingCollectionLayout component2() {
        return this.layout;
    }

    public final List<ShoppingCollectionList> component3() {
        return this.lists;
    }

    public final ShoppingCollectionLayout getLayout() {
        return this.layout;
    }

    public final List<ShoppingCollectionList> getLists() {
        return this.lists;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.lists, AnonymousClass005.A0F(this.layout, AnonymousClass001.A0G(this.title)));
    }

    public ShoppingCollection(String str, ShoppingCollectionLayout shoppingCollectionLayout, List<ShoppingCollectionList> list) {
        AnonymousClass005.A0x(str, shoppingCollectionLayout, list);
        this.title = str;
        this.layout = shoppingCollectionLayout;
        this.lists = list;
        Iterator<ShoppingCollectionList> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().productWireIndices.size();
        }
        this.productCount = size;
    }

    public final ShoppingCollection copy(String str, ShoppingCollectionLayout shoppingCollectionLayout, List<ShoppingCollectionList> list) {
        AnonymousClass005.A0x(str, shoppingCollectionLayout, list);
        return new ShoppingCollection(str, shoppingCollectionLayout, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ShoppingCollection(int i, String str, ShoppingCollectionLayout shoppingCollectionLayout, List list, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(ShoppingCollection$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.title = str;
        this.layout = shoppingCollectionLayout;
        this.lists = list;
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((ShoppingCollectionList) it.next()).productWireIndices.size();
        }
        this.productCount = size;
    }
}
