package com.facebook.aura.notifications.push.api;

import X.AnonymousClass005;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenter;
import java.util.Map;

/* loaded from: classes3.dex */
public class PushPresenterStatic {
    public static PushPresentation present(int i, String str, Map<String, String> map) {
        if (i == 0) {
            return BrowserSignInPushPresenter.INSTANCE.present(str, map);
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
