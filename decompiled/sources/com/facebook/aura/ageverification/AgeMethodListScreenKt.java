package com.facebook.aura.ageverification;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.ApQ;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1DI;
import X.C1DM;
import X.C1SA;
import X.C1YD;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTerminalBackHandlerKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.user.provider.AgeCheckMethod;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgeMethodListScreenKt {
    public static final float ACCOUNT_ICON_SIZE = 24.0f;
    public static final HatchScreen AGE_METHODS_SCREEN = HatchScreen.ONBOARDING_AGE_METHODS;
    public static final String LEARN_MORE_LINK_TAG = "learn_more";

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodAccounts$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<AgeCheckMethod> $accounts;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgeCheckMethod, Unit> $onPick;
        public final /* synthetic */ AgeCheckMethod $resolvingMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends AgeCheckMethod> list, AgeCheckMethod ageCheckMethod, G0U<? super AgeCheckMethod, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$accounts = list;
            this.$resolvingMethod = ageCheckMethod;
            this.$onPick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodAccounts(this.$accounts, this.$resolvingMethod, this.$onPick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AgeCheckMethod $method;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraIconSize $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AgeCheckMethod ageCheckMethod, AuraIconSize auraIconSize, BRg bRg, int i, int i2) {
            super(2);
            this.$method = ageCheckMethod;
            this.$size = auraIconSize;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodIcon(this.$method, this.$size, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodListHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C108792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLearnMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108792(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onLearnMore = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodListHeader(this.$onLearnMore, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodListScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C108801 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ AHD<AgeCheckMethod> $accounts;
        public final /* synthetic */ G0U<G0V<? super AgeCheckMethod, ? super Integer, Unit>, G0U<AgeCheckMethod, Unit>> $loggedPick;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onAccountPick;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onPick;
        public final /* synthetic */ Function0<Unit> $onWhyConfirm;
        public final /* synthetic */ AHD<AgeCheckMethod> $primary;
        public final /* synthetic */ AgeCheckMethod $resolvingMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108801(Function0<Unit> function0, AHD<? extends AgeCheckMethod> ahd, AgeCheckMethod ageCheckMethod, G0U<? super G0V<? super AgeCheckMethod, ? super Integer, Unit>, ? extends G0U<? super AgeCheckMethod, Unit>> g0u, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, AHD<? extends AgeCheckMethod> ahd2, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2) {
            super(4);
            this.$onWhyConfirm = function0;
            this.$primary = ahd;
            this.$resolvingMethod = ageCheckMethod;
            this.$loggedPick = g0u;
            this.$onPick = g0v;
            this.$accounts = ahd2;
            this.$onAccountPick = g0v2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m207invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m207invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass005.A0T(bfm, C3U4.A0A(C10G.A01, f, f2)), AuraDimensKt.SpacingLarge);
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingXlarge);
            C3TH c3th = C2VU.A00;
            Function0<Unit> function0 = this.$onWhyConfirm;
            AHD<AgeCheckMethod> ahd = this.$primary;
            AgeCheckMethod ageCheckMethod = this.$resolvingMethod;
            G0U<G0V<? super AgeCheckMethod, ? super Integer, Unit>, G0U<AgeCheckMethod, Unit>> g0u = this.$loggedPick;
            G0V<AgeCheckMethod, Integer, Unit> g0v = this.$onPick;
            AHD<AgeCheckMethod> ahd2 = this.$accounts;
            G0V<AgeCheckMethod, Integer, Unit> g0v2 = this.$onAccountPick;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AgeMethodListScreenKt.AgeMethodListHeader(function0, null, bfm, 0, 2);
            if (ahd.isEmpty()) {
                bfm.AgE(2095306274);
            } else {
                bfm.AgE(-902242908);
                AgeMethodListScreenKt.AgeMethodTiles(ahd, AnonymousClass002.A1Y(ageCheckMethod), g0u.invoke(g0v), null, bfm, 0, 8);
            }
            BBI.A0R(bbi, false);
            if (ahd2.isEmpty()) {
                bfm.AgE(2095428290);
            } else {
                bfm.AgE(2095342761);
                AgeMethodListScreenKt.AgeMethodAccounts(ahd2, ageCheckMethod, g0u.invoke(g0v2), null, bfm, 0, 8);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodListScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C108812 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<AgeCheckMethod> $accounts;
        public final /* synthetic */ boolean $backEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onAccountPick;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0V<AgeCheckMethod, Integer, Unit> $onPick;
        public final /* synthetic */ AHD<AgeCheckMethod> $primary;
        public final /* synthetic */ AgeCheckMethod $resolvingMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108812(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2, AgeCheckMethod ageCheckMethod, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$primary = ahd;
            this.$accounts = ahd2;
            this.$resolvingMethod = ageCheckMethod;
            this.$onPick = g0v;
            this.$onAccountPick = g0v2;
            this.$backEnabled = z;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodListScreen(this.$primary, this.$accounts, this.$resolvingMethod, this.$onPick, this.$onAccountPick, this.$backEnabled, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodResolvingSpinner$2, reason: invalid class name and case insensitive filesystem */
    public final class C108822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108822(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodResolvingSpinner(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeMethodListScreenKt$AgeMethodTiles$2, reason: invalid class name and case insensitive filesystem */
    public final class C108832 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ List<AgeCheckMethod> $methods;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AgeCheckMethod, Unit> $onPick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108832(List<? extends AgeCheckMethod> list, boolean z, G0U<? super AgeCheckMethod, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$methods = list;
            this.$enabled = z;
            this.$onPick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AgeMethodListScreenKt.AgeMethodTiles(this.$methods, this.$enabled, this.$onPick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgeMethodIcon(AgeCheckMethod ageCheckMethod, AuraIconSize auraIconSize, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-572671467);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, ageCheckMethod) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass005.A09(bfm, auraIconSize);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRg2, BOf.A00(bfm, getIconRes(ageCheckMethod), 0), auraIconSize, null, C06G.A0A(bfm), null, bfm, ((iA08 >> 6) & 14) | (AVy.$stable << 3) | ((iA08 << 3) & 896), 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(ageCheckMethod, auraIconSize, bRg2, i, i2);
        }
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgeCheckMethod.values().length];
            try {
                AnonymousClass002.A13(AgeCheckMethod.SELFIE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgeCheckMethod.CREDIT_CARD, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgeCheckMethod.FACEBOOK, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgeCheckMethod.INSTAGRAM, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AgeMethodAccounts(List<? extends AgeCheckMethod> list, AgeCheckMethod ageCheckMethod, G0U<? super AgeCheckMethod, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(1265932392);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, AnonymousClass003.A0K(ageCheckMethod));
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLargePlusMicro;
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
                G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
                if (list.size() > 1) {
                    i3 = R.string._name_removed__res_0x7f120055;
                } else {
                    Object objA0J = AbstractC0878AGe.A0J(list);
                    AgeCheckMethod ageCheckMethod2 = AgeCheckMethod.INSTAGRAM;
                    i3 = R.string._name_removed__res_0x7f120056;
                    if (objA0J == ageCheckMethod2) {
                        i3 = R.string._name_removed__res_0x7f120057;
                    }
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i3);
                C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
                long jA08 = C06G.A08(bfm);
                BS0 bs0 = BRg.A00;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, c1062ATq, jA08, c1822ArmA0Z, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 48, 0, 16304);
                BRg bRgOutlined = outlined(c1062ATq, bfm, 6);
                InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgOutlined);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1518425837);
                int i6 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        AgeCheckMethod ageCheckMethod3 = (AgeCheckMethod) next;
                        if (i6 > 0) {
                            bfm.AgE(828477907);
                            AuraDividerKt.AuraRowDivider(C3U4.A0C(bs0, f + ACCOUNT_ICON_SIZE + f, 0.0f, f, 0.0f), bfm, 0, 0);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(828706625);
                            BBI.A0R(bbi, false);
                        }
                        boolean zA1Y = AnonymousClass002.A1Y(ageCheckMethod);
                        C1YD c1yd = new C1YD(0);
                        boolean zA1H = AnonymousClass003.A1H(bfm, ageCheckMethod3, AnonymousClass004.A1K(iA05));
                        Object objAaT = bfm.AaT();
                        if (zA1H || objAaT == C78N.A00) {
                            objAaT = new AgeMethodListScreenKt$AgeMethodAccounts$1$1$1$1$1(g0u, ageCheckMethod3);
                            bfm.Ai0(objAaT);
                        }
                        BRg bRgA0B = C3U4.A0B(C0v5.A04(c1062ATq, c1yd, null, (Function0) objAaT, zA1Y), f, AuraDimensKt.SpacingLarge);
                        InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
                        int iA0D2 = AnonymousClass001.A0D(bbi);
                        AKQ akqA043 = BBI.A04(bbi);
                        BRg bRgA013 = AxM.A01(bfm, bRgA0B);
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        BPg.A02(bfm, interfaceC1380AiAA003, g0v);
                        BPg.A02(bfm, akqA043, g0v2);
                        AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                        BPg.A02(bfm, bRgA013, g0vA0u);
                        C90m c90m = C90m.A00;
                        AgeMethodIcon(ageCheckMethod3, AuraIconSize.SMALL, null, bfm, 48, 4);
                        AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, getLabelRes(ageCheckMethod3)), AnonymousClass001.A0O(c90m, bs0, true), C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                        if (ageCheckMethod3 == ageCheckMethod) {
                            bfm.AgE(-1902569024);
                            AgeMethodResolvingSpinner(null, bfm, 0, 1);
                        } else {
                            bfm.AgE(1149928349);
                        }
                        BBI.A0R(bbi, false);
                        BBI.A0R(bbi, true);
                        i6 = i7;
                    }
                }
                AnonymousClass002.A10(bbi, false, true);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(list, ageCheckMethod, g0u, bRg2, i, i2);
        }
    }

    public static final void AgeMethodListHeader(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1378179360);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12043a);
            long jA07 = C06G.A07(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA0T) | bfm.A65(strA01) | bfm.A64(jA07);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(strA01, strA01, jA07, LEARN_MORE_LINK_TAG, function0);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingSmall;
            C9m9 c9m9A00 = AcQ.A00(f);
            C3TH c3th = C2VU.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_logo, 0);
            BS0 bs0 = BRg.A00;
            C1SA.A00(bfm, null, C10G.A07(bs0, 64.0f), null, aVyA00, null, null, 0.0f, AVy.$stable | 432, 120);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12005c);
            C1822Arm c1822ArmA0U = C06G.A0U(bfm);
            long jA0C = C06G.A0C(bfm);
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, f, 0.0f, 0.0f);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = AgeMethodListScreenKt$AgeMethodListHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bRgA0C, objAaT2, false), jA0C, c1822ArmA0U, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12005b), null, C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2640AuraTextVmYn7U0(apQ, null, 0L, C06G.A0Z(bfm), null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32694);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108792(function0, bRg2, i, i2);
        }
    }

    public static final void AgeMethodListScreen(AHD<? extends AgeCheckMethod> ahd, AHD<? extends AgeCheckMethod> ahd2, AgeCheckMethod ageCheckMethod, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v, G0V<? super AgeCheckMethod, ? super Integer, Unit> g0v2, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(ahd, ahd2);
        C7384Etj.A0Y(g0v, 3);
        AnonymousClass002.A1E(g0v2, 4, function0);
        bfm.AgG(-703851995);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(ageCheckMethod));
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0v);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, function0);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0d |= iA0k;
        } else if ((i & 12582912) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0d |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1E(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1B = AnonymousClass005.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new AgeMethodListScreenKt$AgeMethodListScreen$onBackClick$1$1(function0);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new AgeMethodListScreenKt$AgeMethodListScreen$onWhyConfirm$1$1(auraNavigatorA0b);
                bfm.Ai0(objAaT2);
            }
            Function0 function03 = (Function0) objAaT2;
            boolean zA1B2 = AnonymousClass003.A1B(iA0d) | AnonymousClass004.A1I(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA1B2 || objAaT3 == C78N.A00) {
                objAaT3 = new AgeMethodListScreenKt$AgeMethodListScreen$loggedPick$1$1(ahd, ahd2);
                bfm.Ai0(objAaT3);
            }
            AuraTerminalBackHandlerKt.AuraTerminalBackHandler(z, function02, bfm, (iA0d >> 15) & 14, zA1b ? 1 : 0);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, 0L, null, null, function02, null, zA1b, z, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new C108801(function03, ahd, ageCheckMethod, (G0U) objAaT3, g0v, ahd2, g0v2), 2027376426), bfm, AnonymousClass001.A06(iA0d << 12, ((iA0d >> 18) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), zA1b ? 1 : 0, 805306374, 535821756);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108812(ahd, ahd2, ageCheckMethod, g0v, g0v2, z, function0, bRg2, i, i2);
        }
    }

    public static final void AgeMethodTiles(List<? extends AgeCheckMethod> list, boolean z, G0U<? super AgeCheckMethod, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(22906351);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            float f = AuraDimensKt.SpacingMedium;
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0S, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C90m c90m = C90m.A00;
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 999734116);
            while (itA0w.hasNext()) {
                AgeCheckMethod ageCheckMethod = (AgeCheckMethod) itA0w.next();
                BRg bRgA00 = BRg.A00;
                BRg bRgAiP = c90m.AiP(bRgA00, 1.0f, true);
                if (list.size() > 1) {
                    bRgA00 = BJe.A00(bRgA00, 1.0f, false);
                }
                BRg bRgOutlined = outlined(bRgAiP.then(bRgA00), bfm, 0);
                C1YD c1yd = new C1YD(0);
                boolean zA1H = AnonymousClass003.A1H(bfm, ageCheckMethod, AnonymousClass004.A1K(iA05));
                Object objAaT = bfm.AaT();
                if (zA1H || objAaT == C78N.A00) {
                    objAaT = new AgeMethodListScreenKt$AgeMethodTiles$1$1$1$1(g0u, ageCheckMethod);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA0B = C3U4.A0B(C0v5.A04(bRgOutlined, c1yd, null, (Function0) objAaT, z), f, list.size() > 1 ? AuraDimensKt.SpacingNone : AuraDimensKt.SpacingXlarge);
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02(C2VU.A04, AuraDimensKt.SpacingLargePlusMicro), bfm, C2VU.A00, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA00, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AgeMethodIcon(ageCheckMethod, AuraIconSize.SMALL_MEDIUM, null, bfm, 48, 4);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, getLabelRes(ageCheckMethod)), null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, new C1YL(3), false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14770);
                BBI.A0R(bbi, true);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108832(list, z, g0u, bRgA0Q, i, i2);
        }
    }

    public static final void AgeMethodResolvingSpinner(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1778088313);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AgeMethodListScreenKt$AgeMethodResolvingSpinner$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRg, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108822(bRg, i, i2);
        }
    }

    public static final int getIconRes(AgeCheckMethod ageCheckMethod) {
        int iOrdinal = ageCheckMethod.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.framecornersuser_outline_24_wght400;
        }
        if (iOrdinal == 1) {
            return R.drawable.credit_card_outline_24;
        }
        if (iOrdinal == 2) {
            return R.drawable.facebook_outline_24_wght400;
        }
        if (iOrdinal == 3) {
            return R.drawable.instagram_outline_24_wght400;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int getLabelRes(AgeCheckMethod ageCheckMethod) {
        int iOrdinal = ageCheckMethod.ordinal();
        if (iOrdinal == 0) {
            return R.string._name_removed__res_0x7f12005d;
        }
        if (iOrdinal == 1) {
            return R.string._name_removed__res_0x7f120058;
        }
        if (iOrdinal == 2) {
            return R.string._name_removed__res_0x7f120059;
        }
        if (iOrdinal == 3) {
            return R.string._name_removed__res_0x7f12005a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final HatchComponent getPickComponent(AgeCheckMethod ageCheckMethod) {
        int iOrdinal = ageCheckMethod.ordinal();
        if (iOrdinal == 0) {
            return HatchComponent.CONTINUE_BUTTON;
        }
        if (iOrdinal == 1) {
            return HatchComponent.USE_CREDIT_CARD;
        }
        if (iOrdinal == 2) {
            return HatchComponent.CONTINUE_WITH_FACEBOOK;
        }
        if (iOrdinal == 3) {
            return HatchComponent.CONTINUE_WITH_INSTAGRAM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BRg outlined(BRg bRg, BFM bfm, int i) {
        C1DM c1dmA0R = C06G.A0R(bfm);
        return C1DI.A02(C11U.A03(bRg, c1dmA0R), c1dmA0R, 1.0f, AnonymousClass002.A0c(bfm).elevatedBorder);
    }
}
