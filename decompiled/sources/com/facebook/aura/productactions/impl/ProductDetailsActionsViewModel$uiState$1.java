package com.facebook.aura.productactions.impl;

import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductDetailsActionsViewModel$uiState$1", f = "ProductDetailsActionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductDetailsActionsViewModel$uiState$1 extends AbstractC07127nr implements G2j<ProductDetailsActionsUiState, AHD<? extends String>, Boolean, HtJ<? super ProductDetailsActionsUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public ProductDetailsActionsViewModel$uiState$1(HtJ<? super ProductDetailsActionsViewModel$uiState$1> htJ) {
        super(4, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProductDetailsActionsUiState productDetailsActionsUiState, AHD<String> ahd, Boolean bool, HtJ<? super ProductDetailsActionsUiState> htJ) {
        ProductDetailsActionsViewModel$uiState$1 productDetailsActionsViewModel$uiState$1 = new ProductDetailsActionsViewModel$uiState$1(htJ);
        productDetailsActionsViewModel$uiState$1.L$0 = productDetailsActionsUiState;
        productDetailsActionsViewModel$uiState$1.L$1 = ahd;
        productDetailsActionsViewModel$uiState$1.L$2 = bool;
        return productDetailsActionsViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ProductDetailsActionsUiState productDetailsActionsUiState = (ProductDetailsActionsUiState) this.L$0;
        AHD<String> ahd = (AHD) this.L$1;
        Boolean bool = (Boolean) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return productDetailsActionsUiState.copy(productDetailsActionsUiState.replyContext, productDetailsActionsUiState.shareUrl, productDetailsActionsUiState.actionsEnabled, productDetailsActionsUiState.productId, productDetailsActionsUiState.mediaAnalyticsMetadata, ahd, bool);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(ProductDetailsActionsUiState productDetailsActionsUiState, AHD<? extends String> ahd, Boolean bool, HtJ<? super ProductDetailsActionsUiState> htJ) {
        return invoke2(productDetailsActionsUiState, (AHD<String>) ahd, bool, htJ);
    }
}
