package com.facebook.aura.common.video;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1282AgS;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.C78W;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC6526ECg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class HatchVideoPlayerBackgroundEventProcessor {
    public static final int $stable = 8;
    public final C78T coroutineContext = C78W.A02(new C1282AgS("HatchVideoPlayerBackgroundEventProcessor"), AnonymousClass001.A0y()).plus(new HatchVideoPlayerBackgroundEventProcessor$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key));

    @DebugMetadata(c = "com.facebook.aura.common.video.HatchVideoPlayerBackgroundEventProcessor$executeWithDelay$1", f = "HatchVideoPlayerBackgroundEventProcessor.kt", l = {25}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.common.video.HatchVideoPlayerBackgroundEventProcessor$executeWithDelay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Runnable $command;
        public final /* synthetic */ long $delayMillis;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, Runnable runnable, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$delayMillis = j;
            this.$command = runnable;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$delayMillis, this.$command, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$delayMillis;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.$command.run();
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public void executeWithDelay(long j, Runnable runnable) {
        C7384Etj.A0Y(runnable, 1);
        AnonymousClass001.A1J(new AnonymousClass1(j, runnable, null), Hxb.A02(this.coroutineContext));
    }

    public /* bridge */ InterfaceC6526ECg executeWithDelayAndGetHandle(long j, Runnable runnable) {
        C7384Etj.A0Y(runnable, 2);
        executeWithDelay(j, runnable);
        return null;
    }
}
