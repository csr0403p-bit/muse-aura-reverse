package com.facebook.aura.spaces.repo;

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
/* loaded from: classes3.dex */
public final class SpacesV2PayloadJson extends C06G {
    public final List<SpaceEntryJson> spaces;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, SpacesV2PayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SpacesV2PayloadJson> serializer() {
            return SpacesV2PayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SpacesV2PayloadJson copy(List<SpaceEntryJson> list) {
        C7384Etj.A0Y(list, 0);
        return new SpacesV2PayloadJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SpacesV2PayloadJson) && C7384Etj.areEqual(this.spaces, ((SpacesV2PayloadJson) obj).spaces));
    }

    public static /* synthetic */ SpacesV2PayloadJson copy$default(SpacesV2PayloadJson spacesV2PayloadJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = spacesV2PayloadJson.spaces;
        }
        C7384Etj.A0Y(list, 0);
        return new SpacesV2PayloadJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_spaces_repo_repo(SpacesV2PayloadJson spacesV2PayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(spacesV2PayloadJson.spaces)) {
            c9j5.AAQ(spacesV2PayloadJson.spaces, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<SpaceEntryJson> component1() {
        return this.spaces;
    }

    public final List<SpaceEntryJson> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return this.spaces.hashCode();
    }

    public /* synthetic */ SpacesV2PayloadJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.spaces = C0881AGi.A00;
        } else {
            this.spaces = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SpacesV2PayloadJson(List<SpaceEntryJson> list) {
        C7384Etj.A0Y(list, 0);
        this.spaces = list;
    }

    public /* synthetic */ SpacesV2PayloadJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public SpacesV2PayloadJson() {
        this(C0881AGi.A00);
    }
}
