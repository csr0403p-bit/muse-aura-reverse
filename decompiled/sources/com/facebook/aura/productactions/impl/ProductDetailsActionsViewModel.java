package com.facebook.aura.productactions.impl;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Y;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3pS;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiStateKt;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import com.facebook.aura.conversation.viewmodel.ReplyPrompt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.ResultEventBus;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ProductDetailsNavKey;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.productactions.api.ProductMediaAction;
import com.facebook.aura.productactions.api.ProductMediaActionInput;
import com.facebook.aura.productactions.api.ProductMediaActions;
import com.facebook.aura.shopping.model.ShoppingProductSource;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import com.facebook.aura.shopping.model.ShoppingSaveTarget;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepository;
import com.facebook.aura.shopping.repo.HatchSavedProductsRepositoryKt;
import com.facebook.aura.shopping.viewmodel.ShoppingProductLookupKt;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductDetailsActionsViewModel extends AEs {
    public static final int $stable = 8;
    public final C1BN<ProductDetailsActionsUiState> actionsState;
    public final HatchGatewayConnection gateway;
    public final C1BN<ProductDetailsHeaderContext> headerContexts;
    public final C20Q<AHD<String>> mediaActionIds;
    public final C20Q<ProductMediaActionInput> mediaActionInputs;
    public final List<ProductMediaAction> mediaActions;
    public final BLG<ShoppingResultProduct> products;
    public final ProductSaveAction save;
    public HoC shareJob;
    public final C1BN<ProductDetailsActionsUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$1", f = "ProductDetailsActionsViewModel.kt", l = {160}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ HatchOfflineConversationRepository $repository;
        public final /* synthetic */ ShoppingProductSource $source;
        public int label;
        public final /* synthetic */ ProductDetailsActionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchOfflineConversationRepository hatchOfflineConversationRepository, ProductDetailsActionsViewModel productDetailsActionsViewModel, String str, ShoppingProductSource shoppingProductSource, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$repository = hatchOfflineConversationRepository;
            this.this$0 = productDetailsActionsViewModel;
            this.$hostMessageId = str;
            this.$source = shoppingProductSource;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$repository, this.this$0, this.$hostMessageId, this.$source, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchOfflineConversationRepository hatchOfflineConversationRepository = this.$repository;
                    String str = this.this$0.getHeaderContext().sessionId;
                    if (str == null) {
                        str = "primary_session_id";
                    }
                    String str2 = this.$hostMessageId;
                    ShoppingProductSource shoppingProductSource = this.$source;
                    this.label = 1;
                    obj = ShoppingProductLookupKt.findShoppingProduct(hatchOfflineConversationRepository, str, str2, shoppingProductSource, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                ShoppingResultProduct shoppingResultProduct = (ShoppingResultProduct) obj;
                if (shoppingResultProduct == null) {
                    CFK.A06("ProductDetailsActions", "Shopping reply source was not found");
                }
                this.this$0.products.Af8(shoppingResultProduct);
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0K("ProductDetailsActions", e2, "Failed to load shopping reply source");
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ProductDetailsActionsViewModel> {
        public static final int $stable = 8;
        public final Function0<ProductDetailsActionsPage> page;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ProductDetailsActionsViewModel create() {
            return new ProductDetailsActionsViewModel(this.page.invoke(), HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession), HatchOfflineConversationRepository.Companion.getInstance(this.userSession), this.userSession);
        }

        public Factory(Function0<ProductDetailsActionsPage> function0, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(function0, abstractC3358CGz);
            this.page = function0;
            this.userSession = abstractC3358CGz;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$share$1", f = "ProductDetailsActionsViewModel.kt", l = {231}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$share$1, reason: invalid class name and case insensitive filesystem */
    public final class C134391 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ ProductDetailsHeaderContext $selected;
        public final /* synthetic */ String $url;
        public int label;
        public final /* synthetic */ ProductDetailsActionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134391(Context context, ProductDetailsActionsViewModel productDetailsActionsViewModel, String str, ProductDetailsHeaderContext productDetailsHeaderContext, HtJ<? super C134391> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.this$0 = productDetailsActionsViewModel;
            this.$url = str;
            this.$selected = productDetailsHeaderContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134391(this.$applicationContext, this.this$0, this.$url, this.$selected, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                Context context = this.$applicationContext;
                C7384Etj.A0X(context);
                AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                String str = this.$url;
                ProductDetailsHeaderContext productDetailsHeaderContext = this.$selected;
                String str2 = productDetailsHeaderContext.displayedName;
                String str3 = productDetailsHeaderContext.displayedImageUrl;
                this.label = 1;
                obj = ShoppingProductShareKt.prepareProductShare(context, abstractC3358CGz, str, str2, str3, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            ProductDetailsActionsViewModel productDetailsActionsViewModel = this.this$0;
            Context context2 = this.$applicationContext;
            try {
                productDetailsActionsViewModel.logAction(HatchComponent.SHARE_BUTTON);
                C7384Etj.A0X(context2);
                ((PreparedProductShare) autoCloseable).launch(context2);
                if (autoCloseable != null) {
                    autoCloseable.close();
                }
                return Unit.INSTANCE;
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134391) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final boolean returnToConversation$lambda$0(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return auraNavKey instanceof ProductDetailsNavKey;
    }

    public final void share(Context context) {
        String strValidProductShareUrl;
        C7384Etj.A0Y(context, 0);
        ProductDetailsHeaderContext headerContext = getHeaderContext();
        if (headerContext.actionsEnabled) {
            HoC hoC = this.shareJob;
            if ((hoC == null || !hoC.isActive()) && (strValidProductShareUrl = ProductDetailsActionsViewModelKt.validProductShareUrl(headerContext.websiteUrl)) != null) {
                this.shareJob = AnonymousClass001.A11(new C134391(context.getApplicationContext(), this, strValidProductShareUrl, headerContext, null), AEu.A00(this));
            }
        }
    }

    public final void toggleSave(G0U<? super Boolean, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        ProductSaveAction productSaveAction = this.save;
        if (productSaveAction != null) {
            productSaveAction.toggle(g0u);
        }
    }

    public ProductDetailsActionsViewModel(ProductDetailsActionsPage productDetailsActionsPage, HatchGatewayConnection hatchGatewayConnection, HatchOfflineConversationRepository hatchOfflineConversationRepository, AbstractC3358CGz abstractC3358CGz) {
        C20Q c20q;
        AnonymousClass005.A14(productDetailsActionsPage, hatchGatewayConnection, hatchOfflineConversationRepository, abstractC3358CGz);
        this.gateway = hatchGatewayConnection;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(productDetailsActionsPage.initialContext.seededProduct);
        this.products = c9286GCnA01;
        C20Q<ProductDetailsHeaderContext> c20q2 = productDetailsActionsPage.contexts;
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        C3Pi c3PiA00 = AnonymousClass441.A00(productDetailsActionsPage.initialContext, bllA00, c20q2, c3Ej);
        this.headerContexts = c3PiA00;
        C3Pi c3PiA002 = AnonymousClass441.A00(ProductDetailsActionsViewModelKt.productDetailsActionsState(getHeaderContext(), (ShoppingResultProduct) c9286GCnA01.getValue(), hatchGatewayConnection.getCurrentReplyElementSupport()), AEu.A00(this), C3rb.A01(new ProductDetailsActionsViewModel$actionsState$1(this, null), c3PiA00, c9286GCnA01, hatchGatewayConnection.protocol.replyElementSupport, hatchGatewayConnection.connectionState), c3Ej);
        this.actionsState = c3PiA002;
        this.mediaActionInputs = C3rb.A03(new ProductDetailsActionsViewModel$mediaActionInputs$1(null), productDetailsActionsPage.details, c9286GCnA01);
        this.mediaActions = ProductMediaActions.INSTANCE.all();
        C3pS c3pSA00 = AbstractC05633ui.A00(new ProductDetailsActionsViewModel$special$$inlined$flatMapLatest$1(null, this), GDB.A01(new ProductDetailsActionsViewModel$special$$inlined$map$1(c3PiA002)));
        this.mediaActionIds = c3pSA00;
        ShoppingSaveTarget shoppingSaveTarget = getHeaderContext().saveTarget;
        ProductSaveAction productSaveAction = (shoppingSaveTarget == null || !HatchSavedProductsRepositoryKt.isProductSaveEnabled()) ? null : new ProductSaveAction(AEu.A00(this), shoppingSaveTarget, getHeaderContext().sessionId, getHeaderContext().productId, getHeaderContext().hostMessageId, HatchSavedProductsRepository.Companion.getInstance(abstractC3358CGz));
        this.save = productSaveAction;
        this.uiState = AnonymousClass441.A00(c3PiA002.getValue(), AEu.A00(this), C3rb.A00(new ProductDetailsActionsViewModel$uiState$1(null), c3PiA002, c3pSA00, (productSaveAction == null || (c20q = productSaveAction.isSaved) == null) ? new C20Y(null) : c20q), c3Ej);
        ShoppingProductSource shoppingProductSource = getHeaderContext().source;
        String str = getHeaderContext().hostMessageId;
        if (getHeaderContext().seededProduct != null || shoppingProductSource == null || str == null) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(hatchOfflineConversationRepository, this, str, shoppingProductSource, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProductDetailsHeaderContext getHeaderContext() {
        return this.headerContexts.getValue();
    }

    public static /* synthetic */ void getMediaActionIds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAction(HatchComponent hatchComponent) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.SHOPPING;
        HatchScreen hatchScreen = HatchScreen.PRODUCT_DETAIL;
        String str = getHeaderContext().productId;
        String str2 = getHeaderContext().hostMessageId;
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, str, str2 != null ? AnonymousClass007.A0c(HatchMetadataKey.HOST_MESSAGE_ID, str2) : null, null);
    }

    public final C1BN<ProductDetailsActionsUiState> getUiState() {
        return this.uiState;
    }

    private final ReplyContext currentReplyContext() {
        if (getHeaderContext().actionsEnabled) {
            return ProductDetailsActionsViewModelKt.productDetailsActionsState(getHeaderContext(), this.products.getValue(), this.gateway.getCurrentReplyElementSupport()).replyContext;
        }
        return null;
    }

    private final String getConversationSessionId() {
        String str = getHeaderContext().sessionId;
        return str == null ? "primary_session_id" : str;
    }

    private final void returnToConversation(AuraNavigator auraNavigator) {
        boolean zIsProductDetailsFromLightbox = ProductDetailsNavigationKt.isProductDetailsFromLightbox(auraNavigator);
        auraNavigator.dismissBottomSheetStack(Integer.MAX_VALUE);
        auraNavigator.popAll(new G0U() { // from class: com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                C7384Etj.A0Y(obj, 0);
                return Boolean.valueOf(obj instanceof ProductDetailsNavKey);
            }
        });
        ProductDetailsNavigationKt.popLightboxUnder(auraNavigator, zIsProductDetailsFromLightbox);
        if (auraNavigator.currentKey(true) instanceof ProductItemsScreenKey) {
            auraNavigator.popLast(1);
        }
        if ("primary_session_id".equals(getConversationSessionId())) {
            AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
            ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
            if (C7384Etj.areEqual(auraNavKeyCurrentKey, conversationTabScreenKey)) {
                return;
            }
            auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
        }
    }

    public final void reply(AuraNavigator auraNavigator, ResultEventBus resultEventBus) {
        AnonymousClass003.A0u(auraNavigator, resultEventBus);
        ReplyContext replyContextCurrentReplyContext = currentReplyContext();
        if (replyContextCurrentReplyContext != null) {
            logAction(HatchComponent.REPLY_BUTTON);
            returnToConversation(auraNavigator);
            resultEventBus.sendResult(HatchConversationUiStateKt.replyContextResultKey(getConversationSessionId()), replyContextCurrentReplyContext);
        }
    }

    public final void sendReply(AuraNavigator auraNavigator, ResultEventBus resultEventBus, String str) {
        AnonymousClass005.A0x(auraNavigator, resultEventBus, str);
        ReplyContext replyContextCurrentReplyContext = currentReplyContext();
        if (replyContextCurrentReplyContext != null) {
            returnToConversation(auraNavigator);
            resultEventBus.sendResult(HatchConversationUiStateKt.replyPromptResultKey(getConversationSessionId()), new ReplyPrompt(replyContextCurrentReplyContext, str));
        }
    }
}
