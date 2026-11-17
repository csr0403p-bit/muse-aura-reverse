package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class FilePresentationJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HatchAttachmentFileJson file;

    public final class Companion {
        public final C9hr<FilePresentationJson> serializer() {
            return FilePresentationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FilePresentationJson filePresentationJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || filePresentationJson.file != null) {
            c9j5.AAP(filePresentationJson.file, HatchAttachmentFileJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FilePresentationJson) && C7384Etj.areEqual(this.file, ((FilePresentationJson) obj).file));
    }

    public static /* synthetic */ FilePresentationJson copy$default(FilePresentationJson filePresentationJson, HatchAttachmentFileJson hatchAttachmentFileJson, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFileJson = filePresentationJson.file;
        }
        return new FilePresentationJson(hatchAttachmentFileJson);
    }

    public final HatchAttachmentFileJson component1() {
        return this.file;
    }

    public final FilePresentationJson copy(HatchAttachmentFileJson hatchAttachmentFileJson) {
        return new FilePresentationJson(hatchAttachmentFileJson);
    }

    public final HatchAttachmentFileJson getFile() {
        return this.file;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.file);
    }

    public final FilePresentationData toDomain() {
        HatchAttachmentFile domain;
        HatchAttachmentFileJson hatchAttachmentFileJson = this.file;
        if (hatchAttachmentFileJson == null || (domain = hatchAttachmentFileJson.toDomain()) == null) {
            return null;
        }
        return new FilePresentationData(domain, (JSONState) null, 2, (C06H) null);
    }

    public /* synthetic */ FilePresentationJson(int i, HatchAttachmentFileJson hatchAttachmentFileJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.file = null;
        } else {
            this.file = hatchAttachmentFileJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public FilePresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson) {
        this.file = hatchAttachmentFileJson;
    }

    public /* synthetic */ FilePresentationJson(HatchAttachmentFileJson hatchAttachmentFileJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : hatchAttachmentFileJson);
    }

    public FilePresentationJson() {
        this(null);
    }
}
