package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PagePreparedReply {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int apiVersion;
    public PageOwnerView owner;
    public PageReference page;
    public ReportEnvelope report;

    public PagePreparedReply(ReportEnvelope reportEnvelope, int i, PageReference pageReference, PageOwnerView pageOwnerView) {
        AnonymousClass005.A11(reportEnvelope, pageReference, pageOwnerView, 0);
        this.report = reportEnvelope;
        this.apiVersion = i;
        this.page = pageReference;
        this.owner = pageOwnerView;
    }

    /* renamed from: copy-Yuhug_o, reason: not valid java name */
    public final PagePreparedReply m3678copyYuhug_o(ReportEnvelope reportEnvelope, int i, PageReference pageReference, PageOwnerView pageOwnerView) {
        AnonymousClass005.A11(reportEnvelope, pageReference, pageOwnerView, 0);
        return new PagePreparedReply(reportEnvelope, i, pageReference, pageOwnerView);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PagePreparedReply) {
                PagePreparedReply pagePreparedReply = (PagePreparedReply) obj;
                if (!C7384Etj.areEqual(this.report, pagePreparedReply.report) || this.apiVersion != pagePreparedReply.apiVersion || !C7384Etj.areEqual(this.page, pagePreparedReply.page) || !C7384Etj.areEqual(this.owner, pagePreparedReply.owner)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setOwner(PageOwnerView pageOwnerView) {
        C7384Etj.A0Y(pageOwnerView, 0);
        this.owner = pageOwnerView;
    }

    public final void setPage(PageReference pageReference) {
        C7384Etj.A0Y(pageReference, 0);
        this.page = pageReference;
    }

    public final void setReport(ReportEnvelope reportEnvelope) {
        C7384Etj.A0Y(reportEnvelope, 0);
        this.report = reportEnvelope;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-Yuhug_o$default, reason: not valid java name */
    public static /* synthetic */ PagePreparedReply m3676copyYuhug_o$default(PagePreparedReply pagePreparedReply, ReportEnvelope reportEnvelope, int i, PageReference pageReference, PageOwnerView pageOwnerView, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            reportEnvelope = pagePreparedReply.report;
        }
        if ((i2 & 2) != 0) {
            i = pagePreparedReply.apiVersion;
        }
        if ((i2 & 4) != 0) {
            pageReference = pagePreparedReply.page;
        }
        if ((i2 & 8) != 0) {
            pageOwnerView = pagePreparedReply.owner;
        }
        return pagePreparedReply.m3678copyYuhug_o(reportEnvelope, i, pageReference, pageOwnerView);
    }

    public final ReportEnvelope component1() {
        return this.report;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3677component2pVg5ArA() {
        return this.apiVersion;
    }

    public final PageReference component3() {
        return this.page;
    }

    public final PageOwnerView component4() {
        return this.owner;
    }

    /* renamed from: getApiVersion-pVg5ArA, reason: not valid java name */
    public final int m3679getApiVersionpVg5ArA() {
        return this.apiVersion;
    }

    public final PageOwnerView getOwner() {
        return this.owner;
    }

    public final PageReference getPage() {
        return this.page;
    }

    public final ReportEnvelope getReport() {
        return this.report;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.owner, AnonymousClass005.A0F(this.page, (AnonymousClass005.A0E(this.report) + this.apiVersion) * 31));
    }

    /* renamed from: setApiVersion-WZ4Q5Ns, reason: not valid java name */
    public final void m3680setApiVersionWZ4Q5Ns(int i) {
        this.apiVersion = i;
    }

    public String toString() {
        ReportEnvelope reportEnvelope = this.report;
        String strValueOf = String.valueOf(BV4.A03(this.apiVersion));
        PageReference pageReference = this.page;
        PageOwnerView pageOwnerView = this.owner;
        StringBuilder sbA0f = C3cG.A0f(reportEnvelope, "PagePreparedReply(report=");
        sbA0f.append(", apiVersion=");
        sbA0f.append(strValueOf);
        sbA0f.append(", page=");
        sbA0f.append(pageReference);
        return C3cJ.A0L(pageOwnerView, ", owner=", sbA0f);
    }

    public /* synthetic */ PagePreparedReply(ReportEnvelope reportEnvelope, int i, PageReference pageReference, PageOwnerView pageOwnerView, C06H c06h) {
        this(reportEnvelope, i, pageReference, pageOwnerView);
    }
}
