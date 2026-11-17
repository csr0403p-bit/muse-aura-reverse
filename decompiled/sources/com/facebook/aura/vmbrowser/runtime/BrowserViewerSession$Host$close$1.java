package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C9286GCn;
import X.G0U;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host$close$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$Host$close$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public int label;
    public final /* synthetic */ BrowserViewerSession.Host this$0;
    public final /* synthetic */ BrowserViewerSession this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$Host$close$1(BrowserViewerSession.Host host, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$Host$close$1> htJ) {
        super(1, htJ);
        this.this$0 = host;
        this.this$1 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$Host$close$1(this.this$0, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.this$0.disposed = true;
        this.this$0.foreground = false;
        C9286GCn.A00(null, false, (C9286GCn) this.this$0.render);
        HoC hoC = this.this$0.resizeJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        if (this.this$1.owner == this.this$0) {
            this.this$1.closeCurrent();
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$Host$close$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
