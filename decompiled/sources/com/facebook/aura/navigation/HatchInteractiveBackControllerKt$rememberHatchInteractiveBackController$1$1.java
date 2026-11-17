package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C2182B9a;
import X.C2183B9b;
import X.C2mE;
import X.C7384Etj;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ DefaultHatchInteractiveBackController $controller;
    public final /* synthetic */ C2183B9b $dispatcher;
    public final /* synthetic */ C2mE $input;
    public final /* synthetic */ AuraNavigator $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1(AuraNavigator auraNavigator, C2183B9b c2183B9b, C2mE c2mE, DefaultHatchInteractiveBackController defaultHatchInteractiveBackController) {
        super(1);
        this.$navigator = auraNavigator;
        this.$dispatcher = c2183B9b;
        this.$input = c2mE;
        this.$controller = defaultHatchInteractiveBackController;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1 hatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1 = new HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1(this.$controller);
        this.$navigator.addBeforeBackStackChangeListener(hatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1);
        C2183B9b c2183B9b = this.$dispatcher;
        if (c2183B9b != null) {
            c2183B9b.A02(this.$input);
        }
        final AuraNavigator auraNavigator = this.$navigator;
        final DefaultHatchInteractiveBackController defaultHatchInteractiveBackController = this.$controller;
        final C2183B9b c2183B9b2 = this.$dispatcher;
        final C2mE c2mE = this.$input;
        return new C78g() { // from class: com.facebook.aura.navigation.HatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                auraNavigator.removeBeforeBackStackChangeListener(hatchInteractiveBackControllerKt$rememberHatchInteractiveBackController$1$1$cancelBeforeNavigation$1);
                defaultHatchInteractiveBackController.cancel();
                C2183B9b c2183B9b3 = c2183B9b2;
                if (c2183B9b3 != null) {
                    C2mE c2mE2 = c2mE;
                    C7384Etj.A0Y(c2mE2, 0);
                    if (c2183B9b3.A03.remove(c2mE2)) {
                        C2182B9a c2182B9a = c2183B9b3.A00;
                        c2182B9a.A07.remove(c2mE2);
                        c2182B9a.A06.remove(c2mE2);
                        c2182B9a.A08.remove(c2mE2);
                        c2mE2.A00 = null;
                        c2mE2.A05();
                    }
                }
            }
        };
    }
}
