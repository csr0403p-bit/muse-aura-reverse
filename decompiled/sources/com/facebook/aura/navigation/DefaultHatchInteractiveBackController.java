package com.facebook.aura.navigation;

import X.AMc;
import X.ATD;
import X.AnonymousClass005;
import X.C1BO;
import X.C2183B9b;
import X.C2193B9y;
import X.C2mE;
import X.C3cG;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class DefaultHatchInteractiveBackController implements HatchInteractiveBackController {
    public final C2183B9b dispatcher;
    public final C2mE input;
    public boolean isActive;
    public final AuraNavigator navigator;
    public final C1BO<Function0<Unit>> onBackFallback;
    public final AuraNavKey screenKey;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultHatchInteractiveBackController(C2mE c2mE, C2183B9b c2183B9b, C1BO<? extends Function0<Unit>> c1bo, AuraNavigator auraNavigator, AuraNavKey auraNavKey) {
        AnonymousClass005.A11(c2mE, c1bo, auraNavigator, 0);
        C7384Etj.A0Y(auraNavKey, 4);
        this.input = c2mE;
        this.dispatcher = c2183B9b;
        this.onBackFallback = c1bo;
        this.navigator = auraNavigator;
        this.screenKey = auraNavKey;
    }

    private final boolean isCurrentDestination() {
        return C7384Etj.areEqual(this.navigator.currentKey(true), this.screenKey);
    }

    @Override // com.facebook.aura.navigation.HatchInteractiveBackController
    public void cancel() {
        if (this.isActive) {
            this.isActive = false;
            if (this.dispatcher != null) {
                this.input.A02();
            }
        }
    }

    @Override // com.facebook.aura.navigation.HatchInteractiveBackController
    public boolean complete() {
        if (this.isActive) {
            if (isCurrentDestination()) {
                this.isActive = false;
                if (this.dispatcher != null) {
                    this.input.A03();
                    return true;
                }
                C1BO.A0D(this.onBackFallback);
                return true;
            }
            cancel();
        }
        return false;
    }

    @Override // com.facebook.aura.navigation.HatchInteractiveBackController
    public void seek(float f) {
        if (!this.isActive || this.dispatcher == null) {
            return;
        }
        this.input.A04(new C2193B9y(2, 0L, ATD.A03(f, 0.0f, 1.0f), 0.0f, 0.0f));
    }

    @Override // com.facebook.aura.navigation.HatchInteractiveBackController
    public boolean start() {
        if (isCurrentDestination()) {
            if (!this.isActive) {
                C2183B9b c2183B9b = this.dispatcher;
                if (c2183B9b == null || (c2183B9b.A00.A0C.getValue() instanceof AMc)) {
                    this.isActive = true;
                    if (this.dispatcher != null) {
                        C2mE c2mE = this.input;
                        C2193B9y c2193B9y = new C2193B9y(2, 0L, 0.0f, 0.0f, 0.0f);
                        C2183B9b c2183B9b2 = c2mE.A00;
                        if (c2183B9b2 == null) {
                            throw C3cG.A0Q("This input is not added to any dispatcher.");
                        }
                        if (!c2mE.A01) {
                            c2183B9b2.A01(c2193B9y, c2mE);
                            c2mE.A01 = true;
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
