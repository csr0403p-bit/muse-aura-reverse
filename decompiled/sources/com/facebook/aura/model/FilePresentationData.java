package com.facebook.aura.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class FilePresentationData extends C06G implements HatchPresentationData {
    public final HatchAttachmentFile file;
    public final JSONState state;
    public static final Companion Companion = new Companion();
    public static final int $stable = JSONState.$stable;

    public final class Companion {
        public final C9hr<FilePresentationData> serializer() {
            return FilePresentationData$$serializer.INSTANCE;
        }

        public final FilePresentationData fromJson(JsonElement jsonElement) {
            return HatchAttachmentPresentationJsonKt.parseFilePresentation(jsonElement);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FilePresentationData) {
                FilePresentationData filePresentationData = (FilePresentationData) obj;
                if (!C7384Etj.areEqual(this.file, filePresentationData.file) || !C7384Etj.areEqual(this.state, filePresentationData.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FilePresentationData copy$default(FilePresentationData filePresentationData, HatchAttachmentFile hatchAttachmentFile, JSONState jSONState, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAttachmentFile = filePresentationData.file;
        }
        if ((i & 2) != 0) {
            jSONState = filePresentationData.state;
        }
        AnonymousClass003.A0u(hatchAttachmentFile, jSONState);
        return new FilePresentationData(hatchAttachmentFile, jSONState);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(FilePresentationData filePresentationData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(filePresentationData.file, HatchAttachmentFile$$serializer.INSTANCE, c9iZ, 0);
        if (c9j5.AfR() || !C7384Etj.areEqual(filePresentationData.state, C60R.A0O())) {
            c9j5.AAQ(filePresentationData.state, JSONState$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final HatchAttachmentFile component1() {
        return this.file;
    }

    public final JSONState component2() {
        return this.state;
    }

    public final HatchAttachmentFile getFile() {
        return this.file;
    }

    public final JSONState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, AnonymousClass005.A0E(this.file));
    }

    public FilePresentationData(HatchAttachmentFile hatchAttachmentFile, JSONState jSONState) {
        AnonymousClass003.A0u(hatchAttachmentFile, jSONState);
        this.file = hatchAttachmentFile;
        this.state = jSONState;
    }

    public final FilePresentationData copy(HatchAttachmentFile hatchAttachmentFile, JSONState jSONState) {
        AnonymousClass003.A0u(hatchAttachmentFile, jSONState);
        return new FilePresentationData(hatchAttachmentFile, jSONState);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FilePresentationData(int i, HatchAttachmentFile hatchAttachmentFile, JSONState jSONState, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(FilePresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.file = hatchAttachmentFile;
        this.state = (i & 2) == 0 ? C60R.A0O() : jSONState;
    }

    public /* synthetic */ FilePresentationData(HatchAttachmentFile hatchAttachmentFile, JSONState jSONState, int i, C06H c06h) {
        this(hatchAttachmentFile, (i & 2) != 0 ? C60R.A0O() : jSONState);
    }
}
