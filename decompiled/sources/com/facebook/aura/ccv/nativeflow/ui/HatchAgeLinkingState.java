package com.facebook.aura.ccv.nativeflow.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import com.facebook.aura.ccv.nativeflow.HatchLinkableAccountType;

/* loaded from: classes3.dex */
public final class HatchAgeLinkingState extends C06G {
    public static final int $stable = 0;
    public final HatchLinkableAccountType account;
    public final int attempt;
    public final String attemptId;
    public final HatchCcvLinkingError error;
    public final boolean isResolving;
    public final HatchLinkableAccountType launch;
    public final int optionsVersion;

    public static /* synthetic */ HatchAgeLinkingState copy$default(HatchAgeLinkingState hatchAgeLinkingState, boolean z, HatchLinkableAccountType hatchLinkableAccountType, HatchLinkableAccountType hatchLinkableAccountType2, int i, HatchCcvLinkingError hatchCcvLinkingError, int i2, String str, int i3, Object obj) {
        boolean z2 = z;
        HatchLinkableAccountType hatchLinkableAccountType3 = hatchLinkableAccountType;
        HatchLinkableAccountType hatchLinkableAccountType4 = hatchLinkableAccountType2;
        int i4 = i;
        HatchCcvLinkingError hatchCcvLinkingError2 = hatchCcvLinkingError;
        int i5 = i2;
        String str2 = str;
        if ((i3 & 1) != 0) {
            z2 = hatchAgeLinkingState.isResolving;
        }
        if ((i3 & 2) != 0) {
            hatchLinkableAccountType3 = hatchAgeLinkingState.account;
        }
        if ((i3 & 4) != 0) {
            hatchLinkableAccountType4 = hatchAgeLinkingState.launch;
        }
        if ((i3 & 8) != 0) {
            i4 = hatchAgeLinkingState.optionsVersion;
        }
        if ((i3 & 16) != 0) {
            hatchCcvLinkingError2 = hatchAgeLinkingState.error;
        }
        if ((i3 & 32) != 0) {
            i5 = hatchAgeLinkingState.attempt;
        }
        if ((i3 & 64) != 0) {
            str2 = hatchAgeLinkingState.attemptId;
        }
        return new HatchAgeLinkingState(z2, hatchLinkableAccountType3, hatchLinkableAccountType4, i4, hatchCcvLinkingError2, i5, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAgeLinkingState) {
                HatchAgeLinkingState hatchAgeLinkingState = (HatchAgeLinkingState) obj;
                if (this.isResolving != hatchAgeLinkingState.isResolving || this.account != hatchAgeLinkingState.account || this.launch != hatchAgeLinkingState.launch || this.optionsVersion != hatchAgeLinkingState.optionsVersion || this.error != hatchAgeLinkingState.error || this.attempt != hatchAgeLinkingState.attempt || !C7384Etj.areEqual(this.attemptId, hatchAgeLinkingState.attemptId)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.isResolving;
    }

    public final HatchLinkableAccountType component2() {
        return this.account;
    }

    public final HatchLinkableAccountType component3() {
        return this.launch;
    }

    public final int component4() {
        return this.optionsVersion;
    }

    public final HatchCcvLinkingError component5() {
        return this.error;
    }

    public final int component6() {
        return this.attempt;
    }

    public final String component7() {
        return this.attemptId;
    }

    public final HatchAgeLinkingState copy(boolean z, HatchLinkableAccountType hatchLinkableAccountType, HatchLinkableAccountType hatchLinkableAccountType2, int i, HatchCcvLinkingError hatchCcvLinkingError, int i2, String str) {
        return new HatchAgeLinkingState(z, hatchLinkableAccountType, hatchLinkableAccountType2, i, hatchCcvLinkingError, i2, str);
    }

    public final HatchLinkableAccountType getAccount() {
        return this.account;
    }

    public final int getAttempt() {
        return this.attempt;
    }

    public final String getAttemptId() {
        return this.attemptId;
    }

    public final HatchCcvLinkingError getError() {
        return this.error;
    }

    public final HatchLinkableAccountType getLaunch() {
        return this.launch;
    }

    public final int getOptionsVersion() {
        return this.optionsVersion;
    }

    public int hashCode() {
        return ((((((((((C0KA.A02(this.isResolving) + AnonymousClass006.A0D(this.account)) * 31) + AnonymousClass006.A0D(this.launch)) * 31) + this.optionsVersion) * 31) + AnonymousClass006.A0D(this.error)) * 31) + this.attempt) * 31) + AnonymousClass005.A0H(this.attemptId);
    }

    public final boolean isResolving() {
        return this.isResolving;
    }

    public /* synthetic */ HatchAgeLinkingState(boolean z, HatchLinkableAccountType hatchLinkableAccountType, HatchLinkableAccountType hatchLinkableAccountType2, int i, HatchCcvLinkingError hatchCcvLinkingError, int i2, String str, int i3, C06H c06h) {
        this(AnonymousClass001.A1P(i3, z), (i3 & 2) != 0 ? null : hatchLinkableAccountType, (i3 & 4) != 0 ? null : hatchLinkableAccountType2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : hatchCcvLinkingError, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str);
    }

    public String toString() {
        return super.toString();
    }

    public HatchAgeLinkingState(boolean z, HatchLinkableAccountType hatchLinkableAccountType, HatchLinkableAccountType hatchLinkableAccountType2, int i, HatchCcvLinkingError hatchCcvLinkingError, int i2, String str) {
        this.isResolving = z;
        this.account = hatchLinkableAccountType;
        this.launch = hatchLinkableAccountType2;
        this.optionsVersion = i;
        this.error = hatchCcvLinkingError;
        this.attempt = i2;
        this.attemptId = str;
    }

    public HatchAgeLinkingState() {
        this(false, null, null, 0, null, 0, null);
    }
}
