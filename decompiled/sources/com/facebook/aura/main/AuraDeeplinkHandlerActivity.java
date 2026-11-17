package com.facebook.aura.main;

import X.AnonymousClass005;
import X.C06H;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C77m;
import X.C7oV;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.deeplink.AuraDeeplinkAccessValidator;
import com.facebook.aura.deeplink.AuraDeeplinkOpenerVerifier;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.deeplink.HatchReservedIntentExtras;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AuraDeeplinkHandlerActivity extends AppCompatActivity {
    public static final int $stable = 8;
    public static final Uri APP_LAUNCH_URI;
    public static final Companion Companion = new Companion();
    public static final String HATCH = "hatch";
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String PUBLIC_RELAY_PARAM = "public_relay";
    public static final String RESOLVER_PACKAGE = "android";
    public static final String TAG = "AuraDeeplinkHandlerActivity";
    public final AuraDeeplinkAccessValidator accessValidator = new AuraDeeplinkAccessValidator();

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWebScheme(String str) {
            return (str != null && str.equalsIgnoreCase("https")) || (str != null && str.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isPublicRelay(Uri uri) {
            if (!uri.isHierarchical()) {
                return false;
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C7384Etj.A0U(queryParameterNames);
            if ((queryParameterNames instanceof Collection) && queryParameterNames.isEmpty()) {
                return false;
            }
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j != null && strA0j.equalsIgnoreCase(AuraDeeplinkHandlerActivity.PUBLIC_RELAY_PARAM)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Intent withAcceptedHttpUpgraded(Intent intent) {
            Uri data = intent.getData();
            if (!AuraDeeplinkHandlerActivity.HTTP.equals(data != null ? data.getScheme() : null) || !HatchUrl.INSTANCE.isAcceptedWebHost(data.getHost())) {
                return intent;
            }
            Intent dataAndType = new Intent(intent).setDataAndType(data.buildUpon().scheme("https").build(), intent.getType());
            C7384Etj.A0U(dataAndType);
            return dataAndType;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) throws NoSuchAlgorithmException {
        C7384Etj.A0Y(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
        processIntent();
    }

    static {
        Uri uriBuild = new Uri.Builder().scheme("hatch").authority("").build();
        C7384Etj.A0U(uriBuild);
        APP_LAUNCH_URI = uriBuild;
    }

    private final String getDefaultBrowserPackageName() {
        ActivityInfo activityInfo;
        String str;
        Intent intentA09 = C60Q.A09(Uri.parse("https://"));
        intentA09.addCategory("android.intent.category.BROWSABLE");
        ResolveInfo resolveInfoResolveActivity = getPackageManager().resolveActivity(intentA09, 65600);
        if (resolveInfoResolveActivity == null || resolveInfoResolveActivity.filter == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null || (str = ((PackageItemInfo) activityInfo).packageName) == null || str.equals("android") || str.equals(getPackageName())) {
            return null;
        }
        return str;
    }

    private final void launchMainActivity(Intent intent) {
        CFK.A05(TAG, "processIntent: forwarding deeplink");
        AuraDeeplinkOpenerVerifier.VerifiedOpener verifiedOpener = AuraDeeplinkOpenerVerifier.INSTANCE.verifiedOpener(this, intent);
        Intent intent2 = new Intent(this, (Class<?>) AuraMainActivity.class);
        intent2.setAction(intent.getAction());
        intent2.setData(intent.getData());
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        HatchReservedIntentExtras.INSTANCE.clear(intent2);
        if (verifiedOpener != null) {
            intent2.putExtra(HatchIntentViewModel.EXTRA_DEEPLINK_OPENER, verifiedOpener.opener.name());
            String str = verifiedOpener.sourceApplication;
            if (str != null) {
                intent2.putExtra(HatchIntentViewModel.EXTRA_DEEPLINK_SOURCE_APPLICATION, str);
            }
        }
        intent2.addFlags(637534208);
        C77m.A00(this, intent2);
    }

    private final void openExternalBrowser(Uri uri) {
        String str = "Unable to launch browser for deeplink";
        Intent intentA09 = C60Q.A09(uri);
        intentA09.addCategory("android.intent.category.BROWSABLE");
        intentA09.addFlags(268435456);
        intentA09.setPackage(getDefaultBrowserPackageName());
        try {
            C3cI.A18(this, intentA09);
        } catch (ActivityNotFoundException e) {
            e = e;
            str = "No browser available for deeplink";
            CFK.A0A(TAG, str, e);
        } catch (NullPointerException | SecurityException e2) {
            e = e2;
            CFK.A0A(TAG, str, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void processIntent() throws java.security.NoSuchAlgorithmException {
        /*
            r10 = this;
            android.content.Intent r1 = r10.getIntent()
            r9 = 0
            if (r1 == 0) goto Lc5
            com.facebook.aura.main.AuraDeeplinkHandlerActivity$Companion r0 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion
            android.content.Intent r5 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion.access$withAcceptedHttpUpgraded(r0, r1)
        Ld:
            java.lang.String r6 = "AuraDeeplinkHandlerActivity"
            if (r5 != 0) goto L1a
            java.lang.String r0 = "processIntent: intent is null, finishing"
            X.CFK.A06(r6, r0)
        L16:
            r10.finish()
            return
        L1a:
            android.net.Uri r4 = r5.getData()
            com.facebook.aura.analytics.hatch.HatchAppOpenLogger r0 = com.facebook.aura.analytics.hatch.HatchAppOpenLogger.INSTANCE
            android.net.Uri r0 = r0.uriForLogging(r4)
            if (r0 == 0) goto L48
            java.lang.String r2 = r0.toString()
        L2a:
            if (r4 == 0) goto L4e
            com.facebook.aura.main.AuraDeeplinkHandlerActivity$Companion r0 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion
            boolean r0 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion.access$isPublicRelay(r0, r4)
            if (r0 == 0) goto L4a
            java.lang.String r0 = "processIntent: public relay, opening the app without the payload"
            X.CFK.A05(r6, r0)
            java.lang.String r2 = r5.getAction()
            android.net.Uri r1 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.APP_LAUNCH_URI
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            r10.launchMainActivity(r0)
            goto L16
        L48:
            r2 = r9
            goto L2a
        L4a:
            java.lang.String r9 = r4.getScheme()
        L4e:
            com.facebook.aura.deeplink.AuraDeeplinkAccessValidator r1 = r10.accessValidator
            com.facebook.aura.auth.store.AuraUserSessionStore r0 = com.facebook.aura.auth.store.AuraUserSessionStore.INSTANCE
            boolean r0 = r0.isCurrentUserAuthenticated()
            com.facebook.aura.deeplink.AuraDeeplinkAccessResult r7 = r1.validate(r10, r5, r0)
            java.lang.String r8 = "https"
            if (r4 == 0) goto L6c
            boolean r0 = r8.equals(r9)
            if (r0 == 0) goto L6c
            com.facebook.aura.deeplink.AuraDeeplinkAccessResult r0 = com.facebook.aura.deeplink.AuraDeeplinkAccessResult.NO_ROUTE
            if (r7 != r0) goto L6c
            r10.openExternalBrowser(r4)
            goto L16
        L6c:
            com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics r3 = com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics.INSTANCE
            com.facebook.aura.webview.diagnostics.HatchHtmlSurface r1 = com.facebook.aura.webview.diagnostics.HatchHtmlSurface.INBOUND_DEEPLINK
            com.facebook.aura.webview.diagnostics.HatchHtmlActionType r0 = com.facebook.aura.webview.diagnostics.HatchHtmlActionType.INBOUND_DEEPLINK
            com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace r3 = r3.startAction(r1, r0, r2)
            com.facebook.aura.main.AuraDeeplinkHandlerActivity$Companion r0 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion
            boolean r0 = com.facebook.aura.main.AuraDeeplinkHandlerActivity.Companion.access$isWebScheme(r0, r9)
            if (r0 == 0) goto L90
            boolean r0 = r8.equals(r9)
            if (r0 != 0) goto L90
            java.lang.String r0 = "processIntent: rejecting unverifiable web deeplink"
            X.CFK.A06(r6, r0)
            com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode r1 = com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode.UNSUPPORTED_SCHEME
        L8b:
            r0 = 0
            r3.failed(r1, r2, r0)
            goto L16
        L90:
            com.facebook.aura.deeplink.AuraDeeplinkAccessResult r0 = com.facebook.aura.deeplink.AuraDeeplinkAccessResult.ALLOWED
            if (r7 != r0) goto Lb1
            if (r4 == 0) goto La7
            com.facebook.aura.deeplink.AuraDeeplinkRouteMapper r0 = com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.INSTANCE
            boolean r0 = r0.isHatchChatRoute(r4)
            if (r0 == 0) goto La7
            com.facebook.aura.analytics.hatch.HatchDeferredDeeplinkStore r2 = com.facebook.aura.analytics.hatch.HatchDeferredDeeplinkStore.INSTANCE
            long r0 = java.lang.System.currentTimeMillis()
            r2.captureFromUri(r4, r0)
        La7:
            r10.launchMainActivity(r5)
            com.facebook.aura.webview.diagnostics.HatchHtmlRoute r0 = com.facebook.aura.webview.diagnostics.HatchHtmlRoute.DEEPLINK_SELF
            r3.routed(r0)
            goto L16
        Lb1:
            com.facebook.aura.deeplink.AuraDeeplinkAccessResult r0 = com.facebook.aura.deeplink.AuraDeeplinkAccessResult.DENIED
            if (r7 != r0) goto Lbd
            java.lang.String r0 = "processIntent: untrusted caller, rejecting deeplink"
            X.CFK.A06(r6, r0)
            com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode r1 = com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode.UNTRUSTED_CALLER
            goto L8b
        Lbd:
            java.lang.String r0 = "processIntent: no matching deeplink route"
            X.CFK.A06(r6, r0)
            com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode r1 = com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode.NO_ROUTE
            goto L8b
        Lc5:
            r5 = r9
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.AuraDeeplinkHandlerActivity.processIntent():void");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws NoSuchAlgorithmException {
        super.onCreate(bundle);
        if (C7oV.A01().A00(this, getIntent(), this)) {
            processIntent();
        } else {
            finish();
        }
    }
}
