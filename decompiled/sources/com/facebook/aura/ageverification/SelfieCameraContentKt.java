package com.facebook.aura.ageverification;

import X.AIC;
import X.AKQ;
import X.AbstractC07127nr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.BoY;
import X.C00x;
import X.C06I;
import X.C0dx;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1HY;
import X.C2CK;
import X.C2VU;
import X.C3P4;
import X.C3U4;
import X.C3UX;
import X.C3cH;
import X.C7438Evz;
import X.C78N;
import X.C78e;
import X.C90l;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.Ev4;
import X.F60;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.view.ViewOutlineProvider;
import com.facebook.aura.ageverification.SelfieStep;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SelfieCameraContentKt {
    public static final String TAG = "SelfieCameraContent";

    /* renamed from: com.facebook.aura.ageverification.SelfieCameraContentKt$SelfieCameraContent$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SelfieStep $step;
        public final /* synthetic */ SelfieCaptureViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(SelfieStep selfieStep, SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$step = selfieStep;
            this.$viewModel = selfieCaptureViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieCameraContentKt.SelfieCameraContent(this.$step, this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ageverification.SelfieCameraContentKt$SelfieInstruction$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ SelfieCaptureViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = selfieCaptureViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieCameraContentKt.SelfieInstruction(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCameraContentKt", f = "SelfieCameraContent.kt", l = {121}, m = "recordSelfie", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SelfieCameraContentKt.recordSelfie(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2", f = "SelfieCameraContent.kt", l = {126}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SelfieCamera $camera;
        public final /* synthetic */ SelfieStep.Recording $step;
        public final /* synthetic */ SelfieCaptureViewModel $viewModel;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements Function0<Unit> {
            public AnonymousClass1(Object obj) {
                super(0, obj, SelfieCaptureViewModel.class, "onRecordingStarted", "onRecordingStarted()V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((SelfieCaptureViewModel) this.receiver).onRecordingStarted();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SelfieCamera selfieCamera, SelfieStep.Recording recording, SelfieCaptureViewModel selfieCaptureViewModel, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$camera = selfieCamera;
            this.$step = recording;
            this.$viewModel = selfieCaptureViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$camera, this.$step, this.$viewModel, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoCA11;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                hoCA11 = AnonymousClass001.A11(new SelfieCameraContentKt$recordSelfie$2$stopper$1(this.$viewModel, this.$camera, null), c3ux);
                SelfieCamera selfieCamera = this.$camera;
                File file = this.$step.video;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel);
                this.L$0 = null;
                this.L$1 = hoCA11;
                this.label = 1;
                if (selfieCamera.record(file, anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hoCA11 = (HoC) this.L$1;
                Hwg.A00(obj);
            }
            hoCA11.A5w(null);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final void SelfieCameraContent(SelfieStep selfieStep, SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(selfieStep, selfieCaptureViewModel);
        bfm.AgG(-536948283);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(selfieStep, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(selfieCaptureViewModel, bfm, i) ? 1 : 0);
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
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new SelfieCamera(contextA0H);
                bfm.Ai0(objAaT);
            }
            SelfieCamera selfieCamera = (SelfieCamera) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (objAaT2 == obj) {
                BoY boY = new BoY(contextA0H);
                boY.setImplementationMode(Ev4.COMPATIBLE);
                boY.setOutlineProvider(ViewOutlineProvider.BOUNDS);
                boY.setClipToOutline(zA1a);
                bfm.Ai0(boY);
                obj2 = boY;
            }
            BoY boY2 = (BoY) obj2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new FaceDetectionAnalyzer(contextA0H, new SelfieCameraContentKt$SelfieCameraContent$analyzer$1$1(selfieCaptureViewModel), new SelfieCameraContentKt$SelfieCameraContent$analyzer$1$2(selfieCaptureViewModel));
                bfm.Ai0(objAaT3);
            }
            FaceDetectionAnalyzer faceDetectionAnalyzer = (FaceDetectionAnalyzer) objAaT3;
            C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
            boolean zA00 = ((EnumC10573Huf) C3P4.A00(bfm, c1hy.getLifecycle()).getValue()).A00(EnumC10573Huf.A05);
            Boolean boolValueOf = Boolean.valueOf(zA00);
            boolean zA1T = AnonymousClass001.A1T(bfm, selfieCamera, bfm.A66(zA00));
            int i4 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1V = AnonymousClass005.A1V(bfm, faceDetectionAnalyzer, boY2, c1hy, (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(selfieCaptureViewModel))) | zA1T);
            Object objAaT4 = bfm.AaT();
            if (zA1V || objAaT4 == obj) {
                objAaT4 = new SelfieCameraContentKt$SelfieCameraContent$1$1(zA00, selfieCamera, selfieCaptureViewModel, faceDetectionAnalyzer, boY2, c1hy, null);
                bfm.Ai0(objAaT4);
            }
            C78e.A02(bfm, selfieCamera, c1hy, boolValueOf, (G0V) objAaT4);
            boolean zA1M = AnonymousClass003.A1M(bfm, selfieCamera, faceDetectionAnalyzer) | (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(selfieCaptureViewModel)));
            Object objAaT5 = bfm.AaT();
            if (zA1M || objAaT5 == obj) {
                objAaT5 = new SelfieCameraContentKt$SelfieCameraContent$2$1(selfieCamera, faceDetectionAnalyzer, selfieCaptureViewModel);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A17(bfm, objAaT5, selfieCamera);
            boolean zA1V2 = AnonymousClass002.A1V(bfm, selfieCamera, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(selfieStep)), bfm.A67(c0dx)) | (i4 == 32 || ((iA05 & 64) != 0 && bfm.A67(selfieCaptureViewModel)));
            Object objAaT6 = bfm.AaT();
            if (zA1V2 || objAaT6 == obj) {
                objAaT6 = new SelfieCameraContentKt$SelfieCameraContent$3$1(selfieStep, c0dx, selfieCamera, selfieCaptureViewModel, null);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A18(bfm, objAaT6, selfieStep);
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0D);
            C90l c90l = C90l.A00;
            int i5 = SelfieCaptureViewModel.$stable;
            SelfieRingKt.SelfieRing(c90l, boY2, selfieCaptureViewModel, null, bfm, (i5 << 6) | 6 | ((iA05 << 3) & 896), 4);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingLarge;
            SelfieInstruction(selfieCaptureViewModel, C3U4.A0C(C3U4.A0B(bs0, f, 0.0f), 0.0f, f, 0.0f, 0.0f), bfm, i5 | ((iA05 >> 3) & 14), 0);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(selfieStep, selfieCaptureViewModel, bRg2, i, i2);
        }
    }

    public static final void SelfieInstruction(SelfieCaptureViewModel selfieCaptureViewModel, BRg bRg, BFM bfm, int i, int i2) {
        long jA07;
        BRg bRg2 = bRg;
        bfm.AgG(-2013292889);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(selfieCaptureViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, selfieCaptureViewModel.ui);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = SelfieCameraContentKt$SelfieInstruction$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingSmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, ((SelfieCaptureUi) c1boA02.getValue()).titleRes);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Emphasized;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = SelfieCameraContentKt$SelfieInstruction$2$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0Y(bs0, objAaT2, false), jA06, c1822Arm, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
            Integer num = ((SelfieCaptureUi) c1boA02.getValue()).bodyRes;
            if (num == null) {
                bfm.AgE(538029204);
            } else {
                bfm.AgE(538029205);
                String strA012 = AbstractC2271BQs.A01(bfm, num.intValue());
                C1822Arm c1822ArmA0C = C3cH.A0C(bfm, auraTheme);
                if (((SelfieCaptureUi) c1boA02.getValue()).bodyIsError) {
                    bfm.AgE(1166606128);
                    jA07 = auraTheme.getColors(bfm, 6).errorText;
                } else {
                    bfm.AgE(1166607156);
                    jA07 = C3cH.A07(bfm, auraTheme);
                }
                BBI.A0R(bbi, false);
                AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, jA07, c1822ArmA0C, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(selfieCaptureViewModel, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object recordSelfie(com.facebook.aura.ageverification.SelfieCamera r5, com.facebook.aura.ageverification.SelfieStep.Recording r6, com.facebook.aura.ageverification.SelfieCaptureViewModel r7, X.HtJ<? super kotlin.Unit> r8) throws java.lang.Exception {
        /*
            boolean r0 = r8 instanceof com.facebook.aura.ageverification.SelfieCameraContentKt.AnonymousClass1
            if (r0 == 0) goto L22
            r4 = r8
            com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$1 r4 = (com.facebook.aura.ageverification.SelfieCameraContentKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L5a
            java.lang.Object r7 = r4.L$2
            com.facebook.aura.ageverification.SelfieCaptureViewModel r7 = (com.facebook.aura.ageverification.SelfieCaptureViewModel) r7
            goto L28
        L22:
            com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$1 r4 = new com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$1
            r4.<init>(r8)
            goto L12
        L28:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L48
            goto L44
        L2c:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2 r0 = new com.facebook.aura.ageverification.SelfieCameraContentKt$recordSelfie$2     // Catch: java.lang.Exception -> L48
            r0.<init>(r5, r6, r7, r1)     // Catch: java.lang.Exception -> L48
            r4.L$0 = r1     // Catch: java.lang.Exception -> L48
            r4.L$1 = r1     // Catch: java.lang.Exception -> L48
            r4.L$2 = r7     // Catch: java.lang.Exception -> L48
            r4.label = r2     // Catch: java.lang.Exception -> L48
            java.lang.Object r0 = X.Hxb.A00(r0, r4)     // Catch: java.lang.Exception -> L48
            if (r0 != r3) goto L44
            return r3
        L44:
            r7.onRecorded()
            goto L57
        L48:
            r2 = move-exception
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L5e
            java.lang.String r1 = "Could not record the selfie"
            java.lang.String r0 = "SelfieCameraContent"
            X.CFK.A08(r0, r1, r2)
            r7.onRecordingFailed()
        L57:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L5a:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L5e:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieCameraContentKt.recordSelfie(com.facebook.aura.ageverification.SelfieCamera, com.facebook.aura.ageverification.SelfieStep$Recording, com.facebook.aura.ageverification.SelfieCaptureViewModel, X.HtJ):java.lang.Object");
    }
}
