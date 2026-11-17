package com.facebook.aura.shopping.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C7384Etj;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.viewmodel.HatchConversationScrollController;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ProductItemsScreenKey;
import com.facebook.aura.shopping.navigation.ProductDetailsNavigationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ProductDetailsSectionsKt$AddToCartDismissEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onHandled;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ boolean $succeeded;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$AddToCartDismissEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            return Boolean.valueOf(auraNavKey instanceof ProductItemsScreenKey);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsSectionsKt$AddToCartDismissEffect$1$1(boolean z, Function0<Unit> function0, AbstractC3358CGz abstractC3358CGz, String str, AuraNavigator auraNavigator) {
        super(1);
        this.$succeeded = z;
        this.$onHandled = function0;
        this.$userSession = abstractC3358CGz;
        this.$sessionId = str;
        this.$navigator = auraNavigator;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$succeeded) {
            this.$onHandled.invoke();
            HatchConversationScrollController companion = HatchConversationScrollController.Companion.getInstance(this.$userSession);
            String str = this.$sessionId;
            if (str == null) {
                str = "primary_session_id";
            }
            companion.requestScrollToBottom(str);
            boolean zIsProductDetailsFromLightbox = ProductDetailsNavigationKt.isProductDetailsFromLightbox(this.$navigator);
            this.$navigator.back();
            ProductDetailsNavigationKt.popLightboxUnder(this.$navigator, zIsProductDetailsFromLightbox);
            this.$navigator.popAll(AnonymousClass1.INSTANCE);
        }
        return new C78g() { // from class: com.facebook.aura.shopping.view.ProductDetailsSectionsKt$AddToCartDismissEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
