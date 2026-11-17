package com.facebook.aura.navigation.key;

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
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchFeedbackSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean isGood;
    public final String messageId;

    public final class Companion {
        public final C9hr<HatchFeedbackSheetKey> serializer() {
            return HatchFeedbackSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchFeedbackSheetKey(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        this.isGood = z;
        this.messageId = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchFeedbackSheetKey hatchFeedbackSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, hatchFeedbackSheetKey.isGood);
        c9j5.AAV(hatchFeedbackSheetKey.messageId, c9iZ, 1);
    }

    public final HatchFeedbackSheetKey copy(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        return new HatchFeedbackSheetKey(z, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFeedbackSheetKey) {
                HatchFeedbackSheetKey hatchFeedbackSheetKey = (HatchFeedbackSheetKey) obj;
                if (this.isGood != hatchFeedbackSheetKey.isGood || !C7384Etj.areEqual(this.messageId, hatchFeedbackSheetKey.messageId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchFeedbackSheetKey copy$default(HatchFeedbackSheetKey hatchFeedbackSheetKey, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchFeedbackSheetKey.isGood;
        }
        if ((i & 2) != 0) {
            str = hatchFeedbackSheetKey.messageId;
        }
        C7384Etj.A0Y(str, 1);
        return new HatchFeedbackSheetKey(z, str);
    }

    public final boolean component1() {
        return this.isGood;
    }

    public final String component2() {
        return this.messageId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.messageId, C0KA.A02(this.isGood));
    }

    public final boolean isGood() {
        return this.isGood;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchFeedbackSheetKey(int i, boolean z, String str, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(HatchFeedbackSheetKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.isGood = z;
        this.messageId = str;
    }
}
