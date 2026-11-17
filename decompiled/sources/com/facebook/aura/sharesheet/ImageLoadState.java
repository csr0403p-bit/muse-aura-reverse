package com.facebook.aura.sharesheet;

import X.Ey9;
import X.F3w;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ImageLoadState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ImageLoadState[] $VALUES;
    public static final ImageLoadState FAILED;
    public static final ImageLoadState LOADED;
    public static final ImageLoadState LOADING;

    static {
        ImageLoadState imageLoadState = new ImageLoadState("LOADING", 0);
        LOADING = imageLoadState;
        ImageLoadState imageLoadState2 = new ImageLoadState("LOADED", 1);
        LOADED = imageLoadState2;
        ImageLoadState imageLoadState3 = new ImageLoadState(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = imageLoadState3;
        ImageLoadState[] imageLoadStateArr = {imageLoadState, imageLoadState2, imageLoadState3};
        $VALUES = imageLoadStateArr;
        $ENTRIES = new F3w(imageLoadStateArr);
    }

    public static Ey9<ImageLoadState> getEntries() {
        return $ENTRIES;
    }

    public static ImageLoadState valueOf(String str) {
        return (ImageLoadState) Enum.valueOf(ImageLoadState.class, str);
    }

    public static ImageLoadState[] values() {
        return (ImageLoadState[]) $VALUES.clone();
    }

    public ImageLoadState(String str, int i) {
    }
}
