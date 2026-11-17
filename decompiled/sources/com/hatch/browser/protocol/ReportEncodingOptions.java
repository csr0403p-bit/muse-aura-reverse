package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ReportEncodingOptions {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public ReportImageFormat imageFormat;
    public int maxBytes;

    public ReportEncodingOptions(ReportImageFormat reportImageFormat, int i) {
        C7384Etj.A0Y(reportImageFormat, 0);
        this.imageFormat = reportImageFormat;
        this.maxBytes = i;
    }

    /* renamed from: copy-Qn1smSk, reason: not valid java name */
    public final ReportEncodingOptions m3710copyQn1smSk(ReportImageFormat reportImageFormat, int i) {
        C7384Etj.A0Y(reportImageFormat, 0);
        return new ReportEncodingOptions(reportImageFormat, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReportEncodingOptions) {
                ReportEncodingOptions reportEncodingOptions = (ReportEncodingOptions) obj;
                if (this.imageFormat != reportEncodingOptions.imageFormat || this.maxBytes != reportEncodingOptions.maxBytes) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setImageFormat(ReportImageFormat reportImageFormat) {
        C7384Etj.A0Y(reportImageFormat, 0);
        this.imageFormat = reportImageFormat;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-Qn1smSk$default, reason: not valid java name */
    public static /* synthetic */ ReportEncodingOptions m3708copyQn1smSk$default(ReportEncodingOptions reportEncodingOptions, ReportImageFormat reportImageFormat, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            reportImageFormat = reportEncodingOptions.imageFormat;
        }
        if ((i2 & 2) != 0) {
            i = reportEncodingOptions.maxBytes;
        }
        C7384Etj.A0Y(reportImageFormat, 0);
        return new ReportEncodingOptions(reportImageFormat, i);
    }

    public final ReportImageFormat component1() {
        return this.imageFormat;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3709component2pVg5ArA() {
        return this.maxBytes;
    }

    public final ReportImageFormat getImageFormat() {
        return this.imageFormat;
    }

    /* renamed from: getMaxBytes-pVg5ArA, reason: not valid java name */
    public final int m3711getMaxBytespVg5ArA() {
        return this.maxBytes;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.imageFormat) + this.maxBytes;
    }

    /* renamed from: setMaxBytes-WZ4Q5Ns, reason: not valid java name */
    public final void m3712setMaxBytesWZ4Q5Ns(int i) {
        this.maxBytes = i;
    }

    public String toString() {
        return C3cJ.A0N(", maxBytes=", String.valueOf(BV4.A03(this.maxBytes)), C3cG.A0f(this.imageFormat, "ReportEncodingOptions(imageFormat="));
    }

    public /* synthetic */ ReportEncodingOptions(ReportImageFormat reportImageFormat, int i, C06H c06h) {
        this(reportImageFormat, i);
    }
}
