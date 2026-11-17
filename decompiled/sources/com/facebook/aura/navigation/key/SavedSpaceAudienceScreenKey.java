package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class SavedSpaceAudienceScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String shortcode;

    public final class Companion {
        public final C9hr<SavedSpaceAudienceScreenKey> serializer() {
            return SavedSpaceAudienceScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final SavedSpaceAudienceScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceAudienceScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SavedSpaceAudienceScreenKey) && C7384Etj.areEqual(this.shortcode, ((SavedSpaceAudienceScreenKey) obj).shortcode));
    }

    public /* synthetic */ SavedSpaceAudienceScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(SavedSpaceAudienceScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.shortcode = str;
    }

    public static /* synthetic */ SavedSpaceAudienceScreenKey copy$default(SavedSpaceAudienceScreenKey savedSpaceAudienceScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedSpaceAudienceScreenKey.shortcode;
        }
        C7384Etj.A0Y(str, 0);
        return new SavedSpaceAudienceScreenKey(str);
    }

    public final String component1() {
        return this.shortcode;
    }

    public final String getShortcode() {
        return this.shortcode;
    }

    public int hashCode() {
        return this.shortcode.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public SavedSpaceAudienceScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.shortcode = str;
    }
}
