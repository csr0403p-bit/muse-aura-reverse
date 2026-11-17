package com.facebook.aura.localbrowser;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$retentionWatch$1", f = "LocalBrowserEndpoint.kt", l = {903}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class LocalBrowserTask$retentionWatch$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public long J$0;
    public int label;
    public final /* synthetic */ LocalBrowserTask this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTask$retentionWatch$1$1", f = "LocalBrowserEndpoint.kt", l = {891}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTask$retentionWatch$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;
        public final /* synthetic */ LocalBrowserTask this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LocalBrowserTask localBrowserTask, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.this$0 = localBrowserTask;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LocalBrowserTask localBrowserTask = this.this$0;
                LocalBrowserTaskOutcome localBrowserTaskOutcome = LocalBrowserTaskOutcome.ABANDONED;
                this.label = 1;
                if (localBrowserTask.retire(localBrowserTaskOutcome, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserTask$retentionWatch$1(LocalBrowserTask localBrowserTask, HtJ<? super LocalBrowserTask$retentionWatch$1> htJ) {
        super(2, htJ);
        this.this$0 = localBrowserTask;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LocalBrowserTask$retentionWatch$1(this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i != 0 && i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        do {
            if (!this.this$0.retired) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean zIsCurrent = this.this$0.isCurrent();
                LocalBrowserTask localBrowserTask = this.this$0;
                if (zIsCurrent) {
                    localBrowserTask.disconnectedAtMs = null;
                    if (localBrowserTask.isAbandoned()) {
                        LocalBrowserTask localBrowserTask2 = this.this$0;
                        AnonymousClass001.A1J(new AnonymousClass1(localBrowserTask2, null), localBrowserTask2.lifecycleScope);
                    }
                    this.J$0 = jElapsedRealtime;
                    this.label = 1;
                } else {
                    Long l = localBrowserTask.disconnectedAtMs;
                    if (l == null) {
                        localBrowserTask.disconnectedAtMs = C3cG.A0S(jElapsedRealtime);
                    } else if (jElapsedRealtime - l.longValue() >= LocalBrowserTask.DISCONNECT_GRACE_MS) {
                        localBrowserTask.interrupt(LocalBrowserTaskOutcome.IDLE);
                    }
                    this.J$0 = jElapsedRealtime;
                    this.label = 1;
                }
            }
            return Unit.INSTANCE;
        } while (C7Bq.A01(10000L, this) != enumC10460Hji);
        return enumC10460Hji;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new LocalBrowserTask$retentionWatch$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
