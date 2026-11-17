package com.facebook.aura.subscription.view;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.G2k;
import com.facebook.aura.devices.intf.SubscriptionAddOnIntegration;
import com.facebook.aura.subscription.model.PaywallCta;
import com.facebook.aura.subscription.model.PurchaseTap;
import com.facebook.aura.subscription.repo.Disclaimer;
import com.facebook.aura.subscription.repo.SubscriptionNameDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class NameGate extends C06G {
    public static final int $stable = 0;
    public final G2k<PurchaseTap, SubscriptionNameDialog, Disclaimer, PaywallCta, SubscriptionAddOnIntegration, Unit> onHold;
    public final Function0<Unit> onNavigate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NameGate) {
                NameGate nameGate = (NameGate) obj;
                if (!C7384Etj.areEqual(this.onHold, nameGate.onHold) || !C7384Etj.areEqual(this.onNavigate, nameGate.onNavigate)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NameGate copy$default(NameGate nameGate, G2k g2k, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            g2k = nameGate.onHold;
        }
        if ((i & 2) != 0) {
            function0 = nameGate.onNavigate;
        }
        AnonymousClass003.A0u(g2k, function0);
        return new NameGate(g2k, function0);
    }

    public final G2k<PurchaseTap, SubscriptionNameDialog, Disclaimer, PaywallCta, SubscriptionAddOnIntegration, Unit> component1() {
        return this.onHold;
    }

    public final Function0<Unit> component2() {
        return this.onNavigate;
    }

    public final G2k<PurchaseTap, SubscriptionNameDialog, Disclaimer, PaywallCta, SubscriptionAddOnIntegration, Unit> getOnHold() {
        return this.onHold;
    }

    public final Function0<Unit> getOnNavigate() {
        return this.onNavigate;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onNavigate, AnonymousClass005.A0E(this.onHold));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NameGate(G2k<? super PurchaseTap, ? super SubscriptionNameDialog, ? super Disclaimer, ? super PaywallCta, ? super SubscriptionAddOnIntegration, Unit> g2k, Function0<Unit> function0) {
        AnonymousClass003.A0u(g2k, function0);
        this.onHold = g2k;
        this.onNavigate = function0;
    }

    public final NameGate copy(G2k<? super PurchaseTap, ? super SubscriptionNameDialog, ? super Disclaimer, ? super PaywallCta, ? super SubscriptionAddOnIntegration, Unit> g2k, Function0<Unit> function0) {
        AnonymousClass003.A0u(g2k, function0);
        return new NameGate(g2k, function0);
    }

    public String toString() {
        return super.toString();
    }
}
