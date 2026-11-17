package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginBirthdayResult extends C06G {
    public static final int $stable = 0;
    public final NativeLoginBirthdayError error;
    public final String isoDate;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginBirthdayResult) {
                NativeLoginBirthdayResult nativeLoginBirthdayResult = (NativeLoginBirthdayResult) obj;
                if (!C7384Etj.areEqual(this.isoDate, nativeLoginBirthdayResult.isoDate) || this.error != nativeLoginBirthdayResult.error) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginBirthdayResult copy$default(NativeLoginBirthdayResult nativeLoginBirthdayResult, String str, NativeLoginBirthdayError nativeLoginBirthdayError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeLoginBirthdayResult.isoDate;
        }
        if ((i & 2) != 0) {
            nativeLoginBirthdayError = nativeLoginBirthdayResult.error;
        }
        return new NativeLoginBirthdayResult(str, nativeLoginBirthdayError);
    }

    public final String component1() {
        return this.isoDate;
    }

    public final NativeLoginBirthdayError component2() {
        return this.error;
    }

    public final NativeLoginBirthdayResult copy(String str, NativeLoginBirthdayError nativeLoginBirthdayError) {
        return new NativeLoginBirthdayResult(str, nativeLoginBirthdayError);
    }

    public final NativeLoginBirthdayError getError() {
        return this.error;
    }

    public final String getIsoDate() {
        return this.isoDate;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.isoDate) * 31) + C3cH.A02(this.error);
    }

    public NativeLoginBirthdayResult(String str, NativeLoginBirthdayError nativeLoginBirthdayError) {
        this.isoDate = str;
        this.error = nativeLoginBirthdayError;
    }

    public String toString() {
        return super.toString();
    }
}
