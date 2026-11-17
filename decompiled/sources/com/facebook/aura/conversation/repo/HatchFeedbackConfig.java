package com.facebook.aura.conversation.repo;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchFeedbackConfig extends C06G {
    public static final Companion Companion = new Companion();
    public static final HatchFeedbackConfig HIDDEN;
    public final boolean badEnabled;
    public final String badLabel;
    public final AHD<String> badOptions;
    public final boolean goodEnabled;
    public final String goodLabel;
    public final AHD<String> goodOptions;

    public final class Companion {
        public final HatchFeedbackConfig getHIDDEN() {
            return HatchFeedbackConfig.HIDDEN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchFeedbackConfig(boolean z, boolean z2, String str, String str2, AHD<String> ahd, AHD<String> ahd2) {
        AnonymousClass005.A16(str, str2, ahd, ahd2, 2);
        this.goodEnabled = z;
        this.badEnabled = z2;
        this.goodLabel = str;
        this.badLabel = str2;
        this.goodOptions = ahd;
        this.badOptions = ahd2;
    }

    public final HatchFeedbackConfig copy(boolean z, boolean z2, String str, String str2, AHD<String> ahd, AHD<String> ahd2) {
        AnonymousClass005.A16(str, str2, ahd, ahd2, 2);
        return new HatchFeedbackConfig(z, z2, str, str2, ahd, ahd2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchFeedbackConfig) {
                HatchFeedbackConfig hatchFeedbackConfig = (HatchFeedbackConfig) obj;
                if (this.goodEnabled != hatchFeedbackConfig.goodEnabled || this.badEnabled != hatchFeedbackConfig.badEnabled || !C7384Etj.areEqual(this.goodLabel, hatchFeedbackConfig.goodLabel) || !C7384Etj.areEqual(this.badLabel, hatchFeedbackConfig.badLabel) || !C7384Etj.areEqual(this.goodOptions, hatchFeedbackConfig.goodOptions) || !C7384Etj.areEqual(this.badOptions, hatchFeedbackConfig.badOptions)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        AHI ahi = AHI.A01;
        HIDDEN = new HatchFeedbackConfig(false, false, "", "", ahi, ahi);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchFeedbackConfig copy$default(HatchFeedbackConfig hatchFeedbackConfig, boolean z, boolean z2, String str, String str2, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchFeedbackConfig.goodEnabled;
        }
        if ((i & 2) != 0) {
            z2 = hatchFeedbackConfig.badEnabled;
        }
        if ((i & 4) != 0) {
            str = hatchFeedbackConfig.goodLabel;
        }
        if ((i & 8) != 0) {
            str2 = hatchFeedbackConfig.badLabel;
        }
        if ((i & 16) != 0) {
            ahd = hatchFeedbackConfig.goodOptions;
        }
        if ((i & 32) != 0) {
            ahd2 = hatchFeedbackConfig.badOptions;
        }
        return hatchFeedbackConfig.copy(z, z2, str, str2, ahd, ahd2);
    }

    public final boolean component1() {
        return this.goodEnabled;
    }

    public final boolean component2() {
        return this.badEnabled;
    }

    public final String component3() {
        return this.goodLabel;
    }

    public final String component4() {
        return this.badLabel;
    }

    public final AHD<String> component5() {
        return this.goodOptions;
    }

    public final AHD<String> component6() {
        return this.badOptions;
    }

    public final boolean getBadEnabled() {
        return this.badEnabled;
    }

    public final String getBadLabel() {
        return this.badLabel;
    }

    public final AHD<String> getBadOptions() {
        return this.badOptions;
    }

    public final boolean getGoodEnabled() {
        return this.goodEnabled;
    }

    public final String getGoodLabel() {
        return this.goodLabel;
    }

    public final AHD<String> getGoodOptions() {
        return this.goodOptions;
    }

    public final boolean getShowBad() {
        return this.badEnabled && !this.badOptions.isEmpty();
    }

    public final boolean getShowGood() {
        return this.goodEnabled && !this.goodOptions.isEmpty();
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.badOptions, AnonymousClass005.A0F(this.goodOptions, AnonymousClass005.A0I(this.badLabel, AnonymousClass005.A0I(this.goodLabel, C0KA.A01(C0KA.A02(this.goodEnabled), this.badEnabled)))));
    }

    public String toString() {
        return super.toString();
    }
}
