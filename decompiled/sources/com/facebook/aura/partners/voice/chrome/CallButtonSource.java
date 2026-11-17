package com.facebook.aura.partners.voice.chrome;

import X.AnonymousClass003;
import X.C06H;
import X.C1HY;
import com.facebook.aura.header.api.HeaderActionPill;

/* loaded from: classes2.dex */
public final class CallButtonSource {
    public static final int $stable = 8;
    public final boolean inMainChat;
    public final C1HY owner;
    public final HeaderActionPill pill;
    public final long windowSize;

    public final boolean getInMainChat() {
        return this.inMainChat;
    }

    public final C1HY getOwner() {
        return this.owner;
    }

    public final HeaderActionPill getPill() {
        return this.pill;
    }

    /* renamed from: getWindowSize-YbymL2g, reason: not valid java name */
    public final long m1687getWindowSizeYbymL2g() {
        return this.windowSize;
    }

    public CallButtonSource(HeaderActionPill headerActionPill, C1HY c1hy, long j, boolean z) {
        AnonymousClass003.A0u(headerActionPill, c1hy);
        this.pill = headerActionPill;
        this.owner = c1hy;
        this.windowSize = j;
        this.inMainChat = z;
    }

    public /* synthetic */ CallButtonSource(HeaderActionPill headerActionPill, C1HY c1hy, long j, boolean z, C06H c06h) {
        this(headerActionPill, c1hy, j, z);
    }
}
