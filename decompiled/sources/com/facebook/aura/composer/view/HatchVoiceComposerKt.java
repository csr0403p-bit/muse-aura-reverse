package com.facebook.aura.composer.view;

import X.AKQ;
import X.AT5;
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
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0zJ;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchVoiceComposerKt {

    /* renamed from: com.facebook.aura.composer.view.HatchVoiceComposerKt$DictationTimer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WaveformBuffer $waveformBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WaveformBuffer waveformBuffer, BRg bRg, int i, int i2) {
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
            HatchVoiceComposerKt.DictationTimer(this.$waveformBuffer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DictationTimer(WaveformBuffer waveformBuffer, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        C7384Etj.A0Y(waveformBuffer, 0);
        bfm.AgG(905222901);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(waveformBuffer, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            long j = auraColorsA0c.primaryText;
            long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.3f);
            long elapsedSeconds = waveformBuffer.getElapsedSeconds();
            boolean zA0A = MutableState.A0A(waveformBuffer.isProcessing$delegate);
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(C2VU.A09, false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(elapsedSeconds / 60), Long.valueOf(elapsedSeconds % 60)}, 2));
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTypographyA0f.bodyRegular, null, null, null, null, null, null, null, "tnum", 0, 0, 0, 16777151, 0L, 0L, 0L, 0L);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(C10G.A0D(bs0, 40.0f, Float.NaN), 16.0f, 13.0f, 4.0f, 13.0f);
            boolean zA66 = bfm.A66(zA0A);
            Object objAaT = bfm.AaT();
            if (zA66 || objAaT == C78N.A00) {
                objAaT = new HatchVoiceComposerKt$DictationTimer$1$1$1(zA0A);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0W(bRgA0C, objAaT), jA04, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            if (zA0A) {
                bfm.AgE(-1558358325);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C3U4.A0C(bs0, 16.0f, 0.0f, 4.0f, 0.0f), AuraSpinnerStyle.Companion.small(bfm, 6), jA04, bfm, (AuraSpinnerStyle.$stable << 3) | 6, 0);
            } else {
                bfm.AgE(-1558196877);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(waveformBuffer, bRgA0Q, i, i2);
        }
    }

    /* renamed from: DictationWaveform-3IgeMak, reason: not valid java name */
    public static final void m442DictationWaveform3IgeMak(WaveformBuffer waveformBuffer, long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(waveformBuffer, 0);
        bfm.AgG(1758587064);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(waveformBuffer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0I(bfm, waveformBuffer.sampleCount);
            }
            AT5 at5 = (AT5) objAaT;
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(at5);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchVoiceComposerKt$DictationWaveform$1$1(at5, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, unit);
            BRg bRgA07 = C3U4.A07(C10G.A04(bRg2, 32.0f), 4.0f);
            boolean zA1T = AnonymousClass001.A1T(bfm, at5, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(waveformBuffer))) | AnonymousClass003.A1C(iA05);
            Object objAaT3 = bfm.AaT();
            if (zA1T || objAaT3 == obj) {
                objAaT3 = new HatchVoiceComposerKt$DictationWaveform$2$1(waveformBuffer, at5, j);
                bfm.Ai0(objAaT3);
            }
            C0zJ.A00(bRgA07, (G0U) objAaT3, bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchVoiceComposerKt$DictationWaveform$3(waveformBuffer, j, bRg2, i, i2);
        }
    }
}
