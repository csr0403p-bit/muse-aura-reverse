package com.facebook.aura.login.nativeflow;

import X.AKO;
import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B36;
import X.B3B;
import X.B3C;
import X.BAs;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C10G;
import X.C1515AkP;
import X.C18j;
import X.C1SA;
import X.C1b8;
import X.C1er;
import X.C3cG;
import X.C6837Eap;
import X.C78N;
import X.C78e;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class NativeLoginIntroLogoKt {
    public static final long COMPOSITION_TIMEOUT_MS = 2000;
    public static final NativeLoginInitialDestination DESTINATION_FALLBACK = NativeLoginInitialDestination.LANDING;
    public static final float NATIVE_LOGIN_INTRO_LOGO_SIZE = 79.599556f;
    public static final float OUTRO_MARK_CANVAS_FRACTION = 1.0109f;
    public static final float OUTRO_SPEED = 0.75f;
    public static final float SPLASH_ICON_CANVAS_DP = 288.0f;
    public static final float SPLASH_MARK_CANVAS_FRACTION = 0.2794f;

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroLogo$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<NativeLoginInitialDestination> $destination;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<NativeLoginInitialDestination, Unit> $onFinished;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function0<? extends NativeLoginInitialDestination> function0, G0U<? super NativeLoginInitialDestination, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$destination = function0;
            this.$onFinished = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginIntroLogoKt.NativeLoginIntroLogo(this.$destination, this.$onFinished, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroMark$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C6837Eap $composition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C6837Eap c6837Eap, Function0<Float> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$composition = c6837Eap;
            this.$progress = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginIntroLogoKt.NativeLoginIntroMark(this.$composition, this.$progress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginIntroLogoKt$NativeLoginIntroMark$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ C6837Eap $composition;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C6837Eap c6837Eap, Function0<Float> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$composition = c6837Eap;
            this.$progress = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            NativeLoginIntroLogoKt.NativeLoginIntroMark(this.$composition, this.$progress, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void NativeLoginIntroLogo(Function0<? extends NativeLoginInitialDestination> function0, G0U<? super NativeLoginInitialDestination, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(function0, g0u);
        bfm.AgG(194601536);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            MutableState mutableStateA002 = C1er.A00(bfm, function0);
            float fRememberAnimatorDurationScale = rememberAnimatorDurationScale(bfm, 0);
            BAs bAsA01 = RememberLottieCompositionKt.A01(bfm, new B3C(R.raw.hatch_logo_outro));
            C18j c18jA01 = B36.A01(bfm);
            Unit unit = Unit.INSTANCE;
            boolean zA1R = AnonymousClass001.A1R(bfm, mutableStateA002, AnonymousClass005.A1T(bfm, bAsA01, c18jA01, mutableStateA00, bfm.A62(fRememberAnimatorDurationScale)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new NativeLoginIntroLogoKt$NativeLoginIntroLogo$1$1(fRememberAnimatorDurationScale, c18jA01, bAsA01, mutableStateA00, mutableStateA002, null);
                BBI.A0T(bfm, objAaT);
            }
            C78e.A06(bfm, unit, (G0V) objAaT);
            BRg bRgA01 = C1b8.A01(AnonymousClass001.A0T(bRg2), AuraTheme.INSTANCE.getColors(bfm, 6).background);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
            C6837Eap c6837Eap = (C6837Eap) bAsA01.A01.getValue();
            boolean zA65 = bfm.A65(c18jA01);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginIntroLogoKt$NativeLoginIntroLogo$2$1$1(c18jA01);
                BBI.A0O(bbi, objAaT2);
            }
            NativeLoginIntroMark(c6837Eap, (Function0) objAaT2, C10G.A07(BRg.A00, NATIVE_LOGIN_INTRO_LOGO_SIZE), bfm, 384, 0);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(function0, g0u, bRg2, i, i2);
        }
    }

    public static final void NativeLoginIntroMark(C6837Eap c6837Eap, Function0<Float> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        BRg bRg2 = bRg;
        bfm.AgG(-759377452);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6837Eap) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (c6837Eap == null) {
                bfm.AgE(-1020764817);
                C1SA.A00(bfm, null, bRg2, null, BOf.A00(bfm, R.drawable.hatch_logo, 0), null, null, 0.0f, AVy.$stable | 48 | (iA0T & 896), 120);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass2 = new AnonymousClass1(c6837Eap, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -1020612018);
            B3B.A00(bfm, null, bRg2, null, c6837Eap, null, null, null, function0, iA0T & 1022, 0, 8184, false, false, false, false, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(c6837Eap, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    public static final float rememberAnimatorDurationScale(BFM bfm, int i) {
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, (BBI) bfm);
        boolean zA65 = bfm.A65(contextA00);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = Float.valueOf(Settings.Global.getFloat(contextA00.getContentResolver(), "animator_duration_scale", 1.0f));
            bfm.Ai0(objAaT);
        }
        return AnonymousClass001.A02(objAaT);
    }
}
