package com.facebook.aura.nodes.datasource;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C60Q;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ChunkPolicyJson extends C06G {
    public static final Companion Companion = new Companion();
    public final long chunk_days;
    public final int max_chunk_bytes;
    public final int max_chunks;
    public final long max_total_bytes;
    public final boolean may_bisect;

    public final class Companion {
        public final C9hr<ChunkPolicyJson> serializer() {
            return ChunkPolicyJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_datasource_datasource(ChunkPolicyJson chunkPolicyJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAN(c9iZ, 0, chunkPolicyJson.chunk_days);
        c9j5.AAK(c9iZ, 1, chunkPolicyJson.max_chunk_bytes);
        c9j5.AAK(c9iZ, 2, chunkPolicyJson.max_chunks);
        c9j5.AAN(c9iZ, 3, chunkPolicyJson.max_total_bytes);
        if (c9j5.AfR() || !chunkPolicyJson.may_bisect) {
            c9j5.AA7(c9iZ, 4, chunkPolicyJson.may_bisect);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ChunkPolicyJson) {
                ChunkPolicyJson chunkPolicyJson = (ChunkPolicyJson) obj;
                if (this.chunk_days != chunkPolicyJson.chunk_days || this.max_chunk_bytes != chunkPolicyJson.max_chunk_bytes || this.max_chunks != chunkPolicyJson.max_chunks || this.max_total_bytes != chunkPolicyJson.max_total_bytes || this.may_bisect != chunkPolicyJson.may_bisect) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ ChunkPolicyJson(int i, long j, int i2, int i3, long j2, boolean z, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(ChunkPolicyJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.chunk_days = j;
        this.max_chunk_bytes = i2;
        this.max_chunks = i3;
        this.max_total_bytes = j2;
        this.may_bisect = (i & 16) == 0 ? true : z;
    }

    public static /* synthetic */ ChunkPolicyJson copy$default(ChunkPolicyJson chunkPolicyJson, long j, int i, int i2, long j2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = chunkPolicyJson.chunk_days;
        }
        if ((i3 & 2) != 0) {
            i = chunkPolicyJson.max_chunk_bytes;
        }
        if ((i3 & 4) != 0) {
            i2 = chunkPolicyJson.max_chunks;
        }
        if ((i3 & 8) != 0) {
            j2 = chunkPolicyJson.max_total_bytes;
        }
        if ((i3 & 16) != 0) {
            z = chunkPolicyJson.may_bisect;
        }
        return chunkPolicyJson.copy(j, i, i2, j2, z);
    }

    public final long component1() {
        return this.chunk_days;
    }

    public final int component2() {
        return this.max_chunk_bytes;
    }

    public final int component3() {
        return this.max_chunks;
    }

    public final long component4() {
        return this.max_total_bytes;
    }

    public final boolean component5() {
        return this.may_bisect;
    }

    public final ChunkPolicyJson copy(long j, int i, int i2, long j2, boolean z) {
        return new ChunkPolicyJson(j, i, i2, j2, z);
    }

    public final long getChunk_days() {
        return this.chunk_days;
    }

    public final int getMax_chunk_bytes() {
        return this.max_chunk_bytes;
    }

    public final int getMax_chunks() {
        return this.max_chunks;
    }

    public final long getMax_total_bytes() {
        return this.max_total_bytes;
    }

    public final boolean getMay_bisect() {
        return this.may_bisect;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A06(this.max_total_bytes, (((AnonymousClass005.A07(this.chunk_days) + this.max_chunk_bytes) * 31) + this.max_chunks) * 31), this.may_bisect);
    }

    public String toString() {
        return super.toString();
    }

    public ChunkPolicyJson(long j, int i, int i2, long j2, boolean z) {
        this.chunk_days = j;
        this.max_chunk_bytes = i;
        this.max_chunks = i2;
        this.max_total_bytes = j2;
        this.may_bisect = z;
    }

    public /* synthetic */ ChunkPolicyJson(long j, int i, int i2, long j2, boolean z, int i3, C06H c06h) {
        this(j, i, i2, j2, C60Q.A1Q(i3 & 16, z));
    }
}
