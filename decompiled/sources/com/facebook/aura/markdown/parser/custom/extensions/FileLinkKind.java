package com.facebook.aura.markdown.parser.custom.extensions;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class FileLinkKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FileLinkKind[] $VALUES;
    public static final FileLinkKind AUDIO;
    public static final FileLinkKind FILE;
    public static final FileLinkKind HTML_ARTIFACT;
    public static final FileLinkKind SLIDES;
    public static final FileLinkKind VIDEO;

    static {
        FileLinkKind fileLinkKind = new FileLinkKind("FILE", 0);
        FILE = fileLinkKind;
        FileLinkKind fileLinkKind2 = new FileLinkKind("SLIDES", 1);
        SLIDES = fileLinkKind2;
        FileLinkKind fileLinkKind3 = new FileLinkKind("HTML_ARTIFACT", 2);
        HTML_ARTIFACT = fileLinkKind3;
        FileLinkKind fileLinkKind4 = new FileLinkKind("VIDEO", 3);
        VIDEO = fileLinkKind4;
        FileLinkKind fileLinkKind5 = new FileLinkKind("AUDIO", 4);
        AUDIO = fileLinkKind5;
        FileLinkKind[] fileLinkKindArr = {fileLinkKind, fileLinkKind2, fileLinkKind3, fileLinkKind4, fileLinkKind5};
        $VALUES = fileLinkKindArr;
        $ENTRIES = C3cG.A0w(fileLinkKindArr);
    }

    public static Ey9<FileLinkKind> getEntries() {
        return $ENTRIES;
    }

    public static FileLinkKind valueOf(String str) {
        return (FileLinkKind) Enum.valueOf(FileLinkKind.class, str);
    }

    public static FileLinkKind[] values() {
        return (FileLinkKind[]) $VALUES.clone();
    }

    public FileLinkKind(String str, int i) {
    }
}
