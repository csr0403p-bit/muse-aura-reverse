package com.facebook.aura.conversation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
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
public final class WidgetStateSetRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long base_version;
    public final String mutation_id;
    public final JsonObject state;
    public final String widget_id;

    public final class Companion {
        public final C9hr<WidgetStateSetRequestJson> serializer() {
            return WidgetStateSetRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ WidgetStateSetRequestJson copy$default(WidgetStateSetRequestJson widgetStateSetRequestJson, String str, JsonObject jsonObject, long j, String str2, int i, Object obj) {
        String str3 = str;
        JsonObject jsonObject2 = jsonObject;
        long j2 = j;
        String str4 = str2;
        if ((i & 1) != 0) {
            str3 = widgetStateSetRequestJson.widget_id;
        }
        if ((i & 2) != 0) {
            jsonObject2 = widgetStateSetRequestJson.state;
        }
        if ((i & 4) != 0) {
            j2 = widgetStateSetRequestJson.base_version;
        }
        if ((i & 8) != 0) {
            str4 = widgetStateSetRequestJson.mutation_id;
        }
        AnonymousClass005.A0y(str3, jsonObject2, str4);
        return new WidgetStateSetRequestJson(str3, jsonObject2, j2, str4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_repo_repo(WidgetStateSetRequestJson widgetStateSetRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(widgetStateSetRequestJson.widget_id, c9iZ, 0);
        c9j5.AAQ(widgetStateSetRequestJson.state, JsonObjectSerializer.A01, c9iZ, 1);
        c9j5.AAN(c9iZ, 2, widgetStateSetRequestJson.base_version);
        c9j5.AAV(widgetStateSetRequestJson.mutation_id, c9iZ, 3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WidgetStateSetRequestJson) {
                WidgetStateSetRequestJson widgetStateSetRequestJson = (WidgetStateSetRequestJson) obj;
                if (!C7384Etj.areEqual(this.widget_id, widgetStateSetRequestJson.widget_id) || !C7384Etj.areEqual(this.state, widgetStateSetRequestJson.state) || this.base_version != widgetStateSetRequestJson.base_version || !C7384Etj.areEqual(this.mutation_id, widgetStateSetRequestJson.mutation_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ WidgetStateSetRequestJson(int i, String str, JsonObject jsonObject, long j, String str2, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(WidgetStateSetRequestJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.widget_id = str;
        this.state = jsonObject;
        this.base_version = j;
        this.mutation_id = str2;
    }

    public final String component1() {
        return this.widget_id;
    }

    public final JsonObject component2() {
        return this.state;
    }

    public final long component3() {
        return this.base_version;
    }

    public final String component4() {
        return this.mutation_id;
    }

    public final long getBase_version() {
        return this.base_version;
    }

    public final String getMutation_id() {
        return this.mutation_id;
    }

    public final JsonObject getState() {
        return this.state;
    }

    public final String getWidget_id() {
        return this.widget_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.mutation_id, C60R.A00(this.base_version, AnonymousClass005.A0F(this.state, AnonymousClass001.A0G(this.widget_id))));
    }

    public final WidgetStateSetRequestJson copy(String str, JsonObject jsonObject, long j, String str2) {
        AnonymousClass005.A0y(str, jsonObject, str2);
        return new WidgetStateSetRequestJson(str, jsonObject, j, str2);
    }

    public String toString() {
        return super.toString();
    }

    public WidgetStateSetRequestJson(String str, JsonObject jsonObject, long j, String str2) {
        AnonymousClass005.A0y(str, jsonObject, str2);
        this.widget_id = str;
        this.state = jsonObject;
        this.base_version = j;
        this.mutation_id = str2;
    }
}
