package com.facebook.aura.partners.voice.infra;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EndCallRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String call_ended_at;
    public final String call_id;
    public final String call_started_at;
    public final String thread_id;

    public final class Companion {
        public final C9hr<EndCallRequestJson> serializer() {
            return EndCallRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_infra_infra(EndCallRequestJson endCallRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(endCallRequestJson.call_id, c9iZ, 0);
        c9j5.AAV(endCallRequestJson.call_started_at, c9iZ, 1);
        c9j5.AAV(endCallRequestJson.call_ended_at, c9iZ, 2);
        if (c9j5.AfR() || endCallRequestJson.thread_id != null) {
            c9j5.AAP(endCallRequestJson.thread_id, C07779iq.A01, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EndCallRequestJson) {
                EndCallRequestJson endCallRequestJson = (EndCallRequestJson) obj;
                if (!C7384Etj.areEqual(this.call_id, endCallRequestJson.call_id) || !C7384Etj.areEqual(this.call_started_at, endCallRequestJson.call_started_at) || !C7384Etj.areEqual(this.call_ended_at, endCallRequestJson.call_ended_at) || !C7384Etj.areEqual(this.thread_id, endCallRequestJson.thread_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EndCallRequestJson copy$default(EndCallRequestJson endCallRequestJson, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = endCallRequestJson.call_id;
        }
        if ((i & 2) != 0) {
            str2 = endCallRequestJson.call_started_at;
        }
        if ((i & 4) != 0) {
            str3 = endCallRequestJson.call_ended_at;
        }
        if ((i & 8) != 0) {
            str4 = endCallRequestJson.thread_id;
        }
        AnonymousClass005.A0x(str, str2, str3);
        return new EndCallRequestJson(str, str2, str3, str4);
    }

    public final String component1() {
        return this.call_id;
    }

    public final String component2() {
        return this.call_started_at;
    }

    public final String component3() {
        return this.call_ended_at;
    }

    public final String component4() {
        return this.thread_id;
    }

    public final String getCall_ended_at() {
        return this.call_ended_at;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getCall_started_at() {
        return this.call_started_at;
    }

    public final String getThread_id() {
        return this.thread_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.call_ended_at, AnonymousClass005.A0I(this.call_started_at, AnonymousClass001.A0G(this.call_id))) + AnonymousClass006.A0G(this.thread_id);
    }

    public EndCallRequestJson(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        this.call_id = str;
        this.call_started_at = str2;
        this.call_ended_at = str3;
        this.thread_id = str4;
    }

    public final EndCallRequestJson copy(String str, String str2, String str3, String str4) {
        AnonymousClass005.A0x(str, str2, str3);
        return new EndCallRequestJson(str, str2, str3, str4);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EndCallRequestJson(int i, String str, String str2, String str3, String str4, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(EndCallRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.call_id = str;
        this.call_started_at = str2;
        this.call_ended_at = str3;
        this.thread_id = (i & 8) == 0 ? null : str4;
    }

    public /* synthetic */ EndCallRequestJson(String str, String str2, String str3, String str4, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass006.A0u(i, str4));
    }
}
