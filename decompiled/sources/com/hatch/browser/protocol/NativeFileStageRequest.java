package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes6.dex */
public final class NativeFileStageRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public PageAuthorityClaim claim;
    public List<FileRef> files;
    public OperationId operationId;
    public String stageId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeFileStageRequest) {
                NativeFileStageRequest nativeFileStageRequest = (NativeFileStageRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, nativeFileStageRequest.operationId) || !C7384Etj.areEqual(this.claim, nativeFileStageRequest.claim) || !C7384Etj.areEqual(this.stageId, nativeFileStageRequest.stageId) || !C7384Etj.areEqual(this.files, nativeFileStageRequest.files) || !C7384Etj.areEqual(this.budget, nativeFileStageRequest.budget)) {
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

    public final void setFiles(List<FileRef> list) {
        C7384Etj.A0Y(list, 0);
        this.files = list;
    }

    public final void setOperationId(OperationId operationId) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
    }

    public final void setStageId(String str) {
        C7384Etj.A0Y(str, 0);
        this.stageId = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeFileStageRequest copy$default(NativeFileStageRequest nativeFileStageRequest, OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, List list, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = nativeFileStageRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageAuthorityClaim = nativeFileStageRequest.claim;
        }
        if ((i & 4) != 0) {
            str = nativeFileStageRequest.stageId;
        }
        if ((i & 8) != 0) {
            list = nativeFileStageRequest.files;
        }
        if ((i & 16) != 0) {
            budget = nativeFileStageRequest.budget;
        }
        return nativeFileStageRequest.copy(operationId, pageAuthorityClaim, str, list, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageAuthorityClaim component2() {
        return this.claim;
    }

    public final String component3() {
        return this.stageId;
    }

    public final List<FileRef> component4() {
        return this.files;
    }

    public final Budget component5() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    public final PageAuthorityClaim getClaim() {
        return this.claim;
    }

    public final List<FileRef> getFiles() {
        return this.files;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final String getStageId() {
        return this.stageId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0F(this.files, AnonymousClass005.A0I(this.stageId, AnonymousClass005.A0F(this.claim, AnonymousClass005.A0E(this.operationId)))));
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageAuthorityClaim pageAuthorityClaim = this.claim;
        String str = this.stageId;
        List<FileRef> list = this.files;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "NativeFileStageRequest(operationId=");
        sbA0f.append(", claim=");
        sbA0f.append(pageAuthorityClaim);
        sbA0f.append(", stageId=");
        sbA0f.append(str);
        sbA0f.append(", files=");
        sbA0f.append(list);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    public NativeFileStageRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, List<FileRef> list, Budget budget) {
        AnonymousClass005.A17(operationId, pageAuthorityClaim, str, list, budget);
        this.operationId = operationId;
        this.claim = pageAuthorityClaim;
        this.stageId = str;
        this.files = list;
        this.budget = budget;
    }

    public final NativeFileStageRequest copy(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, List<FileRef> list, Budget budget) {
        AnonymousClass005.A17(operationId, pageAuthorityClaim, str, list, budget);
        return new NativeFileStageRequest(operationId, pageAuthorityClaim, str, list, budget);
    }
}
