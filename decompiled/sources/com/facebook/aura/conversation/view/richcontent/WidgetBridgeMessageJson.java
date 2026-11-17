package com.facebook.aura.conversation.view.richcontent;

import X.AGH;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07799it;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class WidgetBridgeMessageJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final String action;
    public final Double height;
    public final JsonElement state;
    public final String type;

    public final class Companion {
        public final C9hr<WidgetBridgeMessageJson> serializer() {
            return WidgetBridgeMessageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_conversation_view_richcontent_richcontent(WidgetBridgeMessageJson widgetBridgeMessageJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(widgetBridgeMessageJson.type)) {
            c9j5.AAV(widgetBridgeMessageJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(widgetBridgeMessageJson.action)) {
            c9j5.AAV(widgetBridgeMessageJson.action, c9iZ, 1);
        }
        if (zAfR || !C7384Etj.areEqual(widgetBridgeMessageJson.state, new JsonObject(AGH.A0E()))) {
            c9j5.AAQ(widgetBridgeMessageJson.state, JsonElementSerializer.A00, c9iZ, 2);
        }
        if (zAfR || widgetBridgeMessageJson.height != null) {
            c9j5.AAP(widgetBridgeMessageJson.height, C07799it.A00, c9iZ, 3);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof WidgetBridgeMessageJson) {
                WidgetBridgeMessageJson widgetBridgeMessageJson = (WidgetBridgeMessageJson) obj;
                if (!C7384Etj.areEqual(this.type, widgetBridgeMessageJson.type) || !C7384Etj.areEqual(this.action, widgetBridgeMessageJson.action) || !C7384Etj.areEqual(this.state, widgetBridgeMessageJson.state) || !C7384Etj.areEqual(this.height, widgetBridgeMessageJson.height)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ WidgetBridgeMessageJson copy$default(WidgetBridgeMessageJson widgetBridgeMessageJson, String str, String str2, JsonElement jsonElement, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetBridgeMessageJson.type;
        }
        if ((i & 2) != 0) {
            str2 = widgetBridgeMessageJson.action;
        }
        if ((i & 4) != 0) {
            jsonElement = widgetBridgeMessageJson.state;
        }
        if ((i & 8) != 0) {
            d = widgetBridgeMessageJson.height;
        }
        AnonymousClass005.A0x(str, str2, jsonElement);
        return new WidgetBridgeMessageJson(str, str2, jsonElement, d);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.action;
    }

    public final JsonElement component3() {
        return this.state;
    }

    public final Double component4() {
        return this.height;
    }

    public final String getAction() {
        return this.action;
    }

    public final Double getHeight() {
        return this.height;
    }

    public final JsonElement getState() {
        return this.state;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.state, AnonymousClass005.A0I(this.action, AnonymousClass001.A0G(this.type))) + AnonymousClass006.A0D(this.height);
    }

    public WidgetBridgeMessageJson(String str, String str2, JsonElement jsonElement, Double d) {
        AnonymousClass005.A0x(str, str2, jsonElement);
        this.type = str;
        this.action = str2;
        this.state = jsonElement;
        this.height = d;
    }

    public final WidgetBridgeMessageJson copy(String str, String str2, JsonElement jsonElement, Double d) {
        AnonymousClass005.A0x(str, str2, jsonElement);
        return new WidgetBridgeMessageJson(str, str2, jsonElement, d);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ WidgetBridgeMessageJson(int i, String str, String str2, JsonElement jsonElement, Double d, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.action = "";
        } else {
            this.action = str2;
        }
        if ((i & 4) == 0) {
            this.state = new JsonObject(AGH.A0E());
        } else {
            this.state = jsonElement;
        }
        if ((i & 8) == 0) {
            this.height = null;
        } else {
            this.height = d;
        }
    }

    public /* synthetic */ WidgetBridgeMessageJson(String str, String str2, JsonElement jsonElement, Double d, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new JsonObject(AGH.A0E()) : jsonElement, (i & 8) != 0 ? null : d);
    }

    public WidgetBridgeMessageJson() {
        this("", "", new JsonObject(AGH.A0E()), null);
    }
}
