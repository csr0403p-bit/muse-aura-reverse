package com.facebook.aura.shopping.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ShoppingEventResponseJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String channel;
    public final Boolean is_thread;
    public final String product_id;
    public final String session_id;
    public final String stream_owner_message_id;
    public final String type;

    public final class Companion {
        public final C9hr<ShoppingEventResponseJson> serializer() {
            return ShoppingEventResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ShoppingEventResponseJson() {
        this("", "", null, null, null, null);
    }

    public static /* synthetic */ ShoppingEventResponseJson copy$default(ShoppingEventResponseJson shoppingEventResponseJson, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        Boolean bool2 = bool;
        if ((i & 1) != 0) {
            str6 = shoppingEventResponseJson.type;
        }
        if ((i & 2) != 0) {
            str7 = shoppingEventResponseJson.product_id;
        }
        if ((i & 4) != 0) {
            str8 = shoppingEventResponseJson.stream_owner_message_id;
        }
        if ((i & 8) != 0) {
            str9 = shoppingEventResponseJson.channel;
        }
        if ((i & 16) != 0) {
            str10 = shoppingEventResponseJson.session_id;
        }
        if ((i & 32) != 0) {
            bool2 = shoppingEventResponseJson.is_thread;
        }
        AnonymousClass003.A0u(str6, str7);
        return new ShoppingEventResponseJson(str6, str7, str8, str9, str10, bool2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_repo_repo(ShoppingEventResponseJson shoppingEventResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(shoppingEventResponseJson.type)) {
            c9j5.AAV(shoppingEventResponseJson.type, c9iZ, 0);
        }
        if (zAfR || !"".equals(shoppingEventResponseJson.product_id)) {
            c9j5.AAV(shoppingEventResponseJson.product_id, c9iZ, 1);
        }
        if (zAfR || shoppingEventResponseJson.stream_owner_message_id != null) {
            c9j5.AAP(shoppingEventResponseJson.stream_owner_message_id, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || shoppingEventResponseJson.channel != null) {
            c9j5.AAP(shoppingEventResponseJson.channel, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || shoppingEventResponseJson.session_id != null) {
            c9j5.AAP(shoppingEventResponseJson.session_id, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || shoppingEventResponseJson.is_thread != null) {
            c9j5.AAP(shoppingEventResponseJson.is_thread, C07839ix.A00, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingEventResponseJson) {
                ShoppingEventResponseJson shoppingEventResponseJson = (ShoppingEventResponseJson) obj;
                if (!C7384Etj.areEqual(this.type, shoppingEventResponseJson.type) || !C7384Etj.areEqual(this.product_id, shoppingEventResponseJson.product_id) || !C7384Etj.areEqual(this.stream_owner_message_id, shoppingEventResponseJson.stream_owner_message_id) || !C7384Etj.areEqual(this.channel, shoppingEventResponseJson.channel) || !C7384Etj.areEqual(this.session_id, shoppingEventResponseJson.session_id) || !C7384Etj.areEqual(this.is_thread, shoppingEventResponseJson.is_thread)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.product_id;
    }

    public final String component3() {
        return this.stream_owner_message_id;
    }

    public final String component4() {
        return this.channel;
    }

    public final String component5() {
        return this.session_id;
    }

    public final Boolean component6() {
        return this.is_thread;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getProduct_id() {
        return this.product_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final String getStream_owner_message_id() {
        return this.stream_owner_message_id;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((AnonymousClass005.A0I(this.product_id, AnonymousClass001.A0G(this.type)) + AnonymousClass006.A0G(this.stream_owner_message_id)) * 31) + AnonymousClass006.A0G(this.channel)) * 31) + AnonymousClass006.A0G(this.session_id)) * 31) + C3cH.A02(this.is_thread);
    }

    public final Boolean is_thread() {
        return this.is_thread;
    }

    public final ShoppingEventResponseJson copy(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        return new ShoppingEventResponseJson(str, str2, str3, str4, str5, bool);
    }

    public String toString() {
        return super.toString();
    }

    public ShoppingEventResponseJson(String str, String str2, String str3, String str4, String str5, Boolean bool) {
        AnonymousClass003.A0u(str, str2);
        this.type = str;
        this.product_id = str2;
        this.stream_owner_message_id = str3;
        this.channel = str4;
        this.session_id = str5;
        this.is_thread = bool;
    }

    public /* synthetic */ ShoppingEventResponseJson(String str, String str2, String str3, String str4, String str5, Boolean bool, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : bool);
    }

    public /* synthetic */ ShoppingEventResponseJson(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.product_id = "";
        } else {
            this.product_id = str2;
        }
        if ((i & 4) == 0) {
            this.stream_owner_message_id = null;
        } else {
            this.stream_owner_message_id = str3;
        }
        if ((i & 8) == 0) {
            this.channel = null;
        } else {
            this.channel = str4;
        }
        if ((i & 16) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str5;
        }
        if ((i & 32) == 0) {
            this.is_thread = null;
        } else {
            this.is_thread = bool;
        }
    }
}
