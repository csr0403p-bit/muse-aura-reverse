package com.facebook.aura.navigation.key;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import com.facebook.aura.navigation.AuraLoggedOutNavKey;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LoggedOutInternalSettingsScreenKey extends C06G implements AuraLoggedOutNavKey {
    public final LoggedOutInternalSettingsPage page;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, LoggedOutInternalSettingsScreenKey$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<LoggedOutInternalSettingsScreenKey> serializer() {
            return LoggedOutInternalSettingsScreenKey$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final LoggedOutInternalSettingsScreenKey copy(LoggedOutInternalSettingsPage loggedOutInternalSettingsPage) {
        C7384Etj.A0Y(loggedOutInternalSettingsPage, 0);
        return new LoggedOutInternalSettingsScreenKey(loggedOutInternalSettingsPage);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof LoggedOutInternalSettingsScreenKey) && this.page == ((LoggedOutInternalSettingsScreenKey) obj).page);
    }

    public /* synthetic */ LoggedOutInternalSettingsScreenKey(int i, LoggedOutInternalSettingsPage loggedOutInternalSettingsPage, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(LoggedOutInternalSettingsScreenKey$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.page = loggedOutInternalSettingsPage;
    }

    public static /* synthetic */ LoggedOutInternalSettingsScreenKey copy$default(LoggedOutInternalSettingsScreenKey loggedOutInternalSettingsScreenKey, LoggedOutInternalSettingsPage loggedOutInternalSettingsPage, int i, Object obj) {
        if ((i & 1) != 0) {
            loggedOutInternalSettingsPage = loggedOutInternalSettingsScreenKey.page;
        }
        C7384Etj.A0Y(loggedOutInternalSettingsPage, 0);
        return new LoggedOutInternalSettingsScreenKey(loggedOutInternalSettingsPage);
    }

    public final LoggedOutInternalSettingsPage component1() {
        return this.page;
    }

    public final LoggedOutInternalSettingsPage getPage() {
        return this.page;
    }

    public int hashCode() {
        return this.page.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public LoggedOutInternalSettingsScreenKey(LoggedOutInternalSettingsPage loggedOutInternalSettingsPage) {
        C7384Etj.A0Y(loggedOutInternalSettingsPage, 0);
        this.page = loggedOutInternalSettingsPage;
    }
}
