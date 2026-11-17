package com.facebook.traffic.nts.providers.background;

import X.HtJ;
import X.HzP;
import com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion", f = "BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.kt", l = {236}, m = "awaitOnBackgroundTaskSchedulerImplFutureValue", v = 2)
/* loaded from: classes3.dex */
public final class BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1 extends HzP {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1(BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.Companion companion, HtJ<? super BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic$Companion$awaitOnBackgroundTaskSchedulerImplFutureValue$1> htJ) {
        super(htJ);
        this.this$0 = companion;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitOnBackgroundTaskSchedulerImplFutureValue(this);
    }
}
