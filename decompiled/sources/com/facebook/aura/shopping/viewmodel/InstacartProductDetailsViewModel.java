package com.facebook.aura.shopping.viewmodel;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C0881AGi;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.shopping.model.PdpHeader;
import com.facebook.aura.shopping.model.PdpImage;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingEyebrowTextKt;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingResultsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class InstacartProductDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<InstacartProductDetailsUiState> _uiState;
    public final ProductDetailsAnalytics analytics;
    public final InstacartProductDetailsSheetKey key;
    public final HatchProductDetailsRepository repository;
    public final ShoppingResultProduct seededCard;
    public final C1BN<InstacartProductDetailsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<InstacartProductDetailsViewModel> {
        public static final int $stable = 8;
        public final InstacartProductDetailsSheetKey key;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public InstacartProductDetailsViewModel create() {
            return new InstacartProductDetailsViewModel(this.key, HatchProductDetailsRepository.Companion.getInstance(this.userSession), HatchShoppingSeedStore.Companion.getInstance(this.userSession));
        }

        public Factory(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(instacartProductDetailsSheetKey, abstractC3358CGz);
            this.key = instacartProductDetailsSheetKey;
            this.userSession = abstractC3358CGz;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel$onAddToCartTapped$2", f = "InstacartProductDetailsViewModel.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel$onAddToCartTapped$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ShoppingAddToCartTarget $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ShoppingAddToCartTarget shoppingAddToCartTarget, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$target = shoppingAddToCartTarget;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return InstacartProductDetailsViewModel.this.new AnonymousClass2(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            InstacartProductDetailsUiState value;
            InstacartProductDetailsUiState instacartProductDetailsUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InstacartProductDetailsViewModel instacartProductDetailsViewModel = InstacartProductDetailsViewModel.this;
                HatchProductDetailsRepository hatchProductDetailsRepository = instacartProductDetailsViewModel.repository;
                ShoppingAddToCartTarget shoppingAddToCartTarget = this.$target;
                String sessionId = instacartProductDetailsViewModel.key.getSessionId();
                this.label = 1;
                obj = hatchProductDetailsRepository.recordAddToCart(shoppingAddToCartTarget, sessionId, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            BLG<InstacartProductDetailsUiState> blg = InstacartProductDetailsViewModel.this._uiState;
            do {
                value = blg.getValue();
                instacartProductDetailsUiState = value;
            } while (!blg.A6e(value, instacartProductDetailsUiState.copy(instacartProductDetailsUiState.presentation, instacartProductDetailsUiState.imageUrls, instacartProductDetailsUiState.eyebrow, instacartProductDetailsUiState.cta, false, !zA1X, zA1X)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.shopping.viewmodel.InstacartProductCtaState ctaFor(java.lang.String r6) {
        /*
            r5 = this;
            com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey r0 = r5.key
            com.facebook.aura.shopping.model.ShoppingSecondaryAction r0 = r0.secondaryAction
            r4 = 0
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.label
            java.lang.String r0 = r0.url
            com.facebook.aura.shopping.viewmodel.InstacartProductAction$OpenLink r3 = new com.facebook.aura.shopping.viewmodel.InstacartProductAction$OpenLink
            r3.<init>(r1, r0)
        L10:
            if (r6 == 0) goto L36
            com.facebook.aura.shopping.viewmodel.InstacartProductAction$OpenLink r1 = new com.facebook.aura.shopping.viewmodel.InstacartProductAction$OpenLink
            r1.<init>(r4, r6)
        L17:
            com.facebook.aura.shopping.viewmodel.InstacartProductAction$AddToCart r2 = com.facebook.aura.shopping.viewmodel.InstacartProductAction.AddToCart.INSTANCE
            com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey r0 = r5.key
            com.facebook.aura.shopping.model.ShoppingAddToCartTarget r0 = r0.addToCartTarget
            if (r0 != 0) goto L20
            r2 = r4
        L20:
            if (r1 == 0) goto L2e
            if (r2 == 0) goto L31
            if (r3 != 0) goto L27
            r4 = r1
        L27:
            r1 = 0
        L28:
            com.facebook.aura.shopping.viewmodel.InstacartProductCtaState r0 = new com.facebook.aura.shopping.viewmodel.InstacartProductCtaState
            r0.<init>(r2, r4, r3, r1)
            return r0
        L2e:
            if (r2 == 0) goto L31
            goto L27
        L31:
            if (r3 != 0) goto L34
            r3 = r1
        L34:
            r1 = 1
            goto L28
        L36:
            r1 = r4
            goto L17
        L38:
            r3 = r4
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel.ctaFor(java.lang.String):com.facebook.aura.shopping.viewmodel.InstacartProductCtaState");
    }

    private final InstacartProductDetailsUiState initialState() {
        ShoppingResultProduct shoppingResultProduct = this.seededCard;
        ProductDetailsPresentation productDetailsPresentation = shoppingResultProduct != null ? ShoppingResultsPresentationKt.toProductDetailsPresentation(shoppingResultProduct) : placeholderPresentation();
        List<PdpImage> list = productDetailsPresentation.product.images;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<PdpImage> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().url);
        }
        return new InstacartProductDetailsUiState(productDetailsPresentation, AGI.A07(arrayListA0i), ShoppingEyebrowTextKt.eyebrowState(productDetailsPresentation.header), ctaFor(productDetailsPresentation.product.url), false, false, false);
    }

    private final void logProductDetailClick(HatchComponent hatchComponent) {
        InstacartProductDetailsUiState value = this._uiState.getValue();
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        ProductDetailsAnalytics productDetailsAnalytics = this.analytics;
        String str = productDetailsAnalytics.productId;
        ProductDetailsPresentation productDetailsPresentation = value.presentation;
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, productDetailsAnalytics.metadata(productDetailsPresentation.product.url, productDetailsPresentation.productType, C9jH.A00), null);
    }

    private final ProductDetailsPresentation placeholderPresentation() {
        InstacartProductDetailsSheetKey instacartProductDetailsSheetKey = this.key;
        String productId = instacartProductDetailsSheetKey.getProductId();
        ShoppingProductType shoppingProductType = instacartProductDetailsSheetKey.productType;
        ShoppingSecondaryAction shoppingSecondaryAction = instacartProductDetailsSheetKey.secondaryAction;
        String strTrimToNonEmpty = ProductDetailsPresentationKt.trimToNonEmpty(instacartProductDetailsSheetKey.merchantName);
        String strTrimToNonEmpty2 = ProductDetailsPresentationKt.trimToNonEmpty(this.key.merchantLogoUrl);
        String strTrimToNonEmpty3 = ProductDetailsPresentationKt.trimToNonEmpty(this.key.brand);
        InstacartProductDetailsSheetKey instacartProductDetailsSheetKey2 = this.key;
        PdpHeader pdpHeader = new PdpHeader(strTrimToNonEmpty, strTrimToNonEmpty2, strTrimToNonEmpty3, instacartProductDetailsSheetKey2.isPartnerMerchant);
        int i = PdpProductInfo.$stable;
        String strTrimToNonEmpty4 = ProductDetailsPresentationKt.trimToNonEmpty(instacartProductDetailsSheetKey2.productUrl);
        C0881AGi c0881AGi = C0881AGi.A00;
        PdpProductInfo pdpProductInfo = new PdpProductInfo("", null, strTrimToNonEmpty4, null, null, null, null, c0881AGi);
        A3q a3q = A3q.A00;
        C9jH c9jH = C9jH.A00;
        return new ProductDetailsPresentation(productId, pdpHeader, pdpProductInfo, null, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, c0881AGi, shoppingProductType, false, null, shoppingSecondaryAction, null, c0881AGi, c0881AGi, null, null, null, null, null, null, null, c0881AGi, a3q, c9jH, false, c9jH, a3q, null);
    }

    public final ProductDetailsAnalytics getAnalytics() {
        return this.analytics;
    }

    public final ShoppingResultProduct getSeededCard() {
        return this.seededCard;
    }

    public final C1BN<InstacartProductDetailsUiState> getUiState() {
        return this.uiState;
    }

    public final void onAddToCartDismissHandled() {
        InstacartProductDetailsUiState value;
        InstacartProductDetailsUiState instacartProductDetailsUiState;
        BLG<InstacartProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            instacartProductDetailsUiState = value;
        } while (!blg.A6e(value, instacartProductDetailsUiState.copy(instacartProductDetailsUiState.presentation, instacartProductDetailsUiState.imageUrls, instacartProductDetailsUiState.eyebrow, instacartProductDetailsUiState.cta, instacartProductDetailsUiState.isAddingToCart, instacartProductDetailsUiState.addToCartFailed, false)));
    }

    public final void onAddToCartTapped() {
        ShoppingAddToCartTarget shoppingAddToCartTarget;
        InstacartProductDetailsUiState value;
        InstacartProductDetailsUiState instacartProductDetailsUiState;
        InstacartProductDetailsUiState value2 = this._uiState.getValue();
        if (value2.isAddingToCart || (shoppingAddToCartTarget = this.key.addToCartTarget) == null) {
            return;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        HatchComponent hatchComponent = HatchComponent.ADD_TO_CART_BUTTON;
        ProductDetailsAnalytics productDetailsAnalytics = this.analytics;
        String str = productDetailsAnalytics.productId;
        ProductDetailsPresentation productDetailsPresentation = value2.presentation;
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, productDetailsAnalytics.metadata(productDetailsPresentation.product.url, productDetailsPresentation.productType, C9jH.A00), null);
        BLG<InstacartProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            instacartProductDetailsUiState = value;
        } while (!blg.A6e(value, instacartProductDetailsUiState.copy(instacartProductDetailsUiState.presentation, instacartProductDetailsUiState.imageUrls, instacartProductDetailsUiState.eyebrow, instacartProductDetailsUiState.cta, true, false, instacartProductDetailsUiState.addToCartSucceeded)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(shoppingAddToCartTarget, null), AEu.A00(this));
    }

    public final void onCloseHandleTapped() {
        logProductDetailClick(HatchComponent.CLOSE_BUTTON);
    }

    public final void onHeroImageTapped() {
        logProductDetailClick(HatchComponent.INLINE_IMAGE);
    }

    public InstacartProductDetailsViewModel(InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, HatchProductDetailsRepository hatchProductDetailsRepository, HatchShoppingSeedStore hatchShoppingSeedStore) {
        AnonymousClass005.A0x(instacartProductDetailsSheetKey, hatchProductDetailsRepository, hatchShoppingSeedStore);
        this.key = instacartProductDetailsSheetKey;
        this.repository = hatchProductDetailsRepository;
        this.analytics = new ProductDetailsAnalytics(instacartProductDetailsSheetKey.getHostMessageId(), instacartProductDetailsSheetKey.entryFormat, instacartProductDetailsSheetKey.widgetId, instacartProductDetailsSheetKey.cardProductId);
        this.seededCard = hatchShoppingSeedStore.consumeProduct(instacartProductDetailsSheetKey.getProductId());
        C9286GCn c9286GCnA01 = HnJ.A01(initialState());
        this._uiState = c9286GCnA01;
        this.uiState = C3Pi.A00(c9286GCnA01);
    }
}
