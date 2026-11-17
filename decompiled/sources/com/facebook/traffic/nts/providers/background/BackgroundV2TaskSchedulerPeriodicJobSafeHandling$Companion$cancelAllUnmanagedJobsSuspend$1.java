package com.facebook.traffic.nts.providers.background;

import X.HtJ;
import X.HzP;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion", f = "BackgroundV2TaskSchedulerPeriodicJobSafeHandling.kt", l = {81, 84, 89}, m = "cancelAllUnmanagedJobsSuspend", v = 2)
/* loaded from: classes3.dex */
public final class BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$cancelAllUnmanagedJobsSuspend$1 extends HzP {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$cancelAllUnmanagedJobsSuspend$1(BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion companion, HtJ<? super BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$cancelAllUnmanagedJobsSuspend$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cancelAllUnmanagedJobsSuspend(null, null, this);
    }
}
