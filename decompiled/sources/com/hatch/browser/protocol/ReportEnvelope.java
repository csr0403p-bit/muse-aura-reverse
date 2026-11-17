package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class ReportEnvelope {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public ReportView report;

    public ReportEnvelope(int i, ReportView reportView) {
        C7384Etj.A0Y(reportView, 1);
        this.apiVersion = i;
        this.report = reportView;
    }

    /* renamed from: copy-qim9Vi0, reason: not valid java name */
    public final ReportEnvelope m3715copyqim9Vi0(int i, ReportView reportView) {
        C7384Etj.A0Y(reportView, 1);
        return new ReportEnvelope(i, reportView);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReportEnvelope) {
                ReportEnvelope reportEnvelope = (ReportEnvelope) obj;
                if (this.apiVersion != reportEnvelope.apiVersion || !C7384Etj.areEqual(this.report, reportEnvelope.report)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setReport(ReportView reportView) {
        C7384Etj.A0Y(reportView, 0);
        this.report = reportView;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-qim9Vi0$default, reason: not valid java name */
    public static /* synthetic */ ReportEnvelope m3713copyqim9Vi0$default(ReportEnvelope reportEnvelope, int i, ReportView reportView, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reportEnvelope.apiVersion;
        }
        if ((i2 & 2) != 0) {
            reportView = reportEnvelope.report;
        }
        C7384Etj.A0Y(reportView, 1);
        return new ReportEnvelope(i, reportView);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3714component1pVg5ArA() {
        return this.apiVersion;
    }

    public final ReportView component2() {
        return this.report;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3716getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final ReportView getReport() {
        return this.report;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.report, this.apiVersion * 31);
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3717setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        return C3cJ.A0L(this.report, ", report=", C3cI.A0x("ReportEnvelope(apiVersion=", String.valueOf(BV4.A03(this.apiVersion))));
    }

    public /* synthetic */ ReportEnvelope(int i, ReportView reportView, C06H c06h) {
        this(i, reportView);
    }
}
