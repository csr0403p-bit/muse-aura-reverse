package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C1DK;
import X.C1Ny;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import com.facebook.aura.composer.camera.HatchInAppCameraKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class AssistCameraHostKt {

    /* renamed from: com.facebook.aura.assist.AssistCameraHostKt$AssistCameraHost$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

        /* renamed from: com.facebook.aura.assist.AssistCameraHostKt$AssistCameraHost$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0V<BFM, Integer, Unit> $content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(G0V<? super BFM, ? super Integer, Unit> g0v) {
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
                AssistIdentityState assistIdentityState = (AssistIdentityState) bfm.A6v(AssistIdentityStateKt.LocalAssistIdentityState);
                Boolean bool = (Boolean) bfm.A6v(HatchInAppCameraKt.LocalHatchCameraCaptureActive);
                boolean zBooleanValue = bool.booleanValue();
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT == obj) {
                    objAaT = C3cG.A0T();
                    bfm.Ai0(objAaT);
                }
                boolean zA1U = AnonymousClass001.A1U(bfm, zBooleanValue, AnonymousClass003.A1M(bfm, assistIdentityState, objAaT));
                Object objAaT2 = bfm.AaT();
                if (zA1U || objAaT2 == obj) {
                    objAaT2 = new AssistCameraHostKt$AssistCameraHost$1$1$1(assistIdentityState, objAaT, zBooleanValue);
                    bfm.Ai0(objAaT2);
                }
                AnonymousClass001.A19(bfm, objAaT2, assistIdentityState, bool);
                AnonymousClass003.A0m(bfm, AssistVoiceCameraKt.LocalAssistVoiceCameraLaunch.A04(AssistVoiceCameraKt.rememberAssistVoiceCameraLauncher(bfm, 0)), new AnonymousClass2(this.$content), -264633870);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.assist.AssistCameraHostKt$AssistCameraHost$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
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
            AssistCameraHostKt.AssistCameraHost(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AssistCameraHost(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        C7384Etj.A0Y(g0v, 1);
        bfm.AgG(1625825673);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            HatchInAppCameraKt.HatchInAppCameraHost(bRg, B1V.A00(bfm, new AnonymousClass1(g0v), 1960877746), bfm, (iA0d & 14) | 48, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, g0v, i, i2);
        }
    }

    public static final C1Ny rememberAssistCameraInsets(C1Ny c1Ny, BFM bfm, int i) {
        C7384Etj.A0Y(c1Ny, 0);
        boolean zA1G = AnonymousClass003.A1G(bfm, HatchInAppCameraKt.LocalHatchCameraCaptureActive);
        int iACy = c1Ny.ACy(AnonymousClass002.A0Y(bfm));
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = AnonymousClass002.A0O(bfm, iACy);
        }
        C00r c00r = (C00r) objAaT;
        boolean zA1a = AnonymousClass001.A1a(bfm.A66(zA1G), bfm, iACy);
        Object objAaT2 = bfm.AaT();
        if (zA1a || objAaT2 == obj) {
            objAaT2 = new AssistCameraHostKt$rememberAssistCameraInsets$1$1(zA1G, iACy, c00r);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A15(bfm, objAaT2);
        return zA1G ? new C1DK(c00r.AGd()) : c1Ny;
    }
}
