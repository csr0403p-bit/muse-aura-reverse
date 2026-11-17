package X;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.BdY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2547BdY {
    public final InterfaceC2544BdV A00;
    public final Rational A01;
    public final C2548BdZ A02;

    /* JADX WARN: Removed duplicated region for block: B:104:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.AbstractMap, java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<android.util.Size> A03(X.BfN<?> r13) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2547BdY.A03(X.BfN):java.util.ArrayList");
    }

    public C2547BdY(Size size, InterfaceC2544BdV interfaceC2544BdV) {
        Rational rationalA0Y;
        this.A00 = interfaceC2544BdV;
        interfaceC2544BdV.AKN();
        interfaceC2544BdV.AH3();
        if (size == null) {
            List<Size> listALQ = interfaceC2544BdV.ALQ(256);
            if (listALQ.isEmpty()) {
                rationalA0Y = null;
            } else {
                size = (Size) Collections.max(listALQ, new C2482Bc9());
                rationalA0Y = BV8.A0Y(size);
            }
        } else {
            rationalA0Y = BV8.A0Y(size);
        }
        this.A01 = rationalA0Y;
        this.A02 = new C2548BdZ(rationalA0Y, interfaceC2544BdV);
    }

    public static List<Rational> A00(List<Size> list) {
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(AbstractC2498BcP.A02);
        arrayListA0h.add(AbstractC2498BcP.A00);
        Iterator<Size> it = list.iterator();
        while (it.hasNext()) {
            Size sizeA0R = BV6.A0R(it);
            Rational rationalA0Y = BV8.A0Y(sizeA0R);
            if (!arrayListA0h.contains(rationalA0Y)) {
                Iterator it2 = arrayListA0h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayListA0h.add(rationalA0Y);
                        break;
                    }
                    if (AbstractC2498BcP.A01((Rational) it2.next(), sizeA0R, AbstractC2484BcB.A05)) {
                        break;
                    }
                }
            }
        }
        return arrayListA0h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static Map<Rational, List<Size>> A01(List<Size> list) {
        HashMap mapA0u = BV4.A0u();
        Iterator it = A00(list).iterator();
        while (it.hasNext()) {
            mapA0u.put(it.next(), C3cG.A0h());
        }
        Iterator<Size> it2 = list.iterator();
        while (it2.hasNext()) {
            Size sizeA0R = BV6.A0R(it2);
            Iterator itA0y = BV5.A0y(mapA0u);
            while (itA0y.hasNext()) {
                Rational rational = (Rational) itA0y.next();
                Rational rational2 = AbstractC2498BcP.A03;
                if (AbstractC2498BcP.A01(rational, sizeA0R, AbstractC2484BcB.A05)) {
                    BV6.A0v(rational, mapA0u).add(sizeA0R);
                }
            }
        }
        return mapA0u;
    }

    public static void A02(Size size, List list) {
        ArrayList arrayListA0h = C3cG.A0h();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            } else {
                arrayListA0h.add(0, size3);
            }
        }
        list.removeAll(arrayListA0h);
        Collections.reverse(list);
        list.addAll(arrayListA0h);
    }
}
