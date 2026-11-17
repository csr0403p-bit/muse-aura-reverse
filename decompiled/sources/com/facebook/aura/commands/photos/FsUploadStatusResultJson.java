package com.facebook.aura.commands.photos;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FsUploadStatusResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean exists;

    public final class Companion {
        public final C9hr<FsUploadStatusResultJson> serializer() {
            return FsUploadStatusResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_photos_photos(FsUploadStatusResultJson fsUploadStatusResultJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || fsUploadStatusResultJson.exists != null) {
            c9j5.AAP(fsUploadStatusResultJson.exists, C07839ix.A00, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FsUploadStatusResultJson) && C7384Etj.areEqual(this.exists, ((FsUploadStatusResultJson) obj).exists));
    }

    public static /* synthetic */ FsUploadStatusResultJson copy$default(FsUploadStatusResultJson fsUploadStatusResultJson, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = fsUploadStatusResultJson.exists;
        }
        return new FsUploadStatusResultJson(bool);
    }

    public final Boolean component1() {
        return this.exists;
    }

    public final FsUploadStatusResultJson copy(Boolean bool) {
        return new FsUploadStatusResultJson(bool);
    }

    public final Boolean getExists() {
        return this.exists;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.exists);
    }

    public /* synthetic */ FsUploadStatusResultJson(int i, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.exists = null;
        } else {
            this.exists = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FsUploadStatusResultJson(Boolean bool) {
        this.exists = bool;
    }

    public /* synthetic */ FsUploadStatusResultJson(Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? null : bool);
    }

    public FsUploadStatusResultJson() {
        this(null);
    }
}
