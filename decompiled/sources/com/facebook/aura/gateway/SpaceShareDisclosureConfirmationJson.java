package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SpaceShareDisclosureConfirmationJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final SpaceShareDisclosureJson disclosure;
    public final String summary;
    public final String token;

    public final class Companion {
        public final C9hr<SpaceShareDisclosureConfirmationJson> serializer() {
            return SpaceShareDisclosureConfirmationJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(spaceShareDisclosureConfirmationJson.token)) {
            c9j5.AAV(spaceShareDisclosureConfirmationJson.token, c9iZ, 0);
        }
        if (zAfR || !C7384Etj.areEqual(spaceShareDisclosureConfirmationJson.disclosure, new SpaceShareDisclosureJson(false, false, false, false))) {
            c9j5.AAQ(spaceShareDisclosureConfirmationJson.disclosure, SpaceShareDisclosureJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || spaceShareDisclosureConfirmationJson.summary != null) {
            c9j5.AAP(spaceShareDisclosureConfirmationJson.summary, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SpaceShareDisclosureConfirmationJson) {
                SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson = (SpaceShareDisclosureConfirmationJson) obj;
                if (!C7384Etj.areEqual(this.token, spaceShareDisclosureConfirmationJson.token) || !C7384Etj.areEqual(this.disclosure, spaceShareDisclosureConfirmationJson.disclosure) || !C7384Etj.areEqual(this.summary, spaceShareDisclosureConfirmationJson.summary)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SpaceShareDisclosureConfirmationJson copy$default(SpaceShareDisclosureConfirmationJson spaceShareDisclosureConfirmationJson, String str, SpaceShareDisclosureJson spaceShareDisclosureJson, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spaceShareDisclosureConfirmationJson.token;
        }
        if ((i & 2) != 0) {
            spaceShareDisclosureJson = spaceShareDisclosureConfirmationJson.disclosure;
        }
        if ((i & 4) != 0) {
            str2 = spaceShareDisclosureConfirmationJson.summary;
        }
        return spaceShareDisclosureConfirmationJson.copy(str, spaceShareDisclosureJson, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final SpaceShareDisclosureJson component2() {
        return this.disclosure;
    }

    public final String component3() {
        return this.summary;
    }

    public final SpaceShareDisclosureJson getDisclosure() {
        return this.disclosure;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.disclosure, AnonymousClass001.A0G(this.token)) + AnonymousClass006.A0G(this.summary);
    }

    public SpaceShareDisclosureConfirmationJson(String str, SpaceShareDisclosureJson spaceShareDisclosureJson, String str2) {
        AnonymousClass003.A0u(str, spaceShareDisclosureJson);
        this.token = str;
        this.disclosure = spaceShareDisclosureJson;
        this.summary = str2;
    }

    public final SpaceShareDisclosureConfirmationJson copy(String str, SpaceShareDisclosureJson spaceShareDisclosureJson, String str2) {
        AnonymousClass003.A0u(str, spaceShareDisclosureJson);
        return new SpaceShareDisclosureConfirmationJson(str, spaceShareDisclosureJson, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SpaceShareDisclosureConfirmationJson(int i, String str, SpaceShareDisclosureJson spaceShareDisclosureJson, String str2, C2hx c2hx) {
        this.token = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.disclosure = new SpaceShareDisclosureJson(false, false, false, false);
        } else {
            this.disclosure = spaceShareDisclosureJson;
        }
        if ((i & 4) == 0) {
            this.summary = null;
        } else {
            this.summary = str2;
        }
    }

    public /* synthetic */ SpaceShareDisclosureConfirmationJson(String str, SpaceShareDisclosureJson spaceShareDisclosureJson, String str2, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), (i & 2) != 0 ? new SpaceShareDisclosureJson(false, false, false, false) : spaceShareDisclosureJson, AnonymousClass006.A0t(i, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpaceShareDisclosureConfirmationJson() {
        this((String) null, (SpaceShareDisclosureJson) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 7, (C06H) (0 == true ? 1 : 0));
    }
}
