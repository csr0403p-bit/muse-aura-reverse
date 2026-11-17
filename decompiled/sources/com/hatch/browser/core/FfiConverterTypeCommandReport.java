package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCommandReport implements FfiConverter<CommandReport, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCommandReport INSTANCE = new FfiConverterTypeCommandReport();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(CommandReport commandReport) {
        C7384Etj.A0Y(commandReport, 0);
        return Long.valueOf(commandReport.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3254allocationSizeI7RO_PI(CommandReport commandReport) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ CommandReport lift(Long l) {
        return new CommandReport(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ CommandReport liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CommandReport) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(CommandReport commandReport) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, commandReport);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public CommandReport read(ByteBuffer byteBuffer) {
        return new CommandReport(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(CommandReport commandReport, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(commandReport, byteBuffer);
        byteBuffer.putLong(commandReport.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(CommandReport commandReport) {
        return 8L;
    }

    public CommandReport lift(long j) {
        return new CommandReport(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.CommandReport, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ CommandReport liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(CommandReport commandReport) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, commandReport);
    }
}
