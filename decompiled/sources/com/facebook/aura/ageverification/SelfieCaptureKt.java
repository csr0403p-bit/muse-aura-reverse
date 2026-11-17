package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BQN;
import X.BRg;
import X.C0dx;
import X.C1BO;
import X.C1er;
import X.C2CK;
import X.C3cG;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.CH0;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.ageverification.SelfieCaptureViewModel;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.common.ui.KeepScreenOnKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SelfieCaptureKt {

    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureKt$SelfieCapture$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<SelfieStep> $step$delegate;
        public final /* synthetic */ SelfieCaptureViewModel $viewModel;

        public final void invoke(BRg bRg, BFM bfm, int i) {
            C7384Etj.A0Y(bRg, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, bRg);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 19, 18), bfm, i)) {
                bfm.Afo();
                return;
            }
            SelfieStep value = this.$step$delegate.getValue();
            if (value instanceof SelfieStep.Complete) {
                bfm.AgE(2053155768);
            } else {
                bfm.AgE(2053031799);
                MaxScreenBrightnessEffectKt.MaxScreenBrightnessEffect(bfm, 0);
                KeepScreenOnKt.KeepScreenOn(true, bfm, 6);
                SelfieCameraContentKt.SelfieCameraContent(value, this.$viewModel, bRg, bfm, (SelfieCaptureViewModel.$stable << 3) | ((i << 6) & 896), 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(SelfieCaptureViewModel selfieCaptureViewModel, C1BO<? extends SelfieStep> c1bo) {
            super(3);
            this.$viewModel = selfieCaptureViewModel;
            this.$step$delegate = c1bo;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
            invoke(bRg, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieCaptureKt$SelfieCapture$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $captureKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<SelfieStep.Complete, Unit> $onCaptured;
        public final /* synthetic */ Function0<Unit> $onUnavailable;
        public final /* synthetic */ boolean $recapture;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(int i, G0U<? super SelfieStep.Complete, Unit> g0u, Function0<Unit> function0, BRg bRg, boolean z, int i2, int i3) {
            super(2);
            this.$captureKey = i;
            this.$onCaptured = g0u;
            this.$onUnavailable = function0;
            this.$modifier = bRg;
            this.$recapture = z;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieCaptureKt.SelfieCapture(this.$captureKey, this.$onCaptured, this.$onUnavailable, this.$modifier, this.$recapture, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SelfieCapture(int i, G0U<? super SelfieStep.Complete, Unit> g0u, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        AnonymousClass003.A0x(g0u, function0);
        bfm.AgG(767011475);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i5 = i3 & 16;
        if (i5 != 0) {
            iA0D |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0D |= AnonymousClass004.A0r(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 9363, 9362), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            SelfieCaptureViewModel.Factory factory = new SelfieCaptureViewModel.Factory(AnonymousClass001.A0I(AnonymousClass002.A0H(bfm)), ((CH0) AnonymousClass002.A0h(bfm)).A01, i, zA1K);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            SelfieCaptureViewModel selfieCaptureViewModel = (SelfieCaptureViewModel) BQN.A00(factory, bodA00, AnonymousClass005.A0Y(bodA00), "selfie_capture", C3cG.A0x(SelfieCaptureViewModel.class));
            Integer numValueOf = Integer.valueOf(i);
            boolean zA1B = AnonymousClass003.A1B(iA0D) | bfm.A67(selfieCaptureViewModel) | ((57344 & iA0D) == 16384);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new SelfieCaptureKt$SelfieCapture$1$1(selfieCaptureViewModel, i, zA1K);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, selfieCaptureViewModel, numValueOf);
            C1BO c1boA02 = C2CK.A02(bfm, selfieCaptureViewModel.state);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass002.A0K(bfm, null, new SelfieCaptureKt$SelfieCapture$step$2$1(c1boA02));
            }
            C1BO c1bo = (C1BO) objAaT2;
            C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            int i6 = iA0D >> 6;
            MutableState mutableStateA002 = C1er.A00(bfm, function0);
            boolean zA1W = AnonymousClass005.A1W(bfm, c0dx, mutableStateA002, mutableStateA00, bfm.A67(selfieCaptureViewModel));
            Object objAaT3 = bfm.AaT();
            if (zA1W || objAaT3 == obj) {
                objAaT3 = new SelfieCaptureKt$SelfieCapture$2$1(selfieCaptureViewModel, c0dx, mutableStateA002, mutableStateA00, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A18(bfm, objAaT3, selfieCaptureViewModel);
            CameraPermissionGateKt.CameraPermissionGate(R.string._name_removed__res_0x7f12004f, bRg2, B1V.A00(bfm, new AnonymousClass3(selfieCaptureViewModel, c1bo), -850389686), bfm, (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(i, g0u, function0, bRg2, zA1K, i2, i3);
        }
    }

    public static final /* synthetic */ SelfieStep access$SelfieCapture$lambda$2(C1BO c1bo) {
        return (SelfieStep) c1bo.getValue();
    }
}
