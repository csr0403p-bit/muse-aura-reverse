package X;

import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.payments.dcp.xapp.controller.purchase.IapVerifyPurchaseController;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.controller.purchase.IapVerifyPurchaseController", f = "IapVerifyPurchaseController.kt", l = {81, AuraWaitlistConfettiKt.StandardParticleCount, 116}, m = "verifyWithRetry", v = 2)
/* renamed from: X.GeT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9715GeT extends HzP {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IapVerifyPurchaseController this$0;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return IapVerifyPurchaseController.A00(null, this.this$0, null, null, this, 0, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9715GeT(IapVerifyPurchaseController iapVerifyPurchaseController, HtJ<? super C9715GeT> htJ) {
        super(htJ);
        this.this$0 = iapVerifyPurchaseController;
    }
}
