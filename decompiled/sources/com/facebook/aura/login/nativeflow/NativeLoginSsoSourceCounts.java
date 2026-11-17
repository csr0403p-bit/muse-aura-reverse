package com.facebook.aura.login.nativeflow;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class NativeLoginSsoSourceCounts extends C06G {
    public static final Companion Companion = new Companion();
    public final int fb;
    public final int ig;
    public final int rl;
    public final int wa;

    public final class Companion {
        public final C9hr<NativeLoginSsoSourceCounts> serializer() {
            return NativeLoginSsoSourceCounts$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_login_nativeflow_nativeflow(NativeLoginSsoSourceCounts nativeLoginSsoSourceCounts, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, nativeLoginSsoSourceCounts.fb);
        c9j5.AAK(c9iZ, 1, nativeLoginSsoSourceCounts.ig);
        c9j5.AAK(c9iZ, 2, nativeLoginSsoSourceCounts.wa);
        c9j5.AAK(c9iZ, 3, nativeLoginSsoSourceCounts.rl);
    }

    public static /* synthetic */ NativeLoginSsoSourceCounts copy$default(NativeLoginSsoSourceCounts nativeLoginSsoSourceCounts, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = nativeLoginSsoSourceCounts.fb;
        }
        if ((i5 & 2) != 0) {
            i2 = nativeLoginSsoSourceCounts.ig;
        }
        if ((i5 & 4) != 0) {
            i3 = nativeLoginSsoSourceCounts.wa;
        }
        if ((i5 & 8) != 0) {
            i4 = nativeLoginSsoSourceCounts.rl;
        }
        return new NativeLoginSsoSourceCounts(i, i2, i3, i4);
    }

    public final int component1() {
        return this.fb;
    }

    public final int component2() {
        return this.ig;
    }

    public final int component3() {
        return this.wa;
    }

    public final int component4() {
        return this.rl;
    }

    public final NativeLoginSsoSourceCounts copy(int i, int i2, int i3, int i4) {
        return new NativeLoginSsoSourceCounts(i, i2, i3, i4);
    }

    public final int getFb() {
        return this.fb;
    }

    public final int getIg() {
        return this.ig;
    }

    public final int getRl() {
        return this.rl;
    }

    public final int getWa() {
        return this.wa;
    }

    public NativeLoginSsoSourceCounts(int i, int i2, int i3, int i4) {
        this.fb = i;
        this.ig = i2;
        this.wa = i3;
        this.rl = i4;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ NativeLoginSsoSourceCounts(int i, int i2, int i3, int i4, int i5, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(NativeLoginSsoSourceCounts$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.fb = i2;
        this.ig = i3;
        this.wa = i4;
        this.rl = i5;
    }
}
