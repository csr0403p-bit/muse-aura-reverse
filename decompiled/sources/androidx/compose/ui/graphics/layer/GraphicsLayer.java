package androidx.compose.ui.graphics.layer;

import X.AQY;
import X.AT3;
import X.AW2;
import X.AW6;
import X.AW9;
import X.AXN;
import X.AaI;
import X.AbstractC1331AhI;
import X.AbstractC1555AlK;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BUT;
import X.BUX;
import X.C1069ATz;
import X.C1097AYh;
import X.C1293Agd;
import X.C1325AhC;
import X.C1391AiM;
import X.C1398AiT;
import X.C1399AiU;
import X.C1572Alm;
import X.C8j3;
import X.EnumC1820Arj;
import X.G0U;
import X.InterfaceC1068ATy;
import X.InterfaceC1279AgP;
import X.InterfaceC1294Age;
import X.InterfaceC1330AhH;
import X.InterfaceC1410Aif;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class GraphicsLayer {
    public static final InterfaceC1294Age A0O;
    public float A00;
    public int A01;
    public long A02;
    public long A05;
    public long A06;
    public Outline A07;
    public RectF A08;
    public InterfaceC1330AhH A09;
    public InterfaceC1068ATy A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0E;
    public AbstractC1555AlK A0F;
    public InterfaceC1068ATy A0G;
    public C1325AhC A0H;
    public final InterfaceC1410Aif A0M;
    public AXN A0I = AbstractC1331AhI.A00;
    public EnumC1820Arj A0J = EnumC1820Arj.A02;
    public G0U<? super AT3, Unit> A0K = new BUT(20);
    public final G0U<AT3, Unit> A0N = new BUX(this, 19);
    public boolean A0D = true;
    public long A04 = 0;
    public long A03 = 9205357640488583168L;
    public final C1398AiT A0L = new C1398AiT();

    public static final void A05(GraphicsLayer graphicsLayer) {
        graphicsLayer.A0F = null;
        graphicsLayer.A0A = null;
        graphicsLayer.A03 = 9205357640488583168L;
        graphicsLayer.A04 = 0L;
        graphicsLayer.A00 = 0.0f;
        graphicsLayer.A0D = true;
        graphicsLayer.A0E = false;
    }

    static {
        A0O = AnonymousClass001.A0u(Build.FINGERPRINT).equals("robolectric") ? C1293Agd.A00 : C1399AiU.A00;
    }

    private final void A00() {
        this.A01--;
        A04(this);
    }

    private final void A01() {
        InterfaceC1410Aif interfaceC1410Aif = this.A0M;
        AXN axn = this.A0I;
        EnumC1820Arj enumC1820Arj = this.A0J;
        G0U<AT3, Unit> g0u = this.A0N;
        C1391AiM c1391AiM = (C1391AiM) interfaceC1410Aif;
        RenderNode renderNode = c1391AiM.A0L;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        try {
            C1572Alm c1572Alm = c1391AiM.A0M.A00;
            Canvas canvas = c1572Alm.A00;
            c1572Alm.A00 = recordingCanvasBeginRecording;
            C1325AhC c1325AhC = c1391AiM.A0N;
            InterfaceC1279AgP interfaceC1279AgP = c1325AhC.A03;
            interfaceC1279AgP.AdH(axn);
            AaI aaI = (AaI) interfaceC1279AgP;
            AW9 aw9 = aaI.A02.A02;
            aw9.A03 = enumC1820Arj;
            aaI.A00 = this;
            interfaceC1279AgP.Aeh(c1391AiM.A0C);
            aw9.A01 = c1572Alm;
            g0u.invoke(c1325AhC);
            c1572Alm.A00 = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.AT3 r13, androidx.compose.ui.graphics.layer.GraphicsLayer r14) {
        /*
            X.AiT r3 = r14.A0L
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r3.A02
            r3.A03 = r0
            X.AHt<androidx.compose.ui.graphics.layer.GraphicsLayer> r2 = r3.A00
            if (r2 == 0) goto L22
            int r0 = r2.A01
            if (r0 == 0) goto L22
            X.AHt<androidx.compose.ui.graphics.layer.GraphicsLayer> r1 = r3.A01
            if (r1 != 0) goto L1c
            X.AHt<java.lang.Object> r0 = X.HsU.A00
            r0 = 6
            X.AHt r1 = new X.AHt
            r1.<init>(r0)
            r3.A01 = r1
        L1c:
            r1.A08(r2)
            r2.A06()
        L22:
            r0 = 1
            r3.A04 = r0
            X.G0U<? super X.AT3, kotlin.Unit> r0 = r14.A0K
            r0.invoke(r13)
            r0 = 0
            r3.A04 = r0
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r3.A03
            if (r0 == 0) goto L34
            r0.A00()
        L34:
            X.AHt<androidx.compose.ui.graphics.layer.GraphicsLayer> r12 = r3.A01
            if (r12 == 0) goto L86
            int r0 = r12.A01
            if (r0 == 0) goto L86
            java.lang.Object[] r11 = r12.A04
            long[] r10 = r12.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L83
            r8 = 0
        L46:
            r13 = r10[r8]
            r3 = -1
            long r3 = r3 ^ r13
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r13
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L7e
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L63:
            if (r5 >= r6) goto L7c
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L78
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            r0.A00()
        L78:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L63
        L7c:
            if (r6 != r7) goto L83
        L7e:
            if (r8 == r9) goto L83
            int r8 = r8 + 1
            goto L46
        L83:
            r12.A06()
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A02(X.AT3, androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(androidx.compose.ui.graphics.layer.GraphicsLayer r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A03(androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(androidx.compose.ui.graphics.layer.GraphicsLayer r15) {
        /*
            boolean r0 = r15.A0C
            if (r0 == 0) goto L6b
            int r0 = r15.A01
            if (r0 != 0) goto L6b
            X.AiT r1 = r15.A0L
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = r1.A02
            if (r0 == 0) goto L14
            r0.A00()
            r0 = 0
            r1.A02 = r0
        L14:
            X.AHt<androidx.compose.ui.graphics.layer.GraphicsLayer> r12 = r1.A00
            if (r12 == 0) goto L62
            java.lang.Object[] r11 = r12.A04
            long[] r10 = r12.A03
            int r0 = r10.length
            int r9 = r0 + (-2)
            if (r9 < 0) goto L5f
            r8 = 0
        L22:
            r13 = r10[r8]
            r3 = -1
            long r3 = r3 ^ r13
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r13
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L5a
            int r0 = r8 - r9
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r7 = 8
            int r6 = 8 - r0
            r5 = 0
        L3f:
            if (r5 >= r6) goto L58
            r3 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r13
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L54
            int r0 = r8 << 3
            int r0 = r0 + r5
            r0 = r11[r0]
            androidx.compose.ui.graphics.layer.GraphicsLayer r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r0
            r0.A00()
        L54:
            long r13 = r13 >> r7
            int r5 = r5 + 1
            goto L3f
        L58:
            if (r6 != r7) goto L5f
        L5a:
            if (r8 == r9) goto L5f
            int r8 = r8 + 1
            goto L22
        L5f:
            r12.A06()
        L62:
            X.Aif r0 = r15.A0M
            X.AiM r0 = (X.C1391AiM) r0
            android.graphics.RenderNode r0 = r0.A0L
            r0.discardDisplayList()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A04(androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    public static final void A06(GraphicsLayer graphicsLayer, long j, long j2) {
        InterfaceC1410Aif interfaceC1410Aif = graphicsLayer.A0M;
        int i = (int) (j >> 32);
        int iA09 = AnonymousClass002.A09(j);
        C1391AiM c1391AiM = (C1391AiM) interfaceC1410Aif;
        c1391AiM.A0L.setPosition(i, iA09, ((int) (j2 >> 32)) + i, ((int) (4294967295L & j2)) + iA09);
        c1391AiM.A0C = AQY.A01(j2);
    }

    public final AbstractC1555AlK A07() {
        AbstractC1555AlK c1097AYh = this.A0F;
        InterfaceC1068ATy interfaceC1068ATy = this.A0A;
        if (c1097AYh == null) {
            if (interfaceC1068ATy != null) {
                c1097AYh = new C1069ATz(interfaceC1068ATy);
            } else {
                long jA01 = AQY.A01(this.A05);
                long j = this.A04;
                long j2 = this.A03;
                if (j2 != 9205357640488583168L) {
                    jA01 = j2;
                }
                float fA00 = AnonymousClass001.A00(j);
                float fA01 = AnonymousClass001.A01(j, 4294967295L);
                float fA002 = fA00 + AnonymousClass001.A00(jA01);
                float fA012 = fA01 + AnonymousClass001.A01(jA01, 4294967295L);
                float f = this.A00;
                if (f > 0.0f) {
                    long jA0P = C8j3.A0P(f);
                    c1097AYh = new AW6(AW2.A00(fA00, fA01, fA002, fA012, (jA0P << 32) | (4294967295L & jA0P)));
                } else {
                    c1097AYh = new C1097AYh(C8j3.A0f(fA00, fA01, fA002, fA012));
                }
            }
            this.A0F = c1097AYh;
        }
        return c1097AYh;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.HtJ<? super X.InterfaceC2178B0w> r6) {
        /*
            r5 = this;
            r3 = 20
            boolean r0 = r6 instanceof X.C2310BTk
            if (r0 == 0) goto L3c
            r4 = r6
            X.BTk r4 = (X.C2310BTk) r4
            int r0 = r4.$t
            if (r0 != r3) goto L3c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r3 = r4.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L42
            X.Hwg.A00(r3)
        L26:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            X.B1T r0 = new X.B1T
            r0.<init>(r3)
            return r0
        L2e:
            X.Hwg.A00(r3)
            X.Age r0 = androidx.compose.ui.graphics.layer.GraphicsLayer.A0O
            r4.A00 = r1
            android.graphics.Bitmap r3 = r0.Agt(r5)
            if (r3 != r2) goto L26
            return r2
        L3c:
            X.BTk r4 = new X.BTk
            r4.<init>(r5, r6, r3)
            goto L18
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A08(X.HtJ):java.lang.Object");
    }

    public final void A09(float f) {
        C1391AiM c1391AiM = (C1391AiM) this.A0M;
        if (c1391AiM.A00 != f) {
            c1391AiM.A00 = f;
            c1391AiM.A0L.setAlpha(f);
        }
    }

    public final void A0A(long j) {
        if (this.A02 != j) {
            this.A02 = j;
            long j2 = 9223372034707292159L & j;
            RenderNode renderNode = ((C1391AiM) this.A0M).A0L;
            if (j2 == 9205357640488583168L) {
                renderNode.resetPivot();
            } else {
                renderNode.setPivotX(AnonymousClass003.A03(j));
                renderNode.setPivotY(AnonymousClass004.A00(j));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(X.InterfaceC1327AhE r24, androidx.compose.ui.graphics.layer.GraphicsLayer r25) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.A0B(X.AhE, androidx.compose.ui.graphics.layer.GraphicsLayer):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXN;LX/Arj;JLX/G0U<-LX/AT3;Lkotlin/Unit;>;)V */
    public final void A0C(AXN axn, EnumC1820Arj enumC1820Arj, G0U g0u, long j) {
        if (this.A05 != j) {
            this.A05 = j;
            A06(this, this.A06, j);
            if (this.A03 == 9205357640488583168L) {
                this.A0D = true;
                A03(this);
            }
        }
        this.A0I = axn;
        this.A0J = enumC1820Arj;
        this.A0K = g0u;
        A01();
    }

    public GraphicsLayer(InterfaceC1410Aif interfaceC1410Aif) {
        this.A0M = interfaceC1410Aif;
        C1391AiM c1391AiM = (C1391AiM) interfaceC1410Aif;
        c1391AiM.A0H = false;
        C1391AiM.A00(c1391AiM);
        this.A06 = 0L;
        this.A05 = 0L;
        this.A02 = 9205357640488583168L;
    }
}
