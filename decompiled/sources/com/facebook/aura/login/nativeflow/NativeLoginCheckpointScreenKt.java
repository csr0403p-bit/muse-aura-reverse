package com.facebook.aura.login.nativeflow;

import X.AKQ;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BO6;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06H;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1731ApS;
import X.C1809ArT;
import X.C1822Arm;
import X.C1824Aro;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardStyles;
import com.facebook.aura.vds.compose.common.AuraDrawableSourceResource;
import com.facebook.aura.vds.compose.profilepicture.AuraProfilePictureKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import com.facebook.common.dextricks.RuntimeInternals;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class NativeLoginCheckpointScreenKt {
    public static final float AVATAR_STYLE = 40.0f;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointScreenKt$NativeLoginCheckpointAccountCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchCheckpointChallenge $checkpoint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchCheckpointChallenge hatchCheckpointChallenge) {
            super(2);
            this.$checkpoint = hatchCheckpointChallenge;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = this.$checkpoint.accountPhotoUrl;
                if (str != null) {
                    bfm.AgE(1110292215);
                    AuraProfilePictureKt.m2594AuraProfilePictured7e1vww(str, NativeLoginCheckpointScreenKt.AVATAR_STYLE, null, null, null, null, null, null, null, null, 0.0f, bfm, 48, 0, 2044);
                } else {
                    bfm.AgE(1110379418);
                    AuraCardDefaults.INSTANCE.m2480LeadingImagexqIIw2o(new AuraDrawableSourceResource(R.drawable.ic_person_filled), null, null, new B6A(C06G.A0A(bfm)), bfm, RuntimeInternals.IOPRIO_BACKGROUND, 6);
                }
                AnonymousClass002.A19(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointScreenKt$NativeLoginCheckpointAccountCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchCheckpointChallenge $checkpoint;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchCheckpointChallenge hatchCheckpointChallenge, BRg bRg, int i, int i2) {
            super(2);
            this.$checkpoint = hatchCheckpointChallenge;
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
            NativeLoginCheckpointScreenKt.NativeLoginCheckpointAccountCard(this.$checkpoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ HatchCheckpointChallenge $checkpoint;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onPrimaryClick;
        public final /* synthetic */ NativeLoginCheckpointAction $primaryAction;

        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$1$WhenMappings */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NativeLoginCheckpointAction.values().length];
                try {
                    AnonymousClass002.A13(NativeLoginCheckpointAction.SIGN_IN_AGAIN, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(NativeLoginCheckpointAction.CONTINUE, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NativeLoginCheckpointAction nativeLoginCheckpointAction, boolean z, Function0<Unit> function0, Function0<Unit> function02, HatchCheckpointChallenge hatchCheckpointChallenge) {
            super(4);
            this.$primaryAction = nativeLoginCheckpointAction;
            this.$isLoading = z;
            this.$onPrimaryClick = function0;
            this.$onLogOut = function02;
            this.$checkpoint = hatchCheckpointChallenge;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1278invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1278invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            String strA0s;
            String strA0s2;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C3U4.A07(C10G.A01, NativeLoginCommonKt.NATIVE_LOGIN_PAGE_GUTTER);
            C3TH c3th = C2VU.A00;
            NativeLoginCheckpointAction nativeLoginCheckpointAction = this.$primaryAction;
            boolean z = this.$isLoading;
            Function0<Unit> function0 = this.$onPrimaryClick;
            Function0<Unit> function02 = this.$onLogOut;
            HatchCheckpointChallenge hatchCheckpointChallenge = this.$checkpoint;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgAiP = C90l.A00.AiP(bs0, 1.0f, true);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgAiP, c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            NativeLoginCommonKt.NativeLoginHero(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1204a2), null, null, false, false, null, bfm, 0, 62);
            float f3 = AuraDimensKt.SpacingLarge;
            C01N.A08(bfm, bs0, f3);
            if (NativeLoginCheckpointScreenKt.getHasAccountDetails(hatchCheckpointChallenge)) {
                bfm.AgE(-397786825);
                NativeLoginCheckpointScreenKt.NativeLoginCheckpointAccountCard(hatchCheckpointChallenge, c1062ATq, bfm, 48, 0);
                C01N.A04(bfm, bbi, bs0, f3, false);
            } else {
                bfm.AgE(-397590781);
                BBI.A0R(bbi, false);
            }
            int iOrdinal = nativeLoginCheckpointAction.ordinal();
            if (iOrdinal == 1) {
                bfm.AgE(125727078);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12049e);
            } else {
                if (iOrdinal != 0) {
                    throw AnonymousClass003.A0k(bfm, bbi, 125723891);
                }
                bfm.AgE(125731933);
                strA0s = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f12049d);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0s, NativeLoginCommonKt.nativeLoginTextInset(c1062ATq), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            BBI.A0R(bbi, true);
            float f4 = AuraDimensKt.SpacingLargePlusMicro;
            C01N.A08(bfm, bs0, f4);
            if (iOrdinal != 1) {
                bfm.AgE(1610792716);
                strA0s2 = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f1204a5);
            } else {
                bfm.AgE(1610788252);
                strA0s2 = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f1204a0);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120702);
            boolean zA1T = AnonymousClass005.A1T(bfm, function0, strA01, function02, AnonymousClass003.A1T(bfm, strA0s2, z));
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$1$1$2$1(strA0s2, z, function0, strA01, function02);
                bfm.Ai0(objAaT);
            }
            AuraButtonGroupsKt.m2455AuraButtonGroupStyleExplicitFLdL6rA(c1062ATq, null, null, null, null, null, null, true, (G0U) objAaT, bfm, 12582918, 126);
            C01N.A04(bfm, bbi, bs0, f4 + f2, true);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginCheckpointScreenKt$NativeLoginCheckpointScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchCheckpointChallenge $checkpoint;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onLogOut;
        public final /* synthetic */ Function0<Unit> $onPrimaryClick;
        public final /* synthetic */ NativeLoginCheckpointAction $primaryAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchCheckpointChallenge hatchCheckpointChallenge, NativeLoginCheckpointAction nativeLoginCheckpointAction, Function0<Unit> function0, Function0<Unit> function02, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$checkpoint = hatchCheckpointChallenge;
            this.$primaryAction = nativeLoginCheckpointAction;
            this.$onPrimaryClick = function0;
            this.$onLogOut = function02;
            this.$isLoading = z;
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
            NativeLoginCheckpointScreenKt.NativeLoginCheckpointScreen(this.$checkpoint, this.$primaryAction, this.$onPrimaryClick, this.$onLogOut, this.$isLoading, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void NativeLoginCheckpointAccountCard(HatchCheckpointChallenge hatchCheckpointChallenge, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        bfm.AgG(-327385279);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchCheckpointChallenge) | i : i;
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
            Locale localeA0b = AnonymousClass007.A0b(bfm);
            LocalDate localDate = hatchCheckpointChallenge.suspendedOn;
            if (localDate == null) {
                AnonymousClass003.A0l(bfm, 736107526);
                strA0t = null;
            } else {
                bfm.AgE(736107527);
                C7384Etj.A0X(localeA0b);
                strA0t = AnonymousClass001.A0t(bfm, formatLongDate(localDate, localeA0b), R.string._name_removed__res_0x7f1204a1);
                AnonymousClass001.A1D(bfm);
            }
            long j = AnonymousClass002.A0c(bfm).errorText;
            boolean zA1K = AnonymousClass003.A1K(bfm, hatchCheckpointChallenge.accountEmail, strA0t) | bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
                if (!C7BY.A0j(hatchCheckpointChallenge.accountEmail)) {
                    c1731ApSA0W.A0E(hatchCheckpointChallenge.accountEmail);
                }
                if (strA0t != null) {
                    if (c1731ApSA0W.A00.length() > 0) {
                        c1731ApSA0W.append('\n');
                    }
                    long j2 = C1809ArT.A01;
                    int iA02 = c1731ApSA0W.A02(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, j, j2, j2, B6A.A07));
                    try {
                        c1731ApSA0W.A0E(strA0t);
                    } finally {
                        c1731ApSA0W.A06(iA02);
                    }
                }
                objAaT = c1731ApSA0W.A04();
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(C2VU.A04, 0L, null, bfm, 3078, 6);
            String str = hatchCheckpointChallenge.accountName;
            AuraCardKt.m2484AuraCardjQVUvHA(bRg2, auraCardStyleM2500listoAWOtXo, new AuraCardContent((C7BY.A0j(str) || str == null) ? null : AnonymousClass005.A0X(str), (AuraIconAndHeadlineStyle) null, (BO6) null, (B6A) null, apQ, (G0U) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2097134, (C06H) null), null, B1V.A00(bfm, new AnonymousClass3(hatchCheckpointChallenge), -821010659), null, null, null, null, null, false, false, null, null, 0L, false, null, null, bfm, ((iA0T >> 3) & 14) | RuntimeInternals.IOPRIO_BACKGROUND, 0, 262120);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(hatchCheckpointChallenge, bRg2, i, i2);
        }
    }

    public static final void NativeLoginCheckpointScreen(HatchCheckpointChallenge hatchCheckpointChallenge, NativeLoginCheckpointAction nativeLoginCheckpointAction, Function0<Unit> function0, Function0<Unit> function02, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchCheckpointChallenge, 0);
        AnonymousClass005.A11(nativeLoginCheckpointAction, function0, function02, 1);
        bfm.AgG(301180720);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchCheckpointChallenge) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass005.A09(bfm, nativeLoginCheckpointAction);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function02);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, z);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, HatchImpressionModifierKt.hatchImpression(bRg2, HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_PRE_AUTH, HatchScreen.LOGIN_CHECKPOINT, HatchComponent.LOGIN_CHECKPOINT_NOTICE, null, null, null, 500L, 0.0f, null, null, null), AuraContentRole.Focused, 0L, null, null, null, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, NativeLoginCommonKt.NATIVE_LOGIN_CONTENT_TOP_SPACING, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass1(nativeLoginCheckpointAction, z, function0, function02, hatchCheckpointChallenge), -1740409653), bfm, 817889670, 0, 805306368, 535821688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchCheckpointChallenge, nativeLoginCheckpointAction, function0, function02, z, bRg2, i, i2);
        }
    }

    public static final boolean getHasAccountDetails(HatchCheckpointChallenge hatchCheckpointChallenge) {
        return (C7BY.A0j(hatchCheckpointChallenge.accountName) && C7BY.A0j(hatchCheckpointChallenge.accountEmail) && hatchCheckpointChallenge.suspendedOn == null) ? false : true;
    }

    public static final String formatLongDate(LocalDate localDate, Locale locale) {
        AnonymousClass003.A0u(localDate, locale);
        String str = localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale));
        C7384Etj.A0U(str);
        return str;
    }
}
