package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Bds, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2564Bds {
    public static final double A07 = Math.sqrt(2.3703703703703702d);
    public final Rational A00;
    public final Rational A01;
    public final Size A02;
    public final InterfaceC2544BdV A03;
    public final C2547BdY A04;
    public final Map<BfN<?>, List<Size>> A05;
    public final Set<BfN<?>> A06;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static List A03(BfN bfN, C2564Bds c2564Bds) {
        Rational rationalA0Y;
        if (!c2564Bds.A06.contains(bfN)) {
            throw BV5.A0O(bfN, "Invalid child config: ");
        }
        Map<BfN<?>, List<Size>> map = c2564Bds.A05;
        if (map.containsKey(bfN)) {
            List listA0z = BV4.A0z(bfN, map);
            listA0z.getClass();
            return listA0z;
        }
        ?? A03 = c2564Bds.A04.A03(bfN);
        HashMap mapA0u = BV4.A0u();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = A03.iterator();
        while (it.hasNext()) {
            Size sizeA0R = BV6.A0R(it);
            Iterator itA0y = BV5.A0y(mapA0u);
            while (true) {
                if (!itA0y.hasNext()) {
                    break;
                }
                rationalA0Y = (Rational) itA0y.next();
                Rational rational = AbstractC2498BcP.A03;
                if (AbstractC2498BcP.A01(rationalA0Y, sizeA0R, AbstractC2484BcB.A05)) {
                    if (rationalA0Y != null) {
                        Size size = (Size) mapA0u.get(rationalA0Y);
                        size.getClass();
                        if (sizeA0R.getHeight() > size.getHeight() || sizeA0R.getWidth() > size.getWidth() || (sizeA0R.getWidth() == size.getWidth() && sizeA0R.getHeight() == size.getHeight())) {
                        }
                    }
                }
            }
            rationalA0Y = BV8.A0Y(sizeA0R);
            arrayListA0h.add(sizeA0R);
            mapA0u.put(rationalA0Y, sizeA0R);
        }
        map.put(bfN, arrayListA0h);
        return arrayListA0h;
    }

    public static boolean A04(Rational rational, Size size, C2564Bds c2564Bds) {
        Rational rational2 = c2564Bds.A01;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = AbstractC2498BcP.A03;
        Size size2 = AbstractC2484BcB.A05;
        if (AbstractC2498BcP.A01(rational, size, size2)) {
            return false;
        }
        float fFloatValue = rational2.floatValue();
        float fFloatValue2 = rational.floatValue();
        Rational rationalA0Y = AbstractC2498BcP.A02;
        if (!AbstractC2498BcP.A01(rationalA0Y, size, size2)) {
            rationalA0Y = AbstractC2498BcP.A00;
            if (!AbstractC2498BcP.A01(rationalA0Y, size, size2)) {
                rationalA0Y = BV8.A0Y(size);
            }
        }
        float fFloatValue3 = rationalA0Y.floatValue();
        if (fFloatValue == fFloatValue2 || fFloatValue2 == fFloatValue3) {
            return false;
        }
        return fFloatValue > fFloatValue2 ? fFloatValue2 < fFloatValue3 : fFloatValue2 > fFloatValue3;
    }

    public C2564Bds(InterfaceC2610Bfb interfaceC2610Bfb, Set<BfN<?>> set) {
        Rect rectAKM = interfaceC2610Bfb.ADG().AKM();
        RectF rectF = BfO.A00;
        Size sizeA0Z = BV8.A0Z(rectAKM);
        InterfaceC2544BdV interfaceC2544BdVADJ = interfaceC2610Bfb.ADJ();
        C2547BdY c2547BdY = new C2547BdY(sizeA0Z, interfaceC2544BdVADJ);
        this.A05 = BV4.A0u();
        this.A02 = sizeA0Z;
        Rational rational = ((double) sizeA0Z.getWidth()) / ((double) sizeA0Z.getHeight()) > A07 ? AbstractC2498BcP.A00 : AbstractC2498BcP.A02;
        StringBuilder sbA0f = C3cG.A0f(sizeA0Z, "The closer aspect ratio to the sensor size (");
        sbA0f.append(") is ");
        sbA0f.append(rational);
        AbstractC2875Bni.A01("ResolutionsMerger", AnonymousClass001.A0v(".", sbA0f));
        this.A01 = rational;
        Rational rational2 = AbstractC2498BcP.A02;
        if (rational.equals(rational2)) {
            rational2 = AbstractC2498BcP.A00;
        } else if (!rational.equals(AbstractC2498BcP.A00)) {
            throw BV5.A0O(rational, "Invalid sensor aspect-ratio: ");
        }
        this.A00 = rational2;
        this.A03 = interfaceC2544BdVADJ;
        this.A06 = set;
        this.A04 = c2547BdY;
    }

    public static Rect A00(Rational rational, Size size) {
        RectF rectF;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalA0Y = BV8.A0Y(size);
        if (rational.floatValue() == rationalA0Y.floatValue()) {
            rectF = new RectF(0.0f, 0.0f, width, height);
        } else if (rational.floatValue() > rationalA0Y.floatValue()) {
            float f = width;
            float fFloatValue = f / rational.floatValue();
            float f2 = (height - fFloatValue) / 2.0f;
            rectF = new RectF(0.0f, f2, f, fFloatValue + f2);
        } else {
            float f3 = height;
            float fFloatValue2 = rational.floatValue() * f3;
            float f4 = (width - fFloatValue2) / 2.0f;
            rectF = new RectF(f4, 0.0f, fFloatValue2 + f4, f3);
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static ArrayList A01(Rational rational, C2564Bds c2564Bds, List list, boolean z) {
        ArrayList arrayListA0h;
        ArrayList arrayListA0h2;
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size sizeA0R = BV6.A0R(it);
            Rational rational2 = AbstractC2498BcP.A03;
            if (AbstractC2498BcP.A01(rational, sizeA0R, AbstractC2484BcB.A05)) {
                arrayListA0h3.add(sizeA0R);
            }
        }
        C2482Bc9 c2482Bc9 = new C2482Bc9();
        c2482Bc9.A00 = true;
        Collections.sort(arrayListA0h3, c2482Bc9);
        HashSet hashSetA0x = BV4.A0x(arrayListA0h3);
        Iterator<BfN<?>> it2 = c2564Bds.A06.iterator();
        while (it2.hasNext()) {
            List listA03 = A03(it2.next(), c2564Bds);
            if (!z) {
                ArrayList arrayListA0h4 = C3cG.A0h();
                Iterator it3 = listA03.iterator();
                while (it3.hasNext()) {
                    Size sizeA0R2 = BV6.A0R(it3);
                    if (!A04(rational, sizeA0R2, c2564Bds)) {
                        arrayListA0h4.add(sizeA0R2);
                    }
                }
                listA03 = arrayListA0h4;
            }
            if (listA03.isEmpty()) {
                return C3cG.A0h();
            }
            if (listA03.isEmpty() || arrayListA0h3.isEmpty()) {
                arrayListA0h = C3cG.A0h();
            } else {
                arrayListA0h = C3cG.A0h();
                Iterator it4 = arrayListA0h3.iterator();
                while (it4.hasNext()) {
                    Size sizeA0R3 = BV6.A0R(it4);
                    Iterator it5 = listA03.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (!A05(BV6.A0R(it5), sizeA0R3)) {
                            arrayListA0h.add(sizeA0R3);
                            break;
                        }
                    }
                }
            }
            arrayListA0h3 = arrayListA0h;
            if (listA03.isEmpty() || arrayListA0h.isEmpty()) {
                arrayListA0h2 = C3cG.A0h();
            } else {
                if (!arrayListA0h.isEmpty()) {
                    arrayListA0h = BV4.A0t(new LinkedHashSet(arrayListA0h));
                }
                arrayListA0h2 = C3cG.A0h();
                Iterator it6 = arrayListA0h.iterator();
                while (it6.hasNext()) {
                    Size sizeA0R4 = BV6.A0R(it6);
                    Iterator it7 = listA03.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            arrayListA0h2.add(sizeA0R4);
                            break;
                        }
                        if (A05(BV6.A0R(it7), sizeA0R4)) {
                            break;
                        }
                    }
                }
                if (!arrayListA0h2.isEmpty()) {
                    arrayListA0h2.remove(C8j3.A0K(arrayListA0h2));
                }
            }
            hashSetA0x.retainAll(arrayListA0h2);
        }
        ArrayList arrayListA0h5 = C3cG.A0h();
        Iterator it8 = arrayListA0h3.iterator();
        while (it8.hasNext()) {
            Object next = it8.next();
            if (!hashSetA0x.contains(next)) {
                arrayListA0h5.add(next);
            }
        }
        return arrayListA0h5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        r1 = X.C3cG.A0h();
        r0 = X.BV8.A0Y(r3);
        r7.add(r0);
        r6.put(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList A02(X.C2564Bds r9, java.util.List r10, boolean r11) {
        /*
            java.util.HashMap r6 = X.BV4.A0u()
            android.util.Rational r5 = X.AbstractC2498BcP.A02
            java.util.ArrayList r0 = X.C3cG.A0h()
            r6.put(r5, r0)
            android.util.Rational r4 = X.AbstractC2498BcP.A00
            java.util.ArrayList r0 = X.C3cG.A0h()
            r6.put(r4, r0)
            java.util.ArrayList r7 = X.BV5.A0u(r5)
            r7.add(r4)
            java.util.Iterator r8 = r10.iterator()
        L21:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L61
            android.util.Size r3 = X.BV6.A0R(r8)
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L21
            java.util.Iterator r2 = r7.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4f
            java.lang.Object r1 = r2.next()
            android.util.Rational r1 = (android.util.Rational) r1
            android.util.Size r0 = X.AbstractC2484BcB.A05
            boolean r0 = X.AbstractC2498BcP.A01(r1, r3, r0)
            if (r0 == 0) goto L35
            java.util.List r1 = X.BV6.A0v(r1, r6)
            if (r1 != 0) goto L5d
        L4f:
            java.util.ArrayList r1 = X.C3cG.A0h()
            android.util.Rational r0 = X.BV8.A0Y(r3)
            r7.add(r0)
            r6.put(r0, r1)
        L5d:
            r1.add(r3)
            goto L21
        L61:
            java.util.Set r0 = r6.keySet()
            java.util.ArrayList r2 = X.BV4.A0t(r0)
            android.util.Size r0 = r9.A02
            android.util.Rational r1 = X.BV8.A0Y(r0)
            X.BZT r0 = new X.BZT
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r2.iterator()
        L7f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r1 = r2.next()
            android.util.Rational r1 = (android.util.Rational) r1
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L7f
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L7f
            java.util.List r0 = X.BV6.A0v(r1, r6)
            r0.getClass()
            java.util.ArrayList r0 = A01(r1, r9, r0, r11)
            r3.addAll(r0)
            goto L7f
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2564Bds.A02(X.Bds, java.util.List, boolean):java.util.ArrayList");
    }

    public static boolean A05(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }
}
