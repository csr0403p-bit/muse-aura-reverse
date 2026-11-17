package com.facebook.aura.navigation.effect.api;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.HwN;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.LaunchFlag;

/* loaded from: classes2.dex */
public final class NavigationEffectApi {
    public static final NavigationEffectApi INSTANCE = new NavigationEffectApi();
    public static final BLG<NavigationRequest> _navigationRequest;
    public static final C1BN<NavigationRequest> navigationRequest;

    public final class NavigationRequest {
        public final boolean dismissKeyboardFirst;
        public final AuraNavKey key;
        public final LaunchFlag launchFlag;

        public final boolean getDismissKeyboardFirst() {
            return this.dismissKeyboardFirst;
        }

        public final AuraNavKey getKey() {
            return this.key;
        }

        public final LaunchFlag getLaunchFlag() {
            return this.launchFlag;
        }

        public NavigationRequest(AuraNavKey auraNavKey, LaunchFlag launchFlag, boolean z) {
            AnonymousClass003.A0u(auraNavKey, launchFlag);
            this.key = auraNavKey;
            this.launchFlag = launchFlag;
            this.dismissKeyboardFirst = z;
        }

        public /* synthetic */ NavigationRequest(AuraNavKey auraNavKey, LaunchFlag launchFlag, boolean z, int i, C06H c06h) {
            this(auraNavKey, launchFlag, AnonymousClass005.A1O(i, z));
        }
    }

    public final boolean consumeNavigationRequest(NavigationRequest navigationRequest2) {
        C7384Etj.A0Y(navigationRequest2, 0);
        return C9286GCn.A00(navigationRequest2, HwN.A01, (C9286GCn) _navigationRequest);
    }

    static {
        C9286GCn c9286GCnA13 = C3cG.A13();
        _navigationRequest = c9286GCnA13;
        navigationRequest = C3cG.A11(c9286GCnA13);
    }

    public final void clearNavigationRequest() {
        _navigationRequest.Af8(null);
    }

    public final C1BN<NavigationRequest> getNavigationRequest() {
        return navigationRequest;
    }

    public final void navigateTo(AuraNavKey auraNavKey, LaunchFlag launchFlag, boolean z) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        AnonymousClass002.A1I(_navigationRequest, new NavigationRequest(auraNavKey, launchFlag, z));
    }
}
