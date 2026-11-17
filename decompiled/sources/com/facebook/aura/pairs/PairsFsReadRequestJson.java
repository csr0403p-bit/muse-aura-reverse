package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsFsReadRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int len;
    public final int offset;
    public final String path;

    public final class Companion {
        public final C9hr<PairsFsReadRequestJson> serializer() {
            return PairsFsReadRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsFsReadRequestJson(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        this.path = str;
        this.offset = i;
        this.len = i2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsFsReadRequestJson pairsFsReadRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsFsReadRequestJson.path, c9iZ, 0);
        c9j5.AAK(c9iZ, 1, pairsFsReadRequestJson.offset);
        c9j5.AAK(c9iZ, 2, pairsFsReadRequestJson.len);
    }

    public final PairsFsReadRequestJson copy(String str, int i, int i2) {
        C7384Etj.A0Y(str, 0);
        return new PairsFsReadRequestJson(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsFsReadRequestJson) {
                PairsFsReadRequestJson pairsFsReadRequestJson = (PairsFsReadRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, pairsFsReadRequestJson.path) || this.offset != pairsFsReadRequestJson.offset || this.len != pairsFsReadRequestJson.len) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsFsReadRequestJson copy$default(PairsFsReadRequestJson pairsFsReadRequestJson, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pairsFsReadRequestJson.path;
        }
        if ((i3 & 2) != 0) {
            i = pairsFsReadRequestJson.offset;
        }
        if ((i3 & 4) != 0) {
            i2 = pairsFsReadRequestJson.len;
        }
        return pairsFsReadRequestJson.copy(str, i, i2);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.offset;
    }

    public final int component3() {
        return this.len;
    }

    public final int getLen() {
        return this.len;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.path) + this.offset) * 31) + this.len;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsFsReadRequestJson(int i, String str, int i2, int i3, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PairsFsReadRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.offset = i2;
        this.len = i3;
    }
}
