package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class NativePdfPrintRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public PageAuthorityClaim claim;
    public OperationId operationId;
    public PdfOptions options;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativePdfPrintRequest) {
                NativePdfPrintRequest nativePdfPrintRequest = (NativePdfPrintRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, nativePdfPrintRequest.operationId) || !C7384Etj.areEqual(this.claim, nativePdfPrintRequest.claim) || !C7384Etj.areEqual(this.options, nativePdfPrintRequest.options) || !C7384Etj.areEqual(this.budget, nativePdfPrintRequest.budget)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBudget(Budget budget) {
        C7384Etj.A0Y(budget, 0);
        this.budget = budget;
    }

    public final void setClaim(PageAuthorityClaim pageAuthorityClaim) {
        C7384Etj.A0Y(pageAuthorityClaim, 0);
        this.claim = pageAuthorityClaim;
    }

    public final void setOperationId(OperationId operationId) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
    }

    public final void setOptions(PdfOptions pdfOptions) {
        C7384Etj.A0Y(pdfOptions, 0);
        this.options = pdfOptions;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ NativePdfPrintRequest copy$default(NativePdfPrintRequest nativePdfPrintRequest, OperationId operationId, PageAuthorityClaim pageAuthorityClaim, PdfOptions pdfOptions, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = nativePdfPrintRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageAuthorityClaim = nativePdfPrintRequest.claim;
        }
        if ((i & 4) != 0) {
            pdfOptions = nativePdfPrintRequest.options;
        }
        if ((i & 8) != 0) {
            budget = nativePdfPrintRequest.budget;
        }
        return nativePdfPrintRequest.copy(operationId, pageAuthorityClaim, pdfOptions, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageAuthorityClaim component2() {
        return this.claim;
    }

    public final PdfOptions component3() {
        return this.options;
    }

    public final Budget component4() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final PageAuthorityClaim getClaim() {
        return this.claim;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final PdfOptions getOptions() {
        return this.options;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0F(this.options, AnonymousClass005.A0F(this.claim, AnonymousClass005.A0E(this.operationId))));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageAuthorityClaim pageAuthorityClaim = this.claim;
        PdfOptions pdfOptions = this.options;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "NativePdfPrintRequest(operationId=");
        sbA0f.append(", claim=");
        sbA0f.append(pageAuthorityClaim);
        sbA0f.append(", options=");
        sbA0f.append(pdfOptions);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    public NativePdfPrintRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, PdfOptions pdfOptions, Budget budget) {
        AnonymousClass005.A14(operationId, pageAuthorityClaim, pdfOptions, budget);
        this.operationId = operationId;
        this.claim = pageAuthorityClaim;
        this.options = pdfOptions;
        this.budget = budget;
    }

    public final NativePdfPrintRequest copy(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, PdfOptions pdfOptions, Budget budget) {
        AnonymousClass005.A14(operationId, pageAuthorityClaim, pdfOptions, budget);
        return new NativePdfPrintRequest(operationId, pageAuthorityClaim, pdfOptions, budget);
    }
}
