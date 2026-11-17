package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.F60;
import com.facebook.aura.navigation.AuraNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RichFormatScreenKey extends C06G implements AuraNavKey {
    public static final Companion Companion = new Companion();
    public final String cacheId;

    public final class Companion {
        public final C9hr<RichFormatScreenKey> serializer() {
            return RichFormatScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final RichFormatScreenKey copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new RichFormatScreenKey(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RichFormatScreenKey) && C7384Etj.areEqual(this.cacheId, ((RichFormatScreenKey) obj).cacheId));
    }

    public /* synthetic */ RichFormatScreenKey(int i, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(RichFormatScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.cacheId = str;
    }

    public static /* synthetic */ RichFormatScreenKey copy$default(RichFormatScreenKey richFormatScreenKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = richFormatScreenKey.cacheId;
        }
        C7384Etj.A0Y(str, 0);
        return new RichFormatScreenKey(str);
    }

    public final String component1() {
        return this.cacheId;
    }

    public final String getCacheId() {
        return this.cacheId;
    }

    public int hashCode() {
        return this.cacheId.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public RichFormatScreenKey(String str) {
        C7384Etj.A0Y(str, 0);
        this.cacheId = str;
    }
}
