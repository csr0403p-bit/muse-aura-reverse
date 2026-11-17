package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
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
public final class SpaceShareRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String disclosure_confirmation;
    public final Boolean require_disclosure_confirmation;
    public final String share_type;

    public final class Companion {
        public final C9hr<SpaceShareRequestJson> serializer() {
            return SpaceShareRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SpaceShareRequestJson(String str, Boolean bool, String str2) {
        C7384Etj.A0Y(str, 0);
        this.share_type = str;
        this.require_disclosure_confirmation = bool;
        this.disclosure_confirmation = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(SpaceShareRequestJson spaceShareRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(spaceShareRequestJson.share_type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || spaceShareRequestJson.require_disclosure_confirmation != null) {
            c9j5.AAP(spaceShareRequestJson.require_disclosure_confirmation, C07839ix.A00, c9iZ, 1);
        }
        if (zAfR || spaceShareRequestJson.disclosure_confirmation != null) {
            c9j5.AAP(spaceShareRequestJson.disclosure_confirmation, C07779iq.A01, c9iZ, 2);
        }
    }

    public final SpaceShareRequestJson copy(String str, Boolean bool, String str2) {
        C7384Etj.A0Y(str, 0);
        return new SpaceShareRequestJson(str, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareRequestJson) {
                SpaceShareRequestJson spaceShareRequestJson = (SpaceShareRequestJson) obj;
                if (!C7384Etj.areEqual(this.share_type, spaceShareRequestJson.share_type) || !C7384Etj.areEqual(this.require_disclosure_confirmation, spaceShareRequestJson.require_disclosure_confirmation) || !C7384Etj.areEqual(this.disclosure_confirmation, spaceShareRequestJson.disclosure_confirmation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareRequestJson copy$default(SpaceShareRequestJson spaceShareRequestJson, String str, Boolean bool, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceShareRequestJson.share_type;
        }
        if ((i & 2) != 0) {
            bool = spaceShareRequestJson.require_disclosure_confirmation;
        }
        if ((i & 4) != 0) {
            str2 = spaceShareRequestJson.disclosure_confirmation;
        }
        return spaceShareRequestJson.copy(str, bool, str2);
    }

    public final String component1() {
        return this.share_type;
    }

    public final Boolean component2() {
        return this.require_disclosure_confirmation;
    }

    public final String component3() {
        return this.disclosure_confirmation;
    }

    public final String getDisclosure_confirmation() {
        return this.disclosure_confirmation;
    }

    public final Boolean getRequire_disclosure_confirmation() {
        return this.require_disclosure_confirmation;
    }

    public final String getShare_type() {
        return this.share_type;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.share_type) + AnonymousClass006.A0D(this.require_disclosure_confirmation)) * 31) + AnonymousClass005.A0H(this.disclosure_confirmation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareRequestJson(int i, String str, Boolean bool, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SpaceShareRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.share_type = str;
        if ((i & 2) == 0) {
            this.require_disclosure_confirmation = null;
        } else {
            this.require_disclosure_confirmation = bool;
        }
        if ((i & 4) == 0) {
            this.disclosure_confirmation = null;
        } else {
            this.disclosure_confirmation = str2;
        }
    }

    public /* synthetic */ SpaceShareRequestJson(String str, Boolean bool, String str2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2);
    }
}
