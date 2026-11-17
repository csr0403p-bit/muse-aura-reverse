package com.facebook.aura.library.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ArtifactsSubscribeResponseJson extends C06G {
    public final String conn_id;
    public final List<ArtifactItemJson> items;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, ArtifactsSubscribeResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ArtifactsSubscribeResponseJson> serializer() {
            return ArtifactsSubscribeResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArtifactsSubscribeResponseJson) {
                ArtifactsSubscribeResponseJson artifactsSubscribeResponseJson = (ArtifactsSubscribeResponseJson) obj;
                if (!C7384Etj.areEqual(this.items, artifactsSubscribeResponseJson.items) || !C7384Etj.areEqual(this.conn_id, artifactsSubscribeResponseJson.conn_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ArtifactsSubscribeResponseJson copy$default(ArtifactsSubscribeResponseJson artifactsSubscribeResponseJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = artifactsSubscribeResponseJson.items;
        }
        if ((i & 2) != 0) {
            str = artifactsSubscribeResponseJson.conn_id;
        }
        AnonymousClass003.A0u(list, str);
        return new ArtifactsSubscribeResponseJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_library_repo_repo(ArtifactsSubscribeResponseJson artifactsSubscribeResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(artifactsSubscribeResponseJson.items, C3cH.A15($childSerializers, 0), c9iZ, 0);
        if (c9j5.AfR() || !C3cH.A1Q(artifactsSubscribeResponseJson.conn_id)) {
            c9j5.AAV(artifactsSubscribeResponseJson.conn_id, c9iZ, 1);
        }
    }

    public final List<ArtifactItemJson> component1() {
        return this.items;
    }

    public final String component2() {
        return this.conn_id;
    }

    public final String getConn_id() {
        return this.conn_id;
    }

    public final List<ArtifactItemJson> getItems() {
        return this.items;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.conn_id, AnonymousClass005.A0E(this.items));
    }

    public ArtifactsSubscribeResponseJson(List<ArtifactItemJson> list, String str) {
        AnonymousClass003.A0u(list, str);
        this.items = list;
        this.conn_id = str;
    }

    public final ArtifactsSubscribeResponseJson copy(List<ArtifactItemJson> list, String str) {
        AnonymousClass003.A0u(list, str);
        return new ArtifactsSubscribeResponseJson(list, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ArtifactsSubscribeResponseJson(int i, List list, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ArtifactsSubscribeResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.items = list;
        this.conn_id = (i & 2) == 0 ? "" : str;
    }

    public /* synthetic */ ArtifactsSubscribeResponseJson(List list, String str, int i, C06H c06h) {
        this(list, (i & 2) != 0 ? "" : str);
    }
}
