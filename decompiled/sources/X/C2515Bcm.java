package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Bcm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2515Bcm implements InterfaceC2420Baw {
    public final C2507Bcd A00;
    public final InterfaceC2420Baw A01;
    public final Map<Integer, InterfaceC2523Bcu> A02 = BV4.A0u();

    private InterfaceC2523Bcu A00(int i) {
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
        C2507Bcd c2507Bcd = this.A00;
        C2525Bcw c2525Bcw = null;
        if (interfaceC2523BcuACK != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (AbstractC2509Bcf abstractC2509Bcf : interfaceC2523BcuACK.AMe()) {
                if (AbstractC2508Bce.A01(c2507Bcd, abstractC2509Bcf)) {
                    arrayListA0h.add(abstractC2509Bcf);
                }
            }
            if (!arrayListA0h.isEmpty()) {
                c2525Bcw = new C2525Bcw(BV5.A13(interfaceC2523BcuACK.ACZ()), BV5.A13(arrayListA0h), interfaceC2523BcuACK.AEh(), interfaceC2523BcuACK.AJS());
            }
        }
        map.put(numValueOf, c2525Bcw);
        return c2525Bcw;
    }

    @Override // X.InterfaceC2420Baw
    public final boolean ANG(int i) {
        return this.A01.ANG(i) && A00(i) != null;
    }

    public C2515Bcm(C2507Bcd c2507Bcd, InterfaceC2420Baw interfaceC2420Baw) {
        this.A01 = interfaceC2420Baw;
        this.A00 = c2507Bcd;
    }

    @Override // X.InterfaceC2420Baw
    public final InterfaceC2523Bcu ACK(int i) {
        return A00(i);
    }
}
