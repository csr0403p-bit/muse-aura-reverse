package com.facebook.aura.pairs;

import X.AnonymousClass005;

/* loaded from: classes3.dex */
public final class PairsHistoryMessage {
    public static final int $stable = 0;
    public final long atMs;
    public final PairsHistoryAuthor author;
    public final String id;
    public final long seq;
    public final String text;

    public PairsHistoryMessage(String str, long j, PairsHistoryAuthor pairsHistoryAuthor, String str2, long j2) {
        AnonymousClass005.A11(str, pairsHistoryAuthor, str2, 0);
        this.id = str;
        this.seq = j;
        this.author = pairsHistoryAuthor;
        this.text = str2;
        this.atMs = j2;
    }

    public final long getAtMs() {
        return this.atMs;
    }

    public final PairsHistoryAuthor getAuthor() {
        return this.author;
    }

    public final String getId() {
        return this.id;
    }

    public final long getSeq() {
        return this.seq;
    }

    public final String getText() {
        return this.text;
    }
}
