package com.facebook.aura.notifications.push;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface AuraCvmPushDecryptResult {

    public final class Failure extends C06G implements AuraCvmPushDecryptResult {
        public final String reason;

        public Failure(String str) {
            C7384Etj.A0Y(str, 0);
            this.reason = str;
        }

        public final Failure copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Failure(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Failure) && C7384Etj.areEqual(this.reason, ((Failure) obj).reason));
        }

        public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failure.reason;
            }
            C7384Etj.A0Y(str, 0);
            return new Failure(str);
        }

        public final String component1() {
            return this.reason;
        }

        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Success extends C06G implements AuraCvmPushDecryptResult {
        public final AuraPushNotificationData data;
        public final String notificationId;
        public final long replayExpiresAtMs;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Success) {
                    Success success = (Success) obj;
                    if (!C7384Etj.areEqual(this.data, success.data) || !C7384Etj.areEqual(this.notificationId, success.notificationId) || this.replayExpiresAtMs != success.replayExpiresAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Success copy$default(Success success, AuraPushNotificationData auraPushNotificationData, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                auraPushNotificationData = success.data;
            }
            if ((i & 2) != 0) {
                str = success.notificationId;
            }
            if ((i & 4) != 0) {
                j = success.replayExpiresAtMs;
            }
            return success.copy(auraPushNotificationData, str, j);
        }

        public final AuraPushNotificationData component1() {
            return this.data;
        }

        public final String component2() {
            return this.notificationId;
        }

        public final long component3() {
            return this.replayExpiresAtMs;
        }

        public final AuraPushNotificationData getData() {
            return this.data;
        }

        public final String getNotificationId() {
            return this.notificationId;
        }

        public final long getReplayExpiresAtMs() {
            return this.replayExpiresAtMs;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.replayExpiresAtMs, AnonymousClass005.A0I(this.notificationId, AnonymousClass005.A0E(this.data)));
        }

        public Success(AuraPushNotificationData auraPushNotificationData, String str, long j) {
            AnonymousClass003.A0u(auraPushNotificationData, str);
            this.data = auraPushNotificationData;
            this.notificationId = str;
            this.replayExpiresAtMs = j;
        }

        public final Success copy(AuraPushNotificationData auraPushNotificationData, String str, long j) {
            AnonymousClass003.A0u(auraPushNotificationData, str);
            return new Success(auraPushNotificationData, str, j);
        }

        public String toString() {
            return super.toString();
        }
    }
}
