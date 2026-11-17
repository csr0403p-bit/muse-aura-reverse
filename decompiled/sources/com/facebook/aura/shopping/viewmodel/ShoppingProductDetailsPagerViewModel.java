package com.facebook.aura.shopping.viewmodel;

import X.AEs;
import X.AHD;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsPagerViewModel extends AEs {
    public static final int $stable = 8;
    public final int initialPage;
    public final AHD<ShoppingProductDetailsPagerItem> pages;

    public final class Factory extends AuraViewModelFactory<ShoppingProductDetailsPagerViewModel> {
        public static final int $stable = 8;
        public final ShoppingProductDetailsPageKey entryKey;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ShoppingProductDetailsPagerViewModel create() {
            return new ShoppingProductDetailsPagerViewModel(this.entryKey, HatchShoppingSeedStore.Companion.getInstance(this.userSession));
        }

        public Factory(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(shoppingProductDetailsPageKey, abstractC3358CGz);
            this.entryKey = shoppingProductDetailsPageKey;
            this.userSession = abstractC3358CGz;
        }
    }

    public final boolean getHasSeededProducts() {
        AHD<ShoppingProductDetailsPagerItem> ahd = this.pages;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                if (((ShoppingProductDetailsPagerItem) it.next()).seededProduct != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int getInitialPage() {
        return this.initialPage;
    }

    public final AHD<ShoppingProductDetailsPagerItem> getPages() {
        return this.pages;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShoppingProductDetailsPagerViewModel(com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey r9, com.facebook.aura.shopping.repo.HatchShoppingSeedStore r10) {
        /*
            r8 = this;
            X.AnonymousClass003.A0u(r9, r10)
            r8.<init>()
            java.lang.String r0 = r9.collectionId
            if (r0 == 0) goto L44
            com.facebook.aura.shopping.repo.HatchShoppingSeedStore$SeededCollection r5 = r10.consumeCollection(r0)
        Le:
            r4 = 0
            if (r5 == 0) goto L46
            java.util.List<com.facebook.aura.shopping.model.ShoppingResultProduct> r0 = r5.products
            if (r0 == 0) goto L46
            java.util.ArrayList r7 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r6 = r0.iterator()
            r1 = 0
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5c
            java.lang.Object r3 = r6.next()
            int r2 = r1 + 1
            if (r1 >= 0) goto L34
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L34:
            com.facebook.aura.shopping.model.ShoppingResultProduct r3 = (com.facebook.aura.shopping.model.ShoppingResultProduct) r3
            com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey r1 = com.facebook.aura.shopping.navigation.ShoppingProductDetailsNavigationKt.collectionPage(r9, r3, r1)
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem
            r0.<init>(r1, r3)
            r7.add(r0)
            r1 = r2
            goto L1e
        L44:
            r5 = 0
            goto Le
        L46:
            java.lang.String r0 = r9.getProductId()
            com.facebook.aura.shopping.model.ShoppingResultProduct r1 = r10.consumeProduct(r0)
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem
            r0.<init>(r9, r1)
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem[] r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerItem[]{r0}
            X.AHH r0 = X.AGI.A0E(r0)
            goto L62
        L5c:
            X.AHD r0 = X.AGI.A07(r7)
            if (r0 == 0) goto L46
        L62:
            r8.pages = r0
            if (r5 == 0) goto L70
            int r1 = r5.initialIndex
            X.ADq r0 = X.AbstractC0885AGm.A12(r0)
            int r4 = X.ATD.A06(r0, r1)
        L70:
            r8.initialPage = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsPagerViewModel.<init>(com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey, com.facebook.aura.shopping.repo.HatchShoppingSeedStore):void");
    }
}
