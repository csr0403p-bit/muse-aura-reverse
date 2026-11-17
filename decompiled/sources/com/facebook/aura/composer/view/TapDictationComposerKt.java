package com.facebook.aura.composer.view;

import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
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
import X.BOf;
import X.BRg;
import X.C00x;
import X.C05121Yx;
import X.C0dx;
import X.C0nh;
import X.C0v5;
import X.C10G;
import X.C11S;
import X.C1515AkP;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class TapDictationComposerKt {

    /* renamed from: com.facebook.aura.composer.view.TapDictationComposerKt$DictationCancelButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onCancel = function0;
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
            TapDictationComposerKt.DictationCancelButton(this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.TapDictationComposerKt$DictationStopButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C111912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ WaveformBuffer $waveformBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111912(WaveformBuffer waveformBuffer, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$waveformBuffer = waveformBuffer;
            this.$onClick = function0;
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
            TapDictationComposerKt.DictationStopButton(this.$waveformBuffer, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.composer.view.TapDictationComposerKt$TapDictationInput$2, reason: invalid class name and case insensitive filesystem */
    public final class C111922 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ WaveformBuffer $waveformBuffer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111922(WaveformBuffer waveformBuffer, BRg bRg, int i, int i2) {
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
            TapDictationComposerKt.TapDictationInput(this.$waveformBuffer, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DictationCancelButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-1292550001);
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
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120713);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass001.A1L(iA0T);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new TapDictationComposerKt$DictationCancelButton$1$1(c0dxA0T, function0);
                bfm.Ai0(objAaT);
            }
            HatchComposerKt.m431ComposerInlineIconButtonHYR8e34(R.drawable.trash_wght400_outline_24, strA01, (Function0) objAaT, bRg2, false, 0.0f, bfm, (iA0T << 6) & 7168, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(function0, bRg2, i, i2);
        }
    }

    public static final void DictationStopButton(WaveformBuffer waveformBuffer, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(waveformBuffer, function0);
        bfm.AgG(1696827952);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(waveformBuffer, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
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
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120727);
            boolean zA0A = MutableState.A0A(waveformBuffer.isProcessing$delegate);
            boolean z = !zA0A;
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_stop_square, zA1b ? 1 : 0);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new TapDictationComposerKt$DictationStopButton$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            C0nh.A00(bfm, C3U4.A09(C1b8.A03(C3U4.A09(C10G.A07(C11S.A00(AbstractC07539Wl.A00(C0v5.A01(new C05121Yx(), null, AnonymousClass001.A0Y(bRg2, objAaT, zA1b), new C1YD(zA1b ? 1 : 0), null, function0, z), "hatch-dictation-stop-button"), zA0A ? 0.3f : 1.0f), 48.0f), 6.0f), C1D8.A00, AuraAdaptiveColorsKt.adaptiveSecondaryFill(auraColorsA0c, bfm, AuraColors.$stable)), 9.0f), aVyA00, null, null, AVy.$stable | 48, 48, auraColorsA0c.primaryIcon.enabled, zA1b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111912(waveformBuffer, function0, bRg2, i, i2);
        }
    }

    public static final void TapDictationInput(WaveformBuffer waveformBuffer, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(waveformBuffer, 0);
        bfm.AgG(-149163049);
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
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            int i4 = WaveformBuffer.$stable;
            int i5 = iA05 & 14;
            HatchVoiceComposerKt.DictationTimer(waveformBuffer, null, bfm, i4 | i5, 2);
            HatchVoiceComposerKt.m442DictationWaveform3IgeMak(waveformBuffer, auraColorsA0c.primaryText, C3U4.A0C(c90m.AiP(BRg.A00, 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f), bfm, i4 | i5, 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C111922(waveformBuffer, bRg2, i, i2);
        }
    }
}
