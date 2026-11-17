package X;

import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.payments.dcp.xapp.controller.init.IapSyncController", f = "IapSyncController.kt", l = {232, 244}, m = "fulfillPurchases", v = 2)
/* renamed from: X.GeQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9712GeQ extends HzP {
    public Object L$0;
    public Object L$1;
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
    public final /* synthetic */ IapSyncController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9712GeQ(IapSyncController iapSyncController, HtJ<? super C9712GeQ> htJ) {
        super(htJ);
        this.this$0 = iapSyncController;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return IapSyncController.A02(this.this$0, null, null, null, this, null);
    }
}
