package com.facebook.aura.pairs;

import X.AnonymousClass005;
import X.C06H;

/* loaded from: classes3.dex */
public final class PairsImageRef {
    public static final int $stable = 0;
    public final boolean isReadable;
    public final PairsImageKind kind;
    public final String museId;
    public final String sha256;

    public /* synthetic */ PairsImageRef(String str, String str2, PairsImageKind pairsImageKind, boolean z, int i, C06H c06h) {
        this(str, str2, pairsImageKind, (i & 8) != 0 ? true : z);
    }

    public final PairsImageKind getKind() {
        return this.kind;
    }

    public final String getMuseId() {
        return this.museId;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public final boolean isReadable() {
        return this.isReadable;
    }

    public PairsImageRef(String str, String str2, PairsImageKind pairsImageKind, boolean z) {
        AnonymousClass005.A0x(str, str2, pairsImageKind);
        this.museId = str;
        this.sha256 = str2;
        this.kind = pairsImageKind;
        this.isReadable = z;
    }
}
