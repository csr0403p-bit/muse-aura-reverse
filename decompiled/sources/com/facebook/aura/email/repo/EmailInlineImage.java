package com.facebook.aura.email.repo;

import X.C7384Etj;

/* loaded from: classes.dex */
public final class EmailInlineImage {
    public final long pixels;
    public final String source;

    public EmailInlineImage(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.source = str;
        this.pixels = j;
    }

    public final long getPixels() {
        return this.pixels;
    }

    public final String getSource() {
        return this.source;
    }
}
