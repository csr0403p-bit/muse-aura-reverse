package X;

import android.view.KeyEvent;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Asl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1871Asl extends AbstractC1437Aj6 implements InterfaceC1348AhZ, InterfaceC1476Ajj, InterfaceC1527Akg, InterfaceC1219Aex, InterfaceC1403AiY, InterfaceC1449AjI, InterfaceC1332AhJ, InterfaceC1487Aju, InterfaceC1451AjK, C1Z2, InterfaceC1738Apb {
    public InterfaceC1072AWd A00;
    public AuJ A01;
    public InterfaceC2143AzF A02;
    public C1wU A03;
    public C1881Asv A04;
    public TransformedTextFieldState A05;
    public TextFieldSelectionState A06;
    public C60K A07;
    public HoC A08;
    public HoC A09;
    public C3Em<Unit> A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Aen A0F;
    public final MutableState A0G;
    public final SuspendingPointerInputModifierNode A0H;
    public final Function0<AbstractC1769AqM> A0I;
    public final AwQ A0J;
    public final C1666Anp A0K;
    public final InterfaceC1760AqD A0L;
    public final G0U<? super EnumC10381HaL, ? extends Unit> A0M;

    public static final boolean A04(C1871Asl c1871Asl, int i) {
        C0Hi c0Hi;
        int i2;
        if (AnonymousClass002.A1Q(i, 6)) {
            c0Hi = (C0Hi) ARZ.A01(Am0.A05, c1871Asl);
            i2 = 1;
        } else {
            if (i != 5) {
                if (i != 7) {
                    return false;
                }
                A00(c1871Asl).hide();
                return true;
            }
            c0Hi = (C0Hi) ARZ.A01(Am0.A05, c1871Asl);
            i2 = 2;
        }
        ((C1517AkR) c0Hi).AQv(i2, true);
        return true;
    }

    public static final C1C3 A00(C1871Asl c1871Asl) {
        C1C3 c1c3 = (C1C3) ARZ.A01(Am0.A0E, c1871Asl);
        if (c1c3 != null) {
            return c1c3;
        }
        throw C3cG.A0Q("No software keyboard controller");
    }

    public static final void A01(C1871Asl c1871Asl) {
        C1wU c1wU = c1871Asl.A03;
        if (c1wU != null) {
            C8j3.A1J(c1871Asl.A00, new C1wT(c1wU));
            c1871Asl.A03 = null;
        }
    }

    public static final boolean A03(C1871Asl c1871Asl) {
        C60K c60k;
        return ((C1506AkD) c1871Asl.A0F.A04).A03().AOS() && (c60k = c1871Asl.A07) != null && MutableState.A0A(((C1584Alz) c60k).A02);
    }

    @Override // X.InterfaceC1449AjI
    public final void A4V(AkZ akZ) {
        AaC aaCAD1;
        InterfaceC1497Ak4 interfaceC1497Ak4;
        TextFieldSelectionState textFieldSelectionState = this.A06;
        C1881Asv c1881Asv = textFieldSelectionState.A0F;
        C1958Aux c1958AuxA01 = C1881Asv.A01(c1881Asv);
        if (c1958AuxA01 == null) {
            aaCAD1 = AaC.A04;
        } else if (textFieldSelectionState.A0B) {
            At0 at0A07 = textFieldSelectionState.A0G.A07();
            long j = at0A07.A00;
            if (Au3.A04(j)) {
                aaCAD1 = TextFieldSelectionState.A02(at0A07, textFieldSelectionState, c1958AuxA01);
            } else {
                int iA0G = C8j3.A0G(j);
                C1956Auv c1956Auv = c1958AuxA01.A03;
                int iA09 = c1956Auv.A09(iA0G);
                int iA092 = AnonymousClass002.A09(j);
                int iA093 = c1956Auv.A09(iA092);
                if (iA09 == iA093) {
                    float fA02 = c1958AuxA01.A02(iA0G, true);
                    float fA022 = c1958AuxA01.A02(iA092, true);
                    aaCAD1 = C8j3.A0f(Math.min(fA02, fA022), c1956Auv.A07(iA09), Math.max(fA02, fA022), c1956Auv.A06(iA093));
                } else {
                    aaCAD1 = c1958AuxA01.A07(Au3.A02(j), Au3.A01(j)).AD1();
                }
            }
            InterfaceC1497Ak4 interfaceC1497Ak4A00 = C1881Asv.A00(c1881Asv);
            if (interfaceC1497Ak4A00 != null && interfaceC1497Ak4A00.isAttached() && (interfaceC1497Ak4 = (InterfaceC1497Ak4) c1881Asv.A05.getValue()) != null && interfaceC1497Ak4.isAttached()) {
                AaC aaCAPk = interfaceC1497Ak4.APk(interfaceC1497Ak4A00, false);
                aaCAD1 = aaCAD1.A03(AnonymousClass005.A0J(aaCAPk.A01, aaCAPk.A03));
            }
        } else {
            aaCAD1 = C1509AkG.A00;
        }
        akZ.AdT(aaCAD1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    @Override // X.InterfaceC1476Ajj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A4Y(X.InterfaceC0857A6e r9) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1871Asl.A4Y(X.A6e):void");
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ ARP AJE() {
        return ARN.A00;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AKa() {
        return true;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1487Aju
    public final void ATW(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A04.A05.Af8(interfaceC1497Ak4);
        if (this.A0B) {
            this.A0F.ATW(interfaceC1497Ak4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f8 A[PHI: r2
  0x02f8: PHI (r2v49 long) = (r2v46 long), (r2v54 long) binds: [B:169:0x031d, B:160:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x031f A[PHI: r2
  0x031f: PHI (r2v47 long) = (r2v46 long), (r2v54 long) binds: [B:169:0x031d, B:160:0x02f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    @Override // X.InterfaceC1527Akg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ATl(android.view.KeyEvent r24) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1871Asl.ATl(android.view.KeyEvent):boolean");
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        AbstractC1441AjA.A00(this, C2298BSy.A00(this, 31));
    }

    @Override // X.InterfaceC1403AiY
    public final void AUZ(InterfaceC1497Ak4 interfaceC1497Ak4) {
        this.A0L.AUZ(interfaceC1497Ak4);
    }

    @Override // X.InterfaceC1527Akg
    public final boolean AUr(KeyEvent keyEvent) {
        TransformedTextFieldState transformedTextFieldState = this.A05;
        TextFieldSelectionState textFieldSelectionState = this.A06;
        ARZ.A01(Am0.A05, this);
        A00(this);
        if (At0.A03(transformedTextFieldState) || keyEvent.getKeyCode() != 4 || AbstractC1712Aov.A00(keyEvent) != 1) {
            return false;
        }
        TransformedTextFieldState transformedTextFieldState2 = textFieldSelectionState.A0G;
        if (!At0.A03(transformedTextFieldState2)) {
            C1890At8 c1890At8 = transformedTextFieldState2.A01;
            InterfaceC2143AzF interfaceC2143AzF = transformedTextFieldState2.A00;
            Integer num = C79.A00;
            C0910AHm.A06(c1890At8);
            C1891AtA c1891AtA = c1890At8.A00;
            int iA09 = AnonymousClass002.A09(c1891AtA.A00);
            AuC.A01(c1891AtA, iA09, iA09);
            C1890At8.A02(interfaceC2143AzF, c1890At8, num, true);
            C1890At8.A06(c1890At8, true);
        }
        MutableState.A09(false, textFieldSelectionState.A0M);
        textFieldSelectionState.A0P.Af8(BG8.A03);
        return true;
    }

    @Override // X.InterfaceC1403AiY, X.InterfaceC1407Aic
    public final void AVH(long j) {
        this.A0L.AVH(j);
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
        this.A0H.onViewConfigurationChange();
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        this.A08 = C3cI.A15(this.A08);
        C3Em<Unit> c3Em = this.A0A;
        if (c3Em != null) {
            c3Em.AbQ();
        }
        this.A06.A08 = null;
    }

    @Override // X.InterfaceC1332AhJ
    public final /* synthetic */ void onMeasureResultChanged() {
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY */
    public final void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        this.A0H.mo13onPointerEventH0pRuoY(c1247Afe, enumC1080AXj, j);
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public C1871Asl(InterfaceC1072AWd interfaceC1072AWd, AuJ auJ, InterfaceC2143AzF interfaceC2143AzF, C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, C3Em c3Em, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = transformedTextFieldState;
        this.A04 = c1881Asv;
        this.A06 = textFieldSelectionState;
        this.A02 = interfaceC2143AzF;
        this.A0B = z;
        this.A0D = z2;
        this.A01 = auJ;
        this.A0E = z3;
        this.A00 = interfaceC1072AWd;
        this.A0C = z4;
        this.A0A = c3Em;
        textFieldSelectionState.A09 = C2298BSy.A00(this, 33);
        this.A0F = new Aen(interfaceC1072AWd, C2294BSu.A00(this, 28), 1);
        BSJ bsj = new BSJ(this, 8);
        C1247Afe c1247Afe = AaM.A00;
        AaN aaN = new AaN(bsj, null, null, null);
        A0G(aaN);
        this.A0H = aaN;
        C2298BSy c2298BSyA00 = C2298BSy.A00(this, 35);
        C2296BSw c2296BSw = new C2296BSw(this, 7);
        C1756Aq9 c1756Aq9 = new C1756Aq9(new C2334BUi(10, C2294BSu.A00(c2298BSyA00, 39), new C1859AsW(C2294BSu.A00(this, 29), C2294BSu.A00(this, 30), C2294BSu.A00(this, 31), C2294BSu.A00(this, 32), C2294BSu.A00(this, 33), c2296BSw)));
        A0G(c1756Aq9);
        this.A0L = c1756Aq9;
        this.A0J = new AwQ(0);
        this.A0K = new C1666Anp(this);
        this.A0M = C2294BSu.A00(this, 34);
        this.A0I = C2298BSy.A00(this, 34);
        this.A0G = AbstractC1798ArH.A08(false);
    }

    public static final void A02(C1871Asl c1871Asl) {
        AbstractC1769AqM abstractC1769AqMA00 = AbstractC1767AqK.A00(c1871Asl);
        c1871Asl.A08 = AnonymousClass001.A11(BU6.A0M(c1871Asl, abstractC1769AqMA00, null, 29), c1871Asl.getCoroutineScope());
    }

    @Override // X.InterfaceC1219Aex
    public final /* synthetic */ Object AEO(ARR arr) {
        return AbstractC1218Aew.A00(this, arr);
    }

    @Override // X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
        if (MutableState.A0A(this.A0G)) {
            C1EQ c1326AhD = (C1EQ) ARZ.A01(AbstractC1995Aw4.A00, this);
            long j = ((B6A) ARZ.A01(AbstractC1995Aw4.A01, this)).A00;
            if (j != (1308617531 << 32)) {
                c1326AhD = new C1326AhD(j);
            }
            ART.A01(c1326AhD, c16z);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AUO();
        this.A06.A08 = this.A0I;
        if (this.A0B) {
            A0G(this.A0F);
        }
    }
}
