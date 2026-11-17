package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$queueRelease$1$1$1", f = "BrowserViewerSession.kt", l = {647}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$queueRelease$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $generation;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$queueRelease$1$1$1(long j, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$queueRelease$1$1$1> htJ) {
        super(2, htJ);
        this.$generation = j;
        this.this$0 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserViewerSession$queueRelease$1$1$1(this.$generation, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            long j = this.$generation;
            BrowserViewerSession browserViewerSession = this.this$0;
            if (j == browserViewerSession.controlGeneration && browserViewerSession.releasePending) {
                this.label = 1;
                obj = browserViewerSession.releaseHeldControl(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!AnonymousClass001.A1X(obj)) {
            this.this$0.scheduleReleaseRetry();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$queueRelease$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
