package com.facebook.aura.pairs;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07839ix;
import X.C0881AGi;
import X.C0KA;
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
public final class PeerStatusJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final List<String> allowed_operations;
    public final String availability;
    public final PeerFeaturesJson features;
    public final Boolean invite_inbox;
    public final List<String> invite_presets;
    public final boolean supported;
    public final List<PeerTrustPresetJson> trust_presets;

    public final class Companion {
        public final C9hr<PeerStatusJson> serializer() {
            return PeerStatusJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, AbstractC5321DgF.A02(num, PeerStatusJson$Companion$$childSerializers$1.INSTANCE), null, AbstractC5321DgF.A02(num, PeerStatusJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, PeerStatusJson$Companion$$childSerializers$3.INSTANCE), null};
    }

    public final PeerStatusJson copy(boolean z, String str, List<String> list, PeerFeaturesJson peerFeaturesJson, List<String> list2, List<PeerTrustPresetJson> list3, Boolean bool) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(list, peerFeaturesJson, list2, list3, 2);
        return new PeerStatusJson(z, str, list, peerFeaturesJson, list2, list3, bool);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PeerStatusJson) {
                PeerStatusJson peerStatusJson = (PeerStatusJson) obj;
                if (this.supported != peerStatusJson.supported || !C7384Etj.areEqual(this.availability, peerStatusJson.availability) || !C7384Etj.areEqual(this.allowed_operations, peerStatusJson.allowed_operations) || !C7384Etj.areEqual(this.features, peerStatusJson.features) || !C7384Etj.areEqual(this.invite_presets, peerStatusJson.invite_presets) || !C7384Etj.areEqual(this.trust_presets, peerStatusJson.trust_presets) || !C7384Etj.areEqual(this.invite_inbox, peerStatusJson.invite_inbox)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PeerStatusJson copy$default(PeerStatusJson peerStatusJson, boolean z, String str, List list, PeerFeaturesJson peerFeaturesJson, List list2, List list3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = peerStatusJson.supported;
        }
        if ((i & 2) != 0) {
            str = peerStatusJson.availability;
        }
        if ((i & 4) != 0) {
            list = peerStatusJson.allowed_operations;
        }
        if ((i & 8) != 0) {
            peerFeaturesJson = peerStatusJson.features;
        }
        if ((i & 16) != 0) {
            list2 = peerStatusJson.invite_presets;
        }
        if ((i & 32) != 0) {
            list3 = peerStatusJson.trust_presets;
        }
        if ((i & 64) != 0) {
            bool = peerStatusJson.invite_inbox;
        }
        return peerStatusJson.copy(z, str, list, peerFeaturesJson, list2, list3, bool);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PeerStatusJson peerStatusJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || peerStatusJson.supported) {
            c9j5.AA7(c9iZ, 0, peerStatusJson.supported);
        }
        if (zAfR || !"unknown".equals(peerStatusJson.availability)) {
            c9j5.AAV(peerStatusJson.availability, c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(peerStatusJson.allowed_operations)) {
            c9j5.AAQ(peerStatusJson.allowed_operations, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || !C7384Etj.areEqual(peerStatusJson.features, new PeerFeaturesJson(false))) {
            c9j5.AAQ(peerStatusJson.features, PeerFeaturesJson$$serializer.INSTANCE, c9iZ, 3);
        }
        if (zAfR || !C3cG.A1L(peerStatusJson.invite_presets)) {
            c9j5.AAQ(peerStatusJson.invite_presets, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(peerStatusJson.trust_presets)) {
            c9j5.AAQ(peerStatusJson.trust_presets, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
        if (zAfR || peerStatusJson.invite_inbox != null) {
            c9j5.AAP(peerStatusJson.invite_inbox, C07839ix.A00, c9iZ, 6);
        }
    }

    public final boolean component1() {
        return this.supported;
    }

    public final String component2() {
        return this.availability;
    }

    public final List<String> component3() {
        return this.allowed_operations;
    }

    public final PeerFeaturesJson component4() {
        return this.features;
    }

    public final List<String> component5() {
        return this.invite_presets;
    }

    public final List<PeerTrustPresetJson> component6() {
        return this.trust_presets;
    }

    public final Boolean component7() {
        return this.invite_inbox;
    }

    public final List<String> getAllowed_operations() {
        return this.allowed_operations;
    }

    public final String getAvailability() {
        return this.availability;
    }

    public final PeerFeaturesJson getFeatures() {
        return this.features;
    }

    public final Boolean getInvite_inbox() {
        return this.invite_inbox;
    }

    public final List<String> getInvite_presets() {
        return this.invite_presets;
    }

    public final boolean getSupported() {
        return this.supported;
    }

    public final List<PeerTrustPresetJson> getTrust_presets() {
        return this.trust_presets;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.trust_presets, AnonymousClass005.A0F(this.invite_presets, AnonymousClass005.A0F(this.features, AnonymousClass005.A0F(this.allowed_operations, AnonymousClass005.A0I(this.availability, C0KA.A02(this.supported)))))) + AnonymousClass006.A0D(this.invite_inbox);
    }

    public /* synthetic */ PeerStatusJson(int i, boolean z, String str, List list, PeerFeaturesJson peerFeaturesJson, List list2, List list3, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.supported = false;
        } else {
            this.supported = z;
        }
        if ((i & 2) == 0) {
            this.availability = "unknown";
        } else {
            this.availability = str;
        }
        if ((i & 4) == 0) {
            this.allowed_operations = C0881AGi.A00;
        } else {
            this.allowed_operations = list;
        }
        if ((i & 8) == 0) {
            this.features = new PeerFeaturesJson(false);
        } else {
            this.features = peerFeaturesJson;
        }
        if ((i & 16) == 0) {
            this.invite_presets = C0881AGi.A00;
        } else {
            this.invite_presets = list2;
        }
        if ((i & 32) == 0) {
            this.trust_presets = C0881AGi.A00;
        } else {
            this.trust_presets = list3;
        }
        if ((i & 64) == 0) {
            this.invite_inbox = null;
        } else {
            this.invite_inbox = bool;
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PeerStatusJson(boolean z, String str, List list, PeerFeaturesJson peerFeaturesJson, List list2, List list3, Boolean bool, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? "unknown" : str, C3cI.A12(list, i), (i & 8) != 0 ? new PeerFeaturesJson(false) : peerFeaturesJson, (i & 16) != 0 ? C0881AGi.A00 : list2, (i & 32) != 0 ? C0881AGi.A00 : list3, (i & 64) != 0 ? null : bool);
    }

    public PeerStatusJson(boolean z, String str, List<String> list, PeerFeaturesJson peerFeaturesJson, List<String> list2, List<PeerTrustPresetJson> list3, Boolean bool) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(list, peerFeaturesJson, list2, list3, 2);
        this.supported = z;
        this.availability = str;
        this.allowed_operations = list;
        this.features = peerFeaturesJson;
        this.invite_presets = list2;
        this.trust_presets = list3;
        this.invite_inbox = bool;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PeerStatusJson() {
        boolean z = false;
        this(z, (String) null, (List) (0 == true ? 1 : 0), (PeerFeaturesJson) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (List) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), 127, (C06H) (0 == true ? 1 : 0));
    }
}
