package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReceivedItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final ReceivedItemContentJson content;
    public final String item_id;
    public final String title;

    public final class Companion {
        public final C9hr<ReceivedItemJson> serializer() {
            return ReceivedItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ReceivedItemJson receivedItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(receivedItemJson.item_id)) {
            c9j5.AAV(receivedItemJson.item_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(receivedItemJson.title)) {
            c9j5.AAV(receivedItemJson.title, c9iZ, 1);
        }
        if (zAfR || receivedItemJson.content != null) {
            c9j5.AAP(receivedItemJson.content, ReceivedItemContentJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReceivedItemJson) {
                ReceivedItemJson receivedItemJson = (ReceivedItemJson) obj;
                if (!C7384Etj.areEqual(this.item_id, receivedItemJson.item_id) || !C7384Etj.areEqual(this.title, receivedItemJson.title) || !C7384Etj.areEqual(this.content, receivedItemJson.content)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReceivedItemJson copy$default(ReceivedItemJson receivedItemJson, String str, String str2, ReceivedItemContentJson receivedItemContentJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receivedItemJson.item_id;
        }
        if ((i & 2) != 0) {
            str2 = receivedItemJson.title;
        }
        if ((i & 4) != 0) {
            receivedItemContentJson = receivedItemJson.content;
        }
        return receivedItemJson.copy(str, str2, receivedItemContentJson);
    }

    public final String component1() {
        return this.item_id;
    }

    public final String component2() {
        return this.title;
    }

    public final ReceivedItemContentJson component3() {
        return this.content;
    }

    public final ReceivedItemContentJson getContent() {
        return this.content;
    }

    public final String getItem_id() {
        return this.item_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.item_id)) + AnonymousClass006.A0D(this.content);
    }

    public ReceivedItemJson(String str, String str2, ReceivedItemContentJson receivedItemContentJson) {
        AnonymousClass003.A0u(str, str2);
        this.item_id = str;
        this.title = str2;
        this.content = receivedItemContentJson;
    }

    public final ReceivedItemJson copy(String str, String str2, ReceivedItemContentJson receivedItemContentJson) {
        AnonymousClass003.A0u(str, str2);
        return new ReceivedItemJson(str, str2, receivedItemContentJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReceivedItemJson(int i, String str, String str2, ReceivedItemContentJson receivedItemContentJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.item_id = "";
        } else {
            this.item_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.content = null;
        } else {
            this.content = receivedItemContentJson;
        }
    }

    public /* synthetic */ ReceivedItemJson(String str, String str2, ReceivedItemContentJson receivedItemContentJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : receivedItemContentJson);
    }

    public ReceivedItemJson() {
        this("", "", null);
    }
}
