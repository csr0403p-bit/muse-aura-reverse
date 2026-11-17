package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C10650I0u;
import X.C1BN;
import X.C20Z;
import X.C3rb;
import X.C60P;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.key.InstacartProductDetailsSheetKey;
import com.facebook.aura.navigation.key.ShoppingProductDetailsPageKey;
import com.facebook.aura.shopping.model.PdpProductInfo;
import com.facebook.aura.shopping.model.ProductDetailsPresentation;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.InstacartProductDetailsViewModel;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsDisplayState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsUiState;
import com.facebook.aura.shopping.viewmodel.ShoppingProductDetailsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public abstract class ProductDetailsActionsPageKt {

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsPageKt$actionsPage$2", f = "ProductDetailsActionsPage.kt", l = {29}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductDetailsActionsPageKt$actionsPage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C20Z<? super Boolean>, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(C20Z<? super Boolean> c20z, HtJ<? super Unit> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.L$0 = c20z;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.L$0 = null;
                this.label = 1;
                if (c20z.emit(null, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsPageKt$actionsPage$3", f = "ProductDetailsActionsPage.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ProductDetailsActionsPageKt$actionsPage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<ShoppingProductDetailsUiState, Boolean, HtJ<? super ProductDetailsPresentation>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public final Object invoke(ShoppingProductDetailsUiState shoppingProductDetailsUiState, Boolean bool, HtJ<? super ProductDetailsPresentation> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = shoppingProductDetailsUiState;
            anonymousClass3.L$1 = bool;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ShoppingProductDetailsUiState shoppingProductDetailsUiState = (ShoppingProductDetailsUiState) this.L$0;
            Boolean bool = (Boolean) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return bool == null ? shoppingProductDetailsUiState.presentation : ProductDetailsPresentation.copy$default(shoppingProductDetailsUiState.presentation, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, bool, 1073741823, null);
        }
    }

    public static final ProductDetailsHeaderContext headerContext(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, ShoppingProductDetailsPageKey shoppingProductDetailsPageKey, ShoppingProductDetailsUiState shoppingProductDetailsUiState) {
        ShoppingProductDetailsDisplayState shoppingProductDetailsDisplayState = shoppingProductDetailsUiState.display;
        String str = shoppingProductDetailsDisplayState.displayProductId;
        if (str == null) {
            str = shoppingProductDetailsUiState.presentation.productId;
        }
        String str2 = shoppingProductDetailsDisplayState.productName;
        String str3 = (String) AbstractC0878AGe.A0G(shoppingProductDetailsDisplayState.imageUrls);
        String replyEntityId = shoppingProductDetailsViewModel.getReplyEntityId();
        ProductDetailsPresentation productDetailsPresentation = shoppingProductDetailsUiState.presentation;
        return new ProductDetailsHeaderContext(str, productDetailsPresentation.product.url, productDetailsPresentation.productType, shoppingProductDetailsPageKey.getSessionId(), shoppingProductDetailsPageKey.getHostMessageId(), shoppingProductDetailsPageKey.getSource(), shoppingProductDetailsViewModel.seededCard, str2, str3, replyEntityId, !shoppingProductDetailsUiState.hasHydrationFailure, shoppingProductDetailsPageKey.saveTarget);
    }

    public static final ProductDetailsActionsPage actionsPage(ShoppingProductDetailsViewModel shoppingProductDetailsViewModel, ShoppingProductDetailsPageKey shoppingProductDetailsPageKey) {
        boolean zA1Y = C60P.A1Y(shoppingProductDetailsViewModel, shoppingProductDetailsPageKey);
        int i = ProductDetailsActionsPage.$stable;
        ProductDetailsHeaderContext productDetailsHeaderContextHeaderContext = headerContext(shoppingProductDetailsViewModel, shoppingProductDetailsPageKey, shoppingProductDetailsViewModel.uiState.getValue());
        C1BN<ShoppingProductDetailsUiState> c1bn = shoppingProductDetailsViewModel.uiState;
        return new ProductDetailsActionsPage(productDetailsHeaderContextHeaderContext, new ProductDetailsActionsPageKt$actionsPage$$inlined$map$1(c1bn, shoppingProductDetailsViewModel, shoppingProductDetailsPageKey), C3rb.A03(new AnonymousClass3(null), c1bn, new C10650I0u(new AnonymousClass2(null), shoppingProductDetailsViewModel.browserTryOnEligibility, zA1Y ? 1 : 0)));
    }

    public static final ProductDetailsActionsPage actionsPage(InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsSheetKey instacartProductDetailsSheetKey) {
        AnonymousClass003.A0u(instacartProductDetailsViewModel, instacartProductDetailsSheetKey);
        int i = ProductDetailsActionsPage.$stable;
        ProductDetailsHeaderContext productDetailsHeaderContextHeaderContext = headerContext(instacartProductDetailsViewModel, instacartProductDetailsSheetKey, instacartProductDetailsViewModel.uiState.getValue());
        C1BN<InstacartProductDetailsUiState> c1bn = instacartProductDetailsViewModel.uiState;
        return new ProductDetailsActionsPage(productDetailsHeaderContextHeaderContext, new ProductDetailsActionsPageKt$actionsPage$$inlined$map$2(c1bn, instacartProductDetailsViewModel, instacartProductDetailsSheetKey), new ProductDetailsActionsPageKt$actionsPage$$inlined$map$3(c1bn));
    }

    public static final ProductDetailsHeaderContext headerContext(InstacartProductDetailsViewModel instacartProductDetailsViewModel, InstacartProductDetailsSheetKey instacartProductDetailsSheetKey, InstacartProductDetailsUiState instacartProductDetailsUiState) {
        int i = ProductDetailsHeaderContext.$stable;
        ProductDetailsPresentation productDetailsPresentation = instacartProductDetailsUiState.presentation;
        String str = productDetailsPresentation.productId;
        PdpProductInfo pdpProductInfo = productDetailsPresentation.product;
        return new ProductDetailsHeaderContext(str, pdpProductInfo.url, productDetailsPresentation.productType, instacartProductDetailsSheetKey.getSessionId(), instacartProductDetailsSheetKey.getHostMessageId(), instacartProductDetailsSheetKey.getSource(), instacartProductDetailsViewModel.seededCard, pdpProductInfo.name, (String) AbstractC0878AGe.A0G(instacartProductDetailsUiState.imageUrls), null, true, null);
    }
}
