package com.facebook.aura.notifications.push.api;

import X.AnonymousClass003;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface PushPresentation {

    public final class Alert implements PushPresentation {
        public final String deepLink;
        public final String key;
        public final String sideChatId;

        public final String getDeepLink() {
            return this.deepLink;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getSideChatId() {
            return this.sideChatId;
        }

        public Alert(String str, String str2, String str3) {
            AnonymousClass003.A0u(str, str2);
            this.key = str;
            this.deepLink = str2;
            this.sideChatId = str3;
        }
    }

    public final class Default implements PushPresentation {
        public static final Default INSTANCE = new Default();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public String toString() {
            return "Default";
        }

        public int hashCode() {
            return 2020703673;
        }
    }

    public final class Retract implements PushPresentation {
        public final String key;

        public Retract(String str) {
            C7384Etj.A0Y(str, 0);
            this.key = str;
        }

        public final String getKey() {
            return this.key;
        }
    }
}
