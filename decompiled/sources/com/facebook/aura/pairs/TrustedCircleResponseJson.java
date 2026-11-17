package com.facebook.aura.pairs;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class TrustedCircleResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<TrustedCircleSourceJson> recipients;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, TrustedCircleResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<TrustedCircleResponseJson> serializer() {
            return TrustedCircleResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final TrustedCircleResponseJson copy(List<TrustedCircleSourceJson> list) {
        C7384Etj.A0Y(list, 0);
        return new TrustedCircleResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof TrustedCircleResponseJson) && C7384Etj.areEqual(this.recipients, ((TrustedCircleResponseJson) obj).recipients));
    }

    public /* synthetic */ TrustedCircleResponseJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(TrustedCircleResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.recipients = list;
    }

    public static /* synthetic */ TrustedCircleResponseJson copy$default(TrustedCircleResponseJson trustedCircleResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trustedCircleResponseJson.recipients;
        }
        C7384Etj.A0Y(list, 0);
        return new TrustedCircleResponseJson(list);
    }

    public final List<TrustedCircleSourceJson> component1() {
        return this.recipients;
    }

    public final List<TrustedCircleSourceJson> getRecipients() {
        return this.recipients;
    }

    public int hashCode() {
        return this.recipients.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public TrustedCircleResponseJson(List<TrustedCircleSourceJson> list) {
        C7384Etj.A0Y(list, 0);
        this.recipients = list;
    }
}
