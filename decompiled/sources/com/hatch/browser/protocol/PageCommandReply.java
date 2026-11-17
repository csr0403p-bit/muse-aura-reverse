package com.hatch.browser.protocol;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageCommandReply {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public PageOwnerView owner;
    public ReportEnvelope report;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageCommandReply) {
                PageCommandReply pageCommandReply = (PageCommandReply) obj;
                if (!C7384Etj.areEqual(this.report, pageCommandReply.report) || !C7384Etj.areEqual(this.owner, pageCommandReply.owner)) {
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

    public static /* synthetic */ PageCommandReply copy$default(PageCommandReply pageCommandReply, ReportEnvelope reportEnvelope, PageOwnerView pageOwnerView, int i, Object obj) {
        if ((i & 1) != 0) {
            reportEnvelope = pageCommandReply.report;
        }
        if ((i & 2) != 0) {
            pageOwnerView = pageCommandReply.owner;
        }
        AnonymousClass003.A0u(reportEnvelope, pageOwnerView);
        return new PageCommandReply(reportEnvelope, pageOwnerView);
    }

    public final ReportEnvelope component1() {
        return this.report;
    }

    public final PageOwnerView component2() {
        return this.owner;
    }

    public final PageOwnerView getOwner() {
        return this.owner;
    }

    public final ReportEnvelope getReport() {
        return this.report;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.owner, AnonymousClass005.A0E(this.report));
    }

    public String toString() {
        return C3cJ.A0L(this.owner, ", owner=", C3cG.A0f(this.report, "PageCommandReply(report="));
    }

    public PageCommandReply(ReportEnvelope reportEnvelope, PageOwnerView pageOwnerView) {
        AnonymousClass003.A0u(reportEnvelope, pageOwnerView);
        this.report = reportEnvelope;
        this.owner = pageOwnerView;
    }

    public final PageCommandReply copy(ReportEnvelope reportEnvelope, PageOwnerView pageOwnerView) {
        AnonymousClass003.A0u(reportEnvelope, pageOwnerView);
        return new PageCommandReply(reportEnvelope, pageOwnerView);
    }
}
