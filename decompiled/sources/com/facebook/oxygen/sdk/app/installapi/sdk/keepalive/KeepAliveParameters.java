package com.facebook.oxygen.sdk.app.installapi.sdk.keepalive;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;
import X.C9h0;
import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class KeepAliveParameters extends C06G {
    public static final Companion Companion = new Companion();
    public final Boolean A00;
    public final Long A01;
    public final String A02;

    public final class Companion {
        public final C9hr<KeepAliveParameters> serializer() {
            return C9h0.A00;
        }
    }

    public KeepAliveParameters() {
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeepAliveParameters) {
                KeepAliveParameters keepAliveParameters = (KeepAliveParameters) obj;
                if (!C7384Etj.areEqual(this.A00, keepAliveParameters.A00) || !C7384Etj.areEqual(this.A02, keepAliveParameters.A02) || !C7384Etj.areEqual(this.A01, keepAliveParameters.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass006.A0D(this.A00) * 31) + AnonymousClass006.A0G(this.A02)) * 31) + C3cH.A02(this.A01);
    }

    public /* synthetic */ KeepAliveParameters(Boolean bool, Long l, String str, int i) {
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = bool;
        }
        if ((i & 2) == 0) {
            this.A02 = null;
        } else {
            this.A02 = str;
        }
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l;
        }
    }
}
