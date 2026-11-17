package com.facebook.aura.nodes.json;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ClientDataSourcePublishParamsJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Integer chunk_count;
    public final Integer chunk_index;
    public final String event_id;
    public final Boolean is_final;
    public final String occurred_at;
    public final String operation;
    public final String payload_json;
    public final String producer_id;
    public final String reconciliation_id;
    public final String source;

    public final class Companion {
        public final C9hr<ClientDataSourcePublishParamsJson> serializer() {
            return ClientDataSourcePublishParamsJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_json_json(ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(clientDataSourcePublishParamsJson.producer_id, c9iZ, 0);
        c9j5.AAV(clientDataSourcePublishParamsJson.source, c9iZ, 1);
        c9j5.AAV(clientDataSourcePublishParamsJson.operation, c9iZ, 2);
        c9j5.AAV(clientDataSourcePublishParamsJson.payload_json, c9iZ, 3);
        c9j5.AAV(clientDataSourcePublishParamsJson.occurred_at, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || clientDataSourcePublishParamsJson.event_id != null) {
            c9j5.AAP(clientDataSourcePublishParamsJson.event_id, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || clientDataSourcePublishParamsJson.reconciliation_id != null) {
            c9j5.AAP(clientDataSourcePublishParamsJson.reconciliation_id, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || clientDataSourcePublishParamsJson.chunk_index != null) {
            c9j5.AAP(clientDataSourcePublishParamsJson.chunk_index, C07729ii.A00, c9iZ, 7);
        }
        if (zAfR || clientDataSourcePublishParamsJson.is_final != null) {
            c9j5.AAP(clientDataSourcePublishParamsJson.is_final, C07839ix.A00, c9iZ, 8);
        }
        if (zAfR || clientDataSourcePublishParamsJson.chunk_count != null) {
            c9j5.AAP(clientDataSourcePublishParamsJson.chunk_count, C07729ii.A00, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientDataSourcePublishParamsJson) {
                ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson = (ClientDataSourcePublishParamsJson) obj;
                if (!C7384Etj.areEqual(this.producer_id, clientDataSourcePublishParamsJson.producer_id) || !C7384Etj.areEqual(this.source, clientDataSourcePublishParamsJson.source) || !C7384Etj.areEqual(this.operation, clientDataSourcePublishParamsJson.operation) || !C7384Etj.areEqual(this.payload_json, clientDataSourcePublishParamsJson.payload_json) || !C7384Etj.areEqual(this.occurred_at, clientDataSourcePublishParamsJson.occurred_at) || !C7384Etj.areEqual(this.event_id, clientDataSourcePublishParamsJson.event_id) || !C7384Etj.areEqual(this.reconciliation_id, clientDataSourcePublishParamsJson.reconciliation_id) || !C7384Etj.areEqual(this.chunk_index, clientDataSourcePublishParamsJson.chunk_index) || !C7384Etj.areEqual(this.is_final, clientDataSourcePublishParamsJson.is_final) || !C7384Etj.areEqual(this.chunk_count, clientDataSourcePublishParamsJson.chunk_count)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ClientDataSourcePublishParamsJson copy$default(ClientDataSourcePublishParamsJson clientDataSourcePublishParamsJson, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientDataSourcePublishParamsJson.producer_id;
        }
        if ((i & 2) != 0) {
            str2 = clientDataSourcePublishParamsJson.source;
        }
        if ((i & 4) != 0) {
            str3 = clientDataSourcePublishParamsJson.operation;
        }
        if ((i & 8) != 0) {
            str4 = clientDataSourcePublishParamsJson.payload_json;
        }
        if ((i & 16) != 0) {
            str5 = clientDataSourcePublishParamsJson.occurred_at;
        }
        if ((i & 32) != 0) {
            str6 = clientDataSourcePublishParamsJson.event_id;
        }
        if ((i & 64) != 0) {
            str7 = clientDataSourcePublishParamsJson.reconciliation_id;
        }
        if ((i & 128) != 0) {
            num = clientDataSourcePublishParamsJson.chunk_index;
        }
        if ((i & 256) != 0) {
            bool = clientDataSourcePublishParamsJson.is_final;
        }
        if ((i & 512) != 0) {
            num2 = clientDataSourcePublishParamsJson.chunk_count;
        }
        return clientDataSourcePublishParamsJson.copy(str, str2, str3, str4, str5, str6, str7, num, bool, num2);
    }

    public final String component1() {
        return this.producer_id;
    }

    public final Integer component10() {
        return this.chunk_count;
    }

    public final String component2() {
        return this.source;
    }

    public final String component3() {
        return this.operation;
    }

    public final String component4() {
        return this.payload_json;
    }

    public final String component5() {
        return this.occurred_at;
    }

    public final String component6() {
        return this.event_id;
    }

    public final String component7() {
        return this.reconciliation_id;
    }

    public final Integer component8() {
        return this.chunk_index;
    }

    public final Boolean component9() {
        return this.is_final;
    }

    public final Integer getChunk_count() {
        return this.chunk_count;
    }

    public final Integer getChunk_index() {
        return this.chunk_index;
    }

    public final String getEvent_id() {
        return this.event_id;
    }

    public final String getOccurred_at() {
        return this.occurred_at;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final String getPayload_json() {
        return this.payload_json;
    }

    public final String getProducer_id() {
        return this.producer_id;
    }

    public final String getReconciliation_id() {
        return this.reconciliation_id;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.occurred_at, AnonymousClass005.A0I(this.payload_json, AnonymousClass005.A0I(this.operation, AnonymousClass005.A0I(this.source, AnonymousClass001.A0G(this.producer_id))))) + AnonymousClass006.A0G(this.event_id)) * 31) + AnonymousClass006.A0G(this.reconciliation_id)) * 31) + AnonymousClass006.A0D(this.chunk_index)) * 31) + AnonymousClass006.A0D(this.is_final)) * 31) + C3cH.A02(this.chunk_count);
    }

    public final Boolean is_final() {
        return this.is_final;
    }

    public ClientDataSourcePublishParamsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.producer_id = str;
        this.source = str2;
        this.operation = str3;
        this.payload_json = str4;
        this.occurred_at = str5;
        this.event_id = str6;
        this.reconciliation_id = str7;
        this.chunk_index = num;
        this.is_final = bool;
        this.chunk_count = num2;
    }

    public final ClientDataSourcePublishParamsJson copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new ClientDataSourcePublishParamsJson(str, str2, str3, str4, str5, str6, str7, num, bool, num2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ClientDataSourcePublishParamsJson(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2, int i, C06H c06h) {
        this(str, str2, str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : num2);
    }

    public /* synthetic */ ClientDataSourcePublishParamsJson(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Boolean bool, Integer num2, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(ClientDataSourcePublishParamsJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.producer_id = str;
        this.source = str2;
        this.operation = str3;
        this.payload_json = str4;
        this.occurred_at = str5;
        if ((i & 32) == 0) {
            this.event_id = null;
        } else {
            this.event_id = str6;
        }
        if ((i & 64) == 0) {
            this.reconciliation_id = null;
        } else {
            this.reconciliation_id = str7;
        }
        if ((i & 128) == 0) {
            this.chunk_index = null;
        } else {
            this.chunk_index = num;
        }
        if ((i & 256) == 0) {
            this.is_final = null;
        } else {
            this.is_final = bool;
        }
        if ((i & 512) == 0) {
            this.chunk_count = null;
        } else {
            this.chunk_count = num2;
        }
    }
}
