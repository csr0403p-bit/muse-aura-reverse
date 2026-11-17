package com.facebook.traffic.nts.providers.init;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ProviderInitEntry extends C06G {
    public final Function0<Unit> action;
    public final ProviderId providerId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProviderInitEntry) {
                ProviderInitEntry providerInitEntry = (ProviderInitEntry) obj;
                if (this.providerId != providerInitEntry.providerId || !C7384Etj.areEqual(this.action, providerInitEntry.action)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProviderInitEntry copy$default(ProviderInitEntry providerInitEntry, ProviderId providerId, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            providerId = providerInitEntry.providerId;
        }
        if ((i & 2) != 0) {
            function0 = providerInitEntry.action;
        }
        AnonymousClass003.A0u(providerId, function0);
        return new ProviderInitEntry(providerId, function0);
    }

    public final ProviderId component1() {
        return this.providerId;
    }

    public final Function0<Unit> component2() {
        return this.action;
    }

    public final Function0<Unit> getAction() {
        return this.action;
    }

    public final ProviderId getProviderId() {
        return this.providerId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.action, AnonymousClass005.A0E(this.providerId));
    }

    public ProviderInitEntry(ProviderId providerId, Function0<Unit> function0) {
        AnonymousClass003.A0u(providerId, function0);
        this.providerId = providerId;
        this.action = function0;
    }

    public final ProviderInitEntry copy(ProviderId providerId, Function0<Unit> function0) {
        AnonymousClass003.A0u(providerId, function0);
        return new ProviderInitEntry(providerId, function0);
    }

    public String toString() {
        return super.toString();
    }
}
