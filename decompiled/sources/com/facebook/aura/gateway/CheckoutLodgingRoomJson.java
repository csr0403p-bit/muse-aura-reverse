package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CheckoutLodgingRoomJson extends C06G {
    public static final int $stable = 8;
    public final List<String> bed_options;
    public final Long max_guests;
    public final String name;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cH.A1U(C79.A01, CheckoutLodgingRoomJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<CheckoutLodgingRoomJson> serializer() {
            return CheckoutLodgingRoomJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public CheckoutLodgingRoomJson(String str, List<String> list, Long l) {
        C7384Etj.A0Y(list, 1);
        this.name = str;
        this.bed_options = list;
        this.max_guests = l;
    }

    public final CheckoutLodgingRoomJson copy(String str, List<String> list, Long l) {
        C7384Etj.A0Y(list, 1);
        return new CheckoutLodgingRoomJson(str, list, l);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CheckoutLodgingRoomJson) {
                CheckoutLodgingRoomJson checkoutLodgingRoomJson = (CheckoutLodgingRoomJson) obj;
                if (!C7384Etj.areEqual(this.name, checkoutLodgingRoomJson.name) || !C7384Etj.areEqual(this.bed_options, checkoutLodgingRoomJson.bed_options) || !C7384Etj.areEqual(this.max_guests, checkoutLodgingRoomJson.max_guests)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckoutLodgingRoomJson copy$default(CheckoutLodgingRoomJson checkoutLodgingRoomJson, String str, List list, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutLodgingRoomJson.name;
        }
        if ((i & 2) != 0) {
            list = checkoutLodgingRoomJson.bed_options;
        }
        if ((i & 4) != 0) {
            l = checkoutLodgingRoomJson.max_guests;
        }
        return checkoutLodgingRoomJson.copy(str, list, l);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(CheckoutLodgingRoomJson checkoutLodgingRoomJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || checkoutLodgingRoomJson.name != null) {
            c9j5.AAP(checkoutLodgingRoomJson.name, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(checkoutLodgingRoomJson.bed_options)) {
            c9j5.AAQ(checkoutLodgingRoomJson.bed_options, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || checkoutLodgingRoomJson.max_guests != null) {
            c9j5.AAP(checkoutLodgingRoomJson.max_guests, C9j1.A00, c9iZ, 2);
        }
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.bed_options;
    }

    public final Long component3() {
        return this.max_guests;
    }

    public final List<String> getBed_options() {
        return this.bed_options;
    }

    public final Long getMax_guests() {
        return this.max_guests;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.bed_options, AnonymousClass006.A0G(this.name) * 31) + C3cH.A02(this.max_guests);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.gateway.CheckoutLodgingRoom toDomain() {
        /*
            r9 = this;
            java.lang.String r0 = r9.name
            r8 = 0
            java.lang.String r7 = X.C3cI.A0Z(r0)
            java.util.List<java.lang.String> r0 = r9.bed_options
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            java.lang.String r0 = com.facebook.aura.gateway.HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(r0)
            if (r0 == 0) goto L11
            r6.add(r0)
            goto L11
        L25:
            java.lang.Long r5 = r9.max_guests
            if (r5 == 0) goto L47
            long r3 = r5.longValue()
            r1 = 1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L47
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L47
        L3c:
            if (r7 != 0) goto L49
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L49
            if (r5 != 0) goto L49
            return r8
        L47:
            r5 = r8
            goto L3c
        L49:
            com.facebook.aura.gateway.CheckoutLodgingRoom r8 = new com.facebook.aura.gateway.CheckoutLodgingRoom
            r8.<init>(r7, r6, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.CheckoutLodgingRoomJson.toDomain():com.facebook.aura.gateway.CheckoutLodgingRoom");
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CheckoutLodgingRoomJson(int i, String str, List list, Long l, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.bed_options = C0881AGi.A00;
        } else {
            this.bed_options = list;
        }
        if ((i & 4) == 0) {
            this.max_guests = null;
        } else {
            this.max_guests = l;
        }
    }

    public /* synthetic */ CheckoutLodgingRoomJson(String str, List list, Long l, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, C3cI.A11(list, i), (i & 4) != 0 ? null : l);
    }

    public CheckoutLodgingRoomJson() {
        this(null, C0881AGi.A00, null);
    }
}
