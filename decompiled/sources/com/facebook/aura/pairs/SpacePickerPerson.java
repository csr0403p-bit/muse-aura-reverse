package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.C06H;

/* loaded from: classes3.dex */
public final class SpacePickerPerson {
    public static final int $stable = PairsSuggestion.$stable | PairsContact.$stable;
    public final PairsContact contact;
    public final String id;
    public final String name;
    public final PairsSuggestion suggestion;

    public /* synthetic */ SpacePickerPerson(String str, String str2, PairsContact pairsContact, PairsSuggestion pairsSuggestion, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : pairsContact, (i & 8) != 0 ? null : pairsSuggestion);
    }

    public final PairsContact getContact() {
        return this.contact;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final PairsSuggestion getSuggestion() {
        return this.suggestion;
    }

    public final boolean isOnMuse() {
        PairsSuggestion pairsSuggestion;
        return this.contact != null || ((pairsSuggestion = this.suggestion) != null && pairsSuggestion.isOnMuse);
    }

    public SpacePickerPerson(String str, String str2, PairsContact pairsContact, PairsSuggestion pairsSuggestion) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.name = str2;
        this.contact = pairsContact;
        this.suggestion = pairsSuggestion;
    }
}
