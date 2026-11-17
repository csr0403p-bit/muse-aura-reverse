package com.facebook.aura.ageverification;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AgeVerificationStartRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final Integer id_sides;
    public final String method;

    public final class Companion {
        public final C9hr<AgeVerificationStartRequestJson> serializer() {
            return AgeVerificationStartRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AgeVerificationStartRequestJson(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        this.method = str;
        this.id_sides = num;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationStartRequestJson ageVerificationStartRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(ageVerificationStartRequestJson.method, c9iZ, 0);
        if (c9j5.AfR() || ageVerificationStartRequestJson.id_sides != null) {
            c9j5.AAP(ageVerificationStartRequestJson.id_sides, C07729ii.A00, c9iZ, 1);
        }
    }

    public final AgeVerificationStartRequestJson copy(String str, Integer num) {
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationStartRequestJson(str, num);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeVerificationStartRequestJson) {
                AgeVerificationStartRequestJson ageVerificationStartRequestJson = (AgeVerificationStartRequestJson) obj;
                if (!C7384Etj.areEqual(this.method, ageVerificationStartRequestJson.method) || !C7384Etj.areEqual(this.id_sides, ageVerificationStartRequestJson.id_sides)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgeVerificationStartRequestJson copy$default(AgeVerificationStartRequestJson ageVerificationStartRequestJson, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationStartRequestJson.method;
        }
        if ((i & 2) != 0) {
            num = ageVerificationStartRequestJson.id_sides;
        }
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationStartRequestJson(str, num);
    }

    public final String component1() {
        return this.method;
    }

    public final Integer component2() {
        return this.id_sides;
    }

    public final Integer getId_sides() {
        return this.id_sides;
    }

    public final String getMethod() {
        return this.method;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.method) + AnonymousClass006.A0D(this.id_sides);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgeVerificationStartRequestJson(int i, String str, Integer num, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AgeVerificationStartRequestJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.method = str;
        this.id_sides = (i & 2) == 0 ? null : num;
    }

    public /* synthetic */ AgeVerificationStartRequestJson(String str, Integer num, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
