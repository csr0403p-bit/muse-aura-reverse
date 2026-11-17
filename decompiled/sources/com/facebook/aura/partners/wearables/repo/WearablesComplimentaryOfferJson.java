package com.facebook.aura.partners.wearables.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class WearablesComplimentaryOfferJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean holds_offer;
    public final String offer_status;

    public final class Companion {
        public final C9hr<WearablesComplimentaryOfferJson> serializer() {
            return WearablesComplimentaryOfferJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WearablesComplimentaryOfferJson(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        this.holds_offer = z;
        this.offer_status = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_wearables_repo_repo(WearablesComplimentaryOfferJson wearablesComplimentaryOfferJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, wearablesComplimentaryOfferJson.holds_offer);
        c9j5.AAV(wearablesComplimentaryOfferJson.offer_status, c9iZ, 1);
    }

    public final WearablesComplimentaryOfferJson copy(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return new WearablesComplimentaryOfferJson(z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WearablesComplimentaryOfferJson) {
                WearablesComplimentaryOfferJson wearablesComplimentaryOfferJson = (WearablesComplimentaryOfferJson) obj;
                if (this.holds_offer != wearablesComplimentaryOfferJson.holds_offer || !C7384Etj.areEqual(this.offer_status, wearablesComplimentaryOfferJson.offer_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WearablesComplimentaryOfferJson copy$default(WearablesComplimentaryOfferJson wearablesComplimentaryOfferJson, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wearablesComplimentaryOfferJson.holds_offer;
        }
        if ((i & 2) != 0) {
            str = wearablesComplimentaryOfferJson.offer_status;
        }
        C7384Etj.A0Y(str, 1);
        return new WearablesComplimentaryOfferJson(z, str);
    }

    public final boolean component1() {
        return this.holds_offer;
    }

    public final String component2() {
        return this.offer_status;
    }

    public final boolean getHolds_offer() {
        return this.holds_offer;
    }

    public final String getOffer_status() {
        return this.offer_status;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.offer_status, C0KA.A02(this.holds_offer));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WearablesComplimentaryOfferJson(int i, boolean z, String str, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(WearablesComplimentaryOfferJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.holds_offer = z;
        this.offer_status = str;
    }
}
