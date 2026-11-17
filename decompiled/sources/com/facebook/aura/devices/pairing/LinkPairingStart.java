package com.facebook.aura.devices.pairing;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import java.security.KeyPair;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class LinkPairingStart extends C06G {
    public static final int $stable = 8;
    public final LinkPairingClientHello clientHello;
    public final ECPublicKey fleetPublicKey;
    public final byte[] mobileNonce;
    public final KeyPair mobilePrivateKey;
    public final LinkPairingMode pairingMode;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkPairingStart) {
                LinkPairingStart linkPairingStart = (LinkPairingStart) obj;
                if (!C7384Etj.areEqual(this.clientHello, linkPairingStart.clientHello) || this.pairingMode != linkPairingStart.pairingMode || !C7384Etj.areEqual(this.mobilePrivateKey, linkPairingStart.mobilePrivateKey) || !C7384Etj.areEqual(this.mobileNonce, linkPairingStart.mobileNonce) || !C7384Etj.areEqual(this.fleetPublicKey, linkPairingStart.fleetPublicKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkPairingStart copy$default(LinkPairingStart linkPairingStart, LinkPairingClientHello linkPairingClientHello, LinkPairingMode linkPairingMode, KeyPair keyPair, byte[] bArr, ECPublicKey eCPublicKey, int i, Object obj) {
        if ((i & 1) != 0) {
            linkPairingClientHello = linkPairingStart.clientHello;
        }
        if ((i & 2) != 0) {
            linkPairingMode = linkPairingStart.pairingMode;
        }
        if ((i & 4) != 0) {
            keyPair = linkPairingStart.mobilePrivateKey;
        }
        if ((i & 8) != 0) {
            bArr = linkPairingStart.mobileNonce;
        }
        if ((i & 16) != 0) {
            eCPublicKey = linkPairingStart.fleetPublicKey;
        }
        return linkPairingStart.copy(linkPairingClientHello, linkPairingMode, keyPair, bArr, eCPublicKey);
    }

    public final String clientHelloJson() {
        C9sU c9sU = HatchJsonKt.HatchJson;
        int i = LinkPairingClientHello.$stable;
        return c9sU.A02(this.clientHello, LinkPairingClientHello$$serializer.INSTANCE);
    }

    public final LinkPairingClientHello component1() {
        return this.clientHello;
    }

    public final LinkPairingMode component2() {
        return this.pairingMode;
    }

    public final KeyPair component3() {
        return this.mobilePrivateKey;
    }

    public final byte[] component4() {
        return this.mobileNonce;
    }

    public final ECPublicKey component5() {
        return this.fleetPublicKey;
    }

    public final LinkPairingClientHello getClientHello() {
        return this.clientHello;
    }

    public final ECPublicKey getFleetPublicKey() {
        return this.fleetPublicKey;
    }

    public final byte[] getMobileNonce() {
        return this.mobileNonce;
    }

    public final KeyPair getMobilePrivateKey() {
        return this.mobilePrivateKey;
    }

    public final LinkPairingMode getPairingMode() {
        return this.pairingMode;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.mobilePrivateKey, AnonymousClass005.A0F(this.pairingMode, AnonymousClass005.A0E(this.clientHello))) + Arrays.hashCode(this.mobileNonce)) * 31) + AnonymousClass006.A0D(this.fleetPublicKey);
    }

    public LinkPairingStart(LinkPairingClientHello linkPairingClientHello, LinkPairingMode linkPairingMode, KeyPair keyPair, byte[] bArr, ECPublicKey eCPublicKey) {
        AnonymousClass005.A14(linkPairingClientHello, linkPairingMode, keyPair, bArr);
        this.clientHello = linkPairingClientHello;
        this.pairingMode = linkPairingMode;
        this.mobilePrivateKey = keyPair;
        this.mobileNonce = bArr;
        this.fleetPublicKey = eCPublicKey;
    }

    public final LinkPairingStart copy(LinkPairingClientHello linkPairingClientHello, LinkPairingMode linkPairingMode, KeyPair keyPair, byte[] bArr, ECPublicKey eCPublicKey) {
        AnonymousClass005.A14(linkPairingClientHello, linkPairingMode, keyPair, bArr);
        return new LinkPairingStart(linkPairingClientHello, linkPairingMode, keyPair, bArr, eCPublicKey);
    }

    public String toString() {
        return super.toString();
    }
}
