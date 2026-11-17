package com.facebook.aura.common.ble;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.common.ble.AuraBleConnectionImpl", f = "AuraBleConnectionImpl.kt", l = {289}, m = "triggerServiceDiscovery-IoAF18A", v = 2)
/* loaded from: classes4.dex */
public final class AuraBleConnectionImpl$triggerServiceDiscovery$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraBleConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBleConnectionImpl$triggerServiceDiscovery$1(AuraBleConnectionImpl auraBleConnectionImpl, HtJ<? super AuraBleConnectionImpl$triggerServiceDiscovery$1> htJ) {
        super(htJ);
        this.this$0 = auraBleConnectionImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.mo364triggerServiceDiscoveryIoAF18A(this));
    }
}
