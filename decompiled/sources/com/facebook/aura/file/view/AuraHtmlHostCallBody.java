package com.facebook.aura.file.view;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Serializable
/* loaded from: classes3.dex */
public final class AuraHtmlHostCallBody extends C06G {
    public static final Companion Companion = new Companion();
    public final String action;
    public final JsonObject payload;

    public final class Companion {
        public final C9hr<AuraHtmlHostCallBody> serializer() {
            return AuraHtmlHostCallBody$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_file_view_view(AuraHtmlHostCallBody auraHtmlHostCallBody, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(auraHtmlHostCallBody.action, c9iZ, 0);
        c9j5.AAQ(auraHtmlHostCallBody.payload, JsonObjectSerializer.A01, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraHtmlHostCallBody) {
                AuraHtmlHostCallBody auraHtmlHostCallBody = (AuraHtmlHostCallBody) obj;
                if (!C7384Etj.areEqual(this.action, auraHtmlHostCallBody.action) || !C7384Etj.areEqual(this.payload, auraHtmlHostCallBody.payload)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraHtmlHostCallBody copy$default(AuraHtmlHostCallBody auraHtmlHostCallBody, String str, JsonObject jsonObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = auraHtmlHostCallBody.action;
        }
        if ((i & 2) != 0) {
            jsonObject = auraHtmlHostCallBody.payload;
        }
        AnonymousClass003.A0u(str, jsonObject);
        return new AuraHtmlHostCallBody(str, jsonObject);
    }

    public final String component1() {
        return this.action;
    }

    public final JsonObject component2() {
        return this.payload;
    }

    public final String getAction() {
        return this.action;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payload, AnonymousClass001.A0G(this.action));
    }

    public AuraHtmlHostCallBody(String str, JsonObject jsonObject) {
        AnonymousClass003.A0u(str, jsonObject);
        this.action = str;
        this.payload = jsonObject;
    }

    public final AuraHtmlHostCallBody copy(String str, JsonObject jsonObject) {
        AnonymousClass003.A0u(str, jsonObject);
        return new AuraHtmlHostCallBody(str, jsonObject);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraHtmlHostCallBody(int i, String str, JsonObject jsonObject, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AuraHtmlHostCallBody$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.action = str;
        this.payload = jsonObject;
    }
}
