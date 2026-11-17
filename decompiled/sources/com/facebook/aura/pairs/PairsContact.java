package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class PairsContact {
    public static final int $stable = 0;
    public final String agentName;
    public final boolean attested;
    public final PairsImageRef avatar;
    public final String chatSessionId;
    public final String connectionId;
    public final String displayName;
    public final boolean isSpaceOnly;
    public final Long lastActivityAtMs;
    public final PairsLevel level;
    public final String museId;
    public final Long pairedAtMs;
    public final PairsImageRef photo;
    public final PairsRelationship relationship;
    public final PairsRelationshipState relationshipState;
    public final Long requestExpiresAtMs;
    public final boolean sasConfirmedLocal;
    public final PairsContactStatus status;

    public final String getAgentName() {
        return this.agentName;
    }

    public final boolean getAttested() {
        return this.attested;
    }

    public final PairsImageRef getAvatar() {
        return this.avatar;
    }

    public final String getChatSessionId() {
        return this.chatSessionId;
    }

    public final String getConnectionId() {
        return this.connectionId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getHasConfirmedLocally() {
        return this.relationshipState == PairsRelationshipState.CONFIRMED_LOCAL || this.sasConfirmedLocal;
    }

    public final Long getLastActivityAtMs() {
        return this.lastActivityAtMs;
    }

    public final PairsLevel getLevel() {
        return this.level;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public final Long getPairedAtMs() {
        return this.pairedAtMs;
    }

    public final PairsImageRef getPhoto() {
        return this.photo;
    }

    public final PairsRelationship getRelationship() {
        return this.relationship;
    }

    public final PairsRelationshipState getRelationshipState() {
        return this.relationshipState;
    }

    public final Long getRequestExpiresAtMs() {
        return this.requestExpiresAtMs;
    }

    public final boolean getSasConfirmedLocal() {
        return this.sasConfirmedLocal;
    }

    public final PairsContactStatus getStatus() {
        return this.status;
    }

    public final boolean isSpaceOnly() {
        return this.isSpaceOnly;
    }

    public final boolean isVerified() {
        return AnonymousClass002.A1Z(this.status, PairsContactStatus.VERIFIED);
    }

    public PairsContact(String str, String str2, String str3, PairsContactStatus pairsContactStatus, PairsLevel pairsLevel, PairsImageRef pairsImageRef, PairsImageRef pairsImageRef2, String str4, Long l, PairsRelationship pairsRelationship, PairsRelationshipState pairsRelationshipState, boolean z, boolean z2, Long l2, Long l3, boolean z3, String str5) {
        AnonymousClass005.A14(str, str2, str3, pairsContactStatus);
        C7384Etj.A0Y(pairsRelationshipState, 10);
        this.museId = str;
        this.displayName = str2;
        this.agentName = str3;
        this.status = pairsContactStatus;
        this.level = pairsLevel;
        this.photo = pairsImageRef;
        this.avatar = pairsImageRef2;
        this.chatSessionId = str4;
        this.lastActivityAtMs = l;
        this.relationship = pairsRelationship;
        this.relationshipState = pairsRelationshipState;
        this.sasConfirmedLocal = z;
        this.attested = z2;
        this.requestExpiresAtMs = l2;
        this.pairedAtMs = l3;
        this.isSpaceOnly = z3;
        this.connectionId = str5;
    }

    public /* synthetic */ PairsContact(String str, String str2, String str3, PairsContactStatus pairsContactStatus, PairsLevel pairsLevel, PairsImageRef pairsImageRef, PairsImageRef pairsImageRef2, String str4, Long l, PairsRelationship pairsRelationship, PairsRelationshipState pairsRelationshipState, boolean z, boolean z2, Long l2, Long l3, boolean z3, String str5, int i, C06H c06h) {
        this(str, str2, str3, pairsContactStatus, pairsLevel, pairsImageRef, pairsImageRef2, str4, l, pairsRelationship, pairsRelationshipState, z, z2, l2, l3, C3cH.A1L(i, 32768, z3), (i & 65536) != 0 ? null : str5);
    }
}
