package com.facebook.aura.network.transport.tigon.internal;

import X.AnonymousClass005;
import java.util.List;

/* loaded from: classes5.dex */
public final class MultipartStreamPlan {
    public final byte[] closingBoundary;
    public final String contentType;
    public final long declaredTotalLength;
    public final List<MultipartSegment> segments;

    /* JADX WARN: Multi-variable type inference failed */
    public MultipartStreamPlan(String str, long j, List<? extends MultipartSegment> list, byte[] bArr) {
        AnonymousClass005.A11(str, list, bArr, 0);
        this.contentType = str;
        this.declaredTotalLength = j;
        this.segments = list;
        this.closingBoundary = bArr;
    }

    public final byte[] getClosingBoundary$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal() {
        return this.closingBoundary;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final long getDeclaredTotalLength() {
        return this.declaredTotalLength;
    }

    public final List<MultipartSegment> getSegments$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal() {
        return this.segments;
    }
}
