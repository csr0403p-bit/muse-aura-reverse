package com.facebook.aura.browsertask.conversation;

import X.C7BY;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.notifications.push.api.PushPresenter;

/* loaded from: classes3.dex */
public final class BrowserSignInPushPresenter implements PushPresenter {
    public static final int $stable = 0;
    public static final BrowserSignInPushPresenter INSTANCE = new BrowserSignInPushPresenter();

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    @Override // com.facebook.aura.notifications.push.api.PushPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.facebook.aura.notifications.push.api.PushPresentation present(java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            r4 = this;
            r0 = 1
            X.C7384Etj.A0Y(r6, r0)
            java.lang.String r0 = "hatch_browser_needs_you"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "hatch_browser_needs_you_resolved"
            if (r0 != 0) goto L19
            boolean r0 = r1.equals(r5)
            if (r0 != 0) goto L19
        L14:
            com.facebook.aura.notifications.push.api.PushPresentation$Default r1 = com.facebook.aura.notifications.push.api.PushPresentation.Default.INSTANCE
        L16:
            com.facebook.aura.notifications.push.api.PushPresentation r1 = (com.facebook.aura.notifications.push.api.PushPresentation) r1
            return r1
        L19:
            java.lang.String r0 = "collapse_key"
            java.lang.String r3 = X.C60O.A0p(r0, r6)
            if (r3 == 0) goto L14
            boolean r0 = X.C7BY.A0j(r3)
            r2 = 0
            if (r0 != 0) goto L14
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L34
            com.facebook.aura.notifications.push.api.PushPresentation$Retract r1 = new com.facebook.aura.notifications.push.api.PushPresentation$Retract
            r1.<init>(r3)
            goto L16
        L34:
            java.lang.String r0 = "reason"
            java.lang.Object r1 = r6.get(r0)
            java.lang.String r0 = "sign_in"
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "message_id"
            java.lang.String r0 = X.C60O.A0p(r0, r6)
            java.lang.String r0 = r4.mainChatLink(r0)
            com.facebook.aura.notifications.push.api.PushPresentation$Alert r1 = new com.facebook.aura.notifications.push.api.PushPresentation$Alert
            r1.<init>(r3, r0, r2)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenter.present(java.lang.String, java.util.Map):com.facebook.aura.notifications.push.api.PushPresentation");
    }

    private final String mainChatLink(String str) {
        return (str == null || C7BY.A0j(str)) ? "hatch://chat" : FGI.A0M("hatch://chat?message_id=", Uri.encode(str));
    }
}
