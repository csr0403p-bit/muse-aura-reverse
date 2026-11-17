package com.facebook.aura.nodes;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nodes.HatchNodeClient", f = "HatchNodeClient.kt", l = {752}, m = "executeCommand$refuseIfStale", v = 2)
/* loaded from: classes3.dex */
public final class HatchNodeClient$executeCommand$refuseIfStale$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HatchNodeClient.executeCommand$refuseIfStale(null, null, null, null, null, null, this);
    }

    public HatchNodeClient$executeCommand$refuseIfStale$1(HtJ<? super HatchNodeClient$executeCommand$refuseIfStale$1> htJ) {
        super(htJ);
    }
}
