package com.facebook.aura.hotels;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C8j3;
import X.HsJ;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes4.dex */
public interface HotelDataSource {

    /* renamed from: com.facebook.aura.hotels.HotelDataSource$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: details-BWLJW6A$default, reason: not valid java name */
        public static /* synthetic */ Object m1062detailsBWLJW6A$default(HotelDataSource hotelDataSource, String str, String str2, boolean z, HtJ htJ, int i, Object obj) {
            if (obj == null) {
                return hotelDataSource.mo1059detailsBWLJW6A(str, str2, AnonymousClass005.A1O(i, z), htJ);
            }
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: details-BWLJW6A");
        }

        /* renamed from: results-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ Object m1063results0E7RQCE$default(HotelDataSource hotelDataSource, String str, boolean z, HtJ htJ, int i, Object obj) {
            if (obj == null) {
                return hotelDataSource.mo1061results0E7RQCE(str, AnonymousClass001.A1Q(i, z), htJ);
            }
            throw C8j3.A18("Super calls with default arguments not supported in this target, function: results-0E7RQCE");
        }

        public static void $default$invalidateDetails(HotelDataSource hotelDataSource, String str, String str2) {
        }

        public static /* synthetic */ void access$invalidateDetails$jd(HotelDataSource hotelDataSource, String str, String str2) {
        }
    }

    /* renamed from: askAboutRooms-BWLJW6A, reason: not valid java name */
    Object mo1058askAboutRoomsBWLJW6A(String str, String str2, HotelReviewSource hotelReviewSource, HtJ<? super HsJ<Unit>> htJ);

    /* renamed from: details-BWLJW6A, reason: not valid java name */
    Object mo1059detailsBWLJW6A(String str, String str2, boolean z, HtJ<? super HsJ<HotelSelection>> htJ);

    void invalidateDetails(String str, String str2);

    /* renamed from: requestBookingReview-BWLJW6A, reason: not valid java name */
    Object mo1060requestBookingReviewBWLJW6A(String str, String str2, HotelReviewSource hotelReviewSource, HtJ<? super HsJ<Unit>> htJ);

    /* renamed from: results-0E7RQCE, reason: not valid java name */
    Object mo1061results0E7RQCE(String str, boolean z, HtJ<? super HsJ<HotelResults>> htJ);

    public abstract class DefaultImpls {
        @Deprecated
        public static void invalidateDetails(HotelDataSource hotelDataSource, String str, String str2) {
            AnonymousClass003.A0x(str, str2);
        }
    }
}
