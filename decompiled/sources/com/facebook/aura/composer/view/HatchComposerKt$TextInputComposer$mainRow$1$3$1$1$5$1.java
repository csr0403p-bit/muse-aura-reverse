package com.facebook.aura.composer.view;

import X.AKQ;
import X.AP0;
import X.ARE;
import X.ARi;
import X.Ab8;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C05423bo;
import X.C0A8;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1890At8;
import X.C1AC;
import X.C1Ge;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC04981Yd;
import X.InterfaceC1009APa;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC2143AzF;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.composer.dictation.WaveformBuffer;
import com.facebook.aura.composer.view.ComposerMode;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$5$1 extends AbstractC7559F3s implements G0W<InterfaceC1009APa, BFM, Integer, Unit> {
    public final /* synthetic */ boolean $animatesInput;
    public final /* synthetic */ ComposerMode $composerMode;
    public final /* synthetic */ String $effectiveHintText;
    public final /* synthetic */ boolean $hasPlusButton;
    public final /* synthetic */ BRg $inputModifier;
    public final /* synthetic */ MutableState<Boolean> $isInputLayoutSettled$delegate;
    public final /* synthetic */ boolean $isInputRowStacked;
    public final /* synthetic */ MutableState<Boolean> $isInputStacked$delegate;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leadingButtons;
    public final /* synthetic */ InterfaceC2143AzF $logTypeOnUserEdit;
    public final /* synthetic */ G0U<List<? extends Uri>, Unit> $onAddImageUris;
    public final /* synthetic */ Function0<Unit> $onCancelDictation;
    public final /* synthetic */ String $prefixText;
    public final /* synthetic */ C1890At8 $state;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingButtons;
    public final /* synthetic */ WaveformBuffer $waveformBuffer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$5$1(MutableState<Boolean> mutableState, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z2, ComposerMode composerMode, C1890At8 c1890At8, InterfaceC2143AzF interfaceC2143AzF, String str, String str2, G0U<? super List<? extends Uri>, Unit> g0u, MutableState<Boolean> mutableState2, BRg bRg, boolean z3, Function0<Unit> function0, WaveformBuffer waveformBuffer, G0V<? super BFM, ? super Integer, Unit> g0v2) {
        super(3);
        this.$isInputLayoutSettled$delegate = mutableState;
        this.$isInputRowStacked = z;
        this.$leadingButtons = g0v;
        this.$animatesInput = z2;
        this.$composerMode = composerMode;
        this.$state = c1890At8;
        this.$logTypeOnUserEdit = interfaceC2143AzF;
        this.$effectiveHintText = str;
        this.$prefixText = str2;
        this.$onAddImageUris = g0u;
        this.$isInputStacked$delegate = mutableState2;
        this.$inputModifier = bRg;
        this.$hasPlusButton = z3;
        this.$onCancelDictation = function0;
        this.$waveformBuffer = waveformBuffer;
        this.$trailingButtons = g0v2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1009APa interfaceC1009APa, BFM bfm, Integer num) {
        invoke(interfaceC1009APa, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(final InterfaceC1009APa interfaceC1009APa, BFM bfm, int i) {
        int iA05 = i;
        C7384Etj.A0Y(interfaceC1009APa, 0);
        if ((i & 6) == 0) {
            iA05 = i | AnonymousClass002.A05(AnonymousClass004.A1X(interfaceC1009APa, bfm, iA05) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            BRg bRgThen = BRg.A00;
            if (MutableState.A0A((MutableState) this.$isInputLayoutSettled$delegate)) {
                bRgThen = C11U.A00(bRgThen).then(new ARi(AnonymousClass005.A0O(), C2VU.A08));
            }
            boolean z = this.$isInputRowStacked;
            G0V<BFM, Integer, Unit> g0v = this.$leadingButtons;
            boolean z2 = this.$animatesInput;
            ComposerMode composerMode = this.$composerMode;
            C1890At8 c1890At8 = this.$state;
            InterfaceC2143AzF interfaceC2143AzF = this.$logTypeOnUserEdit;
            String str = this.$effectiveHintText;
            String str2 = this.$prefixText;
            G0U<List<? extends Uri>, Unit> g0u = this.$onAddImageUris;
            MutableState<Boolean> mutableState = this.$isInputStacked$delegate;
            MutableState<Boolean> mutableState2 = this.$isInputLayoutSettled$delegate;
            BRg bRg = this.$inputModifier;
            boolean z3 = this.$hasPlusButton;
            Function0<Unit> function0 = this.$onCancelDictation;
            WaveformBuffer waveformBuffer = this.$waveformBuffer;
            G0V<BFM, Integer, Unit> g0v2 = this.$trailingButtons;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v3);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
            C1AC c1ac = C2VU.A04;
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v3);
            BPg.A02(bfm, akqA042, g0v4);
            AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C90m c90m = C90m.A00;
            if (!z) {
                bfm.AgE(1976828424);
                AnonymousClass001.A1H(bfm, g0v, 6);
            } else {
                bfm.AgE(1152154378);
            }
            BBI.A0R(bbi, false);
            BRg bRgAiP = c90m.AiP(bRgThen, 1.0f, true);
            if (z) {
                bRgAiP = bRgAiP.then(C3U4.A0C(bRgThen, 8.0f, 0.0f, 16.0f, 0.0f));
            }
            if (z2) {
                final AP0 ap0 = C1Ge.A00;
                final C05423bo c05423bo = new C05423bo(0);
                BRg bRgThen2 = new Ab8<ARE>(ap0, interfaceC1009APa, c05423bo) { // from class: X.3VM
                    public final AP0 A00;
                    public final InterfaceC1009APa A01;
                    public final G0V<BL4, Constraints, Constraints> A02;

                    @Override // X.Ab8
                    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                        return new ARE(this.A00, this.A01, this.A02);
                    }

                    @Override // X.Ab8
                    public final boolean equals(Object obj) {
                        if (obj instanceof C3VM) {
                            C3VM c3vm = (C3VM) obj;
                            if (C7384Etj.areEqual(c3vm.A01, this.A01) && C7384Etj.areEqual(c3vm.A00, this.A00) && c3vm.A02 == this.A02) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // X.Ab8
                    public final int hashCode() {
                        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01))) + 1237;
                    }

                    @Override // X.Ab8
                    public final void inspectableProperties(ASF asf) {
                        asf.A01 = "boundsAnimation";
                        BHD bhd = asf.A02;
                        bhd.A01("lookaheadScope", this.A01);
                        bhd.A01("boundsTransform", this.A00);
                        bhd.A01("onChooseMeasureConstraints", this.A02);
                        bhd.A01("animateMotionFrameOfReference", AnonymousClass001.A0h());
                    }

                    @Override // X.Ab8
                    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                        ARE are = (ARE) abstractC1439Aj8;
                        are.A01 = this.A01;
                        are.A00 = this.A00;
                        are.A02 = this.A02;
                    }

                    {
                        this.A01 = interfaceC1009APa;
                        this.A00 = ap0;
                        this.A02 = c05423bo;
                    }
                }.then(bRgThen);
                final C05423bo c05423bo2 = new C05423bo(1);
                bRgAiP = bRgAiP.then(bRgThen2.then(new Ab8<ARE>(ap0, interfaceC1009APa, c05423bo2) { // from class: X.3VM
                    public final AP0 A00;
                    public final InterfaceC1009APa A01;
                    public final G0V<BL4, Constraints, Constraints> A02;

                    @Override // X.Ab8
                    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                        return new ARE(this.A00, this.A01, this.A02);
                    }

                    @Override // X.Ab8
                    public final boolean equals(Object obj) {
                        if (obj instanceof C3VM) {
                            C3VM c3vm = (C3VM) obj;
                            if (C7384Etj.areEqual(c3vm.A01, this.A01) && C7384Etj.areEqual(c3vm.A00, this.A00) && c3vm.A02 == this.A02) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // X.Ab8
                    public final int hashCode() {
                        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass005.A0E(this.A01))) + 1237;
                    }

                    @Override // X.Ab8
                    public final void inspectableProperties(ASF asf) {
                        asf.A01 = "boundsAnimation";
                        BHD bhd = asf.A02;
                        bhd.A01("lookaheadScope", this.A01);
                        bhd.A01("boundsTransform", this.A00);
                        bhd.A01("onChooseMeasureConstraints", this.A02);
                        bhd.A01("animateMotionFrameOfReference", AnonymousClass001.A0h());
                    }

                    @Override // X.Ab8
                    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                        ARE are = (ARE) abstractC1439Aj8;
                        are.A01 = this.A01;
                        are.A00 = this.A00;
                        are.A02 = this.A02;
                    }

                    {
                        this.A01 = interfaceC1009APa;
                        this.A00 = ap0;
                        this.A02 = c05423bo2;
                    }
                }));
            }
            BRg bRgA0U = AnonymousClass001.A0U(C10G.A01(C2VU.A05, bRgAiP, true), 48.0f);
            if (C7384Etj.areEqual(composerMode, ComposerMode.TextInput.INSTANCE)) {
                bfm.AgE(1976846647);
                boolean z4 = !z;
                boolean zA1W = AnonymousClass004.A1W(bfm, mutableState2, z, bfm.A65(mutableState));
                Object objAaT = bfm.AaT();
                if (zA1W || objAaT == C78N.A00) {
                    objAaT = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$5$1$2$1$1$1(z, mutableState, mutableState2);
                    bfm.Ai0(objAaT);
                }
                HatchComposerKt.ComposerRichContentInput(c1890At8, interfaceC2143AzF, str, str2, g0u, z4, (G0V) objAaT, bRgA0U.then(bRg), bfm, 0, 0);
            } else if (C7384Etj.areEqual(composerMode, ComposerMode.TapDictation.INSTANCE)) {
                bfm.AgE(1153562863);
                if (!z3) {
                    bfm.AgE(1153598885);
                    TapDictationComposerKt.DictationCancelButton(function0, null, bfm, 0, 2);
                } else {
                    bfm.AgE(1153695946);
                }
                BBI.A0R(bbi, false);
                TapDictationComposerKt.TapDictationInput(waveformBuffer, bRgA0U, bfm, WaveformBuffer.$stable, 0);
            } else if (C7384Etj.areEqual(composerMode, ComposerMode.HoldDictation.INSTANCE)) {
                bfm.AgE(1976887676);
                HoldDictationComposerKt.HoldDictationInput(waveformBuffer, bRgA0U, bfm, WaveformBuffer.$stable, 0);
            } else {
                throw AnonymousClass003.A0k(bfm, bbi, 1976844451);
            }
            BBI.A0R(bbi, false);
            if (!z) {
                bfm.AgE(1976894793);
                AnonymousClass001.A1H(bfm, g0v2, 6);
            } else {
                bfm.AgE(1154212778);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            if (z) {
                bfm.AgE(-1974955618);
                BRg bRgA04 = C10G.A04(bRgThen, 48.0f);
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA04);
                AnonymousClass005.A0n(bfm, bbi, function02);
                BPg.A02(bfm, interfaceC1380AiAA002, g0v3);
                BPg.A02(bfm, akqA043, g0v4);
                AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA013, g0vA0u);
                g0v.invoke(bfm, 6);
                C01N.A07(bfm, c90m.AiP(bRgThen, 1.0f, true));
                g0v2.invoke(bfm, 6);
                BBI.A0R(bbi, true);
            } else {
                bfm.AgE(-1974653306);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            return;
        }
        bfm.Afo();
    }
}
