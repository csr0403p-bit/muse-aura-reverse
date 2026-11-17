package com.facebook.aura.navigation.key;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import com.facebook.aura.navigation.AuraLoggedOutNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class LoggedOutLegalWebPageScreenKey extends C06G implements AuraLoggedOutNavKey {
    public static final Companion Companion = new Companion();
    public final String title;
    public final String url;

    public final class Companion {
        public final C9hr<LoggedOutLegalWebPageScreenKey> serializer() {
            return LoggedOutLegalWebPageScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_navigation_key_key(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(loggedOutLegalWebPageScreenKey.url, c9iZ, 0);
        c9j5.AAV(loggedOutLegalWebPageScreenKey.title, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LoggedOutLegalWebPageScreenKey) {
                LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey = (LoggedOutLegalWebPageScreenKey) obj;
                if (!C7384Etj.areEqual(this.url, loggedOutLegalWebPageScreenKey.url) || !C7384Etj.areEqual(this.title, loggedOutLegalWebPageScreenKey.title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LoggedOutLegalWebPageScreenKey copy$default(LoggedOutLegalWebPageScreenKey loggedOutLegalWebPageScreenKey, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loggedOutLegalWebPageScreenKey.url;
        }
        if ((i & 2) != 0) {
            str2 = loggedOutLegalWebPageScreenKey.title;
        }
        AnonymousClass003.A0u(str, str2);
        return new LoggedOutLegalWebPageScreenKey(str, str2);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.title;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.title, AnonymousClass001.A0G(this.url));
    }

    public LoggedOutLegalWebPageScreenKey(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.url = str;
        this.title = str2;
    }

    public final LoggedOutLegalWebPageScreenKey copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new LoggedOutLegalWebPageScreenKey(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LoggedOutLegalWebPageScreenKey(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LoggedOutLegalWebPageScreenKey$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.url = str;
        this.title = str2;
    }
}
