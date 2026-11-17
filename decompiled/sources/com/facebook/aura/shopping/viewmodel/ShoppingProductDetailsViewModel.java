package com.facebook.aura.shopping.viewmodel;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHG;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BGK;
import X.BLG;
import X.BLW;
import X.C06H;
import X.C0943AIw;
import X.C0953AJg;
import X.C10533Hqc;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C3pU;
import X.C7384Etj;
import X.C8j5;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC0962AJp;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.shopping.model.PdpCouponPrice;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.PdpVariantDetails;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.model.ProductDetailsPresentationKt;
import com.facebook.aura.shopping.model.ShoppingAddToCartTarget;
import com.facebook.aura.shopping.model.ShoppingConnector;
import com.facebook.aura.shopping.model.ShoppingCouponPrices;
import com.facebook.aura.shopping.model.ShoppingFormat;
import com.facebook.aura.shopping.model.ShoppingPrimaryAction;
import com.facebook.aura.shopping.model.ShoppingProductType;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingSecondaryAction;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.repo.HatchShoppingEventType;
import com.facebook.aura.shopping.repo.HatchShoppingSeedStore;
import com.facebook.aura.shopping.repo.ProductDetailsActionButton;
import com.facebook.aura.shopping.repo.ProductDetailsFetchResult;
import com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ShoppingProductDetailsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Integer> _buyButtonColor;
    public final BLG<ShoppingProductDetailsUiState> _uiState;
    public final ShoppingAddToCartTarget addToCartTarget;
    public final ProductDetailsAnalytics analytics;
    public final C20Q<Boolean> browserTryOnEligibility;
    public final C1BN<Integer> buyButtonColor;
    public final AtomicReference<HoC> couponExpiryJob;
    public final AtomicBoolean couponPriceRefreshActive;
    public final ShoppingConnector detailsConnector;
    public final AtomicBoolean hasSignaledPageOpen;
    public final ProductDetailsHydrationTarget hydrationTarget;
    public final AtomicBoolean isShown;
    public final String leadingHeroImageUrl;
    public final AtomicBoolean lifecycleStarted;
    public final ProductDetailsPresentation optimistic;
    public final ProductDetailsHydrationTarget pageOpenTarget;
    public final AtomicBoolean pagerSettled;
    public final String productId;
    public final ShoppingRailModels railModels;
    public final HatchProductDetailsRepository repository;
    public final ShoppingResultProduct seededCard;
    public final AtomicInteger selectionGeneration;
    public final String sessionId;
    public final C1BN<ShoppingProductDetailsUiState> uiState;
    public final boolean usesPartnerTemplate;
    public final AtomicInteger validatedNetworkTransitions;
    public final SingleFlight variantDetailsFlight;

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$3", f = "ShoppingProductDetailsViewModel.kt", l = {743}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingProductDetailsViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ShoppingProductDetailsViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qA01 = GDB.A01(new ShoppingProductDetailsViewModel$3$invokeSuspend$$inlined$map$1(AuraNetworkMonitor.state));
                final ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = ShoppingProductDetailsViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.3.2
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (z) {
                            shoppingProductDetailsViewModel.validatedNetworkTransitions.incrementAndGet();
                            if (shoppingProductDetailsViewModel.couponPriceRefreshActive.get()) {
                                ShoppingProductDetailsViewModel.retryUnconfirmedDisplayedPrice$default(shoppingProductDetailsViewModel, false, 1, null);
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$4", f = "ShoppingProductDetailsViewModel.kt", l = {753}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$4$2", f = "ShoppingProductDetailsViewModel.kt", l = {756}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$4$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;
            public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.this$0 = shoppingProductDetailsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                BLG blg;
                String str = (String) this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    blg = this.this$0._buyButtonColor;
                    obj = null;
                    if (str != null && ShoppingProductDetailsViewModelKt.getShoppingResultPdpBuyButtonImageColorEnabled()) {
                        ProductBuyColor productBuyColor = ProductBuyColor.INSTANCE;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = blg;
                        this.label = 1;
                        obj = productBuyColor.fromImage(str, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg = (BLG) this.L$2;
                    Hwg.A00(obj);
                }
                blg.Af8(obj);
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(String str, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass4(HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingProductDetailsViewModel.this.new AnonymousClass4(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ShoppingProductDetailsViewModel.this.new AnonymousClass4(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = ShoppingProductDetailsViewModel.this;
                C20Q c20qA01 = GDB.A01(new ShoppingProductDetailsViewModel$4$invokeSuspend$$inlined$map$1(shoppingProductDetailsViewModel._uiState));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(shoppingProductDetailsViewModel, null);
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<ShoppingProductDetailsViewModel> {
        public static final int $stable = 8;
        public final ShoppingProductDetailsPageKey productKey;
        public final ShoppingResultProduct seededProduct;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ShoppingProductDetailsViewModel create() {
            String productId = this.productKey.getProductId();
            HatchProductDetailsRepository companion = HatchProductDetailsRepository.Companion.getInstance(this.userSession);
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            HatchShoppingSeedStore companion2 = HatchShoppingSeedStore.Companion.getInstance(abstractC3358CGz);
            ShoppingProductDetailsPageKey shoppingProductDetailsPageKey = this.productKey;
            return new ShoppingProductDetailsViewModel(productId, companion, abstractC3358CGz, companion2, shoppingProductDetailsPageKey.getSessionId(), shoppingProductDetailsPageKey.brand, shoppingProductDetailsPageKey.merchantName, shoppingProductDetailsPageKey.merchantLogoUrl, shoppingProductDetailsPageKey.isPartnerMerchant, shoppingProductDetailsPageKey.productType, shoppingProductDetailsPageKey.canOfferBuyNow, shoppingProductDetailsPageKey.productUrl, shoppingProductDetailsPageKey.hydrationProductId, shoppingProductDetailsPageKey.hydrationConnectorId, shoppingProductDetailsPageKey.priceCurrency, shoppingProductDetailsPageKey.getHostMessageId(), shoppingProductDetailsPageKey.primaryAction, shoppingProductDetailsPageKey.secondaryAction, shoppingProductDetailsPageKey.entryFormat, shoppingProductDetailsPageKey.widgetId, shoppingProductDetailsPageKey.cardProductId, this.seededProduct, shoppingProductDetailsPageKey.leadingHeroImageUrl, shoppingProductDetailsPageKey.addToCartTarget);
        }

        public Factory(ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, AbstractC3358CGz abstractC3358CGz, ShoppingResultProduct shoppingResultProduct) {
            AnonymousClass003.A0u(shoppingProductDetailsPageKey, abstractC3358CGz);
            this.productKey = shoppingProductDetailsPageKey;
            this.userSession = abstractC3358CGz;
            this.seededProduct = shoppingResultProduct;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$hydrate$1", f = "ShoppingProductDetailsViewModel.kt", l = {775}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$hydrate$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ProductDetailsHydrationTarget $target;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductDetailsHydrationTarget productDetailsHydrationTarget, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$target = productDetailsHydrationTarget;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingProductDetailsViewModel.this.new AnonymousClass1(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ShoppingProductDetailsViewModel shoppingProductDetailsViewModel;
            ProductDetailsHydrationTarget productDetailsHydrationTarget;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                shoppingProductDetailsViewModel = ShoppingProductDetailsViewModel.this;
                productDetailsHydrationTarget = this.$target;
                HatchProductDetailsRepository hatchProductDetailsRepository = shoppingProductDetailsViewModel.repository;
                String str = productDetailsHydrationTarget.productId;
                ShoppingProductType shoppingProductType = productDetailsHydrationTarget.productType;
                String str2 = productDetailsHydrationTarget.priceCurrency;
                String str3 = productDetailsHydrationTarget.productName;
                String str4 = productDetailsHydrationTarget.connectorId;
                this.L$0 = shoppingProductDetailsViewModel;
                this.L$1 = productDetailsHydrationTarget;
                this.label = 1;
                obj = hatchProductDetailsRepository.fetchProductDetails(str, shoppingProductType, str2, str3, str4, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                productDetailsHydrationTarget = (ProductDetailsHydrationTarget) this.L$1;
                shoppingProductDetailsViewModel = (ShoppingProductDetailsViewModel) this.L$0;
                Hwg.A00(obj);
            }
            shoppingProductDetailsViewModel.applyHydration(productDetailsHydrationTarget, (ProductDetailsFetchResult) obj);
            ShoppingProductDetailsViewModel.this.maybeSignalPageOpen();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$onAddToCartTapped$2", f = "ShoppingProductDetailsViewModel.kt", l = {912}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$onAddToCartTapped$2, reason: invalid class name */
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
            return ShoppingProductDetailsViewModel.this.new AnonymousClass2(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ShoppingProductDetailsUiState value;
            Object objRecordAddToCart = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objRecordAddToCart);
                ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = ShoppingProductDetailsViewModel.this;
                HatchProductDetailsRepository hatchProductDetailsRepository = shoppingProductDetailsViewModel.repository;
                ShoppingAddToCartTarget shoppingAddToCartTarget = this.$target;
                String str = shoppingProductDetailsViewModel.sessionId;
                this.label = 1;
                objRecordAddToCart = hatchProductDetailsRepository.recordAddToCart(shoppingAddToCartTarget, str, this);
                if (objRecordAddToCart == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objRecordAddToCart);
            }
            boolean zA1X = AnonymousClass001.A1X(objRecordAddToCart);
            BLG<ShoppingProductDetailsUiState> blg = ShoppingProductDetailsViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, false, false, false, !zA1X, zA1X, false, null, false, false, null, null, null, 130175, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$onBuyTapped$3", f = "ShoppingProductDetailsViewModel.kt", l = {978}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$onBuyTapped$3, reason: invalid class name and case insensitive filesystem */
    public final class C137713 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $postsProductUrl;
        public final /* synthetic */ String $purchaseId;
        public final /* synthetic */ ShoppingProductDetailsUiState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137713(boolean z, String str, ShoppingProductDetailsUiState shoppingProductDetailsUiState, HtJ<? super C137713> htJ) {
            super(2, htJ);
            this.$postsProductUrl = z;
            this.$purchaseId = str;
            this.$state = shoppingProductDetailsUiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingProductDetailsViewModel.this.new C137713(this.$postsProductUrl, this.$purchaseId, this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            ShoppingProductDetailsUiState value;
            Object objRecordShoppingEvent = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objRecordShoppingEvent);
                ShoppingProductDetailsViewModel shoppingProductDetailsViewModel = ShoppingProductDetailsViewModel.this;
                HatchProductDetailsRepository hatchProductDetailsRepository = shoppingProductDetailsViewModel.repository;
                HatchShoppingEventType hatchShoppingEventType = HatchShoppingEventType.CLICKED_PURCHASE;
                String str2 = null;
                if (this.$postsProductUrl) {
                    str = null;
                    str2 = this.$state.presentation.product.url;
                } else {
                    str = this.$purchaseId;
                }
                String str3 = shoppingProductDetailsViewModel.sessionId;
                this.label = 1;
                objRecordShoppingEvent = hatchProductDetailsRepository.recordShoppingEvent(hatchShoppingEventType, str, str2, str3, this);
                if (objRecordShoppingEvent == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objRecordShoppingEvent);
            }
            boolean zA1X = AnonymousClass001.A1X(objRecordShoppingEvent);
            BLG<ShoppingProductDetailsUiState> blg = ShoppingProductDetailsViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, !zA1X, zA1X, false, false, false, false, null, false, false, null, null, null, 130959, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137713) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$refreshCouponPrice$1", f = "ShoppingProductDetailsViewModel.kt", l = {586}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$refreshCouponPrice$1, reason: invalid class name and case insensitive filesystem */
    public final class C137721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $noticeAllowed;
        public final /* synthetic */ String $skuId;
        public final /* synthetic */ ProductDetailsHydrationTarget $target;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137721(String str, ProductDetailsHydrationTarget productDetailsHydrationTarget, boolean z, HtJ<? super C137721> htJ) {
            super(2, htJ);
            this.$skuId = str;
            this.$target = productDetailsHydrationTarget;
            this.$noticeAllowed = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingProductDetailsViewModel.this.new C137721(this.$skuId, this.$target, this.$noticeAllowed, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r2 = 1
                if (r0 == 0) goto L7f
                if (r0 != r2) goto La3
                int r1 = r10.I$0
                X.Hwg.A00(r11)
            Le:
                com.facebook.aura.shopping.repo.ProductDetailsFetchResult r11 = (com.facebook.aura.shopping.repo.ProductDetailsFetchResult) r11
                boolean r0 = r11 instanceof com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Success
                if (r0 == 0) goto L23
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r2 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Success r11 = (com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Success) r11
                com.facebook.aura.shopping.model.ProductDetailsPresentation r0 = r11.presentation
                com.facebook.aura.shopping.model.ProductDetailsPresentation r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.access$withoutRowsAnsweredNoCoupon(r2, r0)
                com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Success r11 = new com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Success
                r11.<init>(r0)
            L23:
                boolean r0 = r11 instanceof com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Failed
                if (r0 == 0) goto L4e
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.validatedNetworkTransitions
                int r0 = r0.get()
                if (r0 == r1) goto L4e
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.couponPriceRefreshActive
                boolean r0 = r0.get()
                if (r0 == 0) goto L4e
                java.lang.String r1 = r10.$skuId
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r0 = X.AEs.A01(r0)
                java.lang.String r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt.getDisplayedProductId(r0)
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                r7 = 1
                if (r0 != 0) goto L4f
            L4e:
                r7 = 0
            L4f:
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r6 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                X.BLG<com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState> r5 = r6._uiState
                java.lang.String r4 = r10.$skuId
                boolean r3 = r10.$noticeAllowed
            L57:
                java.lang.Object r2 = r5.getValue()
                r1 = r2
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r1 = (com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState) r1
                if (r3 == 0) goto L63
                r0 = 1
                if (r7 == 0) goto L64
            L63:
                r0 = 0
            L64:
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.access$withRefreshedCouponPrice(r6, r1, r4, r11, r0)
                boolean r0 = r5.A6e(r2, r0)
                if (r0 == 0) goto L57
                if (r7 == 0) goto L77
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r1 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                boolean r0 = r10.$noticeAllowed
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.access$retryUnconfirmedDisplayedPrice(r1, r0)
            L77:
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.access$scheduleDisplayedCouponExpiry(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L7f:
                X.Hwg.A00(r11)
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.validatedNetworkTransitions
                int r1 = r0.get()
                com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.this
                com.facebook.aura.shopping.repo.HatchProductDetailsRepository r4 = r0.repository
                java.lang.String r5 = r10.$skuId
                com.facebook.aura.shopping.model.ShoppingProductType r6 = com.facebook.aura.shopping.model.ShoppingProductType.CATALOG
                com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget r0 = r10.$target
                java.lang.String r7 = r0.priceCurrency
                r10.I$0 = r1
                r10.label = r2
                r8 = 0
                r9 = r8
                java.lang.Object r11 = r4.fetchProductDetails(r5, r6, r7, r8, r9, r10)
                if (r11 != r3) goto Le
                return r3
            La3:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.C137721.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$resolveSelection$3", f = "ShoppingProductDetailsViewModel.kt", l = {1083, 1099}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$resolveSelection$3, reason: invalid class name and case insensitive filesystem */
    public final class C137733 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ProductDetailsPresentation $basePresentation;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ List<String> $pendingDetails;
        public final /* synthetic */ boolean $pickedUnconfirmed;
        public final /* synthetic */ InterfaceC0962AJp<String, String> $selections;
        public int I$0;
        public int I$1;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ ShoppingProductDetailsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137733(List<String> list, ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, InterfaceC0962AJp<String, String> interfaceC0962AJp, boolean z, ProductDetailsPresentation productDetailsPresentation, int i, HtJ<? super C137733> htJ) {
            super(2, htJ);
            this.$pendingDetails = list;
            this.this$0 = shoppingProductDetailsViewModel;
            this.$selections = interfaceC0962AJp;
            this.$pickedUnconfirmed = z;
            this.$basePresentation = productDetailsPresentation;
            this.$generation = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137733 c137733 = new C137733(this.$pendingDetails, this.this$0, this.$selections, this.$pickedUnconfirmed, this.$basePresentation, this.$generation, htJ);
            c137733.L$0 = obj;
            return c137733;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
        /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:8:0x0030). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0071 -> B:7:0x002a). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00cf -> B:31:0x00e9). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.C137733.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137733) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel", f = "ShoppingProductDetailsViewModel.kt", l = {1127}, m = "variantRecord", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$1, reason: invalid class name and case insensitive filesystem */
    public final class C137741 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C137741(HtJ<? super C137741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingProductDetailsViewModel.this.variantRecord(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$2, reason: invalid class name and case insensitive filesystem */
    public final class C137752 extends AbstractC7559F3s implements G0U<ProductDetailsPresentation, ProductDetailsPresentation> {
        public final /* synthetic */ ProductDetailsFetchResult $fetched;
        public final /* synthetic */ String $variantId;

        @Override // X.G0U
        public final ProductDetailsPresentation invoke(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return ShoppingProductDetailsViewModelKt.withVariantRecord(productDetailsPresentation, this.$variantId, ((ProductDetailsFetchResult.Success) this.$fetched).presentation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137752(String str, ProductDetailsFetchResult productDetailsFetchResult) {
            super(1);
            this.$variantId = str;
            this.$fetched = productDetailsFetchResult;
        }
    }

    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$3, reason: invalid class name and case insensitive filesystem */
    public final class C137763 extends AbstractC7559F3s implements G0U<ProductDetailsPresentation, ProductDetailsPresentation> {
        public final /* synthetic */ ProductDetailsFetchResult $fetched;
        public final /* synthetic */ String $variantId;

        @Override // X.G0U
        public final ProductDetailsPresentation invoke(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return ShoppingProductDetailsViewModelKt.withVariantRecord(productDetailsPresentation, this.$variantId, ((ProductDetailsFetchResult.StaleQuote) this.$fetched).presentation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137763(String str, ProductDetailsFetchResult productDetailsFetchResult) {
            super(1);
            this.$variantId = str;
            this.$fetched = productDetailsFetchResult;
        }
    }

    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$4, reason: invalid class name and case insensitive filesystem */
    public final class C137774 extends AbstractC7559F3s implements G0U<ProductDetailsPresentation, ProductDetailsPresentation> {
        public final /* synthetic */ String $variantId;

        @Override // X.G0U
        public final ProductDetailsPresentation invoke(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return productDetailsPresentation.withEmptyVariantDetails(this.$variantId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137774(String str) {
            super(1);
            this.$variantId = str;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShoppingProductType.values().length];
            try {
                AnonymousClass002.A13(ShoppingProductType.BROWSER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ShoppingProductType.CATALOG, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ShoppingProductType.MARKETPLACE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ShoppingProductType.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void applyHydratedDetails(ProductDetailsHydrationTarget productDetailsHydrationTarget, ProductDetailsPresentation productDetailsPresentation) {
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateCopy$default;
        ProductDetailsPresentation productDetailsPresentationForConnector;
        ProductDetailsPresentation productDetailsPresentationMergedWith = ProductDetailsPresentationKt.mergedWith(productDetailsPresentation, this.optimistic);
        if (productDetailsHydrationTarget.productType == ShoppingProductType.BROWSER) {
            PdpProductInfo pdpProductInfo = productDetailsPresentationMergedWith.product;
            productDetailsPresentationMergedWith = ProductDetailsPresentation.copy$default(productDetailsPresentationMergedWith, null, null, pdpProductInfo.copy(pdpProductInfo.name, pdpProductInfo.description, this.optimistic.product.url, pdpProductInfo.stockStatus, pdpProductInfo.currentPrice, pdpProductInfo.originalPrice, pdpProductInfo.pricePercentOff, pdpProductInfo.images), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 2147483643, null);
        }
        ShoppingConnector shoppingConnector = this.detailsConnector;
        if (shoppingConnector != null && (productDetailsPresentationForConnector = forConnector(productDetailsPresentationMergedWith, shoppingConnector)) != null) {
            productDetailsPresentationMergedWith = productDetailsPresentationForConnector;
        }
        ProductDetailsPresentation productDetailsPresentationWithFallbackActions = withFallbackActions(productDetailsPresentationMergedWith);
        InterfaceC0962AJp<String, String> interfaceC0962AJpA0F = AGI.A0F(productDetailsPresentationWithFallbackActions.selectionsForProductId(productDetailsPresentationWithFallbackActions.productId));
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            ShoppingProductDetailsUiState shoppingProductDetailsUiState = value;
            shoppingProductDetailsUiStateCopy$default = ShoppingProductDetailsUiState.copy$default(ShoppingProductDetailsViewModelKt.withVariants(shoppingProductDetailsUiState, ShoppingProductDetailsViewModelKt.retainingLiveOwnCouponPrices(ProductDetailsPresentation.copy$default(productDetailsPresentationWithFallbackActions, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, shoppingProductDetailsUiState.presentation.variantDetails, false, null, null, null, 2080374783, null), shoppingProductDetailsUiState.presentation, C8j5.A00()), shoppingProductDetailsUiState.selections.isEmpty() ? interfaceC0962AJpA0F : shoppingProductDetailsUiState.selections, false, false, false, shoppingProductDetailsUiState.refreshingPriceIds.Aaa(productDetailsPresentationWithFallbackActions.productId), shoppingProductDetailsUiState.unconfirmedPriceIds.Aaa(productDetailsPresentationWithFallbackActions.productId), shoppingProductDetailsUiState.unavailablePriceIds, false, new ShoppingCouponPrices(C9jH.A00), null), null, null, null, ShoppingProductDetailsHydrationState.LOADED, false, false, false, false, false, false, false, null, false, false, null, null, null, 131063, null);
        } while (!blg.A6e(value, shoppingProductDetailsUiStateCopy$default));
        scheduleDisplayedCouponExpiry();
        fetchVariantDetails(shoppingProductDetailsUiStateCopy$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyHydration(ProductDetailsHydrationTarget productDetailsHydrationTarget, ProductDetailsFetchResult productDetailsFetchResult) {
        ProductDetailsPresentation productDetailsPresentation;
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState value2;
        if (productDetailsFetchResult instanceof ProductDetailsFetchResult.Failed) {
            if (this.seededCard != null) {
                ShoppingProductDetailsUiState shoppingProductDetailsUiStateCopy$default = ShoppingProductDetailsUiState.copy$default(ShoppingProductDetailsViewModelKt.withVariants$default(getSeedOnlyState(), null, null, false, false, false, null, null, null, true, null, null, 1791, null), null, null, null, null, false, false, false, false, false, false, false, ShoppingProductDetailsNotice.LOAD_FAILED, false, false, null, null, null, 129023, null);
                BLG<ShoppingProductDetailsUiState> blg = this._uiState;
                while (!blg.A6e(blg.getValue(), shoppingProductDetailsUiStateCopy$default)) {
                }
                return false;
            }
            BLG<ShoppingProductDetailsUiState> blg2 = this._uiState;
            do {
                value2 = blg2.getValue();
            } while (!blg2.A6e(value2, ShoppingProductDetailsUiState.copy$default(ShoppingProductDetailsViewModelKt.withVariants$default(value2, null, null, false, false, false, null, null, null, true, null, null, 1779, null), null, null, null, ShoppingProductDetailsHydrationState.FAILED, false, false, false, false, false, false, false, ShoppingProductDetailsNotice.LOAD_FAILED, false, false, null, null, null, 129015, null)));
            return false;
        }
        if (productDetailsFetchResult instanceof ProductDetailsFetchResult.Unavailable) {
            BLG<ShoppingProductDetailsUiState> blg3 = this._uiState;
            do {
                value = blg3.getValue();
            } while (!blg3.A6e(value, ShoppingProductDetailsUiState.copy$default(ShoppingProductDetailsViewModelKt.withVariants$default(value, null, null, false, false, false, null, null, null, false, null, null, 1779, null), null, null, null, ShoppingProductDetailsHydrationState.UNAVAILABLE, false, false, false, false, false, false, false, ShoppingProductDetailsNotice.UNAVAILABLE, false, false, null, null, null, 129015, null)));
            return false;
        }
        if (productDetailsFetchResult instanceof ProductDetailsFetchResult.Success) {
            productDetailsPresentation = ((ProductDetailsFetchResult.Success) productDetailsFetchResult).presentation;
        } else {
            if (!(productDetailsFetchResult instanceof ProductDetailsFetchResult.StaleQuote)) {
                throw C3cG.A0q();
            }
            productDetailsPresentation = ((ProductDetailsFetchResult.StaleQuote) productDetailsFetchResult).presentation;
        }
        applyHydratedDetails(productDetailsHydrationTarget, productDetailsPresentation);
        return true;
    }

    private final void applyRefreshActivity() {
        ShoppingProductDetailsUiState value;
        if (!this.pagerSettled.get() || !this.lifecycleStarted.get()) {
            if (this.couponPriceRefreshActive.compareAndSet(true, false)) {
                C8j5.A0r(this.couponExpiryJob);
            }
        } else if (this.couponPriceRefreshActive.compareAndSet(false, true)) {
            BLG<ShoppingProductDetailsUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ShoppingProductDetailsViewModelKt.withVariants$default(value, null, null, false, false, false, null, null, null, false, null, null, 2047, null)));
            retryUnconfirmedDisplayedPrice(false);
            scheduleDisplayedCouponExpiry();
            maybeSignalPageOpen();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyVariantRecord(G0U<? super ProductDetailsPresentation, ProductDetailsPresentation> g0u) {
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState shoppingProductDetailsUiState;
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingProductDetailsUiState = value;
        } while (!blg.A6e(value, ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, g0u.invoke(shoppingProductDetailsUiState.presentation), null, false, false, false, null, null, null, false, null, null, 2046, null)));
        scheduleDisplayedCouponExpiry();
    }

    private final boolean buyButtonEnabledFor(ShoppingProductType shoppingProductType) {
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType.ordinal();
        if (iOrdinal == 2) {
            return ShoppingProductDetailsViewModelKt.getShoppingResultPdpBuyButtonForBrowserEnabled();
        }
        if (iOrdinal == 0) {
            return ShoppingProductDetailsViewModelKt.getShoppingResultPdpBuyButtonEnabled();
        }
        if (iOrdinal == 1 || iOrdinal == 3) {
            return false;
        }
        throw C3cG.A0q();
    }

    private final void fetchVariantDetails(ShoppingProductDetailsUiState shoppingProductDetailsUiState) {
        ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiState.presentation;
        Set setA05 = BLW.A05(shoppingProductDetailsUiState.display.displayProductId, productDetailsPresentation.heroProductId(shoppingProductDetailsUiState.selections));
        Map<String, PdpVariantDetails> map = productDetailsPresentation.variantDetails;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : setA05) {
            if (!map.containsKey(obj)) {
                arrayListA0h.add(obj);
            }
        }
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new ShoppingProductDetailsViewModel$fetchVariantDetails$2$1(this, productDetailsPresentation, strA0j, null), AEu.A00(this));
        }
    }

    private final ProductDetailsPresentation forConnector(ProductDetailsPresentation productDetailsPresentation, ShoppingConnector shoppingConnector) {
        ProductDetailsPresentation productDetailsPresentationWithPayloadPricing = ProductDetailsPresentationKt.withPayloadPricing(productDetailsPresentation, this.optimistic);
        List<ShoppingResultProduct> list = productDetailsPresentation.relatedProducts;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<ShoppingResultProduct> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(ShoppingResultProduct.copy$default(it.next(), null, null, null, null, null, null, null, null, this.optimistic.productType, false, false, false, null, null, false, AnonymousClass001.A0u(shoppingConnector.id), null, null, null, shoppingConnector, null, 1539839, null));
        }
        return ProductDetailsPresentation.copy$default(productDetailsPresentationWithPayloadPricing, null, null, null, null, null, null, null, null, null, arrayListA0i, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 2147483135, null);
    }

    private final ShoppingProductDetailsUiState getSeedOnlyState() {
        ProductDetailsPresentation productDetailsPresentationWithFallbackActions = withFallbackActions(this.optimistic);
        ShoppingProductDetailsDisplayState displayState$default = ShoppingProductDetailsViewModelKt.toDisplayState$default(productDetailsPresentationWithFallbackActions, C9jH.A00, this.leadingHeroImageUrl, false, false, false, null, null, null, false, null, null, 0.0d, 4092, null);
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState = ShoppingProductDetailsHydrationState.LOADED;
        C0953AJg c0953AJg = C0953AJg.A03;
        C0943AIw c0943AIw = C0943AIw.A03;
        return new ShoppingProductDetailsUiState(productDetailsPresentationWithFallbackActions, displayState$default, c0953AJg, shoppingProductDetailsHydrationState, false, false, false, false, false, false, false, null, false, false, c0943AIw, c0943AIw, c0943AIw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeSignalPageOpen() {
        Set<? extends ProductDetailsActionButton> setRenderedActionButtons;
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateA01;
        ShoppingProductDetailsHydrationState shoppingProductDetailsHydrationState;
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.pageOpenTarget;
        if (productDetailsHydrationTarget == null || !this.isShown.get()) {
            return;
        }
        if (productDetailsHydrationTarget.productType != ShoppingProductType.CATALOG || (shoppingProductDetailsHydrationState = (shoppingProductDetailsUiStateA01 = AEs.A01(this)).hydration) == ShoppingProductDetailsHydrationState.UNAVAILABLE) {
            setRenderedActionButtons = A3q.A00;
        } else if (shoppingProductDetailsHydrationState != ShoppingProductDetailsHydrationState.LOADED || shoppingProductDetailsUiStateA01.hasHydrationFailure || !this.couponPriceRefreshActive.get()) {
            return;
        } else {
            setRenderedActionButtons = ShoppingProductDetailsViewModelKt.renderedActionButtons(shoppingProductDetailsUiStateA01.presentation.effectiveActions(shoppingProductDetailsUiStateA01.display.displayProductId));
        }
        signalPageOpenOnce(productDetailsHydrationTarget, setRenderedActionButtons);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshCouponPrice(String str, boolean z) {
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState shoppingProductDetailsUiState;
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateCopy$default;
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.hydrationTarget;
        if (productDetailsHydrationTarget == null || productDetailsHydrationTarget.connectorId != null) {
            return;
        }
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingProductDetailsUiState = value;
            if (shoppingProductDetailsUiState.refreshingPriceIds.contains(str)) {
                shoppingProductDetailsUiStateCopy$default = shoppingProductDetailsUiState;
            } else {
                ShoppingProductDetailsUiState shoppingProductDetailsUiStateWithVariants$default = ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, null, null, false, false, false, shoppingProductDetailsUiState.refreshingPriceIds.A35(str), shoppingProductDetailsUiState.unconfirmedPriceIds.Aaa(str), null, false, null, null, 1951, null);
                ShoppingProductDetailsNotice shoppingProductDetailsNotice = shoppingProductDetailsUiState.notice;
                ShoppingProductDetailsNotice shoppingProductDetailsNotice2 = null;
                if (!C7384Etj.areEqual(str, ShoppingProductDetailsViewModelKt.getDisplayedProductId(shoppingProductDetailsUiState))) {
                    shoppingProductDetailsNotice2 = shoppingProductDetailsNotice;
                }
                shoppingProductDetailsUiStateCopy$default = ShoppingProductDetailsUiState.copy$default(shoppingProductDetailsUiStateWithVariants$default, null, null, null, null, false, false, false, false, false, false, false, shoppingProductDetailsNotice2, false, false, null, null, null, 129023, null);
            }
        } while (!blg.A6e(value, shoppingProductDetailsUiStateCopy$default));
        if (shoppingProductDetailsUiState.refreshingPriceIds.contains(str)) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C137721(str, productDetailsHydrationTarget, z, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshLapsedPageQuote(ShoppingProductDetailsUiState shoppingProductDetailsUiState, String str) {
        PdpCouponPrice pdpCouponPrice = shoppingProductDetailsUiState.presentation.couponPrices.get(str);
        if (pdpCouponPrice == null || pdpCouponPrice.expiresAt > C8j5.A00() || shoppingProductDetailsUiState.unavailablePriceIds.contains(str)) {
            return;
        }
        HatchProductDetailsRepository hatchProductDetailsRepository = this.repository;
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.hydrationTarget;
        if (hatchProductDetailsRepository.hasFreshOwnNoCouponResponse(str, productDetailsHydrationTarget != null ? productDetailsHydrationTarget.priceCurrency : null)) {
            return;
        }
        refreshCouponPrice(str, false);
    }

    private final void resolveSelection(InterfaceC0962AJp<String, String> interfaceC0962AJp) {
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState shoppingProductDetailsUiState;
        ShoppingProductDetailsUiState value2;
        int iIncrementAndGet = this.selectionGeneration.incrementAndGet();
        ProductDetailsPresentation productDetailsPresentation = AEs.A01(this).presentation;
        Set setA05 = BLW.A05(productDetailsPresentation.displayProductId(interfaceC0962AJp), productDetailsPresentation.heroProductId(interfaceC0962AJp));
        Map<String, PdpVariantDetails> map = productDetailsPresentation.variantDetails;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : setA05) {
            if (!map.containsKey(obj)) {
                arrayListA0h.add(obj);
            }
        }
        boolean zIsEmpty = arrayListA0h.isEmpty();
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        if (zIsEmpty) {
            do {
                value2 = blg.getValue();
            } while (!blg.A6e(value2, ShoppingProductDetailsViewModelKt.withVariants$default(value2, null, interfaceC0962AJp, false, false, false, null, null, null, false, null, null, 2025, null)));
            retryUnconfirmedDisplayedPrice(false);
            scheduleDisplayedCouponExpiry();
            return;
        }
        do {
            value = blg.getValue();
            shoppingProductDetailsUiState = value;
        } while (!blg.A6e(value, ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, null, interfaceC0962AJp, true, false, ShoppingProductDetailsViewModelKt.galleryChangesFor(shoppingProductDetailsUiState.presentation, interfaceC0962AJp, shoppingProductDetailsUiState.display.imageUrls), null, null, null, false, null, null, 2025, null)));
        AHG<String> ahg = AEs.A01(this).unconfirmedPriceIds;
        String strDisplayProductId = productDetailsPresentation.displayProductId(interfaceC0962AJp);
        if (strDisplayProductId == null) {
            strDisplayProductId = productDetailsPresentation.productId;
        }
        boolean zContains = ahg.contains(strDisplayProductId);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C137733(arrayListA0h, this, interfaceC0962AJp, zContains, productDetailsPresentation, iIncrementAndGet, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleDisplayedCouponExpiry() {
        if (!this.couponPriceRefreshActive.get()) {
            C8j5.A0r(this.couponExpiryJob);
            return;
        }
        int i = this.selectionGeneration.get();
        C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new ShoppingProductDetailsViewModel$scheduleDisplayedCouponExpiry$job$1(this, i, null), AEu.A00(this));
        HoC andSet = this.couponExpiryJob.getAndSet(c10533HqcA11);
        if (andSet != null) {
            andSet.A5w(null);
        }
        if (this.couponExpiryJob.get() == c10533HqcA11 && this.couponPriceRefreshActive.get()) {
            return;
        }
        c10533HqcA11.A5w(null);
    }

    private final boolean seededCardHasListCoupon() {
        ShoppingResultProduct shoppingResultProduct = this.seededCard;
        return (shoppingResultProduct == null || this.repository.couponPrices.getValue().liveFor(shoppingResultProduct, C8j5.A00()) == null) ? false : true;
    }

    private final void signalPageOpenOnce(ProductDetailsHydrationTarget productDetailsHydrationTarget, Set<? extends ProductDetailsActionButton> set) {
        if (C3cI.A1W(this.hasSignaledPageOpen)) {
            this.repository.signalDeveloperMessage(productDetailsHydrationTarget.productId, productDetailsHydrationTarget.productType, productDetailsHydrationTarget.priceCurrency, set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object variantRecord(com.facebook.aura.shopping.model.ProductDetailsPresentation r8, java.lang.String r9, X.HtJ<? super X.G0U<? super com.facebook.aura.shopping.model.ProductDetailsPresentation, com.facebook.aura.shopping.model.ProductDetailsPresentation>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.C137741
            if (r0 == 0) goto L54
            r6 = r10
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$1 r6 = (com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.C137741) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L3c
            if (r0 != r4) goto L84
            java.lang.Object r0 = r6.L$1
            java.lang.String r9 = X.C3cG.A0d(r0, r1)
        L24:
            com.facebook.aura.common.coroutines.SingleFlightResult r1 = (com.facebook.aura.common.coroutines.SingleFlightResult) r1
            boolean r0 = r1 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L32
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r1 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r1
            if (r1 == 0) goto L32
            T r3 = r1.value
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult r3 = (com.facebook.aura.shopping.repo.ProductDetailsFetchResult) r3
        L32:
            boolean r0 = r3 instanceof com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Success
            if (r0 == 0) goto L5a
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$2 r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$2
            r0.<init>(r9, r3)
            return r0
        L3c:
            X.Hwg.A00(r1)
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.variantDetailsFlight
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$flight$1 r1 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$flight$1
            r1.<init>(r7, r9, r8, r3)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r9
            r6.label = r4
            java.lang.Object r1 = r2.invoke(r9, r1, r6)
            if (r1 != r5) goto L24
            return r5
        L54:
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$1 r6 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$1
            r6.<init>(r10)
            goto L12
        L5a:
            boolean r0 = r3 instanceof com.facebook.aura.shopping.repo.ProductDetailsFetchResult.StaleQuote
            if (r0 == 0) goto L64
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$3 r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$3
            r0.<init>(r9, r3)
            return r0
        L64:
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Unavailable r0 = com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Unavailable.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L72
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$4 r0 = new com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$4
            r0.<init>(r9)
            return r0
        L72:
            com.facebook.aura.shopping.repo.ProductDetailsFetchResult$Failed r0 = com.facebook.aura.shopping.repo.ProductDetailsFetchResult.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 != 0) goto L81
            if (r3 == 0) goto L81
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L81:
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$5 r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.AnonymousClass5.INSTANCE
            return r0
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.variantRecord(com.facebook.aura.shopping.model.ProductDetailsPresentation, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.shopping.model.ProductDetailsPresentation withFallbackActions(com.facebook.aura.shopping.model.ProductDetailsPresentation r42) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.withFallbackActions(com.facebook.aura.shopping.model.ProductDetailsPresentation):com.facebook.aura.shopping.model.ProductDetailsPresentation");
    }

    private final ShoppingProductDetailsUiState withPriceNotice(ShoppingProductDetailsUiState shoppingProductDetailsUiState, String str, boolean z, ShoppingProductDetailsNotice shoppingProductDetailsNotice) {
        return (z && C7384Etj.areEqual(str, ShoppingProductDetailsViewModelKt.getDisplayedProductId(shoppingProductDetailsUiState))) ? ShoppingProductDetailsUiState.copy$default(shoppingProductDetailsUiState, null, null, null, null, false, false, false, false, false, false, false, shoppingProductDetailsNotice, false, false, null, null, null, 129023, null) : shoppingProductDetailsUiState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShoppingProductDetailsUiState withRefreshedCouponPrice(ShoppingProductDetailsUiState shoppingProductDetailsUiState, String str, ProductDetailsFetchResult productDetailsFetchResult, boolean z) {
        ProductDetailsPresentation productDetailsPresentation;
        C0943AIw c0943AIwAaa = shoppingProductDetailsUiState.refreshingPriceIds.Aaa(str);
        ProductDetailsPresentation productDetailsPresentation2 = shoppingProductDetailsUiState.presentation;
        ProductDetailsPresentation productDetailsPresentationCopy$default = ProductDetailsPresentation.copy$default(productDetailsPresentation2, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AGH.A09(str, productDetailsPresentation2.couponPrices), BGK.A04(str, shoppingProductDetailsUiState.presentation.ownCouponPriceIds), null, 1342177279, null);
        if (productDetailsFetchResult instanceof ProductDetailsFetchResult.Success) {
            productDetailsPresentation = ((ProductDetailsFetchResult.Success) productDetailsFetchResult).presentation;
        } else {
            if (!(productDetailsFetchResult instanceof ProductDetailsFetchResult.StaleQuote)) {
                if (!C7384Etj.areEqual(productDetailsFetchResult, ProductDetailsFetchResult.Unavailable.INSTANCE) && !C7384Etj.areEqual(productDetailsFetchResult, ProductDetailsFetchResult.Failed.INSTANCE)) {
                    throw C3cG.A0q();
                }
                boolean z2 = productDetailsFetchResult instanceof ProductDetailsFetchResult.Unavailable;
                C0943AIw c0943AIwA35 = shoppingProductDetailsUiState.unconfirmedPriceIds.A35(str);
                AHG<String> ahg = shoppingProductDetailsUiState.unavailablePriceIds;
                return withPriceNotice(ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, productDetailsPresentationCopy$default, null, false, false, false, c0943AIwAaa, c0943AIwA35, z2 ? ahg.A35(str) : ahg.Aaa(str), false, null, null, 1822, null), str, z, z2 ? ShoppingProductDetailsNotice.UNAVAILABLE : ShoppingProductDetailsNotice.LOAD_FAILED);
            }
            productDetailsPresentation = ((ProductDetailsFetchResult.StaleQuote) productDetailsFetchResult).presentation;
        }
        if (!C7384Etj.areEqual(productDetailsPresentation.productId, str)) {
            PdpCouponPrice pdpCouponPrice = productDetailsPresentation.couponPrices.get(str);
            if (pdpCouponPrice == null || (productDetailsPresentationCopy$default = ProductDetailsPresentation.copy$default(productDetailsPresentationCopy$default, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AnonymousClass006.A11(str, pdpCouponPrice, productDetailsPresentationCopy$default.couponPrices), null, null, 1879048191, null)) == null) {
            }
            return ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, productDetailsPresentationCopy$default, null, false, false, false, c0943AIwAaa, shoppingProductDetailsUiState.unconfirmedPriceIds.Aaa(str), shoppingProductDetailsUiState.unavailablePriceIds.Aaa(str), false, null, null, 1822, null);
        }
        productDetailsPresentationCopy$default = C7384Etj.areEqual(str, shoppingProductDetailsUiState.presentation.productId) ? ShoppingProductDetailsViewModelKt.retainingLiveOwnCouponPrices(withoutRowsAnsweredNoCoupon(ProductDetailsPresentation.copy$default(withFallbackActions(ProductDetailsPresentationKt.mergedWith(productDetailsPresentation, this.optimistic)), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, shoppingProductDetailsUiState.presentation.variantDetails, false, null, null, null, 2080374783, null)), shoppingProductDetailsUiState.presentation, C8j5.A00()) : ShoppingProductDetailsViewModelKt.withVariantRecord(shoppingProductDetailsUiState.presentation, str, productDetailsPresentation);
        ProductDetailsPresentation productDetailsPresentationCopy$default2 = productDetailsPresentationCopy$default;
        return ShoppingProductDetailsViewModelKt.withVariants$default(shoppingProductDetailsUiState, productDetailsPresentationCopy$default2, null, false, false, false, c0943AIwAaa, shoppingProductDetailsUiState.unconfirmedPriceIds.Aaa(str), shoppingProductDetailsUiState.unavailablePriceIds.Aaa(str), false, null, null, 1822, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductDetailsPresentation withoutRowsAnsweredNoCoupon(ProductDetailsPresentation productDetailsPresentation) {
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.hydrationTarget;
        String str = productDetailsHydrationTarget != null ? productDetailsHydrationTarget.priceCurrency : null;
        Set<String> setKeySet = productDetailsPresentation.couponPrices.keySet();
        HashSet hashSet = new HashSet();
        for (String str2 : setKeySet) {
            String str3 = str2;
            if (!C7384Etj.areEqual(str3, productDetailsPresentation.productId) && this.repository.hasFreshOwnNoCouponResponse(str3, str)) {
                hashSet.add(str2);
            }
        }
        return hashSet.isEmpty() ? productDetailsPresentation : ProductDetailsPresentation.copy$default(productDetailsPresentation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, AGH.A07(hashSet, productDetailsPresentation.couponPrices), null, null, 1879048191, null);
    }

    public final ProductDetailsAnalytics getAnalytics() {
        return this.analytics;
    }

    public final C20Q<Boolean> getBrowserTryOnEligibility() {
        return this.browserTryOnEligibility;
    }

    public final C1BN<Integer> getBuyButtonColor() {
        return this.buyButtonColor;
    }

    public final String getReplyEntityId() {
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.hydrationTarget;
        if (productDetailsHydrationTarget == null || productDetailsHydrationTarget.connectorId != null) {
            return null;
        }
        String str = AEs.A01(this).display.displayProductId;
        return str == null ? productDetailsHydrationTarget.productId : str;
    }

    public final ShoppingResultProduct getSeededCard() {
        return this.seededCard;
    }

    public final C1BN<ShoppingProductDetailsUiState> getUiState() {
        return this.uiState;
    }

    public final boolean getUsesPartnerTemplate() {
        return this.usesPartnerTemplate;
    }

    public final void onAddToCartDismissHandled() {
        ShoppingProductDetailsUiState value;
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, false, false, false, false, false, false, null, false, false, null, null, null, 130559, null)));
    }

    public final void onAddToCartTapped() {
        ShoppingProductDetailsUiState value;
        ShoppingAddToCartTarget shoppingAddToCartTarget = this.addToCartTarget;
        if (shoppingAddToCartTarget != null) {
            ShoppingProductDetailsUiState shoppingProductDetailsUiStateA01 = AEs.A01(this);
            if (shoppingProductDetailsUiStateA01.isAddingToCart) {
                return;
            }
            HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
            HatchSurface hatchSurface = HatchSurface.SHOPPING;
            HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
            HatchComponent hatchComponent = HatchComponent.ADD_TO_CART_BUTTON;
            ProductDetailsAnalytics productDetailsAnalytics = this.analytics;
            String str = productDetailsAnalytics.productId;
            ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiStateA01.presentation;
            hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, productDetailsAnalytics.metadata(productDetailsPresentation.product.url, productDetailsPresentation.productType, C9jH.A00), null);
            BLG<ShoppingProductDetailsUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, false, false, true, false, false, false, null, false, false, null, null, null, 130687, null)));
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(shoppingAddToCartTarget, null), AEu.A00(this));
        }
    }

    public final void onBuyDismissHandled() {
        ShoppingProductDetailsUiState value;
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, false, false, false, false, false, false, null, false, false, null, null, null, 131007, null)));
    }

    public final void onBuyTapped() {
        ShoppingProductDetailsUiState value;
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateWithVariants$default;
        Map<String, String> mapA0c;
        ShoppingProductDetailsUiState value2;
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingProductDetailsUiStateWithVariants$default = ShoppingProductDetailsViewModelKt.withVariants$default(value, null, null, false, false, false, null, null, null, false, null, null, 2047, null);
        } while (!blg.A6e(value, shoppingProductDetailsUiStateWithVariants$default));
        if (shoppingProductDetailsUiStateWithVariants$default.isBuying || !shoppingProductDetailsUiStateWithVariants$default.display.isBuyEnabled) {
            return;
        }
        ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiStateWithVariants$default.presentation;
        String str = productDetailsPresentation.productId;
        String strResolvedProductId = productDetailsPresentation.resolvedProductId(shoppingProductDetailsUiStateWithVariants$default.selections);
        String str2 = strResolvedProductId;
        if (strResolvedProductId == null) {
            str2 = str;
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        HatchComponent hatchComponent = HatchComponent.BUY_BUTTON;
        ProductDetailsAnalytics productDetailsAnalytics = this.analytics;
        String str3 = productDetailsAnalytics.productId;
        ProductDetailsPresentation productDetailsPresentation2 = shoppingProductDetailsUiStateWithVariants$default.presentation;
        String str4 = productDetailsPresentation2.product.url;
        ShoppingProductType shoppingProductType = productDetailsPresentation2.productType;
        if (strResolvedProductId == null || (mapA0c = AnonymousClass007.A0c(HatchMetadataKey.RESOLVED_PRODUCT_ID, strResolvedProductId)) == null) {
            mapA0c = C9jH.A00;
        }
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str3, productDetailsAnalytics.metadata(str4, shoppingProductType, mapA0c), null);
        ShoppingProductType shoppingProductType2 = shoppingProductDetailsUiStateWithVariants$default.presentation.productType;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = shoppingProductType2.ordinal();
        boolean z = true;
        if (iOrdinal != 2) {
            if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 3) {
                throw C3cG.A0q();
            }
            z = false;
        }
        BLG<ShoppingProductDetailsUiState> blg2 = this._uiState;
        do {
            value2 = blg2.getValue();
        } while (!blg2.A6e(value2, ShoppingProductDetailsUiState.copy$default(value2, null, null, null, null, true, false, false, false, false, false, false, null, false, false, null, null, null, 131023, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C137713(z, str2, shoppingProductDetailsUiStateWithVariants$default, null), AEu.A00(this));
    }

    @Override // X.AEs
    public void onCleared() {
        ProductDetailsHydrationTarget productDetailsHydrationTarget = this.pageOpenTarget;
        if (productDetailsHydrationTarget == null || !this.isShown.get()) {
            return;
        }
        signalPageOpenOnce(productDetailsHydrationTarget, A3q.A00);
    }

    public final void onLifecycleStarted() {
        this.lifecycleStarted.set(true);
        applyRefreshActivity();
    }

    public final void onLifecycleStopped() {
        this.lifecycleStarted.set(false);
        applyRefreshActivity();
    }

    public final void onNoticeShown() {
        ShoppingProductDetailsUiState value;
        BLG<ShoppingProductDetailsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ShoppingProductDetailsUiState.copy$default(value, null, null, null, null, false, false, false, false, false, false, false, null, false, false, null, null, null, 129023, null)));
    }

    public final void onPageDisposed() {
        this.pagerSettled.set(false);
        this.lifecycleStarted.set(false);
        applyRefreshActivity();
    }

    public final void onPagerSettled() {
        this.pagerSettled.set(true);
        applyRefreshActivity();
    }

    public final void onPagerUnsettled() {
        this.pagerSettled.set(false);
        applyRefreshActivity();
    }

    public final void onReloadTapped() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SHOPPING, null, HatchScreen.PRODUCT_DETAIL, HatchComponent.RETRY_BUTTON, this.analytics.productId, null, null);
        retry();
    }

    public final void onShown() {
        this.isShown.set(true);
        maybeSignalPageOpen();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void retry() {
        /*
            r25 = this;
            r3 = r25
            com.facebook.aura.shopping.repo.ProductDetailsHydrationTarget r2 = r3.hydrationTarget
            if (r2 == 0) goto L8a
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r4 = X.AEs.A01(r3)
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r1 = r4.hydration
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState.LOADED
            r11 = 0
            if (r1 != r0) goto L2a
            boolean r0 = r4.hasHydrationFailure
            if (r0 != 0) goto L2a
            X.AHG<java.lang.String> r0 = r4.unconfirmedPriceIds
            java.util.Iterator r2 = r0.iterator()
        L1b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8a
            java.lang.String r1 = X.AnonymousClass005.A0j(r2)
            r0 = 1
            r3.refreshCouponPrice(r1, r0)
            goto L1b
        L2a:
            X.BLG<com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState> r4 = r3._uiState
        L2c:
            java.lang.Object r5 = r4.getValue()
            r1 = r5
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r1 = (com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState) r1
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r0 = r1.hydration
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r10 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState.HYDRATING
            if (r0 != r10) goto L48
            r0 = r1
        L3a:
            boolean r0 = r4.A6e(r5, r0)
            if (r0 == 0) goto L2c
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsHydrationState r0 = r1.hydration
            if (r0 == r10) goto L8a
            r3.hydrate(r2)
            return
        L48:
            boolean r0 = com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt.isCatalog(r2)
            if (r0 == 0) goto L55
            boolean r0 = r3.seededCardHasListCoupon()
            r15 = 1
            if (r0 != 0) goto L56
        L55:
            r15 = 0
        L56:
            boolean r16 = com.facebook.aura.shopping.repo.HatchProductDetailsHydrationKt.isCatalog(r2)
            r24 = 2035(0x7f3, float:2.852E-42)
            r7 = 0
            r13 = r7
            r14 = r7
            r17 = r11
            r18 = r7
            r19 = r7
            r20 = r7
            r21 = r11
            r22 = r7
            r23 = r7
            r25 = r7
            r12 = r1
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r6 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModelKt.withVariants$default(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r24 = 129015(0x1f7f7, float:1.80789E-40)
            r8 = r7
            r9 = r7
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r19 = r11
            r20 = r11
            r21 = r7
            com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState r0 = com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L3a
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.retry():void");
    }

    private final void hydrate(ProductDetailsHydrationTarget productDetailsHydrationTarget) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(productDetailsHydrationTarget, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryUnconfirmedDisplayedPrice(boolean z) {
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateA01 = AEs.A01(this);
        String displayedProductId = ShoppingProductDetailsViewModelKt.getDisplayedProductId(shoppingProductDetailsUiStateA01);
        if (!shoppingProductDetailsUiStateA01.unconfirmedPriceIds.contains(displayedProductId) || shoppingProductDetailsUiStateA01.unavailablePriceIds.contains(displayedProductId) || displayedProductId == null) {
            return;
        }
        refreshCouponPrice(displayedProductId, z);
    }

    public static /* synthetic */ void retryUnconfirmedDisplayedPrice$default(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, boolean z, int i, Object obj) {
        shoppingProductDetailsViewModel.retryUnconfirmedDisplayedPrice(AnonymousClass001.A1P(i, z));
    }

    public final void onHeroImageTapped() {
        ShoppingProductDetailsUiState shoppingProductDetailsUiStateA01 = AEs.A01(this);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        HatchComponent hatchComponent = HatchComponent.INLINE_IMAGE;
        ProductDetailsAnalytics productDetailsAnalytics = this.analytics;
        String str = productDetailsAnalytics.productId;
        ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiStateA01.presentation;
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, productDetailsAnalytics.metadata(productDetailsPresentation.product.url, productDetailsPresentation.productType, C9jH.A00), null);
    }

    public final void onSelect(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        InterfaceC0962AJp<String, String> interfaceC0962AJp = AEs.A01(this).selections;
        if (C7384Etj.areEqual(interfaceC0962AJp.get(str), str2)) {
            return;
        }
        resolveSelection(interfaceC0962AJp.AYj(str, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShoppingProductDetailsViewModel(java.lang.String r17, com.facebook.aura.shopping.repo.HatchProductDetailsRepository r18, X.AbstractC3358CGz r19, com.facebook.aura.shopping.repo.HatchShoppingSeedStore r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, com.facebook.aura.shopping.model.ShoppingProductType r26, boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, com.facebook.aura.shopping.model.ShoppingPrimaryAction r33, com.facebook.aura.shopping.model.ShoppingSecondaryAction r34, com.facebook.aura.shopping.model.ShoppingFormat r35, java.lang.String r36, java.lang.String r37, com.facebook.aura.shopping.model.ShoppingResultProduct r38, java.lang.String r39, com.facebook.aura.shopping.model.ShoppingAddToCartTarget r40) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel.<init>(java.lang.String, com.facebook.aura.shopping.repo.HatchProductDetailsRepository, X.CGz, com.facebook.aura.shopping.repo.HatchShoppingSeedStore, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, com.facebook.aura.shopping.model.ShoppingProductType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.shopping.model.ShoppingPrimaryAction, com.facebook.aura.shopping.model.ShoppingSecondaryAction, com.facebook.aura.shopping.model.ShoppingFormat, java.lang.String, java.lang.String, com.facebook.aura.shopping.model.ShoppingResultProduct, java.lang.String, com.facebook.aura.shopping.model.ShoppingAddToCartTarget):void");
    }

    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel$variantRecord$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<ProductDetailsPresentation, ProductDetailsPresentation> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ProductDetailsPresentation invoke2(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return productDetailsPresentation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ ProductDetailsPresentation invoke(ProductDetailsPresentation productDetailsPresentation) {
            C7384Etj.A0Y(productDetailsPresentation, 0);
            return productDetailsPresentation;
        }
    }

    public /* synthetic */ ShoppingProductDetailsViewModel(String str, HatchProductDetailsRepository hatchProductDetailsRepository, AbstractC3358CGz abstractC3358CGz, HatchShoppingSeedStore hatchShoppingSeedStore, String str2, String str3, String str4, String str5, boolean z, ShoppingProductType shoppingProductType, boolean z2, String str6, String str7, String str8, String str9, String str10, ShoppingPrimaryAction shoppingPrimaryAction, ShoppingSecondaryAction shoppingSecondaryAction, ShoppingFormat shoppingFormat, String str11, String str12, ShoppingResultProduct shoppingResultProduct, String str13, ShoppingAddToCartTarget shoppingAddToCartTarget, int i, C06H c06h) {
        this(str, hatchProductDetailsRepository, abstractC3358CGz, hatchShoppingSeedStore, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, str4, str5, z, (i & 512) != 0 ? ShoppingProductType.UNKNOWN : shoppingProductType, C3cG.A1K(i & 1024, z2), (i & 2048) != 0 ? null : str6, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9, (32768 & i) != 0 ? null : str10, (65536 & i) != 0 ? null : shoppingPrimaryAction, (131072 & i) != 0 ? null : shoppingSecondaryAction, (262144 & i) != 0 ? null : shoppingFormat, (524288 & i) != 0 ? null : str11, (1048576 & i) != 0 ? null : str12, (2097152 & i) != 0 ? null : shoppingResultProduct, str13, (i & 8388608) != 0 ? null : shoppingAddToCartTarget);
    }
}
