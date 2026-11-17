package com.facebook.aura.browser;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C60Q;
import X.C7Je;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;

/* loaded from: classes3.dex */
public abstract class AuraBrowserLauncherKt {
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[PHI: r3
  0x007c: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:8:0x0024, B:29:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113 A[EDGE_INSN: B:94:0x0113->B:54:0x0113 BREAK  A[LOOP:1: B:38:0x00e3->B:95:0x00e3]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0151 A[PHI: r4
  0x0151: PHI (r4v9 java.lang.String) = 
  (r4v2 java.lang.String)
  (r4v3 java.lang.String)
  (r4v3 java.lang.String)
  (r4v4 java.lang.String)
  (r4v5 java.lang.String)
  (r4v6 java.lang.String)
  (r4v7 java.lang.String)
  (r4v8 java.lang.String)
  (r4v1 java.lang.String)
 binds: [B:55:0x0119, B:57:0x0121, B:59:0x0127, B:61:0x012f, B:63:0x0137, B:65:0x013f, B:67:0x0147, B:69:0x014f, B:52:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean openBrowser(java.lang.String r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browser.AuraBrowserLauncherKt.openBrowser(java.lang.String, android.content.Context):boolean");
    }

    public static final boolean tryOpenInNativeApp(String str, Context context) {
        boolean zA1a = AnonymousClass002.A1a(str, context);
        if (Build.VERSION.SDK_INT >= 30) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null) {
                String scheme = uriA01.getScheme();
                String strA0u = scheme != null ? AnonymousClass001.A0u(scheme) : null;
                if (!AuraDeeplinkHandlerActivity.HTTP.equals(strA0u) && !"https".equals(strA0u)) {
                    return false;
                }
                try {
                    context.startActivity(C60Q.A09(uriA01).addCategory("android.intent.category.BROWSABLE").addFlags(1024));
                    return zA1a;
                } catch (Exception unused2) {
                    return false;
                }
            }
        }
        return false;
    }

    public static final void openExternalUrl(String str, Context context) {
        AnonymousClass003.A0u(str, context);
        if (tryOpenInNativeApp(str, context)) {
            return;
        }
        openBrowser(str, context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        if (r1.equals(com.facebook.aura.main.AuraDeeplinkHandlerActivity.HTTP) == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1.equals("https") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (tryOpenInNativeApp(r4, r5) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return com.facebook.aura.browser.ModelLinkOutcome.OPENED_NATIVE_APP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        openBrowser(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        return com.facebook.aura.browser.ModelLinkOutcome.OPENED_BROWSER;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.browser.ModelLinkOutcome openModelGeneratedLink(java.lang.String r4, android.content.Context r5) {
        /*
            X.AnonymousClass003.A0u(r4, r5)
            r3 = 0
            android.net.Uri r3 = X.C7Je.A01(r4)     // Catch: java.lang.Throwable -> L8
        L8:
            if (r3 == 0) goto L1d
            java.lang.String r0 = r3.getScheme()
            if (r0 == 0) goto L1d
            java.lang.String r1 = X.AnonymousClass001.A0u(r0)
            int r0 = r1.hashCode()
            java.lang.String r2 = "android.intent.action.SENDTO"
            switch(r0) {
                case -1081572750: goto L6b;
                case 102225: goto L5c;
                case 114009: goto L4c;
                case 114715: goto L3a;
                case 3213448: goto L20;
                case 99617003: goto L29;
                default: goto L1d;
            }
        L1d:
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.UNSUPPORTED_SCHEME
            return r0
        L20:
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto L1d
        L29:
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
        L31:
            boolean r0 = tryOpenInNativeApp(r4, r5)
            if (r0 == 0) goto L7b
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_NATIVE_APP
            return r0
        L3a:
            java.lang.String r0 = "tel"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "android.intent.action.DIAL"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r3)
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_DIALER
            goto L81
        L4c:
            java.lang.String r0 = "sms"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_SMS
            goto L81
        L5c:
            java.lang.String r0 = "geo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            android.content.Intent r1 = X.C60Q.A09(r3)
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_MAPS
            goto L81
        L6b:
            java.lang.String r0 = "mailto"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r2, r3)
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_EMAIL
            goto L81
        L7b:
            openBrowser(r4, r5)
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.OPENED_BROWSER
            return r0
        L81:
            r5.startActivity(r1)     // Catch: java.lang.Exception -> L85
            return r0
        L85:
            com.facebook.aura.browser.ModelLinkOutcome r0 = com.facebook.aura.browser.ModelLinkOutcome.NO_ACTIVITY_FOUND
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browser.AuraBrowserLauncherKt.openModelGeneratedLink(java.lang.String, android.content.Context):com.facebook.aura.browser.ModelLinkOutcome");
    }
}
