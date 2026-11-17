package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.FKC;

/* loaded from: classes6.dex */
public final class ObserveOptions {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public boolean audio;
    public CaptureOptions capture;
    public FailureContext failureContext;
    public FKC listen;
    public String query;
    public boolean redactions;
    public RenderFence renderFence;
    public boolean signalDiagnostics;

    public ObserveOptions(boolean z, RenderFence renderFence, FailureContext failureContext, String str, CaptureOptions captureOptions, boolean z2, boolean z3, FKC fkc) {
        C7384Etj.A0Y(renderFence, 1);
        this.signalDiagnostics = z;
        this.renderFence = renderFence;
        this.failureContext = failureContext;
        this.query = str;
        this.capture = captureOptions;
        this.redactions = z2;
        this.audio = z3;
        this.listen = fkc;
    }

    /* renamed from: copy-fCE2Sk4, reason: not valid java name */
    public final ObserveOptions m3632copyfCE2Sk4(boolean z, RenderFence renderFence, FailureContext failureContext, String str, CaptureOptions captureOptions, boolean z2, boolean z3, FKC fkc) {
        C7384Etj.A0Y(renderFence, 1);
        return new ObserveOptions(z, renderFence, failureContext, str, captureOptions, z2, z3, fkc);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ObserveOptions) {
                ObserveOptions observeOptions = (ObserveOptions) obj;
                if (this.signalDiagnostics != observeOptions.signalDiagnostics || this.renderFence != observeOptions.renderFence || !C7384Etj.areEqual(this.failureContext, observeOptions.failureContext) || !C7384Etj.areEqual(this.query, observeOptions.query) || !C7384Etj.areEqual(this.capture, observeOptions.capture) || this.redactions != observeOptions.redactions || this.audio != observeOptions.audio || !C7384Etj.areEqual(this.listen, observeOptions.listen)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setRenderFence(RenderFence renderFence) {
        C7384Etj.A0Y(renderFence, 0);
        this.renderFence = renderFence;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-fCE2Sk4$default, reason: not valid java name */
    public static /* synthetic */ ObserveOptions m3630copyfCE2Sk4$default(ObserveOptions observeOptions, boolean z, RenderFence renderFence, FailureContext failureContext, String str, CaptureOptions captureOptions, boolean z2, boolean z3, FKC fkc, int i, Object obj) {
        if ((i & 1) != 0) {
            z = observeOptions.signalDiagnostics;
        }
        if ((i & 2) != 0) {
            renderFence = observeOptions.renderFence;
        }
        if ((i & 4) != 0) {
            failureContext = observeOptions.failureContext;
        }
        if ((i & 8) != 0) {
            str = observeOptions.query;
        }
        if ((i & 16) != 0) {
            captureOptions = observeOptions.capture;
        }
        if ((i & 32) != 0) {
            z2 = observeOptions.redactions;
        }
        if ((i & 64) != 0) {
            z3 = observeOptions.audio;
        }
        if ((i & 128) != 0) {
            fkc = observeOptions.listen;
        }
        return observeOptions.m3632copyfCE2Sk4(z, renderFence, failureContext, str, captureOptions, z2, z3, fkc);
    }

    public final boolean component1() {
        return this.signalDiagnostics;
    }

    public final RenderFence component2() {
        return this.renderFence;
    }

    public final FailureContext component3() {
        return this.failureContext;
    }

    public final String component4() {
        return this.query;
    }

    public final CaptureOptions component5() {
        return this.capture;
    }

    public final boolean component6() {
        return this.redactions;
    }

    public final boolean component7() {
        return this.audio;
    }

    /* renamed from: component8-0hXNFcg, reason: not valid java name */
    public final FKC m3631component80hXNFcg() {
        return this.listen;
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final CaptureOptions getCapture() {
        return this.capture;
    }

    public final FailureContext getFailureContext() {
        return this.failureContext;
    }

    /* renamed from: getListen-0hXNFcg, reason: not valid java name */
    public final FKC m3633getListen0hXNFcg() {
        return this.listen;
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean getRedactions() {
        return this.redactions;
    }

    public final RenderFence getRenderFence() {
        return this.renderFence;
    }

    public final boolean getSignalDiagnostics() {
        return this.signalDiagnostics;
    }

    public int hashCode() {
        int iA01 = C0KA.A01(C0KA.A01((((((AnonymousClass005.A0F(this.renderFence, C0KA.A02(this.signalDiagnostics)) + AnonymousClass006.A0D(this.failureContext)) * 31) + AnonymousClass006.A0G(this.query)) * 31) + AnonymousClass006.A0D(this.capture)) * 31, this.redactions), this.audio);
        FKC fkc = this.listen;
        return iA01 + (fkc != null ? fkc.A00 : 0);
    }

    public final void setAudio(boolean z) {
        this.audio = z;
    }

    public final void setCapture(CaptureOptions captureOptions) {
        this.capture = captureOptions;
    }

    public final void setFailureContext(FailureContext failureContext) {
        this.failureContext = failureContext;
    }

    /* renamed from: setListen-ExVfyTY, reason: not valid java name */
    public final void m3634setListenExVfyTY(FKC fkc) {
        this.listen = fkc;
    }

    public final void setQuery(String str) {
        this.query = str;
    }

    public final void setRedactions(boolean z) {
        this.redactions = z;
    }

    public final void setSignalDiagnostics(boolean z) {
        this.signalDiagnostics = z;
    }

    public String toString() {
        boolean z = this.signalDiagnostics;
        RenderFence renderFence = this.renderFence;
        FailureContext failureContext = this.failureContext;
        String str = this.query;
        CaptureOptions captureOptions = this.capture;
        boolean z2 = this.redactions;
        boolean z3 = this.audio;
        FKC fkc = this.listen;
        StringBuilder sbA10 = C60O.A10("ObserveOptions(signalDiagnostics=", z);
        sbA10.append(", renderFence=");
        sbA10.append(renderFence);
        sbA10.append(", failureContext=");
        sbA10.append(failureContext);
        sbA10.append(", query=");
        sbA10.append(str);
        sbA10.append(", capture=");
        sbA10.append(captureOptions);
        sbA10.append(", redactions=");
        sbA10.append(z2);
        sbA10.append(", audio=");
        sbA10.append(z3);
        return C3cJ.A0L(fkc, ", listen=", sbA10);
    }

    public /* synthetic */ ObserveOptions(boolean z, RenderFence renderFence, FailureContext failureContext, String str, CaptureOptions captureOptions, boolean z2, boolean z3, FKC fkc, C06H c06h) {
        this(z, renderFence, failureContext, str, captureOptions, z2, z3, fkc);
    }
}
