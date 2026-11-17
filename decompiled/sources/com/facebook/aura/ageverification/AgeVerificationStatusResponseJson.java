package com.facebook.aura.ageverification;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class AgeVerificationStatusResponseJson extends C06G {
    public static final int $stable = 8;
    public final AgeVerificationAttemptJson attempt;
    public final List<String> methods;
    public final Integer retries_left;
    public final String state;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, AgeVerificationStatusResponseJson$Companion$$childSerializers$1.INSTANCE), null, null};

    public final class Companion {
        public final C9hr<AgeVerificationStatusResponseJson> serializer() {
            return AgeVerificationStatusResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeVerificationStatusResponseJson) {
                AgeVerificationStatusResponseJson ageVerificationStatusResponseJson = (AgeVerificationStatusResponseJson) obj;
                if (!C7384Etj.areEqual(this.state, ageVerificationStatusResponseJson.state) || !C7384Etj.areEqual(this.methods, ageVerificationStatusResponseJson.methods) || !C7384Etj.areEqual(this.attempt, ageVerificationStatusResponseJson.attempt) || !C7384Etj.areEqual(this.retries_left, ageVerificationStatusResponseJson.retries_left)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgeVerificationStatusResponseJson copy$default(AgeVerificationStatusResponseJson ageVerificationStatusResponseJson, String str, List list, AgeVerificationAttemptJson ageVerificationAttemptJson, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationStatusResponseJson.state;
        }
        if ((i & 2) != 0) {
            list = ageVerificationStatusResponseJson.methods;
        }
        if ((i & 4) != 0) {
            ageVerificationAttemptJson = ageVerificationStatusResponseJson.attempt;
        }
        if ((i & 8) != 0) {
            num = ageVerificationStatusResponseJson.retries_left;
        }
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationStatusResponseJson(str, list, ageVerificationAttemptJson, num);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationStatusResponseJson ageVerificationStatusResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(ageVerificationStatusResponseJson.state)) {
            c9j5.AAV(ageVerificationStatusResponseJson.state, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(ageVerificationStatusResponseJson.methods)) {
            c9j5.AAQ(ageVerificationStatusResponseJson.methods, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || ageVerificationStatusResponseJson.attempt != null) {
            c9j5.AAP(ageVerificationStatusResponseJson.attempt, AgeVerificationAttemptJson$$serializer.INSTANCE, c9iZ, 2);
        }
        if (zAfR || ageVerificationStatusResponseJson.retries_left != null) {
            c9j5.AAP(ageVerificationStatusResponseJson.retries_left, C07729ii.A00, c9iZ, 3);
        }
    }

    public final String component1() {
        return this.state;
    }

    public final List<String> component2() {
        return this.methods;
    }

    public final AgeVerificationAttemptJson component3() {
        return this.attempt;
    }

    public final Integer component4() {
        return this.retries_left;
    }

    public final AgeVerificationAttemptJson getAttempt() {
        return this.attempt;
    }

    public final List<String> getMethods() {
        return this.methods;
    }

    public final Integer getRetries_left() {
        return this.retries_left;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.methods, AnonymousClass001.A0G(this.state)) + AnonymousClass006.A0D(this.attempt)) * 31) + C3cH.A02(this.retries_left);
    }

    public /* synthetic */ AgeVerificationStatusResponseJson(int i, String str, List list, AgeVerificationAttemptJson ageVerificationAttemptJson, Integer num, C2hx c2hx) {
        this.state = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.methods = C0881AGi.A00;
        } else {
            this.methods = list;
        }
        if ((i & 4) == 0) {
            this.attempt = null;
        } else {
            this.attempt = ageVerificationAttemptJson;
        }
        if ((i & 8) == 0) {
            this.retries_left = null;
        } else {
            this.retries_left = num;
        }
    }

    public final AgeVerificationStatusResponseJson copy(String str, List<String> list, AgeVerificationAttemptJson ageVerificationAttemptJson, Integer num) {
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationStatusResponseJson(str, list, ageVerificationAttemptJson, num);
    }

    public final AgeVerificationStatus toDomain() {
        String str;
        AgeVerificationState next;
        String str2;
        Iterator<AgeVerificationState> it = AgeVerificationState.getEntries().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.name().equals(this.state)) {
                break;
            }
        }
        AgeVerificationState ageVerificationState = next;
        List<String> list = this.methods;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str3 : list) {
            Iterator<AgeVerificationMethod> it2 = AgeVerificationMethod.getEntries().iterator();
            while (true) {
                if (it2.hasNext()) {
                    AgeVerificationMethod next2 = it2.next();
                    if (next2.name().equals(str3)) {
                        if (next2 != null) {
                            arrayListA0h.add(next2);
                        }
                    }
                }
            }
        }
        Integer num = this.retries_left;
        AgeVerificationAttemptJson ageVerificationAttemptJson = this.attempt;
        if (ageVerificationAttemptJson != null && (str2 = ageVerificationAttemptJson.status) != null && !C7BY.A0j(str2)) {
            str = str2;
        }
        return new AgeVerificationStatus(ageVerificationState, arrayListA0h, num, str);
    }

    public String toString() {
        return super.toString();
    }

    public AgeVerificationStatusResponseJson(String str, List<String> list, AgeVerificationAttemptJson ageVerificationAttemptJson, Integer num) {
        AnonymousClass003.A0u(str, list);
        this.state = str;
        this.methods = list;
        this.attempt = ageVerificationAttemptJson;
        this.retries_left = num;
    }

    public /* synthetic */ AgeVerificationStatusResponseJson(String str, List list, AgeVerificationAttemptJson ageVerificationAttemptJson, Integer num, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i), (i & 4) != 0 ? null : ageVerificationAttemptJson, (i & 8) != 0 ? null : num);
    }

    public AgeVerificationStatusResponseJson() {
        this("", C0881AGi.A00, null, null);
    }
}
