package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
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
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import com.facebook.aura.navigation.AuraTerminalNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ActivationScreenKey extends C06G implements AuraFullScreenNavKey, AuraTerminalNavKey {
    public static final Companion Companion = new Companion();
    public final boolean wearablesAllowSkip;
    public final boolean wearablesPhoneProviderLinked;
    public final String wearablesSetupSessionId;
    public final boolean wearablesStepRequested;
    public final String wearablesWakeWord;

    public final class Companion {
        public final C9hr<ActivationScreenKey> serializer() {
            return ActivationScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ActivationScreenKey activationScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || activationScreenKey.wearablesStepRequested) {
            c9j5.AA7(c9iZ, 0, activationScreenKey.wearablesStepRequested);
        }
        if (zAfR || activationScreenKey.wearablesAllowSkip) {
            c9j5.AA7(c9iZ, 1, activationScreenKey.wearablesAllowSkip);
        }
        if (zAfR || activationScreenKey.wearablesWakeWord != null) {
            c9j5.AAP(activationScreenKey.wearablesWakeWord, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || activationScreenKey.wearablesPhoneProviderLinked) {
            c9j5.AA7(c9iZ, 3, activationScreenKey.wearablesPhoneProviderLinked);
        }
        if (zAfR || activationScreenKey.wearablesSetupSessionId != null) {
            c9j5.AAP(activationScreenKey.wearablesSetupSessionId, C07779iq.A01, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivationScreenKey) {
                ActivationScreenKey activationScreenKey = (ActivationScreenKey) obj;
                if (this.wearablesStepRequested != activationScreenKey.wearablesStepRequested || this.wearablesAllowSkip != activationScreenKey.wearablesAllowSkip || !C7384Etj.areEqual(this.wearablesWakeWord, activationScreenKey.wearablesWakeWord) || this.wearablesPhoneProviderLinked != activationScreenKey.wearablesPhoneProviderLinked || !C7384Etj.areEqual(this.wearablesSetupSessionId, activationScreenKey.wearablesSetupSessionId)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivationScreenKey copy$default(ActivationScreenKey activationScreenKey, boolean z, boolean z2, String str, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = activationScreenKey.wearablesStepRequested;
        }
        if ((i & 2) != 0) {
            z2 = activationScreenKey.wearablesAllowSkip;
        }
        if ((i & 4) != 0) {
            str = activationScreenKey.wearablesWakeWord;
        }
        if ((i & 8) != 0) {
            z3 = activationScreenKey.wearablesPhoneProviderLinked;
        }
        if ((i & 16) != 0) {
            str2 = activationScreenKey.wearablesSetupSessionId;
        }
        return activationScreenKey.copy(z, z2, str, z3, str2);
    }

    public final boolean component1() {
        return this.wearablesStepRequested;
    }

    public final boolean component2() {
        return this.wearablesAllowSkip;
    }

    public final String component3() {
        return this.wearablesWakeWord;
    }

    public final boolean component4() {
        return this.wearablesPhoneProviderLinked;
    }

    public final String component5() {
        return this.wearablesSetupSessionId;
    }

    public final ActivationScreenKey copy(boolean z, boolean z2, String str, boolean z3, String str2) {
        return new ActivationScreenKey(z, z2, str, z3, str2);
    }

    public final boolean getWearablesAllowSkip() {
        return this.wearablesAllowSkip;
    }

    public final boolean getWearablesPhoneProviderLinked() {
        return this.wearablesPhoneProviderLinked;
    }

    public final String getWearablesSetupSessionId() {
        return this.wearablesSetupSessionId;
    }

    public final boolean getWearablesStepRequested() {
        return this.wearablesStepRequested;
    }

    public final String getWearablesWakeWord() {
        return this.wearablesWakeWord;
    }

    public int hashCode() {
        return C0KA.A01((C0KA.A01(C0KA.A02(this.wearablesStepRequested), this.wearablesAllowSkip) + AnonymousClass006.A0G(this.wearablesWakeWord)) * 31, this.wearablesPhoneProviderLinked) + AnonymousClass005.A0H(this.wearablesSetupSessionId);
    }

    public ActivationScreenKey(boolean z, boolean z2, String str, boolean z3, String str2) {
        this.wearablesStepRequested = z;
        this.wearablesAllowSkip = z2;
        this.wearablesWakeWord = str;
        this.wearablesPhoneProviderLinked = z3;
        this.wearablesSetupSessionId = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivationScreenKey(boolean z, boolean z2, String str, boolean z3, String str2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? null : str, AnonymousClass005.A1P(i, z3), (i & 16) != 0 ? null : str2);
    }

    public /* synthetic */ ActivationScreenKey(int i, boolean z, boolean z2, String str, boolean z3, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.wearablesStepRequested = false;
        } else {
            this.wearablesStepRequested = z;
        }
        if ((i & 2) == 0) {
            this.wearablesAllowSkip = false;
        } else {
            this.wearablesAllowSkip = z2;
        }
        if ((i & 4) == 0) {
            this.wearablesWakeWord = null;
        } else {
            this.wearablesWakeWord = str;
        }
        if ((i & 8) == 0) {
            this.wearablesPhoneProviderLinked = false;
        } else {
            this.wearablesPhoneProviderLinked = z3;
        }
        if ((i & 16) == 0) {
            this.wearablesSetupSessionId = null;
        } else {
            this.wearablesSetupSessionId = str2;
        }
    }

    public ActivationScreenKey() {
        this(false, false, null, false, null);
    }
}
