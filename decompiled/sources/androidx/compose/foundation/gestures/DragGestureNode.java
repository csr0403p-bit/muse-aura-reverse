package androidx.compose.foundation.gestures;

import X.ARZ;
import X.ATR;
import X.AWx;
import X.AX4;
import X.AX5;
import X.AX8;
import X.AbstractC0878AGe;
import X.AbstractC1078AXh;
import X.AbstractC1250Afh;
import X.AbstractC1297Agi;
import X.AbstractC1317Ah3;
import X.AbstractC1318Ah4;
import X.AbstractC1414Aij;
import X.AbstractC1437Aj6;
import X.Ah2;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BH6;
import X.BU6;
import X.BU7;
import X.BUC;
import X.BUF;
import X.C0881AGi;
import X.C1249Afg;
import X.C1251Afj;
import X.C1257Aft;
import X.C1262Ag1;
import X.C1267AgC;
import X.C1268AgD;
import X.C1274AgK;
import X.C1295Agf;
import X.C1296Agh;
import X.C1298Agj;
import X.C1299Agk;
import X.C1300Agl;
import X.C1301Agm;
import X.C1303Ago;
import X.C1305Agq;
import X.C1306Agr;
import X.C1307Ags;
import X.C1308Agt;
import X.C1309Agu;
import X.C1310Agv;
import X.C1311Agw;
import X.C1312Agx;
import X.C1315Ah0;
import X.C1316Ah1;
import X.C1Z2;
import X.C1Z3;
import X.C1rU;
import X.C2295BSv;
import X.C2Uv;
import X.C3US;
import X.C3UT;
import X.C3UX;
import X.C3UY;
import X.C3cG;
import X.C60D;
import X.C60O;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.C8j4;
import X.EnumC10460Hji;
import X.EnumC1080AXj;
import X.EnumC1108AYu;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GCV;
import X.HtJ;
import X.Hxb;
import X.HzR;
import X.InterfaceC1072AWd;
import X.InterfaceC1260Afz;
import X.InterfaceC1348AhZ;
import X.InterfaceC1447AjG;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class DragGestureNode extends AbstractC1437Aj6 implements InterfaceC1348AhZ, InterfaceC1447AjG, AX5, C1Z2 {
    public C1305Agq A00;
    public C1306Agr A01;
    public C1310Agv A02;
    public C1316Ah1 A03;
    public AbstractC1317Ah3 A04;
    public EnumC1108AYu A05;
    public C1300Agl A06;
    public C3UT A07;
    public C1Z3 A08;
    public G0U<? super C1312Agx, Boolean> A09;
    public HzR<AbstractC1250Afh> A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C1296Agh A0G;
    public C1rU A0H;
    public InterfaceC1072AWd A0I;
    public final G0U<C1312Agx, Boolean> A0J = C2295BSv.A00(this, 12);
    public long A0F = 9205357640488583168L;
    public long A0E = 0;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A03(X.C1315Ah0 r7, androidx.compose.foundation.gestures.DragGestureNode r8, X.HtJ r9) {
        /*
            r6 = 1
            boolean r0 = r9 instanceof X.C2314BTo
            if (r0 == 0) goto L71
            r5 = r9
            X.BTo r5 = (X.C2314BTo) r5
            int r0 = r5.$t
            if (r0 != r6) goto L71
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r2 = r5.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 2
            if (r0 == 0) goto L39
            if (r0 == r6) goto L54
            if (r0 != r3) goto L77
            java.lang.Object r1 = r5.A02
            X.1rU r1 = (X.C1rU) r1
            java.lang.Object r7 = r5.A01
            X.Ah0 r7 = (X.C1315Ah0) r7
            X.Hwg.A00(r2)
        L2f:
            r8.A0H = r1
            long r0 = r7.A00
            r8.A0J(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L39:
            X.Hwg.A00(r2)
            X.1rU r2 = r8.A0H
            if (r2 == 0) goto L5b
            X.AWd r1 = r8.A0I
            if (r1 == 0) goto L5b
            X.ATR r0 = new X.ATR
            r0.<init>(r2)
            r5.A01 = r7
            r5.A00 = r6
            java.lang.Object r0 = r1.A9u(r0, r5)
            if (r0 != r4) goto L5b
            return r4
        L54:
            java.lang.Object r7 = r5.A01
            X.Ah0 r7 = (X.C1315Ah0) r7
            X.Hwg.A00(r2)
        L5b:
            X.1rU r1 = new X.1rU
            r1.<init>()
            X.AWd r0 = r8.A0I
            if (r0 == 0) goto L2f
            r5.A01 = r7
            r5.A02 = r1
            r5.A00 = r3
            java.lang.Object r0 = r0.A9u(r1, r5)
            if (r0 != r4) goto L2f
            return r4
        L71:
            X.BTo r5 = new X.BTo
            r5.<init>(r8, r9, r6)
            goto L17
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A03(X.Ah0, androidx.compose.foundation.gestures.DragGestureNode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.C1249Afg r6, androidx.compose.foundation.gestures.DragGestureNode r7, X.HtJ r8) {
        /*
            r3 = 6
            boolean r0 = r8 instanceof X.C2312BTm
            if (r0 == 0) goto L4d
            r5 = r8
            X.BTm r5 = (X.C2312BTm) r5
            int r0 = r5.$t
            if (r0 != r3) goto L4d
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r5.A00 = r2
        L17:
            java.lang.Object r1 = r5.A02
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L53
            java.lang.Object r6 = r5.A01
            X.Afg r6 = (X.C1249Afg) r6
            X.Hwg.A00(r1)
        L29:
            r0 = 0
            r7.A0H = r0
        L2c:
            r7.A0K(r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L32:
            X.Hwg.A00(r1)
            X.1rU r2 = r7.A0H
            if (r2 == 0) goto L2c
            X.AWd r1 = r7.A0I
            if (r1 == 0) goto L29
            X.ATS r0 = new X.ATS
            r0.<init>(r2)
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r0 = r1.A9u(r0, r5)
            if (r0 != r4) goto L29
            return r4
        L4d:
            X.BTm r5 = new X.BTm
            r5.<init>(r7, r8, r3)
            goto L17
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A04(X.Afg, androidx.compose.foundation.gestures.DragGestureNode, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(androidx.compose.foundation.gestures.DragGestureNode r7, X.HtJ r8) {
        /*
            r3 = 3
            boolean r0 = r8 instanceof X.C2310BTk
            if (r0 == 0) goto L4f
            r6 = r8
            X.BTk r6 = (X.C2310BTk) r6
            int r0 = r6.$t
            if (r0 != r3) goto L4f
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.A00 = r2
        L17:
            java.lang.Object r1 = r6.A01
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L55
            X.Hwg.A00(r1)
        L26:
            r7.A0H = r4
        L28:
            r2 = 0
            r1 = 0
            X.Afg r0 = new X.Afg
            r0.<init>(r2, r1)
            r7.A0K(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L36:
            X.Hwg.A00(r1)
            X.1rU r2 = r7.A0H
            if (r2 == 0) goto L28
            X.AWd r1 = r7.A0I
            if (r1 == 0) goto L26
            X.ATR r0 = new X.ATR
            r0.<init>(r2)
            r6.A00 = r3
            java.lang.Object r0 = r1.A9u(r0, r6)
            if (r0 != r5) goto L26
            return r5
        L4f:
            X.BTk r6 = new X.BTk
            r6.<init>(r7, r8, r3)
            goto L17
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.A05(androidx.compose.foundation.gestures.DragGestureNode, X.HtJ):java.lang.Object");
    }

    private final void A09() {
        this.A0C = true;
        if (this.A0A == null) {
            this.A0A = new GCV(Integer.MAX_VALUE, null);
        }
        AnonymousClass001.A1J(new BUF(this, null, 3), getCoroutineScope());
    }

    private final void A0C(C1299Agk c1299Agk, long j, long j2) {
        C1310Agv c1310Agv = this.A02;
        if (c1310Agv == null) {
            c1310Agv = new C1310Agv();
            c1310Agv.A01 = null;
            c1310Agv.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            c1310Agv.A02 = false;
            this.A02 = c1310Agv;
        }
        c1310Agv.A01 = c1299Agk;
        c1310Agv.A00 = j;
        C1300Agl c1300Agl = this.A06;
        EnumC1108AYu enumC1108AYu = this.A05;
        if (c1300Agl == null) {
            this.A06 = C1300Agl.A00(enumC1108AYu);
        } else {
            c1300Agl.A01 = enumC1108AYu;
            c1300Agl.A00 = j2;
        }
        c1310Agv.A02 = false;
        this.A04 = c1310Agv;
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A0C = false;
        A06();
        this.A0E = 0L;
        C1Z3 c1z3 = this.A08;
        if (c1z3 != null) {
            A0H(c1z3);
        }
        this.A08 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a5  */
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo13onPointerEventH0pRuoY(X.C1247Afe r17, X.EnumC1080AXj r18, long r19) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode.mo13onPointerEventH0pRuoY(X.Afe, X.AXj, long):void");
    }

    public static final long A02(EnumC1108AYu enumC1108AYu, C1309Agu c1309Agu, C1298Agj c1298Agj) {
        long j;
        long jA0P;
        int iFloatToRawIntBits;
        if (enumC1108AYu != null) {
            int i = c1309Agu.A00;
            if (AnonymousClass002.A1Q(i, 1)) {
                j = c1298Agj.A03 >> 32;
            } else if (i == 2) {
                j = c1298Agj.A03 & 4294967295L;
            }
            float fA05 = C8j3.A05(j);
            if (enumC1108AYu == EnumC1108AYu.A02) {
                jA0P = C8j3.A0P(fA05);
                iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            } else {
                jA0P = C8j3.A0P(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fA05);
            }
            return (jA0P << 32) | (iFloatToRawIntBits & 4294967295L);
        }
        return c1298Agj.A03;
    }

    private final void A06() {
        C1rU c1rU = this.A0H;
        if (c1rU != null) {
            InterfaceC1072AWd interfaceC1072AWd = this.A0I;
            if (interfaceC1072AWd != null) {
                C8j3.A1J(interfaceC1072AWd, new ATR(c1rU));
            }
            this.A0H = null;
        }
    }

    private final void A07() {
        C1305Agq c1305Agq = this.A00;
        if (c1305Agq == null) {
            Integer num = C79.A0C;
            c1305Agq = new C1305Agq();
            c1305Agq.A00 = num;
            c1305Agq.A01 = false;
            this.A00 = c1305Agq;
        }
        c1305Agq.A00 = C79.A0C;
        c1305Agq.A01 = false;
        this.A04 = c1305Agq;
    }

    private final void A08() {
        HzR<AbstractC1250Afh> hzR = this.A0A;
        if (hzR == null) {
            throw C60O.A0i("Events channel not initialized.");
        }
        hzR.AhZ(C1295Agf.A00);
    }

    private final void A0A(C1300Agl c1300Agl, C1299Agk c1299Agk, long j) {
        C1306Agr c1306Agr = this.A01;
        if (c1306Agr == null) {
            c1306Agr = new C1306Agr();
            c1306Agr.A02 = null;
            c1306Agr.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            c1306Agr.A01 = null;
            this.A01 = c1306Agr;
        }
        c1306Agr.A02 = c1299Agk;
        c1306Agr.A00 = j;
        c1300Agl.A00 = 0L;
        c1306Agr.A01 = c1300Agl;
        this.A04 = c1306Agr;
    }

    private final void A0B(C1299Agk c1299Agk, long j) {
        long jAPq = AbstractC1414Aij.A05(this.node).APq(0L);
        long j2 = this.A0F;
        if (j2 != 9205357640488583168L && jAPq != j2) {
            this.A0E = AWx.A05(this.A0E, AWx.A04(jAPq, j2));
        }
        this.A0F = jAPq;
        C3UT c3ut = this.A07;
        if (c3ut == null) {
            throw C60O.A0i("Velocity Tracker not initialized.");
        }
        A0E(c1299Agk, c3ut, this.A0E);
        HzR<AbstractC1250Afh> hzR = this.A0A;
        if (hzR == null) {
            throw C60O.A0i("Events channel not initialized.");
        }
        hzR.AhZ(new C1257Aft(j, false));
    }

    private final void A0D(C1299Agk c1299Agk, C1299Agk c1299Agk2, long j) {
        C3UT c3ut = this.A07;
        if (c3ut == null) {
            c3ut = new C3UT();
            this.A07 = c3ut;
        }
        A0E(c1299Agk, c3ut, 0L);
        long jA04 = AWx.A04(c1299Agk2.A0A, j);
        this.A0E = 0L;
        if (AnonymousClass003.A1X(new C1312Agx(c1299Agk.A07), this.A09)) {
            if (!this.A0C) {
                if (this.A0A == null) {
                    this.A0A = new GCV(Integer.MAX_VALUE, null);
                }
                A09();
            }
            this.A0F = AbstractC1414Aij.A05(this).APq(0L);
            HzR<AbstractC1250Afh> hzR = this.A0A;
            if (hzR == null) {
                throw C60O.A0i("Events channel not initialized.");
            }
            hzR.AhZ(new C1315Ah0(jA04));
        }
    }

    public static final void A0E(C1299Agk c1299Agk, C3UT c3ut, long j) {
        long j2;
        C1274AgK c1274AgK = (C1274AgK) c3ut.A00;
        if (AbstractC1078AXh.A01(c1299Agk)) {
            c1274AgK.AbS();
        }
        if (AbstractC1078AXh.A03(c1299Agk)) {
            j2 = c1299Agk.A0E;
            if (j2 - c1274AgK.A00 > 40) {
                c1274AgK.AbS();
            }
        } else {
            List list = c1299Agk.A02;
            if (list == null) {
                list = C0881AGi.A00;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1301Agm c1301Agm = (C1301Agm) list.get(i);
                c1274AgK.A3p(c1301Agm.A04, AWx.A05(c1301Agm.A00, j));
            }
            j2 = c1299Agk.A0E;
            c1274AgK.A3p(j2, AWx.A05(c1299Agk.A00, j));
        }
        c1274AgK.A00 = j2;
    }

    public Object A0I(G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super Unit> htJ) {
        Object objA01;
        if (this instanceof C1262Ag1) {
            ScrollingLogic scrollingLogic = ((C1262Ag1) this).A07;
            return C3cG.A0U(scrollingLogic.A07(C3UY.A03, htJ, new BUC(scrollingLogic, (G0V<? super G0U<? super C1257Aft, Unit>, ? super HtJ<? super Unit>, ? extends Object>) null, (ScrollingLogic) g0v, (HtJ<? super BUC>) 9)));
        }
        if (this instanceof BH6) {
            BH6 bh6 = (BH6) this;
            objA01 = Hxb.A00(new C60D(C3UY.A03, bh6.A00, new BUC(bh6, (HtJ) null, g0v, (HtJ<? super BUC>) 8), null, 1), htJ);
        } else {
            AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) this;
            AnchoredDraggableState<T> anchoredDraggableState = anchoredDraggableNode.A00;
            objA01 = anchoredDraggableState.A05.A01(C3UY.A02, htJ, new BU7(anchoredDraggableState, new AnchoredDraggableNode$drag$2(anchoredDraggableNode, null, g0v), null, 1));
        }
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (objA01 != enumC10460Hji) {
            objA01 = Unit.INSTANCE;
        }
        return objA01 != enumC10460Hji ? Unit.INSTANCE : objA01;
    }

    public void A0J(long j) {
        if ((this instanceof C1262Ag1) || !(this instanceof BH6)) {
            return;
        }
        AnonymousClass006.A1T(((BH6) this).A01, j);
    }

    public void A0K(C1249Afg c1249Afg) {
        if (this instanceof C1262Ag1) {
            C1262Ag1 c1262Ag1 = (C1262Ag1) this;
            AnonymousClass001.A1J(BU6.A0M(c1262Ag1, c1249Afg, null, 16), c1262Ag1.A09.A02());
        } else if (this instanceof BH6) {
            ((BH6) this).A02.invoke(new C1251Afj(c1249Afg.A00));
        } else if (this.isAttached) {
            AnonymousClass001.A1J(BU6.A0M(this, c1249Afg, null, 13), getCoroutineScope());
        }
    }

    public final void A0L(AbstractC1250Afh abstractC1250Afh) {
        if ((abstractC1250Afh instanceof C1315Ah0) && !this.A0C) {
            this.A0C = true;
            A09();
        }
        HzR<AbstractC1250Afh> hzR = this.A0A;
        if (hzR == null) {
            throw C60O.A0i("Events channel not initialized.");
        }
        hzR.AhZ(abstractC1250Afh);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/Agx;Ljava/lang/Boolean;>;ZLX/AWd;LX/AYu;Z)V */
    public final void A0M(EnumC1108AYu enumC1108AYu, InterfaceC1072AWd interfaceC1072AWd, G0U g0u, boolean z, boolean z2) {
        this.A09 = g0u;
        if (this.A0B != z) {
            this.A0B = z;
            if (!z) {
                A06();
                this.A0G = null;
            }
            z2 = true;
        }
        if (!C7384Etj.areEqual(this.A0I, interfaceC1072AWd)) {
            A06();
            this.A0I = interfaceC1072AWd;
        }
        if (this.A05 != enumC1108AYu) {
            this.A05 = enumC1108AYu;
        } else if (!z2) {
            return;
        }
        if (this.A0D) {
            A07();
            if (this.A0C) {
                A08();
            }
            this.A07 = null;
        }
        C1296Agh c1296Agh = this.A0G;
        if (c1296Agh != null) {
            c1296Agh.A05();
        }
    }

    public boolean A0N() {
        if (!(this instanceof C1262Ag1)) {
            if (this instanceof BH6) {
                return false;
            }
            AnchoredDraggableNode anchoredDraggableNode = (AnchoredDraggableNode) this;
            Boolean bool = anchoredDraggableNode.A04;
            return bool != null ? bool.booleanValue() : AnonymousClass002.A1X(anchoredDraggableNode.A00.A0B.getValue());
        }
        ScrollingLogic scrollingLogic = ((C1262Ag1) this).A07;
        if (scrollingLogic.A05.AOz()) {
            return true;
        }
        InterfaceC1260Afz interfaceC1260Afz = scrollingLogic.A01;
        if (interfaceC1260Afz != null) {
            C1267AgC c1267AgC = ((AndroidEdgeEffectOverscrollEffect) interfaceC1260Afz).A04;
            EdgeEffect edgeEffect = c1267AgC.A07;
            if (edgeEffect != null && C1268AgD.A00(edgeEffect) != 0.0f) {
                return true;
            }
            EdgeEffect edgeEffect2 = c1267AgC.A01;
            if (edgeEffect2 != null && C1268AgD.A00(edgeEffect2) != 0.0f) {
                return true;
            }
            EdgeEffect edgeEffect3 = c1267AgC.A03;
            if (edgeEffect3 != null && C1268AgD.A00(edgeEffect3) != 0.0f) {
                return true;
            }
            EdgeEffect edgeEffect4 = c1267AgC.A05;
            if (edgeEffect4 != null && C1268AgD.A00(edgeEffect4) != 0.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AX5
    public final boolean AOa(C1298Agj c1298Agj) {
        return !c1298Agj.A06 && c1298Agj.A05 && this.A0B;
    }

    @Override // X.InterfaceC1447AjG
    public final void AS5() {
        C1296Agh c1296Agh = this.A0G;
        if (c1296Agh != null) {
            c1296Agh.A05();
        }
    }

    @Override // X.InterfaceC1447AjG
    public final void ATZ(AX8 ax8, EnumC1080AXj enumC1080AXj) {
        C1298Agj c1298Agj;
        C1298Agj c1298Agj2;
        DragGestureNode dragGestureNode;
        AbstractC1250Afh c1249Afg;
        boolean z;
        long jA04;
        long j;
        C1298Agj c1298Agj3;
        C1298Agj c1298Agj4;
        C1298Agj c1298Agj5;
        C1298Agj c1298Agj6;
        if (this.A08 == null) {
            AX4 ax4 = new AX4(this);
            A0G(ax4);
            this.A08 = ax4;
        }
        if (this.A0B) {
            C1296Agh c1296Agh = this.A0G;
            if (c1296Agh == null) {
                c1296Agh = new C1296Agh(this);
                this.A0G = c1296Agh;
            }
            AbstractC1318Ah4 abstractC1318Ah4 = c1296Agh.A06;
            AbstractC1318Ah4 abstractC1318Ah42 = abstractC1318Ah4;
            if (abstractC1318Ah4 == null) {
                C1307Ags c1307Ags = c1296Agh.A02;
                C1307Ags c1307Ags2 = c1307Ags;
                if (c1307Ags == null) {
                    Integer num = C79.A0C;
                    C1307Ags c1307Ags3 = new C1307Ags();
                    c1307Ags3.A00 = num;
                    c1307Ags3.A01 = false;
                    c1296Agh.A02 = c1307Ags3;
                    c1307Ags2 = c1307Ags3;
                }
                c1296Agh.A06 = c1307Ags2;
                abstractC1318Ah42 = c1307Ags2;
            }
            if (!(abstractC1318Ah42 instanceof C1307Ags)) {
                if (abstractC1318Ah42 instanceof C1311Agw) {
                    C1311Agw c1311Agw = (C1311Agw) abstractC1318Ah42;
                    if (enumC1080AXj != EnumC1080AXj.A03) {
                        C1303Ago c1303Ago = (C1303Ago) ax8;
                        List<C1298Agj> list = c1303Ago.A02;
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            c1298Agj4 = null;
                            if (i >= size) {
                                c1298Agj5 = null;
                                break;
                            }
                            c1298Agj5 = list.get(i);
                            if (c1298Agj5.A01 == c1311Agw.A00) {
                                break;
                            } else {
                                i++;
                            }
                        }
                        C1298Agj c1298Agj7 = c1298Agj5;
                        if (c1298Agj7 == null) {
                            int size2 = list.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size2) {
                                    c1298Agj6 = null;
                                    break;
                                }
                                c1298Agj6 = list.get(i2);
                                if (c1298Agj6.A05) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            c1298Agj7 = c1298Agj6;
                            if (c1298Agj7 != null) {
                                c1311Agw.A00 = c1298Agj7.A01;
                            }
                        }
                        if (enumC1080AXj == EnumC1080AXj.A04) {
                            if (c1298Agj7.A00) {
                                C1298Agj c1298Agj8 = c1311Agw.A01;
                                if (c1298Agj8 == null) {
                                    throw C60O.A0i("AwaitTouchSlop.initialDown was not initialized");
                                }
                                long j2 = c1311Agw.A00;
                                C1300Agl c1300Agl = c1296Agh.A07;
                                if (c1300Agl == null) {
                                    throw C60O.A0i("AwaitTouchSlop.touchSlopDetector was not initialized");
                                }
                                C1296Agh.A01(c1296Agh, c1300Agl, c1298Agj8, j2);
                            } else if (!c1298Agj7.A06 || c1298Agj7.A05) {
                                DragGestureNode dragGestureNode2 = c1296Agh.A09;
                                float fALr = ARZ.A00(dragGestureNode2).ALr();
                                C1300Agl c1300Agl2 = c1296Agh.A07;
                                if (c1300Agl2 == null) {
                                    throw C60O.A0i("Touch slop detector not initialized.");
                                }
                                EnumC1108AYu enumC1108AYu = dragGestureNode2.A05;
                                int i3 = c1303Ago.A00;
                                C1309Agu c1309Agu = new C1309Agu(i3);
                                long jA01 = c1300Agl2.A01(fALr, AWx.A04(AbstractC1297Agi.A00(enumC1108AYu, c1309Agu, c1298Agj7), A02(enumC1108AYu, c1309Agu, c1298Agj7)), true);
                                if ((9223372034707292159L & jA01) != 9205357640488583168L) {
                                    c1298Agj7.A00 = true;
                                    C1298Agj c1298Agj9 = c1311Agw.A01;
                                    C7384Etj.A0X(c1298Agj9);
                                    C1296Agh.A03(c1296Agh, new C1309Agu(i3), c1298Agj9, c1298Agj7, jA01);
                                    C1296Agh.A02(c1296Agh, new C1309Agu(i3), c1298Agj7, jA01);
                                    long j3 = c1298Agj7.A01;
                                    Ah2 ah2 = c1296Agh.A05;
                                    if (ah2 == null) {
                                        ah2 = new Ah2();
                                        ah2.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                                        c1296Agh.A05 = ah2;
                                    }
                                    ah2.A00 = j3;
                                    c1296Agh.A06 = ah2;
                                } else {
                                    c1311Agw.A02 = true;
                                }
                            } else {
                                int size3 = list.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size3) {
                                        break;
                                    }
                                    C1298Agj c1298Agj10 = list.get(i4);
                                    if (c1298Agj10.A05) {
                                        c1298Agj4 = c1298Agj10;
                                        break;
                                    }
                                    i4++;
                                }
                                C1298Agj c1298Agj11 = c1298Agj4;
                                if (c1298Agj11 == null) {
                                    C1296Agh.A00(c1296Agh);
                                } else {
                                    c1311Agw.A00 = c1298Agj11.A01;
                                }
                            }
                        }
                        if (enumC1080AXj == EnumC1080AXj.A02 && c1311Agw.A02) {
                            if (!c1298Agj7.A00) {
                                c1311Agw.A02 = false;
                                return;
                            }
                            C1298Agj c1298Agj12 = c1311Agw.A01;
                            if (c1298Agj12 == null) {
                                throw C60O.A0i("AwaitTouchSlop.initialDown was not initialized");
                            }
                            long j4 = c1311Agw.A00;
                            C1300Agl c1300Agl3 = c1296Agh.A07;
                            if (c1300Agl3 == null) {
                                throw C60O.A0i("AwaitTouchSlop.touchSlopDetector was not initialized");
                            }
                            C1296Agh.A01(c1296Agh, c1300Agl3, c1298Agj12, j4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (abstractC1318Ah42 instanceof C1308Agt) {
                    C1308Agt c1308Agt = (C1308Agt) abstractC1318Ah42;
                    if (enumC1080AXj != EnumC1080AXj.A02) {
                        return;
                    }
                    C1303Ago c1303Ago2 = (C1303Ago) ax8;
                    List<C1298Agj> list2 = c1303Ago2.A02;
                    int size4 = list2.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size4) {
                            z = true;
                            break;
                        } else {
                            if (C8j4.A0Z(list2, i6).A00) {
                                z = false;
                                break;
                            }
                            i6++;
                        }
                    }
                    int size5 = list2.size();
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (!C8j4.A0Z(list2, i5).A05) {
                            i5++;
                        } else if (!list2.isEmpty()) {
                            if (!z) {
                                return;
                            }
                            C1298Agj c1298Agj13 = (C1298Agj) AbstractC0878AGe.A0F(list2);
                            DragGestureNode dragGestureNode3 = c1296Agh.A09;
                            EnumC1108AYu enumC1108AYu2 = dragGestureNode3.A05;
                            int i7 = c1303Ago2.A00;
                            long jA00 = AbstractC1297Agi.A00(enumC1108AYu2, new C1309Agu(i7), c1298Agj13);
                            C1298Agj c1298Agj14 = c1308Agt.A02;
                            C7384Etj.A0X(c1298Agj14);
                            jA04 = AWx.A04(jA00, AbstractC1297Agi.A00(dragGestureNode3.A05, new C1309Agu(i7), c1298Agj14));
                            C1298Agj c1298Agj15 = c1308Agt.A02;
                            if (c1298Agj15 == null) {
                                throw C60O.A0i("AwaitGesturePickup.initialDown was not initialized.");
                            }
                            j = c1308Agt.A00;
                            c1298Agj3 = c1298Agj15;
                        }
                    }
                } else {
                    if (!(abstractC1318Ah42 instanceof Ah2)) {
                        throw C3cG.A0q();
                    }
                    Ah2 ah22 = (Ah2) abstractC1318Ah42;
                    if (enumC1080AXj != EnumC1080AXj.A04) {
                        return;
                    }
                    long j5 = ah22.A00;
                    C1303Ago c1303Ago3 = (C1303Ago) ax8;
                    List<C1298Agj> list3 = c1303Ago3.A02;
                    int size6 = list3.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        c1298Agj = null;
                        if (i9 >= size6) {
                            c1298Agj2 = null;
                            break;
                        }
                        c1298Agj2 = list3.get(i9);
                        if (c1298Agj2.A01 == j5) {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    C1298Agj c1298Agj16 = c1298Agj2;
                    if (c1298Agj16 == null) {
                        return;
                    }
                    if (!c1298Agj16.A06 || c1298Agj16.A05) {
                        if (c1298Agj16.A00) {
                            c1296Agh.A09.A0L(C1295Agf.A00);
                            return;
                        }
                        EnumC1108AYu enumC1108AYu3 = c1296Agh.A09.A05;
                        int i10 = c1303Ago3.A00;
                        C1309Agu c1309Agu2 = new C1309Agu(i10);
                        if (AWx.A00(AWx.A04(AbstractC1297Agi.A00(enumC1108AYu3, c1309Agu2, c1298Agj16), A02(enumC1108AYu3, c1309Agu2, c1298Agj16))) != 0.0f) {
                            C1309Agu c1309Agu3 = new C1309Agu(i10);
                            C1296Agh.A02(c1296Agh, new C1309Agu(i10), c1298Agj16, AWx.A04(AbstractC1297Agi.A00(enumC1108AYu3, c1309Agu3, c1298Agj16), A02(enumC1108AYu3, c1309Agu3, c1298Agj16)));
                            c1298Agj16.A00 = true;
                            return;
                        }
                        return;
                    }
                    int size7 = list3.size();
                    while (true) {
                        if (i8 >= size7) {
                            break;
                        }
                        C1298Agj c1298Agj17 = list3.get(i8);
                        if (c1298Agj17.A05) {
                            c1298Agj = c1298Agj17;
                            break;
                        }
                        i8++;
                    }
                    C1298Agj c1298Agj18 = c1298Agj;
                    if (c1298Agj18 != null) {
                        ah22.A00 = c1298Agj18.A01;
                        return;
                    }
                    if (c1298Agj16.A00) {
                        dragGestureNode = c1296Agh.A09;
                        c1249Afg = C1295Agf.A00;
                    } else {
                        C1309Agu c1309Agu4 = new C1309Agu(c1303Ago3.A00);
                        C3UT c3ut = c1296Agh.A08;
                        if (c3ut == null) {
                            throw C60O.A0i("Velocity Tracker not initialized.");
                        }
                        dragGestureNode = c1296Agh.A09;
                        AbstractC1297Agi.A01(c1296Agh.A0A, dragGestureNode.A05, c1309Agu4, c1298Agj16, c3ut, c1296Agh.A00);
                        float fAHX = ARZ.A00(dragGestureNode).AHX();
                        C3UT c3ut2 = c1296Agh.A08;
                        if (c3ut2 == null) {
                            throw C60O.A0i("Velocity Tracker not initialized.");
                        }
                        long jA5r = c3ut2.A00.A5r(AnonymousClass005.A0J(fAHX, fAHX));
                        C3UT c3ut3 = c1296Agh.A08;
                        if (c3ut3 == null) {
                            throw C60O.A0i("Velocity Tracker not initialized.");
                        }
                        c3ut3.A00.AbS();
                        G0W<C3UX, AWx, HtJ<? super Unit>, Object> g0w = C3US.A00;
                        float fA03 = AnonymousClass003.A03(jA5r);
                        if (Float.isNaN(fA03)) {
                            fA03 = 0.0f;
                        }
                        float fA00 = AnonymousClass004.A00(jA5r);
                        c1249Afg = new C1249Afg(AnonymousClass005.A0J(fA03, Float.isNaN(fA00) ? 0.0f : fA00), true);
                    }
                    dragGestureNode.A0L(c1249Afg);
                }
                C1296Agh.A00(c1296Agh);
                return;
            }
            C1307Ags c1307Ags4 = (C1307Ags) abstractC1318Ah42;
            C1303Ago c1303Ago4 = (C1303Ago) ax8;
            List<C1298Agj> list4 = c1303Ago4.A02;
            if (list4.isEmpty()) {
                return;
            }
            int size8 = list4.size();
            for (int i11 = 0; i11 < size8; i11++) {
                C1298Agj c1298AgjA0Z = C8j4.A0Z(list4, i11);
                if (c1298AgjA0Z.A06 || !c1298AgjA0Z.A05) {
                    return;
                }
            }
            C1298Agj c1298Agj19 = (C1298Agj) AbstractC0878AGe.A0F(list4);
            Integer num2 = c1307Ags4.A00;
            if (num2.intValue() == 2) {
                num2 = !c1296Agh.A09.A0N() ? C79.A00 : C79.A01;
            }
            c1307Ags4.A00 = num2;
            if (enumC1080AXj == EnumC1080AXj.A03 && num2 == C79.A01) {
                c1298Agj19.A00 = true;
                c1307Ags4.A01 = true;
            }
            if (enumC1080AXj != EnumC1080AXj.A04) {
                return;
            }
            if (num2 != C79.A00) {
                if (c1307Ags4.A01) {
                    int i12 = c1303Ago4.A00;
                    C1296Agh.A03(c1296Agh, new C1309Agu(i12), c1298Agj19, c1298Agj19, 0L);
                    C1296Agh.A02(c1296Agh, new C1309Agu(i12), c1298Agj19, 0L);
                    long j6 = c1298Agj19.A01;
                    Ah2 ah23 = c1296Agh.A05;
                    if (ah23 == null) {
                        ah23 = new Ah2();
                        ah23.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                        c1296Agh.A05 = ah23;
                    }
                    ah23.A00 = j6;
                    c1296Agh.A06 = ah23;
                    return;
                }
                return;
            }
            j = c1298Agj19.A01;
            jA04 = 0;
            c1298Agj3 = c1298Agj19;
            C1296Agh.A04(c1296Agh, c1298Agj3, j, jA04);
        }
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput */
    public final void onViewConfigurationChange() {
        if (this.A0D) {
            A07();
            if (this.A0C) {
                A08();
            }
            this.A07 = null;
        }
        this.A0D = false;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/Agx;Ljava/lang/Boolean;>;ZLX/AWd;LX/AYu;)V */
    public DragGestureNode(EnumC1108AYu enumC1108AYu, InterfaceC1072AWd interfaceC1072AWd, G0U g0u, boolean z) {
        this.A05 = enumC1108AYu;
        this.A09 = g0u;
        this.A0B = z;
        this.A0I = interfaceC1072AWd;
    }

    @Override // X.AX5
    public final boolean AOb(C1299Agk c1299Agk) {
        if (AbstractC1078AXh.A01(c1299Agk)) {
            return this.A0B;
        }
        if (!AbstractC1078AXh.A03(c1299Agk)) {
            if (this.A06 == null) {
                this.A06 = C1300Agl.A00(this.A05);
            }
            float fALr = ARZ.A00(this).ALr();
            long jA00 = AbstractC1078AXh.A00(c1299Agk);
            C1300Agl c1300Agl = this.A06;
            if (c1300Agl == null) {
                throw C60O.A0i("Touch slop detector not initialized.");
            }
            if (c1300Agl.A01(fALr, jA00, false) != 9205357640488583168L) {
                long jA05 = AWx.A05(c1300Agl.A00, jA00);
                double dAtan2 = (((float) Math.atan2(Math.abs(AnonymousClass004.A00(jA05)), Math.abs(AnonymousClass003.A03(jA05)))) * 180.0f) / 3.141592653589793d;
                EnumC1108AYu enumC1108AYu = c1300Agl.A01;
                if (enumC1108AYu != null) {
                    int iOrdinal = enumC1108AYu.ordinal();
                    if (iOrdinal != 1) {
                        if (iOrdinal == 0 && dAtan2 > 30.0d) {
                            return true;
                        }
                    } else if (dAtan2 < 30.0d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
