package com.facebook.aura.ui;

import X.AYD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.B36;
import X.B3B;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C18j;
import X.C2VU;
import X.C6837Eap;
import X.C78N;
import X.C78e;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.accessibility.ReducedMotionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchSetupAnimationHostKt {
    public static final int EXIT_FADE_MS = 32;
    public static final long FINISH_HOLD_MS = 500;
    public static final long FINISH_RECOVERY_MS = 1500;
    public static final float LOTTIE_LOOP_START_PROGRESS = 0.5f;
    public static final long MAX_VISIBLE_MS = 60000;
    public static final String TAG = "HatchSetupAnimationHost";

    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C6837Eap $composition;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ Integer $logoTopPx;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C6837Eap c6837Eap, boolean z, Integer num, BRg bRg, int i, int i2) {
            super(2);
            this.$composition = c6837Eap;
            this.$isPlaying = z;
            this.$logoTopPx = num;
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
            HatchSetupAnimationHostKt.HatchSetupAnimation(this.$composition, this.$isPlaying, this.$logoTopPx, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onPlaybackStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$onPlaybackStarted = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSetupAnimationHostKt.HatchSetupAnimationHost(this.$modifier, this.$onPlaybackStarted, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationHostKt$HatchSetupAnimationHost$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onPlaybackStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$onPlaybackStarted = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchSetupAnimationHostKt.HatchSetupAnimationHost(this.$modifier, this.$onPlaybackStarted, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchSetupAnimation(C6837Eap c6837Eap, boolean z, Integer num, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA07;
        BRg bRg2 = bRg;
        bfm.AgG(-1098554215);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6837Eap) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, num);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = !AnonymousClass002.A1M((ReducedMotionKt.rememberAnimatorDurationScale(false, bfm, 0, 1) > 0.0f ? 1 : (ReducedMotionKt.rememberAnimatorDurationScale(false, bfm, 0, 1) == 0.0f ? 0 : -1)));
            if (num == null) {
                AnonymousClass003.A0l(bfm, 622437136);
                bRgA07 = C10G.A07(C10G.A02(C2VU.A09, bRg2, false), OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE);
            } else {
                bfm.AgE(622533763);
                BRg bRgA02 = C10G.A02(C2VU.A0C, bRg2, false);
                boolean zA1D = AnonymousClass003.A1D(iA0T);
                Object objAaT = bfm.AaT();
                if (zA1D || objAaT == C78N.A00) {
                    objAaT = new HatchSetupAnimationHostKt$HatchSetupAnimation$contentModifier$1$1(num);
                    bfm.Ai0(objAaT);
                }
                bRgA07 = C10G.A07(AYD.A03(bRgA02, (G0U) objAaT), OnboardingAndActivationSpinnerKt.LOGIN_SCREEN_LOGO_SIZE);
                AnonymousClass001.A1D(bfm);
            }
            C18j c18jA01 = B36.A01(bfm);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zA1X = AnonymousClass005.A1X(bfm, c18jA01, c6837Eap, bfm.A66(z2), AnonymousClass003.A1C(iA0T));
            Object objAaT2 = bfm.AaT();
            if (zA1X || objAaT2 == C78N.A00) {
                objAaT2 = new HatchSetupAnimationHostKt$HatchSetupAnimation$1$1(z2, z, c18jA01, c6837Eap, null);
                bfm.Ai0(objAaT2);
            }
            int i4 = iA0T & 14;
            C78e.A02(bfm, c6837Eap, boolValueOf, boolValueOf2, (G0V) objAaT2);
            boolean zA65 = bfm.A65(c18jA01);
            Object objAaT3 = bfm.AaT();
            if (zA65 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchSetupAnimationHostKt$HatchSetupAnimation$2$1(c18jA01);
                bfm.Ai0(objAaT3);
            }
            B3B.A00(bfm, null, bRgA07, null, c6837Eap, null, null, null, (Function0) objAaT3, i4, 0, 8184, false, false, false, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(c6837Eap, z, num, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchSetupAnimationHost(X.BRg r18, kotlin.jvm.functions.Function0<kotlin.Unit> r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchSetupAnimationHostKt.HatchSetupAnimationHost(X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }
}
