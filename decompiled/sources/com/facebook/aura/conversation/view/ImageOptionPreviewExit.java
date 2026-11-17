package com.facebook.aura.conversation.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ImageOptionPreviewExit {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ImageOptionPreviewExit[] $VALUES;
    public static final ImageOptionPreviewExit Dismiss;
    public static final ImageOptionPreviewExit Open;
    public static final ImageOptionPreviewExit Share;

    static {
        ImageOptionPreviewExit imageOptionPreviewExit = new ImageOptionPreviewExit("Dismiss", 0);
        Dismiss = imageOptionPreviewExit;
        ImageOptionPreviewExit imageOptionPreviewExit2 = new ImageOptionPreviewExit("Open", 1);
        Open = imageOptionPreviewExit2;
        ImageOptionPreviewExit imageOptionPreviewExit3 = new ImageOptionPreviewExit("Share", 2);
        Share = imageOptionPreviewExit3;
        ImageOptionPreviewExit[] imageOptionPreviewExitArr = {imageOptionPreviewExit, imageOptionPreviewExit2, imageOptionPreviewExit3};
        $VALUES = imageOptionPreviewExitArr;
        $ENTRIES = new F3w(imageOptionPreviewExitArr);
    }

    public static Ey9<ImageOptionPreviewExit> getEntries() {
        return $ENTRIES;
    }

    public static ImageOptionPreviewExit valueOf(String str) {
        return (ImageOptionPreviewExit) Enum.valueOf(ImageOptionPreviewExit.class, str);
    }

    public static ImageOptionPreviewExit[] values() {
        return (ImageOptionPreviewExit[]) $VALUES.clone();
    }

    public ImageOptionPreviewExit(String str, int i) {
    }
}
