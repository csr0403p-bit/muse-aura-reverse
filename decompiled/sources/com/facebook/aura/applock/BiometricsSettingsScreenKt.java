package com.facebook.aura.applock;

import X.AKL;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00r;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C7bA;
import X.C8328Fbu;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.R;
import com.facebook.aura.common.ui.settings.HatchSettingsDescriptionKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.header.AuraSectionHeaderKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class BiometricsSettingsScreenKt {

    /* renamed from: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ FragmentActivity $activity;
        public final /* synthetic */ boolean $biometricAvailable;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ C1BO<Boolean> $enabled$delegate;
        public final /* synthetic */ Executor $executor;
        public final /* synthetic */ C8328Fbu $promptInfo;
        public final /* synthetic */ AppLockRepository $repository;
        public final /* synthetic */ boolean $shouldHideSettings;
        public final /* synthetic */ boolean $shouldOfferEnrollment;
        public final /* synthetic */ C1BO<AppLockTimeout> $timeout$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, boolean z2, boolean z3, C1BO<Boolean> c1bo, Context context, FragmentActivity fragmentActivity, Executor executor, C3UX c3ux, AppLockRepository appLockRepository, C8328Fbu c8328Fbu, C1BO<? extends AppLockTimeout> c1bo2) {
            super(4);
            this.$shouldHideSettings = z;
            this.$biometricAvailable = z2;
            this.$shouldOfferEnrollment = z3;
            this.$enabled$delegate = c1bo;
            this.$context = context;
            this.$activity = fragmentActivity;
            this.$executor = executor;
            this.$coroutineScope = c3ux;
            this.$repository = appLockRepository;
            this.$promptInfo = c8328Fbu;
            this.$timeout$delegate = c1bo2;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m250invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m250invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA0T = AnonymousClass005.A0T(bfm, C10G.A01);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0C = C3U4.A0C(bRgA0T, C3cG.A00(bfm, auraTheme), 0.0f, C3cG.A00(bfm, auraTheme), C3cG.A00(bfm, auraTheme));
            boolean z = this.$shouldHideSettings;
            boolean z2 = this.$biometricAvailable;
            boolean z3 = this.$shouldOfferEnrollment;
            C1BO<Boolean> c1bo = this.$enabled$delegate;
            Context context = this.$context;
            FragmentActivity fragmentActivity = this.$activity;
            Executor executor = this.$executor;
            C3UX c3ux = this.$coroutineScope;
            AppLockRepository appLockRepository = this.$repository;
            C8328Fbu c8328Fbu = this.$promptInfo;
            C1BO<AppLockTimeout> c1bo2 = this.$timeout$delegate;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            if (z) {
                bfm.AgE(1415268912);
            } else {
                bfm.AgE(1411712251);
                boolean zA1V = AnonymousClass005.A1V(bfm, c3ux, appLockRepository, c8328Fbu, AnonymousClass005.A1V(bfm, context, fragmentActivity, executor, AnonymousClass004.A1W(bfm, c1bo, z3, bfm.A66(z2))));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$1$1(z2, z3, context, fragmentActivity, executor, c3ux, appLockRepository, c8328Fbu, c1bo);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT, bfm, 6, 7);
                C01N.A05(bfm, bs0);
                HatchSettingsDescriptionKt.HatchSettingsDescription(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120ed0), null, bfm, 0, 2);
                if (C1BO.A0F(c1bo) && z2) {
                    bfm.AgE(1413885785);
                    C01N.A08(bfm, bs0, AuraDimensKt.SpacingMedium);
                    AuraSectionHeaderKt.AuraSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ecd), null, null, bfm, 48, 4);
                    boolean zA1O = C3cH.A1O(bfm, c1bo2, c3ux, appLockRepository);
                    Object objAaT2 = bfm.AaT();
                    if (zA1O || objAaT2 == C78N.A00) {
                        objAaT2 = new BiometricsSettingsScreenKt$BiometricsSettingsScreen$2$1$2$1(c3ux, appLockRepository, c1bo2);
                        bfm.Ai0(objAaT2);
                    }
                    HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 6, 7);
                } else {
                    bfm.AgE(1415260976);
                }
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.applock.BiometricsSettingsScreenKt$BiometricsSettingsScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
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
            BiometricsSettingsScreenKt.BiometricsSettingsScreen(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppLockTimeout.values().length];
            try {
                AnonymousClass002.A13(AppLockTimeout.IMMEDIATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AppLockTimeout.ONE_MINUTE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AppLockTimeout.FIVE_MINUTES, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AppLockTimeout.FIFTEEN_MINUTES, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void BiometricsSettingsScreen(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-333813939);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Context contextA0H = AnonymousClass002.A0H(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AppLockRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            AppLockRepository appLockRepository = (AppLockRepository) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            C1BO c1boA02 = C2CK.A02(bfm, appLockRepository.isEnabled());
            C1BO c1boA022 = C2CK.A02(bfm, appLockRepository.getTimeout());
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0O(bfm, AppLockBiometricSettingsKt.getBiometricStatus(contextA0H));
            }
            C00r c00r = (C00r) objAaT3;
            boolean z = !AppLockBiometricSettingsKt.shouldShowBiometricsSettings(c00r.AGd());
            boolean zA1M = AnonymousClass002.A1M(c00r.AGd());
            boolean zA1Q = AnonymousClass002.A1Q(c00r.AGd(), 11);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(contextA0H);
            Object objAaT4 = bfm.AaT();
            if (zA67 || objAaT4 == obj) {
                objAaT4 = new BiometricsSettingsScreenKt$BiometricsSettingsScreen$1$1(contextA0H, c00r);
                bfm.Ai0(objAaT4);
            }
            C7bA.A05(bfm, null, unit, (G0U) objAaT4, 6, 2);
            Object objA6v = bfm.A6v(AKL.A00);
            C7384Etj.A0Z(objA6v, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objA6v;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = contextA0H.getMainExecutor();
                bfm.Ai0(objAaT5);
            }
            Executor executor = (Executor) objAaT5;
            C7384Etj.A0X(executor);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120163);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120162);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206f0);
            boolean zA1R = AnonymousClass005.A1R(bfm, strA0v, strA01, strA012);
            Object objAaT6 = bfm.AaT();
            if (zA1R || objAaT6 == obj) {
                objAaT6 = AppLockBiometricSettingsKt.createAppLockPromptInfo(strA0v, strA01, strA012);
                bfm.Ai0(objAaT6);
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed1), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass2(z, zA1M, zA1Q, c1boA02, contextA0H, fragmentActivity, executor, c3ux, appLockRepository, (C8328Fbu) objAaT6, c1boA022), -279923928), bfm, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6 | (3670016 & (iA0T << 18)), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg2, i, i2);
        }
    }

    public static final /* synthetic */ AppLockTimeout access$BiometricsSettingsScreen$lambda$2(C1BO c1bo) {
        return (AppLockTimeout) c1bo.getValue();
    }

    public static final String resolveTimeoutLabel(AppLockTimeout appLockTimeout, BFM bfm, int i) {
        int i2;
        int iOrdinal = appLockTimeout.ordinal();
        if (iOrdinal == 0) {
            bfm.AgE(-1903086863);
            i2 = R.string._name_removed__res_0x7f120ecc;
        } else if (iOrdinal == 1) {
            bfm.AgE(-1903083670);
            i2 = R.string._name_removed__res_0x7f120eca;
        } else if (iOrdinal == 2) {
            bfm.AgE(-1903080630);
            i2 = R.string._name_removed__res_0x7f120ecb;
        } else {
            if (iOrdinal != 3) {
                throw AnonymousClass005.A0k(bfm, -1903088151);
            }
            bfm.AgE(-1903077493);
            i2 = R.string._name_removed__res_0x7f120ec9;
        }
        return AnonymousClass003.A0e(bfm, i2);
    }
}
