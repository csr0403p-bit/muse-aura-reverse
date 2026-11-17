package com.facebook.aura.file.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class MediaViewerDismissGestureMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ MediaViewerDismissGestureMode[] $VALUES;
    public static final MediaViewerDismissGestureMode INTERACTIVE_SHARED_ELEMENT;
    public static final MediaViewerDismissGestureMode STATIC_SWIPE_DOWN;

    static {
        MediaViewerDismissGestureMode mediaViewerDismissGestureMode = new MediaViewerDismissGestureMode("INTERACTIVE_SHARED_ELEMENT", 0);
        INTERACTIVE_SHARED_ELEMENT = mediaViewerDismissGestureMode;
        MediaViewerDismissGestureMode mediaViewerDismissGestureMode2 = new MediaViewerDismissGestureMode("STATIC_SWIPE_DOWN", 1);
        STATIC_SWIPE_DOWN = mediaViewerDismissGestureMode2;
        MediaViewerDismissGestureMode[] mediaViewerDismissGestureModeArr = {mediaViewerDismissGestureMode, mediaViewerDismissGestureMode2};
        $VALUES = mediaViewerDismissGestureModeArr;
        $ENTRIES = new F3w(mediaViewerDismissGestureModeArr);
    }

    public static Ey9<MediaViewerDismissGestureMode> getEntries() {
        return $ENTRIES;
    }

    public static MediaViewerDismissGestureMode valueOf(String str) {
        return (MediaViewerDismissGestureMode) Enum.valueOf(MediaViewerDismissGestureMode.class, str);
    }

    public static MediaViewerDismissGestureMode[] values() {
        return (MediaViewerDismissGestureMode[]) $VALUES.clone();
    }

    public MediaViewerDismissGestureMode(String str, int i) {
    }
}
