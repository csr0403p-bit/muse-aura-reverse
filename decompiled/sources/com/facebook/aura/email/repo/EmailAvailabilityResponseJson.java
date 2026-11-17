package com.facebook.aura.email.repo;

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
/* loaded from: classes.dex */
public final class EmailAvailabilityResponseJson extends C06G {
    public final List<EmailAvailabilityJson> results;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, EmailAvailabilityResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<EmailAvailabilityResponseJson> serializer() {
            return EmailAvailabilityResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final EmailAvailabilityResponseJson copy(List<EmailAvailabilityJson> list) {
        C7384Etj.A0Y(list, 0);
        return new EmailAvailabilityResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof EmailAvailabilityResponseJson) && C7384Etj.areEqual(this.results, ((EmailAvailabilityResponseJson) obj).results));
    }

    public /* synthetic */ EmailAvailabilityResponseJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(EmailAvailabilityResponseJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.results = list;
    }

    public static /* synthetic */ EmailAvailabilityResponseJson copy$default(EmailAvailabilityResponseJson emailAvailabilityResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = emailAvailabilityResponseJson.results;
        }
        C7384Etj.A0Y(list, 0);
        return new EmailAvailabilityResponseJson(list);
    }

    public final List<EmailAvailabilityJson> component1() {
        return this.results;
    }

    public final List<EmailAvailabilityJson> getResults() {
        return this.results;
    }

    public int hashCode() {
        return this.results.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public EmailAvailabilityResponseJson(List<EmailAvailabilityJson> list) {
        C7384Etj.A0Y(list, 0);
        this.results = list;
    }
}
