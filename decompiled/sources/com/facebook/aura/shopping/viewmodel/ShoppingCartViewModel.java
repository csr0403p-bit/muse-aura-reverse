package com.facebook.aura.shopping.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.analytics.hatch.HatchCheckoutEntryPoint;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchShoppingControl;
import com.facebook.aura.analytics.hatch.HatchShoppingSurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.shopping.model.CurrentShoppingCart;
import com.facebook.aura.shopping.model.ShoppingCart;
import com.facebook.aura.shopping.model.ShoppingCartPresentation;
import com.facebook.aura.shopping.model.ShoppingResultsAttribution;
import com.facebook.aura.shopping.repo.HatchProductDetailsRepository;
import com.facebook.aura.shopping.viewmodel.ShoppingCartRead;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class ShoppingCartViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ShoppingCartUiState> _uiState;
    public final String messageId;
    public final HatchOfflineConversationRepository offlineRepository;
    public final String presentationId;
    public final HatchProductDetailsRepository repository;
    public final String sessionId;
    public final C1BN<ShoppingCartUiState> uiState;
    public final String viewId;
    public final String widgetId;

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$1", f = "ShoppingCartViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingCartViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ShoppingCartViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ShoppingCartViewModel shoppingCartViewModel = ShoppingCartViewModel.this;
                this.label = 1;
                if (shoppingCartViewModel.loadSavedCart(this) == enumC10460Hji) {
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

    public final class Factory extends AuraViewModelFactory<ShoppingCartViewModel> {
        public static final int $stable = 8;
        public final String messageId;
        public final String presentationId;
        public final String sessionId;
        public final AbstractC3358CGz userSession;
        public final String widgetId;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ShoppingCartViewModel create() {
            return new ShoppingCartViewModel(this.sessionId, this.messageId, this.presentationId, this.widgetId, HatchProductDetailsRepository.Companion.getInstance(this.userSession), HatchOfflineConversationRepository.Companion.getInstance(this.userSession));
        }

        public Factory(String str, String str2, String str3, String str4, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0x(str2, str3);
            C7384Etj.A0Y(abstractC3358CGz, 4);
            this.messageId = str2;
            this.presentationId = str3;
            this.widgetId = str4;
            this.userSession = abstractC3358CGz;
            this.sessionId = str == null ? "primary_session_id" : str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel", f = "ShoppingCartViewModel.kt", l = {166}, m = "loadSavedCart", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$loadSavedCart$1, reason: invalid class name and case insensitive filesystem */
    public final class C137691 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C137691(HtJ<? super C137691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ShoppingCartViewModel.this.loadSavedCart(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$onCheckout$2", f = "ShoppingCartViewModel.kt", l = {99}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$onCheckout$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $clientInteractionId;
        public final /* synthetic */ CurrentShoppingCart $current;
        public final /* synthetic */ String $savedWidgetId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, CurrentShoppingCart currentShoppingCart, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$savedWidgetId = str;
            this.$current = currentShoppingCart;
            this.$clientInteractionId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingCartViewModel.this.new AnonymousClass2(this.$savedWidgetId, this.$current, this.$clientInteractionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ShoppingCartUiState value;
            ShoppingCartUiState shoppingCartUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ShoppingCartViewModel shoppingCartViewModel = ShoppingCartViewModel.this;
                HatchProductDetailsRepository hatchProductDetailsRepository = shoppingCartViewModel.repository;
                String str = this.$savedWidgetId;
                CurrentShoppingCart currentShoppingCart = this.$current;
                String str2 = shoppingCartViewModel.sessionId;
                if ("primary_session_id".equals(str2)) {
                    str2 = null;
                }
                String str3 = this.$clientInteractionId;
                this.label = 1;
                obj = hatchProductDetailsRepository.recordCartCheckout(str, currentShoppingCart, str2, str3, this);
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
            BLG<ShoppingCartUiState> blg = ShoppingCartViewModel.this._uiState;
            do {
                value = blg.getValue();
                shoppingCartUiState = value;
            } while (!blg.A6e(value, shoppingCartUiState.copy(shoppingCartUiState.saved, shoppingCartUiState.read, false, !zA1X, zA1X)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$readCurrentCart$1", f = "ShoppingCartViewModel.kt", l = {151, 153}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$readCurrentCart$1, reason: invalid class name and case insensitive filesystem */
    public final class C137701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C137701(HtJ<? super C137701> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ShoppingCartViewModel.this.new C137701(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ShoppingCartViewModel.this.new C137701(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L47
                if (r0 == r3) goto L5e
                if (r0 != r4) goto L83
                java.lang.Object r1 = r8.L$0
                com.facebook.aura.shopping.model.CurrentShoppingCart r1 = (com.facebook.aura.shopping.model.CurrentShoppingCart) r1
                X.Hwg.A00(r9)
            L13:
                com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.this
                X.BLG<com.facebook.aura.shopping.viewmodel.ShoppingCartUiState> r3 = r0._uiState
            L17:
                java.lang.Object r2 = r3.getValue()
                r4 = r2
                com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r4 = (com.facebook.aura.shopping.viewmodel.ShoppingCartUiState) r4
                if (r1 == 0) goto L40
                com.facebook.aura.shopping.viewmodel.ShoppingCartNavTitle r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModelKt.navTitle(r1)
                com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Loaded r6 = new com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Loaded
                r6.<init>(r1, r0)
            L29:
                com.facebook.aura.shopping.viewmodel.ShoppingCartRead r6 = (com.facebook.aura.shopping.viewmodel.ShoppingCartRead) r6
                com.facebook.aura.shopping.model.ShoppingCartPresentation r5 = r4.saved
                boolean r7 = r4.isCheckingOut
                boolean r8 = r4.checkoutFailed
                boolean r9 = r4.checkoutSucceeded
                com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r0 = r4.copy(r5, r6, r7, r8, r9)
                boolean r0 = r3.A6e(r2, r0)
                if (r0 == 0) goto L17
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L40:
                r0 = 0
                com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Failed r6 = new com.facebook.aura.shopping.viewmodel.ShoppingCartRead$Failed
                r6.<init>(r0)
                goto L29
            L47:
                X.Hwg.A00(r9)
                com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.this
                java.lang.String r2 = r0.widgetId
                if (r2 == 0) goto L67
                com.facebook.aura.shopping.repo.HatchProductDetailsRepository r1 = r0.repository
                r0 = 0
                r8.L$0 = r0
                r8.label = r3
                java.lang.Object r9 = r1.fetchCurrentCart(r2, r8)
                if (r9 != r5) goto L61
                return r5
            L5e:
                X.Hwg.A00(r9)
            L61:
                r1 = r9
                com.facebook.aura.shopping.model.CurrentShoppingCart r1 = (com.facebook.aura.shopping.model.CurrentShoppingCart) r1
                if (r1 != 0) goto L13
                goto L68
            L67:
                r1 = 0
            L68:
                com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.this
                X.BLG<com.facebook.aura.shopping.viewmodel.ShoppingCartUiState> r0 = r0._uiState
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r0 = (com.facebook.aura.shopping.viewmodel.ShoppingCartUiState) r0
                com.facebook.aura.shopping.model.ShoppingCartPresentation r0 = r0.saved
                if (r0 != 0) goto L13
                com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.this
                r8.L$0 = r1
                r8.label = r4
                java.lang.Object r0 = com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.access$loadSavedCart(r0, r8)
                if (r0 != r5) goto L13
                return r5
            L83:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.C137701.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ShoppingCartViewModel(String str, String str2, String str3, String str4, HatchProductDetailsRepository hatchProductDetailsRepository, HatchOfflineConversationRepository hatchOfflineConversationRepository) {
        AnonymousClass005.A10(str, str2, str3);
        AnonymousClass003.A0y(hatchProductDetailsRepository, hatchOfflineConversationRepository);
        this.sessionId = str;
        this.messageId = str2;
        this.presentationId = str3;
        this.widgetId = str4;
        this.repository = hatchProductDetailsRepository;
        this.offlineRepository = hatchOfflineConversationRepository;
        C9286GCn c9286GCnA14 = C3cG.A14(new ShoppingCartUiState(null, ShoppingCartRead.Loading.INSTANCE, false, false, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.viewId = AnonymousClass002.A0k();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
        readCurrentCart();
    }

    public final ShoppingCheckoutLogContext checkoutLogContext(ShoppingCartUiState shoppingCartUiState) {
        ShoppingCart shoppingCart;
        ShoppingResultsAttribution shoppingResultsAttribution;
        ShoppingCartRead.Loaded loaded;
        CurrentShoppingCart currentShoppingCart;
        ShoppingCart shoppingCart2;
        ShoppingResultsAttribution shoppingResultsAttribution2;
        String str;
        C7384Etj.A0Y(shoppingCartUiState, 0);
        HatchShoppingSurface hatchShoppingSurface = HatchShoppingSurface.CART_PANEL;
        HatchScreen hatchScreen = HatchScreen.SHOPPING_CART;
        String str2 = this.viewId;
        String str3 = this.widgetId;
        String str4 = this.messageId;
        ShoppingCartRead shoppingCartRead = shoppingCartUiState.read;
        String str5 = null;
        if (!(shoppingCartRead instanceof ShoppingCartRead.Loaded) || (loaded = (ShoppingCartRead.Loaded) shoppingCartRead) == null || (currentShoppingCart = loaded.current) == null || (shoppingCart2 = currentShoppingCart.cart) == null || (shoppingResultsAttribution2 = shoppingCart2.attribution) == null || (str = shoppingResultsAttribution2.provider) == null) {
            ShoppingCartPresentation shoppingCartPresentation = shoppingCartUiState.saved;
            if (shoppingCartPresentation != null && (shoppingCart = shoppingCartPresentation.cart) != null && (shoppingResultsAttribution = shoppingCart.attribution) != null) {
                str5 = shoppingResultsAttribution.provider;
            }
        } else {
            str5 = str;
        }
        return new ShoppingCheckoutLogContext(hatchShoppingSurface, hatchScreen, str2, str3, str4, str5, null, null);
    }

    public final void onCheckout() {
        ShoppingCartRead.Loaded loaded;
        CurrentShoppingCart currentShoppingCart;
        String str;
        ShoppingCartUiState value;
        ShoppingCartUiState shoppingCartUiState;
        ShoppingCartUiState value2 = this._uiState.getValue();
        if (value2.isCheckingOut || value2.checkoutSucceeded) {
            return;
        }
        ShoppingCartRead shoppingCartRead = value2.read;
        if (!(shoppingCartRead instanceof ShoppingCartRead.Loaded) || (loaded = (ShoppingCartRead.Loaded) shoppingCartRead) == null || (currentShoppingCart = loaded.current) == null || currentShoppingCart.checkoutLabel == null || (str = this.widgetId) == null) {
            return;
        }
        String strA0k = AnonymousClass002.A0k();
        ShoppingCheckoutLoggingKt.logActionClick(checkoutLogContext(value2), HatchShoppingControl.CART_REQUEST_CHECKOUT, strA0k, HatchCheckoutEntryPoint.CART_ASSISTANT_BUTTON);
        BLG<ShoppingCartUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingCartUiState = value;
        } while (!blg.A6e(value, shoppingCartUiState.copy(shoppingCartUiState.saved, shoppingCartUiState.read, true, false, shoppingCartUiState.checkoutSucceeded)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(str, currentShoppingCart, strA0k, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadSavedCart(X.HtJ<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.C137691
            if (r0 == 0) goto L56
            r6 = r11
            com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$loadSavedCart$1 r6 = (com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.C137691) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r7 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L42
            if (r0 != r4) goto L5c
            X.Hwg.A00(r7)
        L20:
            com.facebook.aura.shopping.model.ShoppingCartPresentation r7 = (com.facebook.aura.shopping.model.ShoppingCartPresentation) r7
            if (r7 == 0) goto L3f
            X.BLG<com.facebook.aura.shopping.viewmodel.ShoppingCartUiState> r2 = r10._uiState
        L26:
            java.lang.Object r1 = r2.getValue()
            r6 = r1
            com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r6 = (com.facebook.aura.shopping.viewmodel.ShoppingCartUiState) r6
            com.facebook.aura.shopping.viewmodel.ShoppingCartRead r8 = r6.read
            boolean r9 = r6.isCheckingOut
            boolean r10 = r6.checkoutFailed
            boolean r11 = r6.checkoutSucceeded
            com.facebook.aura.shopping.viewmodel.ShoppingCartUiState r0 = r6.copy(r7, r8, r9, r10, r11)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L26
        L3f:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L42:
            X.Hwg.A00(r7)
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r3 = r10.offlineRepository
            java.lang.String r2 = r10.sessionId
            java.lang.String r1 = r10.messageId
            java.lang.String r0 = r10.presentationId
            r6.label = r4
            java.lang.Object r7 = com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt.findShoppingCart(r3, r2, r1, r0, r6)
            if (r7 != r5) goto L20
            return r5
        L56:
            com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$loadSavedCart$1 r6 = new com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel$loadSavedCart$1
            r6.<init>(r11)
            goto L12
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.viewmodel.ShoppingCartViewModel.loadSavedCart(X.HtJ):java.lang.Object");
    }

    private final void logRetryClick() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.SHOPPING_CART;
        HatchComponent hatchComponent = HatchComponent.RETRY_BUTTON;
        ShoppingCheckoutLogContext shoppingCheckoutLogContextCheckoutLogContext = checkoutLogContext(this._uiState.getValue());
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, ShoppingCheckoutLoggingKt.metadata(shoppingCheckoutLogContextCheckoutLogContext, null, null, null, shoppingCheckoutLogContextCheckoutLogContext.checkoutFlowId, shoppingCheckoutLogContextCheckoutLogContext.checkoutEntryPoint), null);
    }

    public final C1BN<ShoppingCartUiState> getUiState() {
        return this.uiState;
    }

    public final void onCheckoutDismissHandled() {
        ShoppingCartUiState value;
        ShoppingCartUiState shoppingCartUiState;
        BLG<ShoppingCartUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingCartUiState = value;
        } while (!blg.A6e(value, shoppingCartUiState.copy(shoppingCartUiState.saved, shoppingCartUiState.read, shoppingCartUiState.isCheckingOut, shoppingCartUiState.checkoutFailed, false)));
    }

    public final void onOpenProviderCart() {
        ShoppingCheckoutLoggingKt.logActionClick(checkoutLogContext(this._uiState.getValue()), HatchShoppingControl.CART_PROVIDER_LINK, AnonymousClass002.A0k(), HatchCheckoutEntryPoint.CART_PROVIDER_LINK);
    }

    public final void onRetry() {
        ShoppingCartUiState value;
        ShoppingCartUiState shoppingCartUiState;
        ShoppingCartRead shoppingCartRead = this._uiState.getValue().read;
        if (!(shoppingCartRead instanceof ShoppingCartRead.Failed) || ((ShoppingCartRead.Failed) shoppingCartRead).isRetrying) {
            return;
        }
        logRetryClick();
        BLG<ShoppingCartUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            shoppingCartUiState = value;
        } while (!blg.A6e(value, shoppingCartUiState.copy(shoppingCartUiState.saved, new ShoppingCartRead.Failed(true), shoppingCartUiState.isCheckingOut, shoppingCartUiState.checkoutFailed, shoppingCartUiState.checkoutSucceeded)));
        readCurrentCart();
    }

    private final void readCurrentCart() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C137701(null), AEu.A00(this));
    }
}
