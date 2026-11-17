package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public abstract class BfD {
    public Rect A01;
    public AbstractC2481Bc8 A04;
    public BfN<?> A05;
    public BfN<?> A06;
    public InterfaceC2610Bfb A08;
    public BfN<?> A09;
    public BfN<?> A0A;
    public final Set<InterfaceC2630Bfx> A0B = C60O.A13();
    public final Object A0C = C3cG.A0T();
    public Integer A07 = C79.A01;
    public Matrix A00 = BV4.A08();
    public C2643Bga A03 = C2643Bga.A00();
    public C2643Bga A02 = C2643Bga.A00();

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0T(AbstractC2481Bc8 abstractC2481Bc8) {
        C2605BfM c2605BfM;
        if (this instanceof Bf9) {
            AbstractC2875Bni.A01("VideoCapture", AnonymousClass007.A0a("onSuggestedStreamSpecUpdated: ", abstractC2481Bc8));
            Collection collection = (Collection) this.A05.Abl(InterfaceC2551Bdc.A01, null);
            if (collection != null) {
                ArrayList arrayListA0t = BV4.A0t(collection);
                Size size = ((C2492BcJ) abstractC2481Bc8).A01;
                if (arrayListA0t.contains(size)) {
                    return;
                }
                AbstractC2875Bni.A03("VideoCapture", AnonymousClass006.A0y(arrayListA0t, " is not in custom ordered resolutions ", C3cG.A0f(size, "suggested resolution ")));
                return;
            }
            return;
        }
        if (this instanceof BfE) {
            BfE bfE = (BfE) this;
            String strA0H = bfE.A0H();
            bfE.A0C();
            bfE.A0U(BfE.A03(abstractC2481Bc8, null, ((BfD) bfE).A05, bfE, strA0H, null));
            c2605BfM = bfE;
        } else {
            if (this instanceof BfA) {
                BfA bfA = (BfA) this;
                BfA.A02(bfA, (C2593Beq) ((BfD) bfA).A05, abstractC2481Bc8);
                return;
            }
            if (!(this instanceof C2605BfM)) {
                BfL bfL = (BfL) this;
                Bf7 bf7 = (Bf7) ((BfD) bfL).A05;
                bfL.A0H();
                BgX bgXA00 = BfL.A00(bfL, bf7, abstractC2481Bc8);
                bfL.A02 = bgXA00;
                AbstractC2390BYs.A01(bfL, bgXA00);
                return;
            }
            C2605BfM c2605BfM2 = (C2605BfM) this;
            BgX bgXA01 = C2605BfM.A01(c2605BfM2, (Bf6) ((BfD) c2605BfM2).A05, abstractC2481Bc8, c2605BfM2.A0H());
            c2605BfM2.A03 = bgXA01;
            AbstractC2390BYs.A01(c2605BfM2, bgXA01);
            c2605BfM = c2605BfM2;
        }
        ((BfD) c2605BfM).A07 = C79.A00;
        c2605BfM.A0O();
    }

    private final void A0M() {
        if (this instanceof BfE) {
            BfE bfE = (BfE) this;
            BfE.A05(bfE);
            BfG bfG = bfE.A0A;
            Iterator<BfD> it = bfG.A07.iterator();
            while (it.hasNext()) {
                BfD bfDA0S = BV6.A0S(it);
                BfP bfP = bfG.A06.get(bfDA0S);
                bfP.getClass();
                bfDA0S.A0R(bfP);
            }
            return;
        }
        if (this instanceof BfA) {
            BfA.A00((BfA) this);
            return;
        }
        if (!(this instanceof C2605BfM)) {
            if (this instanceof BfL) {
                BfL bfL = (BfL) this;
                BoT.A00();
                C2625Bfs c2625Bfs = bfL.A03;
                if (c2625Bfs != null) {
                    C2625Bfs.A00(c2625Bfs);
                    bfL.A03 = null;
                }
                BjC bjC = bfL.A01;
                if (bjC != null) {
                    bjC.A02();
                    bfL.A01 = null;
                }
                BnR bnR = bfL.A04;
                bnR.A0C = false;
                bnR.A01();
                return;
            }
            return;
        }
        C2605BfM c2605BfM = (C2605BfM) this;
        C2766Bkc c2766Bkc = c2605BfM.A05;
        C2766Bkc.A01(c2766Bkc);
        C2766Bkc.A00(c2766Bkc);
        Bi1 bi1 = c2605BfM.A02;
        if (bi1 != null) {
            bi1.A00();
        }
        Log.d("ImageCapture", "clearPipeline");
        BoT.A00();
        C2625Bfs c2625Bfs2 = c2605BfM.A04;
        if (c2625Bfs2 != null) {
            C2625Bfs.A00(c2625Bfs2);
            c2605BfM.A04 = null;
        }
        Bi5 bi5 = c2605BfM.A01;
        if (bi5 != null) {
            bi5.A00();
            c2605BfM.A01 = null;
        }
        Bi1 bi12 = c2605BfM.A02;
        if (bi12 != null) {
            bi12.A00();
            c2605BfM.A02 = null;
        }
        c2605BfM.A0A().AeZ(null);
    }

    public final BfV A0A() {
        BfV bfVADG;
        synchronized (this.A0C) {
            InterfaceC2610Bfb interfaceC2610Bfb = this.A08;
            bfVADG = interfaceC2610Bfb == null ? BfV.A00 : interfaceC2610Bfb.ADG();
        }
        return bfVADG;
    }

    public final InterfaceC2610Bfb A0B() {
        InterfaceC2610Bfb interfaceC2610Bfb;
        synchronized (this.A0C) {
            interfaceC2610Bfb = this.A08;
        }
        return interfaceC2610Bfb;
    }

    public final InterfaceC2610Bfb A0C() {
        synchronized (this.A0C) {
        }
        return null;
    }

    public final BgN<?, ?, ?> A0D(InterfaceC2585Beh interfaceC2585Beh) {
        return this instanceof Bf9 ? new C2595Bet(C2582Bee.A01(interfaceC2585Beh)) : this instanceof BfE ? new C2597Bev(C2582Bee.A01(interfaceC2585Beh)) : this instanceof BfA ? new C2599Bex(C2582Bee.A01(interfaceC2585Beh)) : this instanceof C2605BfM ? new Bf5(C2582Bee.A01(interfaceC2585Beh)) : new Bf3(C2582Bee.A01(interfaceC2585Beh));
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.BfN<?> A0E(X.InterfaceC2544BdV r12, X.BgN<?, ?, ?> r13) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BfD.A0E(X.BdV, X.BgN):X.BfN");
    }

    public final BfN<?> A0F(InterfaceC2544BdV interfaceC2544BdV, BfN<?> bfN, BfN<?> bfN2) {
        C2582Bee c2582BeeA00;
        if (bfN2 != null) {
            c2582BeeA00 = C2582Bee.A01(bfN2);
            c2582BeeA00.A00.remove(BdG.A01);
        } else {
            c2582BeeA00 = C2582Bee.A00();
        }
        BfN<?> bfN3 = this.A06;
        AbstractC2531BdI<Integer> abstractC2531BdI = InterfaceC2551Bdc.A07;
        if (bfN3.A74(abstractC2531BdI) || this.A06.A74(InterfaceC2551Bdc.A08)) {
            AbstractC2531BdI<C2601Bez> abstractC2531BdI2 = InterfaceC2551Bdc.A05;
            TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> treeMap = c2582BeeA00.A00;
            if (treeMap.containsKey(abstractC2531BdI2)) {
                treeMap.remove(abstractC2531BdI2);
            }
        }
        BfN<?> bfN4 = this.A06;
        AbstractC2531BdI<C2601Bez> abstractC2531BdI3 = InterfaceC2551Bdc.A05;
        if (bfN4.A74(abstractC2531BdI3)) {
            AbstractC2531BdI<Size> abstractC2531BdI4 = InterfaceC2551Bdc.A03;
            TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> treeMap2 = c2582BeeA00.A00;
            if (treeMap2.containsKey(abstractC2531BdI4) && ((C2601Bez) this.A06.Abk(abstractC2531BdI3)).A02 != null) {
                treeMap2.remove(abstractC2531BdI4);
            }
        }
        Iterator<AbstractC2531BdI<?>> it = this.A06.APd().iterator();
        while (it.hasNext()) {
            Bf0.A01(it.next(), c2582BeeA00, this.A06, c2582BeeA00);
        }
        if (bfN != null) {
            for (AbstractC2531BdI<?> abstractC2531BdI5 : bfN.APd()) {
                if (!((C2530BdH) abstractC2531BdI5).A02.equals(((C2530BdH) BdG.A01).A02)) {
                    Bf0.A01(abstractC2531BdI5, c2582BeeA00, bfN, c2582BeeA00);
                }
            }
        }
        AbstractC2531BdI<Size> abstractC2531BdI6 = InterfaceC2551Bdc.A08;
        TreeMap<AbstractC2531BdI<?>, Map<BY1, Object>> treeMap3 = c2582BeeA00.A00;
        if (treeMap3.containsKey(abstractC2531BdI6) && treeMap3.containsKey(abstractC2531BdI)) {
            treeMap3.remove(abstractC2531BdI);
        }
        if (treeMap3.containsKey(abstractC2531BdI3) && ((C2601Bez) c2582BeeA00.Abk(abstractC2531BdI3)).A00 != 0) {
            c2582BeeA00.ANl(BfN.A0A, AnonymousClass001.A0i());
        }
        return A0E(interfaceC2544BdV, A0D(c2582BeeA00));
    }

    /* JADX WARN: Incorrect types in method signature: (ZLX/BgD;)LX/BfN<*>; */
    public final BfN A0G(BgD bgD, boolean z) {
        if (this instanceof Bf9) {
            C2594Bes<?> c2594Bes = AbstractC2596Beu.A02;
            InterfaceC2585Beh interfaceC2585BehADs = bgD.ADs(c2594Bes.ADT(), 1);
            if (z) {
                interfaceC2585BehADs = Bf0.A00(interfaceC2585BehADs, c2594Bes);
            }
            if (interfaceC2585BehADs != null) {
                return new C2595Bet(C2582Bee.A01(interfaceC2585BehADs)).AMK();
            }
            return null;
        }
        if (this instanceof BfE) {
            Bep bep = ((BfE) this).A09;
            InterfaceC2585Beh interfaceC2585BehADs2 = bgD.ADs(bep.ADT(), 1);
            if (z) {
                interfaceC2585BehADs2 = Bf0.A00(interfaceC2585BehADs2, bep.A00);
            }
            if (interfaceC2585BehADs2 != null) {
                return new C2597Bev(C2582Bee.A01(interfaceC2585BehADs2)).AMK();
            }
            return null;
        }
        if (this instanceof BfA) {
            C2593Beq c2593Beq = AbstractC2600Bey.A00;
            InterfaceC2585Beh interfaceC2585BehADs3 = bgD.ADs(c2593Beq.ADT(), 1);
            if (z) {
                interfaceC2585BehADs3 = Bf0.A00(interfaceC2585BehADs3, c2593Beq);
            }
            if (interfaceC2585BehADs3 != null) {
                return new C2599Bex(C2582Bee.A01(interfaceC2585BehADs3)).AMK();
            }
            return null;
        }
        if (this instanceof C2605BfM) {
            Bf6 bf6 = Bf4.A00;
            InterfaceC2585Beh interfaceC2585BehADs4 = bgD.ADs(bf6.ADT(), ((C2605BfM) this).A06);
            if (z) {
                interfaceC2585BehADs4 = Bf0.A00(interfaceC2585BehADs4, bf6);
            }
            if (interfaceC2585BehADs4 != null) {
                return new Bf5(C2582Bee.A01(interfaceC2585BehADs4)).AMK();
            }
            return null;
        }
        Bf7 bf7 = Bf2.A00;
        InterfaceC2585Beh interfaceC2585BehADs5 = bgD.ADs(bf7.ADT(), 1);
        if (z) {
            interfaceC2585BehADs5 = Bf0.A00(interfaceC2585BehADs5, bf7);
        }
        if (interfaceC2585BehADs5 != null) {
            return new Bf3(C2582Bee.A01(interfaceC2585BehADs5)).AMK();
        }
        return null;
    }

    public final String A0I() {
        String str = (String) this.A05.Abl(BdG.A01, FGI.A0I("<UnknownUseCase-", hashCode(), ">"));
        str.getClass();
        return str;
    }

    public final Set<Integer> A0J() {
        if (this instanceof Bf9) {
            HashSet hashSetA13 = C60O.A13();
            C60Q.A1P(hashSetA13, 2);
            return hashSetA13;
        }
        if (this instanceof BfE) {
            HashSet hashSetA132 = C60O.A13();
            C60Q.A1P(hashSetA132, 3);
            return hashSetA132;
        }
        if (this instanceof BfA) {
            HashSet hashSetA133 = C60O.A13();
            C60Q.A1P(hashSetA133, 1);
            return hashSetA133;
        }
        if (!(this instanceof C2605BfM)) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSetA134 = C60O.A13();
        C60Q.A1P(hashSetA134, 4);
        return hashSetA134;
    }

    public final void A0K() throws ExecutionException, InterruptedException {
        if (!(this instanceof Bf9)) {
            if (this instanceof BfE) {
                Iterator<BfD> it = ((BfE) this).A0A.A07.iterator();
                while (it.hasNext()) {
                    BfD bfDA0S = BV6.A0S(it);
                    bfDA0S.A0K();
                    if (bfDA0S instanceof C2605BfM) {
                        C2605BfM c2605BfM = (C2605BfM) bfDA0S;
                        AbstractC2875Bni.A01("ImageCapture", "onCameraControlReady");
                        C2605BfM.A02(c2605BfM);
                        c2605BfM.A0A().AeZ(c2605BfM.A05);
                    }
                }
                return;
            }
            return;
        }
        Bf9 bf9 = (Bf9) this;
        AbstractC2875Bni.A01("VideoCapture", FGI.A0M("VideoCapture#onStateAttached: cameraID = ", bf9.A0H()));
        AbstractC2481Bc8 abstractC2481Bc8 = ((BfD) bf9).A04;
        if (abstractC2481Bc8 == null || bf9.A00 != null) {
            return;
        }
        InterfaceC2620Bfm<BfR> interfaceC2620BfmALA = bf9.A0X().ALA();
        BfR bfR = BfR.A01;
        ListenableFuture<BfR> listenableFutureABL = interfaceC2620BfmALA.ABL();
        if (listenableFutureABL.isDone()) {
            try {
                bfR = listenableFutureABL.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        bf9.A03 = bfR;
        BgX bgXA01 = Bf9.A01(abstractC2481Bc8, bf9, (C2594Bes) ((BfD) bf9).A05);
        bf9.A02 = bgXA01;
        bf9.A0Z(bgXA01, abstractC2481Bc8, bf9.A03);
        AbstractC2390BYs.A01(bf9, bf9.A02);
        ((BfD) bf9).A07 = C79.A00;
        bf9.A0O();
        bf9.A0X().ALA().A3j(bf9.A0D, BoS.A00());
        C2606BfS c2606BfS = bf9.A04;
        if (c2606BfS != null) {
            c2606BfS.A00();
        }
        BfV bfVA0A = bf9.A0A();
        C2606BfS c2606BfS2 = new C2606BfS();
        c2606BfS2.A01 = false;
        c2606BfS2.A00 = bfVA0A;
        bf9.A04 = c2606BfS2;
        bf9.A0X().AP4().A3j(bf9.A04, BoS.A00());
        Integer num = C79.A01;
        if (num != bf9.A06) {
            bf9.A06 = num;
            bf9.A0X().AW2(num);
        }
    }

    public final void A0L() {
        if (!(this instanceof Bf9)) {
            if (this instanceof BfE) {
                Iterator<BfD> it = ((BfE) this).A0A.A07.iterator();
                while (it.hasNext()) {
                    BV6.A0S(it).A0L();
                }
                return;
            } else {
                if (this instanceof C2605BfM) {
                    C2605BfM c2605BfM = (C2605BfM) this;
                    C2766Bkc c2766Bkc = c2605BfM.A05;
                    C2766Bkc.A01(c2766Bkc);
                    C2766Bkc.A00(c2766Bkc);
                    Bi1 bi1 = c2605BfM.A02;
                    if (bi1 != null) {
                        bi1.A00();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Bf9 bf9 = (Bf9) this;
        AbstractC2875Bni.A01("VideoCapture", "VideoCapture#onStateDetached");
        BeS.A07(AnonymousClass002.A1Z(BV5.A0s(), Thread.currentThread()), "VideoCapture can only be detached on the main thread.");
        if (bf9.A04 != null) {
            bf9.A0X().AP4().Aau(bf9.A04);
            bf9.A04.A00();
            bf9.A04 = null;
        }
        Integer num = C79.A0C;
        if (num != bf9.A06) {
            bf9.A06 = num;
            bf9.A0X().AW2(num);
        }
        bf9.A0X().ALA().Aau(bf9.A0D);
        ListenableFuture<Void> listenableFuture = bf9.A05;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            AbstractC2875Bni.A01("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        Bf9.A05(bf9);
    }

    public final void A0N() {
        Iterator<InterfaceC2630Bfx> it = this.A0B.iterator();
        while (it.hasNext()) {
            it.next().AX0(this);
        }
    }

    public final void A0O() {
        int iIntValue = this.A07.intValue();
        Iterator<InterfaceC2630Bfx> it = this.A0B.iterator();
        if (iIntValue != 0) {
            while (it.hasNext()) {
                it.next().AWz(this);
            }
        } else {
            while (it.hasNext()) {
                it.next().AWy(this);
            }
        }
    }

    public void A0P(Matrix matrix) {
        this.A00 = new Matrix(matrix);
    }

    public final void A0Q(Rect rect) {
        if (this instanceof Bf9) {
            Bf9 bf9 = (Bf9) this;
            ((BfD) bf9).A01 = rect;
            Bf9.A06(bf9);
            return;
        }
        if (this instanceof BfA) {
            BfA bfA = (BfA) this;
            ((BfD) bfA).A01 = rect;
            BfA.A01(bfA);
        } else {
            if (!(this instanceof BfL)) {
                this.A01 = rect;
                return;
            }
            BfL bfL = (BfL) this;
            ((BfD) bfL).A01 = rect;
            BnR bnR = bfL.A04;
            synchronized (bnR.A0D) {
                bnR.A02 = rect;
                bnR.A03 = new Rect(rect);
            }
        }
    }

    public final void A0S(InterfaceC2610Bfb interfaceC2610Bfb, BfN bfN, BfN bfN2) {
        synchronized (this.A0C) {
            this.A08 = interfaceC2610Bfb;
            this.A0B.add(interfaceC2610Bfb);
        }
        this.A0A = bfN;
        this.A09 = bfN2;
        this.A05 = A0F(interfaceC2610Bfb.ADJ(), bfN, bfN2);
        if (this instanceof BfE) {
            BfG bfG = ((BfE) this).A0A;
            Iterator<BfD> it = bfG.A07.iterator();
            while (it.hasNext()) {
                BfD bfDA0S = BV6.A0S(it);
                BfP bfP = bfG.A06.get(bfDA0S);
                bfP.getClass();
                bfDA0S.A0S(bfP, null, bfDA0S.A0G(bfG.A02, true));
            }
            return;
        }
        if (!(this instanceof C2605BfM)) {
            if (this instanceof BfL) {
                ((BfL) this).A04.A0C = true;
                return;
            }
            return;
        }
        C2605BfM c2605BfM = (C2605BfM) this;
        BeS.A03(c2605BfM.A0B(), "Attached camera cannot be null");
        if (C2605BfM.A00(c2605BfM) == 3) {
            InterfaceC2610Bfb interfaceC2610BfbA0B = c2605BfM.A0B();
            if (interfaceC2610BfbA0B == null || interfaceC2610BfbA0B.ADJ().AH3() != 0) {
                throw C60O.A0i("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final boolean A0V(int i) {
        Size size;
        InterfaceC2551Bdc interfaceC2551Bdc = (InterfaceC2551Bdc) this.A05;
        AbstractC2531BdI<Integer> abstractC2531BdI = InterfaceC2551Bdc.A09;
        int iA00 = InterfaceC2586Bei.A00(abstractC2531BdI, interfaceC2551Bdc, -1);
        if (iA00 != -1 && iA00 == i) {
            return false;
        }
        BgN<?, ?, ?> bgNA0D = A0D(this.A06);
        InterfaceC2551Bdc interfaceC2551Bdc2 = (InterfaceC2551Bdc) bgNA0D.AMK();
        int iA002 = InterfaceC2586Bei.A00(abstractC2531BdI, interfaceC2551Bdc2, -1);
        if (iA002 == -1 || iA002 != i) {
            ((Bg5) bgNA0D).Aex(i);
        }
        if (iA002 != -1 && i != -1 && iA002 != i) {
            if (Math.abs(AbstractC2467Bbu.A00(i) - AbstractC2467Bbu.A00(iA002)) % 180 == 90 && (size = (Size) interfaceC2551Bdc2.Abl(InterfaceC2551Bdc.A08, null)) != null) {
                ((Bg5) bgNA0D).Aew(BV8.A0a(size));
            }
        }
        this.A06 = bgNA0D.AMK();
        InterfaceC2610Bfb interfaceC2610BfbA0B = A0B();
        this.A05 = interfaceC2610BfbA0B == null ? this.A06 : A0F(interfaceC2610BfbA0B.ADJ(), this.A0A, this.A09);
        return true;
    }

    public final boolean A0W(InterfaceC2610Bfb interfaceC2610Bfb) {
        int iA00 = InterfaceC2586Bei.A00(InterfaceC2551Bdc.A04, this.A05, -1);
        if (iA00 == -1 || iA00 == 0) {
            return false;
        }
        if (iA00 == 1) {
            return true;
        }
        if (iA00 == 2) {
            return AnonymousClass002.A1M(interfaceC2610Bfb.ADJ().AH3());
        }
        throw BV4.A0N(FGI.A0H("Unknown mirrorMode: ", iA00));
    }

    public BfD(BfN<?> bfN) {
        this.A06 = bfN;
        this.A05 = bfN;
    }

    public static Rect A08(Size size) {
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public final int A09(InterfaceC2610Bfb interfaceC2610Bfb, boolean z) {
        int iAKO = interfaceC2610Bfb.ADJ().AKO(InterfaceC2586Bei.A00(InterfaceC2551Bdc.A09, (InterfaceC2551Bdc) this.A05, 0));
        if (interfaceC2610Bfb.AG8() || !z) {
            return iAKO;
        }
        RectF rectF = BfO.A00;
        return (((-iAKO) % 360) + 360) % 360;
    }

    public final String A0H() {
        InterfaceC2610Bfb interfaceC2610BfbA0B = A0B();
        BeS.A03(interfaceC2610BfbA0B, AnonymousClass007.A0a("No camera attached to use case: ", this));
        return interfaceC2610BfbA0B.ADJ().ADH();
    }

    public final void A0R(InterfaceC2610Bfb interfaceC2610Bfb) {
        A0M();
        synchronized (this.A0C) {
            InterfaceC2610Bfb interfaceC2610Bfb2 = this.A08;
            if (interfaceC2610Bfb == interfaceC2610Bfb2) {
                this.A0B.remove(interfaceC2610Bfb2);
                this.A08 = null;
            }
        }
        this.A04 = null;
        this.A01 = null;
        this.A05 = this.A06;
        this.A0A = null;
        this.A09 = null;
    }

    public final void A0U(List<C2643Bga> list) {
        if (list.isEmpty()) {
            return;
        }
        this.A03 = (C2643Bga) C8j4.A0p(list);
        if (list.size() > 1) {
            this.A02 = list.get(1);
        }
        Iterator<C2643Bga> it = list.iterator();
        while (it.hasNext()) {
            for (BjC bjC : it.next().A01()) {
                if (bjC.A03 == null) {
                    bjC.A03 = getClass();
                }
            }
        }
    }
}
