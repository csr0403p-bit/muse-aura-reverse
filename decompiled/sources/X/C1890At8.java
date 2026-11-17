package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.Collections;
import java.util.List;

/* renamed from: X.At8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1890At8 {
    public C1891AtA A00;
    public final ATj A01;
    public final C2130Ayy A02;
    public final MutableState A03;
    public final MutableState A04;
    public final MutableState A05;
    public final C0910AHm<InterfaceC2157Azn> A06;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C1890At8(String str) {
        int length = str.length();
        long jA00 = AbstractC1815ArZ.A00(length, length);
        this.A01 = new ATj(null, null == true ? 1 : 0, null == true ? 1 : 0, 3);
        At0 at0 = new At0(null, str, null, null, AbstractC1815ArZ.A01(jA00, length));
        this.A00 = new C1891AtA(at0, at0, null);
        AGE age = AGE.A00;
        this.A03 = C3cG.A08(age, false);
        this.A05 = C3cG.A08(age, new At0(null, str, null, null, jA00));
        this.A04 = C3cG.A08(age, false);
        this.A02 = new C2130Ayy(this);
        this.A06 = C0910AHm.A02(new InterfaceC2157Azn[16], 0);
    }

    public static void A01(InterfaceC2143AzF interfaceC2143AzF, C1890At8 c1890At8, Integer num) {
        A02(interfaceC2143AzF, c1890At8, num, true);
        A06(c1890At8, true);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Au3;LX/AHm<LX/ApU<LX/1OS;>;>;)Ljava/util/List<LX/ApU<LX/1OS;>;>; */
    public static final List A00(C0910AHm c0910AHm, Au3 au3) {
        if (c0910AHm != null && c0910AHm.A00 != 0) {
            return AbstractC0878AGe.A0X(c0910AHm.A08());
        }
        if (au3 != null) {
            long j = au3.A00;
            if (!Au3.A04(j)) {
                BG3 bg3 = BG3.A03;
                long j2 = B6A.A07;
                long j3 = C1809ArT.A01;
                return Collections.singletonList(new C1733ApU(new C1824Aro(null, null, null, null, null, null, null, null, bg3, null, null, j2, j3, j3, j2), Au3.A02(j), Au3.A01(j)));
            }
        }
        return C0881AGi.A00;
    }

    public static final void A02(InterfaceC2143AzF interfaceC2143AzF, C1890At8 c1890At8, Integer num, boolean z) {
        MutableState mutableState = c1890At8.A05;
        At0 at0 = (At0) mutableState.getValue();
        if (c1890At8.A00.A02().A00.A00 == 0) {
            long j = at0.A00;
            C1891AtA c1891AtA = c1890At8.A00;
            if (j == c1891AtA.A00) {
                if (C7384Etj.areEqual(at0.A01, c1891AtA.A02) && C7384Etj.areEqual(at0.A04, c1890At8.A00.A03) && C7384Etj.areEqual(at0.A03, c1890At8.A00.A01)) {
                    return;
                }
                At0 at02 = (At0) mutableState.getValue();
                String string = c1890At8.A00.toString();
                C1891AtA c1891AtA2 = c1890At8.A00;
                long j2 = c1891AtA2.A00;
                Au3 au3 = c1891AtA2.A02;
                A05(at02, new At0(au3, string, A00(c1891AtA2.A01, au3), c1891AtA2.A03, j2), c1890At8, z);
                return;
            }
        }
        boolean z2 = false;
        boolean zA1L = AnonymousClass002.A1L(c1890At8.A00.A02().A00.A00);
        String string2 = c1890At8.A00.toString();
        C1891AtA c1891AtA3 = c1890At8.A00;
        long j3 = c1891AtA3.A00;
        Au3 au32 = c1891AtA3.A02;
        At0 at03 = new At0(au32, string2, A00(c1891AtA3.A01, au32), c1891AtA3.A03, j3);
        if (interfaceC2143AzF == null) {
            if (zA1L && z) {
                z2 = true;
            }
            A05(at0, at03, c1890At8, z2);
            A03(c1890At8.A00.A02(), at0, at03, c1890At8, num);
            return;
        }
        C1891AtA c1891AtA4 = new C1891AtA(at03, at0, c1890At8.A00.A02());
        interfaceC2143AzF.transformInput(c1891AtA4);
        boolean zA11 = AbstractC2159Azp.A11(c1891AtA4.A05, at03);
        boolean z3 = !zA11;
        boolean zA1M = AnonymousClass002.A1M((c1891AtA4.A00 > at03.A00 ? 1 : (c1891AtA4.A00 == at03.A00 ? 0 : -1)));
        boolean z4 = !zA1M;
        if (zA11 && zA1M) {
            A05(at0, C1891AtA.A00(c1891AtA4, at03.A01, 13), c1890At8, z);
        } else {
            A04(c1891AtA4, c1890At8, z3, z4);
        }
        A03(c1891AtA4.A02(), at0, (At0) mutableState.getValue(), c1890At8, num);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.InterfaceC2158Azo r22, X.At0 r23, X.At0 r24, X.C1890At8 r25, java.lang.Integer r26) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1890At8.A03(X.Azo, X.At0, X.At0, X.At8, java.lang.Integer):void");
    }

    public static final void A04(C1891AtA c1891AtA, C1890At8 c1890At8, boolean z, boolean z2) {
        At0 at0A00 = C1891AtA.A00(c1890At8.A00, null, 15);
        if (z) {
            At0 at0 = new At0(null, c1891AtA.toString(), null, null, c1891AtA.A00);
            c1890At8.A00 = new C1891AtA(at0, at0, null);
        } else if (!z2) {
            if (!C7384Etj.areEqual(at0A00.A01, c1891AtA.A02)) {
            }
            A05(at0A00, C1891AtA.A00(c1890At8.A00, null, 15), c1890At8, true);
        } else {
            C1891AtA c1891AtA2 = c1890At8.A00;
            long j = c1891AtA.A00;
            c1891AtA2.A04(AbstractC1815ArZ.A00(C8j3.A0G(j), AnonymousClass002.A09(j)));
        }
        c1890At8.A00.A03();
        A05(at0A00, C1891AtA.A00(c1890At8.A00, null, 15), c1890At8, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.At0 r17, X.At0 r18, X.C1890At8 r19, boolean r20) {
        /*
            r7 = r19
            androidx.compose.runtime.MutableState r0 = r7.A05
            r8 = r18
            r0.Af8(r8)
            X.AHm<X.Azn> r0 = r7.A06
            T[] r10 = r0.A01
            int r6 = r0.A00
            r5 = 0
            r4 = 0
        L11:
            if (r4 >= r6) goto L73
            r1 = r10[r4]
            X.Azn r1 = (X.InterfaceC2157Azn) r1
            r11 = r17
            if (r20 == 0) goto L28
            java.lang.CharSequence r0 = r11.A02
            boolean r0 = X.AbstractC2159Azp.A11(r0, r8)
            if (r0 != 0) goto L28
            X.Au3 r0 = r11.A01
            r12 = 1
            if (r0 != 0) goto L29
        L28:
            r12 = 0
        L29:
            X.Ayd r1 = (X.C2113Ayd) r1
            X.AzZ r9 = r1.A00
            long r2 = r11.A00
            X.Au3 r13 = r11.A01
            long r0 = r8.A00
            X.Au3 r11 = r8.A01
            if (r12 == 0) goto L45
            X.Awo r9 = (X.AbstractC2034Awo) r9
            android.view.inputmethod.InputMethodManager r1 = r9.A00()
            android.view.View r0 = r9.A01
            r1.restartInput(r0)
        L42:
            int r4 = r4 + 1
            goto L11
        L45:
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L4f
            boolean r2 = X.C7384Etj.areEqual(r13, r11)
            if (r2 != 0) goto L42
        L4f:
            int r13 = X.Au3.A02(r0)
            int r14 = X.Au3.A01(r0)
            r16 = -1
            if (r11 == 0) goto L71
            long r0 = r11.A00
            int r15 = X.Au3.A02(r0)
            int r16 = X.Au3.A01(r0)
        L65:
            X.Awo r9 = (X.AbstractC2034Awo) r9
            android.view.inputmethod.InputMethodManager r11 = r9.A00()
            android.view.View r12 = r9.A01
            r11.updateSelection(r12, r13, r14, r15, r16)
            goto L42
        L71:
            r15 = -1
            goto L65
        L73:
            A06(r7, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1890At8.A05(X.At0, X.At0, X.At8, boolean):void");
    }

    public static final void A06(C1890At8 c1890At8, boolean z) {
        MutableState.A09(z, c1890At8.A04);
    }

    public final CharSequence A07() {
        return ((At0) this.A05.getValue()).A02;
    }

    public final String toString() {
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            StringBuilder sbA0x = C60O.A0x("TextFieldState(selection=");
            MutableState mutableState = this.A05;
            sbA0x.append((Object) Au3.A03(((At0) mutableState.getValue()).A00));
            sbA0x.append(", text=\"");
            sbA0x.append((Object) ((At0) mutableState.getValue()).A02);
            return AnonymousClass001.A0v("\")", sbA0x);
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
        }
    }
}
