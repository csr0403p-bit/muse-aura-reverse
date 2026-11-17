package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C7Je;
import X.FGI;
import X.G0V;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.conversation.repo.HatchPrimarySessionRepository;
import com.facebook.aura.deeplink.BrowserCredentialsDeeplink;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.CustomConnectorAuthSheetKey;
import com.facebook.aura.navigation.key.SecureStorageCaptureSheetKey;
import com.facebook.aura.navigation.key.SecureStorageVerificationCodeCaptureSheetKey;
import com.facebook.aura.skills.connect.config.CustomConnectorLink;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;

/* loaded from: classes3.dex */
public abstract class HatchUrlClickHandlerKt {
    public static final String ANDROID_RESOLVER_PACKAGE = "android";
    public static final String DEVICE_PERMISSIONS_DEEP_LINK_PREFIX = "hatch://device_permissions";
    public static final String DEVICE_REPAIR_DEEP_LINK_PREFIX = "hatch://devices/repair";
    public static final String HATCH_SLIDES_SCHEME = "hatch-slides://";

    public static final CredentialCaptureUrlOutcome handleCredentialCaptureUrl(String str, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, String str2) {
        String value = str2;
        Uri uriA02 = C7Je.A02(str);
        if (uriA02 != null) {
            BrowserCredentialsDeeplink browserCredentialsDeeplink = BrowserCredentialsDeeplink.INSTANCE;
            if (browserCredentialsDeeplink.matches(uriA02)) {
                BrowserCredentialsDeeplink.Payload payload = browserCredentialsDeeplink.parse(uriA02);
                if (payload == null) {
                    return CredentialCaptureUrlOutcome.UNSUPPORTED_REQUEST;
                }
                if (str2 == null) {
                    value = HatchPrimarySessionRepository.Companion.getInstance(abstractC3358CGz).primarySessionId.getValue();
                }
                String str3 = payload.verificationCodeLabel;
                String str4 = payload.pageUrl;
                auraNavigator.navigate(str3 != null ? new SecureStorageVerificationCodeCaptureSheetKey(str4, str3, value, payload.captureAuthorization) : new SecureStorageCaptureSheetKey(str4, payload.usernameLabel, payload.passwordLabel, value, payload.captureAuthorization, true), false);
                return CredentialCaptureUrlOutcome.NAVIGATED;
            }
        }
        return CredentialCaptureUrlOutcome.NOT_CREDENTIAL_CAPTURE;
    }

    public static final boolean handleMetaAiCtaUrlClick(String str, Context context) {
        String scheme;
        String host;
        boolean zA1a = AnonymousClass002.A1a(str, context);
        Uri uriA02 = C7Je.A02(str);
        if (uriA02 == null || (scheme = uriA02.getScheme()) == null || !scheme.equalsIgnoreCase("https") || (host = uriA02.getHost()) == null || !host.equalsIgnoreCase("meta.ai") || uriA02.getUserInfo() != null || (uriA02.getPort() != -1 && uriA02.getPort() != 443)) {
            return false;
        }
        openExternally(uriA02, context, HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.CHAT_MARKDOWN, HatchHtmlActionType.LINK_TAP, uriA02.toString()));
        return zA1a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handleUrlClick(X.AbstractC3358CGz r17, java.lang.String r18, android.content.Context r19, com.facebook.aura.navigation.AuraNavigator r20, X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchUrlClickHandlerKt.handleUrlClick(X.CGz, java.lang.String, android.content.Context, com.facebook.aura.navigation.AuraNavigator, X.G0V, java.lang.String):void");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CredentialCaptureUrlOutcome.values().length];
            try {
                AnonymousClass002.A13(CredentialCaptureUrlOutcome.NOT_CREDENTIAL_CAPTURE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(CredentialCaptureUrlOutcome.NAVIGATED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(CredentialCaptureUrlOutcome.UNSUPPORTED_REQUEST, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void handleUrlClick$default(AbstractC3358CGz abstractC3358CGz, String str, Context context, AuraNavigator auraNavigator, G0V g0v, String str2, int i, Object obj) {
        if ((i & 16) != 0) {
            g0v = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        handleUrlClick(abstractC3358CGz, str, context, auraNavigator, g0v, str2);
    }

    public static final void messagePhoneNumber(String str, Context context) {
        AnonymousClass003.A0u(str, context);
        String strA0K = C7BY.A0K("tel:", str);
        HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.CHAT_MARKDOWN, HatchHtmlActionType.LINK_TAP, str);
        try {
            context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(FGI.A0M("sms:", strA0K))));
            hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.SMS);
        } catch (ActivityNotFoundException e) {
            hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.NO_ACTIVITY_FOUND, str, e);
        }
    }

    public static final void navigateToCustomConnectorAuth(CustomConnectorLink customConnectorLink, String str, AuraNavigator auraNavigator, String str2) {
        String str3 = customConnectorLink.connectorName;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = "custom_connector";
        }
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin = HatchSkillOAuthOrigin.CHAT;
        hatchInteractionLogger.logClick(hatchSkillOAuthOrigin, HatchComponent.SKILL_AUTH_STARTED, AnonymousClass007.A0c(HatchMetadataKey.PROVIDER, str3));
        auraNavigator.navigate((AuraNavKey) new CustomConnectorAuthSheetKey(str, hatchSkillOAuthOrigin, str2), false);
    }

    public static final void openExternally(Uri uri, Context context, HatchHtmlActionTrace hatchHtmlActionTrace) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                context.startActivity(C60Q.A09(uri).addCategory("android.intent.category.BROWSABLE").addFlags(1024));
                hatchHtmlActionTrace.routed(HatchHtmlRoute.NATIVE_APP);
                return;
            } catch (Exception unused) {
            }
        }
        openInDefaultBrowser(uri, context, hatchHtmlActionTrace);
    }

    public static final void openInDefaultBrowser(Uri uri, Context context, HatchHtmlActionTrace hatchHtmlActionTrace) {
        ActivityInfo activityInfo;
        String str;
        Intent intentAddCategory = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        C7384Etj.A0U(intentAddCategory);
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://")).addCategory("android.intent.category.BROWSABLE"), 65600);
        if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.filter != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null && (str = ((PackageItemInfo) activityInfo).packageName) != null && !str.equals("android")) {
            intentAddCategory.setPackage(str);
        }
        try {
            context.startActivity(intentAddCategory);
            hatchHtmlActionTrace.routed(HatchHtmlRoute.EXTERNAL_BROWSER);
        } catch (Exception e) {
            hatchHtmlActionTrace.failed(HatchHtmlErrorCode.NO_BROWSER, uri.toString(), e);
        }
    }

    public static final void dialPhoneNumber(String str, Context context) {
        AnonymousClass003.A0u(str, context);
        HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.CHAT_MARKDOWN, HatchHtmlActionType.LINK_TAP, str);
        try {
            context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
            hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.DIALER);
        } catch (ActivityNotFoundException e) {
            hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.NO_ACTIVITY_FOUND, str, e);
        }
    }
}
