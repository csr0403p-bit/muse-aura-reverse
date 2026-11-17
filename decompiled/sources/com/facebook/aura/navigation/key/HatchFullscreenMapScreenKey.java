package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchFullscreenMapScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final boolean openPlaceDetails;
    public final String presentationId;
    public final String selectedArtifactId;

    public final class Companion {
        public final C9hr<HatchFullscreenMapScreenKey> serializer() {
            return HatchFullscreenMapScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchFullscreenMapScreenKey(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.presentationId = str;
        this.selectedArtifactId = str2;
        this.openPlaceDetails = z;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_impl_keys_keys(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchFullscreenMapScreenKey.presentationId, c9iZ, 0);
        c9j5.AAP(hatchFullscreenMapScreenKey.selectedArtifactId, C07779iq.A01, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, hatchFullscreenMapScreenKey.openPlaceDetails);
    }

    public final HatchFullscreenMapScreenKey copy(String str, String str2, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new HatchFullscreenMapScreenKey(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFullscreenMapScreenKey) {
                HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey = (HatchFullscreenMapScreenKey) obj;
                if (!C7384Etj.areEqual(this.presentationId, hatchFullscreenMapScreenKey.presentationId) || !C7384Etj.areEqual(this.selectedArtifactId, hatchFullscreenMapScreenKey.selectedArtifactId) || this.openPlaceDetails != hatchFullscreenMapScreenKey.openPlaceDetails) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchFullscreenMapScreenKey copy$default(HatchFullscreenMapScreenKey hatchFullscreenMapScreenKey, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchFullscreenMapScreenKey.presentationId;
        }
        if ((i & 2) != 0) {
            str2 = hatchFullscreenMapScreenKey.selectedArtifactId;
        }
        if ((i & 4) != 0) {
            z = hatchFullscreenMapScreenKey.openPlaceDetails;
        }
        return hatchFullscreenMapScreenKey.copy(str, str2, z);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.selectedArtifactId;
    }

    public final boolean component3() {
        return this.openPlaceDetails;
    }

    public final boolean getOpenPlaceDetails() {
        return this.openPlaceDetails;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public final String getSelectedArtifactId() {
        return this.selectedArtifactId;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.presentationId) + AnonymousClass006.A0G(this.selectedArtifactId)) * 31, this.openPlaceDetails);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchFullscreenMapScreenKey(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(HatchFullscreenMapScreenKey$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.presentationId = str;
        this.selectedArtifactId = str2;
        this.openPlaceDetails = z;
    }
}
