package androidx.compose.foundation.text.input.internal.selection;

import X.AGE;
import X.AWp;
import X.AWv;
import X.AWx;
import X.AXN;
import X.AaC;
import X.AbstractC1703Aoi;
import X.AbstractC1769AqM;
import X.AbstractC1815ArZ;
import X.AbstractC1855AsS;
import X.AbstractC1882Asw;
import X.AbstractC1886At3;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.ApQ;
import X.At0;
import X.Au3;
import X.AuC;
import X.Av2;
import X.AvK;
import X.Ay9;
import X.BBP;
import X.BG8;
import X.BO7;
import X.BUD;
import X.C0910AHm;
import X.C0dx;
import X.C1085AXt;
import X.C1878Ass;
import X.C1881Asv;
import X.C1890At8;
import X.C1891AtA;
import X.C1940Aud;
import X.C1954Aus;
import X.C1958Aux;
import X.C1BO;
import X.C2025Awe;
import X.C2098AyN;
import X.C2135Az3;
import X.C2298BSy;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.EnumC10460Hji;
import X.EnumC1314Agz;
import X.EnumC1820Arj;
import X.InterfaceC1497Ak4;
import X.InterfaceC1961AvD;
import X.InterfaceC2026Awf;
import X.InterfaceC2143AzF;
import X.InterfaceC2153Azh;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.Clipboard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class TextFieldSelectionState {
    public int A00;
    public AWp A01;
    public C2098AyN A02;
    public InterfaceC2153Azh A03;
    public InterfaceC1961AvD A04;
    public C0dx A05;
    public Clipboard A06;
    public AXN A07;
    public Function0<? extends AbstractC1769AqM> A08;
    public Function0<Unit> A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final C1085AXt A0E;
    public final C1881Asv A0F;
    public final TransformedTextFieldState A0G;
    public final InterfaceC2026Awf A0H;
    public final MutableState A0I;
    public final MutableState A0J;
    public final MutableState A0K;
    public final MutableState A0L;
    public final MutableState A0M;
    public final MutableState A0N;
    public final MutableState A0O;
    public final MutableState A0P;
    public final C1BO A0Q;
    public final C3UX A0R;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.BO7] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r12, X.BRr r13, X.HtJ r14) {
        /*
            r6 = 6
            boolean r0 = r14 instanceof X.C2314BTo
            if (r0 == 0) goto L2b
            r7 = r14
            X.BTo r7 = (X.C2314BTo) r7
            int r0 = r7.$t
            if (r0 != r6) goto L2b
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r7.A00 = r2
        L17:
            java.lang.Object r5 = r7.A03
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 != r3) goto L35
            java.lang.Object r1 = r7.A02
            X.BO7 r1 = (X.BO7) r1
            java.lang.Object r2 = r7.A01
            X.BO7 r2 = (X.BO7) r2
            goto L31
        L2b:
            X.BTo r7 = new X.BTo
            r7.<init>(r12, r14, r6)
            goto L17
        L31:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L77
            goto L71
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r5)
            X.BO7 r2 = new X.BO7
            r2.<init>()
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.element = r0
            X.BO7 r1 = X.BO7.A00(r0)
            r0 = 5
            X.BTL r10 = new X.BTL     // Catch: java.lang.Throwable -> L77
            r10.<init>(r1, r2, r12, r0)     // Catch: java.lang.Throwable -> L77
            X.BTN r8 = new X.BTN     // Catch: java.lang.Throwable -> L77
            r8.<init>(r12, r2, r1, r6)     // Catch: java.lang.Throwable -> L77
            r0 = 7
            X.BTN r9 = new X.BTN     // Catch: java.lang.Throwable -> L77
            r9.<init>(r12, r2, r1, r0)     // Catch: java.lang.Throwable -> L77
            X.BTM r11 = new X.BTM     // Catch: java.lang.Throwable -> L77
            r11.<init>(r2, r12, r1, r3)     // Catch: java.lang.Throwable -> L77
            r7.A01 = r2     // Catch: java.lang.Throwable -> L77
            r7.A02 = r1     // Catch: java.lang.Throwable -> L77
            r7.A00 = r3     // Catch: java.lang.Throwable -> L77
            r6 = r13
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A0C(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L77
            if (r0 != r4) goto L71
            return r4
        L71:
            A07(r12, r2, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L77:
            r0 = move-exception
            A07(r12, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A04(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, X.BRr, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r17, X.BRr r18, X.HtJ r19, final boolean r20) {
        /*
            r3 = 2
            r4 = r19
            boolean r0 = r4 instanceof X.C2318BTs
            r8 = r17
            if (r0 == 0) goto L31
            r5 = r4
            X.BTs r5 = (X.C2318BTs) r5
            int r0 = r5.$t
            if (r0 != r3) goto L31
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r5.A00 = r2
        L1b:
            java.lang.Object r1 = r5.A04
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 != r3) goto Lac
            java.lang.Object r7 = r5.A03
            java.lang.Object r10 = r5.A02
            X.BO7 r10 = (X.BO7) r10
            java.lang.Object r9 = r5.A01
            X.BO7 r9 = (X.BO7) r9
            goto L37
        L31:
            X.BTs r5 = new X.BTs
            r5.<init>(r8, r4, r3)
            goto L1b
        L37:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L9f
            goto L91
        L3b:
            X.Hwg.A00(r1)
            X.BO7 r9 = new X.BO7
            r9.<init>()
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r9.element = r0
            X.BO7 r10 = new X.BO7
            r10.<init>()
            r0 = 0
            r10.element = r0
            r11 = r20
            if (r20 == 0) goto L5a
            X.AWv r7 = X.AWv.A04
            goto L5c
        L5a:
            X.AWv r7 = X.AWv.A03
        L5c:
            X.AwX r6 = new X.AwX     // Catch: java.lang.Throwable -> L9f
            r6.<init>()     // Catch: java.lang.Throwable -> L9f
            r0 = 8
            X.BTN r2 = new X.BTN     // Catch: java.lang.Throwable -> L9f
            r2.<init>(r8, r9, r10, r0)     // Catch: java.lang.Throwable -> L9f
            r1 = 5
            X.BTN r0 = new X.BTN     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r8, r9, r10, r1)     // Catch: java.lang.Throwable -> L9f
            X.At2 r12 = new X.At2     // Catch: java.lang.Throwable -> L9f
            r13 = r7
            r14 = r8
            r15 = r10
            r16 = r9
            r17 = r11
            r12.<init>()     // Catch: java.lang.Throwable -> L9f
            r5.A01 = r9     // Catch: java.lang.Throwable -> L9f
            r5.A02 = r10     // Catch: java.lang.Throwable -> L9f
            r5.A03 = r7     // Catch: java.lang.Throwable -> L9f
            r5.A00 = r3     // Catch: java.lang.Throwable -> L9f
            r11 = r18
            r15 = r6
            r16 = r12
            r12 = r5
            r13 = r2
            r14 = r0
            java.lang.Object r0 = androidx.compose.foundation.gestures.DragGestureDetectorKt.A0C(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r4) goto L91
            return r4
        L91:
            androidx.compose.runtime.MutableState r0 = r8.A0J
            java.lang.Object r0 = r0.getValue()
            if (r0 != r7) goto L9c
            A08(r8, r9, r10)
        L9c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L9f:
            r1 = move-exception
            androidx.compose.runtime.MutableState r0 = r8.A0J
            java.lang.Object r0 = r0.getValue()
            if (r0 != r7) goto Lb0
            A08(r8, r9, r10)
            throw r1
        Lac:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        Lb0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A05(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, X.BRr, X.HtJ, boolean):java.lang.Object");
    }

    public final void A0I() {
        this.A0J.Af8(null);
        AWx.A0G(this.A0L, 9205357640488583168L);
        AWx.A0G(this.A0N, 9205357640488583168L);
    }

    public final void A0J() {
        InterfaceC2026Awf interfaceC2026Awf = this.A0H;
        if (interfaceC2026Awf != null) {
            TransformedTextFieldState transformedTextFieldState = this.A0G;
            CharSequence charSequence = transformedTextFieldState.A07().A02;
            long jA01 = At0.A01(transformedTextFieldState);
            if (charSequence.length() <= 0 || Au3.A04(jA01)) {
                return;
            }
            C8j3.A1I(C79.A0K, new BUD(interfaceC2026Awf, this, charSequence, null, 5, jA01), this.A0R);
        }
    }

    public static final long A01(TextFieldSelectionState textFieldSelectionState, boolean z) {
        C1958Aux c1958AuxA01 = C1881Asv.A01(textFieldSelectionState.A0F);
        if (c1958AuxA01 == null) {
            return 0L;
        }
        long jA01 = At0.A01(textFieldSelectionState.A0G);
        return AbstractC1886At3.A00(c1958AuxA01, z ? C8j3.A0G(jA01) : AnonymousClass002.A09(jA01), z, Au3.A05(jA01));
    }

    public static final AaC A02(At0 at0, TextFieldSelectionState textFieldSelectionState, C1958Aux c1958Aux) {
        float f;
        float f2;
        long j = at0.A00;
        if (!Au3.A04(j)) {
            return AaC.A04;
        }
        AaC aaCA06 = c1958Aux.A06((int) (j >> 32));
        float fFloor = (float) Math.floor(textFieldSelectionState.A07.Ah4(2.0f));
        if (fFloor < 1.0f) {
            fFloor = 1.0f;
        }
        if (c1958Aux.A04.A07 == EnumC1820Arj.A02) {
            f = fFloor / 2.0f;
            f2 = aaCA06.A01 + f;
        } else {
            f = fFloor / 2.0f;
            f2 = aaCA06.A02 - f;
        }
        float f3 = ((int) (c1958Aux.A02 >> 32)) - f;
        if (f2 <= f3) {
            f3 = f2;
        }
        if (f3 < f) {
            f3 = f;
        }
        double d = f3;
        float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(d)) + 0.5f : (float) Math.rint(d);
        return C8j3.A0f(fFloor2 - f, aaCA06.A03, fFloor2 + f, aaCA06.A00);
    }

    public static final InterfaceC1497Ak4 A03(TextFieldSelectionState textFieldSelectionState) {
        InterfaceC1497Ak4 interfaceC1497Ak4A00 = C1881Asv.A00(textFieldSelectionState.A0F);
        if (interfaceC1497Ak4A00 == null || !interfaceC1497Ak4A00.isAttached()) {
            return null;
        }
        return interfaceC1497Ak4A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A06(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6, X.HtJ r7) {
        /*
            r3 = 17
            boolean r0 = r7 instanceof X.C2310BTk
            if (r0 == 0) goto L67
            r5 = r7
            X.BTk r5 = (X.C2310BTk) r5
            int r0 = r5.$t
            if (r0 != r3) goto L67
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r4 = r5.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 == r3) goto L46
            if (r0 != r1) goto L6d
            X.Hwg.A00(r4)
        L29:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L35
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r6.A0G
            java.lang.Integer r1 = X.C79.A0C
            r0 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.A04(r2, r4, r1, r0, r3)
        L35:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L38:
            X.Hwg.A00(r4)
            androidx.compose.ui.platform.Clipboard r0 = r6.A06
            r5.A00 = r3
            X.AsY r4 = X.C1856AsT.A01(r0)
            if (r4 != r2) goto L49
            return r2
        L46:
            X.Hwg.A00(r4)
        L49:
            X.AsY r4 = (X.C1860AsY) r4
            if (r4 == 0) goto L35
            r5.A00 = r1
            android.content.ClipData r1 = r4.A00
            r0 = 0
            android.content.ClipData$Item r0 = r1.getItemAt(r0)
            if (r0 == 0) goto L65
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L65
            java.lang.String r4 = r0.toString()
        L62:
            if (r4 != r2) goto L29
            return r2
        L65:
            r4 = 0
            goto L62
        L67:
            X.BTk r5 = new X.BTk
            r5.<init>(r6, r7, r3)
            goto L18
        L6d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A06(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, X.HtJ):java.lang.Object");
    }

    public static final void A07(TextFieldSelectionState textFieldSelectionState, BO7 bo7, BO7 bo72) {
        if ((bo7.element & 9223372034707292159L) != 9205357640488583168L) {
            bo7.element = 9205357640488583168L;
            bo72.element = 9205357640488583168L;
            textFieldSelectionState.A0I();
        }
    }

    public static final void A08(TextFieldSelectionState textFieldSelectionState, BO7 bo7, BO7 bo72) {
        if ((bo7.element & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.A0I();
            bo7.element = 9205357640488583168L;
            bo72.element = 0L;
            textFieldSelectionState.A00 = -1;
        }
    }

    public final long A09() {
        MutableState mutableState = this.A0L;
        if ((AWx.A07(mutableState) & 9223372034707292159L) == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        MutableState mutableState2 = this.A0N;
        if ((AWx.A07(mutableState2) & 9223372034707292159L) == 9205357640488583168L) {
            return AbstractC1882Asw.A00(this.A0F, AWx.A07(mutableState));
        }
        long jA07 = AWx.A07(mutableState);
        long jA072 = AWx.A07(mutableState2);
        InterfaceC1497Ak4 interfaceC1497Ak4A03 = A03(this);
        return AWx.A05(jA07, AWx.A04(jA072, interfaceC1497Ak4A03 != null ? interfaceC1497Ak4A03.APr(0L) : 9205357640488583168L));
    }

    public final long A0A(At0 at0, Ay9 ay9, C2135Az3 c2135Az3, int i, int i2, boolean z, boolean z2) {
        long j;
        boolean z3;
        long jA00;
        C0dx c0dx;
        int i3 = i2;
        long j2 = at0.A00;
        boolean z4 = (z2 || Au3.A04(j2)) ? false : true;
        C1958Aux c1958AuxA01 = C1881Asv.A01(this.A0F);
        if (c1958AuxA01 == null) {
            jA00 = Au3.A01;
        } else if (z4 || !C7384Etj.areEqual(ay9, C2025Awe.A00)) {
            int i4 = this.A00;
            if (z4) {
                j = j2;
                z3 = false;
            } else {
                j = Au3.A01;
                z3 = true;
            }
            C1954Aus c1954AusA00 = AvK.A00(c1958AuxA01, i, i3, i4, j, z3, z);
            if (!z4 || c1954AusA00.AfY(this.A04)) {
                C1940Aud c1940AudA44 = ay9.A44(c1954AusA00);
                jA00 = AbstractC1815ArZ.A00(c1940AudA44.A01.A00, c1940AudA44.A00.A00);
                this.A04 = c1954AusA00;
                if (z) {
                    i3 = i;
                }
                this.A00 = i3;
            } else {
                jA00 = j2;
            }
        } else {
            jA00 = AbstractC1815ArZ.A00(i, i3);
        }
        if (c2135Az3 != null && ((Au3.A02(jA00) != Au3.A02(j2) || Au3.A01(jA00) != Au3.A01(j2)) && (c0dx = this.A05) != null)) {
            c0dx.AXr(c2135Az3.A00);
        }
        return jA00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (X.AbstractC1703Aoi.A01(X.AbstractC1703Aoi.A00(r0), r1) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1878Ass A0B(boolean r7) {
        /*
            r6 = this;
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r0 = r6.A0G
            X.At0 r4 = r0.A07()
            androidx.compose.runtime.MutableState r0 = r6.A0M
            boolean r3 = androidx.compose.runtime.MutableState.A0A(r0)
            androidx.compose.runtime.MutableState r0 = r6.A0I
            java.lang.Object r1 = r0.getValue()
            X.Agz r0 = X.EnumC1314Agz.A03
            boolean r1 = X.AnonymousClass002.A1Z(r1, r0)
            androidx.compose.runtime.MutableState r0 = r6.A0J
            java.lang.Object r2 = r0.getValue()
            if (r3 == 0) goto L96
            if (r1 == 0) goto L96
            long r0 = r4.A00
            boolean r0 = X.Au3.A04(r0)
            if (r0 == 0) goto L96
            X.HxE<X.Ash, X.Au3> r0 = r4.A04
            if (r0 != 0) goto L96
            int r0 = r4.length()
            if (r0 <= 0) goto L96
            X.AWv r0 = X.AWv.A02
            if (r2 == r0) goto L70
            androidx.compose.runtime.snapshots.Snapshot r5 = androidx.compose.runtime.snapshots.Snapshot.A03()
            X.G0U r4 = X.C8j3.A1F(r5)
            androidx.compose.runtime.snapshots.Snapshot r3 = androidx.compose.runtime.snapshots.Snapshot.A04(r5)
            X.AaC r2 = r6.A0D()     // Catch: java.lang.Throwable -> L58
            float r1 = r2.A01     // Catch: java.lang.Throwable -> L58
            float r0 = r2.A02     // Catch: java.lang.Throwable -> L58
            float r0 = X.C8j3.A00(r0, r1)     // Catch: java.lang.Throwable -> L58
            float r1 = r1 + r0
            float r0 = r2.A00     // Catch: java.lang.Throwable -> L58
            long r1 = X.AnonymousClass005.A0J(r1, r0)     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            r0 = move-exception
            androidx.compose.runtime.snapshots.Snapshot.A07(r5, r3, r4)
            throw r0
        L5d:
            androidx.compose.runtime.snapshots.Snapshot.A07(r5, r3, r4)
            X.Ak4 r0 = A03(r6)
            if (r0 == 0) goto L96
            X.AaC r0 = X.AbstractC1703Aoi.A00(r0)
            boolean r0 = X.AbstractC1703Aoi.A01(r0, r1)
            if (r0 == 0) goto L96
        L70:
            if (r7 == 0) goto L90
            X.AaC r2 = r6.A0D()
            float r1 = r2.A01
            float r0 = r2.A02
            float r0 = X.C8j3.A00(r0, r1)
            float r1 = r1 + r0
            float r0 = r2.A00
            long r3 = X.AnonymousClass005.A0J(r1, r0)
        L85:
            java.lang.Integer r1 = X.C79.A00
            r5 = 1
            r2 = 0
            r6 = 0
            X.Ass r0 = new X.Ass
            r0.<init>(r1, r2, r3, r5, r6)
            return r0
        L90:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            goto L85
        L96:
            X.Ass r0 = X.C1878Ass.A05
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A0B(boolean):X.Ass");
    }

    public final C1878Ass A0C(boolean z, boolean z2) {
        InterfaceC1497Ak4 interfaceC1497Ak4A03;
        AWv aWv = z ? AWv.A04 : AWv.A03;
        C1958Aux c1958AuxA01 = C1881Asv.A01(this.A0F);
        if (c1958AuxA01 != null) {
            TransformedTextFieldState transformedTextFieldState = this.A0G;
            long jA01 = At0.A01(transformedTextFieldState);
            if (!Au3.A04(jA01)) {
                long jA012 = A01(this, z);
                if (this.A0I.getValue() == EnumC1314Agz.A03 && ((this.A0J.getValue() == aWv || ((interfaceC1497Ak4A03 = A03(this)) != null && AbstractC1703Aoi.A01(AbstractC1703Aoi.A00(interfaceC1497Ak4A03), jA012))) && transformedTextFieldState.A07().A04 == null)) {
                    Integer numA08 = c1958AuxA01.A08(z ? C8j3.A0G(jA01) : Math.max(AnonymousClass002.A09(jA01) - 1, 0));
                    boolean zA05 = Au3.A05(jA01);
                    if (z2) {
                        InterfaceC1497Ak4 interfaceC1497Ak4A032 = A03(this);
                        if (interfaceC1497Ak4A032 != null) {
                            jA012 = AbstractC1882Asw.A01(AbstractC1703Aoi.A00(interfaceC1497Ak4A032), jA012);
                        }
                    } else {
                        jA012 = 9205357640488583168L;
                    }
                    return new C1878Ass(numA08, Av2.A00(c1958AuxA01, z ? C8j3.A0G(jA01) : AnonymousClass002.A09(jA01)), jA012, true, zA05);
                }
            }
        }
        return C1878Ass.A05;
    }

    public final AaC A0D() {
        C1958Aux c1958AuxA01 = C1881Asv.A01(this.A0F);
        return c1958AuxA01 == null ? AaC.A04 : A02(this.A0G.A07(), this, c1958AuxA01);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0E(X.HtJ<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            r3 = 13
            boolean r0 = r9 instanceof X.C2312BTm
            if (r0 == 0) goto L2e
            r7 = r9
            X.BTm r7 = (X.C2312BTm) r7
            int r0 = r7.$t
            if (r0 != r3) goto L2e
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r7.A00 = r2
        L18:
            java.lang.Object r4 = r7.A02
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r7.A00
            r2 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L34
            if (r0 == r5) goto L98
            if (r0 == r6) goto L50
            if (r0 == r2) goto L98
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.BTm r7 = new X.BTm
            r7.<init>(r8, r9, r3)
            goto L18
        L34:
            X.Hwg.A00(r4)
            kotlin.jvm.functions.Function0<? extends X.AqM> r0 = r8.A08
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r0.invoke()
            X.AqM r1 = (X.AbstractC1769AqM) r1
            if (r1 == 0) goto L8f
            androidx.compose.ui.platform.Clipboard r0 = r8.A06
            r7.A01 = r1
            r7.A00 = r6
            X.AsY r4 = X.C1856AsT.A01(r0)
            if (r4 != r3) goto L57
            return r3
        L50:
            java.lang.Object r1 = r7.A01
            X.AqM r1 = (X.AbstractC1769AqM) r1
            X.Hwg.A00(r4)
        L57:
            X.AsY r4 = (X.C1860AsY) r4
            if (r4 != 0) goto L61
            r0 = 0
            r7.A01 = r0
            r7.A00 = r2
            goto L91
        L61:
            android.content.ClipData r0 = r4.A00
            android.content.ClipDescription r0 = r0.getDescription()
            X.Ayz r3 = new X.Ayz
            r3.<init>(r0)
            X.Awp r1 = (X.C2035Awp) r1
            X.AxT r2 = r1.A00
            r1 = 0
            X.Ax7 r0 = new X.Ax7
            r0.<init>(r1, r4, r3, r6)
            X.Ax7 r0 = r2.onReceive(r0)
            if (r0 == 0) goto L9b
            X.AsY r0 = r0.A02
            if (r0 == 0) goto L9b
            java.lang.String r3 = X.AbstractC1863Asc.A00(r0)
            if (r3 == 0) goto L9b
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r2 = r8.A0G
            java.lang.Integer r1 = X.C79.A0C
            r0 = 0
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.A04(r2, r3, r1, r0, r5)
            goto L9b
        L8f:
            r7.A00 = r5
        L91:
            java.lang.Object r0 = A06(r8, r7)
            if (r0 != r3) goto L9b
            return r3
        L98:
            X.Hwg.A00(r4)
        L9b:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A0E(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            r3 = 18
            boolean r0 = r7 instanceof X.C2310BTk
            if (r0 == 0) goto L24
            r5 = r7
            X.BTk r5 = (X.C2310BTk) r5
            int r0 = r5.$t
            if (r0 != r3) goto L24
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.A00 = r2
        L18:
            java.lang.Object r1 = r5.A01
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2e
            goto L2a
        L24:
            X.BTk r5 = new X.BTk
            r5.<init>(r6, r7, r3)
            goto L18
        L2a:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L5f
            goto L47
        L2e:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L33:
            X.Hwg.A00(r1)
            r2 = 0
            r1 = 35
            X.BU6 r0 = new X.BU6     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r6, r2, r1)     // Catch: java.lang.Throwable -> L5f
            r5.A00 = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = X.Hxb.A00(r0, r5)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r4) goto L47
            return r4
        L47:
            r1 = 0
            androidx.compose.runtime.MutableState r0 = r6.A0M
            androidx.compose.runtime.MutableState.A09(r1, r0)
            androidx.compose.runtime.MutableState r0 = r6.A0P
            java.lang.Object r1 = r0.getValue()
            X.BG8 r0 = X.BG8.A03
            if (r1 == r0) goto L5c
            X.AXt r0 = r6.A0E
            r0.A00()
        L5c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L5f:
            r2 = move-exception
            r1 = 0
            androidx.compose.runtime.MutableState r0 = r6.A0M
            androidx.compose.runtime.MutableState.A09(r1, r0)
            androidx.compose.runtime.MutableState r0 = r6.A0P
            java.lang.Object r1 = r0.getValue()
            X.BG8 r0 = X.BG8.A03
            if (r1 == r0) goto L75
            X.AXt r0 = r6.A0E
            r0.A00()
        L75:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A0F(X.HtJ):java.lang.Object");
    }

    public final Unit A0G() {
        TransformedTextFieldState transformedTextFieldState = this.A0G;
        if (!At0.A03(transformedTextFieldState) && this.A0A && !this.A0D && !this.A0C) {
            At0 at0A07 = transformedTextFieldState.A07();
            ApQ apQA0X = AnonymousClass005.A0X(At0.A02(at0A07, at0A07.A00));
            transformedTextFieldState.A09();
            Unit unitAd3 = this.A06.Ad3(AbstractC1855AsS.A00(apQA0X));
            if (unitAd3 == EnumC10460Hji.A02) {
                return unitAd3;
            }
        }
        return Unit.INSTANCE;
    }

    public final Unit A0H(boolean z) {
        TransformedTextFieldState transformedTextFieldState = this.A0G;
        if (!At0.A03(transformedTextFieldState) && !this.A0C) {
            At0 at0A07 = transformedTextFieldState.A07();
            ApQ apQA0X = AnonymousClass005.A0X(At0.A02(at0A07, at0A07.A00));
            if (z) {
                C1890At8 c1890At8 = transformedTextFieldState.A01;
                InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState.A00;
                Integer num = C79.A00;
                C0910AHm.A06(c1890At8);
                C1891AtA c1891AtA = c1890At8.A00;
                int iA01 = Au3.A01(c1891AtA.A00);
                AuC.A01(c1891AtA, iA01, iA01);
                C1890At8.A01(interfaceC2143AzF, c1890At8, num);
            }
            Unit unitAd3 = this.A06.Ad3(AbstractC1855AsS.A00(apQA0X));
            if (unitAd3 == EnumC10460Hji.A02) {
                return unitAd3;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K() {
        /*
            r2 = this;
            X.AyN r2 = r2.A02
            androidx.compose.ui.platform.Clipboard r0 = r2.A02
            X.AsV r0 = (X.C1858AsV) r0
            X.AsT r1 = r0.A00
            android.content.ClipboardManager r0 = X.C1856AsT.A00(r1)
            boolean r0 = r0.hasPrimaryClip()
            r2.A00 = r0
            if (r0 == 0) goto L2a
            android.content.ClipboardManager r0 = X.C1856AsT.A00(r1)
            android.content.ClipDescription r1 = r0.getPrimaryClipDescription()
            if (r1 == 0) goto L2a
            java.lang.String r0 = "text/*"
            boolean r1 = r1.hasMimeType(r0)
            r0 = 1
            if (r1 != r0) goto L2a
        L27:
            r2.A01 = r0
            return
        L2a:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A0K():void");
    }

    public final void A0L(AWv aWv, long j) {
        this.A0J.Af8(aWv);
        AWx.A0G(this.A0L, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0M(long r12) {
        /*
            r11 = this;
            X.Asv r0 = r11.A0F
            X.Aux r8 = X.C1881Asv.A01(r0)
            r5 = 0
            if (r8 == 0) goto L8b
            X.Auv r0 = r8.A03
            int r1 = r0.A0B(r12)
            r0 = -1
            if (r1 == r0) goto L8b
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState r6 = r11.A0G
            X.1BO<X.AuA> r0 = r6.A04
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r0.getValue()
            X.AuA r0 = (X.AuA) r0
            if (r0 == 0) goto Lb5
            X.Au2 r0 = r0.A01
            long r2 = X.Au2.A01(r0, r1, r5)
        L26:
            long r10 = r6.A06(r2)
            boolean r1 = X.Au3.A04(r2)
            if (r1 == 0) goto La2
            boolean r0 = X.Au3.A04(r10)
            if (r0 == 0) goto La2
            java.lang.Integer r0 = X.C79.A00
        L38:
            int r9 = r0.intValue()
            r4 = 1
            r1 = 0
            if (r9 == r5) goto L65
            r0 = 3
            if (r9 == r0) goto L65
            int r0 = X.C8j3.A0G(r10)
            X.AaC r7 = r8.A06(r0)
            int r0 = X.AnonymousClass002.A09(r10)
            X.AaC r0 = r8.A06(r0)
            float r8 = A00(r7, r12)
            float r7 = A00(r0, r12)
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 == r4) goto L91
            if (r0 == 0) goto L8c
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 >= 0) goto L8c
        L65:
            int r0 = X.C8j3.A0G(r2)
        L69:
            long r2 = X.AbstractC1815ArZ.A00(r0, r0)
            X.At8 r0 = r6.A01
            androidx.compose.runtime.MutableState r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.At0 r0 = (X.At0) r0
            long r7 = r0.A00
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 != 0) goto Lbb
            if (r1 == 0) goto L8b
            androidx.compose.runtime.MutableState r0 = r6.A03
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lbb
        L8b:
            return r5
        L8c:
            int r0 = X.AnonymousClass002.A09(r2)
            goto L69
        L91:
            if (r0 == 0) goto L9f
            int r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r0 >= 0) goto L9f
            java.lang.Integer r0 = X.C79.A00
        L99:
            X.AwZ r1 = new X.AwZ
            r1.<init>(r0, r0)
            goto L65
        L9f:
            java.lang.Integer r0 = X.C79.A01
            goto L99
        La2:
            boolean r0 = X.Au3.A04(r10)
            if (r1 != 0) goto Lad
            if (r0 != 0) goto Lb2
            java.lang.Integer r0 = X.C79.A0C
            goto L38
        Lad:
            if (r0 != 0) goto Lb2
            java.lang.Integer r0 = X.C79.A01
            goto L38
        Lb2:
            java.lang.Integer r0 = X.C79.A0K
            goto L38
        Lb5:
            long r2 = X.AbstractC1815ArZ.A00(r1, r1)
            goto L26
        Lbb:
            r6.A0A(r2)
            if (r1 == 0) goto Lc5
            androidx.compose.runtime.MutableState r0 = r6.A03
            r0.Af8(r1)
        Lc5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.A0M(long):boolean");
    }

    public TextFieldSelectionState(C1085AXt c1085AXt, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, InterfaceC2026Awf interfaceC2026Awf, Clipboard clipboard, AXN axn, C3UX c3ux, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0G = transformedTextFieldState;
        this.A0F = c1881Asv;
        this.A07 = axn;
        this.A0B = z3;
        this.A0C = z4;
        this.A0E = c1085AXt;
        this.A0R = c3ux;
        this.A0H = interfaceC2026Awf;
        this.A06 = clipboard;
        this.A0A = z;
        this.A0D = z2;
        Boolean boolA0i = AnonymousClass001.A0i();
        AGE age = AGE.A00;
        this.A0K = C3cG.A08(age, boolA0i);
        this.A0N = AWx.A0A(age, 9205357640488583168L);
        this.A0L = AWx.A0A(age, 9205357640488583168L);
        this.A0J = C3cG.A08(age, null);
        this.A0I = C3cG.A08(age, EnumC1314Agz.A03);
        Boolean boolA0h = AnonymousClass001.A0h();
        this.A0M = C3cG.A08(age, boolA0h);
        this.A0P = C3cG.A08(age, BG8.A03);
        this.A0O = C3cG.A08(age, boolA0h);
        this.A00 = -1;
        this.A0Q = BBP.A0A(C2298BSy.A00(this, 45));
        this.A02 = new C2098AyN(this.A06);
    }

    public static final float A00(AaC aaC, long j) {
        if (AbstractC1703Aoi.A01(aaC, j)) {
            return 0.0f;
        }
        float f = aaC.A01;
        float f2 = aaC.A03;
        long jA04 = AWx.A04(AnonymousClass005.A0J(f, f2), j);
        float fA03 = AnonymousClass003.A03(jA04);
        float fA00 = AnonymousClass004.A00(jA04);
        float f3 = (fA03 * fA03) + (fA00 * fA00);
        if (f3 >= Float.MAX_VALUE) {
            f3 = Float.MAX_VALUE;
        }
        long jA0P = C8j3.A0P(aaC.A02) << 32;
        long jA042 = AWx.A04((C8j3.A0P(f2) & 4294967295L) | jA0P, j);
        float fA032 = AnonymousClass003.A03(jA042);
        float fA002 = AnonymousClass004.A00(jA042);
        float f4 = (fA032 * fA032) + (fA002 * fA002);
        if (f4 < f3) {
            f3 = f4;
        }
        float f5 = aaC.A00;
        long jA0P2 = C8j3.A0P(f);
        long jA0P3 = C8j3.A0P(f5) & 4294967295L;
        long jA043 = AWx.A04(jA0P3 | (jA0P2 << 32), j);
        float fA033 = AnonymousClass003.A03(jA043);
        float fA003 = AnonymousClass004.A00(jA043);
        float f6 = (fA033 * fA033) + (fA003 * fA003);
        if (f6 < f3) {
            f3 = f6;
        }
        long jA044 = AWx.A04(jA0P3 | jA0P, j);
        float fA034 = AnonymousClass003.A03(jA044);
        float fA004 = AnonymousClass004.A00(jA044);
        float f7 = (fA034 * fA034) + (fA004 * fA004);
        return f7 >= f3 ? f3 : f7;
    }
}
