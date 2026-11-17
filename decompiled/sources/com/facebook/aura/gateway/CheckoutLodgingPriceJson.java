package com.facebook.aura.gateway;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
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
public final class CheckoutLodgingPriceJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement fees;
    public final JsonElement nightly_base_rates;

    public final class Companion {
        public final C9hr<CheckoutLodgingPriceJson> serializer() {
            return CheckoutLodgingPriceJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingPriceJson checkoutLodgingPriceJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingPriceJson.fees != null) {
            c9j5.AAP(checkoutLodgingPriceJson.fees, JsonElementSerializer.A00, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingPriceJson.nightly_base_rates != null) {
            c9j5.AAP(checkoutLodgingPriceJson.nightly_base_rates, JsonElementSerializer.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPriceJson) {
                CheckoutLodgingPriceJson checkoutLodgingPriceJson = (CheckoutLodgingPriceJson) obj;
                if (!C7384Etj.areEqual(this.fees, checkoutLodgingPriceJson.fees) || !C7384Etj.areEqual(this.nightly_base_rates, checkoutLodgingPriceJson.nightly_base_rates)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPriceJson copy$default(CheckoutLodgingPriceJson checkoutLodgingPriceJson, JsonElement jsonElement, JsonElement jsonElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonElement = checkoutLodgingPriceJson.fees;
        }
        if ((i & 2) != 0) {
            jsonElement2 = checkoutLodgingPriceJson.nightly_base_rates;
        }
        return new CheckoutLodgingPriceJson(jsonElement, jsonElement2);
    }

    public final JsonElement component1() {
        return this.fees;
    }

    public final JsonElement component2() {
        return this.nightly_base_rates;
    }

    public final CheckoutLodgingPriceJson copy(JsonElement jsonElement, JsonElement jsonElement2) {
        return new CheckoutLodgingPriceJson(jsonElement, jsonElement2);
    }

    public final JsonElement getFees() {
        return this.fees;
    }

    public final JsonElement getNightly_base_rates() {
        return this.nightly_base_rates;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.fees) * 31) + C3cH.A02(this.nightly_base_rates);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.CheckoutLodgingPrice toDomain() {
        /*
            r5 = this;
            kotlinx.serialization.json.JsonElement r3 = r5.fees
            r2 = 0
            if (r3 == 0) goto L1b
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L12
            com.facebook.aura.gateway.CheckoutLodgingFeeJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingFeeJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L12
            X.A64 r0 = X.C3cG.A19(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = X.C9sZ.A00(r0, r1, r3)     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L17:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L1c
        L1b:
            r1 = r2
        L1c:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L22
            X.AGi r1 = X.C0881AGi.A00
        L22:
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r1)
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.CheckoutLodgingFeeJson r0 = (com.facebook.aura.gateway.CheckoutLodgingFeeJson) r0
            com.facebook.aura.gateway.CheckoutLodgingFee r0 = r0.toDomain()
            r2.add(r0)
            goto L2a
        L3e:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L86
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L86
        L48:
            java.util.List r3 = X.AbstractC0878AGe.A0U(r2)
        L4c:
            kotlinx.serialization.json.JsonElement r1 = r5.nightly_base_rates
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L56
            kotlinx.serialization.json.JsonArray r1 = (kotlinx.serialization.json.JsonArray) r1
            if (r1 != 0) goto L58
        L56:
            X.AGi r1 = X.C0881AGi.A00
        L58:
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r4 = r1.iterator()
        L60:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r2 = r4.next()
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            if (r2 == 0) goto L60
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L77
            com.facebook.aura.gateway.CheckoutLodgingNightlyRateJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingNightlyRateJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L77
            goto L7c
        L77:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L7c:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L60
            if (r1 == 0) goto L60
            r5.add(r1)
            goto L60
        L86:
            java.util.Iterator r1 = r2.iterator()
        L8a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L8a
            X.AGi r3 = X.C0881AGi.A00
            goto L4c
        L99:
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r5.iterator()
        La1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.CheckoutLodgingNightlyRateJson r0 = (com.facebook.aura.gateway.CheckoutLodgingNightlyRateJson) r0
            com.facebook.aura.gateway.CheckoutLodgingNightlyRate r0 = r0.toDomain()
            if (r0 == 0) goto La1
            r2.add(r0)
            goto La1
        Lb7:
            com.facebook.aura.gateway.CheckoutLodgingPrice r0 = new com.facebook.aura.gateway.CheckoutLodgingPrice
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.CheckoutLodgingPriceJson.toDomain():com.facebook.aura.gateway.CheckoutLodgingPrice");
    }

    public CheckoutLodgingPriceJson(JsonElement jsonElement, JsonElement jsonElement2) {
        this.fees = jsonElement;
        this.nightly_base_rates = jsonElement2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingPriceJson(int i, JsonElement jsonElement, JsonElement jsonElement2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.fees = null;
        } else {
            this.fees = jsonElement;
        }
        if ((i & 2) == 0) {
            this.nightly_base_rates = null;
        } else {
            this.nightly_base_rates = jsonElement2;
        }
    }

    public /* synthetic */ CheckoutLodgingPriceJson(JsonElement jsonElement, JsonElement jsonElement2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : jsonElement, (i & 2) != 0 ? null : jsonElement2);
    }

    public CheckoutLodgingPriceJson() {
        this(null, null);
    }
}
