package androidx.work.impl;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C3cG;
import X.C7Bq;
import X.EK9;
import X.EnumC10460Hji;
import X.F3Y;
import X.G2j;
import X.HtJ;
import X.Hwg;
import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", f = "UnfinishedWorkListener.kt", l = {59}, m = "invokeSuspend", v = 1)
/* loaded from: classes5.dex */
public final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends AbstractC07127nr implements G2j<C20Z<? super Boolean>, Throwable, Long, HtJ<? super Boolean>, Object> {
    public /* synthetic */ long J$0;
    public /* synthetic */ Object L$0;
    public int label;

    public UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(HtJ<? super UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1> htJ) {
        super(4, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Throwable th = (Throwable) this.L$0;
            long j = this.J$0;
            EK9.A00();
            Log.e(F3Y.A00, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, 3600000L);
            this.label = 1;
            if (C7Bq.A01(jMin, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }

    @Override // X.G2j
    public final /* bridge */ /* synthetic */ Object invoke(C20Z<? super Boolean> c20z, Throwable th, Long l, HtJ<? super Boolean> htJ) {
        long jA05 = C3cG.A05(l);
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(htJ);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.L$0 = th;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.J$0 = jA05;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(Unit.INSTANCE);
    }
}
