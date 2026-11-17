package com.facebook.aura.pairs;

import X.AnonymousClass005;
import com.facebook.aura.navigation.key.PairsRole;

/* loaded from: classes3.dex */
public final class PairsStatusSnapshot {
    public static final int $stable = (PairsHeldInvite.$stable | PairsContact.$stable) | PairsAccess.$stable;
    public final PairsAccess access;
    public final PairsContact contact;
    public final String expectedName;
    public final String generationId;
    public final PairsHeldInvite heldInvite;
    public final PairsRole role;

    public final PairsAccess getAccess() {
        return this.access;
    }

    public final boolean getAwaitsServerConfirmation() {
        PairsContact pairsContact = this.contact;
        return pairsContact != null && getPredictsServerConfirmation() && pairsContact.relationshipState == PairsRelationshipState.AWAITING_SAS && !pairsContact.getHasConfirmedLocally() && this.access.canConfirmSafetyCode;
    }

    public final boolean getCanRetryAccept() {
        return this.role == PairsRole.RECEIVER && this.heldInvite != null;
    }

    public final boolean getConfirmsAutomatically() {
        PairsRole pairsRole;
        PairsContact pairsContact = this.contact;
        return pairsContact != null && (pairsRole = this.role) == PairsRole.RECEIVER && this.access.canConfirmSafetyCode && !pairsContact.sasConfirmedLocal && pairsContact.relationshipState == PairsRelationshipState.AWAITING_SAS && PairsPairingRules.INSTANCE.confirmsByItself(pairsRole, pairsContact, this.expectedName);
    }

    public final PairsContact getContact() {
        return this.contact;
    }

    public final String getExpectedName() {
        return this.expectedName;
    }

    public final String getGenerationId() {
        return this.generationId;
    }

    public final PairsHeldInvite getHeldInvite() {
        return this.heldInvite;
    }

    public final boolean getPredictsServerConfirmation() {
        PairsContact pairsContact;
        PairsRole pairsRole = this.role;
        return pairsRole == PairsRole.INVITER && (pairsContact = this.contact) != null && PairsPairingRules.INSTANCE.confirmsByItself(pairsRole, pairsContact, this.expectedName);
    }

    public final PairsRole getRole() {
        return this.role;
    }

    public PairsStatusSnapshot(PairsAccess pairsAccess, String str, PairsRole pairsRole, PairsContact pairsContact, String str2, PairsHeldInvite pairsHeldInvite) {
        AnonymousClass005.A0x(pairsAccess, str, pairsRole);
        this.access = pairsAccess;
        this.generationId = str;
        this.role = pairsRole;
        this.contact = pairsContact;
        this.expectedName = str2;
        this.heldInvite = pairsHeldInvite;
    }
}
