package com.facebook.aura.login.api;

import X.AnonymousClass003;

/* loaded from: classes2.dex */
public final class LoginCompletedHooks {
    public static final LoginCompletedHooks INSTANCE = new LoginCompletedHooks();

    public final void notifyLoginCompleted(String str, LoginMethod loginMethod) {
        AnonymousClass003.A0u(str, loginMethod);
    }
}
