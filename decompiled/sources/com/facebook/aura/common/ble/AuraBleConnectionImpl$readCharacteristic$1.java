package com.facebook.aura.common.ble;

import X.AnonymousClass006;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.common.ble.AuraBleConnectionImpl", f = "AuraBleConnectionImpl.kt", l = {463, 414}, m = "readCharacteristic-0E7RQCE", v = 2)
/* loaded from: classes4.dex */
public final class AuraBleConnectionImpl$readCharacteristic$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AuraBleConnectionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraBleConnectionImpl$readCharacteristic$1(AuraBleConnectionImpl auraBleConnectionImpl, HtJ<? super AuraBleConnectionImpl$readCharacteristic$1> htJ) {
        super(htJ);
        this.this$0 = auraBleConnectionImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AnonymousClass006.A0m(this.this$0.mo362readCharacteristic0E7RQCE(null, null, this));
    }
}
