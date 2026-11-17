package X;

import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bgc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2645Bgc {
    public int A00;
    public InterfaceC2861BnK A01;
    public InterfaceC2583Bef A02;
    public Bh3 A03;
    public List<BeX> A04;
    public boolean A05;
    public boolean A06;
    public final Set<BjC> A07;

    public final C2646Bgd A01() {
        ArrayList arrayListA0t = BV4.A0t(this.A07);
        C2584Beg c2584BegA02 = C2584Beg.A02(this.A02);
        int i = this.A00;
        boolean z = this.A05;
        ArrayList arrayListA0t2 = BV4.A0t(this.A04);
        boolean z2 = this.A06;
        Bh3 bh3 = this.A03;
        BhZ bhZ = BhZ.A01;
        ArrayMap arrayMap = new ArrayMap();
        Map<String, Object> map = bh3.A00;
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            arrayMap.put(next, map.get(next));
        }
        return new C2646Bgd(this.A01, c2584BegA02, new BhZ(arrayMap), arrayListA0t, arrayListA0t2, i, z, z2);
    }

    public C2645Bgc(C2646Bgd c2646Bgd) {
        HashSet hashSetA13 = C60O.A13();
        this.A07 = hashSetA13;
        A00(this);
        hashSetA13.addAll(c2646Bgd.A05);
        this.A02 = C2582Bee.A01(c2646Bgd.A02);
        this.A00 = c2646Bgd.A00;
        this.A04.addAll(c2646Bgd.A04);
        this.A06 = c2646Bgd.A07;
        BhZ bhZ = c2646Bgd.A03;
        ArrayMap arrayMap = new ArrayMap();
        Map<String, Object> map = bhZ.A00;
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            arrayMap.put(next, map.get(next));
        }
        this.A03 = new Bh3(arrayMap);
        this.A05 = c2646Bgd.A06;
    }

    public static void A00(C2645Bgc c2645Bgc) {
        c2645Bgc.A02 = C2582Bee.A00();
        c2645Bgc.A00 = -1;
        c2645Bgc.A05 = false;
        c2645Bgc.A04 = new ArrayList();
        c2645Bgc.A06 = false;
        BhZ bhZ = BhZ.A01;
        c2645Bgc.A03 = new Bh3(new ArrayMap());
    }

    public final void A02(InterfaceC2585Beh interfaceC2585Beh) {
        for (AbstractC2531BdI<?> abstractC2531BdI : interfaceC2585Beh.APd()) {
            this.A02.Abl(abstractC2531BdI, null);
            this.A02.ANk(abstractC2531BdI, interfaceC2585Beh.AIG(abstractC2531BdI), interfaceC2585Beh.Abk(abstractC2531BdI));
        }
    }

    public final void A03(Collection<BeX> collection) {
        Iterator<BeX> it = collection.iterator();
        while (it.hasNext()) {
            BV7.A1E(it.next(), this.A04);
        }
    }

    public C2645Bgc() {
        this.A07 = C60O.A13();
        A00(this);
    }
}
