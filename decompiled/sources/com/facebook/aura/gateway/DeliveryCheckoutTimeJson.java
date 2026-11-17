package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C10571Hud;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import java.time.OffsetDateTime;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutTimeJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String end_at;
    public final String kind;
    public final String start_at;

    public final class Companion {
        public final C9hr<DeliveryCheckoutTimeJson> serializer() {
            return DeliveryCheckoutTimeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutTimeJson.kind != null) {
            c9j5.AAP(deliveryCheckoutTimeJson.kind, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutTimeJson.start_at != null) {
            c9j5.AAP(deliveryCheckoutTimeJson.start_at, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || deliveryCheckoutTimeJson.end_at != null) {
            c9j5.AAP(deliveryCheckoutTimeJson.end_at, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutTimeJson) {
                DeliveryCheckoutTimeJson deliveryCheckoutTimeJson = (DeliveryCheckoutTimeJson) obj;
                if (!C7384Etj.areEqual(this.kind, deliveryCheckoutTimeJson.kind) || !C7384Etj.areEqual(this.start_at, deliveryCheckoutTimeJson.start_at) || !C7384Etj.areEqual(this.end_at, deliveryCheckoutTimeJson.end_at)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DeliveryCheckoutTimeJson copy$default(DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deliveryCheckoutTimeJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = deliveryCheckoutTimeJson.start_at;
        }
        if ((i & 4) != 0) {
            str3 = deliveryCheckoutTimeJson.end_at;
        }
        return new DeliveryCheckoutTimeJson(str, str2, str3);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.start_at;
    }

    public final String component3() {
        return this.end_at;
    }

    public final DeliveryCheckoutTimeJson copy(String str, String str2, String str3) {
        return new DeliveryCheckoutTimeJson(str, str2, str3);
    }

    public final String getEnd_at() {
        return this.end_at;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getStart_at() {
        return this.start_at;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0G(this.kind) * 31) + AnonymousClass006.A0G(this.start_at)) * 31) + AnonymousClass005.A0H(this.end_at);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r2.equals("estimated_window") != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.DeliveryCheckoutTime toDomainOrNull() {
        /*
            r8 = this;
            java.lang.String r2 = r8.kind
            r7 = 0
            if (r2 == 0) goto L5b
            int r1 = r2.hashCode()
            r0 = -1836880958(0xffffffff92836bc2, float:-8.293827E-28)
            if (r1 == r0) goto L51
            r0 = -623607748(0xffffffffdad4803c, float:-2.99068451E16)
            if (r1 == r0) goto L48
            r0 = 1885199699(0x705ddd53, float:2.74655E29)
            if (r1 != r0) goto L5b
            java.lang.String r0 = "estimated_window"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
        L20:
            r6 = 1
        L21:
            java.lang.String r0 = r8.start_at
            if (r0 == 0) goto L5b
            java.lang.Long r0 = r8.epochMillisOrNull(r0)
            if (r0 == 0) goto L5b
            long r3 = r0.longValue()
            java.lang.String r0 = r8.end_at
            if (r0 == 0) goto L42
            java.lang.Long r5 = r8.epochMillisOrNull(r0)
            if (r5 == 0) goto L5b
            long r1 = r5.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L5b
            r7 = r5
        L42:
            com.facebook.aura.gateway.DeliveryCheckoutTime r0 = new com.facebook.aura.gateway.DeliveryCheckoutTime
            r0.<init>(r6, r3, r7)
            return r0
        L48:
            java.lang.String r0 = "estimated"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L20
            return r7
        L51:
            java.lang.String r0 = "scheduled_window"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L5b
            r6 = 0
            goto L21
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.DeliveryCheckoutTimeJson.toDomainOrNull():com.facebook.aura.gateway.DeliveryCheckoutTime");
    }

    public DeliveryCheckoutTimeJson(String str, String str2, String str3) {
        this.kind = str;
        this.start_at = str2;
        this.end_at = str3;
    }

    private final Long epochMillisOrNull(String str) {
        Object objA0s;
        try {
            objA0s = Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (Long) objA0s;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutTimeJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = null;
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.start_at = null;
        } else {
            this.start_at = str2;
        }
        if ((i & 4) == 0) {
            this.end_at = null;
        } else {
            this.end_at = str3;
        }
    }

    public /* synthetic */ DeliveryCheckoutTimeJson(String str, String str2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public DeliveryCheckoutTimeJson() {
        this(null, null, null);
    }
}
