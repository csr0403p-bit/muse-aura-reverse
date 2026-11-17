package com.facebook.aura.ageverification;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C10G;
import X.C1515AkP;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AgeStepInfoSheetKt {

    /* renamed from: com.facebook.aura.ageverification.AgeStepInfoSheetKt$AgeStepInfoRowContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AgeStepInfoRow $row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AgeStepInfoRow ageStepInfoRow, BRg bRg, int i, int i2) {
            super(2);
            this.$row = ageStepInfoRow;
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
            AgeStepInfoSheetKt.AgeStepInfoRowContent(this.$row, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeStepInfoSheetKt$AgeStepInfoSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C108842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108842(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12006b);
                AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
                BRg bRgA0B = C3U4.A0B(C10G.A02, AuraDimensKt.SpacingLargePlusMicro, AuraDimensKt.SpacingLarge);
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new AgeStepInfoSheetKt$AgeStepInfoSheet$2$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0B, auraLabelButtonStyleSecondary, null, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 0, 0, 0, 134201317);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeStepInfoSheetKt$AgeStepInfoSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AgeStepInfo $info;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AgeStepInfo ageStepInfo) {
            super(3);
            this.$info = ageStepInfo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                Iterator<AgeStepInfoRow> it = this.$info.getRows().iterator();
                while (it.hasNext()) {
                    AgeStepInfoSheetKt.AgeStepInfoRowContent(it.next(), C3U4.A07(BRg.A00, AuraDimensKt.SpacingXlarge), bfm, 0, 0);
                }
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ageverification.AgeStepInfoSheetKt$AgeStepInfoSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AgeStepInfo $info;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(AgeStepInfo ageStepInfo, BRg bRg, int i, int i2) {
            super(2);
            this.$info = ageStepInfo;
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
            AgeStepInfoSheetKt.AgeStepInfoSheet(this.$info, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AgeStepInfoRowContent(AgeStepInfoRow ageStepInfoRow, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(1708529740);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ageStepInfoRow) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingLargePlusMicro);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, ageStepInfoRow.iconRes, 0), AuraIconSize.X_SMALL, null, C06G.A0A(bfm), null, bfm, AnonymousClass001.A03(), 41);
            if (ageStepInfoRow.namesApp) {
                bfm.AgE(1606128323);
                strA01 = AnonymousClass006.A0v(bfm, ageStepInfoRow.textRes);
            } else {
                bfm.AgE(1606130511);
                strA01 = AbstractC2271BQs.A01(bfm, ageStepInfoRow.textRes);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0O(c90m, BRg.A00, true), C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(ageStepInfoRow, bRg2, i, i2);
        }
    }

    public static final void AgeStepInfoSheet(AgeStepInfo ageStepInfo, BRg bRg, BFM bfm, int i, int i2) {
        String strA0g;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(ageStepInfo, 0);
        bfm.AgG(1942336070);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, ageStepInfo) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, ageStepInfo.getTitleRes());
            Integer subtitleRes = ageStepInfo.getSubtitleRes();
            if (subtitleRes == null) {
                AnonymousClass003.A0l(bfm, -1960198275);
                strA0g = null;
            } else {
                strA0g = AnonymousClass003.A0g(bfm, subtitleRes, -1960198274);
                AnonymousClass001.A1D(bfm);
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(null, bRg2, null, new AuraBottomSheetHeaderConfig(strA01, strA0g, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new C108842(auraNavigatorA0b), -577708609), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass3(ageStepInfo), -456422525), bfm, (iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND, 48, 2021);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(ageStepInfo, bRg2, i, i2);
        }
    }
}
