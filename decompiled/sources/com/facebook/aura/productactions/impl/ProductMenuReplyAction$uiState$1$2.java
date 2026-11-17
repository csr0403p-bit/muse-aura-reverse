package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0W;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductMenuReplyAction$uiState$1$2", f = "ProductMenuReplyAction.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductMenuReplyAction$uiState$1$2 extends AbstractC07127nr implements G0W<ProductMenuActionUiState, Boolean, HtJ<? super ProductMenuActionUiState>, Object> {
    public final /* synthetic */ ProductMenuReplyAction $this_run;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMenuReplyAction$uiState$1$2(ProductMenuReplyAction productMenuReplyAction, HtJ<? super ProductMenuReplyAction$uiState$1$2> htJ) {
        super(3, htJ);
        this.$this_run = productMenuReplyAction;
    }

    public final Object invoke(ProductMenuActionUiState productMenuActionUiState, boolean z, HtJ<? super ProductMenuActionUiState> htJ) {
        ProductMenuReplyAction$uiState$1$2 productMenuReplyAction$uiState$1$2 = new ProductMenuReplyAction$uiState$1$2(this.$this_run, htJ);
        productMenuReplyAction$uiState$1$2.L$0 = productMenuActionUiState;
        productMenuReplyAction$uiState$1$2.Z$0 = z;
        return productMenuReplyAction$uiState$1$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return this.$this_run.row(z, AnonymousClass002.A1X(obj2));
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Object invoke(ProductMenuActionUiState productMenuActionUiState, Boolean bool, HtJ<? super ProductMenuActionUiState> htJ) {
        return invoke(productMenuActionUiState, AnonymousClass001.A1X(bool), htJ);
    }
}
