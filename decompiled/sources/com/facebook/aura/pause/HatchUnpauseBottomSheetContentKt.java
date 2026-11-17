package com.facebook.aura.pause;

import X.AKH;
import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
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
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchUnpauseBottomSheetContentKt {

    /* renamed from: com.facebook.aura.pause.HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onSubmit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$onSubmit = g0u;
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
            HatchUnpauseBottomSheetContentKt.UnpauseHatchRecoveryKeyPage(this.$onSubmit, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void UnpauseHatchRecoveryKeyPage(G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0u, 0);
        bfm.AgG(1002685914);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, g0u) : i;
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
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState = (MutableState) objAaT;
            float f = AnonymousClass002.A0d(bfm).bottomsheetRoundedCorner;
            BRg bRgA01 = AbstractC1754Apr.A01(bRg2);
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA01, f2, 0.0f, f2, f2);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA012 = C1b8.A01(C11U.A01(bRgA0C.then(c1062ATq), f), AnonymousClass002.A0c(bfm).modal);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A02, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA013, i4);
            BS0 bs0 = BRg.A00;
            float f3 = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f3);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f65), C3U4.A0B(bs0, C06G.A00(bfm), 0.0f), C06G.A0C(bfm), AnonymousClass002.A0f(bfm).title2Medium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C01N.A08(bfm, bs0, f3);
            String strA05 = MutableState.A05(mutableState);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0B = C3U4.A0B(c1062ATq, C06G.A01(bfm, akh), 0.0f);
            G0V<BFM, Integer, Unit> g0v = ComposableSingletons$HatchUnpauseBottomSheetContentKt.lambda$1819611192;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$1$1(mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraTextInputKt.AuraTextInput(strA05, null, bRgA0B, g0v, null, null, null, c1822ArmA0T, false, 0, 0, null, null, null, null, false, false, false, false, null, (G0U) objAaT2, bfm, 100666368, 1572864, 6, 982642);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLarge);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f64);
            AuraLabelButtonStyle auraLabelButtonStylePrimary = AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            boolean z = MutableState.A01(mutableState) >= 32;
            BRg bRgA0B2 = C3U4.A0B(c1062ATq, C06G.A01(bfm, akh), 0.0f);
            boolean z2 = (iA0T & 14) == 4;
            Object objAaT3 = bfm.AaT();
            if (z2 || objAaT3 == obj) {
                objAaT3 = new HatchUnpauseBottomSheetContentKt$UnpauseHatchRecoveryKeyPage$1$2$1(g0u, mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0B2, auraLabelButtonStylePrimary, auraButtonSize, null, false, false, z, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134200773);
            C01N.A03(bfm, bbi, bs0, AuraDimensKt.SpacingMedium);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(g0u, bRg2, i, i2);
        }
    }
}
