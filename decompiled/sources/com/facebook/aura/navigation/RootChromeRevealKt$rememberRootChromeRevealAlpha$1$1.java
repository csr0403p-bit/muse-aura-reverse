package com.facebook.aura.navigation;

import X.AOW;
import X.AT5;
import X.AbstractC7559F3s;
import X.C0Yr;
import X.C3UX;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ AT5<Float, AOW> $alpha;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C3UX $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1(AuraNavigator auraNavigator, C3UX c3ux, AT5<Float, AOW> at5) {
        super(1);
        this.$navigator = auraNavigator;
        this.$scope = c3ux;
        this.$alpha = at5;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        AuraNavigator auraNavigator = this.$navigator;
        final RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1 rootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1 = new RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1(auraNavigator, this.$scope, this.$alpha);
        auraNavigator.addBeforeBackStackChangeListener(rootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1);
        final AuraNavigator auraNavigator2 = this.$navigator;
        return new C78g() { // from class: com.facebook.aura.navigation.RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraNavigator2.removeBeforeBackStackChangeListener(rootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1);
            }
        };
    }
}
