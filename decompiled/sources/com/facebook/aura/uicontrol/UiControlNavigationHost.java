package com.facebook.aura.uicontrol;

import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class UiControlNavigationHost {
    public final AuraNavigator navigator;
    public final AtomicBoolean registered;

    public UiControlNavigationHost(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        this.navigator = auraNavigator;
        this.registered = new AtomicBoolean(true);
    }

    public final AuraNavigator getNavigator() {
        return this.navigator;
    }

    public final boolean isRegistered() {
        return this.registered.get();
    }

    public final void unregister$fbandroid_express_aura_java_com_facebook_aura_uicontrol_uicontrol() {
        this.registered.set(false);
    }
}
