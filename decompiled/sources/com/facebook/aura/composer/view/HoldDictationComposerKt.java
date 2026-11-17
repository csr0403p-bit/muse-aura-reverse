package com.facebook.aura.composer.view;

import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1822Arm;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HoldDictationComposerKt {

    /* renamed from: com.facebook.aura.composer.view.HoldDictationComposerKt$HoldDictationInput$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WaveformBuffer $waveformBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WaveformBuffer waveformBuffer, BRg bRg, int i, int i2) {
            super(2);
            this.$waveformBuffer = waveformBuffer;
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
            HoldDictationComposerKt.HoldDictationInput(this.$waveformBuffer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HoldDictationInput(WaveformBuffer waveformBuffer, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(waveformBuffer, 0);
        bfm.AgG(1055821059);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(waveformBuffer, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Unit unit = Unit.INSTANCE;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new HoldDictationComposerKt$HoldDictationInput$1$1(mutableState, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
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
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            int i5 = WaveformBuffer.$stable;
            int i6 = iA05 & 14;
            HatchVoiceComposerKt.DictationTimer(waveformBuffer, null, bfm, i5 | i6, 2);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(1017829813);
                z = true;
                HatchVoiceComposerKt.m442DictationWaveform3IgeMak(waveformBuffer, auraColorsA0c.primaryText, c90m.AiP(BRg.A00, 1.0f, true), bfm, i6 | i5, 0);
            } else {
                bfm.AgE(1018005955);
                z = true;
                BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgAiP);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120714);
                C1822Arm c1822Arm = auraTypographyA0f.footnoteRegular;
                long j2 = auraColorsA0c.primaryText;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.5f), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(waveformBuffer, bRg2, i, i2);
        }
    }
}
