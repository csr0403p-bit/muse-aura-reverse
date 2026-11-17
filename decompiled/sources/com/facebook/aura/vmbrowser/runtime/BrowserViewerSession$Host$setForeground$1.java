package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C3cH;
import X.C7384Etj;
import X.G0U;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerSession;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$Host$setForeground$1", f = "BrowserViewerSession.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$Host$setForeground$1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $active;
    public int label;
    public final /* synthetic */ BrowserViewerSession.Host this$0;
    public final /* synthetic */ BrowserViewerSession this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$Host$setForeground$1(BrowserViewerSession.Host host, boolean z, BrowserViewerSession browserViewerSession, HtJ<? super BrowserViewerSession$Host$setForeground$1> htJ) {
        super(1, htJ);
        this.this$0 = host;
        this.$active = z;
        this.this$1 = browserViewerSession;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new BrowserViewerSession$Host$setForeground$1(this.this$0, this.$active, this.this$1, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str;
        HoC hoC;
        BLG<Boolean> blg;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.this$0.disposed) {
            this.this$0.foreground = this.$active;
            boolean z = this.$active;
            BrowserViewerSession browserViewerSession = this.this$1;
            if (z) {
                BrowserTaskPresentation browserTaskPresentationInvoke = browserViewerSession.currentTask.invoke();
                if (C7384Etj.areEqual(browserTaskPresentationInvoke != null ? browserTaskPresentationInvoke.browserTaskId : null, this.this$0.taskId)) {
                    if (this.this$1.owner != this.this$0) {
                        this.this$1.dismissKeyboard();
                        BrowserViewerSession.Host host = this.this$1.owner;
                        if (host != null && (blg = host.render) != null) {
                            AnonymousClass003.A14(blg, false);
                        }
                        BrowserViewerSession.Host host2 = this.this$1.owner;
                        if (host2 != null && (hoC = host2.resizeJob) != null) {
                            hoC.A5w(null);
                        }
                        this.this$1.controller.destroyVncWebView();
                        this.this$1.owner = this.this$0;
                        this.this$1.controller.clearStreamFailure();
                        AnonymousClass001.A1E(this.this$1._controlConflict, null, false);
                        AnonymousClass001.A1E(this.this$1._failed, null, false);
                        AnonymousClass003.A14(this.this$1._isInTakeControl, !this.this$0.viewOnly);
                        AnonymousClass003.A14(this.this$1._isPreviewScreenLive, true);
                        this.this$1.controller.setInputEnabled(false);
                        this.this$1.controller.setCoverViewportEnabled(true);
                        this.this$1.controller.setPanModeEnabled(!this.this$0.viewOnly);
                        this.this$1.controller.setZoomMultiplier(1.0f);
                        if (this.this$0.viewOnly || ((str = this.this$1.heldTaskId) != null && !str.equals(this.this$0.taskId))) {
                            this.this$1.queueRelease();
                        }
                    }
                    this.this$0.updateViewportAspect();
                    BrowserViewerSession.Host host3 = this.this$0;
                    AnonymousClass003.A14(host3.render, host3.preference != null);
                    this.this$1.updateInput();
                    this.this$1.controller.resumeStream();
                    if (!this.this$0.presentationConfirmed && C3cH.A1R(this.this$1.controller.isConnected)) {
                        this.this$1.prepareMode(this.this$0, AnonymousClass001.A1Q(2, false));
                    }
                    this.this$1.scheduleResize(this.this$0);
                }
            } else if (browserViewerSession.owner == this.this$0) {
                this.this$1.updateInput();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$Host$setForeground$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
