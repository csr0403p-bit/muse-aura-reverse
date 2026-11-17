package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0W;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.model.ReplyElementSupport;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ProductMenuReplyAction$uiState$1$1", f = "ProductMenuReplyAction.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class ProductMenuReplyAction$uiState$1$1 extends AbstractC07127nr implements G0W<ReplyElementSupport, HatchGatewayConnectionState, HtJ<? super Boolean>, Object> {
    public final /* synthetic */ ProductMenuReplyAction $this_run;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductMenuReplyAction$uiState$1$1(ProductMenuReplyAction productMenuReplyAction, HtJ<? super ProductMenuReplyAction$uiState$1$1> htJ) {
        super(3, htJ);
        this.$this_run = productMenuReplyAction;
    }

    @Override // X.G0W
    public final Object invoke(ReplyElementSupport replyElementSupport, HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Boolean> htJ) {
        return new ProductMenuReplyAction$uiState$1$1(this.$this_run, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return Boolean.valueOf(AnonymousClass002.A1X(this.$this_run.currentReply()));
    }
}
