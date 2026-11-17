package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import com.facebook.aura.hotels.HotelLoadState;

/* loaded from: classes4.dex */
public final class HotelSelectionUiState extends C06G {
    public static final int $stable = 0;
    public final HotelLoadState<HotelSelection> detail;
    public final HotelReserveAction reserveAction;
    public final HotelReviewState review;
    public final HotelReviewState roomDiscussion;
    public final String visitWebsiteUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionUiState) {
                HotelSelectionUiState hotelSelectionUiState = (HotelSelectionUiState) obj;
                if (!C7384Etj.areEqual(this.detail, hotelSelectionUiState.detail) || this.review != hotelSelectionUiState.review || this.roomDiscussion != hotelSelectionUiState.roomDiscussion || !C7384Etj.areEqual(this.visitWebsiteUrl, hotelSelectionUiState.visitWebsiteUrl) || !C7384Etj.areEqual(this.reserveAction, hotelSelectionUiState.reserveAction)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ HotelSelectionUiState(HotelLoadState hotelLoadState, HotelReviewState hotelReviewState, HotelReviewState hotelReviewState2, String str, HotelReserveAction hotelReserveAction, int i, C06H c06h) {
        this((i & 1) != 0 ? HotelLoadState.Loading.INSTANCE : hotelLoadState, (i & 2) != 0 ? HotelReviewState.IDLE : hotelReviewState, (i & 4) != 0 ? HotelReviewState.IDLE : hotelReviewState2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : hotelReserveAction);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelSelectionUiState copy$default(HotelSelectionUiState hotelSelectionUiState, HotelLoadState hotelLoadState, HotelReviewState hotelReviewState, HotelReviewState hotelReviewState2, String str, HotelReserveAction hotelReserveAction, int i, Object obj) {
        if ((i & 1) != 0) {
            hotelLoadState = hotelSelectionUiState.detail;
        }
        if ((i & 2) != 0) {
            hotelReviewState = hotelSelectionUiState.review;
        }
        if ((i & 4) != 0) {
            hotelReviewState2 = hotelSelectionUiState.roomDiscussion;
        }
        if ((i & 8) != 0) {
            str = hotelSelectionUiState.visitWebsiteUrl;
        }
        if ((i & 16) != 0) {
            hotelReserveAction = hotelSelectionUiState.reserveAction;
        }
        return hotelSelectionUiState.copy(hotelLoadState, hotelReviewState, hotelReviewState2, str, hotelReserveAction);
    }

    public final HotelLoadState<HotelSelection> component1() {
        return this.detail;
    }

    public final HotelReviewState component2() {
        return this.review;
    }

    public final HotelReviewState component3() {
        return this.roomDiscussion;
    }

    public final String component4() {
        return this.visitWebsiteUrl;
    }

    public final HotelReserveAction component5() {
        return this.reserveAction;
    }

    public final HotelLoadState<HotelSelection> getDetail() {
        return this.detail;
    }

    public final HotelReserveAction getReserveAction() {
        return this.reserveAction;
    }

    public final boolean getReserveEnabled() {
        if (this.reserveAction != null) {
            HotelReviewState hotelReviewState = this.review;
            HotelReviewState hotelReviewState2 = HotelReviewState.IDLE;
            if (hotelReviewState == hotelReviewState2 && this.roomDiscussion == hotelReviewState2) {
                return true;
            }
        }
        return false;
    }

    public final HotelReviewState getReview() {
        return this.review;
    }

    public final HotelReviewState getRoomDiscussion() {
        return this.roomDiscussion;
    }

    public final String getVisitWebsiteUrl() {
        return this.visitWebsiteUrl;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.roomDiscussion, AnonymousClass005.A0F(this.review, AnonymousClass005.A0E(this.detail))) + AnonymousClass006.A0G(this.visitWebsiteUrl)) * 31) + C3cH.A02(this.reserveAction);
    }

    public final HotelSelectionUiState copy(HotelLoadState<HotelSelection> hotelLoadState, HotelReviewState hotelReviewState, HotelReviewState hotelReviewState2, String str, HotelReserveAction hotelReserveAction) {
        AnonymousClass005.A0x(hotelLoadState, hotelReviewState, hotelReviewState2);
        return new HotelSelectionUiState(hotelLoadState, hotelReviewState, hotelReviewState2, str, hotelReserveAction);
    }

    public String toString() {
        return super.toString();
    }

    public HotelSelectionUiState(HotelLoadState<HotelSelection> hotelLoadState, HotelReviewState hotelReviewState, HotelReviewState hotelReviewState2, String str, HotelReserveAction hotelReserveAction) {
        AnonymousClass005.A0x(hotelLoadState, hotelReviewState, hotelReviewState2);
        this.detail = hotelLoadState;
        this.review = hotelReviewState;
        this.roomDiscussion = hotelReviewState2;
        this.visitWebsiteUrl = str;
        this.reserveAction = hotelReserveAction;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HotelSelectionUiState() {
        HotelLoadState.Loading loading = HotelLoadState.Loading.INSTANCE;
        HotelReviewState hotelReviewState = HotelReviewState.IDLE;
        this(loading, hotelReviewState, hotelReviewState, null, null);
    }
}
