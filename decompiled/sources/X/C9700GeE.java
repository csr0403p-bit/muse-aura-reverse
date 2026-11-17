package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.GeE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9700GeE {
    public final InterfaceC9568GPa A00;
    public final Map<String, String> A01;

    /* JADX WARN: Incorrect return type in method signature: (LX/Ge3;LX/Gd3;LX/GeY;Ljava/util/List<+LX/HwA;>;Ljava/lang/Boolean;)LX/GeE; */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C9700GeE r7, X.C9720GeY r8, X.C9698Ge3 r9, X.C9661Gd3 r10, java.lang.Boolean r11, java.util.List r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9700GeE.A00(X.GeE, X.GeY, X.Ge3, X.Gd3, java.lang.Boolean, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C9698Ge3 r4, X.C9661Gd3 r5) {
        /*
            r3 = this;
            r2 = 0
            if (r5 == 0) goto Lf
            X.HoF r1 = r5.A00
        L5:
            java.lang.String r0 = "iap_external_sku_details_payload"
            if (r1 == 0) goto Lb
            java.lang.String r2 = r1.A03
        Lb:
            A01(r3, r0, r2)
            return
        Lf:
            if (r4 == 0) goto L2a
            X.GPa r1 = r3.A00
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L1d
            X.GPY r0 = r1.ABx(r0)
            if (r0 != 0) goto L25
        L1d:
            java.lang.String r0 = r4.A07
            X.GPY r0 = r1.ABx(r0)
            if (r0 == 0) goto L2a
        L25:
            X.HoF r1 = r0.AFV()
            goto L5
        L2a:
            r1 = r2
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9700GeE.A05(X.Ge3, X.Gd3):void");
    }

    public static final void A01(C9700GeE c9700GeE, String str, String str2) {
        if (str2 != null) {
            c9700GeE.A01.put(str, str2);
        }
    }

    public final void A02(Context context) {
        int iA01;
        try {
            iA01 = C4001CjU.A00.A01(context, 12451000);
        } catch (Throwable unused) {
            iA01 = 8;
        }
        this.A01.put("google_play_services_availability_status", String.valueOf(iA01));
    }

    public final void A03(Hzd hzd) {
        this.A01.put("iap_native_error_payload", AbstractC10492Hlw.A00(hzd));
    }

    public final void A04(AbstractC10579HwA abstractC10579HwA) {
        A01(this, "external_purchase_time", abstractC10579HwA != null ? String.valueOf(abstractC10579HwA.A00()) : null);
        A01(this, "external_purchase_signature", abstractC10579HwA != null ? abstractC10579HwA instanceof Huq ? ((Huq) abstractC10579HwA).A08 : ((Hz9) abstractC10579HwA).A08 : null);
        A01(this, "developer_payload", abstractC10579HwA != null ? abstractC10579HwA instanceof Huq ? ((Huq) abstractC10579HwA).A04 : ((Hz9) abstractC10579HwA).A04 : null);
        A01(this, "external_purchase_token", abstractC10579HwA != null ? abstractC10579HwA.A04() : null);
    }

    public final void A06(Boolean bool) {
        if (bool != null) {
            this.A01.put("is_background_call", String.valueOf(bool.booleanValue()));
        }
    }

    public final void A07(Integer num) {
        String str;
        Map<String, String> map = this.A01;
        switch (num.intValue()) {
            case 1:
                str = "asynchronous";
                break;
            case 2:
                str = "asynchronousBatched";
                break;
            default:
                str = "userPurchase";
                break;
        }
        map.put("fulfillment_type", str);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;LX/GPa;)V */
    public C9700GeE(InterfaceC9568GPa interfaceC9568GPa, Map map) {
        this.A01 = map;
        this.A00 = interfaceC9568GPa;
    }
}
