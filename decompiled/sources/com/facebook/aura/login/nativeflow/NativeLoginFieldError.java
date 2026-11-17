package com.facebook.aura.login.nativeflow;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class NativeLoginFieldError extends C06G {
    public static final int $stable = 0;
    public final NativeLoginField field;
    public final int messageRes;
    public final String serverMessage;

    public NativeLoginFieldError(NativeLoginField nativeLoginField, int i, String str) {
        C7384Etj.A0Y(nativeLoginField, 0);
        this.field = nativeLoginField;
        this.messageRes = i;
        this.serverMessage = str;
    }

    public final NativeLoginFieldError copy(NativeLoginField nativeLoginField, int i, String str) {
        C7384Etj.A0Y(nativeLoginField, 0);
        return new NativeLoginFieldError(nativeLoginField, i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NativeLoginFieldError) {
                NativeLoginFieldError nativeLoginFieldError = (NativeLoginFieldError) obj;
                if (this.field != nativeLoginFieldError.field || this.messageRes != nativeLoginFieldError.messageRes || !C7384Etj.areEqual(this.serverMessage, nativeLoginFieldError.serverMessage)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ NativeLoginFieldError copy$default(NativeLoginFieldError nativeLoginFieldError, NativeLoginField nativeLoginField, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nativeLoginField = nativeLoginFieldError.field;
        }
        if ((i2 & 2) != 0) {
            i = nativeLoginFieldError.messageRes;
        }
        if ((i2 & 4) != 0) {
            str = nativeLoginFieldError.serverMessage;
        }
        return nativeLoginFieldError.copy(nativeLoginField, i, str);
    }

    public final NativeLoginField component1() {
        return this.field;
    }

    public final int component2() {
        return this.messageRes;
    }

    public final String component3() {
        return this.serverMessage;
    }

    public final NativeLoginField getField() {
        return this.field;
    }

    public final int getMessageRes() {
        return this.messageRes;
    }

    public final String getServerMessage() {
        return this.serverMessage;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.field) + this.messageRes) * 31) + AnonymousClass006.A0G(this.serverMessage);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginFieldError(NativeLoginField nativeLoginField, int i, String str, int i2, C06H c06h) {
        this(nativeLoginField, i, AnonymousClass006.A0t(i2, str));
    }
}
