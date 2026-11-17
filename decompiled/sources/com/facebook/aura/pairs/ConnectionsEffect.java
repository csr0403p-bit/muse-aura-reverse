package com.facebook.aura.pairs;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.sharesheet.HatchShareDestination;

/* loaded from: classes3.dex */
public interface ConnectionsEffect {

    public final class Message implements ConnectionsEffect {
        public static final int $stable = 0;
        public final int res;

        public final int getRes() {
            return this.res;
        }

        public Message(int i) {
            this.res = i;
        }
    }

    public final class Open implements ConnectionsEffect {
        public static final int $stable = 8;
        public final AuraNavKey destination;

        public Open(AuraNavKey auraNavKey) {
            C7384Etj.A0Y(auraNavKey, 0);
            this.destination = auraNavKey;
        }

        public final AuraNavKey getDestination() {
            return this.destination;
        }
    }

    public final class OpenFile implements ConnectionsEffect {
        public static final int $stable = 8;
        public final AuraNavKey fallback;
        public final String mimeType;
        public final String name;
        public final String path;

        public final AuraNavKey getFallback() {
            return this.fallback;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPath() {
            return this.path;
        }

        public OpenFile(String str, String str2, String str3, AuraNavKey auraNavKey) {
            AnonymousClass003.A0u(str, str2);
            this.path = str;
            this.name = str2;
            this.mimeType = str3;
            this.fallback = auraNavKey;
        }
    }

    public final class OpenUrl implements ConnectionsEffect {
        public static final int $stable = 0;
        public final String url;

        public OpenUrl(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    public final class ShareInviteLink implements ConnectionsEffect {
        public static final int $stable = 0;
        public final HatchShareDestination destination;
        public final String url;

        public final HatchShareDestination getDestination() {
            return this.destination;
        }

        public final String getUrl() {
            return this.url;
        }

        public ShareInviteLink(String str, HatchShareDestination hatchShareDestination) {
            AnonymousClass003.A0u(str, hatchShareDestination);
            this.url = str;
            this.destination = hatchShareDestination;
        }
    }

    public final class ShareLink implements ConnectionsEffect {
        public static final int $stable = 0;
        public final String url;

        public ShareLink(String str) {
            C7384Etj.A0Y(str, 0);
            this.url = str;
        }

        public final String getUrl() {
            return this.url;
        }
    }
}
