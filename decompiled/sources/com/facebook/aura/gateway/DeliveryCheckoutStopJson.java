package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class DeliveryCheckoutStopJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final DeliveryCheckoutAddressJson address;
    public final DeliveryCheckoutContactJson contact;
    public final String handoff;
    public final String id;
    public final String instructions;
    public final String role;
    public final DeliveryCheckoutTimeJson time;

    public final class Companion {
        public final C9hr<DeliveryCheckoutStopJson> serializer() {
            return DeliveryCheckoutStopJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public DeliveryCheckoutStopJson() {
        this(null, null, null, null, null, null, null);
    }

    public static /* synthetic */ DeliveryCheckoutStopJson copy$default(DeliveryCheckoutStopJson deliveryCheckoutStopJson, String str, String str2, DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, DeliveryCheckoutContactJson deliveryCheckoutContactJson, DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str3, String str4, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        DeliveryCheckoutAddressJson deliveryCheckoutAddressJson2 = deliveryCheckoutAddressJson;
        DeliveryCheckoutContactJson deliveryCheckoutContactJson2 = deliveryCheckoutContactJson;
        DeliveryCheckoutTimeJson deliveryCheckoutTimeJson2 = deliveryCheckoutTimeJson;
        String str7 = str3;
        String str8 = str4;
        if ((i & 1) != 0) {
            str5 = deliveryCheckoutStopJson.id;
        }
        if ((i & 2) != 0) {
            str6 = deliveryCheckoutStopJson.role;
        }
        if ((i & 4) != 0) {
            deliveryCheckoutAddressJson2 = deliveryCheckoutStopJson.address;
        }
        if ((i & 8) != 0) {
            deliveryCheckoutContactJson2 = deliveryCheckoutStopJson.contact;
        }
        if ((i & 16) != 0) {
            deliveryCheckoutTimeJson2 = deliveryCheckoutStopJson.time;
        }
        if ((i & 32) != 0) {
            str7 = deliveryCheckoutStopJson.handoff;
        }
        if ((i & 64) != 0) {
            str8 = deliveryCheckoutStopJson.instructions;
        }
        return new DeliveryCheckoutStopJson(str5, str6, deliveryCheckoutAddressJson2, deliveryCheckoutContactJson2, deliveryCheckoutTimeJson2, str7, str8);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(DeliveryCheckoutStopJson deliveryCheckoutStopJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || deliveryCheckoutStopJson.id != null) {
            c9j5.AAP(deliveryCheckoutStopJson.id, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || deliveryCheckoutStopJson.role != null) {
            c9j5.AAP(deliveryCheckoutStopJson.role, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || deliveryCheckoutStopJson.address != null) {
            c9j5.AAP(deliveryCheckoutStopJson.address, DeliveryCheckoutAddressJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || deliveryCheckoutStopJson.contact != null) {
            c9j5.AAP(deliveryCheckoutStopJson.contact, DeliveryCheckoutContactJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || deliveryCheckoutStopJson.time != null) {
            c9j5.AAP(deliveryCheckoutStopJson.time, DeliveryCheckoutTimeJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || deliveryCheckoutStopJson.handoff != null) {
            c9j5.AAP(deliveryCheckoutStopJson.handoff, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || deliveryCheckoutStopJson.instructions != null) {
            c9j5.AAP(deliveryCheckoutStopJson.instructions, C07779iq.A01, c9iZ, 6);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryCheckoutStopJson) {
                DeliveryCheckoutStopJson deliveryCheckoutStopJson = (DeliveryCheckoutStopJson) obj;
                if (!C7384Etj.areEqual(this.id, deliveryCheckoutStopJson.id) || !C7384Etj.areEqual(this.role, deliveryCheckoutStopJson.role) || !C7384Etj.areEqual(this.address, deliveryCheckoutStopJson.address) || !C7384Etj.areEqual(this.contact, deliveryCheckoutStopJson.contact) || !C7384Etj.areEqual(this.time, deliveryCheckoutStopJson.time) || !C7384Etj.areEqual(this.handoff, deliveryCheckoutStopJson.handoff) || !C7384Etj.areEqual(this.instructions, deliveryCheckoutStopJson.instructions)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.role;
    }

    public final DeliveryCheckoutAddressJson component3() {
        return this.address;
    }

    public final DeliveryCheckoutContactJson component4() {
        return this.contact;
    }

    public final DeliveryCheckoutTimeJson component5() {
        return this.time;
    }

    public final String component6() {
        return this.handoff;
    }

    public final String component7() {
        return this.instructions;
    }

    public final DeliveryCheckoutStopJson copy(String str, String str2, DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, DeliveryCheckoutContactJson deliveryCheckoutContactJson, DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str3, String str4) {
        return new DeliveryCheckoutStopJson(str, str2, deliveryCheckoutAddressJson, deliveryCheckoutContactJson, deliveryCheckoutTimeJson, str3, str4);
    }

    public final DeliveryCheckoutAddressJson getAddress() {
        return this.address;
    }

    public final DeliveryCheckoutContactJson getContact() {
        return this.contact;
    }

    public final String getHandoff() {
        return this.handoff;
    }

    public final String getId() {
        return this.id;
    }

    public final String getInstructions() {
        return this.instructions;
    }

    public final String getRole() {
        return this.role;
    }

    public final DeliveryCheckoutTimeJson getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass006.A0G(this.id) * 31) + AnonymousClass006.A0G(this.role)) * 31) + AnonymousClass006.A0D(this.address)) * 31) + AnonymousClass006.A0D(this.contact)) * 31) + AnonymousClass006.A0D(this.time)) * 31) + AnonymousClass006.A0G(this.handoff)) * 31) + AnonymousClass005.A0H(this.instructions);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.DeliveryCheckoutStop toDomainOrNull() {
        /*
            r10 = this;
            java.lang.String r0 = r10.id
            r9 = 0
            if (r0 == 0) goto L7e
            java.lang.String r2 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
            if (r2 == 0) goto L7e
            java.lang.String r1 = r10.role
            java.lang.String r0 = "pickup"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L73
            com.facebook.aura.gateway.DeliveryCheckoutStopRole r3 = com.facebook.aura.gateway.DeliveryCheckoutStopRole.PICKUP
        L17:
            com.facebook.aura.gateway.DeliveryCheckoutAddressJson r0 = r10.address
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.formatted
            if (r0 == 0) goto L7e
            java.lang.String r4 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
            if (r4 == 0) goto L7e
            com.facebook.aura.gateway.DeliveryCheckoutAddressJson r0 = r10.address
            java.lang.String r0 = r0.f62short
            if (r0 == 0) goto L31
            java.lang.String r5 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
            if (r5 != 0) goto L32
        L31:
            r5 = r4
        L32:
            java.lang.String r1 = r10.handoff
            if (r1 == 0) goto L71
            java.lang.String r0 = "meet_at_door"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L66
            com.facebook.aura.gateway.DeliveryCheckoutHandoff r8 = com.facebook.aura.gateway.DeliveryCheckoutHandoff.MEET_AT_DOOR
        L40:
            com.facebook.aura.gateway.DeliveryCheckoutTimeJson r0 = r10.time
            if (r0 == 0) goto L64
            com.facebook.aura.gateway.DeliveryCheckoutTime r7 = r0.toDomainOrNull()
        L48:
            com.facebook.aura.gateway.DeliveryCheckoutContactJson r0 = r10.contact
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L62
            java.lang.String r6 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
        L54:
            java.lang.String r0 = r10.instructions
            if (r0 == 0) goto L5c
            java.lang.String r9 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
        L5c:
            com.facebook.aura.gateway.DeliveryCheckoutStop r1 = new com.facebook.aura.gateway.DeliveryCheckoutStop
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        L62:
            r6 = r9
            goto L54
        L64:
            r7 = r9
            goto L48
        L66:
            java.lang.String r0 = "leave_at_door"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L71
            com.facebook.aura.gateway.DeliveryCheckoutHandoff r8 = com.facebook.aura.gateway.DeliveryCheckoutHandoff.LEAVE_AT_DOOR
            goto L40
        L71:
            r8 = r9
            goto L40
        L73:
            java.lang.String r0 = "dropoff"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L7e
            com.facebook.aura.gateway.DeliveryCheckoutStopRole r3 = com.facebook.aura.gateway.DeliveryCheckoutStopRole.DROPOFF
            goto L17
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.DeliveryCheckoutStopJson.toDomainOrNull():com.facebook.aura.gateway.DeliveryCheckoutStop");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DeliveryCheckoutStopJson(int i, String str, String str2, DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, DeliveryCheckoutContactJson deliveryCheckoutContactJson, DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str3, String str4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.role = null;
        } else {
            this.role = str2;
        }
        if ((i & 4) == 0) {
            this.address = null;
        } else {
            this.address = deliveryCheckoutAddressJson;
        }
        if ((i & 8) == 0) {
            this.contact = null;
        } else {
            this.contact = deliveryCheckoutContactJson;
        }
        if ((i & 16) == 0) {
            this.time = null;
        } else {
            this.time = deliveryCheckoutTimeJson;
        }
        if ((i & 32) == 0) {
            this.handoff = null;
        } else {
            this.handoff = str3;
        }
        if ((i & 64) == 0) {
            this.instructions = null;
        } else {
            this.instructions = str4;
        }
    }

    public DeliveryCheckoutStopJson(String str, String str2, DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, DeliveryCheckoutContactJson deliveryCheckoutContactJson, DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str3, String str4) {
        this.id = str;
        this.role = str2;
        this.address = deliveryCheckoutAddressJson;
        this.contact = deliveryCheckoutContactJson;
        this.time = deliveryCheckoutTimeJson;
        this.handoff = str3;
        this.instructions = str4;
    }

    public /* synthetic */ DeliveryCheckoutStopJson(String str, String str2, DeliveryCheckoutAddressJson deliveryCheckoutAddressJson, DeliveryCheckoutContactJson deliveryCheckoutContactJson, DeliveryCheckoutTimeJson deliveryCheckoutTimeJson, String str3, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : deliveryCheckoutAddressJson, (i & 8) != 0 ? null : deliveryCheckoutContactJson, (i & 16) != 0 ? null : deliveryCheckoutTimeJson, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
    }
}
