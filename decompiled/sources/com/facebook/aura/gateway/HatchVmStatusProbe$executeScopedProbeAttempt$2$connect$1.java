package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchVmStatusProbe;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2", f = "HatchVmStatusProbe.kt", l = {227}, m = "connect", v = 2)
/* loaded from: classes5.dex */
public final class HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1 extends HzP {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchVmStatusProbe.AnonymousClass2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1(HatchVmStatusProbe.AnonymousClass2 anonymousClass2, HtJ<? super HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1> htJ) {
        super(htJ);
        this.this$0 = anonymousClass2;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.connect(null, this);
    }
}
