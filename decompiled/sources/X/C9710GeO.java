package X;

import com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController", f = "IapPaymentController.kt", l = {211}, m = "launchBillingFlow", v = 2)
/* renamed from: X.GeO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9710GeO extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$10;
    public Object L$11;
    public Object L$12;
    public Object L$13;
    public Object L$14;
    public Object L$15;
    public Object L$16;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ IapPaymentController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9710GeO(IapPaymentController iapPaymentController, HtJ<? super C9710GeO> htJ) {
        super(htJ);
        this.this$0 = iapPaymentController;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return IapPaymentController.A00(null, null, this.this$0, null, this);
    }
}
