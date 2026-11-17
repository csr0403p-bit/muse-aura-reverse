package com.facebook.aura.devices.pairing;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupSnapshot extends C06G {
    public final LinkPairingConfirmation confirmation;
    public final int generation;
    public final LinkEncryptedSetup setup;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkEncryptedSetupSnapshot) {
                LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot = (LinkEncryptedSetupSnapshot) obj;
                if (this.generation != linkEncryptedSetupSnapshot.generation || !C7384Etj.areEqual(this.setup, linkEncryptedSetupSnapshot.setup) || !C7384Etj.areEqual(this.confirmation, linkEncryptedSetupSnapshot.confirmation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LinkEncryptedSetupSnapshot copy$default(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, int i, LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = linkEncryptedSetupSnapshot.generation;
        }
        if ((i2 & 2) != 0) {
            linkEncryptedSetup = linkEncryptedSetupSnapshot.setup;
        }
        if ((i2 & 4) != 0) {
            linkPairingConfirmation = linkEncryptedSetupSnapshot.confirmation;
        }
        return linkEncryptedSetupSnapshot.copy(i, linkEncryptedSetup, linkPairingConfirmation);
    }

    public final int component1() {
        return this.generation;
    }

    public final LinkEncryptedSetup component2() {
        return this.setup;
    }

    public final LinkPairingConfirmation component3() {
        return this.confirmation;
    }

    public final LinkPairingConfirmation getConfirmation() {
        return this.confirmation;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public final LinkEncryptedSetup getSetup() {
        return this.setup;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.confirmation, AnonymousClass005.A0F(this.setup, this.generation * 31));
    }

    public LinkEncryptedSetupSnapshot(int i, LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation) {
        AnonymousClass003.A0x(linkEncryptedSetup, linkPairingConfirmation);
        this.generation = i;
        this.setup = linkEncryptedSetup;
        this.confirmation = linkPairingConfirmation;
    }

    public final LinkEncryptedSetupSnapshot copy(int i, LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation) {
        AnonymousClass003.A0x(linkEncryptedSetup, linkPairingConfirmation);
        return new LinkEncryptedSetupSnapshot(i, linkEncryptedSetup, linkPairingConfirmation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LinkEncryptedSetupSnapshot(int i, LinkEncryptedSetup linkEncryptedSetup, LinkPairingConfirmation linkPairingConfirmation, int i2, C06H c06h) {
        this(i, linkEncryptedSetup, (i2 & 4) != 0 ? new LinkPairingConfirmation(null) : linkPairingConfirmation);
    }
}
