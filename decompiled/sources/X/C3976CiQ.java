package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.pushlite.model.PushInfraMetaData;

/* renamed from: X.CiQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3976CiQ implements InterfaceC3984CiY {
    public static final C3976CiQ A00 = new C3976CiQ();

    @Override // X.InterfaceC3984CiY
    public final Object AYX(C3979CiT c3979CiT) {
        C7384Etj.A0Y(c3979CiT, 0);
        InterfaceC3985Cia c3980CiU = c3979CiT.A0A;
        InterfaceC3985Cia c3980CiU2 = c3979CiT.A09;
        PushInfraMetaData pushInfraMetaData = c3979CiT.A08;
        String str = pushInfraMetaData.A06;
        if ((str == null ? false : str.equalsIgnoreCase("zstd")) || (pushInfraMetaData.A07 != null && pushInfraMetaData.A08 != null && pushInfraMetaData.A09 != null)) {
            if (c3980CiU instanceof C3970CiI) {
                byte[] bArrDecode = Base64.decode(((C3970CiI) c3980CiU).A00, 0);
                C7384Etj.A0U(bArrDecode);
                c3980CiU = new C3980CiU(bArrDecode);
            } else if (c3980CiU instanceof C3980CiU) {
                return C3cG.A0s(C60O.A0i("base64 decoding failed, plugin expects type \"String\" not \"ByteArray\""));
            }
        }
        if (c3980CiU2 instanceof C3970CiI) {
            byte[] bArrDecode2 = Base64.decode(((C3970CiI) c3980CiU2).A00, 0);
            C7384Etj.A0U(bArrDecode2);
            c3980CiU2 = new C3980CiU(bArrDecode2);
        } else if (c3980CiU2 instanceof C3980CiU) {
            return C3cG.A0s(C60O.A0i("base64 decoding failed, plugin expects type \"String\" not \"ByteArray\""));
        }
        Context context = c3979CiT.A06;
        String str2 = c3979CiT.A0F;
        Integer num = c3979CiT.A00;
        boolean z = c3979CiT.A03;
        boolean z2 = c3979CiT.A02;
        String str3 = c3979CiT.A0E;
        String str4 = c3979CiT.A0D;
        String str5 = c3979CiT.A0C;
        boolean z3 = c3979CiT.A01;
        int i = c3979CiT.A05;
        int i2 = c3979CiT.A04;
        C3972CiK c3972CiK = c3979CiT.A07;
        Integer num2 = c3979CiT.A0B;
        AnonymousClass005.A12(context, pushInfraMetaData, str2, 0);
        C7384Etj.A0Y(c3972CiK, 14);
        return new C3979CiT(context, c3972CiK, pushInfraMetaData, c3980CiU, c3980CiU2, num, num2, str2, str3, str4, str5, i, i2, z, z2, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // X.InterfaceC3984CiY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AfW(X.C3979CiT r6) {
        /*
            r5 = this;
            r5 = 0
            X.C7384Etj.A0Y(r6, r5)
            X.Cia r0 = r6.A09
            r4 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0 instanceof X.C3970CiI
            r3 = 1
            if (r0 != 0) goto Lf
        Le:
            r3 = 0
        Lf:
            com.facebook.pushlite.model.PushInfraMetaData r2 = r6.A08
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "zstd"
            if (r1 == 0) goto L1e
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2a
        L1e:
            java.lang.String r0 = r2.A07
            if (r0 == 0) goto L2b
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L2b
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L2b
        L2a:
            return r4
        L2b:
            if (r3 != 0) goto L2a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3976CiQ.AfW(X.CiT):boolean");
    }

    @Override // X.InterfaceC3984CiY
    public final String AIp() {
        return "base64_decoder";
    }
}
