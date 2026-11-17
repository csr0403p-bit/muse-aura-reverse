package com.facebook.aura.pairs;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceCollaboratorsJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final List<SpaceCollaboratorJson> collaborators;
    public final JsonElement connection_revision;
    public final List<SpaceAccessRequestJson> pending_access_requests;
    public final String slug;

    public final class Companion {
        public final C9hr<SpaceCollaboratorsJson> serializer() {
            return SpaceCollaboratorsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, AbstractC5321DgF.A02(num, SpaceCollaboratorsJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, SpaceCollaboratorsJson$Companion$$childSerializers$2.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceCollaboratorsJson) {
                SpaceCollaboratorsJson spaceCollaboratorsJson = (SpaceCollaboratorsJson) obj;
                if (!C7384Etj.areEqual(this.slug, spaceCollaboratorsJson.slug) || !C7384Etj.areEqual(this.collaborators, spaceCollaboratorsJson.collaborators) || !C7384Etj.areEqual(this.pending_access_requests, spaceCollaboratorsJson.pending_access_requests) || !C7384Etj.areEqual(this.connection_revision, spaceCollaboratorsJson.connection_revision)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceCollaboratorsJson copy$default(SpaceCollaboratorsJson spaceCollaboratorsJson, String str, List list, List list2, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceCollaboratorsJson.slug;
        }
        if ((i & 2) != 0) {
            list = spaceCollaboratorsJson.collaborators;
        }
        if ((i & 4) != 0) {
            list2 = spaceCollaboratorsJson.pending_access_requests;
        }
        if ((i & 8) != 0) {
            jsonElement = spaceCollaboratorsJson.connection_revision;
        }
        AnonymousClass005.A0x(str, list, list2);
        return new SpaceCollaboratorsJson(str, list, list2, jsonElement);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SpaceCollaboratorsJson spaceCollaboratorsJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(spaceCollaboratorsJson.slug)) {
            c9j5.AAV(spaceCollaboratorsJson.slug, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(spaceCollaboratorsJson.collaborators)) {
            c9j5.AAQ(spaceCollaboratorsJson.collaborators, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(spaceCollaboratorsJson.pending_access_requests)) {
            c9j5.AAQ(spaceCollaboratorsJson.pending_access_requests, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || spaceCollaboratorsJson.connection_revision != null) {
            c9j5.AAP(spaceCollaboratorsJson.connection_revision, JsonElementSerializer.A00, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.slug;
    }

    public final List<SpaceCollaboratorJson> component2() {
        return this.collaborators;
    }

    public final List<SpaceAccessRequestJson> component3() {
        return this.pending_access_requests;
    }

    public final JsonElement component4() {
        return this.connection_revision;
    }

    public final List<SpaceCollaboratorJson> getCollaborators() {
        return this.collaborators;
    }

    public final JsonElement getConnection_revision() {
        return this.connection_revision;
    }

    public final List<SpaceAccessRequestJson> getPending_access_requests() {
        return this.pending_access_requests;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.pending_access_requests, AnonymousClass005.A0F(this.collaborators, AnonymousClass001.A0G(this.slug))) + AnonymousClass006.A0D(this.connection_revision);
    }

    public /* synthetic */ SpaceCollaboratorsJson(int i, String str, List list, List list2, JsonElement jsonElement, C2hx c2hx) {
        this.slug = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.collaborators = C0881AGi.A00;
        } else {
            this.collaborators = list;
        }
        if ((i & 4) == 0) {
            this.pending_access_requests = C0881AGi.A00;
        } else {
            this.pending_access_requests = list2;
        }
        if ((i & 8) == 0) {
            this.connection_revision = null;
        } else {
            this.connection_revision = jsonElement;
        }
    }

    public final SpaceCollaboratorsJson copy(String str, List<SpaceCollaboratorJson> list, List<SpaceAccessRequestJson> list2, JsonElement jsonElement) {
        AnonymousClass005.A0x(str, list, list2);
        return new SpaceCollaboratorsJson(str, list, list2, jsonElement);
    }

    public String toString() {
        return super.toString();
    }

    public SpaceCollaboratorsJson(String str, List<SpaceCollaboratorJson> list, List<SpaceAccessRequestJson> list2, JsonElement jsonElement) {
        AnonymousClass005.A0x(str, list, list2);
        this.slug = str;
        this.collaborators = list;
        this.pending_access_requests = list2;
        this.connection_revision = jsonElement;
    }

    public /* synthetic */ SpaceCollaboratorsJson(String str, List list, List list2, JsonElement jsonElement, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i), C3cI.A12(list2, i), (i & 8) != 0 ? null : jsonElement);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpaceCollaboratorsJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", c0881AGi, c0881AGi, null);
    }
}
