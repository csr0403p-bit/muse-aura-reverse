package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0n6;
import X.C1er;
import X.C78N;
import X.C79;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSChallengeResult;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSHttpMethod;
import com.facebook.aura.ccv.nativeflow.HatchThreeDSStepUp;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.webview.AccompanistWebViewClient;
import com.facebook.aura.webview.HatchWebViewKt;
import com.facebook.aura.webview.WebViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchCcvThreeDSChallengeDialogKt {
    public static final String AUTH_RESULT_PARAM = "auth_result";
    public static final String AUTH_RESULT_SUCCESS = "Success";
    public static final String COMPLETION_HOST = "www.ecpthreeds.com";
    public static final String HTTPS_SCHEME = "https";

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ OneShot<HatchThreeDSChallengeResult> $finish;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchThreeDSStepUp $stepUp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchThreeDSStepUp hatchThreeDSStepUp, OneShot<HatchThreeDSChallengeResult> oneShot, BRg bRg) {
            super(2);
            this.$stepUp = hatchThreeDSStepUp;
            this.$finish = oneShot;
            this.$modifier = bRg;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchCcvThreeDSChallengeDialogKt.ThreeDSChallengeWebView(this.$stepUp, this.$finish, this.$modifier, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchThreeDSChallengeResult, Unit> $onFinished;
        public final /* synthetic */ HatchThreeDSStepUp $stepUp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(HatchThreeDSStepUp hatchThreeDSStepUp, G0U<? super HatchThreeDSChallengeResult, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$stepUp = hatchThreeDSStepUp;
            this.$onFinished = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvThreeDSChallengeDialogKt.HatchCcvThreeDSChallengeDialog(this.$stepUp, this.$onFinished, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt$ThreeDSChallengeWebView$2, reason: invalid class name and case insensitive filesystem */
    public final class C110362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchThreeDSChallengeResult, Unit> $onResult;
        public final /* synthetic */ HatchThreeDSStepUp $stepUp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C110362(HatchThreeDSStepUp hatchThreeDSStepUp, G0U<? super HatchThreeDSChallengeResult, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$stepUp = hatchThreeDSStepUp;
            this.$onResult = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCcvThreeDSChallengeDialogKt.ThreeDSChallengeWebView(this.$stepUp, this.$onResult, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchCcvThreeDSChallengeDialog(HatchThreeDSStepUp hatchThreeDSStepUp, G0U<? super HatchThreeDSChallengeResult, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(hatchThreeDSStepUp, g0u);
        bfm.AgG(1898737099);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchThreeDSStepUp) | i : i;
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
            boolean zA65 = bfm.A65(hatchThreeDSStepUp);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new OneShot(new HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$finish$1$1(mutableStateA00));
                bfm.Ai0(objAaT);
            }
            OneShot oneShot = (OneShot) objAaT;
            boolean zA67 = bfm.A67(oneShot);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCcvThreeDSChallengeDialogKt$HatchCcvThreeDSChallengeDialog$1$1(oneShot);
                bfm.Ai0(objAaT2);
            }
            C0n6.A00(bfm, new BA2(C79.A01, zA1a, false, false, zA1a), (Function0) objAaT2, B1V.A00(bfm, new AnonymousClass2(hatchThreeDSStepUp, oneShot, bRg2), -1959017388), 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchThreeDSStepUp, g0u, bRg2, i, i2);
        }
    }

    public static final void ThreeDSChallengeWebView(HatchThreeDSStepUp hatchThreeDSStepUp, G0U<? super HatchThreeDSChallengeResult, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        WebViewState webViewStateRememberWebViewState;
        boolean z;
        BRg bRg2 = bRg;
        bfm.AgG(-318145026);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchThreeDSStepUp) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
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
            if (hatchThreeDSStepUp.method == HatchThreeDSHttpMethod.POST) {
                bfm.AgE(1134576435);
                webViewStateRememberWebViewState = HatchWebViewKt.rememberWebViewState(hatchThreeDSStepUp.url, new byte[0], bfm, 0);
                z = false;
                BBI.A0R((BBI) bfm, false);
            } else {
                bfm.AgE(1134661964);
                webViewStateRememberWebViewState = HatchWebViewKt.rememberWebViewState(hatchThreeDSStepUp.url, null, bfm, 0, 2);
                z = false;
                BBI.A0R((BBI) bfm, false);
            }
            boolean z2 = (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ThreeDSChallengeClient(g0u);
                bfm.Ai0(objAaT);
            }
            AccompanistWebViewClient accompanistWebViewClient = (AccompanistWebViewClient) objAaT;
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                objAaT2 = HatchCcvThreeDSChallengeDialogKt$ThreeDSChallengeWebView$1$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            HatchWebViewKt.WebView(webViewStateRememberWebViewState, bRgA0T, z, true, z, null, (G0U) objAaT2, null, z, accompanistWebViewClient, null, null, bfm, (AccompanistWebViewClient.$stable << 27) | 1576320, z ? 1 : 0, 3504);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C110362(hatchThreeDSStepUp, g0u, bRg2, i, i2);
        }
    }
}
