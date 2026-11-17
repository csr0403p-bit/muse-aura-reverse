package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$prepareMode$2$result$1$1", f = "BrowserViewerSession.kt", l = {363}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$prepareMode$2$result$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserPresentResult>, Object> {
    public final /* synthetic */ long $generation;
    public final /* synthetic */ BrowserViewerSession.Host $host;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$prepareMode$2$result$1$1(BrowserViewerSession browserViewerSession, BrowserViewerSession.Host host, long j, HtJ<? super BrowserViewerSession$prepareMode$2$result$1$1> htJ) {
        super(2, htJ);
        this.this$0 = browserViewerSession;
        this.$host = host;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserViewerSession$prepareMode$2$result$1$1(this.this$0, this.$host, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            BrowserViewerSession browserViewerSession = this.this$0;
            BrowserViewerSession.Host host = this.$host;
            long j = this.$generation;
            this.label = 1;
            obj = browserViewerSession.prepareLocked(host, j, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super BrowserPresentResult> htJ) {
        return ((BrowserViewerSession$prepareMode$2$result$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
