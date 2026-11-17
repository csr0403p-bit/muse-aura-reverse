package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class AuraHtmlHostEvent extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;
    public final JsonElement params;
    public final JsonElement payload;
    public final String target;
    public final String type;

    public final class Companion {
        public final C9hr<AuraHtmlHostEvent> serializer() {
            return AuraHtmlHostEvent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraHtmlHostEvent(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2) {
        C7384Etj.A0Y(str, 0);
        this.type = str;
        this.action = str2;
        this.target = str3;
        this.payload = jsonElement;
        this.params = jsonElement2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(AuraHtmlHostEvent auraHtmlHostEvent, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(auraHtmlHostEvent.type, c9iZ, 0);
        boolean zAfR = c9j5.AfR();
        if (zAfR || auraHtmlHostEvent.action != null) {
            c9j5.AAP(auraHtmlHostEvent.action, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || auraHtmlHostEvent.target != null) {
            c9j5.AAP(auraHtmlHostEvent.target, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || auraHtmlHostEvent.payload != null) {
            c9j5.AAP(auraHtmlHostEvent.payload, JsonElementSerializer.A00, c9iZ, 3);
        }
        if (zAfR || auraHtmlHostEvent.params != null) {
            c9j5.AAP(auraHtmlHostEvent.params, JsonElementSerializer.A00, c9iZ, 4);
        }
    }

    public final AuraHtmlHostEvent copy(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2) {
        C7384Etj.A0Y(str, 0);
        return new AuraHtmlHostEvent(str, str2, str3, jsonElement, jsonElement2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraHtmlHostEvent) {
                AuraHtmlHostEvent auraHtmlHostEvent = (AuraHtmlHostEvent) obj;
                if (!C7384Etj.areEqual(this.type, auraHtmlHostEvent.type) || !C7384Etj.areEqual(this.action, auraHtmlHostEvent.action) || !C7384Etj.areEqual(this.target, auraHtmlHostEvent.target) || !C7384Etj.areEqual(this.payload, auraHtmlHostEvent.payload) || !C7384Etj.areEqual(this.params, auraHtmlHostEvent.params)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraHtmlHostEvent copy$default(AuraHtmlHostEvent auraHtmlHostEvent, String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraHtmlHostEvent.type;
        }
        if ((i & 2) != 0) {
            str2 = auraHtmlHostEvent.action;
        }
        if ((i & 4) != 0) {
            str3 = auraHtmlHostEvent.target;
        }
        if ((i & 8) != 0) {
            jsonElement = auraHtmlHostEvent.payload;
        }
        if ((i & 16) != 0) {
            jsonElement2 = auraHtmlHostEvent.params;
        }
        return auraHtmlHostEvent.copy(str, str2, str3, jsonElement, jsonElement2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.action;
    }

    public final String component3() {
        return this.target;
    }

    public final JsonElement component4() {
        return this.payload;
    }

    public final JsonElement component5() {
        return this.params;
    }

    public final String getAction() {
        return this.action;
    }

    public final JsonElement getParams() {
        return this.params;
    }

    public final JsonElement getPayload() {
        return this.payload;
    }

    public final String getTarget() {
        return this.target;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((AnonymousClass001.A0G(this.type) + AnonymousClass006.A0G(this.action)) * 31) + AnonymousClass006.A0G(this.target)) * 31) + AnonymousClass006.A0D(this.payload)) * 31) + C3cH.A02(this.params);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraHtmlHostEvent(String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : jsonElement, (i & 16) != 0 ? null : jsonElement2);
    }

    public /* synthetic */ AuraHtmlHostEvent(int i, String str, String str2, String str3, JsonElement jsonElement, JsonElement jsonElement2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(AuraHtmlHostEvent$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.action = null;
        } else {
            this.action = str2;
        }
        if ((i & 4) == 0) {
            this.target = null;
        } else {
            this.target = str3;
        }
        if ((i & 8) == 0) {
            this.payload = null;
        } else {
            this.payload = jsonElement;
        }
        if ((i & 16) == 0) {
            this.params = null;
        } else {
            this.params = jsonElement2;
        }
    }
}
