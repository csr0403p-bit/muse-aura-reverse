package com.facebook.aura.pairs;

import X.AnonymousClass002;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PairsFsWriteResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final long bytes_written;

    public final class Companion {
        public final C9hr<PairsFsWriteResponseJson> serializer() {
            return PairsFsWriteResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pairs_impl_impl(PairsFsWriteResponseJson pairsFsWriteResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || pairsFsWriteResponseJson.bytes_written != 0) {
            c9j5.AAN(c9iZ, 0, pairsFsWriteResponseJson.bytes_written);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PairsFsWriteResponseJson) && this.bytes_written == ((PairsFsWriteResponseJson) obj).bytes_written);
    }

    public static /* synthetic */ PairsFsWriteResponseJson copy$default(PairsFsWriteResponseJson pairsFsWriteResponseJson, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pairsFsWriteResponseJson.bytes_written;
        }
        return new PairsFsWriteResponseJson(j);
    }

    public final long component1() {
        return this.bytes_written;
    }

    public final PairsFsWriteResponseJson copy(long j) {
        return new PairsFsWriteResponseJson(j);
    }

    public final long getBytes_written() {
        return this.bytes_written;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.bytes_written);
    }

    public /* synthetic */ PairsFsWriteResponseJson(int i, long j, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.bytes_written = 0L;
        } else {
            this.bytes_written = j;
        }
    }

    public String toString() {
        return super.toString();
    }

    public PairsFsWriteResponseJson(long j) {
        this.bytes_written = j;
    }

    public /* synthetic */ PairsFsWriteResponseJson(long j, int i, C06H c06h) {
        this((i & 1) != 0 ? 0L : j);
    }

    public PairsFsWriteResponseJson() {
        this(0L);
    }
}
