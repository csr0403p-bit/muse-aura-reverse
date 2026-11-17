package com.facebook.aura.messenger.skills.read.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class MessengerReadUnlockResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer attempts_remaining;
    public final String error_code;
    public final Integer login_timeout_remaining_secs;
    public final String message;
    public final boolean success;

    public final class Companion {
        public final C9hr<MessengerReadUnlockResponseJson> serializer() {
            return MessengerReadUnlockResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MessengerReadUnlockResponseJson(boolean z, String str, String str2, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 1);
        this.success = z;
        this.message = str;
        this.error_code = str2;
        this.login_timeout_remaining_secs = num;
        this.attempts_remaining = num2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_messenger_skills_read_repo_repo(MessengerReadUnlockResponseJson messengerReadUnlockResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || messengerReadUnlockResponseJson.success) {
            c9j5.AA7(c9iZ, 0, messengerReadUnlockResponseJson.success);
        }
        if (zAfR || !C3cH.A1Q(messengerReadUnlockResponseJson.message)) {
            c9j5.AAV(messengerReadUnlockResponseJson.message, c9iZ, 1);
        }
        if (zAfR || messengerReadUnlockResponseJson.error_code != null) {
            c9j5.AAP(messengerReadUnlockResponseJson.error_code, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || messengerReadUnlockResponseJson.login_timeout_remaining_secs != null) {
            c9j5.AAP(messengerReadUnlockResponseJson.login_timeout_remaining_secs, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || messengerReadUnlockResponseJson.attempts_remaining != null) {
            c9j5.AAP(messengerReadUnlockResponseJson.attempts_remaining, C07729ii.A00, c9iZ, 4);
        }
    }

    public final MessengerReadUnlockResponseJson copy(boolean z, String str, String str2, Integer num, Integer num2) {
        C7384Etj.A0Y(str, 1);
        return new MessengerReadUnlockResponseJson(z, str, str2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessengerReadUnlockResponseJson) {
                MessengerReadUnlockResponseJson messengerReadUnlockResponseJson = (MessengerReadUnlockResponseJson) obj;
                if (this.success != messengerReadUnlockResponseJson.success || !C7384Etj.areEqual(this.message, messengerReadUnlockResponseJson.message) || !C7384Etj.areEqual(this.error_code, messengerReadUnlockResponseJson.error_code) || !C7384Etj.areEqual(this.login_timeout_remaining_secs, messengerReadUnlockResponseJson.login_timeout_remaining_secs) || !C7384Etj.areEqual(this.attempts_remaining, messengerReadUnlockResponseJson.attempts_remaining)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ MessengerReadUnlockResponseJson copy$default(MessengerReadUnlockResponseJson messengerReadUnlockResponseJson, boolean z, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messengerReadUnlockResponseJson.success;
        }
        if ((i & 2) != 0) {
            str = messengerReadUnlockResponseJson.message;
        }
        if ((i & 4) != 0) {
            str2 = messengerReadUnlockResponseJson.error_code;
        }
        if ((i & 8) != 0) {
            num = messengerReadUnlockResponseJson.login_timeout_remaining_secs;
        }
        if ((i & 16) != 0) {
            num2 = messengerReadUnlockResponseJson.attempts_remaining;
        }
        return messengerReadUnlockResponseJson.copy(z, str, str2, num, num2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.error_code;
    }

    public final Integer component4() {
        return this.login_timeout_remaining_secs;
    }

    public final Integer component5() {
        return this.attempts_remaining;
    }

    public final Integer getAttempts_remaining() {
        return this.attempts_remaining;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final Integer getLogin_timeout_remaining_secs() {
        return this.login_timeout_remaining_secs;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.message, C0KA.A02(this.success)) + AnonymousClass006.A0G(this.error_code)) * 31) + AnonymousClass006.A0D(this.login_timeout_remaining_secs)) * 31) + C3cH.A02(this.attempts_remaining);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ MessengerReadUnlockResponseJson(boolean z, String str, String str2, Integer num, Integer num2, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2);
    }

    public /* synthetic */ MessengerReadUnlockResponseJson(int i, boolean z, String str, String str2, Integer num, Integer num2, C2hx c2hx) {
        this.success = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.message = "";
        } else {
            this.message = str;
        }
        if ((i & 4) == 0) {
            this.error_code = null;
        } else {
            this.error_code = str2;
        }
        if ((i & 8) == 0) {
            this.login_timeout_remaining_secs = null;
        } else {
            this.login_timeout_remaining_secs = num;
        }
        if ((i & 16) == 0) {
            this.attempts_remaining = null;
        } else {
            this.attempts_remaining = num2;
        }
    }

    public MessengerReadUnlockResponseJson() {
        this(false, "", null, null, null);
    }
}
