package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1457AjQ {
    public Object A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public final C1393AiO A05;
    public final InterfaceC1482Ajp A06;
    public final C1463AjW A07;
    public final C1466AjZ A08;
    public final Ab0<C1453AjM> A09;
    public final C0912AHo<Function0<Unit>> A0A;
    public final Function0<Unit> A0B;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01(X.C1453AjM r21) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457AjQ.A01(X.AjM):void");
    }

    private final long A00(C1453AjM c1453AjM) {
        C1438Aj7 c1438Aj7 = c1453AjM.A0f;
        AbstractC1387AiH abstractC1387AiH = c1438Aj7.A04;
        long jA02 = 0;
        for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A07; abstractC1387AiH2 != null && abstractC1387AiH2 != abstractC1387AiH; abstractC1387AiH2 = abstractC1387AiH2.A09) {
            InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH2.A0A;
            if (interfaceC1402AiX != null) {
                C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
                C1388AiI.A00(c1388AiI);
                if (!AbstractC1409Aie.A00(c1388AiI.A0J)) {
                    return 9223372034707292159L;
                }
            }
            jA02 = C2ae.A02(jA02, abstractC1387AiH2.A01);
        }
        return jA02;
    }

    private final void A02(C1453AjM c1453AjM) {
        if (c1453AjM.A0N) {
            InterfaceC1402AiX interfaceC1402AiX = c1453AjM.A0f.A04.A0A;
            if (interfaceC1402AiX != null) {
                C1388AiI c1388AiI = (C1388AiI) interfaceC1402AiX;
                C1388AiI.A00(c1388AiI);
                if (!AbstractC1409Aie.A00(c1388AiI.A0J)) {
                    return;
                }
            }
            c1453AjM.A0N = false;
            if (c1453AjM.A0V) {
                c1453AjM.A03 = A00(c1453AjM);
                c1453AjM.A0V = false;
            }
            if (c1453AjM.A03 != 9223372034707292159L) {
                C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
                C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
                int i = c0910AHmA0D.A00;
                for (int i2 = 0; i2 < i; i2++) {
                    A02(c1453AjMArr[i2]);
                }
            }
        }
    }

    public static final void A03(C1457AjQ c1457AjQ) {
        Object obj = c1457AjQ.A00;
        boolean z = obj != null;
        long j = c1457AjQ.A08.A00;
        if (j >= 0 || !z) {
            if (c1457AjQ.A03 == j && z) {
                return;
            }
            if (obj != null) {
                c1457AjQ.A06.Aan(obj);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, 16 + jCurrentTimeMillis);
            c1457AjQ.A03 = jMax;
            c1457AjQ.A00 = c1457AjQ.A06.AB1(jMax - jCurrentTimeMillis, c1457AjQ.A0B);
        }
    }

    public final long A04(C1453AjM c1453AjM) {
        C1463AjW c1463AjW = this.A07;
        int i = c1453AjM.A02 & 33554431;
        long[] jArr = c1463AjW.A01;
        int i2 = c1463AjW.A00;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                if (jArr[i3] == LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
                    return 9223372034707292159L;
                }
                return AnonymousClass002.A0G((int) r5, ((int) (r5 >> 32)) << 32);
            }
        }
        return 9223372034707292159L;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02a2 A[PHI: r6
  0x02a2: PHI (r6v16 long) = (r6v15 long), (r6v17 long) binds: [B:95:0x0242, B:114:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457AjQ.A05():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0056 A[EDGE_INSN: B:100:0x0056->B:24:0x0056 BREAK  A[LOOP:2: B:50:0x0117->B:104:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134 A[LOOP:3: B:54:0x0134->B:62:0x0193, LOOP_START, PHI: r7 r23
  0x0134: PHI (r7v8 int) = (r7v7 int), (r7v9 int) binds: [B:53:0x0132, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]
  0x0134: PHI (r23v4 int) = (r23v3 int), (r23v5 int) binds: [B:53:0x0132, B:62:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C1453AjM r31) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1457AjQ.A06(X.AjM):void");
    }

    public final void A07(C1453AjM c1453AjM) {
        if (c1453AjM.A0L) {
            C1463AjW c1463AjW = this.A07;
            int i = c1453AjM.A02 & 33554431;
            long[] jArr = c1463AjW.A01;
            int i2 = c1463AjW.A00;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = AbstractC1479Ajm.A02;
                    break;
                }
                i3 += 3;
            }
            c1453AjM.A0L = false;
            c1453AjM.A0W = true;
            this.A01 = true;
            this.A04 = true;
        }
    }

    public C1457AjQ(Ab0<C1453AjM> ab0, InterfaceC1482Ajp interfaceC1482Ajp) {
        this.A09 = ab0;
        this.A06 = interfaceC1482Ajp;
        this.A07 = new C1463AjW();
        this.A08 = new C1466AjZ();
        this.A0A = C0912AHo.A00();
        this.A03 = -1L;
        this.A0B = C2328BUc.A00(this, 33);
        C1393AiO c1393AiO = new C1393AiO();
        c1393AiO.A01 = 0.0f;
        c1393AiO.A03 = 0.0f;
        c1393AiO.A02 = 0.0f;
        c1393AiO.A00 = 0.0f;
        this.A05 = c1393AiO;
    }

    public C1457AjQ() {
        this(AbstractC1489Ajw.A00, C1652Ana.A00);
    }
}
