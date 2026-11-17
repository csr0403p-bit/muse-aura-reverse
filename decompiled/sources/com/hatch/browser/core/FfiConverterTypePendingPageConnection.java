package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePendingPageConnection implements FfiConverter<PendingPageConnection, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePendingPageConnection INSTANCE = new FfiConverterTypePendingPageConnection();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PendingPageConnection pendingPageConnection) {
        C7384Etj.A0Y(pendingPageConnection, 0);
        return Long.valueOf(pendingPageConnection.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3269allocationSizeI7RO_PI(PendingPageConnection pendingPageConnection) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingPageConnection lift(Long l) {
        return new PendingPageConnection(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PendingPageConnection liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PendingPageConnection) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PendingPageConnection pendingPageConnection) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingPageConnection);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PendingPageConnection read(ByteBuffer byteBuffer) {
        return new PendingPageConnection(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PendingPageConnection pendingPageConnection, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pendingPageConnection, byteBuffer);
        byteBuffer.putLong(pendingPageConnection.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PendingPageConnection pendingPageConnection) {
        return 8L;
    }

    public PendingPageConnection lift(long j) {
        return new PendingPageConnection(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PendingPageConnection, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingPageConnection liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PendingPageConnection pendingPageConnection) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingPageConnection);
    }
}
