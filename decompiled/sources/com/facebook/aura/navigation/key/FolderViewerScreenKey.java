package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class FolderViewerScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String relativePath;

    public final class Companion {
        public final C9hr<FolderViewerScreenKey> serializer() {
            return FolderViewerScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final FolderViewerScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new FolderViewerScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FolderViewerScreenKey) && C7384Etj.areEqual(this.relativePath, ((FolderViewerScreenKey) obj).relativePath));
    }

    public /* synthetic */ FolderViewerScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FolderViewerScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.relativePath = str;
    }

    public static /* synthetic */ FolderViewerScreenKey copy$default(FolderViewerScreenKey folderViewerScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = folderViewerScreenKey.relativePath;
        }
        C7384Etj.A0Y(str, 0);
        return new FolderViewerScreenKey(str);
    }

    public final String component1() {
        return this.relativePath;
    }

    public final String getRelativePath() {
        return this.relativePath;
    }

    public int hashCode() {
        return this.relativePath.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public FolderViewerScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.relativePath = str;
    }
}
