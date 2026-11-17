package com.hatch.browser.protocol;

import X.AbstractC7611F5y;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.HwO;

/* loaded from: classes6.dex */
public final class NativeDownloadPublishRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Budget budget;
    public long bytes;
    public PageAuthorityClaim claim;
    public String destination;
    public String downloadId;
    public String mimeType;
    public String name;
    public OperationId operationId;
    public String sha256;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeDownloadPublishRequest) {
                NativeDownloadPublishRequest nativeDownloadPublishRequest = (NativeDownloadPublishRequest) obj;
                if (!C7384Etj.areEqual(this.operationId, nativeDownloadPublishRequest.operationId) || !C7384Etj.areEqual(this.claim, nativeDownloadPublishRequest.claim) || !C7384Etj.areEqual(this.downloadId, nativeDownloadPublishRequest.downloadId) || !C7384Etj.areEqual(this.destination, nativeDownloadPublishRequest.destination) || !C7384Etj.areEqual(this.name, nativeDownloadPublishRequest.name) || !C7384Etj.areEqual(this.mimeType, nativeDownloadPublishRequest.mimeType) || this.bytes != nativeDownloadPublishRequest.bytes || !C7384Etj.areEqual(this.sha256, nativeDownloadPublishRequest.sha256) || !C7384Etj.areEqual(this.budget, nativeDownloadPublishRequest.budget)) {
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

    public final void setDestination(String str) {
        C7384Etj.A0Y(str, 0);
        this.destination = str;
    }

    public final void setDownloadId(String str) {
        C7384Etj.A0Y(str, 0);
        this.downloadId = str;
    }

    public final void setName(String str) {
        C7384Etj.A0Y(str, 0);
        this.name = str;
    }

    public final void setOperationId(OperationId operationId) {
        C7384Etj.A0Y(operationId, 0);
        this.operationId = operationId;
    }

    public final void setSha256(String str) {
        C7384Etj.A0Y(str, 0);
        this.sha256 = str;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-NxSs7HY$default, reason: not valid java name */
    public static /* synthetic */ NativeDownloadPublishRequest m3605copyNxSs7HY$default(NativeDownloadPublishRequest nativeDownloadPublishRequest, OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, String str2, String str3, String str4, long j, String str5, Budget budget, int i, Object obj) {
        if ((i & 1) != 0) {
            operationId = nativeDownloadPublishRequest.operationId;
        }
        if ((i & 2) != 0) {
            pageAuthorityClaim = nativeDownloadPublishRequest.claim;
        }
        if ((i & 4) != 0) {
            str = nativeDownloadPublishRequest.downloadId;
        }
        if ((i & 8) != 0) {
            str2 = nativeDownloadPublishRequest.destination;
        }
        if ((i & 16) != 0) {
            str3 = nativeDownloadPublishRequest.name;
        }
        if ((i & 32) != 0) {
            str4 = nativeDownloadPublishRequest.mimeType;
        }
        if ((i & 64) != 0) {
            j = nativeDownloadPublishRequest.bytes;
        }
        if ((i & 128) != 0) {
            str5 = nativeDownloadPublishRequest.sha256;
        }
        if ((i & 256) != 0) {
            budget = nativeDownloadPublishRequest.budget;
        }
        return nativeDownloadPublishRequest.m3607copyNxSs7HY(operationId, pageAuthorityClaim, str, str2, str3, str4, j, str5, budget);
    }

    public final OperationId component1() {
        return this.operationId;
    }

    public final PageAuthorityClaim component2() {
        return this.claim;
    }

    public final String component3() {
        return this.downloadId;
    }

    public final String component4() {
        return this.destination;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.mimeType;
    }

    /* renamed from: component7-s-VKNKU, reason: not valid java name */
    public final long m3606component7sVKNKU() {
        return this.bytes;
    }

    public final String component8() {
        return this.sha256;
    }

    public final Budget component9() {
        return this.budget;
    }

    public final Budget getBudget() {
        return this.budget;
    }

    /* renamed from: getBytes-s-VKNKU, reason: not valid java name */
    public final long m3608getBytessVKNKU() {
        return this.bytes;
    }

    public final PageAuthorityClaim getClaim() {
        return this.claim;
    }

    public final String getDestination() {
        return this.destination;
    }

    public final String getDownloadId() {
        return this.downloadId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getName() {
        return this.name;
    }

    public final OperationId getOperationId() {
        return this.operationId;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.budget, AnonymousClass005.A0I(this.sha256, C60R.A00(this.bytes, (AnonymousClass005.A0I(this.name, AnonymousClass005.A0I(this.destination, AnonymousClass005.A0I(this.downloadId, AnonymousClass005.A0F(this.claim, AnonymousClass005.A0E(this.operationId))))) + AnonymousClass006.A0G(this.mimeType)) * 31)));
    }

    /* renamed from: setBytes-VKZWuLQ, reason: not valid java name */
    public final void m3609setBytesVKZWuLQ(long j) {
        this.bytes = j;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public String toString() {
        OperationId operationId = this.operationId;
        PageAuthorityClaim pageAuthorityClaim = this.claim;
        String str = this.downloadId;
        String str2 = this.destination;
        String str3 = this.name;
        String str4 = this.mimeType;
        String strA00 = HwO.A00(this.bytes);
        String str5 = this.sha256;
        Budget budget = this.budget;
        StringBuilder sbA0f = C3cG.A0f(operationId, "NativeDownloadPublishRequest(operationId=");
        sbA0f.append(", claim=");
        sbA0f.append(pageAuthorityClaim);
        sbA0f.append(", downloadId=");
        sbA0f.append(str);
        sbA0f.append(", destination=");
        sbA0f.append(str2);
        AbstractC7611F5y.A0y(sbA0f, str3, str4, strA00);
        sbA0f.append(", sha256=");
        sbA0f.append(str5);
        return C3cJ.A0L(budget, ", budget=", sbA0f);
    }

    /* renamed from: copy-NxSs7HY, reason: not valid java name */
    public final NativeDownloadPublishRequest m3607copyNxSs7HY(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, String str2, String str3, String str4, long j, String str5, Budget budget) {
        AnonymousClass005.A17(operationId, pageAuthorityClaim, str, str2, str3);
        C60O.A1N(str5, 7, budget);
        return new NativeDownloadPublishRequest(operationId, pageAuthorityClaim, str, str2, str3, str4, j, str5, budget);
    }

    public /* synthetic */ NativeDownloadPublishRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, String str2, String str3, String str4, long j, String str5, Budget budget, C06H c06h) {
        this(operationId, pageAuthorityClaim, str, str2, str3, str4, j, str5, budget);
    }

    public NativeDownloadPublishRequest(OperationId operationId, PageAuthorityClaim pageAuthorityClaim, String str, String str2, String str3, String str4, long j, String str5, Budget budget) {
        AnonymousClass005.A17(operationId, pageAuthorityClaim, str, str2, str3);
        C60O.A1N(str5, 7, budget);
        this.operationId = operationId;
        this.claim = pageAuthorityClaim;
        this.downloadId = str;
        this.destination = str2;
        this.name = str3;
        this.mimeType = str4;
        this.bytes = j;
        this.sha256 = str5;
        this.budget = budget;
    }
}
