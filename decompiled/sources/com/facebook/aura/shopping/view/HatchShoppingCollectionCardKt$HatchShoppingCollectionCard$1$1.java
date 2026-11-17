package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultsPresentation;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationEventId;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ int $productCount;
    public final /* synthetic */ ShoppingMerchantRanking $ranking;
    public final /* synthetic */ ShoppingResultsPresentation $results;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShoppingCollectionCardKt$HatchShoppingCollectionCard$1$1(String str, String str2, int i, ShoppingMerchantRanking shoppingMerchantRanking, AbstractC3358CGz abstractC3358CGz, ShoppingResultsPresentation shoppingResultsPresentation, AuraNavigator auraNavigator, String str3, String str4) {
        super(0);
        this.$messageId = str;
        this.$presentationId = str2;
        this.$productCount = i;
        this.$ranking = shoppingMerchantRanking;
        this.$userSession = abstractC3358CGz;
        this.$results = shoppingResultsPresentation;
        this.$navigator = auraNavigator;
        this.$sessionId = str3;
        this.$presentationEventId = str4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchShoppingCollectionCardKt.logCollectionOpen(this.$messageId, this.$presentationId, this.$productCount, this.$ranking);
        HatchShoppingSeedStore.Companion.getInstance(this.$userSession).rememberResults(this.$messageId, this.$presentationId, this.$results);
        this.$navigator.navigate((AuraNavKey) new ProductItemsScreenKey(this.$messageId, this.$sessionId, this.$presentationId, this.$presentationEventId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
