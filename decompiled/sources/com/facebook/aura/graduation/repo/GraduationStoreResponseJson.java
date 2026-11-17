package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GraduationStoreResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean stored;

    public final class Companion {
        public final C9hr<GraduationStoreResponseJson> serializer() {
            return GraduationStoreResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationStoreResponseJson graduationStoreResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || graduationStoreResponseJson.stored) {
            c9j5.AA7(c9iZ, 0, graduationStoreResponseJson.stored);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof GraduationStoreResponseJson) && this.stored == ((GraduationStoreResponseJson) obj).stored);
    }

    public static /* synthetic */ GraduationStoreResponseJson copy$default(GraduationStoreResponseJson graduationStoreResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = graduationStoreResponseJson.stored;
        }
        return new GraduationStoreResponseJson(z);
    }

    public final boolean component1() {
        return this.stored;
    }

    public final GraduationStoreResponseJson copy(boolean z) {
        return new GraduationStoreResponseJson(z);
    }

    public final boolean getStored() {
        return this.stored;
    }

    public int hashCode() {
        return this.stored ? 1231 : 1237;
    }

    public /* synthetic */ GraduationStoreResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.stored = false;
        } else {
            this.stored = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public GraduationStoreResponseJson(boolean z) {
        this.stored = z;
    }

    public /* synthetic */ GraduationStoreResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public GraduationStoreResponseJson() {
        this(false);
    }
}
