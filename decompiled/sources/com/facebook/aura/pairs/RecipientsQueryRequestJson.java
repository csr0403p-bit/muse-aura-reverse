package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
public final class RecipientsQueryRequestJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String purpose;
    public final String query;
    public final boolean trusted_circle;

    public final class Companion {
        public final C9hr<RecipientsQueryRequestJson> serializer() {
            return RecipientsQueryRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(RecipientsQueryRequestJson recipientsQueryRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(recipientsQueryRequestJson.query, c9iZ, 0);
        c9j5.AA7(c9iZ, 1, recipientsQueryRequestJson.trusted_circle);
        c9j5.AAV(recipientsQueryRequestJson.purpose, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof RecipientsQueryRequestJson) {
                RecipientsQueryRequestJson recipientsQueryRequestJson = (RecipientsQueryRequestJson) obj;
                if (!C7384Etj.areEqual(this.query, recipientsQueryRequestJson.query) || this.trusted_circle != recipientsQueryRequestJson.trusted_circle || !C7384Etj.areEqual(this.purpose, recipientsQueryRequestJson.purpose)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ RecipientsQueryRequestJson copy$default(RecipientsQueryRequestJson recipientsQueryRequestJson, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recipientsQueryRequestJson.query;
        }
        if ((i & 2) != 0) {
            z = recipientsQueryRequestJson.trusted_circle;
        }
        if ((i & 4) != 0) {
            str2 = recipientsQueryRequestJson.purpose;
        }
        return recipientsQueryRequestJson.copy(str, z, str2);
    }

    public final String component1() {
        return this.query;
    }

    public final boolean component2() {
        return this.trusted_circle;
    }

    public final String component3() {
        return this.purpose;
    }

    public final String getPurpose() {
        return this.purpose;
    }

    public final String getQuery() {
        return this.query;
    }

    public final boolean getTrusted_circle() {
        return this.trusted_circle;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.purpose, C0KA.A01(AnonymousClass001.A0G(this.query), this.trusted_circle));
    }

    public RecipientsQueryRequestJson(String str, boolean z, String str2) {
        AnonymousClass003.A0v(str, str2);
        this.query = str;
        this.trusted_circle = z;
        this.purpose = str2;
    }

    public final RecipientsQueryRequestJson copy(String str, boolean z, String str2) {
        AnonymousClass003.A0v(str, str2);
        return new RecipientsQueryRequestJson(str, z, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ RecipientsQueryRequestJson(int i, String str, boolean z, String str2, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(RecipientsQueryRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.query = str;
        this.trusted_circle = z;
        this.purpose = str2;
    }
}
