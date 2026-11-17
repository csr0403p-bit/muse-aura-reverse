package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class HatchPlaceDetailsSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final String artifactId;
    public final String presentationId;

    public final class Companion {
        public final C9hr<HatchPlaceDetailsSheetKey> serializer() {
            return HatchPlaceDetailsSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_impl_keys_keys(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(hatchPlaceDetailsSheetKey.presentationId, c9iZ, 0);
        c9j5.AAV(hatchPlaceDetailsSheetKey.artifactId, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPlaceDetailsSheetKey) {
                HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey = (HatchPlaceDetailsSheetKey) obj;
                if (!C7384Etj.areEqual(this.presentationId, hatchPlaceDetailsSheetKey.presentationId) || !C7384Etj.areEqual(this.artifactId, hatchPlaceDetailsSheetKey.artifactId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPlaceDetailsSheetKey copy$default(HatchPlaceDetailsSheetKey hatchPlaceDetailsSheetKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPlaceDetailsSheetKey.presentationId;
        }
        if ((i & 2) != 0) {
            str2 = hatchPlaceDetailsSheetKey.artifactId;
        }
        AnonymousClass003.A0u(str, str2);
        return new HatchPlaceDetailsSheetKey(str, str2);
    }

    public final String component1() {
        return this.presentationId;
    }

    public final String component2() {
        return this.artifactId;
    }

    public final String getArtifactId() {
        return this.artifactId;
    }

    public final String getPresentationId() {
        return this.presentationId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.artifactId, AnonymousClass001.A0G(this.presentationId));
    }

    public HatchPlaceDetailsSheetKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.presentationId = str;
        this.artifactId = str2;
    }

    public final HatchPlaceDetailsSheetKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new HatchPlaceDetailsSheetKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchPlaceDetailsSheetKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchPlaceDetailsSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.presentationId = str;
        this.artifactId = str2;
    }
}
