package com.facebook.aura.email.repo;

/* loaded from: classes.dex */
public final class EmailInlineImageBudget {
    public int characters = 8388608;
    public long pixels = 32000000;
    public int requests = 48;

    public final int getCharacters() {
        return this.characters;
    }

    public final long getPixels() {
        return this.pixels;
    }

    public final int getRequests() {
        return this.requests;
    }

    public final void setCharacters(int i) {
        this.characters = i;
    }

    public final void setPixels(long j) {
        this.pixels = j;
    }

    public final void setRequests(int i) {
        this.requests = i;
    }
}
