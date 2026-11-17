package com.facebook.aura.ui;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchPublishUnpublishedBottomSheetKt {

    /* renamed from: com.facebook.aura.ui.HatchPublishUnpublishedBottomSheetKt$HatchPublishUnpublishedBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ AuraColors $colors;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ AuraTypography $typography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraTypography auraTypography, AuraColors auraColors, Function0<Unit> function0) {
            super(3);
            this.$typography = auraTypography;
            this.$colors = auraColors;
            this.$onDismiss = function0;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                BRg bRgA07 = C3U4.A07(c1062ATq, 24.0f);
                C3TH c3th = C2VU.A00;
                AuraTypography auraTypography = this.$typography;
                AuraColors auraColors = this.$colors;
                Function0<Unit> function0 = this.$onDismiss;
                InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, c3th, 48);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                C01N.A08(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba2), null, auraColors.primaryText, auraTypography.title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 8.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ba6), null, auraColors.secondaryText, auraTypography.subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                C01N.A08(bfm, bs0, 24.0f);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120b9b), null, c1062ATq, AuraButtonStyles.INSTANCE.primaryAlt(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
                C01N.A04(bfm, bbi, bs0, 16.0f, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchPublishUnpublishedBottomSheetKt$HatchPublishUnpublishedBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, int i) {
            super(2);
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPublishUnpublishedBottomSheetKt.HatchPublishUnpublishedBottomSheet(this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchPublishUnpublishedBottomSheet(Function0<Unit> function0, BFM bfm, int i) {
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-962121260);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(AuraContainer.SecondaryBottomSheet.INSTANCE, null, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(false, null, false, bfm, 0, 7), null, null, null, null, null, null, false, false, false, B1V.A00(bfm, new AnonymousClass1(AnonymousClass002.A0f(bfm), AnonymousClass002.A0c(bfm), function0), -153980073), bfm, ((iA0T << 6) & 896) | 6, 3072, 8178);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, i);
        }
    }
}
