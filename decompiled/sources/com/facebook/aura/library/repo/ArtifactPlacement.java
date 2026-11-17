package com.facebook.aura.library.repo;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ArtifactPlacement {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactPlacement[] $VALUES;
    public static final Companion Companion;
    public static final ArtifactPlacement LIBRARY;
    public static final ArtifactPlacement SPACES;
    public final String wire;

    static {
        ArtifactPlacement artifactPlacement = new ArtifactPlacement("LIBRARY", 0, "library");
        LIBRARY = artifactPlacement;
        ArtifactPlacement artifactPlacement2 = new ArtifactPlacement("SPACES", 1, "spaces");
        SPACES = artifactPlacement2;
        ArtifactPlacement[] artifactPlacementArr = {artifactPlacement, artifactPlacement2};
        $VALUES = artifactPlacementArr;
        $ENTRIES = new F3w(artifactPlacementArr);
        Companion = new Companion();
    }

    public static Ey9<ArtifactPlacement> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactPlacement valueOf(String str) {
        return (ArtifactPlacement) Enum.valueOf(ArtifactPlacement.class, str);
    }

    public static ArtifactPlacement[] values() {
        return (ArtifactPlacement[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public final class Companion {
        public final ArtifactPlacement fromWire(String str) {
            ArtifactPlacement next;
            C7384Etj.A0Y(str, 0);
            Iterator<ArtifactPlacement> it = ArtifactPlacement.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWire())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ArtifactPlacement(String str, int i, String str2) {
        this.wire = str2;
    }
}
