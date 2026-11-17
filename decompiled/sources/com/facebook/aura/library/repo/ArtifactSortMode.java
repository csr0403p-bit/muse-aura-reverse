package com.facebook.aura.library.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ArtifactSortMode {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactSortMode[] $VALUES;
    public static final ArtifactSortMode LAST_MODIFIED;
    public static final ArtifactSortMode LAST_OPENED;
    public static final ArtifactSortMode TITLE;
    public final String wire;

    static {
        ArtifactSortMode artifactSortMode = new ArtifactSortMode("LAST_OPENED", 0, "last_opened");
        LAST_OPENED = artifactSortMode;
        ArtifactSortMode artifactSortMode2 = new ArtifactSortMode("LAST_MODIFIED", 1, "last_modified");
        LAST_MODIFIED = artifactSortMode2;
        ArtifactSortMode artifactSortMode3 = new ArtifactSortMode("TITLE", 2, "title");
        TITLE = artifactSortMode3;
        ArtifactSortMode[] artifactSortModeArr = {artifactSortMode, artifactSortMode2, artifactSortMode3};
        $VALUES = artifactSortModeArr;
        $ENTRIES = new F3w(artifactSortModeArr);
    }

    public static Ey9<ArtifactSortMode> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactSortMode valueOf(String str) {
        return (ArtifactSortMode) Enum.valueOf(ArtifactSortMode.class, str);
    }

    public static ArtifactSortMode[] values() {
        return (ArtifactSortMode[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ArtifactSortMode(String str, int i, String str2) {
        this.wire = str2;
    }
}
