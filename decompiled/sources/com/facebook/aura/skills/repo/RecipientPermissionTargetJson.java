package com.facebook.aura.skills.repo;

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
/* loaded from: classes2.dex */
public final class RecipientPermissionTargetJson extends C06G {
    public static final Companion Companion = new Companion();
    public final RecipientPermissionConnectorJson connector;

    public final class Companion {
        public final C9hr<RecipientPermissionTargetJson> serializer() {
            return RecipientPermissionTargetJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionTargetJson recipientPermissionTargetJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || recipientPermissionTargetJson.connector != null) {
            c9j5.AAP(recipientPermissionTargetJson.connector, RecipientPermissionConnectorJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RecipientPermissionTargetJson) && C7384Etj.areEqual(this.connector, ((RecipientPermissionTargetJson) obj).connector));
    }

    public static /* synthetic */ RecipientPermissionTargetJson copy$default(RecipientPermissionTargetJson recipientPermissionTargetJson, RecipientPermissionConnectorJson recipientPermissionConnectorJson, int i, Object obj) {
        if ((i & 1) != 0) {
            recipientPermissionConnectorJson = recipientPermissionTargetJson.connector;
        }
        return new RecipientPermissionTargetJson(recipientPermissionConnectorJson);
    }

    public final RecipientPermissionConnectorJson component1() {
        return this.connector;
    }

    public final RecipientPermissionTargetJson copy(RecipientPermissionConnectorJson recipientPermissionConnectorJson) {
        return new RecipientPermissionTargetJson(recipientPermissionConnectorJson);
    }

    public final RecipientPermissionConnectorJson getConnector() {
        return this.connector;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.connector);
    }

    public /* synthetic */ RecipientPermissionTargetJson(int i, RecipientPermissionConnectorJson recipientPermissionConnectorJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connector = null;
        } else {
            this.connector = recipientPermissionConnectorJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RecipientPermissionTargetJson(RecipientPermissionConnectorJson recipientPermissionConnectorJson) {
        this.connector = recipientPermissionConnectorJson;
    }

    public /* synthetic */ RecipientPermissionTargetJson(RecipientPermissionConnectorJson recipientPermissionConnectorJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : recipientPermissionConnectorJson);
    }

    public RecipientPermissionTargetJson() {
        this(null);
    }
}
