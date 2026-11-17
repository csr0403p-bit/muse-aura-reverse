package X;

import android.util.Size;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.Bcq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2519Bcq implements Bd1 {
    public final InterfaceC2420Baw A00;
    public final Map<C2507Bcd, C2522Bct> A01 = BV4.A0u();
    public final Map<C2507Bcd, C2522Bct> A02 = BV4.A0u();

    public C2519Bcq(BpS bpS, InterfaceC2544BdV interfaceC2544BdV) {
        FGI.A0H("Not a supported video capabilities source: ", 0);
        InterfaceC2420Baw interfaceC2420BawAF7 = interfaceC2544BdV.AF7();
        C2511Bch c2511Bch = AbstractC2411BaU.A00;
        InterfaceC2420Baw c2516Bcn = new C2516Bcn(new C2517Bco(bpS, interfaceC2544BdV, interfaceC2420BawAF7, c2511Bch), c2511Bch);
        Iterator<C2507Bcd> it = interfaceC2544BdV.ALL().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C2507Bcd next = it.next();
            Integer numValueOf = Integer.valueOf(next.A01);
            int i = next.A00;
            if (numValueOf.equals(BV4.A0Y()) && i == 10) {
                c2516Bcn = new C2518Bcp(bpS, c2516Bcn);
                break;
            }
        }
        this.A00 = new C2419Bau(interfaceC2544BdV, c2516Bcn, c2511Bch);
        for (C2507Bcd c2507Bcd : interfaceC2544BdV.ALL()) {
            C2522Bct c2522Bct = new C2522Bct(new C2515Bcm(c2507Bcd, this.A00));
            if (!BV4.A0t(c2522Bct.A00.keySet()).isEmpty()) {
                this.A01.put(c2507Bcd, c2522Bct);
            }
        }
        interfaceC2544BdV.APH();
    }

    public static C2522Bct A00(C2507Bcd c2507Bcd, C2519Bcq c2519Bcq) {
        C2522Bct c2522Bct;
        if (c2507Bcd.A01()) {
            c2522Bct = c2519Bcq.A01.get(c2507Bcd);
        } else {
            Map<C2507Bcd, C2522Bct> map = c2519Bcq.A02;
            if (!map.containsKey(c2507Bcd)) {
                Set<C2507Bcd> setKeySet = c2519Bcq.A01.keySet();
                C7384Etj.A0Y(setKeySet, 1);
                Iterator<C2507Bcd> it = setKeySet.iterator();
                while (it.hasNext()) {
                    C2507Bcd next = it.next();
                    C2507Bcd c2507Bcd2 = next;
                    boolean zA01 = c2507Bcd2.A01();
                    BeS.A07(zA01, "Fully specified range is not actually fully specified.");
                    int i = c2507Bcd.A00;
                    if (i == 0 || i == c2507Bcd2.A00) {
                        BeS.A07(zA01, "Fully specified range is not actually fully specified.");
                        int i2 = c2507Bcd.A01;
                        if (i2 != 0) {
                            int i3 = c2507Bcd2.A01;
                            if (i2 == 2) {
                                if (i3 != 1) {
                                }
                            } else if (i2 == i3) {
                            }
                            map.put(c2507Bcd, c2522Bct);
                            return c2522Bct;
                        }
                        C2522Bct c2522Bct2 = next != null ? new C2522Bct(new C2515Bcm(c2507Bcd, c2519Bcq.A00)) : null;
                        map.put(c2507Bcd, c2522Bct2);
                        return c2522Bct2;
                    }
                }
                map.put(c2507Bcd, c2522Bct2);
                return c2522Bct2;
            }
            c2522Bct = map.get(c2507Bcd);
        }
        return c2522Bct;
    }

    @Override // X.Bd1
    public final AbstractC2527Bcy ABV(Size size, C2507Bcd c2507Bcd) {
        C2522Bct c2522BctA00 = A00(c2507Bcd, this);
        if (c2522BctA00 != null) {
            TreeMap<Size, C2421Bax> treeMap = c2522BctA00.A01;
            Size size2 = AbstractC2484BcB.A00;
            Map.Entry<Size, C2421Bax> entryCeilingEntry = treeMap.ceilingEntry(size);
            C2421Bax value = (entryCeilingEntry == null && (entryCeilingEntry = treeMap.floorEntry(size)) == null) ? null : entryCeilingEntry.getValue();
            if (value == null) {
                value = C2421Bax.A04;
            }
            AbstractC2875Bni.A01("CapabilitiesByQuality", AnonymousClass006.A0y(size, " for size ", C3cG.A0f(value, "Using supported quality of ")));
            if (value != C2421Bax.A04) {
                AbstractC2527Bcy abstractC2527BcyA00 = c2522BctA00.A00(value);
                if (abstractC2527BcyA00 == null) {
                    throw BV4.A0N("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
                }
                return abstractC2527BcyA00;
            }
        }
        return null;
    }

    @Override // X.Bd1
    public final AbstractC2527Bcy AJC(C2507Bcd c2507Bcd, C2421Bax c2421Bax) {
        C2522Bct c2522BctA00 = A00(c2507Bcd, this);
        if (c2522BctA00 == null) {
            return null;
        }
        return c2522BctA00.A00(c2421Bax);
    }

    @Override // X.Bd1
    public final List<C2421Bax> ALP(C2507Bcd c2507Bcd) {
        C2522Bct c2522BctA00 = A00(c2507Bcd, this);
        return c2522BctA00 == null ? C3cG.A0h() : BV4.A0t(c2522BctA00.A00.keySet());
    }
}
