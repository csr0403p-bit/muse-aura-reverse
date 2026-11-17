package com.facebook.aura.library.repo;

import X.AnonymousClass002;
import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import X.FGI;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ArtifactSource {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ArtifactSource[] $VALUES;
    public static final Companion Companion;
    public static final ArtifactSource LIBRARY;
    public static final ArtifactSource PEER_SPACE;
    public static final ArtifactSource SAVED_SPACE;
    public static final ArtifactSource SPACE;
    public static final ArtifactSource SYSTEM;
    public final String wire;

    static {
        ArtifactSource artifactSource = new ArtifactSource("SPACE", 0, "space");
        SPACE = artifactSource;
        ArtifactSource artifactSource2 = new ArtifactSource("SAVED_SPACE", 1, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SAVED_SPACE);
        SAVED_SPACE = artifactSource2;
        ArtifactSource artifactSource3 = new ArtifactSource("LIBRARY", 2, "library");
        LIBRARY = artifactSource3;
        ArtifactSource artifactSource4 = new ArtifactSource("SYSTEM", 3, PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM);
        SYSTEM = artifactSource4;
        ArtifactSource artifactSource5 = new ArtifactSource("PEER_SPACE", 4, "peer_space");
        PEER_SPACE = artifactSource5;
        ArtifactSource[] artifactSourceArr = {artifactSource, artifactSource2, artifactSource3, artifactSource4, artifactSource5};
        $VALUES = artifactSourceArr;
        $ENTRIES = new F3w(artifactSourceArr);
        Companion = new Companion();
    }

    public final String placementArtifactRef(String str) {
        C7384Etj.A0Y(str, 0);
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 4) {
            return FGI.A0U(this.wire, ":", str);
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactSource.values().length];
            try {
                AnonymousClass002.A13(ArtifactSource.SPACE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactSource.SAVED_SPACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ArtifactSource.PEER_SPACE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ArtifactSource.LIBRARY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ArtifactSource.SYSTEM, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static Ey9<ArtifactSource> getEntries() {
        return $ENTRIES;
    }

    public static ArtifactSource valueOf(String str) {
        return (ArtifactSource) Enum.valueOf(ArtifactSource.class, str);
    }

    public static ArtifactSource[] values() {
        return (ArtifactSource[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public final class Companion {
        public final ArtifactSource fromWire(String str) {
            ArtifactSource next;
            C7384Etj.A0Y(str, 0);
            Iterator<ArtifactSource> it = ArtifactSource.getEntries().iterator();
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

    public ArtifactSource(String str, int i, String str2) {
        this.wire = str2;
    }
}
