package com.facebook.aura.sharesheet;

import X.C06H;

/* loaded from: classes.dex */
public final class HatchShareContent {
    public final HatchPreparedShareMedia media;
    public final String text;

    public final HatchPreparedShareMedia getMedia() {
        return this.media;
    }

    public final String getText() {
        return this.text;
    }

    public HatchShareContent(HatchPreparedShareMedia hatchPreparedShareMedia, String str) {
        this.media = hatchPreparedShareMedia;
        this.text = str;
    }

    public /* synthetic */ HatchShareContent(HatchPreparedShareMedia hatchPreparedShareMedia, String str, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchPreparedShareMedia, (i & 2) != 0 ? null : str);
    }

    public HatchShareContent() {
        this(null, null);
    }
}
