package com.facebook.aura.composer.camera;

import X.AGE;
import X.AGF;
import X.AGN;
import X.AKH;
import X.AKJ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AnonymousClass794;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7OQ;
import X.C7OU;
import X.G0U;
import X.G0V;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchInAppCameraKt {
    public static final AKH<G0U<G0U<? super File, Unit>, Unit>> LocalCameraLaunch;
    public static final AKH<Boolean> LocalHatchCameraCaptureActive;
    public static final AKH<Boolean> LocalHatchInAppCameraAvailable;

    /* renamed from: com.facebook.aura.composer.camera.HatchInAppCameraKt$HatchInAppCameraHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$content = g0v;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AnonymousClass001.A1H(bfm, this.$content, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.composer.camera.HatchInAppCameraKt$HatchInAppCameraHost$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInAppCameraKt.HatchInAppCameraHost(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void HatchInAppCameraHost(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(1939471195);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass001.A0j(bfm, contextA0H.getPackageManager().hasSystemFeature("android.hardware.camera.any"));
            }
            Boolean bool = (Boolean) objAaT;
            boolean zBooleanValue = bool.booleanValue();
            boolean zA652 = bfm.A65(abstractC3358CGzA0g);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT2;
            boolean zA653 = bfm.A65(abstractC3358CGzA0g);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT3;
            AnonymousClass794 anonymousClass794 = new AnonymousClass794();
            boolean zA1X = AnonymousClass005.A1X(bfm, mutableState2, contextA0H, bfm.A65(mutableState), bfm.A67(abstractC3358CGzA0g));
            Object objAaT4 = bfm.AaT();
            if (zA1X || objAaT4 == C78N.A00) {
                objAaT4 = new HatchInAppCameraKt$HatchInAppCameraHost$permission$1$1(abstractC3358CGzA0g, contextA0H, mutableState, mutableState2);
                bfm.Ai0(objAaT4);
            }
            C7OU c7ouA00 = C7OQ.A00(anonymousClass794, bfm, (G0U) objAaT4);
            boolean zA1X2 = AnonymousClass005.A1X(bfm, mutableState2, c7ouA00, AnonymousClass004.A1S(bfm, mutableState, abstractC3358CGzA0g, bfm.A66(zBooleanValue)), bfm.A67(contextA0H));
            Object objAaT5 = bfm.AaT();
            if (zA1X2 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchInAppCameraKt$HatchInAppCameraHost$launch$1$1(zBooleanValue, abstractC3358CGzA0g, contextA0H, c7ouA00, mutableState, mutableState2);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass003.A0p(bfm, new AnonymousClass1(g0v), new AKJ[]{LocalCameraLaunch.A04(objAaT5), LocalHatchInAppCameraAvailable.A04(bool), LocalHatchCameraCaptureActive.A04(Boolean.valueOf(AnonymousClass002.A1X(mutableState.getValue())))}, -1865748453);
            if (MutableState.A0A(mutableState2)) {
                boolean zA1S = AnonymousClass004.A1S(bfm, mutableState2, abstractC3358CGzA0g, AnonymousClass001.A1Y(mutableState, bfm, -1407167680));
                Object objAaT6 = bfm.AaT();
                if (zA1S || objAaT6 == C78N.A00) {
                    objAaT6 = new HatchInAppCameraKt$HatchInAppCameraHost$2$1(abstractC3358CGzA0g, mutableState, mutableState2);
                    bfm.Ai0(objAaT6);
                }
                HatchCameraDialogKt.HatchCameraDialog((G0U) objAaT6, bRg2, bfm, (iA0d << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
            } else {
                bfm.AgE(-1406699673);
            }
            AnonymousClass001.A1D(bfm);
            boolean zA1K = AnonymousClass003.A1K(bfm, mutableState, mutableState2);
            Object objAaT7 = bfm.AaT();
            if (zA1K || objAaT7 == C78N.A00) {
                objAaT7 = new HatchInAppCameraKt$HatchInAppCameraHost$3$1(mutableState, mutableState2);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A17(bfm, objAaT7, abstractC3358CGzA0g);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(bRg2, g0v, i, i2);
        }
    }

    public static final Function0<Unit> rememberHatchInAppCameraLauncher(G0U<? super File, Unit> g0u, BFM bfm, int i) {
        C7384Etj.A0Y(g0u, 0);
        bfm.AgE(-44318139);
        G0U g0u2 = (G0U) bfm.A6v(LocalCameraLaunch);
        if (g0u2 != null) {
            boolean z = true;
            if (AnonymousClass003.A1G(bfm, LocalHatchCameraCaptureActive)) {
                AnonymousClass003.A0l(bfm, -1726540061);
            } else {
                bfm.AgE(359947507);
                boolean z2 = !C3cG.A1P(bfm.A6v(LocalHatchInAppCameraAvailable), true);
                BBI bbiA07 = C3cG.A07(bfm);
                if (!z2) {
                    boolean zA65 = bfm.A65(g0u2);
                    if ((((i & 14) ^ 6) <= 4 || !bfm.A65(g0u)) && (i & 6) != 4) {
                        z = false;
                    }
                    boolean z3 = zA65 | z;
                    Object objAaT = bfm.AaT();
                    if (z3 || objAaT == C78N.A00) {
                        objAaT = new HatchInAppCameraKt$rememberHatchInAppCameraLauncher$1$1(g0u2, g0u);
                        bfm.Ai0(objAaT);
                    }
                    Function0<Unit> function0 = (Function0) objAaT;
                    BBI.A0R(bbiA07, false);
                    return function0;
                }
            }
        }
        AnonymousClass001.A1D(bfm);
        return null;
    }

    static {
        HatchInAppCameraKt$LocalCameraLaunch$1 hatchInAppCameraKt$LocalCameraLaunch$1 = HatchInAppCameraKt$LocalCameraLaunch$1.INSTANCE;
        AGE ageA01 = AGF.A01();
        LocalCameraLaunch = new AGN(ageA01, hatchInAppCameraKt$LocalCameraLaunch$1);
        LocalHatchCameraCaptureActive = new AGN(ageA01, HatchInAppCameraKt$LocalHatchCameraCaptureActive$1.INSTANCE);
        LocalHatchInAppCameraAvailable = new AGN(ageA01, HatchInAppCameraKt$LocalHatchInAppCameraAvailable$1.INSTANCE);
    }

    public static final AKH<Boolean> getLocalHatchCameraCaptureActive() {
        return LocalHatchCameraCaptureActive;
    }

    public static final AKH<Boolean> getLocalHatchInAppCameraAvailable() {
        return LocalHatchInAppCameraAvailable;
    }

    public static final /* synthetic */ G0U access$HatchInAppCameraHost$lambda$2(MutableState mutableState) {
        return (G0U) mutableState.getValue();
    }
}
