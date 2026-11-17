package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass003;
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
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class UserSpeechRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String call_id;
    public final String state;
    public final String thread_id;

    public final class Companion {
        public final C9hr<UserSpeechRequestJson> serializer() {
            return UserSpeechRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(UserSpeechRequestJson userSpeechRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(userSpeechRequestJson.call_id, c9iZ, 0);
        if (c9j5.AfR() || userSpeechRequestJson.thread_id != null) {
            c9j5.AAP(userSpeechRequestJson.thread_id, C07779iq.A01, c9iZ, 1);
        }
        c9j5.AAV(userSpeechRequestJson.state, c9iZ, 2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserSpeechRequestJson) {
                UserSpeechRequestJson userSpeechRequestJson = (UserSpeechRequestJson) obj;
                if (!C7384Etj.areEqual(this.call_id, userSpeechRequestJson.call_id) || !C7384Etj.areEqual(this.thread_id, userSpeechRequestJson.thread_id) || !C7384Etj.areEqual(this.state, userSpeechRequestJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ UserSpeechRequestJson copy$default(UserSpeechRequestJson userSpeechRequestJson, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSpeechRequestJson.call_id;
        }
        if ((i & 2) != 0) {
            str2 = userSpeechRequestJson.thread_id;
        }
        if ((i & 4) != 0) {
            str3 = userSpeechRequestJson.state;
        }
        return userSpeechRequestJson.copy(str, str2, str3);
    }

    public final String component1() {
        return this.call_id;
    }

    public final String component2() {
        return this.thread_id;
    }

    public final String component3() {
        return this.state;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getState() {
        return this.state;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.state, (AnonymousClass001.A0G(this.call_id) + AnonymousClass006.A0G(this.thread_id)) * 31);
    }

    public UserSpeechRequestJson(String str, String str2, String str3) {
        AnonymousClass003.A0v(str, str3);
        this.call_id = str;
        this.thread_id = str2;
        this.state = str3;
    }

    public final UserSpeechRequestJson copy(String str, String str2, String str3) {
        AnonymousClass003.A0v(str, str3);
        return new UserSpeechRequestJson(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ UserSpeechRequestJson(int i, String str, String str2, String str3, C2hx c2hx) {
        if (5 != (i & 5)) {
            C9iI.A00(UserSpeechRequestJson$$serializer.descriptor, i, 5);
            throw F60.createAndThrow();
        }
        this.call_id = str;
        this.thread_id = C8j4.A0t(i, str2);
        this.state = str3;
    }

    public /* synthetic */ UserSpeechRequestJson(String str, String str2, String str3, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2), str3);
    }
}
