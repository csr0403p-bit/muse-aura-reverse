package com.facebook.aura.hotels;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class HotelSelectionCancellationJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String description;
    public final Boolean free_cancellation;
    public final String free_cancellation_until;
    public final JsonElement penalties;
    public final String policy_text;
    public final Boolean refundable;

    public final class Companion {
        public final C9hr<HotelSelectionCancellationJson> serializer() {
            return HotelSelectionCancellationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HotelSelectionCancellationJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ HotelSelectionCancellationJson copy$default(HotelSelectionCancellationJson hotelSelectionCancellationJson, Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, int i, Object obj) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str4 = str;
        String str5 = str2;
        JsonElement jsonElement2 = jsonElement;
        String str6 = str3;
        if ((i & 1) != 0) {
            bool3 = hotelSelectionCancellationJson.refundable;
        }
        if ((i & 2) != 0) {
            bool4 = hotelSelectionCancellationJson.free_cancellation;
        }
        if ((i & 4) != 0) {
            str4 = hotelSelectionCancellationJson.free_cancellation_until;
        }
        if ((i & 8) != 0) {
            str5 = hotelSelectionCancellationJson.policy_text;
        }
        if ((i & 16) != 0) {
            jsonElement2 = hotelSelectionCancellationJson.penalties;
        }
        if ((i & 32) != 0) {
            str6 = hotelSelectionCancellationJson.description;
        }
        return new HotelSelectionCancellationJson(bool3, bool4, str4, str5, jsonElement2, str6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_hotels_impl_impl(HotelSelectionCancellationJson hotelSelectionCancellationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || hotelSelectionCancellationJson.refundable != null) {
            c9j5.AAP(hotelSelectionCancellationJson.refundable, C07839ix.A00, c9iZ, 0);
        }
        if (zAfR || hotelSelectionCancellationJson.free_cancellation != null) {
            c9j5.AAP(hotelSelectionCancellationJson.free_cancellation, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || hotelSelectionCancellationJson.free_cancellation_until != null) {
            c9j5.AAP(hotelSelectionCancellationJson.free_cancellation_until, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || hotelSelectionCancellationJson.policy_text != null) {
            c9j5.AAP(hotelSelectionCancellationJson.policy_text, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || hotelSelectionCancellationJson.penalties != null) {
            c9j5.AAP(hotelSelectionCancellationJson.penalties, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || hotelSelectionCancellationJson.description != null) {
            c9j5.AAP(hotelSelectionCancellationJson.description, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HotelSelectionCancellationJson) {
                HotelSelectionCancellationJson hotelSelectionCancellationJson = (HotelSelectionCancellationJson) obj;
                if (!C7384Etj.areEqual(this.refundable, hotelSelectionCancellationJson.refundable) || !C7384Etj.areEqual(this.free_cancellation, hotelSelectionCancellationJson.free_cancellation) || !C7384Etj.areEqual(this.free_cancellation_until, hotelSelectionCancellationJson.free_cancellation_until) || !C7384Etj.areEqual(this.policy_text, hotelSelectionCancellationJson.policy_text) || !C7384Etj.areEqual(this.penalties, hotelSelectionCancellationJson.penalties) || !C7384Etj.areEqual(this.description, hotelSelectionCancellationJson.description)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Boolean component1() {
        return this.refundable;
    }

    public final Boolean component2() {
        return this.free_cancellation;
    }

    public final String component3() {
        return this.free_cancellation_until;
    }

    public final String component4() {
        return this.policy_text;
    }

    public final JsonElement component5() {
        return this.penalties;
    }

    public final String component6() {
        return this.description;
    }

    public final HotelSelectionCancellationJson copy(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3) {
        return new HotelSelectionCancellationJson(bool, bool2, str, str2, jsonElement, str3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final Boolean getFree_cancellation() {
        return this.free_cancellation;
    }

    public final String getFree_cancellation_until() {
        return this.free_cancellation_until;
    }

    public final JsonElement getPenalties() {
        return this.penalties;
    }

    public final String getPolicy_text() {
        return this.policy_text;
    }

    public final Boolean getRefundable() {
        return this.refundable;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0D(this.refundable) * 31) + AnonymousClass006.A0D(this.free_cancellation)) * 31) + AnonymousClass006.A0G(this.free_cancellation_until)) * 31) + AnonymousClass006.A0G(this.policy_text)) * 31) + AnonymousClass006.A0D(this.penalties)) * 31) + AnonymousClass005.A0H(this.description);
    }

    public final HotelCancellation toDomain() {
        List list;
        boolean z;
        Boolean bool = this.refundable;
        Boolean bool2 = this.free_cancellation;
        String strHotelNonBlank = HotelResultModelsKt.hotelNonBlank(this.free_cancellation_until);
        String strHotelNonBlank2 = HotelResultModelsKt.hotelNonBlank(this.policy_text);
        JsonElement jsonElement = this.penalties;
        if (!(jsonElement instanceof JsonArray) || (list = (JsonArray) jsonElement) == null) {
            list = C0881AGi.A00;
        }
        if ((list instanceof Collection) && C3cG.A1N(list)) {
            z = false;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof JsonObject) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        return new HotelCancellation(bool, bool2, strHotelNonBlank, strHotelNonBlank2, z, HotelResultModelsKt.hotelNonBlank(this.description));
    }

    public String toString() {
        return super.toString();
    }

    public HotelSelectionCancellationJson(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3) {
        this.refundable = bool;
        this.free_cancellation = bool2;
        this.free_cancellation_until = str;
        this.policy_text = str2;
        this.penalties = jsonElement;
        this.description = str3;
    }

    public /* synthetic */ HotelSelectionCancellationJson(Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : jsonElement, (i & 32) != 0 ? null : str3);
    }

    public /* synthetic */ HotelSelectionCancellationJson(int i, Boolean bool, Boolean bool2, String str, String str2, JsonElement jsonElement, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.refundable = null;
        } else {
            this.refundable = bool;
        }
        if ((i & 2) == 0) {
            this.free_cancellation = null;
        } else {
            this.free_cancellation = bool2;
        }
        if ((i & 4) == 0) {
            this.free_cancellation_until = null;
        } else {
            this.free_cancellation_until = str;
        }
        if ((i & 8) == 0) {
            this.policy_text = null;
        } else {
            this.policy_text = str2;
        }
        if ((i & 16) == 0) {
            this.penalties = null;
        } else {
            this.penalties = jsonElement;
        }
        if ((i & 32) == 0) {
            this.description = null;
        } else {
            this.description = str3;
        }
    }
}
