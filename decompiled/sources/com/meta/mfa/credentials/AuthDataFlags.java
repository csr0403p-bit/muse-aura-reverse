package com.meta.mfa.credentials;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.C9lv;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AuthDataFlags {
    public static final Companion Companion = new Companion();
    public final boolean backupEligible;
    public final boolean backupState;
    public final boolean userPresent;
    public final boolean userVerified;

    public final class Companion {
        public final C9hr<AuthDataFlags> serializer() {
            return C9lv.A00;
        }
    }

    public AuthDataFlags() {
        this(false, false, false, false);
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(AuthDataFlags authDataFlags, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || authDataFlags.userPresent) {
            c9j5.AA7(c9iZ, 0, authDataFlags.userPresent);
        }
        if (zAfR || authDataFlags.userVerified) {
            c9j5.AA7(c9iZ, 1, authDataFlags.userVerified);
        }
        if (zAfR || authDataFlags.backupEligible) {
            c9j5.AA7(c9iZ, 2, authDataFlags.backupEligible);
        }
        if (zAfR || authDataFlags.backupState) {
            c9j5.AA7(c9iZ, 3, authDataFlags.backupState);
        }
    }

    public static /* synthetic */ void getBackupEligible$annotations() {
    }

    public static /* synthetic */ void getBackupState$annotations() {
    }

    public static /* synthetic */ void getUserPresent$annotations() {
    }

    public static /* synthetic */ void getUserVerified$annotations() {
    }

    public final boolean getBackupEligible() {
        return this.backupEligible;
    }

    public final boolean getBackupState() {
        return this.backupState;
    }

    public final boolean getUserPresent() {
        return this.userPresent;
    }

    public final boolean getUserVerified() {
        return this.userVerified;
    }

    public AuthDataFlags(boolean z, boolean z2, boolean z3, boolean z4) {
        this.userPresent = z;
        this.userVerified = z2;
        this.backupEligible = z3;
        this.backupState = z4;
    }

    public /* synthetic */ AuthDataFlags(boolean z, boolean z2, boolean z3, boolean z4, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), AnonymousClass005.A1O(i, z3), AnonymousClass005.A1P(i, z4));
    }

    public /* synthetic */ AuthDataFlags(int i, boolean z, boolean z2, boolean z3, boolean z4, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.userPresent = false;
        } else {
            this.userPresent = z;
        }
        if ((i & 2) == 0) {
            this.userVerified = false;
        } else {
            this.userVerified = z2;
        }
        if ((i & 4) == 0) {
            this.backupEligible = false;
        } else {
            this.backupEligible = z3;
        }
        if ((i & 8) == 0) {
            this.backupState = false;
        } else {
            this.backupState = z4;
        }
    }
}
