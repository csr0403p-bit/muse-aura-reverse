package com.facebook.aura.gateway;

import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.HatchPauseOperations;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$Companion", f = "HatchPauseOperations.kt", l = {199}, m = "statusInternal", v = 2)
/* loaded from: classes4.dex */
public final class HatchPauseOperations$Companion$statusInternal$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ HatchPauseOperations.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPauseOperations$Companion$statusInternal$1(HatchPauseOperations.Companion companion, HtJ<? super HatchPauseOperations$Companion$statusInternal$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.statusInternal(null, null, this);
    }
}
