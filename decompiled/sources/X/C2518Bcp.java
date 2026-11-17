package X;

import android.util.Rational;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Bcp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2518Bcp implements InterfaceC2420Baw {
    public final BpS<BdF, InterfaceC2436BbP> A00;
    public final InterfaceC2420Baw A01;
    public final Map<Integer, InterfaceC2523Bcu> A02 = BV4.A0u();

    private InterfaceC2523Bcu A00(int i) {
        C2520Bcr c2520Bcr;
        Bd7 bd7A02;
        InterfaceC2436BbP interfaceC2436BbPApply;
        Map<Integer, InterfaceC2523Bcu> map = this.A02;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return map.get(numValueOf);
        }
        InterfaceC2420Baw interfaceC2420Baw = this.A01;
        if (!interfaceC2420Baw.ANG(i)) {
            return null;
        }
        InterfaceC2523Bcu interfaceC2523BcuACK = interfaceC2420Baw.ACK(i);
        C2525Bcw c2525Bcw = null;
        if (interfaceC2523BcuACK != null) {
            List<AbstractC2509Bcf> listAMe = interfaceC2523BcuACK.AMe();
            ArrayList arrayListA0t = BV4.A0t(listAMe);
            Iterator<AbstractC2509Bcf> it = listAMe.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC2509Bcf next = it.next();
                C2520Bcr c2520Bcr2 = (C2520Bcr) next;
                if (c2520Bcr2.A05 == 0) {
                    if (next != null) {
                        int i2 = c2520Bcr2.A01;
                        int i3 = c2520Bcr2.A00;
                        if (10 != i3) {
                            int iDoubleValue = (int) (i2 * new Rational(10, i3).doubleValue());
                            if (AbstractC2875Bni.A08("BackupHdrProfileEncoderProfilesProvider", 3)) {
                                AbstractC2875Bni.A07("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) = %d", "BackupHdrProfileEncoderProfilesProvider", new Object[]{Integer.valueOf(i2), 10, Integer.valueOf(i3), Integer.valueOf(iDoubleValue)});
                            }
                            i2 = iDoubleValue;
                        }
                        c2520Bcr = new C2520Bcr("video/hevc", 5, i2, c2520Bcr2.A04, c2520Bcr2.A08, c2520Bcr2.A06, 2, 10, c2520Bcr2.A02, 1);
                    }
                }
            }
            c2520Bcr = null;
            BpS<BdF, InterfaceC2436BbP> bpS = this.A00;
            if (c2520Bcr != null && (interfaceC2436BbPApply = bpS.apply((bd7A02 = Bd2.A02(c2520Bcr)))) != null) {
                int i4 = c2520Bcr.A08;
                int i5 = c2520Bcr.A06;
                if (AbstractC2438BbR.A00(interfaceC2436BbPApply, i4, i5)) {
                    int i6 = bd7A02.A01;
                    int iA05 = BV8.A05(interfaceC2436BbPApply.ALK(), i6);
                    if (iA05 != i6) {
                        c2520Bcr = new C2520Bcr(c2520Bcr.A09, c2520Bcr.A03, iA05, c2520Bcr.A04, i4, i5, c2520Bcr.A07, c2520Bcr.A00, c2520Bcr.A02, c2520Bcr.A05);
                    }
                    arrayListA0t.add(c2520Bcr);
                }
            }
            if (!arrayListA0t.isEmpty()) {
                c2525Bcw = new C2525Bcw(BV5.A13(interfaceC2523BcuACK.ACZ()), BV5.A13(arrayListA0t), interfaceC2523BcuACK.AEh(), interfaceC2523BcuACK.AJS());
            }
        }
        map.put(numValueOf, c2525Bcw);
        return c2525Bcw;
    }

    @Override // X.InterfaceC2420Baw
    public final boolean ANG(int i) {
        return this.A01.ANG(i) && A00(i) != null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Baw;LX/BpS<LX/BdF;LX/BbP;>;)V */
    public C2518Bcp(BpS bpS, InterfaceC2420Baw interfaceC2420Baw) {
        this.A01 = interfaceC2420Baw;
        this.A00 = bpS;
    }

    @Override // X.InterfaceC2420Baw
    public final InterfaceC2523Bcu ACK(int i) {
        return A00(i);
    }
}
