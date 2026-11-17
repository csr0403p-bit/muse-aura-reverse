package com.facebook.aura.email.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class EmailAvailabilityJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String email_address;
    public final String normalized_handle;
    public final String requested_handle;
    public final String status;

    public final class Companion {
        public final C9hr<EmailAvailabilityJson> serializer() {
            return EmailAvailabilityJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailAvailabilityJson emailAvailabilityJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(emailAvailabilityJson.requested_handle, c9iZ, 0);
        c9j5.AAV(emailAvailabilityJson.status, c9iZ, 1);
        boolean zAfR = c9j5.AfR();
        if (zAfR || emailAvailabilityJson.normalized_handle != null) {
            c9j5.AAP(emailAvailabilityJson.normalized_handle, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || emailAvailabilityJson.email_address != null) {
            c9j5.AAP(emailAvailabilityJson.email_address, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailAvailabilityJson) {
                EmailAvailabilityJson emailAvailabilityJson = (EmailAvailabilityJson) obj;
                if (!C7384Etj.areEqual(this.requested_handle, emailAvailabilityJson.requested_handle) || !C7384Etj.areEqual(this.status, emailAvailabilityJson.status) || !C7384Etj.areEqual(this.normalized_handle, emailAvailabilityJson.normalized_handle) || !C7384Etj.areEqual(this.email_address, emailAvailabilityJson.email_address)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailAvailabilityJson copy$default(EmailAvailabilityJson emailAvailabilityJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailAvailabilityJson.requested_handle;
        }
        if ((i & 2) != 0) {
            str2 = emailAvailabilityJson.status;
        }
        if ((i & 4) != 0) {
            str3 = emailAvailabilityJson.normalized_handle;
        }
        if ((i & 8) != 0) {
            str4 = emailAvailabilityJson.email_address;
        }
        AnonymousClass003.A0u(str, str2);
        return new EmailAvailabilityJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.requested_handle;
    }

    public final String component2() {
        return this.status;
    }

    public final String component3() {
        return this.normalized_handle;
    }

    public final String component4() {
        return this.email_address;
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getNormalized_handle() {
        return this.normalized_handle;
    }

    public final String getRequested_handle() {
        return this.requested_handle;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0I(this.status, AnonymousClass001.A0G(this.requested_handle)) + AnonymousClass006.A0G(this.normalized_handle)) * 31) + AnonymousClass005.A0H(this.email_address);
    }

    public EmailAvailabilityJson(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        this.requested_handle = str;
        this.status = str2;
        this.normalized_handle = str3;
        this.email_address = str4;
    }

    public final EmailAvailabilityJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass003.A0u(str, str2);
        return new EmailAvailabilityJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailAvailabilityJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public /* synthetic */ EmailAvailabilityJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EmailAvailabilityJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.requested_handle = str;
        this.status = str2;
        if ((i & 4) == 0) {
            this.normalized_handle = null;
        } else {
            this.normalized_handle = str3;
        }
        if ((i & 8) == 0) {
            this.email_address = null;
        } else {
            this.email_address = str4;
        }
    }
}
