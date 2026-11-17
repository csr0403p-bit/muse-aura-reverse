package com.facebook.aura.sharesheet;

import X.AGH;
import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchOpenGraphPreviewState;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class HatchShareSheetUiState extends C06G {
    public static final int $stable = HatchShareSheetData.$stable;
    public final HatchShareSheetData data;
    public final HatchShareEligibilityState eligibilityState;
    public final String ideaShareMediaUri;
    public final boolean isCheckingEligibility;
    public final boolean isPreparingIdeaShare;
    public final boolean isSharingDance;
    public final HatchShareDestination loadingDestination;
    public final HatchShareSheetLoadingState loadingState;
    public final HatchOpenGraphPreviewState openGraphPreviewState;
    public final Map<String, HatchRecipientSendState> recipientSendStates;
    public final boolean showsReviewBeforeSharing;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchShareSheetUiState) {
                HatchShareSheetUiState hatchShareSheetUiState = (HatchShareSheetUiState) obj;
                if (this.loadingState != hatchShareSheetUiState.loadingState || this.eligibilityState != hatchShareSheetUiState.eligibilityState || !C7384Etj.areEqual(this.data, hatchShareSheetUiState.data) || this.loadingDestination != hatchShareSheetUiState.loadingDestination || this.isCheckingEligibility != hatchShareSheetUiState.isCheckingEligibility || this.showsReviewBeforeSharing != hatchShareSheetUiState.showsReviewBeforeSharing || !C7384Etj.areEqual(this.recipientSendStates, hatchShareSheetUiState.recipientSendStates) || !C7384Etj.areEqual(this.openGraphPreviewState, hatchShareSheetUiState.openGraphPreviewState) || this.isPreparingIdeaShare != hatchShareSheetUiState.isPreparingIdeaShare || !C7384Etj.areEqual(this.ideaShareMediaUri, hatchShareSheetUiState.ideaShareMediaUri) || this.isSharingDance != hatchShareSheetUiState.isSharingDance) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchShareSheetUiState copy$default(HatchShareSheetUiState hatchShareSheetUiState, HatchShareSheetLoadingState hatchShareSheetLoadingState, HatchShareEligibilityState hatchShareEligibilityState, HatchShareSheetData hatchShareSheetData, HatchShareDestination hatchShareDestination, boolean z, boolean z2, Map map, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, boolean z3, String str, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchShareSheetLoadingState = hatchShareSheetUiState.loadingState;
        }
        if ((i & 2) != 0) {
            hatchShareEligibilityState = hatchShareSheetUiState.eligibilityState;
        }
        if ((i & 4) != 0) {
            hatchShareSheetData = hatchShareSheetUiState.data;
        }
        if ((i & 8) != 0) {
            hatchShareDestination = hatchShareSheetUiState.loadingDestination;
        }
        if ((i & 16) != 0) {
            z = hatchShareSheetUiState.isCheckingEligibility;
        }
        if ((i & 32) != 0) {
            z2 = hatchShareSheetUiState.showsReviewBeforeSharing;
        }
        if ((i & 64) != 0) {
            map = hatchShareSheetUiState.recipientSendStates;
        }
        if ((i & 128) != 0) {
            hatchOpenGraphPreviewState = hatchShareSheetUiState.openGraphPreviewState;
        }
        if ((i & 256) != 0) {
            z3 = hatchShareSheetUiState.isPreparingIdeaShare;
        }
        if ((i & 512) != 0) {
            str = hatchShareSheetUiState.ideaShareMediaUri;
        }
        if ((i & 1024) != 0) {
            z4 = hatchShareSheetUiState.isSharingDance;
        }
        return hatchShareSheetUiState.copy(hatchShareSheetLoadingState, hatchShareEligibilityState, hatchShareSheetData, hatchShareDestination, z, z2, map, hatchOpenGraphPreviewState, z3, str, z4);
    }

    public final HatchShareSheetLoadingState component1() {
        return this.loadingState;
    }

    public final String component10() {
        return this.ideaShareMediaUri;
    }

    public final boolean component11() {
        return this.isSharingDance;
    }

    public final HatchShareEligibilityState component2() {
        return this.eligibilityState;
    }

    public final HatchShareSheetData component3() {
        return this.data;
    }

    public final HatchShareDestination component4() {
        return this.loadingDestination;
    }

    public final boolean component5() {
        return this.isCheckingEligibility;
    }

    public final boolean component6() {
        return this.showsReviewBeforeSharing;
    }

    public final Map<String, HatchRecipientSendState> component7() {
        return this.recipientSendStates;
    }

    public final HatchOpenGraphPreviewState component8() {
        return this.openGraphPreviewState;
    }

    public final boolean component9() {
        return this.isPreparingIdeaShare;
    }

    public final HatchShareSheetData getData() {
        return this.data;
    }

    public final HatchShareEligibilityState getEligibilityState() {
        return this.eligibilityState;
    }

    public final String getIdeaShareMediaUri() {
        return this.ideaShareMediaUri;
    }

    public final HatchShareDestination getLoadingDestination() {
        return this.loadingDestination;
    }

    public final HatchShareSheetLoadingState getLoadingState() {
        return this.loadingState;
    }

    public final HatchOpenGraphPreviewState getOpenGraphPreviewState() {
        return this.openGraphPreviewState;
    }

    public final Map<String, HatchRecipientSendState> getRecipientSendStates() {
        return this.recipientSendStates;
    }

    public final boolean getShowsLicensedMusicNotice() {
        if (!this.isSharingDance) {
            return false;
        }
        AHD<HatchShareDestination> ahd = this.data.destinations;
        if ((ahd instanceof Collection) && ahd.isEmpty()) {
            return false;
        }
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            if (!((HatchShareDestination) it.next()).isMetaProperty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean getShowsReviewBeforeSharing() {
        return this.showsReviewBeforeSharing;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(AnonymousClass005.A0F(this.openGraphPreviewState, AnonymousClass005.A0F(this.recipientSendStates, C0KA.A01(C0KA.A01((AnonymousClass005.A0F(this.data, AnonymousClass005.A0F(this.eligibilityState, AnonymousClass005.A0E(this.loadingState))) + AnonymousClass006.A0D(this.loadingDestination)) * 31, this.isCheckingEligibility), this.showsReviewBeforeSharing))), this.isPreparingIdeaShare) + AnonymousClass005.A0H(this.ideaShareMediaUri)) * 31, this.isSharingDance);
    }

    public final boolean isCheckingEligibility() {
        return this.isCheckingEligibility;
    }

    public final boolean isPreparingIdeaShare() {
        return this.isPreparingIdeaShare;
    }

    public final boolean isSharingDance() {
        return this.isSharingDance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchShareSheetUiState(HatchShareSheetLoadingState hatchShareSheetLoadingState, HatchShareEligibilityState hatchShareEligibilityState, HatchShareSheetData hatchShareSheetData, HatchShareDestination hatchShareDestination, boolean z, boolean z2, Map<String, ? extends HatchRecipientSendState> map, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, boolean z3, String str, boolean z4) {
        AnonymousClass005.A0x(hatchShareSheetLoadingState, hatchShareEligibilityState, hatchShareSheetData);
        AnonymousClass003.A10(map, hatchOpenGraphPreviewState);
        this.loadingState = hatchShareSheetLoadingState;
        this.eligibilityState = hatchShareEligibilityState;
        this.data = hatchShareSheetData;
        this.loadingDestination = hatchShareDestination;
        this.isCheckingEligibility = z;
        this.showsReviewBeforeSharing = z2;
        this.recipientSendStates = map;
        this.openGraphPreviewState = hatchOpenGraphPreviewState;
        this.isPreparingIdeaShare = z3;
        this.ideaShareMediaUri = str;
        this.isSharingDance = z4;
    }

    public final HatchShareSheetUiState copy(HatchShareSheetLoadingState hatchShareSheetLoadingState, HatchShareEligibilityState hatchShareEligibilityState, HatchShareSheetData hatchShareSheetData, HatchShareDestination hatchShareDestination, boolean z, boolean z2, Map<String, ? extends HatchRecipientSendState> map, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, boolean z3, String str, boolean z4) {
        AnonymousClass005.A0x(hatchShareSheetLoadingState, hatchShareEligibilityState, hatchShareSheetData);
        AnonymousClass003.A10(map, hatchOpenGraphPreviewState);
        return new HatchShareSheetUiState(hatchShareSheetLoadingState, hatchShareEligibilityState, hatchShareSheetData, hatchShareDestination, z, z2, map, hatchOpenGraphPreviewState, z3, str, z4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchShareSheetUiState(HatchShareSheetLoadingState hatchShareSheetLoadingState, HatchShareEligibilityState hatchShareEligibilityState, HatchShareSheetData hatchShareSheetData, HatchShareDestination hatchShareDestination, boolean z, boolean z2, Map map, HatchOpenGraphPreviewState hatchOpenGraphPreviewState, boolean z3, String str, boolean z4, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchShareSheetLoadingState.LOADING : hatchShareSheetLoadingState, hatchShareEligibilityState, hatchShareSheetData, (i & 8) != 0 ? null : hatchShareDestination, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? false : z2, (i & 64) != 0 ? AGH.A0E() : map, (i & 128) != 0 ? HatchOpenGraphPreviewState.Unavailable.INSTANCE : hatchOpenGraphPreviewState, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? null : str, (i & 1024) != 0 ? false : z4);
    }
}
