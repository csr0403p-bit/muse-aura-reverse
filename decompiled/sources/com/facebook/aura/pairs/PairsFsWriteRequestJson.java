package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
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
public final class PairsFsWriteRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean append;
    public final boolean create_parent;
    public final boolean overwrite;
    public final String path;
    public final String text;

    public final class Companion {
        public final C9hr<PairsFsWriteRequestJson> serializer() {
            return PairsFsWriteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsFsWriteRequestJson pairsFsWriteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pairsFsWriteRequestJson.path, c9iZ, 0);
        c9j5.AAV(pairsFsWriteRequestJson.text, c9iZ, 1);
        c9j5.AA7(c9iZ, 2, pairsFsWriteRequestJson.overwrite);
        c9j5.AA7(c9iZ, 3, pairsFsWriteRequestJson.append);
        c9j5.AA7(c9iZ, 4, pairsFsWriteRequestJson.create_parent);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PairsFsWriteRequestJson) {
                PairsFsWriteRequestJson pairsFsWriteRequestJson = (PairsFsWriteRequestJson) obj;
                if (!C7384Etj.areEqual(this.path, pairsFsWriteRequestJson.path) || !C7384Etj.areEqual(this.text, pairsFsWriteRequestJson.text) || this.overwrite != pairsFsWriteRequestJson.overwrite || this.append != pairsFsWriteRequestJson.append || this.create_parent != pairsFsWriteRequestJson.create_parent) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PairsFsWriteRequestJson copy$default(PairsFsWriteRequestJson pairsFsWriteRequestJson, String str, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairsFsWriteRequestJson.path;
        }
        if ((i & 2) != 0) {
            str2 = pairsFsWriteRequestJson.text;
        }
        if ((i & 4) != 0) {
            z = pairsFsWriteRequestJson.overwrite;
        }
        if ((i & 8) != 0) {
            z2 = pairsFsWriteRequestJson.append;
        }
        if ((i & 16) != 0) {
            z3 = pairsFsWriteRequestJson.create_parent;
        }
        return pairsFsWriteRequestJson.copy(str, str2, z, z2, z3);
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.text;
    }

    public final boolean component3() {
        return this.overwrite;
    }

    public final boolean component4() {
        return this.append;
    }

    public final boolean component5() {
        return this.create_parent;
    }

    public final boolean getAppend() {
        return this.append;
    }

    public final boolean getCreate_parent() {
        return this.create_parent;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.text, AnonymousClass001.A0G(this.path)), this.overwrite), this.append), this.create_parent);
    }

    public PairsFsWriteRequestJson(String str, String str2, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        this.path = str;
        this.text = str2;
        this.overwrite = z;
        this.append = z2;
        this.create_parent = z3;
    }

    public final PairsFsWriteRequestJson copy(String str, String str2, boolean z, boolean z2, boolean z3) {
        AnonymousClass003.A0u(str, str2);
        return new PairsFsWriteRequestJson(str, str2, z, z2, z3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PairsFsWriteRequestJson(int i, String str, String str2, boolean z, boolean z2, boolean z3, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(PairsFsWriteRequestJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.path = str;
        this.text = str2;
        this.overwrite = z;
        this.append = z2;
        this.create_parent = z3;
    }
}
