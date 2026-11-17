package androidx.compose.foundation.text.selection;

import X.AGE;
import X.AWx;
import X.AbstractC1815ArZ;
import X.AbstractC1886At3;
import X.AbstractC1929Atq;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.ApQ;
import X.Au3;
import X.Au8;
import X.BU2;
import X.BUL;
import X.C0dx;
import X.C1085AXt;
import X.C1518AkS;
import X.C1805ArO;
import X.C1896AtG;
import X.C1897AtH;
import X.C1912AtX;
import X.C1924Atl;
import X.C1939Auc;
import X.C1958Aux;
import X.C19h;
import X.C19i;
import X.C1JY;
import X.C2279BSf;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.HxE;
import X.InterfaceC1961AvD;
import X.InterfaceC2026Awf;
import X.InterfaceC2045AxD;
import X.InterfaceC2076Axr;
import X.InterfaceC2128Ayu;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.Clipboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class TextFieldSelectionManager {
    public int A00;
    public long A01;
    public long A02;
    public C1897AtH A03;
    public C1085AXt A04;
    public InterfaceC2026Awf A05;
    public C1518AkS A06;
    public C0dx A07;
    public Clipboard A08;
    public C1JY A09;
    public Au3 A0A;
    public Au3 A0B;
    public InterfaceC2128Ayu A0C;
    public C1805ArO A0D;
    public C19h A0E;
    public Function0<Unit> A0F;
    public G0U<? super C1805ArO, Unit> A0G;
    public C3UX A0H;
    public boolean A0I;
    public InterfaceC1961AvD A0J;
    public final InterfaceC2045AxD A0K;
    public final C1939Auc A0L;
    public final InterfaceC2076Axr A0M;
    public final MutableState A0N;
    public final MutableState A0O;
    public final MutableState A0P;
    public final MutableState A0Q;
    public final MutableState A0R;
    public final MutableState<C1805ArO> A0S;

    public static void A03(TextFieldSelectionManager textFieldSelectionManager) {
        textFieldSelectionManager.A0O.Af8(null);
        textFieldSelectionManager.A0N.Af8(null);
    }

    public static final void A04(TextFieldSelectionManager textFieldSelectionManager, Au3 au3) {
        InterfaceC2026Awf interfaceC2026Awf;
        C1897AtH c1897AtH;
        ApQ apQ;
        String str;
        C3UX c3ux;
        if (au3 == null || (interfaceC2026Awf = textFieldSelectionManager.A05) == null || (c1897AtH = textFieldSelectionManager.A03) == null || (apQ = c1897AtH.A01.A02) == null || (str = apQ.A00) == null) {
            return;
        }
        InterfaceC2128Ayu interfaceC2128Ayu = textFieldSelectionManager.A0C;
        long jA02 = AbstractC1815ArZ.A02(interfaceC2128Ayu, au3.A00);
        if (str.length() <= 0 || Au3.A04(jA02) || (c3ux = textFieldSelectionManager.A0H) == null) {
            return;
        }
        AnonymousClass001.A1J(new BUL(interfaceC2026Awf, textFieldSelectionManager, au3, interfaceC2128Ayu, str, null, 0, jA02), c3ux);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long A00(X.Ay9 r18, androidx.compose.foundation.text.selection.TextFieldSelectionManager r19, X.C2135Az3 r20, X.C1805ArO r21, long r22, boolean r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.A00(X.Ay9, androidx.compose.foundation.text.selection.TextFieldSelectionManager, X.Az3, X.ArO, long, boolean, boolean, boolean):long");
    }

    public static final HxE A01(TextFieldSelectionManager textFieldSelectionManager) {
        String str;
        Au3 au3;
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        ApQ apQ = c1897AtH != null ? c1897AtH.A01.A02 : null;
        if (apQ == null || (str = apQ.A00) == null || (au3 = textFieldSelectionManager.A0B) == null) {
            return null;
        }
        return C3cG.A0r(str, C8j3.A0j(AbstractC1815ArZ.A02(textFieldSelectionManager.A0C, au3.A00)));
    }

    public static final void A02(Au8 au8, TextFieldSelectionManager textFieldSelectionManager) {
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || c1897AtH.A0A.getValue() == au8) {
            return;
        }
        c1897AtH.A0A.Af8(au8);
    }

    public static final void A05(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH != null) {
            MutableState.A09(z, c1897AtH.A0I);
        }
        if (z) {
            textFieldSelectionManager.A0A();
        } else {
            textFieldSelectionManager.A04.A00();
        }
    }

    public final long A06(boolean z) {
        C1924Atl c1924AtlA00;
        ApQ apQ;
        C1897AtH c1897AtH = this.A03;
        if (c1897AtH == null || (c1924AtlA00 = C1897AtH.A00(c1897AtH)) == null) {
            return 9205357640488583168L;
        }
        C1958Aux c1958Aux = c1924AtlA00.A02;
        C1897AtH c1897AtH2 = this.A03;
        if (c1897AtH2 == null || (apQ = c1897AtH2.A01.A02) == null) {
            return 9205357640488583168L;
        }
        if (!C7384Etj.areEqual(apQ.A00, c1958Aux.A04.A03.A00)) {
            return 9205357640488583168L;
        }
        MutableState<C1805ArO> mutableState = this.A0S;
        long jA0O = C8j4.A0O(mutableState);
        return AbstractC1886At3.A00(c1958Aux, this.A0C.originalToTransformed(z ? C8j3.A0G(jA0O) : AnonymousClass002.A09(jA0O)), z, Au3.A05(C8j4.A0O(mutableState)));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(X.HtJ<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            r3 = 14
            boolean r0 = r6 instanceof X.C2312BTm
            if (r0 == 0) goto L5c
            r4 = r6
            X.BTm r4 = (X.C2312BTm) r4
            int r0 = r4.$t
            if (r0 != r3) goto L5c
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r4.A00 = r2
        L18:
            java.lang.Object r0 = r4.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L62
            java.lang.Object r5 = r4.A01
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r5 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r5
            X.Hwg.A00(r0)
        L2a:
            androidx.compose.runtime.MutableState r1 = r5.A0R
            r1.Af8(r0)
        L2f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L32:
            X.Hwg.A00(r0)
            androidx.compose.ui.platform.Clipboard r0 = r5.A08
            if (r0 == 0) goto L2f
            r4.A01 = r5
            r4.A00 = r2
            X.AsV r0 = (X.C1858AsV) r0
            X.AsT r0 = r0.A00
            android.content.ClipboardManager r0 = X.C1856AsT.A00(r0)
            android.content.ClipDescription r1 = r0.getPrimaryClipDescription()
            if (r1 == 0) goto L54
            java.lang.String r0 = "text/*"
            boolean r1 = r1.hasMimeType(r0)
            r0 = 1
            if (r1 == r2) goto L55
        L54:
            r0 = 0
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != r3) goto L2a
            return r3
        L5c:
            X.BTm r4 = new X.BTm
            r4.<init>(r5, r6, r3)
            goto L18
        L62:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager.A07(X.HtJ):java.lang.Object");
    }

    public final void A08() {
        C3UX c3ux = this.A0H;
        if (c3ux != null) {
            C8j3.A1I(C79.A0K, BU2.A0O(this, null, 43), c3ux);
        }
    }

    public final void A09() {
        C3UX c3ux = this.A0H;
        if (c3ux != null) {
            C8j3.A1I(C79.A0K, BU2.A0O(this, null, 44), c3ux);
        }
    }

    public final void A0B(AWx aWx) {
        MutableState<C1805ArO> mutableState = this.A0S;
        if (!Au3.A04(C8j4.A0O(mutableState))) {
            C1897AtH c1897AtH = this.A03;
            C1924Atl c1924AtlA00 = c1897AtH != null ? C1897AtH.A00(c1897AtH) : null;
            int iA01 = (aWx == null || c1924AtlA00 == null) ? Au3.A01(C8j4.A0O(mutableState)) : this.A0C.transformedToOriginal(c1924AtlA00.A01(aWx.A00, true));
            C1805ArO c1805ArOA0d = C8j4.A0d(mutableState);
            C1805ArO c1805ArO = new C1805ArO(c1805ArOA0d.A01, c1805ArOA0d.A02, AbstractC1815ArZ.A00(iA01, iA01));
            this.A0G.invoke(c1805ArO);
            this.A0B = C8j3.A0j(c1805ArO.A00);
        }
        A02((aWx == null || MutableState.A04((MutableState) mutableState).length() <= 0) ? Au8.A03 : Au8.A02, this);
        A05(this, false);
    }

    public final void A0C(boolean z) {
        C3UX c3ux = this.A0H;
        if (c3ux != null) {
            C8j3.A1I(C79.A0K, new TextFieldSelectionManager$copy$1(this, null, z), c3ux);
        }
    }

    public final void A0D(boolean z) {
        C1518AkS c1518AkS;
        C1897AtH c1897AtH = this.A03;
        if (c1897AtH != null && !MutableState.A0A(c1897AtH.A0B) && (c1518AkS = this.A06) != null) {
            C1518AkS.A00(c1518AkS);
        }
        this.A0D = C8j4.A0d(this.A0S);
        A05(this, z);
        A02(Au8.A04, this);
    }

    public TextFieldSelectionManager(C1939Auc c1939Auc) {
        this.A0L = c1939Auc;
        this.A0C = AbstractC1929Atq.A00;
        this.A0G = new C2279BSf(32);
        long j = Au3.A01;
        C1805ArO c1805ArO = new C1805ArO("", j);
        AGE age = AGE.A00;
        this.A0S = C3cG.A08(age, c1805ArO);
        this.A0E = C19i.A00;
        Boolean boolA0i = AnonymousClass001.A0i();
        this.A0P = C3cG.A08(age, boolA0i);
        this.A0Q = C3cG.A08(age, boolA0i);
        this.A01 = 0L;
        this.A02 = 0L;
        this.A0O = C3cG.A08(age, null);
        this.A0N = C3cG.A08(age, null);
        this.A00 = -1;
        this.A0D = new C1805ArO("", j);
        this.A0R = C3cG.A08(age, false);
        this.A04 = new C1085AXt(0);
        this.A0K = new C1896AtG(this);
        this.A0M = new C1912AtX(this);
    }

    public final void A0A() {
        Snapshot snapshotA03 = Snapshot.A03();
        G0U g0uA1F = C8j3.A1F(snapshotA03);
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            if (MutableState.A0A(this.A0Q)) {
                C1897AtH c1897AtH = this.A03;
                if (c1897AtH != null) {
                    if (!MutableState.A0A(c1897AtH.A0C)) {
                    }
                }
                Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
                this.A04.A01();
            }
        } finally {
            Snapshot.A07(snapshotA03, snapshotA04, g0uA1F);
        }
    }

    public TextFieldSelectionManager() {
        this(null);
    }
}
