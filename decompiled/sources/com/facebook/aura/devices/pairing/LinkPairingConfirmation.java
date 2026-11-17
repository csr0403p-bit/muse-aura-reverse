package com.facebook.aura.devices.pairing;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkPairingConfirmation extends C06G {
    public static final int $stable = 0;
    public final String sdkToken;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LinkPairingConfirmation) && C7384Etj.areEqual(this.sdkToken, ((LinkPairingConfirmation) obj).sdkToken));
    }

    public static /* synthetic */ LinkPairingConfirmation copy$default(LinkPairingConfirmation linkPairingConfirmation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkPairingConfirmation.sdkToken;
        }
        return new LinkPairingConfirmation(str);
    }

    public final String component1() {
        return this.sdkToken;
    }

    public final LinkPairingConfirmation copy(String str) {
        return new LinkPairingConfirmation(str);
    }

    public final String getSdkToken() {
        return this.sdkToken;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.sdkToken);
    }

    public /* synthetic */ LinkPairingConfirmation(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public String toString() {
        return super.toString();
    }

    public LinkPairingConfirmation(String str) {
        this.sdkToken = str;
    }

    public LinkPairingConfirmation() {
        this(null);
    }
}
