package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class BfG implements InterfaceC2630Bfx {
    public final InterfaceC2610Bfb A01;
    public final BgD A02;
    public final C2564Bds A03;
    public final Set<BfD> A07;
    public final Set<BfN<?>> A08;
    public final Map<BfD, BfN<?>> A09;
    public final Map<BfD, BfK> A05 = BV4.A0u();
    public final Map<BfD, BfP> A06 = BV4.A0u();
    public final Map<BfD, Boolean> A04 = BV4.A0u();
    public final BeX A00 = new F43(this, 4);

    public static BjC A00(BfD bfD) {
        boolean z = bfD instanceof C2605BfM;
        C2643Bga c2643Bga = bfD.A03;
        List<BjC> listA01 = z ? c2643Bga.A01() : Collections.unmodifiableList(c2643Bga.A02.A05);
        BeS.A07(BV7.A1S(listA01.size(), 1), null);
        if (listA01.size() == 1) {
            return listA01.get(0);
        }
        return null;
    }

    public final void A03(Map<BfD, BfK> map) {
        Map<BfD, BfK> map2 = this.A05;
        map2.clear();
        map2.putAll(map);
        Iterator itA0n = AnonymousClass002.A0n(map2);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            BfD bfD = (BfD) entryA0l.getKey();
            BfK bfK = (BfK) entryA0l.getValue();
            bfD.A0Q(bfK.A09);
            bfD.A0P(bfK.A08);
            AbstractC2481Bc8 abstractC2481Bc8 = bfK.A0A;
            bfD.A0T(abstractC2481Bc8);
            bfD.A04 = abstractC2481Bc8;
            bfD.A0O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BfG(InterfaceC2610Bfb interfaceC2610Bfb, BgD bgD, InterfaceC2677BhX interfaceC2677BhX, Set set) {
        this.A01 = interfaceC2610Bfb;
        this.A02 = bgD;
        this.A07 = set;
        HashMap mapA0u = BV4.A0u();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            BfD bfDA0S = BV6.A0S(it);
            mapA0u.put(bfDA0S, bfDA0S.A0F(interfaceC2610Bfb.ADJ(), null, bfDA0S.A0G(bgD, true)));
        }
        this.A09 = mapA0u;
        HashSet hashSetA0x = BV4.A0x(mapA0u.values());
        this.A08 = hashSetA0x;
        this.A03 = new C2564Bds(interfaceC2610Bfb, hashSetA0x);
        for (Object obj : set) {
            this.A04.put(obj, AnonymousClass001.A0h());
            this.A06.put(obj, new BfP(this, interfaceC2610Bfb, interfaceC2677BhX));
        }
    }

    public static BfT A01(BfD bfD, InterfaceC2610Bfb interfaceC2610Bfb, BfK bfK, C2564Bds c2564Bds, BfG bfG, int i, boolean z) {
        boolean z2;
        Size sizeA0R;
        int i2;
        int iAKO = interfaceC2610Bfb.ADJ().AKO(i);
        Matrix matrix = bfK.A08;
        RectF rectF = BfO.A00;
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = (f * f3) + (f2 * f4);
        float f6 = (f * f4) - (f2 * f3);
        double dSqrt = Math.sqrt((f * f) + (f2 * f2)) * Math.sqrt((f3 * f3) + (f4 * f4));
        boolean zA1N = AnonymousClass002.A1N((((float) Math.toDegrees(Math.atan2(f6 / dSqrt, f5 / dSqrt))) > 0.0f ? 1 : (((float) Math.toDegrees(Math.atan2(f6 / dSqrt, f5 / dSqrt))) == 0.0f ? 0 : -1)));
        BfN<?> bfN = bfG.A09.get(bfD);
        bfN.getClass();
        Rect rectA00 = bfK.A09;
        matrix.getValues(new float[9]);
        if (BfO.A03(((((int) BV6.A0G(Math.atan2(r0[3], r0[0]), 57.29577951308232d)) % 360) + 360) % 360)) {
            rectA00 = new Rect(rectA00.top, rectA00.left, rectA00.bottom, rectA00.right);
            z2 = true;
        } else {
            z2 = false;
        }
        int iWidth = rectA00.width();
        int iHeight = rectA00.height();
        if (z) {
            Size sizeA0P = BV6.A0P(iWidth, iHeight);
            Iterator it = C2564Bds.A03(bfN, c2564Bds).iterator();
            while (true) {
                if (!it.hasNext()) {
                    sizeA0R = sizeA0P;
                    break;
                }
                sizeA0R = BV8.A0Z(C2564Bds.A00(BV8.A0Y(sizeA0P), BV6.A0R(it)));
                if (!C2564Bds.A05(sizeA0R, sizeA0P)) {
                    break;
                }
            }
        } else {
            Size sizeA0P2 = BV6.A0P(iWidth, iHeight);
            List listA03 = C2564Bds.A03(bfN, c2564Bds);
            Iterator it2 = listA03.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listA03.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            sizeA0R = sizeA0P2;
                            break;
                        }
                        sizeA0R = BV6.A0R(it3);
                        if (!C2564Bds.A05(sizeA0R, sizeA0P2)) {
                            break;
                        }
                    }
                } else {
                    sizeA0R = BV6.A0R(it2);
                    Rational rationalA0Y = AbstractC2498BcP.A02;
                    Size size = AbstractC2484BcB.A05;
                    if (!AbstractC2498BcP.A01(rationalA0Y, sizeA0P2, size)) {
                        rationalA0Y = AbstractC2498BcP.A00;
                        if (!AbstractC2498BcP.A01(rationalA0Y, sizeA0P2, size)) {
                            rationalA0Y = BV8.A0Y(sizeA0P2);
                        }
                    }
                    if (!C2564Bds.A04(rationalA0Y, sizeA0R, c2564Bds) && !C2564Bds.A05(sizeA0R, sizeA0P2)) {
                        break;
                    }
                }
            }
            rectA00 = C2564Bds.A00(BV8.A0Y(sizeA0R), sizeA0P2);
        }
        Pair pairA0A = BV4.A0A(rectA00, sizeA0R);
        Rect rect = (Rect) pairA0A.first;
        Size sizeA0a = (Size) pairA0A.second;
        if (z2) {
            sizeA0a = BV8.A0a(sizeA0a);
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        Pair pairA0A2 = BV4.A0A(rect, sizeA0a);
        Rect rect2 = (Rect) pairA0A2.first;
        Size size2 = (Size) pairA0A2.second;
        int iAKO2 = bfG.A01.ADJ().AKO(InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, (InterfaceC2551Bdc) bfD.A05, 0));
        BfP bfP = bfG.A06.get(bfD);
        bfP.getClass();
        bfP.A01.A00 = iAKO2;
        int i3 = ((((bfK.A00 + iAKO2) - iAKO) % 360) + 360) % 360;
        if (bfD instanceof BfA) {
            i2 = 1;
        } else {
            i2 = 2;
            if (bfD instanceof C2605BfM) {
                i2 = 4;
            }
        }
        return new BfT(rect2, BfO.A01(size2, i3), UUID.randomUUID(), i2, bfD instanceof C2605BfM ? 256 : 34, i3, bfD.A0W(interfaceC2610Bfb) ^ zA1N);
    }

    public static void A02(BjC bjC, C2643Bga c2643Bga, BfK bfK) {
        bfK.A04();
        try {
            BoT.A00();
            BfK.A00(bfK);
            C2696Bhx c2696Bhx = bfK.A02;
            c2696Bhx.A05(bjC, new RunnableC2634Bg1(c2696Bhx));
        } catch (DeferrableSurface$SurfaceClosedException unused) {
            InterfaceC2641BgM interfaceC2641BgM = c2643Bga.A03;
            if (interfaceC2641BgM != null) {
                interfaceC2641BgM.AT5(c2643Bga, C79.A00);
            }
        }
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWy(BfD bfD) {
        BoT.A00();
        Map<BfD, Boolean> map = this.A04;
        Boolean bool = map.get(bfD);
        bool.getClass();
        if (bool.booleanValue()) {
            return;
        }
        map.put(bfD, AnonymousClass001.A0i());
        BjC bjCA00 = A00(bfD);
        if (bjCA00 != null) {
            BfK bfK = this.A05.get(bfD);
            bfK.getClass();
            A02(bjCA00, bfD.A03, bfK);
        }
    }

    @Override // X.InterfaceC2630Bfx
    public final void AWz(BfD bfD) {
        BoT.A00();
        Map<BfD, Boolean> map = this.A04;
        Boolean bool = map.get(bfD);
        bool.getClass();
        if (bool.booleanValue()) {
            map.put(bfD, AnonymousClass001.A0h());
            BfK bfK = this.A05.get(bfD);
            bfK.getClass();
            BoT.A00();
            BfK.A00(bfK);
            bfK.A02.A02();
        }
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX0(BfD bfD) {
        BjC bjCA00;
        BoT.A00();
        BfK bfK = this.A05.get(bfD);
        bfK.getClass();
        Boolean bool = this.A04.get(bfD);
        bool.getClass();
        if (!bool.booleanValue() || (bjCA00 = A00(bfD)) == null) {
            return;
        }
        A02(bjCA00, bfD.A03, bfK);
    }

    @Override // X.InterfaceC2630Bfx
    public final void AX1(BfD bfD) {
        BoT.A00();
        Boolean bool = this.A04.get(bfD);
        bool.getClass();
        if (bool.booleanValue()) {
            BfK bfK = this.A05.get(bfD);
            bfK.getClass();
            BjC bjCA00 = A00(bfD);
            if (bjCA00 != null) {
                A02(bjCA00, bfD.A03, bfK);
                return;
            }
            BoT.A00();
            BfK.A00(bfK);
            bfK.A02.A02();
        }
    }
}
