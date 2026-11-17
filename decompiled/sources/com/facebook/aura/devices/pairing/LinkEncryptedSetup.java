package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetup extends C06G {
    public static final int $stable = LinkEncryptedPairingSession.$stable | LinkDeviceInfo.$stable;
    public final LinkDeviceInfo deviceInfo;
    public final LinkEncryptedPairingSession session;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkEncryptedSetup) {
                LinkEncryptedSetup linkEncryptedSetup = (LinkEncryptedSetup) obj;
                if (!C7384Etj.areEqual(this.deviceInfo, linkEncryptedSetup.deviceInfo) || !C7384Etj.areEqual(this.session, linkEncryptedSetup.session)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkEncryptedSetup copy$default(LinkEncryptedSetup linkEncryptedSetup, LinkDeviceInfo linkDeviceInfo, LinkEncryptedPairingSession linkEncryptedPairingSession, int i, Object obj) {
        if ((i & 1) != 0) {
            linkDeviceInfo = linkEncryptedSetup.deviceInfo;
        }
        if ((i & 2) != 0) {
            linkEncryptedPairingSession = linkEncryptedSetup.session;
        }
        AnonymousClass003.A0u(linkDeviceInfo, linkEncryptedPairingSession);
        return new LinkEncryptedSetup(linkDeviceInfo, linkEncryptedPairingSession);
    }

    public final LinkDeviceInfo component1() {
        return this.deviceInfo;
    }

    public final LinkEncryptedPairingSession component2() {
        return this.session;
    }

    public final LinkDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public final LinkEncryptedPairingSession getSession() {
        return this.session;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.session, AnonymousClass005.A0E(this.deviceInfo));
    }

    public LinkEncryptedSetup(LinkDeviceInfo linkDeviceInfo, LinkEncryptedPairingSession linkEncryptedPairingSession) {
        AnonymousClass003.A0u(linkDeviceInfo, linkEncryptedPairingSession);
        this.deviceInfo = linkDeviceInfo;
        this.session = linkEncryptedPairingSession;
    }

    public final LinkEncryptedSetup copy(LinkDeviceInfo linkDeviceInfo, LinkEncryptedPairingSession linkEncryptedPairingSession) {
        AnonymousClass003.A0u(linkDeviceInfo, linkEncryptedPairingSession);
        return new LinkEncryptedSetup(linkDeviceInfo, linkEncryptedPairingSession);
    }

    public String toString() {
        return super.toString();
    }
}
