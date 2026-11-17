package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class UploadMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ UploadMode[] $VALUES;
    public static final UploadMode ASSOCIATED_INPUT;
    public static final UploadMode CHOOSER;
    public static final Companion Companion;
    public static final UploadMode DIRECT;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        UploadMode uploadMode = new UploadMode("DIRECT", 0);
        DIRECT = uploadMode;
        UploadMode uploadMode2 = new UploadMode("CHOOSER", 1);
        CHOOSER = uploadMode2;
        UploadMode uploadMode3 = new UploadMode("ASSOCIATED_INPUT", 2);
        ASSOCIATED_INPUT = uploadMode3;
        UploadMode[] uploadModeArr = {uploadMode, uploadMode2, uploadMode3};
        $VALUES = uploadModeArr;
        $ENTRIES = C3cG.A0w(uploadModeArr);
        Companion = new Companion();
    }

    public static Ey9<UploadMode> getEntries() {
        return $ENTRIES;
    }

    public static UploadMode valueOf(String str) {
        return (UploadMode) Enum.valueOf(UploadMode.class, str);
    }

    public static UploadMode[] values() {
        return (UploadMode[]) $VALUES.clone();
    }

    public UploadMode(String str, int i) {
    }
}
