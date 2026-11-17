package com.facebook.aura.confidentialvm.view;

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
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import com.facebook.aura.R;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchUiState;
import com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchViewModel;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy;
import com.facebook.aura.confidentialvm.view.setup.ConfidentialVmBenefitsKt;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ConfidentialVmDataChoiceContentKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmGlassesUnavailableNotice$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onShown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onShown = function0;
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
            ConfidentialVmDataChoiceContentKt.ConfidentialVmGlassesUnavailableNotice(this.$onShown, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.confidentialvm.view.ConfidentialVmDataChoiceContentKt$ConfidentialVmSvmKeptNotice$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            ConfidentialVmDataChoiceContentKt.ConfidentialVmSvmKeptNotice(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: ConfidentialVmDataChoiceContent-vz2T9sI, reason: not valid java name */
    public static final void m460ConfidentialVmDataChoiceContentvz2T9sI(ConfidentialVmSwitchUiState confidentialVmSwitchUiState, ConfidentialVmSwitchViewModel confidentialVmSwitchViewModel, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        String strA0r;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(confidentialVmSwitchUiState, confidentialVmSwitchViewModel);
        bfm.AgG(-1161379056);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(confidentialVmSwitchUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(confidentialVmSwitchViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A07(bfm, f2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            ConfidentialVmDataMigrationCopy confidentialVmDataMigrationCopy = confidentialVmSwitchUiState.dataMigrationCopy;
            BS0 bs0 = BRg.A00;
            BRg bRgA0T2 = AnonymousClass005.A0T(bfm, AnonymousClass001.A0N(c90l, bs0, zA1a));
            float f3 = AuraDimensKt.SpacingLarge;
            BRg bRgA0B = C3U4.A0B(bRgA0T2, f3, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
            boolean zIsMigrateOptionEnabled = ConfidentialVmSwitchUiState.Companion.isMigrateOptionEnabled();
            boolean zIsSwitchingBack = confidentialVmSwitchUiState.isSwitchingBack();
            int i5 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean z = i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(confidentialVmSwitchViewModel));
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$1$1(confidentialVmSwitchViewModel);
                bfm.Ai0(objAaT);
            }
            ConfidentialVmDataChoiceHeaderKt.ConfidentialVmDataChoiceHeader(confidentialVmDataMigrationCopy, zIsSwitchingBack, zIsMigrateOptionEnabled, (Function0) ((InterfaceC7353EnQ) objAaT), null, bfm, 0, 16);
            if (zIsMigrateOptionEnabled) {
                bfm.AgE(-2057683935);
                C01N.A08(bfm, bs0, f3);
                boolean zA67 = bfm.A67(confidentialVmDataMigrationCopy) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(confidentialVmSwitchUiState))) | (i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(confidentialVmSwitchViewModel)));
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$2$1(confidentialVmDataMigrationCopy, confidentialVmSwitchUiState, confidentialVmSwitchViewModel);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass007.A0o(c90l, bfm, objAaT2);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2056602810);
                BBI.A0R(bbi, false);
            }
            if (confidentialVmSwitchUiState.showGlassesUnavailableNotice) {
                bfm.AgE(-2056547909);
                boolean z2 = i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(confidentialVmSwitchViewModel));
                Object objAaT3 = bfm.AaT();
                if (z2 || objAaT3 == C78N.A00) {
                    objAaT3 = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$1$3$1(confidentialVmSwitchViewModel);
                    bfm.Ai0(objAaT3);
                }
                ConfidentialVmGlassesUnavailableNotice((Function0) ((InterfaceC7353EnQ) objAaT3), C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingLargePlusMicro, 0.0f, 0.0f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2056352826);
                BBI.A0R(bbi, false);
            }
            if (confidentialVmSwitchUiState.getShowsSvmKeptNotice()) {
                bfm.AgE(-2056310945);
                ConfidentialVmSvmKeptNotice(C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingLargePlusMicro, 0.0f, 0.0f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2056211962);
                BBI.A0R(bbi, false);
            }
            if (confidentialVmSwitchUiState.hasError) {
                bfm.AgE(-2056180218);
                ConfidentialVmDataChoiceScreenKt.ConfidentialVmSwitchErrorText(C3U4.A0C(bs0, 0.0f, AuraDimensKt.SpacingSmall, 0.0f, 0.0f), bfm, 0, 0);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2056087962);
                BBI.A0R(bbi, false);
            }
            C01N.A04(bfm, bbi, bs0, f3, zA1a);
            if (confidentialVmDataMigrationCopy == null || (strA01 = confidentialVmDataMigrationCopy.primaryButtonText) == null) {
                bfm.AgE(-628988937);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12022f);
            } else {
                bfm.AgE(-628989774);
            }
            BBI.A0R(bbi, false);
            if (confidentialVmDataMigrationCopy == null || (strA0r = confidentialVmDataMigrationCopy.secondaryButtonText) == null) {
                bfm.AgE(-628985744);
                strA0r = AnonymousClass001.A0r(bfm);
            } else {
                bfm.AgE(-628986643);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0C = C3U4.A0C(bs0, 0.0f, 0.0f, 0.0f, f2);
            boolean zA1X = AnonymousClass005.A1X(bfm, strA0r, auraNavigatorA0b, bfm.A65(strA01) | ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(confidentialVmSwitchUiState))), i5 == 32 || ((iA05 & 64) != 0 && bfm.A67(confidentialVmSwitchViewModel)));
            Object objAaT4 = bfm.AaT();
            if (zA1X || objAaT4 == C78N.A00) {
                objAaT4 = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$1$2$1(strA01, confidentialVmSwitchUiState, confidentialVmSwitchViewModel, strA0r, auraNavigatorA0b);
                bfm.Ai0(objAaT4);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0C, null, null, null, null, null, null, false, (G0U) objAaT4, bfm, 0, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new ConfidentialVmDataChoiceContentKt$ConfidentialVmDataChoiceContent$2(confidentialVmSwitchUiState, confidentialVmSwitchViewModel, f, f2, bRg2, i, i2);
        }
    }

    public static final void ConfidentialVmGlassesUnavailableNotice(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-2021839261);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            Unit unit = Unit.INSTANCE;
            boolean zA1B = AnonymousClass003.A1B(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ConfidentialVmDataChoiceContentKt$ConfidentialVmGlassesUnavailableNotice$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, unit);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120746);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = ConfidentialVmDataChoiceContentKt$ConfidentialVmGlassesUnavailableNotice$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            ConfidentialVmBenefitsKt.ConfidentialVmAvailabilityNotice(strA0v, AnonymousClass001.A0Y(bRg, objAaT2, false), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, bRg, i, i2);
        }
    }

    public static final void ConfidentialVmSvmKeptNotice(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(252669823);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12075c);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = ConfidentialVmDataChoiceContentKt$ConfidentialVmSvmKeptNotice$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            ConfidentialVmBenefitsKt.ConfidentialVmAvailabilityNotice(strA01, AnonymousClass001.A0Y(bRg, objAaT, false), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }
}
