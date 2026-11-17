package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class BfE extends BfD {
    public BgX A00;
    public BgX A01;
    public C2625Bfs A02;
    public BfK A03;
    public BfK A04;
    public BfJ A05;
    public BfK A06;
    public BfK A07;
    public C2604BfI A08;
    public final Bep A09;
    public final BfG A0A;
    public final C2693Bht A0B;
    public final C2693Bht A0C;

    /* JADX WARN: Incorrect types in method signature: (LX/BfK;LX/BfN<*>;LX/Bc8;)LX/BgX; */
    private BgX A00(AbstractC2481Bc8 abstractC2481Bc8, BfN bfN, BfK bfK) {
        C2492BcJ c2492BcJ = (C2492BcJ) abstractC2481Bc8;
        Size size = c2492BcJ.A01;
        BgX bgXA00 = BgX.A00(size, bfN);
        BfG bfG = this.A0A;
        Set<BfD> set = bfG.A07;
        Iterator<BfD> it = set.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((C2643Bga) BV6.A0S(it).A05.Abk(BfN.A03)).A02.A00;
            List<Integer> list = C2643Bga.A09;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            bgXA00.A04.A00 = i;
        }
        Iterator<BfD> it2 = set.iterator();
        while (it2.hasNext()) {
            C2643Bga c2643BgaA01 = BgX.A00(size, BV6.A0S(it2).A05).A01();
            C2646Bgd c2646Bgd = c2643BgaA01.A02;
            List<BeX> list2 = c2646Bgd.A04;
            C2645Bgc c2645Bgc = bgXA00.A04;
            c2645Bgc.A03(list2);
            for (BeX beX : c2643BgaA01.A08) {
                BV7.A1E(beX, c2645Bgc.A04);
                List<BeX> list3 = bgXA00.A07;
                if (!list3.contains(beX)) {
                    list3.add(beX);
                }
            }
            Iterator<CameraCaptureSession.StateCallback> it3 = c2643BgaA01.A07.iterator();
            while (it3.hasNext()) {
                BV7.A1E(it3.next(), bgXA00.A06);
            }
            Iterator<CameraDevice.StateCallback> it4 = c2643BgaA01.A05.iterator();
            while (it4.hasNext()) {
                BV7.A1E(it4.next(), bgXA00.A05);
            }
            c2645Bgc.A02(c2646Bgd.A02);
        }
        BoT.A00();
        BfK.A00(bfK);
        BeS.A07(!bfK.A03, "Consumer can only be linked once.");
        bfK.A03 = true;
        bgXA00.A03(c2492BcJ.A02, bfK.A02, -1);
        BeX beX2 = bfG.A00;
        C2645Bgc c2645Bgc2 = bgXA00.A04;
        BV7.A1E(beX2, c2645Bgc2.A04);
        InterfaceC2585Beh interfaceC2585Beh = c2492BcJ.A03;
        if (interfaceC2585Beh != null) {
            c2645Bgc2.A02(interfaceC2585Beh);
        }
        return bgXA00;
    }

    public static Bep A01(Set<BfD> set) {
        C2582Bee c2582Bee = new C2597Bev().A00;
        BV6.A11(InterfaceC2490BcH.A01, c2582Bee, 34);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<BfD> it = set.iterator();
        while (it.hasNext()) {
            BfD bfDA0S = BV6.A0S(it);
            if (bfDA0S.A05.A74(BfN.A01)) {
                arrayListA0h.add(bfDA0S.A05.ADT());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c2582Bee.ANl(Bep.A01, arrayListA0h);
        BV6.A11(InterfaceC2551Bdc.A04, c2582Bee, 2);
        return new Bep(C2584Beg.A02(c2582Bee));
    }

    public static List A03(AbstractC2481Bc8 abstractC2481Bc8, AbstractC2481Bc8 abstractC2481Bc82, BfN bfN, BfE bfE, String str, String str2) {
        boolean z;
        BoT.A00();
        if (abstractC2481Bc82 == null) {
            bfE.A04(abstractC2481Bc8, null, bfN, str, str2);
            InterfaceC2610Bfb interfaceC2610BfbA0B = bfE.A0B();
            interfaceC2610BfbA0B.getClass();
            bfE.A05 = new BfJ(interfaceC2610BfbA0B, BgJ.A00.apply(((C2492BcJ) abstractC2481Bc8).A02));
            z = ((BfD) bfE).A01 != null;
            BfG bfG = bfE.A0A;
            BfK bfK = bfE.A07;
            int iA00 = InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, (InterfaceC2551Bdc) ((BfD) bfE).A05, 0);
            HashMap mapA0u = BV4.A0u();
            for (BfD bfD : bfG.A07) {
                mapA0u.put(bfD, BfG.A01(bfD, bfG.A01, bfK, bfG.A03, bfG, iA00, z));
            }
            BgH bgHA01 = bfE.A05.A01(new BfZ(bfE.A07, BV4.A0t(mapA0u.values())));
            HashMap mapA0u2 = BV4.A0u();
            Iterator itA0i = C3cG.A0i(mapA0u);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                mapA0u2.put(entryA0l.getKey(), bgHA01.get(entryA0l.getValue()));
            }
            bfG.A03(mapA0u2);
            return AbstractC2390BYs.A00(bfE.A01.A01());
        }
        bfE.A04(abstractC2481Bc8, abstractC2481Bc82, bfN, str, str2);
        Matrix matrix = ((BfD) bfE).A00;
        InterfaceC2610Bfb interfaceC2610BfbA0C = bfE.A0C();
        interfaceC2610BfbA0C.getClass();
        boolean zAG8 = interfaceC2610BfbA0C.AG8();
        Rect rect = ((BfD) bfE).A01;
        InterfaceC2610Bfb interfaceC2610BfbA0C2 = bfE.A0C();
        interfaceC2610BfbA0C2.getClass();
        int iA09 = bfE.A09(interfaceC2610BfbA0C2, false);
        InterfaceC2610Bfb interfaceC2610BfbA0C3 = bfE.A0C();
        interfaceC2610BfbA0C3.getClass();
        BfK bfK2 = new BfK(matrix, rect, abstractC2481Bc82, 3, 34, iA09, -1, zAG8, bfE.A0W(interfaceC2610BfbA0C3));
        bfE.A03 = bfK2;
        bfE.A0C().getClass();
        bfE.A04 = bfK2;
        BgX bgXA00 = bfE.A00(abstractC2481Bc82, bfN, bfE.A03);
        bfE.A00 = bgXA00;
        bfE.A02.A00.set(true);
        C2625Bfs c2625Bfs = new C2625Bfs(new BfQ(abstractC2481Bc8, abstractC2481Bc82, bfN, bfE, str, str2));
        bfE.A02 = c2625Bfs;
        bgXA00.A02 = c2625Bfs;
        bfE.A08 = new C2604BfI(bfE.A0B(), bfE.A0C(), AbstractC2640BgK.A00.invoke(((C2492BcJ) abstractC2481Bc8).A02, bfE.A0B, bfE.A0C));
        z = ((BfD) bfE).A01 != null;
        BfG bfG2 = bfE.A0A;
        BfK bfK3 = bfE.A07;
        int iA002 = InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, (InterfaceC2551Bdc) ((BfD) bfE).A05, 0);
        HashMap mapA0u3 = BV4.A0u();
        Iterator<BfD> it = bfG2.A07.iterator();
        if (it.hasNext()) {
            BfG.A01(it.next(), bfG2.A01, bfK3, bfG2.A03, bfG2, iA002, z);
            Object obj = null;
            obj.getClass();
            throw F60.createAndThrow();
        }
        C2604BfI c2604BfI = bfE.A08;
        BfY bfY = new BfY(bfE.A07, bfE.A04, BV4.A0t(mapA0u3.values()));
        BoT.A00();
        c2604BfI.A00 = bfY;
        c2604BfI.A01 = new C2639BgI();
        BfK bfK4 = bfY.A00;
        BfK bfK5 = bfY.A01;
        Iterator it2 = bfY.A02.iterator();
        if (it2.hasNext()) {
            it2.next();
            throw BV4.A0a("primaryOutConfig");
        }
        try {
            c2604BfI.A04.ATf(bfK4.A02(c2604BfI.A02));
        } catch (ProcessingException e) {
            AbstractC2875Bni.A05("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        try {
            c2604BfI.A04.ATf(bfK5.A02(c2604BfI.A03));
        } catch (ProcessingException e2) {
            AbstractC2875Bni.A05("DualSurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e2);
        }
        Iterator itA0i2 = C3cG.A0i(c2604BfI.A01);
        if (itA0i2.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0i2.next();
            entry.getValue();
            entry.getKey();
            throw BV4.A0a("primaryOutConfig");
        }
        C2639BgI c2639BgI = c2604BfI.A01;
        HashMap mapA0u4 = BV4.A0u();
        Iterator itA0i3 = C3cG.A0i(mapA0u3);
        while (itA0i3.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0i3);
            mapA0u4.put(entryA0l2.getKey(), c2639BgI.get(entryA0l2.getValue()));
        }
        bfG2.A03(mapA0u4);
        Object[] objArr = {bfE.A01.A01(), bfE.A00.A01()};
        ArrayList arrayListA11 = C60O.A11(2);
        int i = 0;
        do {
            arrayListA11.add(BV6.A0n(objArr, i));
            i++;
        } while (i < 2);
        return Collections.unmodifiableList(arrayListA11);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;LX/BfN<*>;LX/Bc8;LX/Bc8;)V */
    private void A04(AbstractC2481Bc8 abstractC2481Bc8, AbstractC2481Bc8 abstractC2481Bc82, BfN bfN, String str, String str2) {
        Matrix matrix = super.A00;
        InterfaceC2610Bfb interfaceC2610BfbA0B = A0B();
        interfaceC2610BfbA0B.getClass();
        boolean zAG8 = interfaceC2610BfbA0B.AG8();
        Size size = ((C2492BcJ) abstractC2481Bc8).A01;
        Rect rectA08 = super.A01;
        if (rectA08 == null) {
            rectA08 = BfD.A08(size);
        }
        InterfaceC2610Bfb interfaceC2610BfbA0B2 = A0B();
        interfaceC2610BfbA0B2.getClass();
        int iA09 = A09(interfaceC2610BfbA0B2, false);
        InterfaceC2610Bfb interfaceC2610BfbA0B3 = A0B();
        interfaceC2610BfbA0B3.getClass();
        BfK bfK = new BfK(matrix, rectA08, abstractC2481Bc8, 3, 34, iA09, -1, zAG8, A0W(interfaceC2610BfbA0B3));
        this.A06 = bfK;
        A0B().getClass();
        this.A07 = bfK;
        BgX bgXA00 = A00(abstractC2481Bc8, bfN, this.A06);
        this.A01 = bgXA00;
        C2625Bfs c2625Bfs = this.A02;
        if (c2625Bfs != null) {
            C2625Bfs.A00(c2625Bfs);
        }
        C2625Bfs c2625Bfs2 = new C2625Bfs(new BfQ(abstractC2481Bc8, abstractC2481Bc82, bfN, this, str, str2));
        this.A02 = c2625Bfs2;
        bgXA00.A02 = c2625Bfs2;
    }

    public static void A05(BfE bfE) {
        C2625Bfs c2625Bfs = bfE.A02;
        if (c2625Bfs != null) {
            C2625Bfs.A00(c2625Bfs);
            bfE.A02 = null;
        }
        BfK bfK = bfE.A06;
        if (bfK != null) {
            bfK.A03();
            bfE.A06 = null;
        }
        BfK bfK2 = bfE.A07;
        if (bfK2 != null) {
            bfK2.A03();
            bfE.A07 = null;
        }
        BfJ bfJ = bfE.A05;
        if (bfJ != null) {
            bfJ.A03.release();
            BoT.A01(new RunnableC2618Bfk(bfJ));
            bfE.A05 = null;
        }
    }

    public BfE(C2693Bht c2693Bht, C2693Bht c2693Bht2, InterfaceC2610Bfb interfaceC2610Bfb, BgD bgD, Set set) {
        super(A01(set));
        this.A09 = A01(set);
        this.A0B = c2693Bht;
        this.A0C = c2693Bht2;
        this.A0A = new BfG(interfaceC2610Bfb, bgD, new BgF(this), set);
    }

    public static List<EnumC2489BcG> A02(BfD bfD) {
        ArrayList arrayListA0h = C3cG.A0h();
        if (bfD instanceof BfE) {
            Iterator<BfD> it = ((BfE) bfD).A0A.A07.iterator();
            while (it.hasNext()) {
                arrayListA0h.add(BV6.A0S(it).A05.ADT());
            }
        } else {
            arrayListA0h.add(bfD.A05.ADT());
        }
        return arrayListA0h;
    }
}
