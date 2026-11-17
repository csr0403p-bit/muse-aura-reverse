package X;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AX2 extends AbstractC1437Aj6 implements InterfaceC1348AhZ, InterfaceC1447AjG, InterfaceC1476Ajj, InterfaceC1237AfR, InterfaceC1527Akg, AX5, InterfaceC1451AjK, C1Z2 {
    public static final AX6 A0K = new AX6();
    public C3UH A00;
    public C04901Xt A01;
    public InterfaceC1072AWd A02;
    public InterfaceC1072AWd A03;
    public AWp A04;
    public AWp A05;
    public C1Z3 A06;
    public C1Z3 A07;
    public Function0<Unit> A08;
    public boolean A09;
    public boolean A0A;
    public C3UH A0C;
    public C1YD A0D;
    public String A0E;
    public HoC A0F;
    public boolean A0G;
    public final Aen A0I;
    public final Object A0J;
    public final AXI<AWp> A0H = AXJ.A00();
    public long A0B = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    public final void A0M(C1298Agj c1298Agj) {
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        if (interfaceC1072AWd != null) {
            AWp aWp = new AWp(c1298Agj.A02);
            F1F f1f = new F1F();
            AbstractC1235AfP.A01(this, AX4.A01, C2295BSv.A00((Object) BTA.A01(f1f, c1298Agj, 13), 6));
            if (!f1f.element) {
                long j = AbstractC1101AYm.A00;
                ?? A00 = AbstractC1329AhG.A00(this);
                do {
                    ViewParent parent = A00.getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        this.A04 = aWp;
                        AnonymousClass001.A1J(new BU6(interfaceC1072AWd, aWp, (InterfaceC1072AWd) null, (HtJ<? super BU6>) 6), getCoroutineScope());
                        return;
                    }
                    A00 = (ViewGroup) parent;
                } while (!A00.shouldDelayChildPressedState());
            }
            this.A0F = AnonymousClass001.A11(new BUC(this, aWp, interfaceC1072AWd, (AMS<AMN>) null, (HtJ<? super BUC>) 2), getCoroutineScope());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.ViewGroup] */
    public final void A0N(C1299Agk c1299Agk) {
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        if (interfaceC1072AWd != null) {
            AWp aWp = new AWp(c1299Agk.A0A);
            F1F f1f = new F1F();
            AbstractC1235AfP.A01(this, AX4.A01, C2295BSv.A00((Object) BTA.A01(f1f, c1299Agk, 14), 6));
            if (!f1f.element) {
                long j = AbstractC1101AYm.A00;
                ?? A00 = AbstractC1329AhG.A00(this);
                do {
                    ViewParent parent = A00.getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        this.A05 = aWp;
                        AnonymousClass001.A1J(new BU6(interfaceC1072AWd, aWp, (InterfaceC1072AWd) null, (HtJ<? super BU6>) 7), getCoroutineScope());
                        return;
                    }
                    A00 = (ViewGroup) parent;
                } while (!A00.shouldDelayChildPressedState());
            }
            this.A0F = AnonymousClass001.A11(new BUC(this, aWp, interfaceC1072AWd, (AMS<AMN>) null, (HtJ<? super BUC>) 3), getCoroutineScope());
        }
    }

    public void A0O(InterfaceC0857A6e interfaceC0857A6e) {
    }

    @Override // X.AX5
    public final /* synthetic */ boolean AOa(C1298Agj c1298Agj) {
        return false;
    }

    @Override // X.AX5
    public final /* synthetic */ boolean AOb(C1299Agk c1299Agk) {
        return false;
    }

    @Override // X.InterfaceC1527Akg
    public final boolean AUr(KeyEvent keyEvent) {
        return false;
    }

    public static final void A00(AX2 ax2) {
        if (ax2.A07 == null) {
            C3UH c3uh = ax2.A0G ? ax2.A00 : ax2.A0C;
            if (c3uh != null) {
                InterfaceC1072AWd c1qN = ax2.A02;
                if (c1qN == null) {
                    c1qN = new C1qN();
                    ax2.A02 = c1qN;
                }
                ax2.A0I.A0I(c1qN);
                InterfaceC1072AWd interfaceC1072AWd = ax2.A02;
                C7384Etj.A0X(interfaceC1072AWd);
                C1Z3 c1z3Create = c3uh.create(interfaceC1072AWd);
                ax2.A0G(c1z3Create);
                ax2.A07 = c1z3Create;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0J() {
        /*
            r16 = this;
            r10 = r16
            X.AWd r9 = r10.A02
            if (r9 == 0) goto L7d
            X.AWp r1 = r10.A05
            if (r1 == 0) goto L12
            X.AWl r0 = new X.AWl
            r0.<init>(r1)
            X.C8j3.A1J(r9, r0)
        L12:
            X.AWp r1 = r10.A04
            if (r1 == 0) goto L1e
            X.AWl r0 = new X.AWl
            r0.<init>(r1)
            X.C8j3.A1J(r9, r0)
        L1e:
            X.1Xt r1 = r10.A01
            if (r1 == 0) goto L2a
            X.ASE r0 = new X.ASE
            r0.<init>(r1)
            X.C8j3.A1J(r9, r0)
        L2a:
            X.AXI<X.AWp> r0 = r10.A0H
            java.lang.Object[] r8 = r0.A04
            long[] r7 = r0.A03
            int r0 = r7.length
            int r6 = r0 + (-2)
            if (r6 < 0) goto L7d
            r5 = 0
        L36:
            r15 = r7[r5]
            r3 = -1
            long r3 = r3 ^ r15
            r0 = 7
            long r3 = r3 << r0
            long r3 = r3 & r15
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L78
            int r0 = r5 - r6
            r0 = r0 ^ (-1)
            int r0 = r0 >>> 31
            r4 = 8
            int r3 = 8 - r0
            r2 = 0
        L53:
            if (r2 >= r3) goto L76
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r11 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L72
            int r0 = r5 << 3
            int r0 = r0 + r2
            r0 = r8[r0]
            X.AWp r0 = (X.AWp) r0
            X.AWl r1 = new X.AWl
            r1.<init>(r0)
            r0 = r9
            X.1qN r0 = (X.C1qN) r0
            X.3Em<X.1Xu> r0 = r0.A00
            r0.AhV(r1)
        L72:
            long r15 = r15 >> r4
            int r2 = r2 + 1
            goto L53
        L76:
            if (r3 != r4) goto L7d
        L78:
            if (r5 == r6) goto L7d
            int r5 = r5 + 1
            goto L36
        L7d:
            r0 = 0
            r10.A05 = r0
            r10.A04 = r0
            r10.A01 = r0
            X.AXI<X.AWp> r0 = r10.A0H
            r0.A09()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AX2.A0J():void");
    }

    public final void A0K(long j, boolean z) {
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        if (interfaceC1072AWd != null) {
            HoC hoC = this.A0F;
            if (hoC == null || !hoC.isActive()) {
                AWp aWp = z ? this.A04 : this.A05;
                if (aWp != null) {
                    AnonymousClass001.A1J(new BU6(interfaceC1072AWd, aWp, (InterfaceC1072AWd) null, (HtJ<? super BU6>) 5), getCoroutineScope());
                }
            } else {
                hoC.A5w(null);
                AnonymousClass001.A1J(new BUD(hoC, interfaceC1072AWd, null, 0, j), getCoroutineScope());
            }
            if (z) {
                this.A04 = null;
            } else {
                this.A05 = null;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AWd;LX/3UH;ZZLjava/lang/String;LX/1YD;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066 A[PHI: r1
  0x0066: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:39:0x007e, B:31:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e A[PHI: r1
  0x007e: PHI (r1v1 boolean) = (r1v0 boolean), (r1v4 boolean), (r1v4 boolean) binds: [B:27:0x005b, B:29:0x0060, B:31:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(X.C3UH r4, X.InterfaceC1072AWd r5, X.C1YD r6, java.lang.String r7, kotlin.jvm.functions.Function0 r8, boolean r9, boolean r10) {
        /*
            r3 = this;
            X.AWd r0 = r3.A03
            boolean r0 = X.C7384Etj.areEqual(r0, r5)
            if (r0 != 0) goto L88
            r3.A0J()
            r3.A03 = r5
            r3.A02 = r5
            r2 = 1
        L10:
            X.3UH r0 = r3.A0C
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 != 0) goto L1b
            r3.A0C = r4
            r2 = 1
        L1b:
            boolean r0 = r3.A0G
            if (r0 == r9) goto L27
            r3.A0G = r9
            if (r9 == 0) goto L26
            r3.AUO()
        L26:
            r2 = 1
        L27:
            boolean r0 = r3.A09
            if (r0 == r10) goto L37
            X.Aen r0 = r3.A0I
            if (r10 == 0) goto L81
            r3.A0G(r0)
        L32:
            X.AaW.A00(r3)
            r3.A09 = r10
        L37:
            java.lang.String r0 = r3.A0E
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 != 0) goto L44
            r3.A0E = r7
            X.AaW.A00(r3)
        L44:
            X.1YD r0 = r3.A0D
            boolean r0 = X.C7384Etj.areEqual(r0, r6)
            if (r0 != 0) goto L51
            r3.A0D = r6
            X.AaW.A00(r3)
        L51:
            r3.A08 = r8
            boolean r1 = r3.A0A
            X.AWd r0 = r3.A03
            boolean r0 = X.AnonymousClass002.A1Y(r0)
            if (r1 == r0) goto L7e
            r3.A0A = r0
            r1 = r0
            if (r0 != 0) goto L7e
            X.1Z3 r0 = r3.A07
            if (r0 != 0) goto L7e
        L66:
            X.1Z3 r0 = r3.A07
            if (r0 != 0) goto L7a
            if (r1 != 0) goto L72
        L6c:
            r0 = 0
            r3.A07 = r0
            A00(r3)
        L72:
            X.Aen r1 = r3.A0I
            X.AWd r0 = r3.A02
            r1.A0I(r0)
            return
        L7a:
            r3.A0H(r0)
            goto L6c
        L7e:
            if (r2 == 0) goto L72
            goto L66
        L81:
            r3.A0H(r0)
            r3.A0J()
            goto L32
        L88:
            r2 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AX2.A0L(X.3UH, X.AWd, X.1YD, java.lang.String, kotlin.jvm.functions.Function0, boolean, boolean):void");
    }

    public final void A0P(boolean z) {
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        if (interfaceC1072AWd != null) {
            HoC hoC = this.A0F;
            if (hoC == null || !hoC.isActive()) {
                AWp aWp = z ? this.A04 : this.A05;
                if (aWp != null) {
                    AWl aWl = new AWl(aWp);
                    HoC hoC2 = (HoC) getCoroutineScope().AEA().get(HoC.A00);
                    AnonymousClass001.A1J(new BUC(interfaceC1072AWd, hoC2 != null ? hoC2.AO5(BTA.A01(aWl, interfaceC1072AWd, 10)) : null, aWl, (AMS<AMN>) null, (HtJ<? super BUC>) 1), getCoroutineScope());
                }
            } else {
                HoC hoC3 = this.A0F;
                if (hoC3 != null) {
                    hoC3.A5w(null);
                }
            }
            if (z) {
                this.A04 = null;
            } else {
                this.A05 = null;
            }
        }
    }

    @Override // X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        C1YD c1yd = this.A0D;
        if (c1yd != null) {
            AbstractC1564Ale.A06(interfaceC0857A6e, c1yd.A00);
        }
        AbstractC1564Ale.A0A(interfaceC0857A6e, this.A0E, C2292BSs.A00(this, 8));
        if (this.A09) {
            this.A0I.A4Y(interfaceC0857A6e);
        } else {
            AbstractC1564Ale.A02(interfaceC0857A6e);
        }
        A0O(interfaceC0857A6e);
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AKZ() {
        return false;
    }

    @Override // X.InterfaceC1476Ajj
    public final boolean AKa() {
        return true;
    }

    @Override // X.InterfaceC1237AfR
    public final Object AM2() {
        return this.A0J;
    }

    @Override // X.InterfaceC1476Ajj
    public final /* synthetic */ boolean AOU() {
        return true;
    }

    @Override // X.InterfaceC1451AjK
    public final void AUO() {
        if (this.A0G) {
            AbstractC1441AjA.A00(this, C2292BSs.A00(this, 7));
        }
    }

    @Override // X.AbstractC1439Aj8
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: getTouchBoundsExpansion-RZrCHBk, reason: not valid java name */
    public final /* synthetic */ long mo12getTouchBoundsExpansionRZrCHBk() {
        return C2Uv.A00;
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onCancelPointerInput, reason: merged with bridge method [inline-methods] */
    public void onViewConfigurationChange() {
        C04901Xt c04901Xt;
        InterfaceC1072AWd interfaceC1072AWd = this.A02;
        if (interfaceC1072AWd != null && (c04901Xt = this.A01) != null) {
            C8j3.A1J(interfaceC1072AWd, new ASE(c04901Xt));
        }
        this.A01 = null;
    }

    @Override // X.InterfaceC1348AhZ
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo13onPointerEventH0pRuoY(C1247Afe c1247Afe, EnumC1080AXj enumC1080AXj, long j) {
        C3UX coroutineScope;
        int i;
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.A0B = AnonymousClass005.A0L((int) (j2 >> 32), AnonymousClass002.A09(j2));
        A00(this);
        if (this.A09) {
            if (this.A06 == null) {
                AX4 ax4 = new AX4(this);
                A0G(ax4);
                this.A06 = ax4;
            }
            if (enumC1080AXj == EnumC1080AXj.A04) {
                int i2 = c1247Afe.A00;
                if (AnonymousClass003.A17(i2)) {
                    coroutineScope = getCoroutineScope();
                    i = 2;
                } else {
                    if (i2 != 5) {
                        return;
                    }
                    coroutineScope = getCoroutineScope();
                    i = 3;
                }
                BU2.A0P(this, coroutineScope, i);
            }
        }
    }

    @Override // X.InterfaceC1348AhZ
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AWd;LX/3UH;ZZLjava/lang/String;LX/1YD;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;)V */
    public AX2(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, String str, Function0 function0, boolean z, boolean z2) {
        this.A02 = interfaceC1072AWd;
        this.A0C = c3uh;
        this.A0G = z;
        this.A0E = str;
        this.A0D = c1yd;
        this.A09 = z2;
        this.A08 = function0;
        this.A0I = new Aen(interfaceC1072AWd, new BUP(this, 0), 0);
        InterfaceC1072AWd interfaceC1072AWd2 = this.A02;
        this.A03 = interfaceC1072AWd2;
        this.A0A = AnonymousClass002.A1Y(interfaceC1072AWd2);
        this.A0J = A0K;
    }

    public final long A0I(long j) {
        long jAh6 = AbstractC1414Aij.A08(this).Ah6(ARZ.A00(this).AHo());
        return AnonymousClass005.A0M(Math.max(0.0f, AnonymousClass001.A00(jAh6) - ((int) (j >> 32))) / 2.0f, Math.max(0.0f, AnonymousClass001.A01(jAh6, 4294967295L) - ((int) (j & 4294967295L))) / 2.0f);
    }

    @Override // X.InterfaceC1447AjG
    public void ATZ(AX8 ax8, EnumC1080AXj enumC1080AXj) {
        A00(this);
        if (this.A09 && this.A06 == null) {
            AX4 ax4 = new AX4(this);
            A0G(ax4);
            this.A06 = ax4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e0, code lost:
    
        if (r3 == false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.AX2] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    @Override // X.InterfaceC1527Akg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ATl(android.view.KeyEvent r11) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AX2.ATl(android.view.KeyEvent):boolean");
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        AUO();
        if (!this.A0A) {
            A00(this);
        }
        if (this.A09) {
            A0G(this.A0I);
        }
    }

    @Override // X.AbstractC1439Aj8
    public final void onDetach() {
        A0J();
        if (this.A03 == null) {
            this.A02 = null;
        }
        C1Z3 c1z3 = this.A07;
        if (c1z3 != null) {
            A0H(c1z3);
        }
        this.A07 = null;
        C1Z3 c1z32 = this.A06;
        if (c1z32 != null) {
            A0H(c1z32);
        }
        this.A06 = null;
    }
}
