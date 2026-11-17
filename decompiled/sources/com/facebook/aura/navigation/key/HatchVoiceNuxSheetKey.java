package com.facebook.aura.navigation.key;

import X.AGH;
import X.AbstractC5321DgF;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchVoiceNuxSheetKey extends C06G implements AuraBottomSheetNavKey {
    public final Map<String, String> callAttribution;
    public final String callEntryPoint;
    public final String threadId;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, HatchVoiceNuxSheetKey$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<HatchVoiceNuxSheetKey> serializer() {
            return HatchVoiceNuxSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchVoiceNuxSheetKey(String str, String str2, Map<String, String> map) {
        C7384Etj.A0Y(map, 2);
        this.threadId = str;
        this.callEntryPoint = str2;
        this.callAttribution = map;
    }

    public final HatchVoiceNuxSheetKey copy(String str, String str2, Map<String, String> map) {
        C7384Etj.A0Y(map, 2);
        return new HatchVoiceNuxSheetKey(str, str2, map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchVoiceNuxSheetKey) {
                HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey = (HatchVoiceNuxSheetKey) obj;
                if (!C7384Etj.areEqual(this.threadId, hatchVoiceNuxSheetKey.threadId) || !C7384Etj.areEqual(this.callEntryPoint, hatchVoiceNuxSheetKey.callEntryPoint) || !C7384Etj.areEqual(this.callAttribution, hatchVoiceNuxSheetKey.callAttribution)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchVoiceNuxSheetKey copy$default(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey, String str, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchVoiceNuxSheetKey.threadId;
        }
        if ((i & 2) != 0) {
            str2 = hatchVoiceNuxSheetKey.callEntryPoint;
        }
        if ((i & 4) != 0) {
            map = hatchVoiceNuxSheetKey.callAttribution;
        }
        return hatchVoiceNuxSheetKey.copy(str, str2, map);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(HatchVoiceNuxSheetKey hatchVoiceNuxSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchVoiceNuxSheetKey.threadId != null) {
            c9j5.AAP(hatchVoiceNuxSheetKey.threadId, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || hatchVoiceNuxSheetKey.callEntryPoint != null) {
            c9j5.AAP(hatchVoiceNuxSheetKey.callEntryPoint, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(hatchVoiceNuxSheetKey.callAttribution, AGH.A0E())) {
            c9j5.AAQ(hatchVoiceNuxSheetKey.callAttribution, C06G.A0e(f0cArr, 2), c9iZ, 2);
        }
    }

    public final String component1() {
        return this.threadId;
    }

    public final String component2() {
        return this.callEntryPoint;
    }

    public final Map<String, String> component3() {
        return this.callAttribution;
    }

    public final Map<String, String> getCallAttribution() {
        return this.callAttribution;
    }

    public final String getCallEntryPoint() {
        return this.callEntryPoint;
    }

    public final String getThreadId() {
        return this.threadId;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.callAttribution, ((AnonymousClass006.A0G(this.threadId) * 31) + AnonymousClass005.A0H(this.callEntryPoint)) * 31);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchVoiceNuxSheetKey(String str, String str2, Map map, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? AGH.A0E() : map);
    }

    public /* synthetic */ HatchVoiceNuxSheetKey(int i, String str, String str2, Map map, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.threadId = null;
        } else {
            this.threadId = str;
        }
        if ((i & 2) == 0) {
            this.callEntryPoint = null;
        } else {
            this.callEntryPoint = str2;
        }
        if ((i & 4) == 0) {
            this.callAttribution = AGH.A0E();
        } else {
            this.callAttribution = map;
        }
    }

    public HatchVoiceNuxSheetKey() {
        this(null, null, AGH.A0E());
    }
}
