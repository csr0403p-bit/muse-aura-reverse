package com.facebook.aura.iap.iac;

import X.AKQ;
import X.AbstractC0885AGm;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0ob;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C8j4;
import X.C9xk;
import X.C9xn;
import X.C9xo;
import X.C9xt;
import X.C9xv;
import X.EnumC7495EyA;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.controls.AuraRadioKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class IacSandboxSheetContentKt {
    public static final List<EnumC7495EyA> SIMULATED_OUTCOMES = Arrays.asList(EnumC7495EyA.A05, EnumC7495EyA.A02, EnumC7495EyA.A04, EnumC7495EyA.A03);

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$IacSandboxSheetBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C9xk $content;
        public final /* synthetic */ C9xo $display;
        public final /* synthetic */ IacSandboxSheetState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState, int i) {
            super(2);
            this.$display = c9xo;
            this.$content = c9xk;
            this.$state = iacSandboxSheetState;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.IacSandboxSheetBody(this.$display, this.$content, this.$state, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$IacSandboxSheetFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C122332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C9xk $content;
        public final /* synthetic */ C9xo $display;
        public final /* synthetic */ G0W<EnumC7495EyA, Integer, Integer, Unit> $onConfirm;
        public final /* synthetic */ IacSandboxSheetState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C122332(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState, G0W<? super EnumC7495EyA, ? super Integer, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$display = c9xo;
            this.$content = c9xk;
            this.$state = iacSandboxSheetState;
            this.$onConfirm = g0w;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.IacSandboxSheetFooter(this.$display, this.$content, this.$state, this.$onConfirm, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$SheetAmountRow$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $headline;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, int i) {
            super(2);
            this.$headline = str;
            this.$body = str2;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.SheetAmountRow(this.$headline, this.$body, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$SheetRadioRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $label;
        public final /* synthetic */ Function0<Unit> $onSelect;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, boolean z, Function0<Unit> function0, int i) {
            super(2);
            this.$label = str;
            this.$selected = z;
            this.$onSelect = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.SheetRadioRow(this.$label, this.$selected, this.$onSelect, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$SheetSectionTitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C122341 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $body;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122341(String str, String str2, int i) {
            super(2);
            this.$title = str;
            this.$body = str2;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.SheetSectionTitle(this.$title, this.$body, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.iap.iac.IacSandboxSheetContentKt$XgradeSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C122353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C9xn $content;
        public final /* synthetic */ C9xt $xgrade;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122353(C9xt c9xt, C9xn c9xn, int i) {
            super(2);
            this.$xgrade = c9xt;
            this.$content = c9xn;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            IacSandboxSheetContentKt.XgradeSection(this.$xgrade, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void IacSandboxSheetBody(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState, BFM bfm, int i) {
        AnonymousClass005.A10(c9xo, c9xk, iacSandboxSheetState);
        bfm.AgG(2048959774);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c9xo) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, c9xk);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, iacSandboxSheetState);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            C9xt c9xt = c9xo.A01;
            C9xn c9xn = c9xk.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A02, 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
                String str = c9xo.A03;
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                AuraTextKt.m2639AuraTextUY9GdpU(c9xk.A07, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                if (c9xt == null || c9xn == null) {
                    bfm.AgE(1139763669);
                    C01N.A08(bfm, bs0, 12.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(c9xo.A02, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    AuraTextKt.m2639AuraTextUY9GdpU(c9xk.A01, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                } else {
                    bfm.AgE(1140145000);
                    XgradeSection(c9xt, c9xn, bfm, 0);
                }
                BBI.A0R(bbi, false);
                if (c9xo.A04 && c9xt == null) {
                    bfm.AgE(1140261746);
                    SheetSectionTitle(c9xk.A03, c9xk.A02, bfm, 0);
                    bfm.AgE(-933045497);
                    for (C9xv c9xv : c9xk.A0E) {
                        String str2 = c9xv.A01;
                        boolean zA1Q = AnonymousClass002.A1Q(MutableState.A02(iacSandboxSheetState.cadenceSeconds$delegate), c9xv.A00);
                        boolean zA1T = AnonymousClass001.A1T(bfm, c9xv, AnonymousClass004.A1K(iA0T));
                        Object objAaT = bfm.AaT();
                        if (zA1T || objAaT == C78N.A00) {
                            objAaT = new IacSandboxSheetContentKt$IacSandboxSheetBody$1$1$1$1(iacSandboxSheetState, c9xv);
                            BBI.A0O(bbi, objAaT);
                        }
                        SheetRadioRow(str2, zA1Q, (Function0) objAaT, bfm, 0);
                    }
                    BBI.A0R(bbi, false);
                    SheetSectionTitle(c9xk.A06, c9xk.A05, bfm, 0);
                    for (C9xv c9xv2 : c9xk.A0F) {
                        String str3 = c9xv2.A01;
                        boolean zA1Q2 = AnonymousClass002.A1Q(MutableState.A02(iacSandboxSheetState.maxRenewals$delegate), c9xv2.A00);
                        boolean zA1T2 = AnonymousClass001.A1T(bfm, c9xv2, AnonymousClass004.A1K(iA0T));
                        Object objAaT2 = bfm.AaT();
                        if (zA1T2 || objAaT2 == C78N.A00) {
                            objAaT2 = new IacSandboxSheetContentKt$IacSandboxSheetBody$1$2$1$1(iacSandboxSheetState, c9xv2);
                            BBI.A0O(bbi, objAaT2);
                        }
                        SheetRadioRow(str3, zA1Q2, (Function0) objAaT2, bfm, 0);
                    }
                } else {
                    bfm.AgE(1140792218);
                }
                BBI.A0R(bbi, false);
                int i2 = 0;
                SheetSectionTitle(c9xk.A0A, c9xk.A09, bfm, 0);
                bfm.AgE(-933027227);
                int i3 = 0;
                for (String str4 : c9xk.A0G) {
                    i2++;
                    if (i3 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        String str5 = str4;
                        boolean zA1Q3 = AnonymousClass002.A1Q(MutableState.A02(iacSandboxSheetState.outcomeIndex$delegate), i3);
                        boolean zA1a = AnonymousClass001.A1a(AnonymousClass004.A1K(iA0T), bfm, i3);
                        Object objAaT3 = bfm.AaT();
                        if (zA1a || objAaT3 == C78N.A00) {
                            objAaT3 = new IacSandboxSheetContentKt$IacSandboxSheetBody$1$3$1$1(iacSandboxSheetState, i3);
                            BBI.A0O(bbi, objAaT3);
                        }
                        SheetRadioRow(str5, zA1Q3, (Function0) objAaT3, bfm, 0);
                        i3 = i2;
                    }
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c9xo, c9xk, iacSandboxSheetState, i);
        }
    }

    public static final void IacSandboxSheetFooter(C9xo c9xo, C9xk c9xk, IacSandboxSheetState iacSandboxSheetState, G0W<? super EnumC7495EyA, ? super Integer, ? super Integer, Unit> g0w, BFM bfm, int i) {
        C9xv next;
        String str;
        C7384Etj.A0Y(c9xo, 0);
        AnonymousClass005.A11(c9xk, iacSandboxSheetState, g0w, 1);
        bfm.AgG(3079444);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c9xo) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, c9xk);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, iacSandboxSheetState);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            C9xn c9xn = c9xk.A00;
            String str2 = c9xn != null ? c9xn.A03 : null;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0B = C3U4.A0B(c1062ATq, 24.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            int iA02 = MutableState.A02(iacSandboxSheetState.cadenceSeconds$delegate);
            int iA022 = MutableState.A02(iacSandboxSheetState.maxRenewals$delegate);
            String strA0z = c9xk.A0D;
            if (strA0z == null) {
                Iterator<C9xv> it = c9xk.A0E.iterator();
                do {
                    next = null;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                } while (next.A00 != iA02);
                C9xv c9xv = next;
                if (c9xv == null || (str = c9xv.A01) == null) {
                    str = "";
                }
                strA0z = AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(iA022 >= 120 ? c9xk.A0C : c9xk.A0B, "{cadence}", str), "{max_renewals}", String.valueOf(iA022));
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0z, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 12.0f);
            if (str2 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraTheme.getColors(bfm, 6).negativeAccent, C3cH.A0X(bfm, auraTheme, 1576151291).footnoteRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 12.0f);
            } else {
                bfm.AgE(1576344452);
            }
            BBI.A0R(bbi, false);
            String str3 = c9xk.A04;
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean z = str2 == null;
            boolean zA1V = AnonymousClass002.A1V(bfm, c9xo, AnonymousClass004.A1M(iA0T), (iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new IacSandboxSheetContentKt$IacSandboxSheetFooter$1$1$1(g0w, iacSandboxSheetState, c9xo);
                BBI.A0O(bbi, objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, str3, null, c1062ATq, null, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134200789);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122332(c9xo, c9xk, iacSandboxSheetState, g0w, i);
        }
    }

    public static final EnumC7495EyA outcomeAt(int i) {
        List<EnumC7495EyA> list = SIMULATED_OUTCOMES;
        return (i < 0 || i >= list.size()) ? EnumC7495EyA.A05 : list.get(i);
    }

    public static final void SheetAmountRow(String str, String str2, BFM bfm, int i) {
        bfm.AgG(-1965281070);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            C01N.A00(bfm, BRg.A00, 8.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C60Q.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, str2, i);
        }
    }

    public static final void SheetRadioRow(String str, boolean z, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1479106482);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            int i2 = iA0d & 896;
            boolean zA1Q = AnonymousClass002.A1Q(i2, 256);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new IacSandboxSheetContentKt$SheetRadioRow$selectWithHaptic$1$1(function0);
                BBI.A0T(bfm, objAaT);
            }
            G0U<Boolean, Unit> g0uWithSelectionHaptic = AuraRadioKt.withSelectionHaptic((G0U) objAaT, bfm, 0);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A02;
            C1YD c1ydA0A = C3cG.A0A(3);
            boolean zA1C = AnonymousClass003.A1C(iA0d) | bfm.A65(g0uWithSelectionHaptic);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == C78N.A00) {
                objAaT2 = new IacSandboxSheetContentKt$SheetRadioRow$1$1(g0uWithSelectionHaptic, z);
                BBI.A0T(bfm, objAaT2);
            }
            BRg bRgA06 = C3U4.A06(C0ob.A00(c1062ATq, c1ydA0A, (Function0) objAaT2, z, true), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = C8j4.A0b(AcQ.A01, bfm, c1ac);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0D);
            Object objAaT3 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT3 == obj) {
                objAaT3 = IacSandboxSheetContentKt$SheetRadioRow$2$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            BRg bRgA0X = AnonymousClass001.A0X(bs0, objAaT3);
            boolean zA19 = AnonymousClass003.A19(i2);
            Object objAaT4 = bfm.AaT();
            if (zA19 || objAaT4 == obj) {
                objAaT4 = new IacSandboxSheetContentKt$SheetRadioRow$2$2$1(function0);
                BBI.A0O(bbi, objAaT4);
            }
            AuraRadioKt.m2530AuraRadioV9fs2A(bRgA0X, false, z, (G0U) objAaT4, null, 0L, bfm, (iA0d << 3) & 896, 50);
            C01N.A07(bfm, C10G.A08(bs0, 12.0f));
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, z, function0, i);
        }
    }

    public static final void SheetSectionTitle(String str, String str2, BFM bfm, int i) {
        bfm.AgG(1167295845);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            int iA00 = C01N.A00(bfm, BRg.A00, 20.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, iA00).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122341(str, str2, i);
        }
    }

    public static final void XgradeSection(C9xt c9xt, C9xn c9xn, BFM bfm, int i) {
        bfm.AgG(-443623536);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c9xt) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, c9xn);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            BS0 bs0 = BRg.A00;
            int iA00 = C01N.A00(bfm, bs0, 12.0f);
            String str = c9xn.A01;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, iA00).subheadlineMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            SheetAmountRow(c9xn.A0A, c9xn.A06, bfm, 0);
            if (c9xt.A03) {
                bfm.AgE(-374007309);
                String str2 = c9xn.A08;
                if (str2 == null) {
                    bfm.AgE(-373979782);
                } else {
                    bfm.AgE(-373979781);
                    SheetAmountRow(str2, c9xn.A07, bfm, 0);
                }
                BBI bbiA07 = C3cG.A07(bfm);
                SheetAmountRow(c9xt.A01, c9xn.A04, bfm, 0);
                String str3 = c9xt.A02;
                if (str3 == null) {
                    bfm.AgE(-373818117);
                } else {
                    bfm.AgE(-373818116);
                    SheetAmountRow(str3, c9xn.A09, bfm, 0);
                }
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-373747591);
                SheetAmountRow(c9xn.A05, c9xn.A00, bfm, 0);
                C01N.A08(bfm, bs0, 4.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(c9xn.A02, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C122353(c9xt, c9xn, i);
        }
    }

    public static final IacSandboxSheetState rememberIacSandboxSheetState(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new IacSandboxSheetState();
            BBI.A0T(bfm, objAaT);
        }
        return (IacSandboxSheetState) objAaT;
    }
}
