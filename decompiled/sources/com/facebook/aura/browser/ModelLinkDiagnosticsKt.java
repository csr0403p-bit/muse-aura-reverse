package com.facebook.aura.browser;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;

/* loaded from: classes3.dex */
public abstract class ModelLinkDiagnosticsKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelLinkOutcome.values().length];
            try {
                AnonymousClass002.A13(ModelLinkOutcome.OPENED_NATIVE_APP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ModelLinkOutcome.OPENED_BROWSER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ModelLinkOutcome.OPENED_EMAIL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ModelLinkOutcome.OPENED_DIALER, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ModelLinkOutcome.OPENED_SMS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ModelLinkOutcome.OPENED_MAPS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ModelLinkOutcome.UNSUPPORTED_SCHEME, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ModelLinkOutcome.NO_ACTIVITY_FOUND, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void recordOutcome(HatchHtmlActionTrace hatchHtmlActionTrace, ModelLinkOutcome modelLinkOutcome, String str) {
        HatchHtmlErrorCode hatchHtmlErrorCode;
        HatchHtmlRoute hatchHtmlRoute;
        AnonymousClass005.A0x(hatchHtmlActionTrace, modelLinkOutcome, str);
        switch (modelLinkOutcome.ordinal()) {
            case 0:
                hatchHtmlRoute = HatchHtmlRoute.NATIVE_APP;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 1:
                hatchHtmlRoute = HatchHtmlRoute.EXTERNAL_BROWSER;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 2:
                hatchHtmlRoute = HatchHtmlRoute.EMAIL;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 3:
                hatchHtmlRoute = HatchHtmlRoute.DIALER;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 4:
                hatchHtmlRoute = HatchHtmlRoute.SMS;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 5:
                hatchHtmlRoute = HatchHtmlRoute.MAPS;
                hatchHtmlActionTrace.routed(hatchHtmlRoute);
                return;
            case 6:
                hatchHtmlErrorCode = HatchHtmlErrorCode.UNSUPPORTED_SCHEME;
                hatchHtmlActionTrace.failed(hatchHtmlErrorCode, str, null);
                return;
            case 7:
                hatchHtmlErrorCode = HatchHtmlErrorCode.NO_ACTIVITY_FOUND;
                hatchHtmlActionTrace.failed(hatchHtmlErrorCode, str, null);
                return;
            default:
                throw C3cG.A0q();
        }
    }
}
