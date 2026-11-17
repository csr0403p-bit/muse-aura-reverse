package com.facebook.aura.shopping.viewmodel;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingMerchantRanking;
import com.facebook.aura.shopping.model.ShoppingResultProductUiModel;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import com.facebook.aura.shopping.viewmodel.ProductItemsUiState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ProductItemsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ProductItemsUiState> _uiState;
    public final ProductItemsLoader loader;
    public final String messageId;
    public final String presentationId;
    public final ProductItemsUiState.Loaded seeded;
    public final String sessionId;
    public final C1BN<ProductItemsUiState> uiState;

    /* loaded from: classes3.dex */
    public final class Factory extends AuraViewModelFactory<ProductItemsViewModel> {
        public static final int $stable = 8;
        public final ProductItemsScreenKey key;
        public final String sessionId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ProductItemsViewModel create() {
            HatchShoppingSeedStore companion = HatchShoppingSeedStore.Companion.getInstance(this.userSession);
            HatchOfflineConversationRepository companion2 = HatchOfflineConversationRepository.Companion.getInstance(this.userSession);
            String str = this.sessionId;
            ProductItemsScreenKey productItemsScreenKey = this.key;
            return new ProductItemsViewModel(str, productItemsScreenKey.messageId, productItemsScreenKey.presentationId, new ProductItemsLoader(str, productItemsScreenKey, companion, companion2), HatchProductDetailsRepository.Companion.getInstance(this.userSession));
        }

        public Factory(ProductItemsScreenKey productItemsScreenKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(productItemsScreenKey, abstractC3358CGz);
            this.key = productItemsScreenKey;
            this.userSession = abstractC3358CGz;
            String str = productItemsScreenKey.sessionId;
            this.sessionId = str == null ? "primary_session_id" : str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ProductItemsViewModel$restore$1", f = "ProductItemsViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ProductItemsViewModel$restore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ProductItemsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ProductItemsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ProductItemsUiState productItemsUiStateOrEmpty;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ProductItemsLoader productItemsLoader = ProductItemsViewModel.this.loader;
                this.label = 1;
                obj = productItemsLoader.loadPersisted(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ProductItemsUiState.Loaded loaded = (ProductItemsUiState.Loaded) obj;
            if (loaded == null || (productItemsUiStateOrEmpty = ProductItemsViewModel.this.orEmpty(loaded)) == null) {
                productItemsUiStateOrEmpty = ProductItemsUiState.Empty.INSTANCE;
            }
            if (ProductItemsViewModel.this._uiState.A6e(ProductItemsUiState.Loading.INSTANCE, productItemsUiStateOrEmpty) && loaded == null) {
                ProductItemsViewModel productItemsViewModel = ProductItemsViewModel.this;
                CFK.A06(ProductItemsViewModelKt.TAG, FGI.A0d("No shopping products for message ", productItemsViewModel.messageId, " in session ", productItemsViewModel.sessionId));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductItemsUiState orEmpty(ProductItemsUiState.Loaded loaded) {
        boolean zIsEmpty = loaded.sections.isEmpty();
        Object obj = loaded;
        if (zIsEmpty) {
            obj = ProductItemsUiState.Empty.INSTANCE;
        }
        return (ProductItemsUiState) obj;
    }

    public final C1BN<ProductItemsUiState> getUiState() {
        return this.uiState;
    }

    public final void onCloseTapped() {
        List list;
        String str;
        ProductItemsUiState.Loaded loaded;
        ProductItemsUiState value = this._uiState.getValue();
        if (!(value instanceof ProductItemsUiState.Loaded) || (loaded = (ProductItemsUiState.Loaded) value) == null || (list = loaded.sections) == null) {
            list = C0881AGi.A00;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_LIST;
        HatchComponent hatchComponent = HatchComponent.CLOSE_BUTTON;
        String str2 = this.messageId;
        ShoppingFormat shoppingFormat = ShoppingFormat.GRID;
        ProductItemsSection productItemsSection = (ProductItemsSection) AbstractC0878AGe.A0G(list);
        if ((productItemsSection == null || (str = productItemsSection.presentationId) == null) && (str = this.presentationId) == null) {
            str = this.messageId;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AHD<ShoppingResultProductUiModel> ahd = ((ProductItemsSection) it.next()).products;
            ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
            Iterator it2 = ahd.iterator();
            while (it2.hasNext()) {
                arrayListA0i.add(((ShoppingResultProductUiModel) it2.next()).product);
            }
            AbstractC0882AGj.A0r(arrayListA0i, arrayListA0h);
        }
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, ShoppingAnalyticsMetadataKt.shoppingWidgetMetadata(str2, shoppingFormat, str, new ShoppingMerchantRanking(arrayListA0h), C9jH.A00), null);
    }

    public ProductItemsViewModel(String str, String str2, String str3, ProductItemsLoader productItemsLoader, HatchProductDetailsRepository hatchProductDetailsRepository) {
        ProductItemsUiState productItemsUiStateOrEmpty;
        AnonymousClass005.A0y(str, str2, productItemsLoader);
        C7384Etj.A0Y(hatchProductDetailsRepository, 4);
        this.sessionId = str;
        this.messageId = str2;
        this.presentationId = str3;
        this.loader = productItemsLoader;
        ProductItemsUiState.Loaded loadedConsumeSeed = productItemsLoader.consumeSeed();
        this.seeded = loadedConsumeSeed;
        C9286GCn c9286GCnA01 = HnJ.A01((loadedConsumeSeed == null || (productItemsUiStateOrEmpty = orEmpty(loadedConsumeSeed)) == null) ? ProductItemsUiState.Loading.INSTANCE : productItemsUiStateOrEmpty);
        this._uiState = c9286GCnA01;
        this.uiState = AnonymousClass441.A00(ProductItemsViewModelKt.withCouponPrices((ProductItemsUiState) c9286GCnA01.getValue(), hatchProductDetailsRepository.couponPrices.getValue()), AEu.A00(this), C3rb.A03(new ProductItemsViewModel$uiState$1(null), c9286GCnA01, hatchProductDetailsRepository.couponPrices), C3Ek.A00);
        if (loadedConsumeSeed == null) {
            restore();
        }
    }

    private final void restore() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
