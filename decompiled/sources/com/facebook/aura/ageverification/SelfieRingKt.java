package com.facebook.aura.ageverification;

import X.AHD;
import X.AbstractC1396AiR;
import X.AbstractC1532Ako;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.BoY;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1BO;
import X.C2CK;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SelfieRingKt {

    /* renamed from: com.facebook.aura.ageverification.SelfieRingKt$SelfieRing$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<HeadMovement> $current$delegate;
        public final /* synthetic */ AHD<CompletionFlash> $flashes;
        public final /* synthetic */ C1BO<Float> $progress;
        public final /* synthetic */ BoY $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BoY boY, C1BO<Float> c1bo, AHD<CompletionFlash> ahd, C1BO<? extends HeadMovement> c1bo2) {
            super(3);
            this.$view = boY;
            this.$progress = c1bo;
            this.$flashes = ahd;
            this.$current$delegate = c1bo2;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, interfaceC05151eP);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            boolean zA67 = bfm.A67(this.$view);
            BoY boY = this.$view;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new SelfieRingKt$SelfieRing$1$1$1(boY);
                bfm.Ai0(objAaT);
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            AbstractC1532Ako.A02(bfm, c1062ATq, (G0U) objAaT, null, 48, 4);
            HeadMovement value = this.$current$delegate.getValue();
            boolean zA65 = bfm.A65(this.$progress);
            C1BO<Float> c1bo = this.$progress;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new SelfieRingKt$SelfieRing$1$2$1(c1bo);
                bfm.Ai0(objAaT2);
            }
            SelfieOverlayKt.SelfieMovementOverlay(value, (Function0) objAaT2, this.$flashes, c1062ATq, bfm, (CompletionFlash.$stable << 6) | 3072, 0);
            bfm.AgE(987418228);
            for (CompletionFlash completionFlash : this.$flashes) {
                HeadMovement headMovement = completionFlash.direction;
                boolean zA672 = bfm.A67(completionFlash);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new SelfieRingKt$SelfieRing$1$3$1$1(completionFlash);
                    bfm.Ai0(objAaT3);
                }
                SelfieMovementChipKt.SelfieMovementChip(interfaceC05151eP, headMovement, true, AbstractC1396AiR.A00(bs0, (G0U) objAaT3), bfm, (iA0d & 14) | 384, 0);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            HeadMovement value2 = this.$current$delegate.getValue();
            if (value2 == null) {
                bfm.AgE(545377424);
            } else {
                bfm.AgE(545377425);
                SelfieMovementChipKt.SelfieMovementChip(interfaceC05151eP, value2, false, null, bfm, (iA0d & 14) | 384, 4);
            }
            BBI.A0R(bbiA07, false);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieRingKt$SelfieRing$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C07C $this_SelfieRing;
        public final /* synthetic */ BoY $view;
        public final /* synthetic */ SelfieCaptureViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C07C c07c, BoY boY, SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$this_SelfieRing = c07c;
            this.$view = boY;
            this.$viewModel = selfieCaptureViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieRingKt.SelfieRing(this.$this_SelfieRing, this.$view, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void SelfieRing(C07C c07c, BoY boY, SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(c07c, boY, selfieCaptureViewModel);
        bfm.AgG(713634946);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c07c) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, boY);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(selfieCaptureViewModel, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, selfieCaptureViewModel.state);
            C1BO c1boA022 = C2CK.A02(bfm, selfieCaptureViewModel.progress);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass002.A0K(bfm, null, new SelfieRingKt$SelfieRing$current$2$1(c1boA02));
            }
            C1BO c1bo = (C1BO) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass002.A0K(bfm, null, new SelfieRingKt$SelfieRing$completed$2$1(c1boA02));
            }
            SelfieCircleKt.SelfieCircle(c07c, bRg2, B1V.A00(bfm, new AnonymousClass1(boY, c1boA022, SelfieOverlayKt.rememberCompletionFlashes((AHD) ((C1BO) objAaT2).getValue(), bfm, 0), c1bo), -1442546331), bfm, (iA0d & 14) | 384 | ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(c07c, boY, selfieCaptureViewModel, bRg2, i, i2);
        }
    }

    public static final AHD<HeadMovement> SelfieRing$lambda$3(C1BO<? extends AHD<? extends HeadMovement>> c1bo) {
        return (AHD) c1bo.getValue();
    }

    public static final /* synthetic */ HeadMovement access$SelfieRing$lambda$1(C1BO c1bo) {
        return (HeadMovement) c1bo.getValue();
    }
}
