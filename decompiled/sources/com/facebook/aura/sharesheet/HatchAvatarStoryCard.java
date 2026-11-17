package com.facebook.aura.sharesheet;

import X.AnonymousClass003;

/* loaded from: classes.dex */
public final class HatchAvatarStoryCard {
    public static final int $stable = 0;
    public final String bubbleText;
    public final HatchAvatarStoryPalette palette;

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final HatchAvatarStoryPalette getPalette() {
        return this.palette;
    }

    public HatchAvatarStoryCard(HatchAvatarStoryPalette hatchAvatarStoryPalette, String str) {
        AnonymousClass003.A0u(hatchAvatarStoryPalette, str);
        this.palette = hatchAvatarStoryPalette;
        this.bubbleText = str;
    }
}
