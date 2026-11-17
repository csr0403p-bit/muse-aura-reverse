package com.facebook.aura.skills.repo;

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

@Serializable
/* loaded from: classes2.dex */
public final class RecipientPermissionConnectorJson extends C06G {
    public final List<RecipientPermissionActionJson> actions;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, RecipientPermissionConnectorJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<RecipientPermissionConnectorJson> serializer() {
            return RecipientPermissionConnectorJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RecipientPermissionConnectorJson copy(List<RecipientPermissionActionJson> list) {
        C7384Etj.A0Y(list, 0);
        return new RecipientPermissionConnectorJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RecipientPermissionConnectorJson) && C7384Etj.areEqual(this.actions, ((RecipientPermissionConnectorJson) obj).actions));
    }

    public static /* synthetic */ RecipientPermissionConnectorJson copy$default(RecipientPermissionConnectorJson recipientPermissionConnectorJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recipientPermissionConnectorJson.actions;
        }
        C7384Etj.A0Y(list, 0);
        return new RecipientPermissionConnectorJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(RecipientPermissionConnectorJson recipientPermissionConnectorJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(recipientPermissionConnectorJson.actions)) {
            c9j5.AAQ(recipientPermissionConnectorJson.actions, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<RecipientPermissionActionJson> component1() {
        return this.actions;
    }

    public final List<RecipientPermissionActionJson> getActions() {
        return this.actions;
    }

    public int hashCode() {
        return this.actions.hashCode();
    }

    public /* synthetic */ RecipientPermissionConnectorJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.actions = C0881AGi.A00;
        } else {
            this.actions = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RecipientPermissionConnectorJson(List<RecipientPermissionActionJson> list) {
        C7384Etj.A0Y(list, 0);
        this.actions = list;
    }

    public /* synthetic */ RecipientPermissionConnectorJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public RecipientPermissionConnectorJson() {
        this(C0881AGi.A00);
    }
}
