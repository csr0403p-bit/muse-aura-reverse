package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceCollaboratorUpdateJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String permission;
    public final String principal;

    public final class Companion {
        public final C9hr<SpaceCollaboratorUpdateJson> serializer() {
            return SpaceCollaboratorUpdateJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceCollaboratorUpdateJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.principal = str;
        this.permission = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(SpaceCollaboratorUpdateJson spaceCollaboratorUpdateJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spaceCollaboratorUpdateJson.principal, c9iZ, 0);
        if (c9j5.AfR() || spaceCollaboratorUpdateJson.permission != null) {
            c9j5.AAP(spaceCollaboratorUpdateJson.permission, C07779iq.A01, c9iZ, 1);
        }
    }

    public final SpaceCollaboratorUpdateJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SpaceCollaboratorUpdateJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceCollaboratorUpdateJson) {
                SpaceCollaboratorUpdateJson spaceCollaboratorUpdateJson = (SpaceCollaboratorUpdateJson) obj;
                if (!C7384Etj.areEqual(this.principal, spaceCollaboratorUpdateJson.principal) || !C7384Etj.areEqual(this.permission, spaceCollaboratorUpdateJson.permission)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceCollaboratorUpdateJson copy$default(SpaceCollaboratorUpdateJson spaceCollaboratorUpdateJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceCollaboratorUpdateJson.principal;
        }
        if ((i & 2) != 0) {
            str2 = spaceCollaboratorUpdateJson.permission;
        }
        C7384Etj.A0Y(str, 0);
        return new SpaceCollaboratorUpdateJson(str, str2);
    }

    public final String component1() {
        return this.principal;
    }

    public final String component2() {
        return this.permission;
    }

    public final String getPermission() {
        return this.permission;
    }

    public final String getPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.principal) + AnonymousClass006.A0G(this.permission);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceCollaboratorUpdateJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceCollaboratorUpdateJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.principal = str;
        this.permission = (i & 2) == 0 ? null : str2;
    }

    public /* synthetic */ SpaceCollaboratorUpdateJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
