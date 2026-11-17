package com.facebook.aura.settings;

import X.AbstractC5321DgF;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChannelTosDisclosureJson extends C06G {
    public static final int $stable = 8;
    public final List<ChannelTosRunJson> footer_runs;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {AbstractC5321DgF.A02(C79.A01, ChannelTosDisclosureJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<ChannelTosDisclosureJson> serializer() {
            return ChannelTosDisclosureJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ChannelTosDisclosureJson copy(List<ChannelTosRunJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ChannelTosDisclosureJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ChannelTosDisclosureJson) && C7384Etj.areEqual(this.footer_runs, ((ChannelTosDisclosureJson) obj).footer_runs));
    }

    public /* synthetic */ ChannelTosDisclosureJson(int i, List list, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ChannelTosDisclosureJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.footer_runs = list;
    }

    public static /* synthetic */ ChannelTosDisclosureJson copy$default(ChannelTosDisclosureJson channelTosDisclosureJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = channelTosDisclosureJson.footer_runs;
        }
        C7384Etj.A0Y(list, 0);
        return new ChannelTosDisclosureJson(list);
    }

    public final List<ChannelTosRunJson> component1() {
        return this.footer_runs;
    }

    public final List<ChannelTosRunJson> getFooter_runs() {
        return this.footer_runs;
    }

    public int hashCode() {
        return this.footer_runs.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ChannelTosDisclosureJson(List<ChannelTosRunJson> list) {
        C7384Etj.A0Y(list, 0);
        this.footer_runs = list;
    }
}
