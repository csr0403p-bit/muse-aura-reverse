package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class NativeLoginIdentifierResult extends C06G {
    public static final int $stable = 8;
    public final NativeLoginIdentifierError error;
    public final NativeLoginIdentifier identifier;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginIdentifierResult) {
                NativeLoginIdentifierResult nativeLoginIdentifierResult = (NativeLoginIdentifierResult) obj;
                if (!C7384Etj.areEqual(this.identifier, nativeLoginIdentifierResult.identifier) || this.error != nativeLoginIdentifierResult.error) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginIdentifierResult copy$default(NativeLoginIdentifierResult nativeLoginIdentifierResult, NativeLoginIdentifier nativeLoginIdentifier, NativeLoginIdentifierError nativeLoginIdentifierError, int i, Object obj) {
        if ((i & 1) != 0) {
            nativeLoginIdentifier = nativeLoginIdentifierResult.identifier;
        }
        if ((i & 2) != 0) {
            nativeLoginIdentifierError = nativeLoginIdentifierResult.error;
        }
        return new NativeLoginIdentifierResult(nativeLoginIdentifier, nativeLoginIdentifierError);
    }

    public final NativeLoginIdentifier component1() {
        return this.identifier;
    }

    public final NativeLoginIdentifierError component2() {
        return this.error;
    }

    public final NativeLoginIdentifierResult copy(NativeLoginIdentifier nativeLoginIdentifier, NativeLoginIdentifierError nativeLoginIdentifierError) {
        return new NativeLoginIdentifierResult(nativeLoginIdentifier, nativeLoginIdentifierError);
    }

    public final NativeLoginIdentifierError getError() {
        return this.error;
    }

    public final NativeLoginIdentifier getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return (AnonymousClass006.A0D(this.identifier) * 31) + C3cH.A02(this.error);
    }

    public NativeLoginIdentifierResult(NativeLoginIdentifier nativeLoginIdentifier, NativeLoginIdentifierError nativeLoginIdentifierError) {
        this.identifier = nativeLoginIdentifier;
        this.error = nativeLoginIdentifierError;
    }

    public String toString() {
        return super.toString();
    }
}
