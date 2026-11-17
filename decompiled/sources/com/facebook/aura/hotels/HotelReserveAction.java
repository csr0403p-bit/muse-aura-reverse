package com.facebook.aura.hotels;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public interface HotelReserveAction {

    public final class Chat extends C06G implements HotelReserveAction {
        public static final int $stable = 8;
        public final HotelBookingRequest request;

        public Chat(HotelBookingRequest hotelBookingRequest) {
            C7384Etj.A0Y(hotelBookingRequest, 0);
            this.request = hotelBookingRequest;
        }

        public final Chat copy(HotelBookingRequest hotelBookingRequest) {
            C7384Etj.A0Y(hotelBookingRequest, 0);
            return new Chat(hotelBookingRequest);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Chat) && C7384Etj.areEqual(this.request, ((Chat) obj).request));
        }

        public static /* synthetic */ Chat copy$default(Chat chat, HotelBookingRequest hotelBookingRequest, int i, Object obj) {
            if ((i & 1) != 0) {
                hotelBookingRequest = chat.request;
            }
            C7384Etj.A0Y(hotelBookingRequest, 0);
            return new Chat(hotelBookingRequest);
        }

        public final HotelBookingRequest component1() {
            return this.request;
        }

        public final HotelBookingRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class NativeReview implements HotelReserveAction {
        public static final int $stable = 0;
        public static final NativeReview INSTANCE = new NativeReview();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof NativeReview);
        }

        public String toString() {
            return "NativeReview";
        }

        public int hashCode() {
            return 1763404512;
        }
    }
}
