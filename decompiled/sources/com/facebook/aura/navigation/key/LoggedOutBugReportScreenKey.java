package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraLoggedOutNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LoggedOutBugReportScreenKey extends C06G implements AuraLoggedOutNavKey {
    public static final Companion Companion = new Companion();
    public final String screenshotUri;
    public final String submissionId;

    public final class Companion {
        public final C9hr<LoggedOutBugReportScreenKey> serializer() {
            return LoggedOutBugReportScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LoggedOutBugReportScreenKey(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.submissionId = str;
        this.screenshotUri = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(loggedOutBugReportScreenKey.submissionId, c9iZ, 0);
        if (c9j5.AfR() || loggedOutBugReportScreenKey.screenshotUri != null) {
            c9j5.AAP(loggedOutBugReportScreenKey.screenshotUri, C07779iq.A01, c9iZ, 1);
        }
    }

    public final LoggedOutBugReportScreenKey copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new LoggedOutBugReportScreenKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggedOutBugReportScreenKey) {
                LoggedOutBugReportScreenKey loggedOutBugReportScreenKey = (LoggedOutBugReportScreenKey) obj;
                if (!C7384Etj.areEqual(this.submissionId, loggedOutBugReportScreenKey.submissionId) || !C7384Etj.areEqual(this.screenshotUri, loggedOutBugReportScreenKey.screenshotUri)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LoggedOutBugReportScreenKey copy$default(LoggedOutBugReportScreenKey loggedOutBugReportScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggedOutBugReportScreenKey.submissionId;
        }
        if ((i & 2) != 0) {
            str2 = loggedOutBugReportScreenKey.screenshotUri;
        }
        C7384Etj.A0Y(str, 0);
        return new LoggedOutBugReportScreenKey(str, str2);
    }

    public final String component1() {
        return this.submissionId;
    }

    public final String component2() {
        return this.screenshotUri;
    }

    public final String getScreenshotUri() {
        return this.screenshotUri;
    }

    public final String getSubmissionId() {
        return this.submissionId;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.submissionId) + AnonymousClass006.A0G(this.screenshotUri);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LoggedOutBugReportScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LoggedOutBugReportScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.submissionId = str;
        this.screenshotUri = C8j4.A0t(i, str2);
    }

    public /* synthetic */ LoggedOutBugReportScreenKey(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
