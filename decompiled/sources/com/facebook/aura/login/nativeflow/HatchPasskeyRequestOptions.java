package com.facebook.aura.login.nativeflow;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchPasskeyRequestOptions extends C06G {
    public final List<HatchPasskeyDescriptor> allowCredentials;
    public final String challenge;
    public final String rpId;
    public final long timeoutMs;
    public final String userVerification;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPasskeyRequestOptions) {
                HatchPasskeyRequestOptions hatchPasskeyRequestOptions = (HatchPasskeyRequestOptions) obj;
                if (!C7384Etj.areEqual(this.challenge, hatchPasskeyRequestOptions.challenge) || !C7384Etj.areEqual(this.rpId, hatchPasskeyRequestOptions.rpId) || !C7384Etj.areEqual(this.userVerification, hatchPasskeyRequestOptions.userVerification) || this.timeoutMs != hatchPasskeyRequestOptions.timeoutMs || !C7384Etj.areEqual(this.allowCredentials, hatchPasskeyRequestOptions.allowCredentials)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchPasskeyRequestOptions copy$default(HatchPasskeyRequestOptions hatchPasskeyRequestOptions, String str, String str2, String str3, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchPasskeyRequestOptions.challenge;
        }
        if ((i & 2) != 0) {
            str2 = hatchPasskeyRequestOptions.rpId;
        }
        if ((i & 4) != 0) {
            str3 = hatchPasskeyRequestOptions.userVerification;
        }
        if ((i & 8) != 0) {
            j = hatchPasskeyRequestOptions.timeoutMs;
        }
        if ((i & 16) != 0) {
            list = hatchPasskeyRequestOptions.allowCredentials;
        }
        return hatchPasskeyRequestOptions.copy(str, str2, str3, j, list);
    }

    public final String component1() {
        return this.challenge;
    }

    public final String component2() {
        return this.rpId;
    }

    public final String component3() {
        return this.userVerification;
    }

    public final long component4() {
        return this.timeoutMs;
    }

    public final List<HatchPasskeyDescriptor> component5() {
        return this.allowCredentials;
    }

    public final List<HatchPasskeyDescriptor> getAllowCredentials() {
        return this.allowCredentials;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getRpId() {
        return this.rpId;
    }

    public final long getTimeoutMs() {
        return this.timeoutMs;
    }

    public final String getUserVerification() {
        return this.userVerification;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.allowCredentials, AnonymousClass006.A05(this.timeoutMs, AnonymousClass005.A0I(this.userVerification, AnonymousClass005.A0I(this.rpId, AnonymousClass001.A0G(this.challenge)))) * 31);
    }

    public HatchPasskeyRequestOptions(String str, String str2, String str3, long j, List<HatchPasskeyDescriptor> list) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        this.challenge = str;
        this.rpId = str2;
        this.userVerification = str3;
        this.timeoutMs = j;
        this.allowCredentials = list;
    }

    public final HatchPasskeyRequestOptions copy(String str, String str2, String str3, long j, List<HatchPasskeyDescriptor> list) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 4);
        return new HatchPasskeyRequestOptions(str, str2, str3, j, list);
    }

    public String toString() {
        return super.toString();
    }
}
