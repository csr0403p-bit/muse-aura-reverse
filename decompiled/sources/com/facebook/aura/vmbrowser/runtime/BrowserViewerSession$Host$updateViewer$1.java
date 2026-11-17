package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host$updateViewer$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$Host$updateViewer$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ BrowserViewerPreference $viewer;
    public int label;
    public final /* synthetic */ BrowserViewerSession.Host this$0;
    public final /* synthetic */ BrowserViewerSession this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$Host$updateViewer$1(BrowserViewerSession.Host host, BrowserViewerPreference browserViewerPreference, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$Host$updateViewer$1> htJ) {
        super(1, htJ);
        this.this$0 = host;
        this.$viewer = browserViewerPreference;
        this.this$1 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$Host$updateViewer$1(this.this$0, this.$viewer, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.this$0.disposed && !C7384Etj.areEqual(this.this$0.preference, this.$viewer)) {
            BrowserViewerSession.Host host = this.this$0;
            host.preference = this.$viewer;
            host.measuredAtMs = SystemClock.uptimeMillis();
            if (host.isActive()) {
                this.this$0.updateViewportAspect();
                AnonymousClass004.A1D(true, this.this$0.render);
                this.this$1.scheduleResize(this.this$0);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$Host$updateViewer$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
