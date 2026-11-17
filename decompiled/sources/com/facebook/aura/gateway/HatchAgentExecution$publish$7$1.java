package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.gateway.HatchAgentExecution$publish$7$1", f = "HatchAgentExecution.kt", l = {223}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchAgentExecution$publish$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $it;
    public int label;
    public final /* synthetic */ HatchAgentExecution this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAgentExecution$publish$7$1(long j, HatchAgentExecution hatchAgentExecution, HtJ<? super HatchAgentExecution$publish$7$1> htJ) {
        super(2, htJ);
        this.$it = j;
        this.this$0 = hatchAgentExecution;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAgentExecution$publish$7$1(this.$it, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long jElapsedRealtime = this.$it - SystemClock.elapsedRealtime();
            if (jElapsedRealtime < 1) {
                jElapsedRealtime = 1;
            }
            this.label = 1;
            if (C7Bq.A01(jElapsedRealtime, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        HatchAgentExecution hatchAgentExecution = this.this$0;
        synchronized (hatchAgentExecution) {
            hatchAgentExecution.publish();
            unit = Unit.INSTANCE;
        }
        return unit;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAgentExecution$publish$7$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
