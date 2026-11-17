package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePendingCommand implements FfiConverter<PendingCommand, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePendingCommand INSTANCE = new FfiConverterTypePendingCommand();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PendingCommand pendingCommand) {
        C7384Etj.A0Y(pendingCommand, 0);
        return Long.valueOf(pendingCommand.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3268allocationSizeI7RO_PI(PendingCommand pendingCommand) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingCommand lift(Long l) {
        return new PendingCommand(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PendingCommand liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PendingCommand) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PendingCommand pendingCommand) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingCommand);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PendingCommand read(ByteBuffer byteBuffer) {
        return new PendingCommand(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PendingCommand pendingCommand, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pendingCommand, byteBuffer);
        byteBuffer.putLong(pendingCommand.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PendingCommand pendingCommand) {
        return 8L;
    }

    public PendingCommand lift(long j) {
        return new PendingCommand(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PendingCommand, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PendingCommand liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PendingCommand pendingCommand) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pendingCommand);
    }
}
