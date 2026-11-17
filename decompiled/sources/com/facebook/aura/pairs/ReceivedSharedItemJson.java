package com.facebook.aura.pairs;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ReceivedSharedItemJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String connection_id;
    public final ReceivedItemJson item;
    public final long received_at_ms;
    public final String sender_muse;
    public final String share_id;

    public final class Companion {
        public final C9hr<ReceivedSharedItemJson> serializer() {
            return ReceivedSharedItemJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(ReceivedSharedItemJson receivedSharedItemJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(receivedSharedItemJson.share_id)) {
            c9j5.AAV(receivedSharedItemJson.share_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(receivedSharedItemJson.connection_id)) {
            c9j5.AAV(receivedSharedItemJson.connection_id, c9iZ, 1);
        }
        if (zAfR || !"".equals(receivedSharedItemJson.sender_muse)) {
            c9j5.AAV(receivedSharedItemJson.sender_muse, c9iZ, 2);
        }
        if (zAfR || receivedSharedItemJson.received_at_ms != 0) {
            c9j5.AAN(c9iZ, 3, receivedSharedItemJson.received_at_ms);
        }
        if (zAfR || receivedSharedItemJson.item != null) {
            c9j5.AAP(receivedSharedItemJson.item, ReceivedItemJson$$serializer.INSTANCE, c9iZ, 4);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReceivedSharedItemJson) {
                ReceivedSharedItemJson receivedSharedItemJson = (ReceivedSharedItemJson) obj;
                if (!C7384Etj.areEqual(this.share_id, receivedSharedItemJson.share_id) || !C7384Etj.areEqual(this.connection_id, receivedSharedItemJson.connection_id) || !C7384Etj.areEqual(this.sender_muse, receivedSharedItemJson.sender_muse) || this.received_at_ms != receivedSharedItemJson.received_at_ms || !C7384Etj.areEqual(this.item, receivedSharedItemJson.item)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ReceivedSharedItemJson copy$default(ReceivedSharedItemJson receivedSharedItemJson, String str, String str2, String str3, long j, ReceivedItemJson receivedItemJson, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receivedSharedItemJson.share_id;
        }
        if ((i & 2) != 0) {
            str2 = receivedSharedItemJson.connection_id;
        }
        if ((i & 4) != 0) {
            str3 = receivedSharedItemJson.sender_muse;
        }
        if ((i & 8) != 0) {
            j = receivedSharedItemJson.received_at_ms;
        }
        if ((i & 16) != 0) {
            receivedItemJson = receivedSharedItemJson.item;
        }
        return receivedSharedItemJson.copy(str, str2, str3, j, receivedItemJson);
    }

    public final String component1() {
        return this.share_id;
    }

    public final String component2() {
        return this.connection_id;
    }

    public final String component3() {
        return this.sender_muse;
    }

    public final long component4() {
        return this.received_at_ms;
    }

    public final ReceivedItemJson component5() {
        return this.item;
    }

    public final String getConnection_id() {
        return this.connection_id;
    }

    public final ReceivedItemJson getItem() {
        return this.item;
    }

    public final long getReceived_at_ms() {
        return this.received_at_ms;
    }

    public final String getSender_muse() {
        return this.sender_muse;
    }

    public final String getShare_id() {
        return this.share_id;
    }

    public int hashCode() {
        return C60R.A00(this.received_at_ms, AnonymousClass005.A0I(this.sender_muse, AnonymousClass005.A0I(this.connection_id, AnonymousClass001.A0G(this.share_id)))) + AnonymousClass006.A0D(this.item);
    }

    public ReceivedSharedItemJson(String str, String str2, String str3, long j, ReceivedItemJson receivedItemJson) {
        AnonymousClass005.A0x(str, str2, str3);
        this.share_id = str;
        this.connection_id = str2;
        this.sender_muse = str3;
        this.received_at_ms = j;
        this.item = receivedItemJson;
    }

    public final ReceivedSharedItemJson copy(String str, String str2, String str3, long j, ReceivedItemJson receivedItemJson) {
        AnonymousClass005.A0x(str, str2, str3);
        return new ReceivedSharedItemJson(str, str2, str3, j, receivedItemJson);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ReceivedSharedItemJson(String str, String str2, String str3, long j, ReceivedItemJson receivedItemJson, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : receivedItemJson);
    }

    public /* synthetic */ ReceivedSharedItemJson(int i, String str, String str2, String str3, long j, ReceivedItemJson receivedItemJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.share_id = "";
        } else {
            this.share_id = str;
        }
        if ((i & 2) == 0) {
            this.connection_id = "";
        } else {
            this.connection_id = str2;
        }
        if ((i & 4) == 0) {
            this.sender_muse = "";
        } else {
            this.sender_muse = str3;
        }
        if ((i & 8) == 0) {
            this.received_at_ms = 0L;
        } else {
            this.received_at_ms = j;
        }
        if ((i & 16) == 0) {
            this.item = null;
        } else {
            this.item = receivedItemJson;
        }
    }

    public ReceivedSharedItemJson() {
        this("", "", "", 0L, null);
    }
}
