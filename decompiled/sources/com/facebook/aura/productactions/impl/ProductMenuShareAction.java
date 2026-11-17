package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.shopping.model.ShoppingResultProduct;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class ProductMenuShareAction implements ProductMenuAction {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<ProductMenuActionUiState> _uiState;
    public final ConversationItemActionContext context;
    public final ProductMenuActionId id;
    public final C3UX scope;
    public HoC shareJob;
    public final C1BN<ProductMenuActionUiState> uiState;
    public final String url;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductMenuShareAction$perform$2", f = "ProductMenuShareAction.kt", l = {R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductMenuShareAction$perform$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ ProductMenuActionHost $host;
        public int label;
        public final /* synthetic */ ProductMenuShareAction this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, ProductMenuShareAction productMenuShareAction, ProductMenuActionHost productMenuActionHost, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.this$0 = productMenuShareAction;
            this.$host = productMenuActionHost;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$applicationContext, this.this$0, this.$host, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ProductMenuActionUiState value;
            ProductMenuActionUiState productMenuActionUiState;
            ProductMenuActionUiState value2;
            ProductMenuActionUiState productMenuActionUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    Context context = this.$applicationContext;
                    C7384Etj.A0X(context);
                    ProductMenuShareAction productMenuShareAction = this.this$0;
                    AbstractC3358CGz abstractC3358CGz = productMenuShareAction.userSession;
                    String str = productMenuShareAction.url;
                    ShoppingResultProduct shoppingResultProduct = productMenuShareAction.context.product;
                    String str2 = shoppingResultProduct.name;
                    String str3 = shoppingResultProduct.imageUrl;
                    if (!shoppingResultProduct.isImageAvailable || shoppingResultProduct.isUnavailable) {
                        str3 = null;
                    }
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
                ProductMenuActionHost productMenuActionHost = this.$host;
                ProductMenuShareAction productMenuShareAction2 = this.this$0;
                Context context2 = this.$applicationContext;
                try {
                    productMenuActionHost.dismiss.invoke();
                    ShoppingConversationItemActionsKt.logItem(productMenuShareAction2.context, HatchComponent.SHARE_BUTTON, false);
                    C7384Etj.A0X(context2);
                    ((PreparedProductShare) autoCloseable).launch(context2);
                    if (autoCloseable != null) {
                        autoCloseable.close();
                    }
                    BLG<ProductMenuActionUiState> blg = this.this$0._uiState;
                    do {
                        value2 = blg.getValue();
                        productMenuActionUiState2 = value2;
                    } while (!blg.A6e(value2, productMenuActionUiState2.copy(productMenuActionUiState2.id, productMenuActionUiState2.label, productMenuActionUiState2.icon, productMenuActionUiState2.enabled, false)));
                    return Unit.INSTANCE;
                } finally {
                }
            } catch (Throwable th) {
                BLG<ProductMenuActionUiState> blg2 = this.this$0._uiState;
                do {
                    value = blg2.getValue();
                    productMenuActionUiState = value;
                } while (!blg2.A6e(value, productMenuActionUiState.copy(productMenuActionUiState.id, productMenuActionUiState.label, productMenuActionUiState.icon, productMenuActionUiState.enabled, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public void perform(ProductMenuActionHost productMenuActionHost) {
        ProductMenuActionUiState value;
        ProductMenuActionUiState productMenuActionUiState;
        C7384Etj.A0Y(productMenuActionHost, 0);
        HoC hoC = this.shareJob;
        if (hoC == null || !hoC.isActive()) {
            Context applicationContext = productMenuActionHost.androidContext.getApplicationContext();
            BLG<ProductMenuActionUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                productMenuActionUiState = value;
            } while (!blg.A6e(value, productMenuActionUiState.copy(productMenuActionUiState.id, productMenuActionUiState.label, productMenuActionUiState.icon, productMenuActionUiState.enabled, true)));
            this.shareJob = AnonymousClass001.A11(new AnonymousClass2(applicationContext, this, productMenuActionHost, null), this.scope);
        }
    }

    public final class Companion {
        public final ProductMenuShareAction create(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
            AnonymousClass005.A0x(conversationItemActionContext, abstractC3358CGz, c3ux);
            String strValidProductShareUrl = ProductDetailsActionsViewModelKt.validProductShareUrl(conversationItemActionContext.product.url);
            if (strValidProductShareUrl != null) {
                return new ProductMenuShareAction(conversationItemActionContext, abstractC3358CGz, strValidProductShareUrl, c3ux);
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public ProductMenuActionId getId() {
        return this.id;
    }

    @Override // com.facebook.aura.productactions.impl.ProductMenuAction
    public C1BN<ProductMenuActionUiState> getUiState() {
        return this.uiState;
    }

    public ProductMenuShareAction(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz, String str, C3UX c3ux) {
        this.context = conversationItemActionContext;
        this.userSession = abstractC3358CGz;
        this.url = str;
        this.scope = c3ux;
        this.id = ProductMenuActionId.SHARE;
        C9286GCn c9286GCnA14 = C3cG.A14(new ProductMenuActionUiState(getId(), com.facebook.aura.R.string._name_removed__res_0x7f120571, com.facebook.aura.R.drawable.arrow_share_wght400_outline_24, true, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3Pi.A00(c9286GCnA14);
    }

    public /* synthetic */ ProductMenuShareAction(ConversationItemActionContext conversationItemActionContext, AbstractC3358CGz abstractC3358CGz, String str, C3UX c3ux, C06H c06h) {
        this(conversationItemActionContext, abstractC3358CGz, str, c3ux);
    }
}
