package com.hatch.browser.protocol;

import X.AnonymousClass002;
import X.C06H;
import X.C60O;
import X.HwO;

/* loaded from: classes6.dex */
public final class PageAuthorityRevision {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public long value;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof PageAuthorityRevision) && this.value == ((PageAuthorityRevision) obj).value);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-VKZWuLQ$default, reason: not valid java name */
    public static /* synthetic */ PageAuthorityRevision m3635copyVKZWuLQ$default(PageAuthorityRevision pageAuthorityRevision, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = pageAuthorityRevision.value;
        }
        return new PageAuthorityRevision(j);
    }

    /* renamed from: component1-s-VKNKU, reason: not valid java name */
    public final long m3636component1sVKNKU() {
        return this.value;
    }

    /* renamed from: copy-VKZWuLQ, reason: not valid java name */
    public final PageAuthorityRevision m3637copyVKZWuLQ(long j) {
        return new PageAuthorityRevision(j);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m3638getValuesVKNKU() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass002.A0A(this.value);
    }

    /* renamed from: setValue-VKZWuLQ, reason: not valid java name */
    public final void m3639setValueVKZWuLQ(long j) {
        this.value = j;
    }

    public String toString() {
        return C60O.A0r("PageAuthorityRevision(value=", HwO.A00(this.value));
    }

    public PageAuthorityRevision(long j) {
        this.value = j;
    }

    public /* synthetic */ PageAuthorityRevision(long j, C06H c06h) {
        this(j);
    }
}
