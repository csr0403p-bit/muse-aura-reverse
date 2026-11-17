package X;

import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;

/* renamed from: X.CiO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3974CiO implements InterfaceC3984CiY {
    public final F1O A00;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC3984CiY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AYX(X.C3979CiT r12) {
        /*
            r11 = this;
            r2 = 0
            X.C7384Etj.A0Y(r12, r2)
            X.Cia r0 = r12.A0A
            boolean r0 = r0 instanceof X.C3980CiU
            if (r0 == 0) goto L15
            java.lang.String r0 = "logging ByteArray not supported"
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            X.Hud r12 = X.C3cG.A0s(r0)
        L14:
            return r12
        L15:
            com.facebook.pushlite.model.PushInfraMetaData r5 = r12.A08
            java.lang.String r10 = r12.A0F
            java.lang.String r7 = "FCM"
            boolean r0 = r7.equals(r10)
            r1 = 0
            if (r0 == 0) goto L62
            X.F1O r4 = r11.A00
            java.lang.Integer r0 = r12.A00
            if (r0 == 0) goto L2c
            int r1 = r0.intValue()
        L2c:
            android.content.Context r3 = r12.A06
            X.C7384Etj.A0Y(r5, r2)
            if (r1 >= 0) goto L5f
            java.lang.String r1 = "1"
        L35:
            java.lang.String r0 = "priority_lowered"
            X.HxE r0 = X.C3cG.A0r(r0, r1)
            X.HxE[] r0 = new X.HxE[]{r0}
            java.util.LinkedHashMap r8 = X.AGH.A05(r0)
        L43:
            java.lang.String r6 = "notif_received_push"
            X.F1O.A00(r3, r4, r5, r6, r7, r8)
        L48:
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L14
            X.F1O r7 = r11.A00
            android.content.Context r6 = r12.A06
            r0 = 1
            X.C7384Etj.A0Y(r10, r0)
            java.util.LinkedHashMap r11 = X.C3cG.A0j()
            java.lang.String r9 = "notif_received_push_hpke_encrypted"
            r8 = r5
            X.F1O.A00(r6, r7, r8, r9, r10, r11)
            return r12
        L5f:
            java.lang.String r1 = "0"
            goto L35
        L62:
            java.lang.String r7 = "ADM"
            boolean r0 = r7.equals(r10)
            if (r0 != 0) goto L7e
            java.lang.String r7 = "FBNS"
            boolean r0 = r7.equals(r10)
            if (r0 != 0) goto L7e
            java.lang.Object[] r2 = new java.lang.Object[]{r10}
            java.lang.String r1 = "ClientReceivedLoggingPlugin"
            java.lang.String r0 = "Skipping received logging for unknown push source: %s"
            X.CFK.A0H(r1, r0, r2)
            goto L48
        L7e:
            X.F1O r4 = r11.A00
            android.content.Context r3 = r12.A06
            X.C7384Etj.A0Y(r5, r2)
            java.util.LinkedHashMap r8 = X.C3cG.A0j()
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3974CiO.AYX(X.CiT):java.lang.Object");
    }

    @Override // X.InterfaceC3984CiY
    public final boolean AfW(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        String str = c3979CiT.A08.A0D;
        return (str == null || HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(str)) ? false : true;
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "client_received_logging";
    }

    public C3974CiO(F1O f1o) {
        this.A00 = f1o;
    }
}
