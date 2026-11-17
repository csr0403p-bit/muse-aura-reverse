package com.facebook.aura.skills.connect.repository;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface SkillConnectAction {

    public final class ApiKey implements SkillConnectAction {
        public static final ApiKey INSTANCE = new ApiKey();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ApiKey);
        }

        public String toString() {
            return "ApiKey";
        }

        public int hashCode() {
            return 1445829312;
        }
    }

    public final class ConsentOnly implements SkillConnectAction {
        public static final ConsentOnly INSTANCE = new ConsentOnly();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConsentOnly);
        }

        public String toString() {
            return "ConsentOnly";
        }

        public int hashCode() {
            return -642962709;
        }
    }

    public final class FoaAuth implements SkillConnectAction {
        public static final FoaAuth INSTANCE = new FoaAuth();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof FoaAuth);
        }

        public String toString() {
            return "FoaAuth";
        }

        public int hashCode() {
            return 1977286917;
        }
    }

    public final class Messenger implements SkillConnectAction {
        public static final Messenger INSTANCE = new Messenger();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Messenger);
        }

        public String toString() {
            return "Messenger";
        }

        public int hashCode() {
            return 1993370712;
        }
    }

    public final class None implements SkillConnectAction {
        public static final None INSTANCE = new None();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public String toString() {
            return "None";
        }

        public int hashCode() {
            return 337086163;
        }
    }

    public final class OAuth extends C06G implements SkillConnectAction {
        public final String url;

        public OAuth(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final OAuth copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OAuth(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OAuth) && C7384Etj.areEqual(this.url, ((OAuth) obj).url));
        }

        public static /* synthetic */ OAuth copy$default(OAuth oAuth, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = oAuth.url;
            }
            C7384Etj.A0Y(str, 0);
            return new OAuth(str);
        }

        public final String component1() {
            return this.url;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WhatsApp implements SkillConnectAction {
        public static final WhatsApp INSTANCE = new WhatsApp();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof WhatsApp);
        }

        public String toString() {
            return "WhatsApp";
        }

        public int hashCode() {
            return -1141210227;
        }
    }
}
