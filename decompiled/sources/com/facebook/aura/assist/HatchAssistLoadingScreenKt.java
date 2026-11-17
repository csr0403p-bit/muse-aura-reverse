package com.facebook.aura.assist;

import X.AKQ;
import X.AaM;
import X.AbstractC1754Apr;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C0v5;
import X.C0z7;
import X.C1515AkP;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchScreenLoadingStateKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAssistLoadingScreenKt {

    /* renamed from: com.facebook.aura.assist.HatchAssistLoadingScreenKt$HatchAssistLoadingScreen$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onDismissRequest = function0;
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
            HatchAssistLoadingScreenKt.HatchAssistLoadingScreen(this.$onDismissRequest, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchAssistLoadingScreen(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(1399900308);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
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
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120027);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A06, false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA01, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA012 = C1b8.A01(c0z7.AQJ(bs0), AnonymousClass002.A0c(bfm).scrim);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            BRg bRgA013 = C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj), bRgA012, new C1YD(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new HatchAssistLoadingScreenKt$HatchAssistLoadingScreen$1$2$1(strA01);
                bfm.Ai0(objAaT2);
            }
            C01N.A07(bfm, AnonymousClass001.A0Y(bRgA013, objAaT2, false));
            BRg bRgA014 = AbstractC1754Apr.A01(bs0);
            float fA00 = C06G.A00(bfm);
            float f = AuraDimensKt.SpacingSmall;
            BRg bRgA03 = C1b8.A03(AnonymousClass001.A0R(AuraContentFrameKt.auraContentWidth(C3U4.A0B(bRgA014, fA00, f), AuraContentRole.Standard, bfm, 48)), C1D8.A00(28.0f), AnonymousClass002.A0c(bfm).card);
            Unit unit = Unit.INSTANCE;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new PointerInputEventHandler() { // from class: com.facebook.aura.assist.HatchAssistLoadingScreenKt$HatchAssistLoadingScreen$1$3$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        Object objA06 = TapGestureDetectorKt.A06(bRr, htJ, null, null, null, TapGestureDetectorKt.A00);
                        return objA06 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA06;
                    }
                };
                bfm.Ai0(objAaT3);
            }
            BRg bRgA00 = AaM.A00(bRgA03, (PointerInputEventHandler) objAaT3, unit);
            float f2 = AuraDimensKt.SpacingXsmall;
            BRg bRgA0C = C3U4.A0C(bRgA00, f, f2, f2, f2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(f), bfm, C2VU.A04, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA015 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA015, g0vA0u);
            C90m c90m = C90m.A00;
            HatchScreenLoadingStateKt.HatchScreenLoadingState(null, bfm, 0, 1);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120173);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = HatchAssistLoadingScreenKt$HatchAssistLoadingScreen$1$4$1$1.INSTANCE;
                bfm.Ai0(objAaT4);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, AnonymousClass001.A0Y(bRgA0O, objAaT4, false), 0L, null, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16380);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120174), null, null, AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 12) & 57344, 0, 134201293);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }
}
