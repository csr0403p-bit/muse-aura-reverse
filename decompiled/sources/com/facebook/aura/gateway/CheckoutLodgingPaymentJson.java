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
public final class CheckoutLodgingPaymentJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonElement due_at_property;
    public final JsonElement installments;

    public final class Companion {
        public final C9hr<CheckoutLodgingPaymentJson> serializer() {
            return CheckoutLodgingPaymentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingPaymentJson checkoutLodgingPaymentJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingPaymentJson.due_at_property != null) {
            c9j5.AAP(checkoutLodgingPaymentJson.due_at_property, JsonElementSerializer.A00, c9iZ, 0);
        }
        if (zAfR || checkoutLodgingPaymentJson.installments != null) {
            c9j5.AAP(checkoutLodgingPaymentJson.installments, JsonElementSerializer.A00, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingPaymentJson) {
                CheckoutLodgingPaymentJson checkoutLodgingPaymentJson = (CheckoutLodgingPaymentJson) obj;
                if (!C7384Etj.areEqual(this.due_at_property, checkoutLodgingPaymentJson.due_at_property) || !C7384Etj.areEqual(this.installments, checkoutLodgingPaymentJson.installments)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ CheckoutLodgingPaymentJson copy$default(CheckoutLodgingPaymentJson checkoutLodgingPaymentJson, JsonElement jsonElement, JsonElement jsonElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonElement = checkoutLodgingPaymentJson.due_at_property;
        }
        if ((i & 2) != 0) {
            jsonElement2 = checkoutLodgingPaymentJson.installments;
        }
        return new CheckoutLodgingPaymentJson(jsonElement, jsonElement2);
    }

    public final JsonElement component1() {
        return this.due_at_property;
    }

    public final JsonElement component2() {
        return this.installments;
    }

    public final CheckoutLodgingPaymentJson copy(JsonElement jsonElement, JsonElement jsonElement2) {
        return new CheckoutLodgingPaymentJson(jsonElement, jsonElement2);
    }

    public final JsonElement getDue_at_property() {
        return this.due_at_property;
    }

    public final JsonElement getInstallments() {
        return this.installments;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.due_at_property) * 31) + C3cH.A02(this.installments);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.CheckoutLodgingPayment toDomain() {
        /*
            r5 = this;
            kotlinx.serialization.json.JsonElement r2 = r5.due_at_property
            r4 = 0
            if (r2 == 0) goto L17
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Le
            com.facebook.aura.gateway.CheckoutLodgingMoneyJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingMoneyJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L13:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L18
        L17:
            r1 = r4
        L18:
            com.facebook.aura.gateway.CheckoutLodgingMoneyJson r1 = (com.facebook.aura.gateway.CheckoutLodgingMoneyJson) r1
            if (r1 == 0) goto L20
            com.facebook.aura.gateway.CheckoutLodgingMoney r4 = r1.toDomain()
        L20:
            kotlinx.serialization.json.JsonElement r1 = r5.installments
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L2a
            kotlinx.serialization.json.JsonArray r1 = (kotlinx.serialization.json.JsonArray) r1
            if (r1 != 0) goto L2c
        L2a:
            X.AGi r1 = X.C0881AGi.A00
        L2c:
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r3 = r1.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r2 = r3.next()
            kotlinx.serialization.json.JsonElement r2 = (kotlinx.serialization.json.JsonElement) r2
            if (r2 == 0) goto L34
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L4b
            com.facebook.aura.gateway.CheckoutLodgingInstallmentJson$$serializer r0 = com.facebook.aura.gateway.CheckoutLodgingInstallmentJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r1 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L50:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L34
            if (r1 == 0) goto L34
            r5.add(r1)
            goto L34
        L5a:
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r5.iterator()
        L62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r0 = r1.next()
            com.facebook.aura.gateway.CheckoutLodgingInstallmentJson r0 = (com.facebook.aura.gateway.CheckoutLodgingInstallmentJson) r0
            com.facebook.aura.gateway.CheckoutLodgingInstallment r0 = r0.toDomain()
            if (r0 == 0) goto L62
            r2.add(r0)
            goto L62
        L78:
            com.facebook.aura.gateway.CheckoutLodgingPayment r0 = new com.facebook.aura.gateway.CheckoutLodgingPayment
            r0.<init>(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.CheckoutLodgingPaymentJson.toDomain():com.facebook.aura.gateway.CheckoutLodgingPayment");
    }

    public CheckoutLodgingPaymentJson(JsonElement jsonElement, JsonElement jsonElement2) {
        this.due_at_property = jsonElement;
        this.installments = jsonElement2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingPaymentJson(int i, JsonElement jsonElement, JsonElement jsonElement2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.due_at_property = null;
        } else {
            this.due_at_property = jsonElement;
        }
        if ((i & 2) == 0) {
            this.installments = null;
        } else {
            this.installments = jsonElement2;
        }
    }

    public /* synthetic */ CheckoutLodgingPaymentJson(JsonElement jsonElement, JsonElement jsonElement2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : jsonElement, (i & 2) != 0 ? null : jsonElement2);
    }

    public CheckoutLodgingPaymentJson() {
        this(null, null);
    }
}
