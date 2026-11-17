package com.facebook.aura.attribution;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
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
public final class AttributionEventJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String adid;
    public final String event_name;
    public final boolean no_advertisement_id;

    public final class Companion {
        public final C9hr<AttributionEventJson> serializer() {
            return AttributionEventJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AttributionEventJson(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.event_name = str;
        this.adid = str2;
        this.no_advertisement_id = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_attribution_attribution(AttributionEventJson attributionEventJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(attributionEventJson.event_name)) {
            c9j5.AAV(attributionEventJson.event_name, c9iZ, 0);
        }
        if (zAfR || attributionEventJson.adid != null) {
            c9j5.AAP(attributionEventJson.adid, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || attributionEventJson.no_advertisement_id) {
            c9j5.AA7(c9iZ, 2, attributionEventJson.no_advertisement_id);
        }
    }

    public final AttributionEventJson copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new AttributionEventJson(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AttributionEventJson) {
                AttributionEventJson attributionEventJson = (AttributionEventJson) obj;
                if (!C7384Etj.areEqual(this.event_name, attributionEventJson.event_name) || !C7384Etj.areEqual(this.adid, attributionEventJson.adid) || this.no_advertisement_id != attributionEventJson.no_advertisement_id) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AttributionEventJson copy$default(AttributionEventJson attributionEventJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = attributionEventJson.event_name;
        }
        if ((i & 2) != 0) {
            str2 = attributionEventJson.adid;
        }
        if ((i & 4) != 0) {
            z = attributionEventJson.no_advertisement_id;
        }
        return attributionEventJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.event_name;
    }

    public final String component2() {
        return this.adid;
    }

    public final boolean component3() {
        return this.no_advertisement_id;
    }

    public final String getAdid() {
        return this.adid;
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final boolean getNo_advertisement_id() {
        return this.no_advertisement_id;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.event_name) + AnonymousClass006.A0G(this.adid)) * 31, this.no_advertisement_id);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AttributionEventJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        this.event_name = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.adid = null;
        } else {
            this.adid = str2;
        }
        if ((i & 4) == 0) {
            this.no_advertisement_id = false;
        } else {
            this.no_advertisement_id = z;
        }
    }

    public /* synthetic */ AttributionEventJson(String str, String str2, boolean z, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), AnonymousClass006.A0s(i, str2), AnonymousClass005.A1O(i, z));
    }

    public AttributionEventJson() {
        this("", null, false);
    }
}
