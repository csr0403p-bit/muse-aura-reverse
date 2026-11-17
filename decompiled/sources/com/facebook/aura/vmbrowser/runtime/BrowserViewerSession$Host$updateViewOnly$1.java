package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3cI;
import X.G0U;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host$updateViewOnly$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$Host$updateViewOnly$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $viewOnly;
    public int label;
    public final /* synthetic */ BrowserViewerSession.Host this$0;
    public final /* synthetic */ BrowserViewerSession this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$Host$updateViewOnly$1(BrowserViewerSession.Host host, boolean z, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$Host$updateViewOnly$1> htJ) {
        super(1, htJ);
        this.this$0 = host;
        this.$viewOnly = z;
        this.this$1 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$Host$updateViewOnly$1(this.this$0, this.$viewOnly, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.this$0.disposed) {
            boolean z = this.this$0.viewOnly;
            boolean z2 = this.$viewOnly;
            if (z != z2) {
                this.this$0.viewOnly = z2;
                BrowserViewerSession.Host host = this.this$0;
                host.modeGeneration++;
                host.presentationConfirmed = false;
                HoC hoCA15 = C3cI.A15(host.resizeJob);
                this.this$0.resizeJob = hoCA15;
                if (this.this$1.owner == this.this$0) {
                    this.this$1.dismissKeyboard();
                    this.this$1.controller.setInputEnabled(false);
                    this.this$1.controller.setViewOnly(this.$viewOnly);
                    AnonymousClass001.A1E(this.this$1._isUserControlled, hoCA15, false);
                    AnonymousClass003.A14(this.this$1._isInTakeControl, !this.$viewOnly);
                    AnonymousClass001.A1E(this.this$1._controlConflict, hoCA15, false);
                    AnonymousClass001.A1E(this.this$1._failed, hoCA15, false);
                    if (this.$viewOnly) {
                        this.this$1.queueRelease();
                    }
                    this.this$1.prepareMode(this.this$0, AnonymousClass001.A1Q(2, false));
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$Host$updateViewOnly$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
