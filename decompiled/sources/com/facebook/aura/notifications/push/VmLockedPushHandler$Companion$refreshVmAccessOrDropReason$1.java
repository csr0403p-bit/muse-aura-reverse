package com.facebook.aura.notifications.push;

import X.HtJ;
import X.HzP;
import com.facebook.aura.notifications.push.VmLockedPushHandler;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notifications.push.VmLockedPushHandler$Companion", f = "VmLockedPushHandler.kt", l = {100, 114}, m = "refreshVmAccessOrDropReason", v = 2)
/* loaded from: classes3.dex */
public final class VmLockedPushHandler$Companion$refreshVmAccessOrDropReason$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VmLockedPushHandler.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmLockedPushHandler$Companion$refreshVmAccessOrDropReason$1(VmLockedPushHandler.Companion companion, HtJ<? super VmLockedPushHandler$Companion$refreshVmAccessOrDropReason$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refreshVmAccessOrDropReason(null, null, null, this);
    }
}
