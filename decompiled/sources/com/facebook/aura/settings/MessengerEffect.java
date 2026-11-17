package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface MessengerEffect {

    public final class LaunchMessenger extends C06G implements MessengerEffect {
        public static final int $stable = 0;
        public final String agentId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof LaunchMessenger) && C7384Etj.areEqual(this.agentId, ((LaunchMessenger) obj).agentId));
        }

        public static /* synthetic */ LaunchMessenger copy$default(LaunchMessenger launchMessenger, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = launchMessenger.agentId;
            }
            return new LaunchMessenger(str);
        }

        public final String component1() {
            return this.agentId;
        }

        public final LaunchMessenger copy(String str) {
            return new LaunchMessenger(str);
        }

        public final String getAgentId() {
            return this.agentId;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.agentId);
        }

        public LaunchMessenger(String str) {
            this.agentId = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class OpenDeeplink extends C06G implements MessengerEffect {
        public static final int $stable = 0;
        public final String uri;

        public OpenDeeplink(String str) {
            C7384Etj.A0Y(str, 0);
            this.uri = str;
        }

        public final OpenDeeplink copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new OpenDeeplink(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof OpenDeeplink) && C7384Etj.areEqual(this.uri, ((OpenDeeplink) obj).uri));
        }

        public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openDeeplink.uri;
            }
            C7384Etj.A0Y(str, 0);
            return new OpenDeeplink(str);
        }

        public final String component1() {
            return this.uri;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class ShowToast extends C06G implements MessengerEffect {
        public static final int $stable = 0;
        public final int messageResId;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof ShowToast) && this.messageResId == ((ShowToast) obj).messageResId);
        }

        public static /* synthetic */ ShowToast copy$default(ShowToast showToast, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = showToast.messageResId;
            }
            return new ShowToast(i);
        }

        public final int component1() {
            return this.messageResId;
        }

        public final ShowToast copy(int i) {
            return new ShowToast(i);
        }

        public final int getMessageResId() {
            return this.messageResId;
        }

        public int hashCode() {
            return this.messageResId;
        }

        public ShowToast(int i) {
            this.messageResId = i;
        }

        public String toString() {
            return super.toString();
        }
    }
}
