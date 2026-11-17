package com.facebook.aura.devices.pairing;

import X.C06G;
import X.C0KA;

/* loaded from: classes4.dex */
public final class LinkOtaOffer extends C06G {
    public static final int $stable = 0;
    public final boolean isAvailable;
    public final boolean isRequestedByConfig;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkOtaOffer) {
                LinkOtaOffer linkOtaOffer = (LinkOtaOffer) obj;
                if (this.isAvailable != linkOtaOffer.isAvailable || this.isRequestedByConfig != linkOtaOffer.isRequestedByConfig) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkOtaOffer copy$default(LinkOtaOffer linkOtaOffer, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = linkOtaOffer.isAvailable;
        }
        if ((i & 2) != 0) {
            z2 = linkOtaOffer.isRequestedByConfig;
        }
        return new LinkOtaOffer(z, z2);
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final boolean component2() {
        return this.isRequestedByConfig;
    }

    public final LinkOtaOffer copy(boolean z, boolean z2) {
        return new LinkOtaOffer(z, z2);
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A02(this.isAvailable), this.isRequestedByConfig);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isRequestedByConfig() {
        return this.isRequestedByConfig;
    }

    public LinkOtaOffer(boolean z, boolean z2) {
        this.isAvailable = z;
        this.isRequestedByConfig = z2;
    }

    public String toString() {
        return super.toString();
    }
}
