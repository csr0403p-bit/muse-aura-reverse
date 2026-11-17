package com.facebook.aura.nodes.datasource;

import X.AnonymousClass001;
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

@Serializable
/* loaded from: classes4.dex */
public final class BackfillAckJson extends C06G {
    public static final Companion Companion = new Companion();
    public final ChunkPolicyJson chunk_policy;
    public final String delivery_mode;
    public final String end_date;
    public final int estimated_chunks;
    public final String source;
    public final String start_date;
    public final String status;
    public final String transport;

    public final class Companion {
        public final C9hr<BackfillAckJson> serializer() {
            return BackfillAckJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource(BackfillAckJson backfillAckJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(backfillAckJson.source, c9iZ, 0);
        c9j5.AAV(backfillAckJson.start_date, c9iZ, 1);
        c9j5.AAV(backfillAckJson.end_date, c9iZ, 2);
        c9j5.AAK(c9iZ, 3, backfillAckJson.estimated_chunks);
        c9j5.AAQ(backfillAckJson.chunk_policy, ChunkPolicyJson$$serializer.INSTANCE, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"backfill_initiated".equals(backfillAckJson.status)) {
            c9j5.AAV(backfillAckJson.status, c9iZ, 5);
        }
        if (zAfR || !"chunked_v1".equals(backfillAckJson.delivery_mode)) {
            c9j5.AAV(backfillAckJson.delivery_mode, c9iZ, 6);
        }
        if (zAfR || !"client.data_source.publish".equals(backfillAckJson.transport)) {
            c9j5.AAV(backfillAckJson.transport, c9iZ, 7);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BackfillAckJson) {
                BackfillAckJson backfillAckJson = (BackfillAckJson) obj;
                if (!C7384Etj.areEqual(this.source, backfillAckJson.source) || !C7384Etj.areEqual(this.start_date, backfillAckJson.start_date) || !C7384Etj.areEqual(this.end_date, backfillAckJson.end_date) || this.estimated_chunks != backfillAckJson.estimated_chunks || !C7384Etj.areEqual(this.chunk_policy, backfillAckJson.chunk_policy) || !C7384Etj.areEqual(this.status, backfillAckJson.status) || !C7384Etj.areEqual(this.delivery_mode, backfillAckJson.delivery_mode) || !C7384Etj.areEqual(this.transport, backfillAckJson.transport)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ BackfillAckJson copy$default(BackfillAckJson backfillAckJson, String str, String str2, String str3, int i, ChunkPolicyJson chunkPolicyJson, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = backfillAckJson.source;
        }
        if ((i2 & 2) != 0) {
            str2 = backfillAckJson.start_date;
        }
        if ((i2 & 4) != 0) {
            str3 = backfillAckJson.end_date;
        }
        if ((i2 & 8) != 0) {
            i = backfillAckJson.estimated_chunks;
        }
        if ((i2 & 16) != 0) {
            chunkPolicyJson = backfillAckJson.chunk_policy;
        }
        if ((i2 & 32) != 0) {
            str4 = backfillAckJson.status;
        }
        if ((i2 & 64) != 0) {
            str5 = backfillAckJson.delivery_mode;
        }
        if ((i2 & 128) != 0) {
            str6 = backfillAckJson.transport;
        }
        return backfillAckJson.copy(str, str2, str3, i, chunkPolicyJson, str4, str5, str6);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.start_date;
    }

    public final String component3() {
        return this.end_date;
    }

    public final int component4() {
        return this.estimated_chunks;
    }

    public final ChunkPolicyJson component5() {
        return this.chunk_policy;
    }

    public final String component6() {
        return this.status;
    }

    public final String component7() {
        return this.delivery_mode;
    }

    public final String component8() {
        return this.transport;
    }

    public final ChunkPolicyJson getChunk_policy() {
        return this.chunk_policy;
    }

    public final String getDelivery_mode() {
        return this.delivery_mode;
    }

    public final String getEnd_date() {
        return this.end_date;
    }

    public final int getEstimated_chunks() {
        return this.estimated_chunks;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStart_date() {
        return this.start_date;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getTransport() {
        return this.transport;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.transport, AnonymousClass005.A0I(this.delivery_mode, AnonymousClass005.A0I(this.status, AnonymousClass005.A0F(this.chunk_policy, (AnonymousClass005.A0I(this.end_date, AnonymousClass005.A0I(this.start_date, AnonymousClass001.A0G(this.source))) + this.estimated_chunks) * 31))));
    }

    public BackfillAckJson(String str, String str2, String str3, int i, ChunkPolicyJson chunkPolicyJson, String str4, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(chunkPolicyJson, 4);
        AnonymousClass005.A0z(str4, str5, str6);
        this.source = str;
        this.start_date = str2;
        this.end_date = str3;
        this.estimated_chunks = i;
        this.chunk_policy = chunkPolicyJson;
        this.status = str4;
        this.delivery_mode = str5;
        this.transport = str6;
    }

    public final BackfillAckJson copy(String str, String str2, String str3, int i, ChunkPolicyJson chunkPolicyJson, String str4, String str5, String str6) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(chunkPolicyJson, 4);
        AnonymousClass005.A0z(str4, str5, str6);
        return new BackfillAckJson(str, str2, str3, i, chunkPolicyJson, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ BackfillAckJson(String str, String str2, String str3, int i, ChunkPolicyJson chunkPolicyJson, String str4, String str5, String str6, int i2, C06H c06h) {
        this(str, str2, str3, i, chunkPolicyJson, (i2 & 32) != 0 ? "backfill_initiated" : str4, (i2 & 64) != 0 ? "chunked_v1" : str5, (i2 & 128) != 0 ? "client.data_source.publish" : str6);
    }

    public /* synthetic */ BackfillAckJson(int i, String str, String str2, String str3, int i2, ChunkPolicyJson chunkPolicyJson, String str4, String str5, String str6, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(BackfillAckJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.source = str;
        this.start_date = str2;
        this.end_date = str3;
        this.estimated_chunks = i2;
        this.chunk_policy = chunkPolicyJson;
        this.status = (i & 32) == 0 ? "backfill_initiated" : str4;
        if ((i & 64) == 0) {
            this.delivery_mode = "chunked_v1";
        } else {
            this.delivery_mode = str5;
        }
        if ((i & 128) == 0) {
            this.transport = "client.data_source.publish";
        } else {
            this.transport = str6;
        }
    }
}
