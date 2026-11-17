package X;

import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import com.facebook.rendercore.RenderUnitUpdateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public class FGS {
    public C7819FGa A00;
    public C7835FGr A01;
    public FGH A02;
    public FGW A03;
    public RenderTreeNode A04;
    public boolean A05;
    public boolean A06;
    public final C1523Akc A09;
    public final AbstractC7837FGt A0A;
    public final FG6 A0B;
    public final FGA A0C;
    public final F0C A0D;
    public final Function0<FH3> A0E;
    public final AXI<FGF> A08 = AXJ.A00();
    public final AXI<C0917AHt<C7825FGg>> A07 = AXJ.A00();

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;LX/FGT<Ljava/lang/Object;>;LX/FGT<Ljava/lang/Object;>;Ljava/lang/Object;Ljava/lang/Object;LX/FGF;LX/AHs<LX/FGg;>;)V */
    public void A0L(AbstractC0916AHs abstractC0916AHs, FGF fgf, FGT fgt, FGT fgt2, Object obj, Object obj2, Object obj3) {
        AnonymousClass005.A0x(obj, fgt, fgt2);
        AnonymousClass003.A0z(fgf, abstractC0916AHs);
        try {
            fgt.A0M(abstractC0916AHs, fgf.A03, this.A0B, this.A00, fgt2, obj, obj2, obj3, fgf.A02);
        } catch (Exception e) {
            String strA0Y = C3cI.A0Y(obj);
            long jA0J = fgt.A0J();
            Class clsAIr = fgt.A0K().AIr();
            long jA0J2 = fgt2.A0J();
            Class clsAIr2 = fgt2.A0K().AIr();
            StringBuilder sbA0x = C3cI.A0x("\n            Unable to update RenderUnit for content: '", strA0Y);
            sbA0x.append("'.\n            RenderUnit: id=");
            sbA0x.append(jA0J);
            sbA0x.append("; poolKey='");
            sbA0x.append(clsAIr);
            sbA0x.append("'.\n            Current RenderUnit: id=");
            sbA0x.append(jA0J2);
            sbA0x.append("; poolKey='");
            sbA0x.append(clsAIr2);
            throw new RenderUnitUpdateException(fgt, C6tn.A05(AnonymousClass001.A0v("'.\n            ", sbA0x)), e);
        }
    }

    public void A0P(FGW fgw) {
        C7384Etj.A0Y(fgw, 0);
        this.A0D.getValue();
        boolean z = FFH.A00;
        int length = fgw.A04.length;
        for (int i = 1; i < length; i++) {
            A0Q(fgw, i);
        }
    }

    public void A0Q(FGW fgw, int i) {
        C7384Etj.A0Y(fgw, 0);
        RenderTreeNode renderTreeNode = fgw.A04[i];
        C7384Etj.A0Y(renderTreeNode, 0);
        FGF fgfA05 = this.A08.A05(AbstractC7607F5u.A0M(renderTreeNode));
        this.A04 = renderTreeNode;
        if (fgfA05 != null) {
            A0A(fgfA05, renderTreeNode);
        } else {
            A0R(renderTreeNode);
        }
        this.A04 = null;
    }

    public void A0R(RenderTreeNode renderTreeNode) {
        AbstractC7837FGt abstractC7837FGt;
        FGF fgfA04;
        C7384Etj.A0Y(renderTreeNode, 0);
        FGT<?> fgt = renderTreeNode.A07;
        long jA0J = fgt.A0J();
        if (jA0J == 0) {
            AbstractC7837FGt abstractC7837FGt2 = this.A0A;
            FGF fgfA0F = A0F(renderTreeNode, abstractC7837FGt2);
            A08(fgfA0F.A03, renderTreeNode, fgt, abstractC7837FGt2);
            this.A08.A0B(fgfA0F, 0L);
            A0O(fgfA0F);
            return;
        }
        Set set = Hiv.A00;
        if (set.isEmpty()) {
            RenderTreeNode renderTreeNode2 = renderTreeNode.A06;
            if (renderTreeNode2 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            FGT<?> fgt2 = renderTreeNode2.A07;
            long jA0J2 = fgt2.A0J();
            AXI<FGF> axi = this.A08;
            if (axi.A05(jA0J2) == null) {
                RenderTreeNode renderTreeNode3 = this.A04;
                this.A04 = renderTreeNode2;
                A0R(renderTreeNode2);
                this.A04 = renderTreeNode3;
            }
            FGF fgfA05 = axi.A05(jA0J2);
            if (fgfA05 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            Object obj = fgfA05.A05;
            A0C(fgt, fgt2, obj);
            abstractC7837FGt = (AbstractC7837FGt) obj;
            fgfA04 = A04(this, renderTreeNode, fgt);
            axi.A0B(fgfA04, jA0J);
        } else {
            Iterator it = set.iterator();
            if (it.hasNext()) {
                throw AbstractC7609F5w.A0m(it);
            }
            C0881AGi c0881AGi = C0881AGi.A00;
            if (!c0881AGi.isEmpty()) {
                Iterator it2 = c0881AGi.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                linkedHashMapA0j.put("renderUnitId", Long.valueOf(jA0J));
                linkedHashMapA0j.put("name", fgt.A0L());
                linkedHashMapA0j.put("bounds", renderTreeNode.A03);
                linkedHashMapA0j.put("rootHostHashCode", Integer.valueOf(this.A0A.hashCode()));
                linkedHashMapA0j.put("key", String.valueOf(jA0J));
                linkedHashMapA0j.put("isGapWorkerPremount", false);
                if (this.A03 == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jNanoTime = System.nanoTime();
                ArrayList arrayListA0i = AnonymousClass003.A0i(c0881AGi);
                if (it2.hasNext()) {
                    it2.next();
                    throw BV4.A0a("onTraceStart");
                }
                RenderTreeNode renderTreeNode4 = renderTreeNode.A06;
                if (renderTreeNode4 == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                FGT<?> fgt3 = renderTreeNode4.A07;
                long jA0J3 = fgt3.A0J();
                AXI<FGF> axi2 = this.A08;
                if (axi2.A05(jA0J3) == null) {
                    RenderTreeNode renderTreeNode5 = this.A04;
                    this.A04 = renderTreeNode4;
                    A0R(renderTreeNode4);
                    this.A04 = renderTreeNode5;
                }
                FGF fgfA052 = axi2.A05(jA0J3);
                if (fgfA052 == null) {
                    throw C3cG.A0Q("Required value was null.");
                }
                Object obj2 = fgfA052.A05;
                A0C(fgt, fgt3, obj2);
                FGF fgfA042 = A04(this, renderTreeNode, fgt);
                axi2.A0B(fgfA042, jA0J);
                ((AbstractC7837FGt) obj2).A0B(fgfA042, renderTreeNode.A02);
                A0O(fgfA042);
                A0B(fgfA042, true);
                if (fgfA042.A01()) {
                    C1523Akc c1523Akc = this.A09;
                    c1523Akc.A02[C1523Akc.A01(c1523Akc, jA0J)] = jA0J;
                }
                C7819FGa c7819FGa = this.A00;
                if (c7819FGa != null) {
                    List list = c7819FGa.A01;
                    if (0 < list.size()) {
                        throw AbstractC7609F5w.A0n(list);
                    }
                }
                this.A0D.getValue();
                long jNanoTime2 = System.nanoTime() - jNanoTime;
                C7384Etj.A0U(Thread.currentThread().getName());
                C0924AIa c0924AIa = new C0924AIa();
                c0924AIa.put("timestamp", Long.valueOf(jCurrentTimeMillis));
                c0924AIa.put("duration", new Hq0(jNanoTime2));
                c0924AIa.putAll(linkedHashMapA0j);
                AIW.A0K(c0924AIa);
                if (it2.hasNext()) {
                    it2.next();
                    arrayListA0i.get(0);
                    throw BV4.A0a("onTraceEnd");
                }
                if (it2.hasNext()) {
                    throw A05(it2);
                }
                return;
            }
            RenderTreeNode renderTreeNode6 = renderTreeNode.A06;
            if (renderTreeNode6 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            FGT<?> fgt4 = renderTreeNode6.A07;
            long jA0J4 = fgt4.A0J();
            AXI<FGF> axi3 = this.A08;
            if (axi3.A05(jA0J4) == null) {
                RenderTreeNode renderTreeNode7 = this.A04;
                this.A04 = renderTreeNode6;
                A0R(renderTreeNode6);
                this.A04 = renderTreeNode7;
            }
            FGF fgfA053 = axi3.A05(jA0J4);
            if (fgfA053 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            Object obj3 = fgfA053.A05;
            A0C(fgt, fgt4, obj3);
            abstractC7837FGt = (AbstractC7837FGt) obj3;
            fgfA04 = A04(this, renderTreeNode, fgt);
            axi3.A0B(fgfA04, jA0J);
        }
        abstractC7837FGt.A0B(fgfA04, renderTreeNode.A02);
        A0O(fgfA04);
        A0B(fgfA04, true);
        if (fgfA04.A01()) {
            C1523Akc c1523Akc2 = this.A09;
            c1523Akc2.A02[C1523Akc.A01(c1523Akc2, jA0J)] = jA0J;
        }
        C7819FGa c7819FGa2 = this.A00;
        if (c7819FGa2 != null) {
            List list2 = c7819FGa2.A01;
            if (0 < list2.size()) {
                throw AbstractC7609F5w.A0n(list2);
            }
        }
        this.A0D.getValue();
    }

    public boolean A0T(FGT<?> fgt, FGT<?> fgt2, Object obj, Object obj2) {
        boolean zA01;
        boolean zA1a = AnonymousClass002.A1a(fgt, fgt2);
        if (fgt == fgt2) {
            if (obj != obj2) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof InterfaceC10547Hrt) && (obj2 instanceof InterfaceC10547Hrt)) {
                        InterfaceC10547Hrt interfaceC10547Hrt = (InterfaceC10547Hrt) obj;
                        if (interfaceC10547Hrt != obj2) {
                            if (interfaceC10547Hrt != null) {
                                zA01 = interfaceC10547Hrt.AON(obj2);
                            }
                        }
                    } else {
                        zA01 = HqY.A01(obj, obj2);
                    }
                    if (!zA01) {
                    }
                }
            }
            return false;
        }
        return zA1a;
    }

    private final void A06() {
        C7835FGr c7835FGr = this.A01;
        if (c7835FGr != null) {
            c7835FGr.A00.A0C(c7835FGr.A01);
        }
        this.A01 = null;
        this.A02 = null;
    }

    private final void A07() {
        C7819FGa c7819FGa = this.A00;
        if (c7819FGa != null) {
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                list.get(0);
                throw BV4.A0a("onUnbind");
            }
            List list2 = c7819FGa.A01;
            if (0 < list2.size()) {
                list2.get(0);
                throw BV4.A0a("onUnmount");
            }
            list2.clear();
        }
    }

    private final void A09(FGF fgf) {
        RenderTreeNode renderTreeNode = fgf.A01;
        FGT<?> fgt = renderTreeNode.A07;
        Object obj = fgf.A05;
        Object obj2 = renderTreeNode.A08;
        C7819FGa c7819FGa = this.A00;
        if (c7819FGa != null) {
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                throw AbstractC7609F5w.A0n(list);
            }
        }
        fgt.A0P(fgf.A03, this.A0B, obj, obj2);
        fgf.A02 = false;
    }

    private final void A0A(FGF fgf, RenderTreeNode renderTreeNode) {
        C7819FGa c7819FGa = this.A00;
        FGT<?> fgt = renderTreeNode.A07;
        Object obj = renderTreeNode.A08;
        RenderTreeNode renderTreeNode2 = fgf.A01;
        FGT<?> fgt2 = renderTreeNode2.A07;
        Object obj2 = renderTreeNode2.A08;
        Object obj3 = fgf.A05;
        AXI<C0917AHt<C7825FGg>> axi = this.A07;
        long jA0J = fgt.A0J();
        C0917AHt<C7825FGg> c0917AHtA05 = axi.A05(jA0J);
        if (c0917AHtA05 == null) {
            c0917AHtA05 = HsU.A00;
        }
        boolean zA1L = AnonymousClass002.A1L(c0917AHtA05.A01);
        C1523Akc c1523Akc = this.A09;
        boolean zA03 = c1523Akc.A03(fgt2.A0J());
        fgf.A01 = renderTreeNode;
        if (zA1L || A0T(fgt2, fgt, obj2, obj)) {
            Hiv.A00();
            A0L(c0917AHtA05, fgf, fgt, fgt2, obj3, obj2, obj);
        } else if (fgf.A02) {
            fgf.A01.A07.A0S(this.A0B.A01);
        } else {
            A0O(fgf);
        }
        this.A0D.getValue();
        fgf.A04.A00();
        fgf.A02 = true;
        A0N(c7819FGa, fgf, renderTreeNode);
        if (zA03 && !fgf.A01()) {
            c1523Akc.A05(jA0J);
        } else if (fgf.A01()) {
            c1523Akc.A02[C1523Akc.A01(c1523Akc, jA0J)] = jA0J;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r14 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0B(X.FGF r13, boolean r14) {
        /*
            r12 = this;
            com.facebook.rendercore.RenderTreeNode r0 = r13.A01
            android.graphics.Rect r1 = r0.A03
            android.graphics.Rect r10 = r0.A04
            X.FGH r0 = r13.A04
            X.FGH r12 = X.AbstractC7842FGz.A00
            X.AbstractC7842FGz.A00 = r0     // Catch: java.lang.Throwable -> Lbb
            int r4 = r1.left     // Catch: java.lang.Throwable -> Lbb
            int r3 = r1.top     // Catch: java.lang.Throwable -> Lbb
            int r2 = r1.right     // Catch: java.lang.Throwable -> Lbb
            int r1 = r1.bottom     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r5 = r13.A05     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = "Unsupported mounted content "
            boolean r0 = r5 instanceof android.view.View     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L93
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Throwable -> Lb9
            int r11 = r2 - r4
            int r9 = r1 - r3
            if (r10 == 0) goto L53
            boolean r0 = r5 instanceof X.AbstractC7837FGt     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L53
            int r6 = r5.getPaddingLeft()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r10.left     // Catch: java.lang.Throwable -> Lb9
            if (r6 != r0) goto L48
            int r6 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r10.top     // Catch: java.lang.Throwable -> Lb9
            if (r6 != r0) goto L48
            int r6 = r5.getPaddingRight()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r10.right     // Catch: java.lang.Throwable -> Lb9
            if (r6 != r0) goto L48
            int r6 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lb9
            int r0 = r10.bottom     // Catch: java.lang.Throwable -> Lb9
            if (r6 == r0) goto L53
        L48:
            int r8 = r10.left     // Catch: java.lang.Throwable -> Lb9
            int r7 = r10.top     // Catch: java.lang.Throwable -> Lb9
            int r6 = r10.right     // Catch: java.lang.Throwable -> Lb9
            int r0 = r10.bottom     // Catch: java.lang.Throwable -> Lb9
            r5.setPadding(r8, r7, r6, r0)     // Catch: java.lang.Throwable -> Lb9
        L53:
            if (r14 != 0) goto L61
            int r0 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r9) goto L61
            int r0 = r5.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r11) goto L6c
        L61:
            r6 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r6)     // Catch: java.lang.Throwable -> Lb9
            X.AbstractC7608F5v.A1E(r5, r9, r6, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r14 != 0) goto L84
        L6c:
            int r0 = r5.getLeft()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r4) goto L84
            int r0 = r5.getTop()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r3) goto L84
            int r0 = r5.getRight()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != r2) goto L84
            int r0 = r5.getBottom()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == r1) goto Lb1
        L84:
            r5.layout(r4, r3, r2, r1)     // Catch: java.lang.NullPointerException -> L88 java.lang.Throwable -> Lb9
            goto Lb1
        L88:
            java.lang.String r0 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> Lb9
            X.C7384Etj.A0V(r0)     // Catch: java.lang.Throwable -> Lb9
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lb9
            X.C7384Etj.A0V(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lb1
        L93:
            boolean r0 = r5 instanceof android.graphics.drawable.Drawable     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb4
            if (r10 == 0) goto La5
            int r0 = r10.left     // Catch: java.lang.Throwable -> Lb9
            int r4 = r4 + r0
            int r0 = r10.top     // Catch: java.lang.Throwable -> Lb9
            int r3 = r3 + r0
            int r0 = r10.right     // Catch: java.lang.Throwable -> Lb9
            int r2 = r2 - r0
            int r0 = r10.bottom     // Catch: java.lang.Throwable -> Lb9
            int r1 = r1 - r0
        La5:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch: java.lang.Throwable -> Lb9
            android.graphics.Rect r0 = r5.getBounds()     // Catch: java.lang.Throwable -> Lb9
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Throwable -> Lb9
            r5.setBounds(r4, r3, r2, r1)     // Catch: java.lang.Throwable -> Lb9
        Lb1:
            X.AbstractC7842FGz.A00 = r12
            return
        Lb4:
            java.lang.IllegalStateException r0 = X.AbstractC7607F5u.A10(r5, r6)     // Catch: java.lang.Throwable -> Lb9
            throw r0     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            X.AbstractC7842FGz.A00 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGS.A0B(X.FGF, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(Object obj, FGT<?> fgt, FGT<?> fgt2) {
        if (fgt2 instanceof AbstractC7837FGt) {
            return;
        }
        String strA0Y = C3cI.A0Y(fgt2);
        long jA0J = fgt.A0J();
        Class clsAIr = fgt.A0K().AIr();
        long jA0J2 = obj.A0J();
        Class clsAIr2 = obj.A0K().AIr();
        StringBuilder sbA0x = C3cI.A0x("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '", strA0Y);
        sbA0x.append("'.\n            Parent RenderUnit: id=");
        sbA0x.append(jA0J);
        sbA0x.append("; poolKey='");
        sbA0x.append(clsAIr);
        sbA0x.append("'.\n            Child RenderUnit: id=");
        sbA0x.append(jA0J2);
        sbA0x.append("; poolKey='");
        sbA0x.append(clsAIr2);
        throw BV4.A0c(C6tn.A05(AnonymousClass001.A0v("'.\n            ", sbA0x)));
    }

    private final void A0E(boolean z) {
        FH3 fh3Invoke = this.A0E.invoke();
        if (!C7384Etj.areEqual(fh3Invoke, FGP.A00)) {
            if (!C7384Etj.areEqual(fh3Invoke, FGN.A00)) {
                if (!C7384Etj.areEqual(fh3Invoke, FGO.A00)) {
                    throw C3cG.A0q();
                }
                if (!z || this.A09.A01 != 0) {
                    if (this.A09.A01 == 0) {
                        return;
                    }
                }
            }
            A06();
            return;
        }
        FGH fgh = AbstractC7842FGz.A00;
        if (fgh == null || C7384Etj.areEqual(this.A02, fgh)) {
            return;
        }
        C7835FGr c7835FGr = this.A01;
        if (c7835FGr != null) {
            c7835FGr.A00.A0C(c7835FGr.A01);
        }
        C0917AHt<FGS> c0917AHt = fgh.A00;
        if (c0917AHt == null) {
            c0917AHt = new C0917AHt<>(2);
            fgh.A00 = c0917AHt;
        }
        if (!c0917AHt.A05(this)) {
            c0917AHt.A0B(this);
        }
        this.A01 = new C7835FGr(c0917AHt, this);
        this.A02 = fgh;
    }

    private final FGF A0F(RenderTreeNode renderTreeNode, Object obj) {
        if (!(this instanceof FGD)) {
            AnonymousClass003.A0u(renderTreeNode, obj);
            return new FGF(renderTreeNode, obj);
        }
        AnonymousClass003.A0u(renderTreeNode, obj);
        FGK fgk = new FGK(renderTreeNode, obj);
        fgk.A00 = -1;
        return fgk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0405, code lost:
    
        if (r7 > (-1)) goto L182;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ff A[Catch: Exception -> 0x0311, TryCatch #3 {Exception -> 0x0311, blocks: (B:115:0x02f7, B:117:0x02ff, B:118:0x030a, B:119:0x0310), top: B:245:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x030a A[Catch: Exception -> 0x0311, TryCatch #3 {Exception -> 0x0311, blocks: (B:115:0x02f7, B:117:0x02ff, B:118:0x030a, B:119:0x0310), top: B:245:0x02f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d7 A[Catch: all -> 0x04f3, TryCatch #1 {, blocks: (B:221:0x04b8, B:223:0x04bc, B:225:0x04c5, B:227:0x04cb, B:228:0x04cf, B:229:0x04d6, B:230:0x04d7, B:232:0x04df, B:233:0x04e7), top: B:242:0x04b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A0K(long r34) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGS.A0K(long):void");
    }

    public void A0G() {
        try {
            FHQ fhq = (FHQ) this.A0A;
            fhq.A01 = true;
            C7819FGa c7819FGa = this.A00;
            if (c7819FGa != null) {
                List list = c7819FGa.A01;
                if (0 < list.size()) {
                    list.get(0);
                    throw BV4.A0a("onBeforeUnmount");
                }
            }
            if (this.A03 == null) {
                A07();
            } else {
                A0K(0L);
                A07();
                A06();
                this.A05 = true;
                this.A03 = null;
            }
            fhq.A01 = false;
        } catch (Throwable th) {
            ((FHQ) this.A0A).A01 = false;
            throw th;
        }
    }

    public void A0H() {
        C1523Akc c1523Akc = this.A09;
        long[] jArr = c1523Akc.A02;
        long[] jArr2 = c1523Akc.A03;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128) {
                        FGF fgfA05 = this.A08.A05(jArr[(i << 3) + i2]);
                        if (fgfA05 != null) {
                            FG1 fg1 = this.A0B.A01;
                            if (fgfA05.A02(fg1)) {
                                RenderTreeNode renderTreeNode = fgfA05.A01;
                                this.A04 = renderTreeNode;
                                if (fgfA05.A01()) {
                                    renderTreeNode.A07.A0L();
                                    fgfA05.A01.A07.A0S(fg1);
                                    fgfA05.A04.A00();
                                }
                                Object obj = fgfA05.A05;
                                if (obj instanceof View) {
                                    if (obj instanceof FFE) {
                                        ((View) obj).forceLayout();
                                    }
                                    if (((View) obj).isLayoutRequested()) {
                                        A0B(fgfA05, true);
                                    }
                                }
                                this.A04 = null;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void A0I() {
        FGW fgw = this.A03;
        if (fgw != null) {
            int length = fgw.A04.length;
            for (int i = 0; i < length; i++) {
                FGF fgfA05 = this.A08.A05(fgw.A04[i].A07.A0J());
                if (fgfA05 != null && !fgfA05.A02) {
                    Object obj = fgfA05.A05;
                    A0O(fgfA05);
                    if ((obj instanceof View) && !(obj instanceof AbstractC7837FGt) && ((View) obj).isLayoutRequested()) {
                        A0B(fgfA05, true);
                    }
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FGW;LX/AHs<LX/FGg;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fe A[Catch: Exception -> 0x027d, all -> 0x028e, TryCatch #0 {Exception -> 0x027d, blocks: (B:17:0x006e, B:19:0x0072, B:21:0x007c, B:23:0x0080, B:25:0x0084, B:27:0x0088, B:28:0x008b, B:30:0x0094, B:33:0x00b2, B:39:0x00db, B:41:0x00eb, B:42:0x00f9, B:43:0x00ff, B:45:0x0105, B:46:0x0112, B:50:0x011d, B:51:0x0120, B:53:0x012c, B:56:0x0132, B:59:0x013c, B:61:0x014a, B:62:0x014e, B:66:0x015c, B:68:0x0162, B:70:0x0166, B:72:0x0172, B:73:0x0174, B:79:0x017f, B:81:0x0187, B:83:0x018d, B:85:0x019a, B:86:0x01a7, B:89:0x01ad, B:91:0x01b1, B:92:0x01b9, B:94:0x01bd, B:96:0x01c1, B:97:0x01c6, B:98:0x01c8, B:100:0x01cc, B:106:0x01d9, B:109:0x01e5, B:111:0x01e9, B:113:0x01ed, B:115:0x01f1, B:117:0x01f6, B:119:0x01fe, B:116:0x01f4, B:108:0x01e1, B:122:0x0211, B:139:0x027c, B:138:0x0278, B:123:0x0218, B:120:0x0204, B:121:0x020d, B:124:0x021d, B:126:0x022b, B:128:0x0231, B:134:0x025f, B:136:0x026c, B:129:0x0244, B:131:0x024d, B:133:0x0255, B:135:0x0263, B:29:0x0092, B:137:0x0271), top: B:190:0x006e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0204 A[Catch: Exception -> 0x027d, all -> 0x028e, TryCatch #0 {Exception -> 0x027d, blocks: (B:17:0x006e, B:19:0x0072, B:21:0x007c, B:23:0x0080, B:25:0x0084, B:27:0x0088, B:28:0x008b, B:30:0x0094, B:33:0x00b2, B:39:0x00db, B:41:0x00eb, B:42:0x00f9, B:43:0x00ff, B:45:0x0105, B:46:0x0112, B:50:0x011d, B:51:0x0120, B:53:0x012c, B:56:0x0132, B:59:0x013c, B:61:0x014a, B:62:0x014e, B:66:0x015c, B:68:0x0162, B:70:0x0166, B:72:0x0172, B:73:0x0174, B:79:0x017f, B:81:0x0187, B:83:0x018d, B:85:0x019a, B:86:0x01a7, B:89:0x01ad, B:91:0x01b1, B:92:0x01b9, B:94:0x01bd, B:96:0x01c1, B:97:0x01c6, B:98:0x01c8, B:100:0x01cc, B:106:0x01d9, B:109:0x01e5, B:111:0x01e9, B:113:0x01ed, B:115:0x01f1, B:117:0x01f6, B:119:0x01fe, B:116:0x01f4, B:108:0x01e1, B:122:0x0211, B:139:0x027c, B:138:0x0278, B:123:0x0218, B:120:0x0204, B:121:0x020d, B:124:0x021d, B:126:0x022b, B:128:0x0231, B:134:0x025f, B:136:0x026c, B:129:0x0244, B:131:0x024d, B:133:0x0255, B:135:0x0263, B:29:0x0092, B:137:0x0271), top: B:190:0x006e, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0M(X.AbstractC0916AHs r28, X.FGW r29) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGS.A0M(X.AHs, X.FGW):void");
    }

    public final void A0O(FGF fgf) {
        RenderTreeNode renderTreeNode = fgf.A01;
        FGT<?> fgt = renderTreeNode.A07;
        Object obj = fgf.A05;
        Object obj2 = renderTreeNode.A08;
        fgt.A0O(fgf.A03, this.A0B, obj, obj2);
        C7819FGa c7819FGa = this.A00;
        if (c7819FGa != null) {
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                throw AbstractC7609F5w.A0n(list);
            }
        }
        fgf.A02 = true;
    }

    public boolean A0S() {
        C1523Akc c1523Akc = this.A09;
        if (c1523Akc.A01 == 0) {
            return false;
        }
        long[] jArr = c1523Akc.A02;
        long[] jArr2 = c1523Akc.A03;
        int length = jArr2.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr2[i];
            if ((((j ^ (-1)) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((j & 255) < 128) {
                        FGF fgfA05 = this.A08.A05(jArr[(i << 3) + i2]);
                        if (fgfA05 != null && fgfA05.A02(this.A0B.A01)) {
                            return true;
                        }
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }

    public FGS(FG2 fg2, AbstractC7837FGt abstractC7837FGt, FGA fga, FGB fgb, Function0 function0) {
        this.A0A = abstractC7837FGt;
        this.A0C = fga;
        this.A0E = function0;
        long[] jArr = AbstractC1521Aka.A00;
        C1523Akc c1523Akc = new C1523Akc();
        C0918AHu c0918AHu = AbstractC0977AKq.A00;
        C1523Akc.A02(c1523Akc, 6);
        this.A09 = c1523Akc;
        this.A0B = new FG6(AbstractC7608F5v.A0E(abstractC7837FGt), fg2, fga, fgb);
        this.A0D = C5322DgG.A01((Function0) C8472Feb.A00(34));
    }

    public static int A03(Enum r1, AtomicReference atomicReference) {
        Object obj = atomicReference.get();
        C7384Etj.A0U(obj);
        return r1.compareTo((Enum) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.FGF A04(X.FGS r5, com.facebook.rendercore.RenderTreeNode r6, X.FGT r7) {
        /*
            X.FGl r4 = r7.A0K()
            X.FG6 r0 = r5.A0B
            android.content.Context r3 = r0.A00
            X.Hra r1 = r6.A05
            X.FEZ r0 = r4.AIs()
            boolean r0 = r0.A00
            if (r0 == 0) goto L42
            int r0 = r4.AY3()
            X.ByY r1 = X.AbstractC3107ByW.A00(r3, r4, r1, r0)
            if (r1 == 0) goto L42
            X.ByZ<java.lang.Object> r0 = r1.A00     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r0.A2t()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L42
            java.util.concurrent.atomic.AtomicInteger r0 = r1.A02     // Catch: java.lang.Throwable -> L2a
            r0.decrementAndGet()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r0 = move-exception
            throw r0
        L2c:
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L46
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L46
            java.lang.Class r0 = r4.AIr()
            if (r0 == 0) goto L50
            X.AbstractC3107ByW.A03(r1)
        L42:
            java.lang.Object r2 = r4.A7d(r3)
        L46:
            X.FGF r1 = r5.A0F(r6, r2)
            X.FGm r0 = r1.A03
            r5.A08(r0, r6, r7, r2)
            return r1
        L50:
            java.lang.String r1 = "toString"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGS.A04(X.FGS, com.facebook.rendercore.RenderTreeNode, X.FGT):X.FGF");
    }

    public static NullPointerException A05(Iterator it) {
        it.next();
        return new NullPointerException("onEvent");
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/rendercore/RenderTreeNode;LX/FGT<Ljava/lang/Object;>;Ljava/lang/Object;LX/FGm;)V */
    private final void A08(C7831FGm c7831FGm, RenderTreeNode renderTreeNode, FGT fgt, Object obj) {
        Hiv.A00();
        fgt.A0Q(c7831FGm, this.A0B, obj, renderTreeNode.A08);
        C7819FGa c7819FGa = this.A00;
        if (c7819FGa != null) {
            List list = c7819FGa.A01;
            if (0 < list.size()) {
                throw AbstractC7609F5w.A0n(list);
            }
        }
    }

    public static void A0D(Map map, long j) {
        C7384Etj.A0U(Thread.currentThread().getName());
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put("timestamp", Long.valueOf(j));
        c0924AIa.putAll(map);
        AIW.A0K(c0924AIa);
    }

    public final void A0J() {
        A06();
        FGW fgw = this.A03;
        if (fgw != null) {
            int length = fgw.A04.length;
            for (int i = 0; i < length; i++) {
                FGF fgfA05 = this.A08.A05(fgw.A04[i].A07.A0J());
                if (fgfA05 != null && fgfA05.A02) {
                    A09(fgfA05);
                }
            }
            C7819FGa c7819FGa = this.A00;
            if (c7819FGa != null) {
                List list = c7819FGa.A01;
                if (0 < list.size()) {
                    list.get(0);
                    throw BV4.A0a("onUnbind");
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0N(X.C7819FGa r6, X.FGF r7, com.facebook.rendercore.RenderTreeNode r8) {
        /*
            r5 = this;
            long r3 = X.AbstractC7607F5u.A0M(r8)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            java.lang.Object r1 = r7.A05
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L19
            android.view.View r1 = (android.view.View) r1
            boolean r1 = r1.isLayoutRequested()
            r0 = 1
            if (r1 != 0) goto L1a
        L19:
            r0 = 0
        L1a:
            r5.A0B(r7, r0)
            if (r6 == 0) goto L2d
            java.util.List r2 = r6.A01
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L2d
            java.lang.NullPointerException r0 = X.AbstractC7609F5w.A0n(r2)
            throw r0
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FGS.A0N(X.FGa, X.FGF, com.facebook.rendercore.RenderTreeNode):void");
    }
}
