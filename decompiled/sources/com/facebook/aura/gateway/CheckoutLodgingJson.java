package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final CheckoutLodgingCancellationJson cancellation;
    public final String location;
    public final JsonElement payment;
    public final JsonElement policies;
    public final JsonElement price;
    public final CheckoutLodgingRoomJson room;
    public final CheckoutLodgingTripJson trip;

    public final class Companion {
        public final C9hr<CheckoutLodgingJson> serializer() {
            return CheckoutLodgingJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CheckoutLodgingJson() {
        this(null, null, null, null, null, null, null);
    }

    public static /* synthetic */ CheckoutLodgingJson copy$default(CheckoutLodgingJson checkoutLodgingJson, String str, CheckoutLodgingTripJson checkoutLodgingTripJson, CheckoutLodgingRoomJson checkoutLodgingRoomJson, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, int i, Object obj) {
        String str2 = str;
        CheckoutLodgingTripJson checkoutLodgingTripJson2 = checkoutLodgingTripJson;
        CheckoutLodgingRoomJson checkoutLodgingRoomJson2 = checkoutLodgingRoomJson;
        CheckoutLodgingCancellationJson checkoutLodgingCancellationJson2 = checkoutLodgingCancellationJson;
        JsonElement jsonElement4 = jsonElement;
        JsonElement jsonElement5 = jsonElement2;
        JsonElement jsonElement6 = jsonElement3;
        if ((i & 1) != 0) {
            str2 = checkoutLodgingJson.location;
        }
        if ((i & 2) != 0) {
            checkoutLodgingTripJson2 = checkoutLodgingJson.trip;
        }
        if ((i & 4) != 0) {
            checkoutLodgingRoomJson2 = checkoutLodgingJson.room;
        }
        if ((i & 8) != 0) {
            checkoutLodgingCancellationJson2 = checkoutLodgingJson.cancellation;
        }
        if ((i & 16) != 0) {
            jsonElement4 = checkoutLodgingJson.price;
        }
        if ((i & 32) != 0) {
            jsonElement5 = checkoutLodgingJson.payment;
        }
        if ((i & 64) != 0) {
            jsonElement6 = checkoutLodgingJson.policies;
        }
        return new CheckoutLodgingJson(str2, checkoutLodgingTripJson2, checkoutLodgingRoomJson2, checkoutLodgingCancellationJson2, jsonElement4, jsonElement5, jsonElement6);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingJson checkoutLodgingJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingJson.location != null) {
            c9j5.AAP(checkoutLodgingJson.location, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingJson.trip != null) {
            c9j5.AAP(checkoutLodgingJson.trip, CheckoutLodgingTripJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || checkoutLodgingJson.room != null) {
            c9j5.AAP(checkoutLodgingJson.room, CheckoutLodgingRoomJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || checkoutLodgingJson.cancellation != null) {
            c9j5.AAP(checkoutLodgingJson.cancellation, CheckoutLodgingCancellationJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || checkoutLodgingJson.price != null) {
            c9j5.AAP(checkoutLodgingJson.price, JsonElementSerializer.A00, c9iZ, 4);
        }
        if (zAfR || checkoutLodgingJson.payment != null) {
            c9j5.AAP(checkoutLodgingJson.payment, JsonElementSerializer.A00, c9iZ, 5);
        }
        if (zAfR || checkoutLodgingJson.policies != null) {
            c9j5.AAP(checkoutLodgingJson.policies, JsonElementSerializer.A00, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingJson) {
                CheckoutLodgingJson checkoutLodgingJson = (CheckoutLodgingJson) obj;
                if (!C7384Etj.areEqual(this.location, checkoutLodgingJson.location) || !C7384Etj.areEqual(this.trip, checkoutLodgingJson.trip) || !C7384Etj.areEqual(this.room, checkoutLodgingJson.room) || !C7384Etj.areEqual(this.cancellation, checkoutLodgingJson.cancellation) || !C7384Etj.areEqual(this.price, checkoutLodgingJson.price) || !C7384Etj.areEqual(this.payment, checkoutLodgingJson.payment) || !C7384Etj.areEqual(this.policies, checkoutLodgingJson.policies)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.location;
    }

    public final CheckoutLodgingTripJson component2() {
        return this.trip;
    }

    public final CheckoutLodgingRoomJson component3() {
        return this.room;
    }

    public final CheckoutLodgingCancellationJson component4() {
        return this.cancellation;
    }

    public final JsonElement component5() {
        return this.price;
    }

    public final JsonElement component6() {
        return this.payment;
    }

    public final JsonElement component7() {
        return this.policies;
    }

    public final CheckoutLodgingJson copy(String str, CheckoutLodgingTripJson checkoutLodgingTripJson, CheckoutLodgingRoomJson checkoutLodgingRoomJson, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3) {
        return new CheckoutLodgingJson(str, checkoutLodgingTripJson, checkoutLodgingRoomJson, checkoutLodgingCancellationJson, jsonElement, jsonElement2, jsonElement3);
    }

    public final CheckoutLodgingCancellationJson getCancellation() {
        return this.cancellation;
    }

    public final String getLocation() {
        return this.location;
    }

    public final JsonElement getPayment() {
        return this.payment;
    }

    public final JsonElement getPolicies() {
        return this.policies;
    }

    public final JsonElement getPrice() {
        return this.price;
    }

    public final CheckoutLodgingRoomJson getRoom() {
        return this.room;
    }

    public final CheckoutLodgingTripJson getTrip() {
        return this.trip;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.location) * 31) + AnonymousClass006.A0D(this.trip)) * 31) + AnonymousClass006.A0D(this.room)) * 31) + AnonymousClass006.A0D(this.cancellation)) * 31) + AnonymousClass006.A0D(this.price)) * 31) + AnonymousClass006.A0D(this.payment)) * 31) + C3cH.A02(this.policies);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.CheckoutLodging toDomain() {
        /*
            r10 = this;
            java.lang.String r0 = r10.location
            r8 = 0
            if (r0 == 0) goto L2c
            java.lang.String r3 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
        L9:
            com.facebook.aura.gateway.CheckoutLodgingTripJson r0 = r10.trip
            if (r0 == 0) goto L2a
            com.facebook.aura.gateway.CheckoutLodgingTrip r4 = r0.toDomain()
        L11:
            com.facebook.aura.gateway.CheckoutLodgingRoomJson r0 = r10.room
            if (r0 == 0) goto L28
            com.facebook.aura.gateway.CheckoutLodgingRoom r5 = r0.toDomain()
        L19:
            com.facebook.aura.gateway.CheckoutLodgingCancellationJson r0 = r10.cancellation
            if (r0 == 0) goto L26
            com.facebook.aura.gateway.CheckoutLodgingCancellation r6 = r0.toDomain()
        L21:
            kotlinx.serialization.json.JsonElement r2 = r10.policies
            if (r2 == 0) goto L40
            goto L2e
        L26:
            r6 = r8
            goto L21
        L28:
            r5 = r8
            goto L19
        L2a:
            r4 = r8
            goto L11
        L2c:
            r3 = r8
            goto L9
        L2e:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L37
            com.facebook.aura.gateway.CheckoutLodgingPoliciesJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingPoliciesJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L3c:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L41
        L40:
            r1 = r8
        L41:
            com.facebook.aura.gateway.CheckoutLodgingPoliciesJson r1 = (com.facebook.aura.gateway.CheckoutLodgingPoliciesJson) r1
            if (r1 == 0) goto L54
            com.facebook.aura.gateway.CheckoutLodgingTaxesDisclosure r9 = r1.taxesDisclosure()
        L49:
            if (r3 != 0) goto L56
            if (r4 != 0) goto L56
            if (r5 != 0) goto L56
            if (r6 != 0) goto L56
            if (r9 != 0) goto L56
            return r8
        L54:
            r9 = r8
            goto L49
        L56:
            kotlinx.serialization.json.JsonElement r2 = r10.price
            if (r2 == 0) goto L6c
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L63
            com.facebook.aura.gateway.CheckoutLodgingPriceJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingPriceJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L63
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L68:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L6d
        L6c:
            r1 = r8
        L6d:
            com.facebook.aura.gateway.CheckoutLodgingPriceJson r1 = (com.facebook.aura.gateway.CheckoutLodgingPriceJson) r1
            if (r1 == 0) goto L7a
            com.facebook.aura.gateway.CheckoutLodgingPrice r7 = r1.toDomain()
        L75:
            kotlinx.serialization.json.JsonElement r2 = r10.payment
            if (r2 == 0) goto L8e
            goto L7c
        L7a:
            r7 = r8
            goto L75
        L7c:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L85
            com.facebook.aura.gateway.CheckoutLodgingPaymentJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingPaymentJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L8a:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L8f
        L8e:
            r1 = r8
        L8f:
            com.facebook.aura.gateway.CheckoutLodgingPaymentJson r1 = (com.facebook.aura.gateway.CheckoutLodgingPaymentJson) r1
            if (r1 == 0) goto L97
            com.facebook.aura.gateway.CheckoutLodgingPayment r8 = r1.toDomain()
        L97:
            com.facebook.aura.gateway.CheckoutLodging r2 = new com.facebook.aura.gateway.CheckoutLodging
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.CheckoutLodgingJson.toDomain():com.facebook.aura.gateway.CheckoutLodging");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingJson(int i, String str, CheckoutLodgingTripJson checkoutLodgingTripJson, CheckoutLodgingRoomJson checkoutLodgingRoomJson, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.location = null;
        } else {
            this.location = str;
        }
        if ((i & 2) == 0) {
            this.trip = null;
        } else {
            this.trip = checkoutLodgingTripJson;
        }
        if ((i & 4) == 0) {
            this.room = null;
        } else {
            this.room = checkoutLodgingRoomJson;
        }
        if ((i & 8) == 0) {
            this.cancellation = null;
        } else {
            this.cancellation = checkoutLodgingCancellationJson;
        }
        if ((i & 16) == 0) {
            this.price = null;
        } else {
            this.price = jsonElement;
        }
        if ((i & 32) == 0) {
            this.payment = null;
        } else {
            this.payment = jsonElement2;
        }
        if ((i & 64) == 0) {
            this.policies = null;
        } else {
            this.policies = jsonElement3;
        }
    }

    public CheckoutLodgingJson(String str, CheckoutLodgingTripJson checkoutLodgingTripJson, CheckoutLodgingRoomJson checkoutLodgingRoomJson, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3) {
        this.location = str;
        this.trip = checkoutLodgingTripJson;
        this.room = checkoutLodgingRoomJson;
        this.cancellation = checkoutLodgingCancellationJson;
        this.price = jsonElement;
        this.payment = jsonElement2;
        this.policies = jsonElement3;
    }

    public /* synthetic */ CheckoutLodgingJson(String str, CheckoutLodgingTripJson checkoutLodgingTripJson, CheckoutLodgingRoomJson checkoutLodgingRoomJson, CheckoutLodgingCancellationJson checkoutLodgingCancellationJson, JsonElement jsonElement, JsonElement jsonElement2, JsonElement jsonElement3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : checkoutLodgingTripJson, (i & 4) != 0 ? null : checkoutLodgingRoomJson, (i & 8) != 0 ? null : checkoutLodgingCancellationJson, (i & 16) != 0 ? null : jsonElement, (i & 32) != 0 ? null : jsonElement2, (i & 64) != 0 ? null : jsonElement3);
    }
}
