package com.facebook.aura.pairs;

import X.AnonymousClass003;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.PairsHistoryScreenKey;

/* loaded from: classes3.dex */
public final class ConnectionsPerson {
    public static final int $stable = 8;
    public final PairsContact contact;
    public final PairsHistoryScreenKey conversation;
    public final AuraNavKey target;

    public final PairsContact getContact() {
        return this.contact;
    }

    public final PairsHistoryScreenKey getConversation() {
        return this.conversation;
    }

    public final AuraNavKey getTarget() {
        return this.target;
    }

    public ConnectionsPerson(PairsContact pairsContact, AuraNavKey auraNavKey, PairsHistoryScreenKey pairsHistoryScreenKey) {
        AnonymousClass003.A0u(pairsContact, auraNavKey);
        this.contact = pairsContact;
        this.target = auraNavKey;
        this.conversation = pairsHistoryScreenKey;
    }
}
