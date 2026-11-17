package com.facebook.aura.library.repo;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ArtifactAudienceVisibility {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactAudienceVisibility[] $VALUES;
    public static final ArtifactAudienceVisibility PUBLIC;
    public static final ArtifactAudienceVisibility RESTRICTED;

    static {
        ArtifactAudienceVisibility artifactAudienceVisibility = new ArtifactAudienceVisibility("RESTRICTED", 0);
        RESTRICTED = artifactAudienceVisibility;
        ArtifactAudienceVisibility artifactAudienceVisibility2 = new ArtifactAudienceVisibility("PUBLIC", 1);
        PUBLIC = artifactAudienceVisibility2;
        ArtifactAudienceVisibility[] artifactAudienceVisibilityArr = {artifactAudienceVisibility, artifactAudienceVisibility2};
        $VALUES = artifactAudienceVisibilityArr;
        $ENTRIES = new F3w(artifactAudienceVisibilityArr);
    }

    public static Ey9<ArtifactAudienceVisibility> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactAudienceVisibility valueOf(String str) {
        return (ArtifactAudienceVisibility) Enum.valueOf(ArtifactAudienceVisibility.class, str);
    }

    public static ArtifactAudienceVisibility[] values() {
        return (ArtifactAudienceVisibility[]) $VALUES.clone();
    }

    public ArtifactAudienceVisibility(String str, int i) {
    }
}
