package com.facebook.aura.library.repo;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ArtifactSharePermission {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactSharePermission[] $VALUES;
    public static final Companion Companion;
    public static final ArtifactSharePermission USE;
    public static final ArtifactSharePermission VIEW;
    public final String wire;

    static {
        ArtifactSharePermission artifactSharePermission = new ArtifactSharePermission("VIEW", 0, "view");
        VIEW = artifactSharePermission;
        ArtifactSharePermission artifactSharePermission2 = new ArtifactSharePermission("USE", 1, "use");
        USE = artifactSharePermission2;
        ArtifactSharePermission[] artifactSharePermissionArr = {artifactSharePermission, artifactSharePermission2};
        $VALUES = artifactSharePermissionArr;
        $ENTRIES = C3cG.A0w(artifactSharePermissionArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ArtifactSharePermission fromWire(String str) {
            ArtifactSharePermission next;
            Iterator<ArtifactSharePermission> it = ArtifactSharePermission.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWire(), str)) {
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

    public static Ey9<ArtifactSharePermission> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactSharePermission valueOf(String str) {
        return (ArtifactSharePermission) Enum.valueOf(ArtifactSharePermission.class, str);
    }

    public static ArtifactSharePermission[] values() {
        return (ArtifactSharePermission[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ArtifactSharePermission(String str, int i, String str2) {
        this.wire = str2;
    }
}
