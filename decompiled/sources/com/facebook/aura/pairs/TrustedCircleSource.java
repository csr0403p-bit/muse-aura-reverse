package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class TrustedCircleSource {
    public final boolean isPerson;
    public final TrustedCircleSourceJson json;
    public final String recipientType;
    public final PairsSuggestionSource source;
    public final int sourceRank;

    public final TrustedCircleSourceJson getJson() {
        return this.json;
    }

    public final String getRecipientType() {
        return this.recipientType;
    }

    public final PairsSuggestionSource getSource() {
        return this.source;
    }

    public final int getSourceRank() {
        return this.sourceRank;
    }

    public final boolean isPerson() {
        return this.isPerson;
    }

    public TrustedCircleSource(TrustedCircleSourceJson trustedCircleSourceJson, PairsSuggestionSource pairsSuggestionSource, String str, boolean z, int i) {
        AnonymousClass005.A0x(trustedCircleSourceJson, pairsSuggestionSource, str);
        this.json = trustedCircleSourceJson;
        this.source = pairsSuggestionSource;
        this.recipientType = str;
        this.isPerson = z;
        this.sourceRank = i;
    }
}
