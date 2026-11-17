package com.facebook.aura.composer.camera;

import X.AIC;
import X.AKQ;
import X.AT5;
import X.AT8;
import X.AWx;
import X.AaM;
import X.AbstractC1396AiR;
import X.AbstractC1532Ako;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B15;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BRr;
import X.BoY;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1HY;
import X.C1Hg;
import X.C1b8;
import X.C1er;
import X.C3cH;
import X.C78N;
import X.C78e;
import X.Ejq;
import X.EnumC10460Hji;
import X.EnumC2911Boc;
import X.Ev4;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCameraPreviewKt {

    /* renamed from: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchCameraSession $camera;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Function0<Unit>, Unit> $onCaptureAction;
        public final /* synthetic */ G0U<Boolean, Unit> $onReady;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(HatchCameraSession hatchCameraSession, G0U<? super Boolean, Unit> g0u, G0U<? super Function0<Unit>, Unit> g0u2, BRg bRg, int i, int i2) {
            super(2);
            this.$camera = hatchCameraSession;
            this.$onReady = g0u;
            this.$onCaptureAction = g0u2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCameraPreviewKt.HatchCameraPreview(this.$camera, this.$onReady, this.$onCaptureAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchCameraPreview(final HatchCameraSession hatchCameraSession, G0U<? super Boolean, Unit> g0u, G0U<? super Function0<Unit>, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(hatchCameraSession, g0u, g0u2);
        bfm.AgG(-1234546349);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchCameraSession, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, g0u2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            C1HY c1hy = (C1HY) bfm.A6v(AIC.A00);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            Object obj2 = objAaT;
            if (objAaT == obj) {
                BoY boY = new BoY(contextA0H);
                boY.setImplementationMode(Ev4.COMPATIBLE);
                boY.setScaleType(EnumC2911Boc.FIT_CENTER);
                bfm.Ai0(boY);
                obj2 = boY;
            }
            final BoY boY2 = (BoY) obj2;
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            int i4 = iA05 & 14;
            boolean zA1D = AnonymousClass003.A1D(iA05) | C3cH.A1O(bfm, mutableStateA00, boY2, c1hy) | (i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCameraSession)));
            Object objAaT2 = bfm.AaT();
            if (zA1D || objAaT2 == obj) {
                objAaT2 = new HatchCameraPreviewKt$HatchCameraPreview$1$1(boY2, c1hy, g0u2, mutableStateA00, hatchCameraSession);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, boY2, c1hy);
            Boolean boolValueOf = Boolean.valueOf(hatchCameraSession.getFront());
            boolean zA1Y = AnonymousClass005.A1Y(bfm, boY2, c1hy, bfm.A65(mutableStateA00), i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCameraSession)));
            Object objAaT3 = bfm.AaT();
            if (zA1Y || objAaT3 == obj) {
                objAaT3 = new HatchCameraPreviewKt$HatchCameraPreview$2$1(hatchCameraSession, boY2, c1hy, mutableStateA00, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A02(bfm, hatchCameraSession, c1hy, boolValueOf, (G0V) objAaT3);
            File photo = hatchCameraSession.getPhoto();
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AT8.A00(0.0f);
                bfm.Ai0(objAaT4);
            }
            AT5 at5 = (AT5) objAaT4;
            Integer numValueOf = Integer.valueOf(hatchCameraSession.getShutterCount());
            boolean zA1T = AnonymousClass001.A1T(bfm, at5, i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCameraSession)));
            Object objAaT5 = bfm.AaT();
            if (zA1T || objAaT5 == obj) {
                objAaT5 = new HatchCameraPreviewKt$HatchCameraPreview$3$1(hatchCameraSession, at5, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, numValueOf);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            boolean zA67 = bfm.A67(boY2);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new HatchCameraPreviewKt$HatchCameraPreview$4$1$1(boY2);
                bfm.Ai0(objAaT6);
            }
            G0U g0u3 = (G0U) objAaT6;
            boolean z = true;
            C1062ATq c1062ATq = C10G.A01;
            if (i4 != 4 && ((iA05 & 8) == 0 || !bfm.A67(hatchCameraSession))) {
                z = false;
            }
            boolean zA1S = AnonymousClass001.A1S(bfm, boY2, z);
            Object objAaT7 = bfm.AaT();
            if (zA1S || objAaT7 == obj) {
                objAaT7 = new PointerInputEventHandler() { // from class: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$4$2$1

                    /* renamed from: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$4$2$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ HatchCameraSession $camera;
                        public final /* synthetic */ BoY $view;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(HatchCameraSession hatchCameraSession, BoY boY) {
                            super(1);
                            this.$camera = hatchCameraSession;
                            this.$view = boY;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m420invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m420invokek4lQ0M(long j) {
                            this.$camera.focus(this.$view, AnonymousClass003.A03(j), AnonymousClass004.A00(j));
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(hatchCameraSession, boY2));
                    }
                };
                bfm.Ai0(objAaT7);
            }
            BRg bRgA00 = AaM.A00(c1062ATq, (PointerInputEventHandler) objAaT7, hatchCameraSession);
            boolean z2 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchCameraSession));
            Object objAaT8 = bfm.AaT();
            if (z2 || objAaT8 == obj) {
                objAaT8 = new PointerInputEventHandler() { // from class: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$4$3$1

                    /* renamed from: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$4$3$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<AWx, AWx, Float, Float, Unit> {
                        public final /* synthetic */ HatchCameraSession $camera;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(HatchCameraSession hatchCameraSession) {
                            super(4);
                            this.$camera = hatchCameraSession;
                        }

                        /* renamed from: invoke-jyLRC_s, reason: not valid java name */
                        public final void m421invokejyLRC_s(long j, long j2, float f, float f2) {
                            this.$camera.zoom(f);
                        }

                        @Override // X.G2j
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx, AWx aWx2, Float f, Float f2) {
                            float fA02 = AnonymousClass001.A02(f);
                            f2.floatValue();
                            this.$camera.zoom(fA02);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        Object objA01 = ForEachGestureKt.A01(bRr, htJ, new TransformGestureDetectorKt$detectTransformGestures$2(null, new AnonymousClass1(hatchCameraSession), false));
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        if (objA01 != enumC10460Hji) {
                            objA01 = Unit.INSTANCE;
                        }
                        return objA01 != enumC10460Hji ? Unit.INSTANCE : objA01;
                    }
                };
                bfm.Ai0(objAaT8);
            }
            AbstractC1532Ako.A02(bfm, AaM.A00(bRgA00, (PointerInputEventHandler) objAaT8, hatchCameraSession), g0u3, null, 0, 4);
            if (photo != null) {
                boolean zA1Y2 = AnonymousClass001.A1Y(photo, bfm, -1546888093);
                Object objAaT9 = bfm.AaT();
                if (zA1Y2 || objAaT9 == obj) {
                    objAaT9 = B15.A00(Uri.fromFile(photo));
                    bfm.Ai0(objAaT9);
                }
                C1Hg.A01(bfm, C1b8.A00(c1062ATq, 1.0f, AuraTheme.INSTANCE.getColors(bfm, 6).surfaceOnMedia), null, B18.A02, null, null, null, (Ejq) objAaT9, "HatchCameraPreview", AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120710), 12585984, 868, false);
            } else {
                bfm.AgE(-1546495819);
            }
            BBI.A0R(bbi, false);
            boolean zA672 = bfm.A67(at5);
            Object objAaT10 = bfm.AaT();
            if (zA672 || objAaT10 == obj) {
                objAaT10 = new HatchCameraPreviewKt$HatchCameraPreview$4$5$1(at5);
                bfm.Ai0(objAaT10);
            }
            C1b8.A04(bfm, AbstractC1396AiR.A00(c1062ATq, (G0U) objAaT10), AuraTheme.INSTANCE.getColors(bfm, 6).onMedia);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchCameraSession, g0u, g0u2, bRg2, i, i2);
        }
    }
}
