package com.facebook.aura.settings.support;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HelpTicketTopicsResponseJson extends C06G {
    public static final int $stable = 8;
    public final List<HelpTicketTopicJson> topics;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, HelpTicketTopicsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<HelpTicketTopicsResponseJson> serializer() {
            return HelpTicketTopicsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HelpTicketTopicsResponseJson copy(List<HelpTicketTopicJson> list) {
        C7384Etj.A0Y(list, 0);
        return new HelpTicketTopicsResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof HelpTicketTopicsResponseJson) && C7384Etj.areEqual(this.topics, ((HelpTicketTopicsResponseJson) obj).topics));
    }

    public /* synthetic */ HelpTicketTopicsResponseJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ HelpTicketTopicsResponseJson copy$default(HelpTicketTopicsResponseJson helpTicketTopicsResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = helpTicketTopicsResponseJson.topics;
        }
        C7384Etj.A0Y(list, 0);
        return new HelpTicketTopicsResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_support_support(HelpTicketTopicsResponseJson helpTicketTopicsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(helpTicketTopicsResponseJson.topics, C0881AGi.A00)) {
            c9j5.AAQ(helpTicketTopicsResponseJson.topics, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<HelpTicketTopicJson> component1() {
        return this.topics;
    }

    public final List<HelpTicketTopicJson> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        return this.topics.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public HelpTicketTopicsResponseJson(List<HelpTicketTopicJson> list) {
        C7384Etj.A0Y(list, 0);
        this.topics = list;
    }

    public /* synthetic */ HelpTicketTopicsResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.topics = C0881AGi.A00;
        } else {
            this.topics = list;
        }
    }

    public HelpTicketTopicsResponseJson() {
        this(C0881AGi.A00);
    }
}
