package com.facebook.aura.utils;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ArtifactShareOption {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactShareOption[] $VALUES;
    public static final ArtifactShareOption PUBLISH;
    public static final ArtifactShareOption PUBLISH_TO_SHARE;
    public static final ArtifactShareOption SHARE;

    static {
        ArtifactShareOption artifactShareOption = new ArtifactShareOption("SHARE", 0);
        SHARE = artifactShareOption;
        ArtifactShareOption artifactShareOption2 = new ArtifactShareOption("PUBLISH_TO_SHARE", 1);
        PUBLISH_TO_SHARE = artifactShareOption2;
        ArtifactShareOption artifactShareOption3 = new ArtifactShareOption("PUBLISH", 2);
        PUBLISH = artifactShareOption3;
        ArtifactShareOption[] artifactShareOptionArr = {artifactShareOption, artifactShareOption2, artifactShareOption3};
        $VALUES = artifactShareOptionArr;
        $ENTRIES = C3cG.A0w(artifactShareOptionArr);
    }

    public static Ey9<ArtifactShareOption> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactShareOption valueOf(String str) {
        return (ArtifactShareOption) Enum.valueOf(ArtifactShareOption.class, str);
    }

    public static ArtifactShareOption[] values() {
        return (ArtifactShareOption[]) $VALUES.clone();
    }

    public ArtifactShareOption(String str, int i) {
    }
}
