package com.facebook.aura.status.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C00s;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1", f = "ActivityGoalBottomSheetComponent.kt", l = {935}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $baseCurrentTimeMillis;
    public final /* synthetic */ long $baseElapsedRealtime;
    public final /* synthetic */ C00s $elapsedRealtimeMillis$delegate;
    public final /* synthetic */ boolean $isRunning;
    public long J$0;
    public long J$1;
    public long J$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1(boolean z, long j, long j2, C00s c00s, HtJ<? super ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1> htJ) {
        super(2, htJ);
        this.$isRunning = z;
        this.$baseCurrentTimeMillis = j;
        this.$baseElapsedRealtime = j2;
        this.$elapsedRealtimeMillis$delegate = c00s;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1(this.$isRunning, this.$baseCurrentTimeMillis, this.$baseElapsedRealtime, this.$elapsedRealtimeMillis$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        long j;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            this.$elapsedRealtimeMillis$delegate.Adh(SystemClock.elapsedRealtime());
            if (!this.$isRunning) {
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        do {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.$elapsedRealtimeMillis$delegate.Adh(jElapsedRealtime);
            long j2 = this.$baseCurrentTimeMillis + (jElapsedRealtime - this.$baseElapsedRealtime);
            j = 1000 - (j2 % 1000);
            this.J$0 = jElapsedRealtime;
            this.J$1 = j2;
            this.J$2 = j;
            this.label = 1;
        } while (C7Bq.A01(j, this) != enumC10460Hji);
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
