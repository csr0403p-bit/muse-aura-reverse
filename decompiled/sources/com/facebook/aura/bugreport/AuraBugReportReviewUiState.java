package com.facebook.aura.bugreport;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.bugreport.AuraVmLogFetchState;

/* loaded from: classes.dex */
public final class AuraBugReportReviewUiState extends C06G {
    public static final int $stable;
    public final BusyItem busyItem;
    public final boolean includeLogs;
    public final boolean isCollecting;
    public final boolean isConfidentialOrUnclassified;
    public final boolean isPreviewLoading;
    public final AHD<AuraBugReportCollector.CollectedItem> items;
    public final String previewTitle;
    public final AuraBugReportCollector.CollectedItem previewTooLargeItem;
    public final AuraVmLogFetchState vmLogFetch;

    public final AuraBugReportReviewUiState copy(boolean z, boolean z2, boolean z3, AHD<AuraBugReportCollector.CollectedItem> ahd, String str, boolean z4, AuraBugReportCollector.CollectedItem collectedItem, AuraVmLogFetchState auraVmLogFetchState, BusyItem busyItem) {
        C7384Etj.A0Y(ahd, 3);
        C7384Etj.A0Y(auraVmLogFetchState, 7);
        return new AuraBugReportReviewUiState(z, z2, z3, ahd, str, z4, collectedItem, auraVmLogFetchState, busyItem);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBugReportReviewUiState) {
                AuraBugReportReviewUiState auraBugReportReviewUiState = (AuraBugReportReviewUiState) obj;
                if (this.isConfidentialOrUnclassified != auraBugReportReviewUiState.isConfidentialOrUnclassified || this.includeLogs != auraBugReportReviewUiState.includeLogs || this.isCollecting != auraBugReportReviewUiState.isCollecting || !C7384Etj.areEqual(this.items, auraBugReportReviewUiState.items) || !C7384Etj.areEqual(this.previewTitle, auraBugReportReviewUiState.previewTitle) || this.isPreviewLoading != auraBugReportReviewUiState.isPreviewLoading || !C7384Etj.areEqual(this.previewTooLargeItem, auraBugReportReviewUiState.previewTooLargeItem) || !C7384Etj.areEqual(this.vmLogFetch, auraBugReportReviewUiState.vmLogFetch) || !C7384Etj.areEqual(this.busyItem, auraBugReportReviewUiState.busyItem)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = AuraBugReportCollector.CollectedItem.$stable;
        $stable = i | i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuraBugReportReviewUiState copy$default(AuraBugReportReviewUiState auraBugReportReviewUiState, boolean z, boolean z2, boolean z3, AHD ahd, String str, boolean z4, AuraBugReportCollector.CollectedItem collectedItem, AuraVmLogFetchState auraVmLogFetchState, BusyItem busyItem, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auraBugReportReviewUiState.isConfidentialOrUnclassified;
        }
        if ((i & 2) != 0) {
            z2 = auraBugReportReviewUiState.includeLogs;
        }
        if ((i & 4) != 0) {
            z3 = auraBugReportReviewUiState.isCollecting;
        }
        if ((i & 8) != 0) {
            ahd = auraBugReportReviewUiState.items;
        }
        if ((i & 16) != 0) {
            str = auraBugReportReviewUiState.previewTitle;
        }
        if ((i & 32) != 0) {
            z4 = auraBugReportReviewUiState.isPreviewLoading;
        }
        if ((i & 64) != 0) {
            collectedItem = auraBugReportReviewUiState.previewTooLargeItem;
        }
        if ((i & 128) != 0) {
            auraVmLogFetchState = auraBugReportReviewUiState.vmLogFetch;
        }
        if ((i & 256) != 0) {
            busyItem = auraBugReportReviewUiState.busyItem;
        }
        return auraBugReportReviewUiState.copy(z, z2, z3, ahd, str, z4, collectedItem, auraVmLogFetchState, busyItem);
    }

    public final boolean component1() {
        return this.isConfidentialOrUnclassified;
    }

    public final boolean component2() {
        return this.includeLogs;
    }

    public final boolean component3() {
        return this.isCollecting;
    }

    public final AHD<AuraBugReportCollector.CollectedItem> component4() {
        return this.items;
    }

    public final String component5() {
        return this.previewTitle;
    }

    public final boolean component6() {
        return this.isPreviewLoading;
    }

    public final AuraBugReportCollector.CollectedItem component7() {
        return this.previewTooLargeItem;
    }

    public final AuraVmLogFetchState component8() {
        return this.vmLogFetch;
    }

    public final BusyItem component9() {
        return this.busyItem;
    }

    public final BusyItem getBusyItem() {
        return this.busyItem;
    }

    public final boolean getIncludeLogs() {
        return this.includeLogs;
    }

    public final AHD<AuraBugReportCollector.CollectedItem> getItems() {
        return this.items;
    }

    public final String getPreviewTitle() {
        return this.previewTitle;
    }

    public final AuraBugReportCollector.CollectedItem getPreviewTooLargeItem() {
        return this.previewTooLargeItem;
    }

    public final AuraVmLogFetchState getVmLogFetch() {
        return this.vmLogFetch;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.vmLogFetch, (C0KA.A01((AnonymousClass005.A0F(this.items, C0KA.A01(C0KA.A01(C0KA.A02(this.isConfidentialOrUnclassified), this.includeLogs), this.isCollecting)) + AnonymousClass006.A0G(this.previewTitle)) * 31, this.isPreviewLoading) + AnonymousClass006.A0D(this.previewTooLargeItem)) * 31) + C06G.A04(this.busyItem);
    }

    public final boolean isCollecting() {
        return this.isCollecting;
    }

    public final boolean isConfidentialOrUnclassified() {
        return this.isConfidentialOrUnclassified;
    }

    public final boolean isPreviewLoading() {
        return this.isPreviewLoading;
    }

    public /* synthetic */ AuraBugReportReviewUiState(boolean z, boolean z2, boolean z3, AHD ahd, String str, boolean z4, AuraBugReportCollector.CollectedItem collectedItem, AuraVmLogFetchState auraVmLogFetchState, BusyItem busyItem, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), (i & 8) != 0 ? AHI.A01 : ahd, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : collectedItem, (i & 128) != 0 ? AuraVmLogFetchState.Idle.INSTANCE : auraVmLogFetchState, (i & 256) != 0 ? null : busyItem);
    }

    public String toString() {
        return super.toString();
    }

    public AuraBugReportReviewUiState(boolean z, boolean z2, boolean z3, AHD<AuraBugReportCollector.CollectedItem> ahd, String str, boolean z4, AuraBugReportCollector.CollectedItem collectedItem, AuraVmLogFetchState auraVmLogFetchState, BusyItem busyItem) {
        C7384Etj.A0Y(ahd, 3);
        C7384Etj.A0Y(auraVmLogFetchState, 7);
        this.isConfidentialOrUnclassified = z;
        this.includeLogs = z2;
        this.isCollecting = z3;
        this.items = ahd;
        this.previewTitle = str;
        this.isPreviewLoading = z4;
        this.previewTooLargeItem = collectedItem;
        this.vmLogFetch = auraVmLogFetchState;
        this.busyItem = busyItem;
    }

    public AuraBugReportReviewUiState() {
        this(false, false, false, AHI.A01, null, false, null, AuraVmLogFetchState.Idle.INSTANCE, null);
    }
}
