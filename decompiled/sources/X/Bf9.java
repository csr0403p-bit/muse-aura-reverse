package X;

import X.InterfaceC2616Bfh;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* loaded from: classes5.dex */
public final class Bf9<T extends InterfaceC2616Bfh> extends BfD {
    public static final Bf9 $redex_init_class = null;
    public BmM A00;
    public BjC A01;
    public BgX A02;
    public BfR A03;
    public C2606BfS A04;
    public ListenableFuture<Void> A05;
    public Integer A06;
    public boolean A07;
    public int A08;
    public Rect A09;
    public C2625Bfs A0A;
    public BfK A0B;
    public BfJ A0C;
    public final InterfaceC2655Bgn<BfR> A0D;

    static {
        C2594Bes<?> c2594Bes = AbstractC2596Beu.A02;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BpS<LX/BdF;LX/BbP;>;LX/Bcy;LX/BdC;Landroid/util/Size;LX/Bcd;Landroid/util/Range<Ljava/lang/Integer;>;)LX/BbP; */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f A[PHI: r3
  0x008f: PHI (r3v5 X.BbP) = (r3v3 X.BbP), (r3v2 X.BbP) binds: [B:21:0x008d, B:18:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC2436BbP A03(android.util.Range r14, android.util.Size r15, X.BpS r16, X.C2507Bcd r17, X.BdC r18, X.AbstractC2527Bcy r19) {
        /*
            r2 = r18
            r1 = r19
            r5 = r17
            X.Bd5 r0 = X.Bd2.A01(r5, r2, r1)
            X.BWz r7 = X.BWz.UPTIME
            X.Bdm r2 = (X.C2558Bdm) r2
            X.BbT r8 = r2.A02
            X.Bcf r6 = r0.A01
            r3 = r14
            r4 = r15
            if (r6 == 0) goto L34
            java.lang.String r9 = r0.A02
            X.Bd3 r2 = new X.Bd3
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L1d:
            java.lang.Object r0 = r2.get()
            r2 = r16
            java.lang.Object r3 = r2.apply(r0)
            X.BbP r3 = (X.InterfaceC2436BbP) r3
            r2 = 0
            if (r3 != 0) goto L42
            java.lang.String r1 = "VideoCapture"
            java.lang.String r0 = "Can't find videoEncoderInfo"
            X.AbstractC2875Bni.A03(r1, r0)
            return r2
        L34:
            java.lang.String r15 = r0.A02
            X.Bd4 r2 = new X.Bd4
            r9 = r2
            r10 = r14
            r11 = r4
            r12 = r5
            r13 = r7
            r14 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
            goto L1d
        L42:
            if (r19 == 0) goto L52
            X.Bcv r1 = (X.C2524Bcv) r1
            X.Bcf r0 = r1.A01
            X.Bcr r0 = (X.C2520Bcr) r0
            int r1 = r0.A08
            int r0 = r0.A06
            android.util.Size r2 = X.BV6.A0P(r1, r0)
        L52:
            boolean r0 = r3 instanceof X.C2435BbO
            if (r0 != 0) goto L8d
            java.lang.Class<androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk> r1 = androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk.class
            X.Bch r0 = X.AbstractC2411BaU.A00
            X.BX1 r0 = r0.A01(r1)
            if (r0 != 0) goto L87
            if (r2 == 0) goto L9b
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            boolean r0 = X.AbstractC2438BbR.A00(r3, r1, r0)
            if (r0 != 0) goto L8f
            android.util.Range r1 = r3.ALR()
            android.util.Range r0 = r3.ALM()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Detected that the device does not support a size %s that should be valid in widths/heights = %s/%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "VideoEncoderInfoWrapper"
            X.AbstractC2875Bni.A03(r0, r1)
        L87:
            X.BbO r0 = new X.BbO
            r0.<init>(r3)
            r3 = r0
        L8d:
            if (r2 == 0) goto L9b
        L8f:
            boolean r0 = r3 instanceof X.C2435BbO
            if (r0 == 0) goto L9b
            r0 = r3
            X.BbO r0 = (X.C2435BbO) r0
            java.util.Set<android.util.Size> r0 = r0.A00
            r0.add(r2)
        L9b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bf9.A03(android.util.Range, android.util.Size, X.BpS, X.Bcd, X.BdC, X.Bcy):X.BbP");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Set<Landroid/util/Size;>;IILandroid/util/Size;LX/BbP;)V */
    public static void A04(Size size, InterfaceC2436BbP interfaceC2436BbP, Set set, int i, int i2) {
        if (i > size.getWidth() || i2 > size.getHeight()) {
            return;
        }
        try {
            set.add(BV6.A0P(i, BV8.A05(interfaceC2436BbP.ALN(i), i2)));
        } catch (IllegalArgumentException e) {
            AbstractC2875Bni.A06("VideoCapture", FGI.A0H("No supportedHeights for width: ", i), e);
        }
        try {
            set.add(BV6.A0P(BV8.A05(interfaceC2436BbP.ALS(i2), i), i2));
        } catch (IllegalArgumentException e2) {
            AbstractC2875Bni.A06("VideoCapture", FGI.A0H("No supportedWidths for height: ", i2), e2);
        }
    }

    public final T A0X() {
        C2594Bes c2594Bes = (C2594Bes) super.A05;
        T t = (T) c2594Bes.A00.Abk(C2594Bes.A03);
        t.getClass();
        return t;
    }

    public final void A0Z(BgX bgX, AbstractC2481Bc8 abstractC2481Bc8, BfR bfR) {
        BjC bjC;
        C2611Bfc c2611Bfc = (C2611Bfc) bfR;
        boolean zA1Q = AnonymousClass002.A1Q(c2611Bfc.A00, -1);
        boolean z = c2611Bfc.A02 == C79.A00;
        if (zA1Q && z) {
            throw C3cG.A0Q("Unexpected stream state, stream is error but active");
        }
        bgX.A08.clear();
        bgX.A04.A07.clear();
        C2507Bcd c2507Bcd = ((C2492BcJ) abstractC2481Bc8).A02;
        if (!zA1Q && (bjC = this.A01) != null) {
            if (z) {
                bgX.A03(c2507Bcd, bjC, -1);
            } else {
                bgX.A02(c2507Bcd, bjC);
            }
        }
        ListenableFuture<Void> listenableFuture = this.A05;
        if (listenableFuture != null && listenableFuture.cancel(false)) {
            AbstractC2875Bni.A01("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        C3009Brr c3009BrrA02 = AbstractC2947Bpi.A02(bgX, this, 8);
        this.A05 = c3009BrrA02;
        AbstractC2942BpW.A03(new C2607BfU(this, c3009BrrA02, z), c3009BrrA02, BoS.A00());
    }

    public final String toString() {
        return FGI.A0M("VideoCapture:", A0I());
    }

    public Bf9(C2594Bes<T> c2594Bes) {
        super(c2594Bes);
        this.A03 = BfR.A01;
        this.A02 = new BgX();
        this.A05 = null;
        this.A06 = C79.A0C;
        this.A07 = false;
        this.A0D = new BfC(this);
    }

    private int A00(InterfaceC2610Bfb interfaceC2610Bfb) {
        boolean zA0W = A0W(interfaceC2610Bfb);
        int iA09 = A09(interfaceC2610Bfb, zA0W);
        BhO bhO = ((C2611Bfc) this.A03).A01;
        if (bhO == null) {
            return iA09;
        }
        BfX bfX = (BfX) bhO;
        int i = bfX.A00;
        if (zA0W != bfX.A05) {
            i = -i;
        }
        RectF rectF = BfO.A00;
        return (((iA09 - i) % 360) + 360) % 360;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.BgX A01(X.AbstractC2481Bc8 r24, final X.Bf9 r25, final X.C2594Bes r26) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bf9.A01(X.Bc8, X.Bf9, X.Bes):X.BgX");
    }

    private BdC A02() throws ExecutionException, InterruptedException {
        InterfaceC2620Bfm<BdC> interfaceC2620BfmAHd = A0X().AHd();
        BdC bdC = null;
        ListenableFuture<BdC> listenableFutureABL = interfaceC2620BfmAHd.ABL();
        if (listenableFutureABL.isDone()) {
            try {
                bdC = listenableFutureABL.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalStateException(e);
            }
        }
        return bdC;
    }

    public static void A05(Bf9 bf9) {
        BoT.A00();
        C2625Bfs c2625Bfs = bf9.A0A;
        if (c2625Bfs != null) {
            C2625Bfs.A00(c2625Bfs);
            bf9.A0A = null;
        }
        BjC bjC = bf9.A01;
        if (bjC != null) {
            bjC.A02();
            bf9.A01 = null;
        }
        BfJ bfJ = bf9.A0C;
        if (bfJ != null) {
            bfJ.A03.release();
            BoT.A01(new RunnableC2618Bfk(bfJ));
            bf9.A0C = null;
        }
        BfK bfK = bf9.A0B;
        if (bfK != null) {
            bfK.A03();
            bf9.A0B = null;
        }
        bf9.A09 = null;
        bf9.A00 = null;
        bf9.A03 = BfR.A01;
        bf9.A08 = 0;
        bf9.A07 = false;
    }

    public static void A06(Bf9 bf9) {
        InterfaceC2610Bfb interfaceC2610BfbA0B = bf9.A0B();
        BfK bfK = bf9.A0B;
        if (interfaceC2610BfbA0B == null || bfK == null) {
            return;
        }
        int iA00 = bf9.A00(interfaceC2610BfbA0B);
        bf9.A08 = iA00;
        BoT.A01(new RunnableC2629Bfw(bfK, iA00, InterfaceC2586Bei.A00(InterfaceC2551Bdc.A00, ((BfD) bf9).A05, -1)));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Bfb;LX/Bes<*>;Landroid/graphics/Rect;Landroid/util/Size;)Z */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A07(android.graphics.Rect r5, android.util.Size r6, X.InterfaceC2610Bfb r7, X.C2594Bes r8) {
        /*
            r4 = this;
            boolean r3 = r7.AG8()
            if (r3 == 0) goto L1f
            X.BdI<java.lang.Boolean> r2 = X.C2594Bes.A01
            java.lang.Boolean r1 = X.AnonymousClass001.A0h()
            X.Beg r0 = r8.A00
            java.lang.Object r0 = r0.Abl(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
        L1d:
            r1 = 1
        L1e:
            return r1
        L1f:
            if (r3 == 0) goto L63
            X.Bch r0 = X.AbstractC2411BaU.A00
            java.lang.Class<androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk> r2 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.class
            java.util.ArrayList r0 = r0.A02(r2)
            java.util.Iterator r1 = r0.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r1.next()
            androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk r0 = (androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) r0
            boolean r0 = r0.AiX()
            if (r0 == 0) goto L2d
            goto L1d
        L40:
            X.BdV r0 = r7.ADJ()
            X.Bch r0 = r0.ADK()
            java.util.ArrayList r0 = r0.A02(r2)
            java.util.Iterator r1 = r0.iterator()
        L50:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r1.next()
            androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk r0 = (androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk) r0
            boolean r0 = r0.AiX()
            if (r0 == 0) goto L50
            goto L1d
        L63:
            int r1 = r6.getWidth()
            int r0 = r5.width()
            if (r1 != r0) goto L1d
            int r1 = r6.getHeight()
            int r0 = r5.height()
            if (r1 != r0) goto L1d
            if (r3 == 0) goto L80
            boolean r0 = r4.A0W(r7)
            if (r0 == 0) goto L80
            goto L1d
        L80:
            X.BfR r0 = r4.A03
            X.Bfc r0 = (X.C2611Bfc) r0
            X.BhO r0 = r0.A01
            r1 = 0
            if (r0 == 0) goto L1e
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Bf9.A07(android.graphics.Rect, android.util.Size, X.Bfb, X.Bes):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.AbstractCollection, java.util.ArrayList, java.util.Collection] */
    @Override // X.BfD
    public final BfN<?> A0E(InterfaceC2544BdV interfaceC2544BdV, BgN<?, ?, ?> bgN) throws ExecutionException, InterruptedException {
        C2507Bcd c2507Bcd;
        ArrayList arrayListA0t;
        AbstractC2527Bcy abstractC2527BcyABV;
        InterfaceC2436BbP interfaceC2436BbPA03;
        BdC bdCA02 = A02();
        BeS.A06(AnonymousClass002.A1X(bdCA02), "Unable to update target resolution by null MediaSpec.");
        BfN<?> bfN = super.A05;
        AbstractC2531BdI<C2507Bcd> abstractC2531BdI = InterfaceC2490BcH.A00;
        if (bfN.A74(abstractC2531BdI)) {
            Object objAbl = super.A05.Abl(abstractC2531BdI, C2507Bcd.A08);
            objAbl.getClass();
            c2507Bcd = (C2507Bcd) objAbl;
        } else {
            c2507Bcd = AbstractC2596Beu.A01;
        }
        Bd1 bd1AHY = A0X().AHY(interfaceC2544BdV);
        ?? ALP = bd1AHY.ALP(c2507Bcd);
        if (ALP.isEmpty()) {
            AbstractC2875Bni.A03("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            Bd8 bd8 = (Bd8) ((C2558Bdm) bdCA02).A02;
            C2439BbS c2439BbS = bd8.A03;
            if (ALP.isEmpty()) {
                AbstractC2875Bni.A03("QualitySelector", "No supported quality on the device.");
                arrayListA0t = C3cG.A0h();
            } else {
                AbstractC2875Bni.A00(ALP, "supportedQualities = ", "QualitySelector");
                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                Iterator<C2421Bax> it = c2439BbS.A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C2421Bax next = it.next();
                    if (next == C2421Bax.A02) {
                        linkedHashSetA0k.addAll(ALP);
                        break;
                    }
                    if (next == C2421Bax.A03) {
                        ArrayList arrayListA0t2 = BV4.A0t(ALP);
                        Collections.reverse(arrayListA0t2);
                        linkedHashSetA0k.addAll(arrayListA0t2);
                        break;
                    }
                    if (ALP.contains(next)) {
                        linkedHashSetA0k.add(next);
                    } else {
                        AbstractC2875Bni.A03("QualitySelector", AnonymousClass007.A0a("quality is not supported and will be ignored: ", next));
                    }
                }
                if (!ALP.isEmpty() && !linkedHashSetA0k.containsAll(ALP)) {
                    StringBuilder sbA0x = C60O.A0x("Select quality by fallbackStrategy = ");
                    C2441BbU c2441BbU = c2439BbS.A00;
                    AbstractC2875Bni.A01("QualitySelector", C8j3.A14(c2441BbU, sbA0x));
                    C2441BbU c2441BbU2 = C2441BbU.A00;
                    BeS.A07(c2441BbU instanceof AbstractC2443BbW, "Currently only support type RuleStrategy");
                    ArrayList arrayListA0t3 = BV4.A0t(C2421Bax.A07);
                    C2442BbV c2442BbV = (C2442BbV) ((AbstractC2443BbW) c2441BbU);
                    Object obj = c2442BbV.A01;
                    if (obj == C2421Bax.A02) {
                        obj = arrayListA0t3.get(0);
                    } else if (obj == C2421Bax.A03) {
                        obj = arrayListA0t3.get(arrayListA0t3.size() - 1);
                    }
                    int iIndexOf = arrayListA0t3.indexOf(obj);
                    BeS.A07(iIndexOf != -1, null);
                    ArrayList arrayListA0h = C3cG.A0h();
                    for (int i = iIndexOf - 1; i >= 0; i--) {
                        Object obj2 = arrayListA0t3.get(i);
                        if (ALP.contains(obj2)) {
                            arrayListA0h.add(obj2);
                        }
                    }
                    ArrayList arrayListA0h2 = C3cG.A0h();
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayListA0t3.size()) {
                            break;
                        }
                        Object obj3 = arrayListA0t3.get(iIndexOf);
                        if (ALP.contains(obj3)) {
                            arrayListA0h2.add(obj3);
                        }
                    }
                    StringBuilder sbA0f = C3cG.A0f(arrayListA0t3, "sizeSortedQualities = ");
                    sbA0f.append(", fallback quality = ");
                    sbA0f.append(obj);
                    sbA0f.append(", largerQualities = ");
                    sbA0f.append(arrayListA0h);
                    AbstractC2875Bni.A01("QualitySelector", AnonymousClass006.A0y(arrayListA0h2, ", smallerQualities = ", sbA0f));
                    int i2 = c2442BbV.A00;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            linkedHashSetA0k.addAll(arrayListA0h2);
                            linkedHashSetA0k.addAll(arrayListA0h);
                        } else {
                            linkedHashSetA0k.addAll(arrayListA0h);
                            linkedHashSetA0k.addAll(arrayListA0h2);
                        }
                    }
                }
                arrayListA0t = BV4.A0t(linkedHashSetA0k);
            }
            AbstractC2875Bni.A01("VideoCapture", AnonymousClass006.A0y(c2439BbS, " by ", C3cG.A0f(arrayListA0t, "Found selectedQualities ")));
            if (arrayListA0t.isEmpty()) {
                throw C60O.A0i("Unable to find supported quality by QualitySelector");
            }
            int i3 = bd8.A00;
            HashMap mapA0u = BV4.A0u();
            Iterator it2 = bd1AHY.ALP(c2507Bcd).iterator();
            while (it2.hasNext()) {
                C2421Bax c2421Bax = (C2421Bax) it2.next();
                AbstractC2527Bcy abstractC2527BcyAJC = bd1AHY.AJC(c2507Bcd, c2421Bax);
                abstractC2527BcyAJC.getClass();
                C2520Bcr c2520Bcr = (C2520Bcr) ((C2524Bcv) abstractC2527BcyAJC).A01;
                mapA0u.put(c2421Bax, BV6.A0P(c2520Bcr.A08, c2520Bcr.A06));
            }
            Map<Integer, Rational> map = AbstractC2422Bay.A00;
            List<Size> listALQ = interfaceC2544BdV.ALQ(super.A05.AGW());
            HashMap mapA0u2 = BV4.A0u();
            Map<C2421Bax, Range<Integer>> map2 = AbstractC2422Bay.A01;
            Iterator itA11 = BV5.A11(map2);
            while (itA11.hasNext()) {
                C2421Bax c2421Bax2 = (C2421Bax) itA11.next();
                mapA0u2.put(new C2430BbG(c2421Bax2, -1), C3cG.A0h());
                Iterator itA112 = BV5.A11(AbstractC2422Bay.A00);
                while (itA112.hasNext()) {
                    mapA0u2.put(new C2430BbG(c2421Bax2, C60Q.A03(itA112)), C3cG.A0h());
                }
            }
            Iterator itA0i = C3cG.A0i(mapA0u);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                List listA0v = BV6.A0v(new C2430BbG((C2421Bax) entryA0l.getKey(), -1), mapA0u2);
                listA0v.getClass();
                listA0v.add(entryA0l.getValue());
            }
            Iterator<Size> it3 = listALQ.iterator();
            while (it3.hasNext()) {
                Size sizeA0R = BV6.A0R(it3);
                Iterator itA0n = AnonymousClass002.A0n(map2);
                while (true) {
                    if (itA0n.hasNext()) {
                        Map.Entry entryA0l2 = C3cH.A0l(itA0n);
                        if (BV6.A1V((Range) entryA0l2.getValue(), sizeA0R.getHeight())) {
                            C2421Bax c2421Bax3 = (C2421Bax) entryA0l2.getKey();
                            if (c2421Bax3 != null) {
                                Iterator itA0n2 = AnonymousClass002.A0n(AbstractC2422Bay.A00);
                                while (true) {
                                    if (itA0n2.hasNext()) {
                                        Map.Entry entryA0l3 = C3cH.A0l(itA0n2);
                                        if (AbstractC2498BcP.A01((Rational) entryA0l3.getValue(), sizeA0R, AbstractC2484BcB.A04)) {
                                            Number number = (Number) entryA0l3.getKey();
                                            if (number != null) {
                                                List listA0v2 = BV6.A0v(new C2430BbG(c2421Bax3, number.intValue()), mapA0u2);
                                                listA0v2.getClass();
                                                listA0v2.add(sizeA0R);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            Iterator itA0i2 = C3cG.A0i(mapA0u2);
            while (itA0i2.hasNext()) {
                Map.Entry entryA0l4 = C3cH.A0l(itA0i2);
                Size size = (Size) mapA0u.get(((C2430BbG) ((AbstractC2431BbH) entryA0l4.getKey())).A01);
                if (size != null) {
                    Size size2 = AbstractC2484BcB.A00;
                    final int iA0B = BV7.A0B(size);
                    Collections.sort((List) entryA0l4.getValue(), new Comparator() { // from class: X.BbF
                        @Override // java.util.Comparator
                        public final int compare(Object obj4, Object obj5) {
                            int i4 = iA0B;
                            Map<Integer, Rational> map3 = AbstractC2422Bay.A00;
                            Size size3 = AbstractC2484BcB.A00;
                            return Math.abs(BV7.A0B((Size) obj4) - i4) - Math.abs(BV7.A0B((Size) obj5) - i4);
                        }
                    });
                }
            }
            ArrayList arrayListA0h3 = C3cG.A0h();
            Iterator it4 = arrayListA0t.iterator();
            while (it4.hasNext()) {
                Collection collection = (Collection) mapA0u2.get(new C2430BbG((C2421Bax) it4.next(), i3));
                arrayListA0h3.addAll(collection != null ? BV4.A0t(collection) : C60O.A11(0));
            }
            C2594Bes c2594Bes = (C2594Bes) bgN.AMK();
            if (!arrayListA0h3.isEmpty()) {
                Iterator it5 = arrayListA0h3.iterator();
                while (it5.hasNext()) {
                    Size size3 = (Size) it5.next();
                    if (!mapA0u.containsValue(size3) && (abstractC2527BcyABV = bd1AHY.ABV(size3, c2507Bcd)) != null) {
                        AbstractC2531BdI<BpS<BdF, InterfaceC2436BbP>> abstractC2531BdI2 = C2594Bes.A02;
                        C2584Beg c2584Beg = c2594Bes.A00;
                        BpS bpS = (BpS) c2584Beg.Abk(abstractC2531BdI2);
                        bpS.getClass();
                        Range range = (Range) c2584Beg.Abl(BfN.A08, AbstractC2596Beu.A00);
                        range.getClass();
                        if (c2507Bcd.A01()) {
                            interfaceC2436BbPA03 = A03(range, size3, bpS, c2507Bcd, bdCA02, abstractC2527BcyABV);
                        } else {
                            interfaceC2436BbPA03 = null;
                            int i4 = Integer.MIN_VALUE;
                            for (AbstractC2509Bcf abstractC2509Bcf : abstractC2527BcyABV.AMe()) {
                                if (AbstractC2508Bce.A01(c2507Bcd, abstractC2509Bcf)) {
                                    C2520Bcr c2520Bcr2 = (C2520Bcr) abstractC2509Bcf;
                                    int i5 = c2520Bcr2.A05;
                                    Map<Integer, Integer> map3 = AbstractC2508Bce.A04;
                                    Integer numValueOf = Integer.valueOf(i5);
                                    BeS.A05(map3.containsKey(numValueOf));
                                    int iA0C = BV7.A0C(map3.get(numValueOf));
                                    int i6 = c2520Bcr2.A00;
                                    Map<Integer, Integer> map4 = AbstractC2508Bce.A03;
                                    Integer numValueOf2 = Integer.valueOf(i6);
                                    BeS.A05(map4.containsKey(numValueOf2));
                                    InterfaceC2436BbP interfaceC2436BbPA032 = A03(range, size3, bpS, new C2507Bcd(iA0C, BV7.A0C(map4.get(numValueOf2))), bdCA02, abstractC2527BcyABV);
                                    if (interfaceC2436BbPA032 != null) {
                                        int iA09 = BV7.A09(interfaceC2436BbPA032.ALR());
                                        int iA092 = BV7.A09(interfaceC2436BbPA032.ALM());
                                        Size size4 = AbstractC2484BcB.A00;
                                        int i7 = iA09 * iA092;
                                        if (i7 > i4) {
                                            interfaceC2436BbPA03 = interfaceC2436BbPA032;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                        if (interfaceC2436BbPA03 != null && !AbstractC2438BbR.A00(interfaceC2436BbPA03, size3.getWidth(), size3.getHeight())) {
                            it5.remove();
                        }
                    }
                }
            }
            AbstractC2875Bni.A00(arrayListA0h3, "Set custom ordered resolutions = ", "VideoCapture");
            bgN.AHr().ANl(InterfaceC2551Bdc.A01, arrayListA0h3);
        }
        return bgN.AMK();
    }

    public final void A0Y() {
        if (A0B() != null) {
            A05(this);
            C2594Bes c2594Bes = (C2594Bes) super.A05;
            AbstractC2481Bc8 abstractC2481Bc8 = super.A04;
            abstractC2481Bc8.getClass();
            BgX bgXA01 = A01(abstractC2481Bc8, this, c2594Bes);
            this.A02 = bgXA01;
            A0Z(bgXA01, super.A04, this.A03);
            AbstractC2390BYs.A01(this, this.A02);
            A0N();
        }
    }
}
