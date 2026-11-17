package com.facebook.aura.user.provider;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C06H;
import X.C7384Etj;
import X.CFK;
import X.InterfaceC7549F2g;
import com.facebook.aura.main.HatchActiveSessionHostKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class HatchGatewayConnectOwnership implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final AtomicBoolean activationViewModelRoutePending;
    public final AtomicBoolean initialForegroundEmissionSkipPending;
    public final AtomicBoolean initialStartupJobSkipPending;
    public final HatchGatewayConnectOwner owner;

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    public final boolean consumeActivationViewModelRoute() {
        return this.activationViewModelRoutePending.compareAndSet(true, false);
    }

    public final boolean consumeInitialForegroundEmissionSkip() {
        return this.initialForegroundEmissionSkipPending.compareAndSet(true, false);
    }

    public final boolean consumeInitialStartupJobSkip() {
        return this.initialStartupJobSkipPending.compareAndSet(true, false);
    }

    public final HatchGatewayConnectOwner getOwner() {
        return this.owner;
    }

    public final boolean getShouldRouteThroughActivationViewModel() {
        return this.activationViewModelRoutePending.get();
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final HatchGatewayConnectOwnership getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGatewayConnectOwnership) abstractC3358CGz.A03(HatchGatewayConnectOwnership.class, HatchGatewayConnectOwnership$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchGatewayConnectOwnership(C06H c06h) {
        this();
    }

    public HatchGatewayConnectOwnership() {
        HatchGatewayConnectOwner hatchGatewayConnectOwner;
        if (AuraUserDataFetchState.INSTANCE.isFirstFetchPending()) {
            hatchGatewayConnectOwner = HatchGatewayConnectOwner.ACTIVATION_VIEW_MODEL;
        } else {
            hatchGatewayConnectOwner = HatchGatewayConnectOwner.STARTUP_JOB;
        }
        this.owner = hatchGatewayConnectOwner;
        HatchGatewayConnectOwner hatchGatewayConnectOwner2 = HatchGatewayConnectOwner.ACTIVATION_VIEW_MODEL;
        this.initialStartupJobSkipPending = new AtomicBoolean(AnonymousClass002.A1Z(hatchGatewayConnectOwner, hatchGatewayConnectOwner2));
        this.activationViewModelRoutePending = new AtomicBoolean(hatchGatewayConnectOwner == hatchGatewayConnectOwner2);
        this.initialForegroundEmissionSkipPending = new AtomicBoolean(true);
        CFK.A05(HatchActiveSessionHostKt.TAG, AnonymousClass007.A0a("ownership owner=", hatchGatewayConnectOwner));
    }
}
