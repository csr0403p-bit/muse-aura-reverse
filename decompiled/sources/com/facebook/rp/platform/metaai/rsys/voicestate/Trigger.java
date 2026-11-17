package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import X.FGI;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public final class Trigger extends C06G {

    @SerializedName("event")
    public final String event;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Trigger) && C7384Etj.areEqual(this.event, ((Trigger) obj).event));
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trigger.event;
        }
        return new Trigger(str);
    }

    public final String component1() {
        return this.event;
    }

    public final Trigger copy(String str) {
        return new Trigger(str);
    }

    public final String getEvent() {
        return this.event;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.event);
    }

    public String toString() {
        return FGI.A0U("Trigger(event=", this.event, ")");
    }

    public /* synthetic */ Trigger(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public Trigger(String str) {
        this.event = str;
    }

    public Trigger() {
        this(null);
    }
}
