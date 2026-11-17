package X;

import java.util.BitSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class CD1 {
    public static CD1 A05;
    public static final CDC A06 = new CDC();
    public final int A00;
    public final BitSet A01;
    public final List<CDG> A02;
    public final CDE[] A03;
    public final CD2[] A04;

    public final synchronized CD2 A00(int i) {
        return this.A04[i];
    }

    public final void A01(CD2 cd2, String str) {
        C7384Etj.A0Y(str, 0);
        int iA00 = CD0.A00(str);
        if (!CD0.A02(iA00)) {
            CFK.A07("AppModuleSplitIndexUtil", FGI.A0H("Invalid split index detected: ", iA00));
            return;
        }
        synchronized (this) {
            CD2[] cd2Arr = this.A04;
            if (cd2Arr[iA00] != cd2) {
                CD0.A01(iA00);
                cd2Arr[iA00] = cd2;
            }
        }
    }

    public final void A02(String str) {
        List<CDG> listA0X;
        int iA00 = CD0.A00(str);
        if (!CD0.A02(iA00)) {
            CFK.A07("AppModuleSplitIndexUtil", FGI.A0H("Invalid split index detected: ", iA00));
            return;
        }
        synchronized (this) {
            BitSet bitSet = this.A01;
            if (bitSet.get(iA00)) {
                listA0X = null;
            } else {
                bitSet.set(iA00);
                listA0X = AbstractC0878AGe.A0X(this.A02);
                if (CFK.A02.AOg(3)) {
                    CD0.A01(iA00);
                }
            }
        }
        if (listA0X != null) {
            String strA01 = CD0.A01(iA00);
            for (CDG cdg : listA0X) {
                C7384Etj.A0Y(strA01, 0);
                cdg.A00.ATy(strA01);
            }
        }
    }

    public CD1() {
        int size = EnumC3180C1k.A00.size() * 6;
        this.A00 = size;
        CD2[] cd2Arr = new CD2[size];
        for (int i = 0; i < size; i++) {
            cd2Arr[i] = CD2.A06;
        }
        this.A04 = cd2Arr;
        this.A01 = new BitSet(size);
        this.A02 = C3cG.A0h();
        this.A03 = new CDE[size];
        for (int i2 = 0; i2 < size; i2++) {
            cd2Arr[i2] = CD2.A06;
        }
    }
}
