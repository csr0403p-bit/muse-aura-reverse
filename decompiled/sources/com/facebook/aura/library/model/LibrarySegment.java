package com.facebook.aura.library.model;

import X.C06H;
import X.C3cG;
import X.C60Q;
import X.Ey9;
import com.facebook.aura.gateway.HatchFileOperations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LibrarySegment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ LibrarySegment[] $VALUES;
    public static final LibrarySegment ARTIFACTS;
    public static final Companion Companion;
    public static final LibrarySegment MEDIA;

    static {
        LibrarySegment librarySegment = new LibrarySegment("ARTIFACTS", 0);
        ARTIFACTS = librarySegment;
        LibrarySegment librarySegment2 = new LibrarySegment("MEDIA", 1);
        MEDIA = librarySegment2;
        LibrarySegment[] librarySegmentArr = {librarySegment, librarySegment2};
        $VALUES = librarySegmentArr;
        $ENTRIES = C3cG.A0w(librarySegmentArr);
        Companion = new Companion();
    }

    public static Ey9<LibrarySegment> getEntries() {
        return $ENTRIES;
    }

    public static LibrarySegment valueOf(String str) {
        return (LibrarySegment) Enum.valueOf(LibrarySegment.class, str);
    }

    public static LibrarySegment[] values() {
        return (LibrarySegment[]) $VALUES.clone();
    }

    public final class Companion {
        public final LibrarySegment fromWire(String str) {
            String strA0i = C60Q.A0i(str);
            if ("artifacts".equals(strA0i)) {
                return LibrarySegment.ARTIFACTS;
            }
            if (HatchFileOperations.LibraryPreset.media.equals(strA0i)) {
                return LibrarySegment.MEDIA;
            }
            return null;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LibrarySegment(String str, int i) {
    }
}
