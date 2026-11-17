package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkConfirmedSetup extends C06G {
    public final LinkPairingConfirmation confirmation;
    public final LinkEncryptedSetup setup;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkConfirmedSetup) {
                LinkConfirmedSetup linkConfirmedSetup = (LinkConfirmedSetup) obj;
                if (!C7384Etj.areEqual(this.setup, linkConfirmedSetup.setup) || !C7384Etj.areEqual(this.confirmation, linkConfirmedSetup.confirmation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkConfirmedSetup copy$default(LinkConfirmedSetup linkConfirmedSetup, LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation, int i, Object obj) {
        if ((i & 1) != 0) {
            linkEncryptedSetup = linkConfirmedSetup.setup;
        }
        if ((i & 2) != 0) {
            linkPairingConfirmation = linkConfirmedSetup.confirmation;
        }
        AnonymousClass003.A0u(linkEncryptedSetup, linkPairingConfirmation);
        return new LinkConfirmedSetup(linkEncryptedSetup, linkPairingConfirmation);
    }

    public final LinkEncryptedSetup component1() {
        return this.setup;
    }

    public final LinkPairingConfirmation component2() {
        return this.confirmation;
    }

    public final LinkPairingConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final LinkEncryptedSetup getSetup() {
        return this.setup;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.confirmation, AnonymousClass005.A0E(this.setup));
    }

    public LinkConfirmedSetup(LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation) {
        AnonymousClass003.A0u(linkEncryptedSetup, linkPairingConfirmation);
        this.setup = linkEncryptedSetup;
        this.confirmation = linkPairingConfirmation;
    }

    public final LinkConfirmedSetup copy(LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation) {
        AnonymousClass003.A0u(linkEncryptedSetup, linkPairingConfirmation);
        return new LinkConfirmedSetup(linkEncryptedSetup, linkPairingConfirmation);
    }

    public String toString() {
        return super.toString();
    }
}
