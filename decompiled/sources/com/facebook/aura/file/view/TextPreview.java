package com.facebook.aura.file.view;

import X.C7384Etj;

/* loaded from: classes3.dex */
public final class TextPreview {
    public final String content;
    public final boolean truncated;

    public TextPreview(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.content = str;
        this.truncated = z;
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean getTruncated() {
        return this.truncated;
    }
}
