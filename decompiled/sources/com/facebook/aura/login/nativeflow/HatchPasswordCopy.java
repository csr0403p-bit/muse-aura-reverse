package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C0KA;

/* loaded from: classes.dex */
public final class HatchPasswordCopy extends C06G {
    public final boolean hasFacebookPassword;
    public final boolean hasInstagramPassword;
    public final boolean hasOwnPassword;
    public final boolean isF3;
    public final boolean isSignup;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPasswordCopy) {
                HatchPasswordCopy hatchPasswordCopy = (HatchPasswordCopy) obj;
                if (this.isF3 != hatchPasswordCopy.isF3 || this.isSignup != hatchPasswordCopy.isSignup || this.hasOwnPassword != hatchPasswordCopy.hasOwnPassword || this.hasFacebookPassword != hatchPasswordCopy.hasFacebookPassword || this.hasInstagramPassword != hatchPasswordCopy.hasInstagramPassword) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPasswordCopy copy$default(HatchPasswordCopy hatchPasswordCopy, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchPasswordCopy.isF3;
        }
        if ((i & 2) != 0) {
            z2 = hatchPasswordCopy.isSignup;
        }
        if ((i & 4) != 0) {
            z3 = hatchPasswordCopy.hasOwnPassword;
        }
        if ((i & 8) != 0) {
            z4 = hatchPasswordCopy.hasFacebookPassword;
        }
        if ((i & 16) != 0) {
            z5 = hatchPasswordCopy.hasInstagramPassword;
        }
        return hatchPasswordCopy.copy(z, z2, z3, z4, z5);
    }

    public final boolean component1() {
        return this.isF3;
    }

    public final boolean component2() {
        return this.isSignup;
    }

    public final boolean component3() {
        return this.hasOwnPassword;
    }

    public final boolean component4() {
        return this.hasFacebookPassword;
    }

    public final boolean component5() {
        return this.hasInstagramPassword;
    }

    public final HatchPasswordCopy copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new HatchPasswordCopy(z, z2, z3, z4, z5);
    }

    public final boolean getHasFacebookPassword() {
        return this.hasFacebookPassword;
    }

    public final boolean getHasInstagramPassword() {
        return this.hasInstagramPassword;
    }

    public final boolean getHasOwnPassword() {
        return this.hasOwnPassword;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A02(this.isF3), this.isSignup), this.hasOwnPassword), this.hasFacebookPassword), this.hasInstagramPassword);
    }

    public final boolean isF3() {
        return this.isF3;
    }

    public final boolean isSignup() {
        return this.isSignup;
    }

    public HatchPasswordCopy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isF3 = z;
        this.isSignup = z2;
        this.hasOwnPassword = z3;
        this.hasFacebookPassword = z4;
        this.hasInstagramPassword = z5;
    }

    public String toString() {
        return super.toString();
    }
}
