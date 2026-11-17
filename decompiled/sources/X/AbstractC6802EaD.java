package X;

import com.facebook.tigon.iface.TigonRequest;

/* renamed from: X.EaD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6802EaD {
    public static final C6788EZx A00 = C6788EZx.A02("\"\\");
    public static final C6788EZx A01 = C6788EZx.A02("\t ,=");

    public static final boolean A02(C6886Ebi c6886Ebi) {
        int i;
        C7384Etj.A0Y(c6886Ebi, 0);
        return !TigonRequest.HEAD.equals(c6886Ebi.A07.A01) && ((i = c6886Ebi.A00) < 100 || !((i < 200 || i == 204 || i == 304) && AbstractC6843Eav.A03(c6886Ebi) == -1 && !"chunked".equalsIgnoreCase(C6886Ebi.A00("Transfer-Encoding", c6886Ebi))));
    }

    public static final boolean A03(C6818EaW c6818EaW) {
        boolean z = false;
        while (!c6818EaW.AB9()) {
            byte bA02 = c6818EaW.A02(0L);
            if (bA02 != 44) {
                if (bA02 != 32 && bA02 != 9) {
                    break;
                }
                c6818EaW.readByte();
            } else {
                c6818EaW.readByte();
                z = true;
            }
        }
        return z;
    }

    public static final String A00(C6818EaW c6818EaW) {
        long jANX = c6818EaW.ANX(A01);
        if (jANX == -1) {
            jANX = c6818EaW.A00;
        }
        if (jANX != 0) {
            return C6818EaW.A00(DCl.A05, c6818EaW, jANX);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC6803EaE r43, X.C6844Eaw r44, X.C6854EbC r45) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC6802EaD.A01(X.EaE, X.Eaw, X.EbC):void");
    }
}
