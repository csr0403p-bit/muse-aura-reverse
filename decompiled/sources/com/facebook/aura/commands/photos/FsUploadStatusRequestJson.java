package com.facebook.aura.commands.photos;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FsUploadStatusRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String local_identifier;
    public final String pipeline;

    public final class Companion {
        public final C9hr<FsUploadStatusRequestJson> serializer() {
            return FsUploadStatusRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_commands_photos_photos(FsUploadStatusRequestJson fsUploadStatusRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(fsUploadStatusRequestJson.pipeline, c9iZ, 0);
        c9j5.AAV(fsUploadStatusRequestJson.local_identifier, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FsUploadStatusRequestJson) {
                FsUploadStatusRequestJson fsUploadStatusRequestJson = (FsUploadStatusRequestJson) obj;
                if (!C7384Etj.areEqual(this.pipeline, fsUploadStatusRequestJson.pipeline) || !C7384Etj.areEqual(this.local_identifier, fsUploadStatusRequestJson.local_identifier)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FsUploadStatusRequestJson copy$default(FsUploadStatusRequestJson fsUploadStatusRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fsUploadStatusRequestJson.pipeline;
        }
        if ((i & 2) != 0) {
            str2 = fsUploadStatusRequestJson.local_identifier;
        }
        AnonymousClass003.A0u(str, str2);
        return new FsUploadStatusRequestJson(str, str2);
    }

    public final String component1() {
        return this.pipeline;
    }

    public final String component2() {
        return this.local_identifier;
    }

    public final String getLocal_identifier() {
        return this.local_identifier;
    }

    public final String getPipeline() {
        return this.pipeline;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.local_identifier, AnonymousClass001.A0G(this.pipeline));
    }

    public FsUploadStatusRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.pipeline = str;
        this.local_identifier = str2;
    }

    public final FsUploadStatusRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FsUploadStatusRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FsUploadStatusRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(FsUploadStatusRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.pipeline = str;
        this.local_identifier = str2;
    }
}
