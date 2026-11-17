package com.facebook.aura.spaces.preload;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SavedSpaceFrameJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String iframeSrc;

    public final class Companion {
        public final C9hr<SavedSpaceFrameJson> serializer() {
            return SavedSpaceFrameJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SavedSpaceFrameJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceFrameJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedSpaceFrameJson) && C7384Etj.areEqual(this.iframeSrc, ((SavedSpaceFrameJson) obj).iframeSrc));
    }

    public /* synthetic */ SavedSpaceFrameJson(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SavedSpaceFrameJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.iframeSrc = str;
    }

    public static /* synthetic */ SavedSpaceFrameJson copy$default(SavedSpaceFrameJson savedSpaceFrameJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSpaceFrameJson.iframeSrc;
        }
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceFrameJson(str);
    }

    public final String component1() {
        return this.iframeSrc;
    }

    public final String getIframeSrc() {
        return this.iframeSrc;
    }

    public int hashCode() {
        return this.iframeSrc.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SavedSpaceFrameJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.iframeSrc = str;
    }
}
