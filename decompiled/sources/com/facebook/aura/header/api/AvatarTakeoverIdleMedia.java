package com.facebook.aura.header.api;

import X.AWA;
import X.C06H;
import X.C3cI;

/* loaded from: classes2.dex */
public final class AvatarTakeoverIdleMedia {
    public static final int $stable = 0;
    public final float cropTopFraction;
    public final boolean imageIsVideoPoster;
    public final AWA imageSize;
    public final String imageUri;
    public final boolean videoPlaybackEnabled;
    public final String videoUri;

    public /* synthetic */ AvatarTakeoverIdleMedia(String str, String str2, float f, AWA awa, boolean z, boolean z2, int i, C06H c06h) {
        this(str, str2, f, (i & 8) != 0 ? null : awa, C3cI.A1S(i, z), (i & 32) != 0 ? true : z2);
    }

    public final float getCropTopFraction() {
        return this.cropTopFraction;
    }

    public final boolean getImageIsVideoPoster() {
        return this.imageIsVideoPoster;
    }

    /* renamed from: getImageSize-VsRJwc0, reason: not valid java name */
    public final AWA m977getImageSizeVsRJwc0() {
        return this.imageSize;
    }

    public final String getImageUri() {
        return this.imageUri;
    }

    public final boolean getVideoPlaybackEnabled() {
        return this.videoPlaybackEnabled;
    }

    public final String getVideoUri() {
        return this.videoUri;
    }

    public AvatarTakeoverIdleMedia(String str, String str2, float f, AWA awa, boolean z, boolean z2) {
        this.videoUri = str;
        this.imageUri = str2;
        this.cropTopFraction = f;
        this.imageSize = awa;
        this.imageIsVideoPoster = z;
        this.videoPlaybackEnabled = z2;
    }

    public /* synthetic */ AvatarTakeoverIdleMedia(String str, String str2, float f, AWA awa, boolean z, boolean z2, C06H c06h) {
        this(str, str2, f, awa, z, z2);
    }
}
