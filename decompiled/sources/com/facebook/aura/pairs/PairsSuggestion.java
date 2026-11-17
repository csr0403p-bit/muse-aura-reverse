package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.AnonymousClass003;
import com.facebook.aura.navigation.key.PairsMuseRecipient;
import java.util.List;

/* loaded from: classes3.dex */
public final class PairsSuggestion {
    public static final int $stable = 8;
    public final String id;
    public final boolean isOnMuse;
    public final PairsMuseRecipient museRecipient;
    public final String name;
    public final String photoUrl;
    public final List<String> searchableNames;
    public final PairsSuggestionSource source;
    public final String subtitle;

    public final String getId() {
        return this.id;
    }

    public final PairsMuseRecipient getMuseRecipient() {
        return this.museRecipient;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final List<String> getSearchableNames() {
        return this.searchableNames;
    }

    public final PairsSuggestionSource getSource() {
        return this.source;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean isOnMuse() {
        return this.isOnMuse;
    }

    public PairsSuggestion(String str, String str2, String str3, String str4, PairsSuggestionSource pairsSuggestionSource, boolean z, List<String> list, PairsMuseRecipient pairsMuseRecipient) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass002.A1E(pairsSuggestionSource, 4, list);
        this.id = str;
        this.name = str2;
        this.subtitle = str3;
        this.photoUrl = str4;
        this.source = pairsSuggestionSource;
        this.isOnMuse = z;
        this.searchableNames = list;
        this.museRecipient = pairsMuseRecipient;
    }
}
