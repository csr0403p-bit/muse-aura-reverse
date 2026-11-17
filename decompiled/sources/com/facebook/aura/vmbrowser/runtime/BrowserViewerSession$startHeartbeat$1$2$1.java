package com.facebook.aura.vmbrowser.runtime;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.browsertask.control.BrowserControlLease;
import com.facebook.aura.browsertask.control.BrowserControlResult;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserViewerSession$startHeartbeat$1$2$1", f = "BrowserViewerSession.kt", l = {879}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class BrowserViewerSession$startHeartbeat$1$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ long $generation;
    public final /* synthetic */ String $taskId;
    public int label;
    public final /* synthetic */ BrowserViewerSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserViewerSession$startHeartbeat$1$2$1(BrowserViewerSession browserViewerSession, String str, long j, HtJ<? super BrowserViewerSession$startHeartbeat$1$2$1> htJ) {
        super(2, htJ);
        this.this$0 = browserViewerSession;
        this.$taskId = str;
        this.$generation = j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new BrowserViewerSession$startHeartbeat$1$2$1(this.this$0, this.$taskId, this.$generation, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        BrowserControlLease browserControlLease;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.this$0.canRenewControl(this.$taskId, this.$generation)) {
                BrowserViewerSession browserViewerSession = this.this$0;
                String str = this.$taskId;
                long j = this.$generation;
                this.label = 1;
                obj = browserViewerSession.renewControl(str, j, this);
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
        BrowserControlResult browserControlResult = (BrowserControlResult) obj;
        if (this.this$0.canRenewControl(this.$taskId, this.$generation)) {
            if (browserControlResult instanceof BrowserControlResult.Granted) {
                BrowserControlResult.Granted granted = (BrowserControlResult.Granted) browserControlResult;
                if (granted != null) {
                    browserControlLease = granted.lease;
                    if (browserControlLease != null) {
                        if ("user".equals(browserControlLease.controlOwner) && C7384Etj.areEqual(browserControlLease.taskId, this.$taskId)) {
                            Long l = browserControlLease.controlExpiresAtMs;
                            if (l != null) {
                                if (System.currentTimeMillis() < l.longValue()) {
                                }
                                this.this$0.updateInput();
                            }
                        }
                        AnonymousClass003.A14(this.this$0._isUserControlled, false);
                        AnonymousClass003.A14(this.this$0._failed, true);
                        this.this$0.queueRelease();
                        this.this$0.updateInput();
                    }
                } else {
                    browserControlLease = null;
                }
                BrowserViewerSession browserViewerSession2 = this.this$0;
                browserViewerSession2.controlExpiresAtMs = browserControlLease != null ? browserControlLease.controlExpiresAtMs : null;
                browserViewerSession2.updateTakeoverId(browserControlLease);
                this.this$0.heartbeatPending = false;
                this.this$0.updateInput();
            } else {
                AnonymousClass003.A14(this.this$0._isUserControlled, false);
                AnonymousClass003.A14(this.this$0._failed, true);
                this.this$0.queueRelease();
                this.this$0.updateInput();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((BrowserViewerSession$startHeartbeat$1$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
