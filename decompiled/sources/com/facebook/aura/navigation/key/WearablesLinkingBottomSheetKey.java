package com.facebook.aura.navigation.key;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class WearablesLinkingBottomSheetKey extends C06G implements AuraBottomSheetNavKey {
    public static final Companion Companion = new Companion();
    public final boolean dismissIfAlreadyLinked;
    public final boolean phoneProviderLinked;
    public final String setupSessionId;
    public final String utmMedium;
    public final String wakeWord;

    public final class Companion {
        public final C9hr<WearablesLinkingBottomSheetKey> serializer() {
            return WearablesLinkingBottomSheetKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || wearablesLinkingBottomSheetKey.wakeWord != null) {
            c9j5.AAP(wearablesLinkingBottomSheetKey.wakeWord, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || wearablesLinkingBottomSheetKey.utmMedium != null) {
            c9j5.AAP(wearablesLinkingBottomSheetKey.utmMedium, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || !wearablesLinkingBottomSheetKey.dismissIfAlreadyLinked) {
            c9j5.AA7(c9iZ, 2, wearablesLinkingBottomSheetKey.dismissIfAlreadyLinked);
        }
        if (zAfR || wearablesLinkingBottomSheetKey.phoneProviderLinked) {
            c9j5.AA7(c9iZ, 3, wearablesLinkingBottomSheetKey.phoneProviderLinked);
        }
        if (zAfR || wearablesLinkingBottomSheetKey.setupSessionId != null) {
            c9j5.AAP(wearablesLinkingBottomSheetKey.setupSessionId, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WearablesLinkingBottomSheetKey) {
                WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey = (WearablesLinkingBottomSheetKey) obj;
                if (!C7384Etj.areEqual(this.wakeWord, wearablesLinkingBottomSheetKey.wakeWord) || !C7384Etj.areEqual(this.utmMedium, wearablesLinkingBottomSheetKey.utmMedium) || this.dismissIfAlreadyLinked != wearablesLinkingBottomSheetKey.dismissIfAlreadyLinked || this.phoneProviderLinked != wearablesLinkingBottomSheetKey.phoneProviderLinked || !C7384Etj.areEqual(this.setupSessionId, wearablesLinkingBottomSheetKey.setupSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WearablesLinkingBottomSheetKey copy$default(WearablesLinkingBottomSheetKey wearablesLinkingBottomSheetKey, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wearablesLinkingBottomSheetKey.wakeWord;
        }
        if ((i & 2) != 0) {
            str2 = wearablesLinkingBottomSheetKey.utmMedium;
        }
        if ((i & 4) != 0) {
            z = wearablesLinkingBottomSheetKey.dismissIfAlreadyLinked;
        }
        if ((i & 8) != 0) {
            z2 = wearablesLinkingBottomSheetKey.phoneProviderLinked;
        }
        if ((i & 16) != 0) {
            str3 = wearablesLinkingBottomSheetKey.setupSessionId;
        }
        return wearablesLinkingBottomSheetKey.copy(str, str2, z, z2, str3);
    }

    public final String component1() {
        return this.wakeWord;
    }

    public final String component2() {
        return this.utmMedium;
    }

    public final boolean component3() {
        return this.dismissIfAlreadyLinked;
    }

    public final boolean component4() {
        return this.phoneProviderLinked;
    }

    public final String component5() {
        return this.setupSessionId;
    }

    public final WearablesLinkingBottomSheetKey copy(String str, String str2, boolean z, boolean z2, String str3) {
        return new WearablesLinkingBottomSheetKey(str, str2, z, z2, str3);
    }

    public final boolean getDismissIfAlreadyLinked() {
        return this.dismissIfAlreadyLinked;
    }

    public final boolean getPhoneProviderLinked() {
        return this.phoneProviderLinked;
    }

    public final String getSetupSessionId() {
        return this.setupSessionId;
    }

    public final String getUtmMedium() {
        return this.utmMedium;
    }

    public final String getWakeWord() {
        return this.wakeWord;
    }

    public int hashCode() {
        return C0KA.A01(C0KA.A01(((AnonymousClass006.A0G(this.wakeWord) * 31) + AnonymousClass006.A0G(this.utmMedium)) * 31, this.dismissIfAlreadyLinked), this.phoneProviderLinked) + AnonymousClass005.A0H(this.setupSessionId);
    }

    public WearablesLinkingBottomSheetKey(String str, String str2, boolean z, boolean z2, String str3) {
        this.wakeWord = str;
        this.utmMedium = str2;
        this.dismissIfAlreadyLinked = z;
        this.phoneProviderLinked = z2;
        this.setupSessionId = str3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WearablesLinkingBottomSheetKey(String str, String str2, boolean z, boolean z2, String str3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z, AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : str3);
    }

    public /* synthetic */ WearablesLinkingBottomSheetKey(int i, String str, String str2, boolean z, boolean z2, String str3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.wakeWord = null;
        } else {
            this.wakeWord = str;
        }
        if ((i & 2) == 0) {
            this.utmMedium = null;
        } else {
            this.utmMedium = str2;
        }
        if ((i & 4) == 0) {
            this.dismissIfAlreadyLinked = true;
        } else {
            this.dismissIfAlreadyLinked = z;
        }
        if ((i & 8) == 0) {
            this.phoneProviderLinked = false;
        } else {
            this.phoneProviderLinked = z2;
        }
        if ((i & 16) == 0) {
            this.setupSessionId = null;
        } else {
            this.setupSessionId = str3;
        }
    }

    public WearablesLinkingBottomSheetKey() {
        this(null, null, true, false, null);
    }
}
