package com.facebook.aura.shopping.viewmodel;

import X.AGI;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60Q;
import X.HtJ;
import X.HzP;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.model.ShoppingCollection;
import com.facebook.aura.shopping.model.ShoppingCollectionList;
import com.facebook.aura.shopping.model.ShoppingProductDisplayKt;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ProductItemsLoader {
    public static final int $stable = 8;
    public final ProductItemsScreenKey key;
    public final HatchOfflineConversationRepository offlineRepository;
    public final HatchShoppingSeedStore seedStore;
    public final String sessionId;

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ProductItemsLoader", f = "ProductItemsLoader.kt", l = {27}, m = "loadPersisted", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ProductItemsLoader$loadPersisted$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProductItemsLoader.this.loadPersisted(this);
        }
    }

    private final ProductItemsUiState.Loaded toLoadedState(ShoppingResultsPresentation shoppingResultsPresentation) {
        ShoppingCollection shoppingCollection = shoppingResultsPresentation.shoppingCollection;
        ShoppingResultsAttribution shoppingResultsAttribution = shoppingResultsPresentation.attribution;
        if (shoppingCollection == null) {
            String str = shoppingResultsAttribution != null ? shoppingResultsAttribution.title : null;
            String str2 = shoppingResultsPresentation.subtitle;
            if (str2 == null) {
                str2 = shoppingResultsAttribution != null ? shoppingResultsAttribution.subtitle : null;
            }
            return ProductItemsLoaderKt.productItemsLoaded(str, shoppingResultsAttribution, str2, AGI.A0E(toSection(shoppingResultsPresentation, null, null, shoppingResultsPresentation.products, shoppingResultsAttribution != null ? shoppingResultsAttribution.copy(shoppingResultsAttribution.title, shoppingResultsAttribution.iconUrl, shoppingResultsAttribution.provider, null, shoppingResultsAttribution.website) : null)));
        }
        ShoppingResultsAttribution shoppingResultsAttributionCopy = shoppingResultsAttribution != null ? shoppingResultsAttribution.copy(shoppingResultsAttribution.title, shoppingResultsAttribution.iconUrl, shoppingResultsAttribution.provider, null, shoppingResultsAttribution.website) : null;
        String str3 = shoppingCollection.title;
        List<ShoppingCollectionList> list = shoppingCollection.lists;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (ShoppingCollectionList shoppingCollectionList : list) {
            arrayListA0i.add(toSection(shoppingResultsPresentation, shoppingCollectionList.label, shoppingCollectionList.subtitle, shoppingResultsPresentation.productsOf(shoppingCollectionList), shoppingResultsAttributionCopy));
        }
        return ProductItemsLoaderKt.productItemsLoaded(str3, shoppingResultsAttributionCopy, null, AGI.A07(arrayListA0i));
    }

    private final ProductItemsSection toSection(ShoppingResultsPresentation shoppingResultsPresentation, String str, String str2, List<ShoppingResultProduct> list, ShoppingResultsAttribution shoppingResultsAttribution) {
        ProductItemsScreenKey productItemsScreenKey = this.key;
        String str3 = productItemsScreenKey.presentationId;
        String str4 = productItemsScreenKey.presentationEventId;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<ShoppingResultProduct> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(ShoppingProductDisplayKt.toUiModel(it.next(), null, shoppingResultsAttribution, C60Q.A0w()));
        }
        return new ProductItemsSection(str, str2, str3, str4, AGI.A07(arrayListA0i), shoppingResultsPresentation.widgetId, shoppingResultsPresentation.kind);
    }

    public final ProductItemsUiState.Loaded consumeSeed() {
        HatchShoppingSeedStore hatchShoppingSeedStore = this.seedStore;
        ProductItemsScreenKey productItemsScreenKey = this.key;
        ShoppingResultsPresentation shoppingResultsPresentationConsumeResults = hatchShoppingSeedStore.consumeResults(productItemsScreenKey.messageId, productItemsScreenKey.presentationId);
        if (shoppingResultsPresentationConsumeResults != null) {
            return toLoadedState(shoppingResultsPresentationConsumeResults);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPersisted(X.HtJ<? super com.facebook.aura.shopping.viewmodel.ProductItemsUiState.Loaded> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.shopping.viewmodel.ProductItemsLoader.AnonymousClass1
            if (r0 == 0) goto L3f
            r6 = r8
            com.facebook.aura.shopping.viewmodel.ProductItemsLoader$loadPersisted$1 r6 = (com.facebook.aura.shopping.viewmodel.ProductItemsLoader.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L47
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.shopping.model.ShoppingResultsPresentation r1 = (com.facebook.aura.shopping.model.ShoppingResultsPresentation) r1
            if (r1 == 0) goto L45
            com.facebook.aura.shopping.viewmodel.ProductItemsUiState$Loaded r5 = r7.toLoadedState(r1)
            return r5
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r3 = r7.offlineRepository
            java.lang.String r2 = r7.sessionId
            com.facebook.aura.navigation.key.ProductItemsScreenKey r0 = r7.key
            java.lang.String r1 = r0.messageId
            java.lang.String r0 = r0.presentationId
            r6.label = r4
            java.lang.Object r1 = com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.findShoppingResults(r3, r2, r1, r0, r6)
            if (r1 != r5) goto L20
            return r5
        L3f:
            com.facebook.aura.shopping.viewmodel.ProductItemsLoader$loadPersisted$1 r6 = new com.facebook.aura.shopping.viewmodel.ProductItemsLoader$loadPersisted$1
            r6.<init>(r8)
            goto L12
        L45:
            r5 = 0
            return r5
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ProductItemsLoader.loadPersisted(X.HtJ):java.lang.Object");
    }

    public ProductItemsLoader(String str, ProductItemsScreenKey productItemsScreenKey, HatchShoppingSeedStore hatchShoppingSeedStore, HatchOfflineConversationRepository hatchOfflineConversationRepository) {
        AnonymousClass005.A14(str, productItemsScreenKey, hatchShoppingSeedStore, hatchOfflineConversationRepository);
        this.sessionId = str;
        this.key = productItemsScreenKey;
        this.seedStore = hatchShoppingSeedStore;
        this.offlineRepository = hatchOfflineConversationRepository;
    }
}
