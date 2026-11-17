package com.facebook.aura.network.transport;

import X.C06H;
import X.C60O;

/* loaded from: classes3.dex */
public final class HatchResponseBodyPolicy {
    public static final Companion Companion = new Companion();
    public static final HatchResponseBodyPolicy DEFAULT = new HatchResponseBodyPolicy(50331648);
    public final long maxBytes;

    public final class Companion {
        public final HatchResponseBodyPolicy getDEFAULT() {
            return HatchResponseBodyPolicy.DEFAULT;
        }

        public final HatchResponseBodyPolicy inMemoryUpTo(long j) {
            if (1 > j || j >= 50331649) {
                throw C60O.A0i("maxBytes must be between 1 and 50331648");
            }
            return new HatchResponseBodyPolicy(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final long getMaxBytes() {
        return this.maxBytes;
    }

    public HatchResponseBodyPolicy(long j) {
        this.maxBytes = j;
    }

    public /* synthetic */ HatchResponseBodyPolicy(long j, C06H c06h) {
        this(j);
    }
}
