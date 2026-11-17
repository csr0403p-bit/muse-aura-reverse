package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
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
import com.facebook.aura.navigation.AuraFullScreenNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ActivationBugReportScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String endpoint;
    public final String screenshotUri;
    public final String submissionId;

    public final class Companion {
        public final C9hr<ActivationBugReportScreenKey> serializer() {
            return ActivationBugReportScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ActivationBugReportScreenKey(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        this.submissionId = str;
        this.screenshotUri = str2;
        this.endpoint = str3;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(ActivationBugReportScreenKey activationBugReportScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(activationBugReportScreenKey.submissionId, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || activationBugReportScreenKey.screenshotUri != null) {
            c9j5.AAP(activationBugReportScreenKey.screenshotUri, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || activationBugReportScreenKey.endpoint != null) {
            c9j5.AAP(activationBugReportScreenKey.endpoint, C07779iq.A01, c9iZ, 2);
        }
    }

    public final ActivationBugReportScreenKey copy(String str, String str2, String str3) {
        C7384Etj.A0Y(str, 0);
        return new ActivationBugReportScreenKey(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivationBugReportScreenKey) {
                ActivationBugReportScreenKey activationBugReportScreenKey = (ActivationBugReportScreenKey) obj;
                if (!C7384Etj.areEqual(this.submissionId, activationBugReportScreenKey.submissionId) || !C7384Etj.areEqual(this.screenshotUri, activationBugReportScreenKey.screenshotUri) || !C7384Etj.areEqual(this.endpoint, activationBugReportScreenKey.endpoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ActivationBugReportScreenKey copy$default(ActivationBugReportScreenKey activationBugReportScreenKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activationBugReportScreenKey.submissionId;
        }
        if ((i & 2) != 0) {
            str2 = activationBugReportScreenKey.screenshotUri;
        }
        if ((i & 4) != 0) {
            str3 = activationBugReportScreenKey.endpoint;
        }
        return activationBugReportScreenKey.copy(str, str2, str3);
    }

    public final String component1() {
        return this.submissionId;
    }

    public final String component2() {
        return this.screenshotUri;
    }

    public final String component3() {
        return this.endpoint;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getScreenshotUri() {
        return this.screenshotUri;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.submissionId) + AnonymousClass006.A0G(this.screenshotUri)) * 31) + AnonymousClass005.A0H(this.endpoint);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ActivationBugReportScreenKey(int i, String str, String str2, String str3, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ActivationBugReportScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.submissionId = str;
        if ((i & 2) == 0) {
            this.screenshotUri = null;
        } else {
            this.screenshotUri = str2;
        }
        if ((i & 4) == 0) {
            this.endpoint = null;
        } else {
            this.endpoint = str3;
        }
    }

    public /* synthetic */ ActivationBugReportScreenKey(String str, String str2, String str3, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
