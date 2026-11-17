package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePendingShutdown implements FfiConverter<PendingShutdown, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePendingShutdown INSTANCE = new FfiConverterTypePendingShutdown();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PendingShutdown pendingShutdown) {
        C7384Etj.A0Y(pendingShutdown, 0);
        return Long.valueOf(pendingShutdown.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3270allocationSizeI7RO_PI(PendingShutdown pendingShutdown) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingShutdown lift(Long l) {
        return new PendingShutdown(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PendingShutdown liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PendingShutdown) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PendingShutdown pendingShutdown) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingShutdown);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PendingShutdown read(ByteBuffer byteBuffer) {
        return new PendingShutdown(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PendingShutdown pendingShutdown, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pendingShutdown, byteBuffer);
        byteBuffer.putLong(pendingShutdown.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PendingShutdown pendingShutdown) {
        return 8L;
    }

    public PendingShutdown lift(long j) {
        return new PendingShutdown(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PendingShutdown, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingShutdown liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PendingShutdown pendingShutdown) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingShutdown);
    }
}
