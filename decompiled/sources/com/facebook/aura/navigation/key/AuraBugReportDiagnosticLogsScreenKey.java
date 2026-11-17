package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
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
/* loaded from: classes.dex */
public final class AuraBugReportDiagnosticLogsScreenKey extends C06G implements AuraFullScreenNavKey {
    public static final Companion Companion = new Companion();
    public final String endpoint;
    public final String submissionId;

    public final class Companion {
        public final C9hr<AuraBugReportDiagnosticLogsScreenKey> serializer() {
            return AuraBugReportDiagnosticLogsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraBugReportDiagnosticLogsScreenKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.submissionId = str;
        this.endpoint = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(auraBugReportDiagnosticLogsScreenKey.submissionId, c9iZ, 0);
        if (c9j5.AfR() || auraBugReportDiagnosticLogsScreenKey.endpoint != null) {
            c9j5.AAP(auraBugReportDiagnosticLogsScreenKey.endpoint, C07779iq.A01, c9iZ, 1);
        }
    }

    public final AuraBugReportDiagnosticLogsScreenKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new AuraBugReportDiagnosticLogsScreenKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraBugReportDiagnosticLogsScreenKey) {
                AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey = (AuraBugReportDiagnosticLogsScreenKey) obj;
                if (!C7384Etj.areEqual(this.submissionId, auraBugReportDiagnosticLogsScreenKey.submissionId) || !C7384Etj.areEqual(this.endpoint, auraBugReportDiagnosticLogsScreenKey.endpoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraBugReportDiagnosticLogsScreenKey copy$default(AuraBugReportDiagnosticLogsScreenKey auraBugReportDiagnosticLogsScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraBugReportDiagnosticLogsScreenKey.submissionId;
        }
        if ((i & 2) != 0) {
            str2 = auraBugReportDiagnosticLogsScreenKey.endpoint;
        }
        C7384Etj.A0Y(str, 0);
        return new AuraBugReportDiagnosticLogsScreenKey(str, str2);
    }

    public final String component1() {
        return this.submissionId;
    }

    public final String component2() {
        return this.endpoint;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.submissionId) + AnonymousClass006.A0G(this.endpoint);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraBugReportDiagnosticLogsScreenKey(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }

    public /* synthetic */ AuraBugReportDiagnosticLogsScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AuraBugReportDiagnosticLogsScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.submissionId = str;
        this.endpoint = (i & 2) == 0 ? null : str2;
    }
}
