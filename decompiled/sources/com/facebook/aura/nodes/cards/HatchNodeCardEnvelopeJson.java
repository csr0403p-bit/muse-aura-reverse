package com.facebook.aura.nodes.cards;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonObject;

@Serializable
/* loaded from: classes2.dex */
public final class HatchNodeCardEnvelopeJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final JsonObject data;
    public final String type;
    public final int version;

    public final class Companion {
        public final C9hr<HatchNodeCardEnvelopeJson> serializer() {
            return HatchNodeCardEnvelopeJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchNodeCardEnvelopeJson(int i, String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 1);
        this.version = i;
        this.type = str;
        this.data = jsonObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(com.facebook.aura.nodes.cards.HatchNodeCardEnvelopeJson r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r2 = 0
            boolean r3 = r5.AfR()
            r1 = 1
            if (r3 != 0) goto Lc
            int r0 = r4.version
            if (r0 == r1) goto L27
        Lc:
            int r0 = r4.version
            r5.AAK(r6, r2, r0)
            if (r3 == 0) goto L27
        L13:
            java.lang.String r0 = r4.type
            r5.AAV(r0, r6, r1)
        L18:
            r2 = 2
            if (r3 != 0) goto L1f
            kotlinx.serialization.json.JsonObject r0 = r4.data
            if (r0 == 0) goto L26
        L1f:
            kotlinx.serialization.json.JsonObjectSerializer r1 = kotlinx.serialization.json.JsonObjectSerializer.A01
            kotlinx.serialization.json.JsonObject r0 = r4.data
            r5.AAP(r0, r1, r6, r2)
        L26:
            return
        L27:
            java.lang.String r0 = r4.type
            boolean r0 = X.C3cH.A1Q(r0)
            if (r0 != 0) goto L18
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.nodes.cards.HatchNodeCardEnvelopeJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(com.facebook.aura.nodes.cards.HatchNodeCardEnvelopeJson, X.9j5, X.9iZ):void");
    }

    public final HatchNodeCardEnvelopeJson copy(int i, String str, JsonObject jsonObject) {
        C7384Etj.A0Y(str, 1);
        return new HatchNodeCardEnvelopeJson(i, str, jsonObject);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchNodeCardEnvelopeJson) {
                HatchNodeCardEnvelopeJson hatchNodeCardEnvelopeJson = (HatchNodeCardEnvelopeJson) obj;
                if (this.version != hatchNodeCardEnvelopeJson.version || !C7384Etj.areEqual(this.type, hatchNodeCardEnvelopeJson.type) || !C7384Etj.areEqual(this.data, hatchNodeCardEnvelopeJson.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchNodeCardEnvelopeJson copy$default(HatchNodeCardEnvelopeJson hatchNodeCardEnvelopeJson, int i, String str, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hatchNodeCardEnvelopeJson.version;
        }
        if ((i2 & 2) != 0) {
            str = hatchNodeCardEnvelopeJson.type;
        }
        if ((i2 & 4) != 0) {
            jsonObject = hatchNodeCardEnvelopeJson.data;
        }
        return hatchNodeCardEnvelopeJson.copy(i, str, jsonObject);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.type;
    }

    public final JsonObject component3() {
        return this.data;
    }

    public final JsonObject getData() {
        return this.data;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.type, this.version * 31) + AnonymousClass006.A0D(this.data);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchNodeCardEnvelopeJson(int i, int i2, String str, JsonObject jsonObject, C2hx c2hx) {
        this.version = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 4) == 0) {
            this.data = null;
        } else {
            this.data = jsonObject;
        }
    }

    public /* synthetic */ HatchNodeCardEnvelopeJson(int i, String str, JsonObject jsonObject, int i2, C06H c06h) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : jsonObject);
    }

    public HatchNodeCardEnvelopeJson() {
        this(1, "", null);
    }
}
