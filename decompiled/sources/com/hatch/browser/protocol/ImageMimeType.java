package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ImageMimeType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ImageMimeType[] $VALUES;
    public static final Companion Companion;
    public static final ImageMimeType JPEG;
    public static final ImageMimeType PNG;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        ImageMimeType imageMimeType = new ImageMimeType("PNG", 0);
        PNG = imageMimeType;
        ImageMimeType imageMimeType2 = new ImageMimeType("JPEG", 1);
        JPEG = imageMimeType2;
        ImageMimeType[] imageMimeTypeArr = {imageMimeType, imageMimeType2};
        $VALUES = imageMimeTypeArr;
        $ENTRIES = C3cG.A0w(imageMimeTypeArr);
        Companion = new Companion();
    }

    public static Ey9<ImageMimeType> getEntries() {
        return $ENTRIES;
    }

    public static ImageMimeType valueOf(String str) {
        return (ImageMimeType) Enum.valueOf(ImageMimeType.class, str);
    }

    public static ImageMimeType[] values() {
        return (ImageMimeType[]) $VALUES.clone();
    }

    public ImageMimeType(String str, int i) {
    }
}
