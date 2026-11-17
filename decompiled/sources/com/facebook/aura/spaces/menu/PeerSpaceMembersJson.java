package com.facebook.aura.spaces.menu;

import X.AbstractC5321DgF;
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
/* loaded from: classes4.dex */
public final class PeerSpaceMembersJson extends C06G {
    public static final int $stable = 8;
    public final List<PeerSpaceMemberJson> members;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, PeerSpaceMembersJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<PeerSpaceMembersJson> serializer() {
            return PeerSpaceMembersJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final PeerSpaceMembersJson copy(List<PeerSpaceMemberJson> list) {
        C7384Etj.A0Y(list, 0);
        return new PeerSpaceMembersJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PeerSpaceMembersJson) && C7384Etj.areEqual(this.members, ((PeerSpaceMembersJson) obj).members));
    }

    public static /* synthetic */ PeerSpaceMembersJson copy$default(PeerSpaceMembersJson peerSpaceMembersJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = peerSpaceMembersJson.members;
        }
        C7384Etj.A0Y(list, 0);
        return new PeerSpaceMembersJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(PeerSpaceMembersJson peerSpaceMembersJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(peerSpaceMembersJson.members)) {
            c9j5.AAQ(peerSpaceMembersJson.members, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<PeerSpaceMemberJson> component1() {
        return this.members;
    }

    public final List<PeerSpaceMemberJson> getMembers() {
        return this.members;
    }

    public int hashCode() {
        return this.members.hashCode();
    }

    public /* synthetic */ PeerSpaceMembersJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.members = C0881AGi.A00;
        } else {
            this.members = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PeerSpaceMembersJson(List<PeerSpaceMemberJson> list) {
        C7384Etj.A0Y(list, 0);
        this.members = list;
    }

    public /* synthetic */ PeerSpaceMembersJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public PeerSpaceMembersJson() {
        this(C0881AGi.A00);
    }
}
