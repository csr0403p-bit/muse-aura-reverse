package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1453AjM implements InterfaceC1147Ac5, AlS, BKv, InterfaceC1516AkQ, AnW, InterfaceC1494Ak1 {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public InterfaceC1492Ajz A04;
    public C0910AHm<C1453AjM> A05;
    public BRg A06;
    public BRg A07;
    public C1369Ahv A08;
    public InterfaceC1380AiA A09;
    public C1453AjM A0A;
    public C1453AjM A0B;
    public AbstractC1387AiH A0C;
    public InterfaceC1464AjX A0D;
    public InterfaceC1079AXi A0E;
    public AXN A0F;
    public EnumC1820Arj A0G;
    public C1634An9 A0H;
    public Integer A0I;
    public G0U<? super InterfaceC1464AjX, Unit> A0J;
    public G0U<? super InterfaceC1464AjX, Unit> A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public int A0Y;
    public C1381AiB A0Z;
    public C0919AHv A0a;
    public Integer A0b;
    public boolean A0c;
    public final C1459AjS A0d;
    public final C1368Ahu<C1453AjM> A0e;
    public final C1438Aj7 A0f;
    public final boolean A0g;
    public final C0910AHm<C1453AjM> A0h;
    public static final AYK A0k = new AYJ();
    public static final Function0<C1453AjM> A0j = new BUS(16);
    public static final InterfaceC1079AXi A0l = new C1488Ajv();
    public static final Comparator<C1453AjM> A0i = new BSF(6);

    public final void A0T(int i, int i2) {
        if (i2 < 0) {
            throw C60O.A0i(FGI.A0I("count (", i2, ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            C1368Ahu<C1453AjM> c1368Ahu = this.A0e;
            C0910AHm<C1453AjM> c0910AHm = c1368Ahu.A00;
            A06(c0910AHm.A01[i3]);
            c0910AHm.A07(i3);
            c1368Ahu.A01.invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public static final C1381AiB A00(C1453AjM c1453AjM) {
        C1381AiB c1381AiB = c1453AjM.A0Z;
        if (c1381AiB != null) {
            return c1381AiB;
        }
        C1381AiB c1381AiB2 = new C1381AiB(c1453AjM.A09, c1453AjM);
        c1453AjM.A0Z = c1381AiB2;
        return c1381AiB2;
    }

    private final void A02() {
        AbstractC1460AjT abstractC1460AjT;
        InterfaceC1464AjX interfaceC1464AjX = this.A0D;
        if (interfaceC1464AjX == null) {
            C1453AjM c1453AjMA0E = A0E();
            throw C3cG.A0Q(FGI.A0M("Cannot detach node that is already detached!  Tree: ", c1453AjMA0E != null ? c1453AjMA0E.A01(0) : null));
        }
        C1453AjM c1453AjMA0E2 = A0E();
        if (c1453AjMA0E2 != null) {
            c1453AjMA0E2.A0I();
            c1453AjMA0E2.A0K();
            C1459AjS c1459AjS = this.A0d;
            C1454AjN c1454AjN = c1459AjS.A0G;
            Integer num = C79.A0C;
            c1454AjN.A0A = num;
            C1455AjO c1455AjO = c1459AjS.A04;
            if (c1455AjO != null) {
                c1455AjO.A07 = num;
            }
        }
        C1459AjS c1459AjS2 = this.A0d;
        C1454AjN c1454AjN2 = c1459AjS2.A0G;
        AbstractC1460AjT abstractC1460AjT2 = c1454AjN2.A0S;
        abstractC1460AjT2.A01 = true;
        abstractC1460AjT2.A06 = false;
        abstractC1460AjT2.A02 = false;
        abstractC1460AjT2.A05 = false;
        abstractC1460AjT2.A04 = false;
        abstractC1460AjT2.A03 = false;
        abstractC1460AjT2.A00 = null;
        C1455AjO c1455AjO2 = c1459AjS2.A04;
        if (c1455AjO2 != null && (abstractC1460AjT = c1455AjO2.A0J) != null) {
            abstractC1460AjT.A01 = true;
            abstractC1460AjT.A06 = false;
            abstractC1460AjT.A02 = false;
            abstractC1460AjT.A05 = false;
            abstractC1460AjT.A04 = false;
            abstractC1460AjT.A03 = false;
            abstractC1460AjT.A00 = null;
        }
        C1438Aj7 c1438Aj7 = this.A0f;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1438Aj7.A07).A08;
        for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04; !C7384Etj.areEqual(abstractC1387AiH2, abstractC1387AiH) && abstractC1387AiH2 != null; abstractC1387AiH2 = abstractC1387AiH2.A08) {
            abstractC1387AiH2.A0r();
            if (abstractC1387AiH2.A0P.A0d.A0G.A0G) {
                abstractC1387AiH2.A0q();
            }
        }
        G0U<? super InterfaceC1464AjX, Unit> g0u = this.A0K;
        if (g0u != null) {
            g0u.invoke(interfaceC1464AjX);
        }
        AbstractC1439Aj8 abstractC1439Aj8 = c1438Aj7.A06;
        while (abstractC1439Aj8 != null) {
            if (abstractC1439Aj8.isAttached) {
                abstractC1439Aj8.runDetachLifecycle$ui();
            }
            abstractC1439Aj8 = abstractC1439Aj8.parent;
        }
        this.A0O = true;
        C0910AHm<C1453AjM> c0910AHm = this.A0e.A00;
        C1453AjM[] c1453AjMArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            c1453AjMArr[i2].A02();
        }
        this.A0O = false;
        for (AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.parent) {
            if (abstractC1439Aj82.isAttached) {
                abstractC1439Aj82.markAsDetached$ui();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1464AjX;
        androidComposeView.A0Z.A07(this.A02);
        C1456AjP c1456AjP = androidComposeView.A0p;
        C1470Ajd c1470Ajd = c1456AjP.A05;
        c1470Ajd.A01.A00(this);
        c1470Ajd.A02.A00(this);
        c1470Ajd.A00.A00(this);
        c1456AjP.A07.A01.A0I(this);
        androidComposeView.A0F = true;
        C1558AlO c1558AlO = androidComposeView.A0e;
        if (c1558AlO != null) {
            Aeh aeh = c1558AlO.A02;
            int i3 = this.A02;
            if (aeh.A08(i3)) {
                c1558AlO.A03.ARV(c1558AlO.A05, i3, false);
            }
        }
        androidComposeView.A12.A07(this);
        this.A0D = null;
        A07(null);
        this.A00 = 0;
        c1454AjN2.A03 = Integer.MAX_VALUE;
        c1454AjN2.A04 = Integer.MAX_VALUE;
        c1454AjN2.A0G = false;
        C1455AjO c1455AjO3 = c1459AjS2.A04;
        if (c1455AjO3 != null) {
            c1455AjO3.A00 = Integer.MAX_VALUE;
            c1455AjO3.A01 = Integer.MAX_VALUE;
            c1455AjO3.A06 = C79.A0C;
        }
        if (c1438Aj7.A09(8)) {
            C0919AHv c0919AHv = this.A0a;
            this.A0a = null;
            this.A0S = false;
            androidComposeView.A11.A01(c0919AHv, this);
            interfaceC1464AjX.AVj();
        }
    }

    private final void A03() {
        C1453AjM c1453AjM;
        if (this.A0Y > 0) {
            this.A0X = true;
        }
        if (!this.A0g || (c1453AjM = this.A0A) == null) {
            return;
        }
        c1453AjM.A03();
    }

    private final void A04() {
        AbstractC1439Aj8 abstractC1439Aj8 = this.A0f.A06;
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8;
        while (abstractC1439Aj8 != null) {
            if (abstractC1439Aj8.isAttached) {
                abstractC1439Aj8.reset$ui();
            }
            abstractC1439Aj8 = abstractC1439Aj8.parent;
        }
        for (AbstractC1439Aj8 abstractC1439Aj83 = abstractC1439Aj82; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.parent) {
            if (abstractC1439Aj83.isAttached) {
                abstractC1439Aj83.runDetachLifecycle$ui();
            }
        }
        while (abstractC1439Aj82 != null) {
            if (abstractC1439Aj82.isAttached) {
                abstractC1439Aj82.markAsDetached$ui();
            }
            abstractC1439Aj82 = abstractC1439Aj82.parent;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
    
        if (r11 >= r13) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a2, code lost:
    
        if (r9 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a4, code lost:
    
        if (r12 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r4.A08.A07 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        X.C1438Aj7.A04(r9, r8, r12, r4, r11, !r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
    
        r16 = "structuralUpdate requires a non-null tail";
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00eb A[PHI: r1
  0x00eb: PHI (r1v4 boolean) = (r1v3 boolean), (r1v9 boolean) binds: [B:44:0x00c3, B:46:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(X.BRg r24) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453AjM.A05(X.BRg):void");
    }

    private final void A06(C1453AjM c1453AjM) {
        if (c1453AjM.A0d.A00 > 0) {
            this.A0d.A03(r1.A00 - 1);
        }
        if (this.A0D != null) {
            c1453AjM.A02();
        }
        c1453AjM.A0A = null;
        if (c1453AjM.A01 > 0) {
            A0S(this.A01 - 1);
        }
        c1453AjM.A0f.A04.A09 = null;
        if (c1453AjM.A0g) {
            this.A0Y--;
            C0910AHm<C1453AjM> c0910AHm = c1453AjM.A0e.A00;
            C1453AjM[] c1453AjMArr = c0910AHm.A01;
            int i = c0910AHm.A00;
            for (int i2 = 0; i2 < i; i2++) {
                c1453AjMArr[i2].A0f.A04.A09 = null;
            }
        }
        A03();
        A0N();
    }

    private final void A07(C1453AjM c1453AjM) {
        if (C7384Etj.areEqual(c1453AjM, this.A0B)) {
            return;
        }
        this.A0B = c1453AjM;
        C1459AjS c1459AjS = this.A0d;
        if (c1453AjM != null) {
            if (c1459AjS.A04 == null) {
                c1459AjS.A04 = new C1455AjO(c1459AjS);
            }
            C1438Aj7 c1438Aj7 = this.A0f;
            AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1438Aj7.A07).A08;
            for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04; !C7384Etj.areEqual(abstractC1387AiH2, abstractC1387AiH) && abstractC1387AiH2 != null; abstractC1387AiH2 = abstractC1387AiH2.A08) {
                abstractC1387AiH2.A0s();
            }
        } else {
            c1459AjS.A04 = null;
            c1459AjS.A0C = false;
            c1459AjS.A0E = false;
        }
        A0K();
    }

    public static final void A08(C1453AjM c1453AjM) {
        c1453AjM.A0b = c1453AjM.A0I;
        c1453AjM.A0I = C79.A0C;
        C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM2 = c1453AjMArr[i2];
            if (c1453AjM2.A0I == C79.A01) {
                A08(c1453AjM2);
            }
        }
    }

    public static final void A09(C1453AjM c1453AjM) {
        C1459AjS c1459AjS = c1453AjM.A0d;
        Integer num = c1459AjS.A05;
        if (num.intValue() != 4) {
            throw C3cG.A0Q(FGI.A0M("Unexpected state ", AbstractC1477Ajk.A00(num)));
        }
        if (c1459AjS.A0E) {
            A0A(c1453AjM, true, true, true);
            return;
        }
        if (c1459AjS.A0C) {
            c1453AjM.A0b(true);
        }
        C1454AjN c1454AjN = c1459AjS.A0G;
        if (c1454AjN.A0L) {
            A0B(c1453AjM, true, true, true);
        } else if (c1454AjN.A0J) {
            c1453AjM.A0c(true);
        }
    }

    public static final void A0A(C1453AjM c1453AjM, boolean z, boolean z2, boolean z3) {
        C1453AjM c1453AjM2;
        C1453AjM c1453AjMA0E;
        C1470Ajd c1470Ajd;
        Integer num;
        C1453AjM c1453AjMA0E2;
        if (c1453AjM.A0B == null) {
            ASP.A01("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
            throw F60.createAndThrow();
        }
        InterfaceC1464AjX interfaceC1464AjX = c1453AjM.A0D;
        if (interfaceC1464AjX == null || c1453AjM.A0O || c1453AjM.A0g) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1464AjX;
        C1456AjP c1456AjP = androidComposeView.A0p;
        C1459AjS c1459AjS = c1453AjM.A0d;
        int iIntValue = c1459AjS.A05.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 0 || iIntValue == 3 || iIntValue == 2) {
                c1456AjP.A04.A0G(new C1478Ajl(c1453AjM, true, z));
            } else {
                if (iIntValue != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!c1459AjS.A0E || z) {
                    c1459AjS.A0E = true;
                    C1454AjN c1454AjN = c1459AjS.A0G;
                    c1454AjN.A0L = true;
                    if (!c1453AjM.A0R) {
                        Boolean bool = true;
                        if ((bool.equals(c1453AjM.A0F()) || C1456AjP.A06(c1453AjM)) && ((c1453AjMA0E = c1453AjM.A0E()) == null || !c1453AjMA0E.A0d.A0E)) {
                            c1470Ajd = c1456AjP.A05;
                            num = C79.A00;
                        } else {
                            if ((c1454AjN.A0G || C1456AjP.A07(c1453AjM)) && ((c1453AjMA0E2 = c1453AjM.A0E()) == null || !c1453AjMA0E2.A0d.A0G.A0L)) {
                                c1470Ajd = c1456AjP.A05;
                                num = C79.A0C;
                            }
                            if (!c1456AjP.A02 && z2) {
                                AndroidComposeView.A0D(c1453AjM, androidComposeView);
                            }
                        }
                        c1470Ajd.A01(c1453AjM, num);
                        if (!c1456AjP.A02) {
                            AndroidComposeView.A0D(c1453AjM, androidComposeView);
                        }
                    }
                }
            }
        }
        if (z3) {
            C1455AjO c1455AjO = c1459AjS.A04;
            C7384Etj.A0X(c1455AjO);
            C1453AjM c1453AjM3 = c1455AjO.A0K.A0F;
            C1453AjM c1453AjMA0E3 = c1453AjM3.A0E();
            Integer num2 = c1453AjM3.A0I;
            if (c1453AjMA0E3 == null || num2 == C79.A0C) {
                return;
            }
            do {
                c1453AjM2 = c1453AjMA0E3;
                if (c1453AjMA0E3.A0I != num2) {
                    break;
                } else {
                    c1453AjMA0E3 = c1453AjMA0E3.A0E();
                }
            } while (c1453AjMA0E3 != null);
            int iIntValue2 = num2.intValue();
            if (iIntValue2 == 0) {
                if (c1453AjM2.A0B != null) {
                    A0A(c1453AjM2, z, true, true);
                    return;
                } else {
                    A0B(c1453AjM2, z, true, true);
                    return;
                }
            }
            if (iIntValue2 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (c1453AjM2.A0B != null) {
                c1453AjM2.A0b(z);
            } else {
                c1453AjM2.A0c(z);
            }
        }
    }

    public static final void A0B(C1453AjM c1453AjM, boolean z, boolean z2, boolean z3) {
        InterfaceC1464AjX interfaceC1464AjX;
        C1453AjM c1453AjM2;
        if (c1453AjM.A0O || c1453AjM.A0g || (interfaceC1464AjX = c1453AjM.A0D) == null) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) interfaceC1464AjX;
        if (androidComposeView.A0p.A0D(c1453AjM, z) && z2) {
            AndroidComposeView.A0D(c1453AjM, androidComposeView);
        }
        if (z3) {
            C1453AjM c1453AjM3 = c1453AjM.A0d.A0G.A0T.A0F;
            C1453AjM c1453AjMA0E = c1453AjM3.A0E();
            Integer num = c1453AjM3.A0I;
            if (c1453AjMA0E == null || num == C79.A0C) {
                return;
            }
            do {
                c1453AjM2 = c1453AjMA0E;
                if (c1453AjMA0E.A0I != num) {
                    break;
                } else {
                    c1453AjMA0E = c1453AjMA0E.A0E();
                }
            } while (c1453AjMA0E != null);
            int iIntValue = num.intValue();
            if (iIntValue == 0) {
                A0B(c1453AjM2, z, true, true);
            } else {
                if (iIntValue != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                c1453AjM2.A0c(z);
            }
        }
    }

    public final C0910AHm<C1453AjM> A0C() {
        if (this.A0c) {
            C0910AHm<C1453AjM> c0910AHm = this.A0h;
            c0910AHm.A09();
            c0910AHm.A0C(A0D(), c0910AHm.A00);
            c0910AHm.A0D(A0i);
            this.A0c = false;
        }
        return this.A0h;
    }

    public final C1453AjM A0E() {
        do {
            this = this.A0A;
            if (this == null) {
                break;
            }
        } while (this.A0g);
        return this;
    }

    public final Boolean A0F() {
        C1455AjO c1455AjO = this.A0d.A04;
        if (c1455AjO != null) {
            return Boolean.valueOf(c1455AjO.A06 != C79.A0C);
        }
        return null;
    }

    public final List<C3TG> A0G() {
        C1455AjO c1455AjO = this.A0d.A04;
        C7384Etj.A0X(c1455AjO);
        C1453AjM c1453AjM = c1455AjO.A0K.A0F;
        c1453AjM.A0D().A08();
        boolean z = c1455AjO.A0A;
        C0910AHm<C1455AjO> c0910AHm = c1455AjO.A0I;
        if (z) {
            C0910AHm<C1453AjM> c0910AHmA0D = c1453AjM.A0D();
            C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
            int i = c0910AHmA0D.A00;
            for (int i2 = 0; i2 < i; i2++) {
                C1453AjM c1453AjM2 = c1453AjMArr[i2];
                int i3 = c0910AHm.A00;
                C1455AjO c1455AjO2 = c1453AjM2.A0d.A04;
                if (i3 <= i2) {
                    C7384Etj.A0X(c1455AjO2);
                    c0910AHm.A0G(c1455AjO2);
                } else {
                    C7384Etj.A0X(c1455AjO2);
                    c0910AHm.A01[i2] = c1455AjO2;
                }
            }
            c0910AHm.A0A(c1453AjM.A0D().A08().size(), c0910AHm.A00);
            c1455AjO.A0A = false;
        }
        return c0910AHm.A08();
    }

    public final void A0H() {
        this.A0b = this.A0I;
        Integer num = C79.A0C;
        this.A0I = num;
        C0910AHm<C1453AjM> c0910AHmA0D = A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM = c1453AjMArr[i2];
            if (c1453AjM.A0I != num) {
                c1453AjM.A0H();
            }
        }
    }

    public final void A0I() {
        if (this.A0P) {
            C1438Aj7 c1438Aj7 = this.A0f;
            AbstractC1387AiH abstractC1387AiH = c1438Aj7.A07;
            AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04.A09;
            this.A0C = null;
            while (true) {
                if (C7384Etj.areEqual(abstractC1387AiH, abstractC1387AiH2)) {
                    break;
                }
                if (abstractC1387AiH == null) {
                    abstractC1387AiH = null;
                } else {
                    if (abstractC1387AiH.A0A != null) {
                        this.A0C = abstractC1387AiH;
                        break;
                    }
                    abstractC1387AiH = abstractC1387AiH.A09;
                }
            }
            this.A0P = false;
        }
        AbstractC1387AiH abstractC1387AiH3 = this.A0C;
        if (abstractC1387AiH3 != null) {
            if (abstractC1387AiH3.A0A == null) {
                throw C3cG.A0Q("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
            }
            abstractC1387AiH3.A0n();
            return;
        }
        C1453AjM c1453AjMA0E = A0E();
        if (c1453AjMA0E != null) {
            c1453AjMA0E.A0I();
            return;
        }
        Object obj = this.A0D;
        if (obj != null) {
            ((View) obj).invalidate();
        }
    }

    public final void A0J() {
        C1438Aj7 c1438Aj7 = this.A0f;
        Ai8 ai8 = c1438Aj7.A07;
        for (AbstractC1387AiH abstractC1387AiH = c1438Aj7.A04; abstractC1387AiH != ai8; abstractC1387AiH = abstractC1387AiH.A08) {
            C7384Etj.A0Z(abstractC1387AiH, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            InterfaceC1402AiX interfaceC1402AiX = abstractC1387AiH.A0A;
            if (interfaceC1402AiX != null) {
                interfaceC1402AiX.invalidate();
            }
        }
        InterfaceC1402AiX interfaceC1402AiX2 = ai8.A0A;
        if (interfaceC1402AiX2 != null) {
            interfaceC1402AiX2.invalidate();
        }
    }

    public final void A0K() {
        if (this.A0g) {
            C1453AjM c1453AjMA0E = A0E();
            if (c1453AjMA0E != null) {
                c1453AjMA0E.A0K();
                return;
            }
            return;
        }
        if (this.A0B != null) {
            A0A(this, false, true, true);
        } else {
            A0B(this, false, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.AHv] */
    public final void A0L() {
        if (this.A0Q) {
            return;
        }
        if (this.A0f.A09.child != null || this.A07 != null) {
            this.A0S = true;
            return;
        }
        C0919AHv c0919AHv = this.A0a;
        this.A0Q = true;
        C10543Hqv c10543Hqv = new C10543Hqv();
        c10543Hqv.element = new C0919AHv();
        C1481Ajo c1481Ajo = ((AndroidComposeView) AbstractC1333AhK.A00(this)).A0q;
        c1481Ajo.A00.A03(this, new C2335BUj(5, c10543Hqv, this), c1481Ajo.A07);
        this.A0Q = false;
        this.A0a = (C0919AHv) c10543Hqv.element;
        this.A0S = false;
        InterfaceC1464AjX interfaceC1464AjXA00 = AbstractC1333AhK.A00(this);
        ((AndroidComposeView) interfaceC1464AjXA00).A11.A01(c0919AHv, this);
        interfaceC1464AjXA00.AVj();
    }

    public final void A0M() {
        C1453AjM c1453AjMA0E;
        Integer num = this.A0I;
        Integer num2 = C79.A0C;
        if (num == num2) {
            A08(this);
        }
        C1455AjO c1455AjO = this.A0d.A04;
        C7384Etj.A0X(c1455AjO);
        try {
            c1455AjO.A0G = true;
            if (!c1455AjO.A0F) {
                ASP.A01("replace() called on item that was not placed");
                throw F60.createAndThrow();
            }
            c1455AjO.A0D = false;
            boolean zA1Z = AnonymousClass006.A1Z(c1455AjO.A06, num2);
            C1455AjO.A05(c1455AjO.A04, c1455AjO, c1455AjO.A09, c1455AjO.A02);
            if (zA1Z && !c1455AjO.A0D && (c1453AjMA0E = c1455AjO.A0K.A0F.A0E()) != null) {
                c1453AjMA0E.A0b(false);
            }
        } finally {
            c1455AjO.A0G = false;
        }
    }

    public final void A0N() {
        if (!this.A0g) {
            this.A0c = true;
            return;
        }
        C1453AjM c1453AjMA0E = A0E();
        if (c1453AjMA0E != null) {
            c1453AjMA0E.A0N();
        }
    }

    public final void A0O() {
        C1368Ahu<C1453AjM> c1368Ahu = this.A0e;
        C0910AHm<C1453AjM> c0910AHm = c1368Ahu.A00;
        int i = c0910AHm.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                c0910AHm.A09();
                c1368Ahu.A01.invoke();
                return;
            }
            A06(c0910AHm.A01[i]);
        }
    }

    public final void A0P() {
        C1453AjM c1453AjMA0E;
        if (this.A0I == C79.A0C) {
            A08(this);
        }
        C1454AjN c1454AjN = this.A0d.A0G;
        try {
            c1454AjN.A0Q = true;
            if (!c1454AjN.A0P) {
                ASP.A01("replace called on unplaced item");
                throw F60.createAndThrow();
            }
            boolean z = c1454AjN.A0G;
            long j = c1454AjN.A05;
            C1454AjN.A05(c1454AjN.A08, c1454AjN, c1454AjN.A0C, c1454AjN.A00, j);
            if (z && !c1454AjN.A0N && (c1453AjMA0E = c1454AjN.A0T.A0F.A0E()) != null) {
                c1453AjMA0E.A0c(false);
            }
        } finally {
        }
    }

    public final void A0R() {
        if (this.A0Y <= 0 || !this.A0X) {
            return;
        }
        this.A0X = false;
        C0910AHm<C1453AjM> c0910AHm = this.A05;
        if (c0910AHm == null) {
            c0910AHm = new C0910AHm<>(0, new C1453AjM[16]);
            this.A05 = c0910AHm;
        }
        c0910AHm.A09();
        C0910AHm<C1453AjM> c0910AHm2 = this.A0e.A00;
        C1453AjM[] c1453AjMArr = c0910AHm2.A01;
        int i = c0910AHm2.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM = c1453AjMArr[i2];
            if (c1453AjM.A0g) {
                c0910AHm.A0C(c1453AjM.A0D(), c0910AHm.A00);
            } else {
                c0910AHm.A0G(c1453AjM);
            }
        }
        C1459AjS c1459AjS = this.A0d;
        c1459AjS.A0G.A0E = true;
        C1455AjO c1455AjO = c1459AjS.A04;
        if (c1455AjO != null) {
            c1455AjO.A0A = true;
        }
    }

    public final void A0S(int i) {
        C1453AjM c1453AjMA0E;
        int i2;
        int i3 = this.A01;
        if (i3 != i) {
            if (i > 0) {
                if (i3 == 0 && (c1453AjMA0E = A0E()) != null) {
                    i2 = c1453AjMA0E.A01 + 1;
                    c1453AjMA0E.A0S(i2);
                }
            } else if (i == 0 && i3 > 0 && (c1453AjMA0E = A0E()) != null) {
                i2 = c1453AjMA0E.A01 - 1;
                c1453AjMA0E.A0S(i2);
            }
            this.A01 = i;
        }
    }

    public final void A0U(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                C1368Ahu<C1453AjM> c1368Ahu = this.A0e;
                C0910AHm<C1453AjM> c0910AHm = c1368Ahu.A00;
                C1453AjM c1453AjMA07 = c0910AHm.A07(i5);
                Function0<Unit> function0 = c1368Ahu.A01;
                function0.invoke();
                c0910AHm.A0B(i6, c1453AjMA07);
                function0.invoke();
            }
            A0N();
            A03();
            A0K();
        }
    }

    public final void A0V(C1453AjM c1453AjM, int i) {
        if (c1453AjM.A0A != null && c1453AjM.A0D != null) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(c1453AjM);
            sb.append(" because it already has a parent or an owner. This tree: ");
            sb.append(A01(0));
            sb.append(" Other tree: ");
            C1453AjM c1453AjM2 = c1453AjM.A0A;
            sb.append(c1453AjM2 != null ? c1453AjM2.A01(0) : null);
            ASP.A01(sb.toString());
            throw F60.createAndThrow();
        }
        c1453AjM.A0A = this;
        C1368Ahu<C1453AjM> c1368Ahu = this.A0e;
        c1368Ahu.A00.A0B(i, c1453AjM);
        c1368Ahu.A01.invoke();
        A0N();
        if (c1453AjM.A0g) {
            this.A0Y++;
        }
        A03();
        InterfaceC1464AjX interfaceC1464AjX = this.A0D;
        if (interfaceC1464AjX != null) {
            c1453AjM.A0X(interfaceC1464AjX);
        }
        if (c1453AjM.A0d.A00 > 0) {
            C1459AjS c1459AjS = this.A0d;
            c1459AjS.A03(c1459AjS.A00 + 1);
        }
        if (c1453AjM.A01 > 0) {
            A0S(this.A01 + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0W(X.AbstractC1387AiH r10) {
        /*
            r9 = this;
            X.AjX r0 = r9.A0D
            if (r0 == 0) goto L87
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            X.AjQ r8 = r0.A12
        L8:
            X.AjS r7 = r9.A0d
            java.lang.Integer r1 = r7.A05
            java.lang.Integer r0 = X.C79.A0P
            r5 = 0
            r4 = 1
            if (r1 != r0) goto L1d
            X.AjN r1 = r7.A0G
            boolean r0 = r1.A0L
            if (r0 != 0) goto L1d
            boolean r0 = r1.A0J
            r3 = 0
            if (r0 == 0) goto L1e
        L1d:
            r3 = 1
        L1e:
            boolean r0 = r9.A0L
            if (r0 == 0) goto L31
            if (r8 == 0) goto L31
            X.Aj7 r0 = r9.A0f
            X.AiH r0 = r0.A04
            if (r10 != r0) goto L37
            r9.A0W = r4
            if (r3 != 0) goto L31
            r8.A06(r9)
        L31:
            X.AjN r0 = r7.A0G
            r0.A0e()
            return
        L37:
            r9.A0V = r4
            X.AHm r0 = r9.A0D()
            T[] r2 = r0.A01
            int r1 = r0.A00
        L41:
            if (r5 >= r1) goto L51
            r0 = r2[r5]
            X.AjM r0 = (X.C1453AjM) r0
            r0.A0W = r4
            if (r3 != 0) goto L4e
            r8.A06(r0)
        L4e:
            int r5 = r5 + 1
            goto L41
        L51:
            boolean r0 = r9.A0L
            if (r0 == 0) goto L80
            r8.A01 = r4
            X.AjW r0 = r8.A07
            int r10 = r9.A02
            r3 = 33554431(0x1ffffff, float:9.403954E-38)
            r10 = r10 & r3
            long[] r9 = r0.A01
            int r2 = r0.A00
            r1 = 0
        L64:
            int r0 = r9.length
            int r0 = r0 + (-2)
            if (r1 >= r0) goto L80
            if (r1 >= r2) goto L80
            int r6 = r1 + 2
            r4 = r9[r6]
            int r0 = (int) r4
            r0 = r0 & r3
            if (r0 != r10) goto L84
            r0 = 63
            long r2 = r4 >> r0
            r0 = 1
            long r2 = r2 & r0
            r0 = 60
            long r2 = r2 << r0
            long r2 = r2 | r4
            r9[r6] = r2
        L80:
            X.C1457AjQ.A03(r8)
            goto L31
        L84:
            int r1 = r1 + 3
            goto L64
        L87:
            r8 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453AjM.A0W(X.AiH):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X(X.InterfaceC1464AjX r9) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453AjM.A0X(X.AjX):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [X.Aj8] */
    public final void A0Y(InterfaceC1079AXi interfaceC1079AXi) {
        if (C7384Etj.areEqual(this.A0E, interfaceC1079AXi)) {
            return;
        }
        this.A0E = interfaceC1079AXi;
        AbstractC1439Aj8 abstractC1439Aj8 = this.A0f.A02;
        if ((abstractC1439Aj8.aggregateChildKindSet & 16) != 0) {
            do {
                if ((abstractC1439Aj8.kindSet & 16) != 0) {
                    AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj8;
                    C0910AHm c0910AHm = null;
                    do {
                        if (abstractC1437Aj6A00 instanceof InterfaceC1348AhZ) {
                            ((InterfaceC1348AhZ) abstractC1437Aj6A00).onViewConfigurationChange();
                        } else if ((abstractC1437Aj6A00.kindSet & 16) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                            AbstractC1439Aj8 abstractC1439Aj82 = abstractC1437Aj6A00.A00;
                            int i = 0;
                            abstractC1437Aj6A00 = abstractC1437Aj6A00;
                            while (abstractC1439Aj82 != null) {
                                if ((abstractC1439Aj82.kindSet & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC1437Aj6A00 = abstractC1439Aj82;
                                    } else {
                                        if (c0910AHm == null) {
                                            c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                        }
                                        if (abstractC1437Aj6A00 != 0) {
                                            c0910AHm.A0G(abstractC1437Aj6A00);
                                            abstractC1437Aj6A00 = 0;
                                        }
                                        c0910AHm.A0G(abstractC1439Aj82);
                                    }
                                }
                                abstractC1439Aj82 = abstractC1439Aj82.child;
                                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                    } while (abstractC1437Aj6A00 != 0);
                }
                if ((abstractC1439Aj8.aggregateChildKindSet & 16) == 0) {
                    return;
                } else {
                    abstractC1439Aj8 = abstractC1439Aj8.child;
                }
            } while (abstractC1439Aj8 != null);
        }
    }

    public final void A0Z(AXN axn) {
        if (C7384Etj.areEqual(this.A0F, axn)) {
            return;
        }
        this.A0F = axn;
        A0K();
        C1453AjM c1453AjMA0E = A0E();
        if (c1453AjMA0E != null) {
            c1453AjMA0E.A0I();
        } else {
            Object obj = this.A0D;
            if (obj != null) {
                ((View) obj).invalidate();
            }
        }
        A0J();
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A0f.A02; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.onViewConfigurationChange();
        }
    }

    public final void A0a(Throwable th) throws Throwable {
        InterfaceC1490Ajx interfaceC1490Ajx = (InterfaceC1490Ajx) AKO.A08(AbstractC1540Akz.A00, (C0967AJu) this.A04);
        if (interfaceC1490Ajx == null) {
            throw th;
        }
        interfaceC1490Ajx.A4s(this, th);
        throw th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1.A0L != true) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(boolean r9) {
        /*
            r8 = this;
            boolean r0 = r8.A0g
            if (r0 != 0) goto L33
            X.AjX r3 = r8.A0D
            if (r3 == 0) goto L33
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            X.AjP r4 = r3.A0p
            r2 = 0
            X.AjS r6 = r8.A0d
            java.lang.Integer r0 = r6.A05
            int r1 = r0.intValue()
            r0 = 0
            r5 = 1
            if (r1 == r5) goto L33
            if (r1 == r0) goto L29
            r0 = 3
            if (r1 == r0) goto L33
            r0 = 2
            if (r1 == r0) goto L29
            r0 = 4
            if (r1 == r0) goto L29
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L29:
            boolean r0 = r6.A0E
            if (r0 != 0) goto L31
            boolean r0 = r6.A0C
            if (r0 == 0) goto L34
        L31:
            if (r9 != 0) goto L34
        L33:
            return
        L34:
            r6.A0C = r5
            r6.A0D = r5
            X.AjN r7 = r6.A0G
            r7.A0J = r5
            r7.A0K = r5
            boolean r0 = r8.A0R
            if (r0 != 0) goto L33
            X.AjM r6 = r8.A0E()
            java.lang.Boolean r0 = r8.A0F()
            boolean r0 = X.AnonymousClass002.A1b(r0, r5)
            if (r0 == 0) goto L5c
            if (r6 == 0) goto L7b
            X.AjS r1 = r6.A0d
            boolean r0 = r1.A0E
            if (r0 == r5) goto L5c
            boolean r0 = r1.A0C
            if (r0 != r5) goto L7b
        L5c:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L6e
            if (r6 == 0) goto L76
            X.AjS r0 = r6.A0d
            X.AjN r1 = r0.A0G
            boolean r0 = r1.A0J
            if (r0 == r5) goto L6e
            boolean r0 = r1.A0L
            if (r0 != r5) goto L76
        L6e:
            boolean r0 = r4.A02
            if (r0 != 0) goto L33
            androidx.compose.ui.platform.AndroidComposeView.A0D(r2, r3)
            return
        L76:
            X.Ajd r1 = r4.A05
            java.lang.Integer r0 = X.C79.A0K
            goto L7f
        L7b:
            X.Ajd r1 = r4.A05
            java.lang.Integer r0 = X.C79.A01
        L7f:
            r1.A01(r8, r0)
            goto L6e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453AjM.A0b(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0c(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.A0g
            if (r0 != 0) goto L48
            X.AjX r3 = r10.A0D
            if (r3 == 0) goto L48
            androidx.compose.ui.platform.AndroidComposeView r3 = (androidx.compose.ui.platform.AndroidComposeView) r3
            X.AjP r4 = r3.A0p
            r2 = 0
            X.AjS r9 = r10.A0d
            java.lang.Integer r0 = r9.A05
            int r1 = r0.intValue()
            r0 = 0
            r5 = 1
            if (r1 == r5) goto L48
            if (r1 == r0) goto L48
            r0 = 3
            if (r1 == r0) goto L48
            r0 = 2
            if (r1 == r0) goto L48
            r0 = 4
            if (r1 != r0) goto L77
            X.AjM r8 = r10.A0E()
            if (r8 == 0) goto L33
            X.AjS r0 = r8.A0d
            X.AjN r0 = r0.A0G
            boolean r0 = r0.A0G
            r7 = 0
            if (r0 == 0) goto L34
        L33:
            r7 = 1
        L34:
            if (r11 != 0) goto L49
            X.AjN r6 = r9.A0G
            boolean r0 = r6.A0L
            if (r0 != 0) goto L48
            boolean r0 = r6.A0J
            if (r0 == 0) goto L49
            boolean r1 = r6.A0G
            if (r1 != r7) goto L49
            boolean r0 = r6.A0H
            if (r1 != r0) goto L49
        L48:
            return
        L49:
            X.AjN r1 = r9.A0G
            r1.A0J = r5
            r1.A0K = r5
            boolean r0 = r10.A0R
            if (r0 != 0) goto L48
            boolean r0 = r1.A0H
            if (r0 == 0) goto L48
            if (r7 == 0) goto L48
            if (r8 == 0) goto L6f
            X.AjS r0 = r8.A0d
            X.AjN r1 = r0.A0G
            boolean r0 = r1.A0J
            if (r0 == r5) goto L67
            boolean r0 = r1.A0L
            if (r0 != r5) goto L6f
        L67:
            boolean r0 = r4.A02
            if (r0 != 0) goto L48
            androidx.compose.ui.platform.AndroidComposeView.A0D(r2, r3)
            return
        L6f:
            X.Ajd r1 = r4.A05
            java.lang.Integer r0 = X.C79.A0K
            r1.A01(r10, r0)
            goto L67
        L77:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1453AjM.A0c(boolean):void");
    }

    @Override // X.InterfaceC1147Ac5
    public final void ABn() {
        boolean z;
        if (this.A0B != null) {
            z = true;
            A0A(this, false, false, true);
        } else {
            z = true;
            A0B(this, false, false, true);
        }
        C1454AjN c1454AjN = this.A0d.A0G;
        Constraints constraints = c1454AjN.A0M ? new Constraints(((AZE) c1454AjN).A04) : null;
        InterfaceC1464AjX interfaceC1464AjX = this.A0D;
        if (constraints != null) {
            if (interfaceC1464AjX != null) {
                interfaceC1464AjX.AQY(this, constraints.A00);
            }
        } else if (interfaceC1464AjX != null) {
            interfaceC1464AjX.AQX(z);
        }
    }

    @Override // X.AlS
    public final C0919AHv AKL() {
        if (this.A0D == null || this.A0R || !this.A0f.A09(8)) {
            return null;
        }
        return this.A0a;
    }

    @Override // X.AnW
    public final boolean APE() {
        return this.A0D != null;
    }

    @Override // X.BKv
    public final void ASU() {
        C1634An9 c1634An9 = this.A0H;
        if (c1634An9 != null) {
            c1634An9.ASU();
        }
        C1369Ahv c1369Ahv = this.A08;
        if (c1369Ahv != null) {
            C1369Ahv.A09(c1369Ahv, true);
        }
        this.A0R = true;
        A04();
        InterfaceC1464AjX interfaceC1464AjX = this.A0D;
        if (interfaceC1464AjX != null) {
            this.A0a = null;
            this.A0S = false;
            C1558AlO c1558AlO = ((AndroidComposeView) interfaceC1464AjX).A0e;
            if (c1558AlO != null) {
                Aeh aeh = c1558AlO.A02;
                int i = this.A02;
                if (aeh.A08(i)) {
                    c1558AlO.A03.ARV(c1558AlO.A05, i, false);
                }
            }
        }
    }

    @Override // X.BKv
    public final void AVE() {
        C1634An9 c1634An9 = this.A0H;
        if (c1634An9 != null) {
            c1634An9.AVE();
        }
        C1369Ahv c1369Ahv = this.A08;
        if (c1369Ahv != null) {
            c1369Ahv.AVE();
        }
        C1438Aj7 c1438Aj7 = this.A0f;
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1387AiH) c1438Aj7.A07).A08;
        for (AbstractC1387AiH abstractC1387AiH2 = c1438Aj7.A04; !C7384Etj.areEqual(abstractC1387AiH2, abstractC1387AiH) && abstractC1387AiH2 != null; abstractC1387AiH2 = abstractC1387AiH2.A08) {
            abstractC1387AiH2.A0J = true;
            abstractC1387AiH2.A0Q.invoke();
            abstractC1387AiH2.A0r();
            if (abstractC1387AiH2.A01 != 0) {
                abstractC1387AiH2.A0P.A0W(abstractC1387AiH2);
            }
        }
    }

    @Override // X.BKv
    public final void AVb() {
        C1457AjQ c1457AjQ;
        C1558AlO c1558AlO;
        C1457AjQ c1457AjQ2;
        if (this.A0D == null) {
            throw C60O.A0i("onReuse is only expected on attached node");
        }
        C1634An9 c1634An9 = this.A0H;
        if (c1634An9 != null) {
            c1634An9.AVb();
        }
        C1369Ahv c1369Ahv = this.A08;
        if (c1369Ahv != null) {
            C1369Ahv.A09(c1369Ahv, false);
        }
        this.A0Q = false;
        if (this.A0R) {
            this.A0R = false;
        } else {
            A04();
        }
        int i = this.A02;
        InterfaceC1464AjX interfaceC1464AjX = this.A0D;
        if (interfaceC1464AjX != null && (c1457AjQ2 = ((AndroidComposeView) interfaceC1464AjX).A12) != null) {
            c1457AjQ2.A07(this);
        }
        int iAddAndGet = ARD.A00.addAndGet(1);
        this.A02 = iAddAndGet;
        InterfaceC1464AjX interfaceC1464AjX2 = this.A0D;
        if (interfaceC1464AjX2 != null) {
            Ab2<C1453AjM> ab2 = ((AndroidComposeView) interfaceC1464AjX2).A0Z;
            ab2.A07(i);
            ab2.A0B(iAddAndGet, this);
        }
        C1438Aj7 c1438Aj7 = this.A0f;
        for (AbstractC1439Aj8 abstractC1439Aj8 = c1438Aj7.A02; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.markAsAttached$ui();
        }
        c1438Aj7.A07();
        if (c1438Aj7.A09(8)) {
            A0L();
        }
        A09(this);
        InterfaceC1464AjX interfaceC1464AjX3 = this.A0D;
        if (interfaceC1464AjX3 != null && (c1558AlO = ((AndroidComposeView) interfaceC1464AjX3).A0e) != null) {
            Aeh aeh = c1558AlO.A02;
            if (aeh.A08(i)) {
                c1558AlO.A03.ARV(c1558AlO.A05, i, false);
            }
            C0919AHv c0919AHvAKL = AKL();
            if (c0919AHvAKL != null && c0919AHvAKL.A03.A06(AbstractC1671Anw.A04)) {
                aeh.A07(this.A02);
                c1558AlO.A03.ARV(c1558AlO.A05, this.A02, true);
            }
        }
        InterfaceC1464AjX interfaceC1464AjX4 = this.A0D;
        if (interfaceC1464AjX4 == null || (c1457AjQ = ((AndroidComposeView) interfaceC1464AjX4).A12) == null) {
            return;
        }
        c1457AjQ.A06(this);
    }

    @Override // X.InterfaceC1516AkQ
    public final void Adi(InterfaceC1380AiA interfaceC1380AiA) {
        if (C7384Etj.areEqual(this.A09, interfaceC1380AiA)) {
            return;
        }
        this.A09 = interfaceC1380AiA;
        C1381AiB c1381AiB = this.A0Z;
        if (c1381AiB != null) {
            c1381AiB.A00.Af8(interfaceC1380AiA);
        }
        A0K();
    }

    @Override // X.InterfaceC1516AkQ
    public final void Adn(BRg bRg) {
        String str;
        if (this.A0g && this.A06 != BRg.A00) {
            str = "Modifiers are not supported on virtual LayoutNodes";
        } else {
            if (!this.A0R) {
                if (this.A0D == null) {
                    this.A07 = bRg;
                    return;
                }
                A05(bRg);
                if (this.A0S) {
                    A0L();
                    return;
                }
                return;
            }
            str = "modifier is updated when deactivated";
        }
        throw C60O.A0i(str);
    }

    public C1453AjM(boolean z, int i) {
        this.A0g = z;
        this.A02 = i;
        this.A03 = 9223372034707292159L;
        this.A0V = true;
        this.A0W = true;
        this.A0e = new C1368Ahu<>(new C0910AHm(0, new C1453AjM[16]), new C2328BUc(this, 16));
        this.A0h = new C0910AHm<>(0, new C1453AjM[16]);
        this.A0c = true;
        this.A09 = A0k;
        this.A0F = AbstractC1333AhK.A00;
        this.A0G = EnumC1820Arj.A02;
        this.A0E = A0l;
        this.A04 = C1480Ajn.A00;
        Integer num = C79.A0C;
        this.A0I = num;
        this.A0b = num;
        this.A0f = new C1438Aj7(this);
        this.A0d = new C1459AjS(this);
        this.A0P = true;
        this.A06 = BRg.A00;
    }

    private final String A01(int i) {
        StringBuilder sbA0w = C60O.A0w();
        for (int i2 = 0; i2 < i; i2++) {
            sbA0w.append("  ");
        }
        sbA0w.append("|-");
        sbA0w.append(toString());
        sbA0w.append('\n');
        C0910AHm<C1453AjM> c0910AHmA0D = A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i3 = c0910AHmA0D.A00;
        for (int i4 = 0; i4 < i3; i4++) {
            sbA0w.append(c1453AjMArr[i4].A01(i + 1));
        }
        String string = sbA0w.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final C0910AHm<C1453AjM> A0D() {
        A0R();
        if (this.A0Y == 0) {
            return this.A0e.A00;
        }
        C0910AHm<C1453AjM> c0910AHm = this.A05;
        C7384Etj.A0X(c0910AHm);
        return c0910AHm;
    }

    public final void A0Q() {
        C0910AHm<C1453AjM> c0910AHmA0D = A0D();
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        int i = c0910AHmA0D.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM = c1453AjMArr[i2];
            Integer num = c1453AjM.A0b;
            c1453AjM.A0I = num;
            if (num != C79.A0C) {
                c1453AjM.A0Q();
            }
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(AbstractC0867A6r.A00(this));
        sbA0w.append(" children: ");
        sbA0w.append(C0910AHm.A04(this).size());
        sbA0w.append(" measurePolicy: ");
        sbA0w.append(this.A09);
        sbA0w.append(" deactivated: ");
        sbA0w.append(this.A0R);
        return sbA0w.toString();
    }

    public C1453AjM() {
        this(false, ARD.A00.addAndGet(1));
    }
}
