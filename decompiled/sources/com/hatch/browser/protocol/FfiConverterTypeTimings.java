package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTimings implements FfiConverterRustBuffer<Timings> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTimings INSTANCE = new FfiConverterTypeTimings();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3550allocationSizeI7RO_PI(Timings timings) {
        C7384Etj.A0Y(timings, 0);
        return 12L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Timings lift(RustBuffer.ByValue byValue) {
        return (Timings) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Timings liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Timings) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Timings timings) {
        return lower((Object) timings);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Timings timings) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, timings);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Timings read(ByteBuffer byteBuffer) {
        return new Timings(AbstractC7609F5w.A0H(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Timings timings, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(timings, byteBuffer);
        byteBuffer.putInt(timings.queuedMs);
        byteBuffer.putInt(timings.executionMs);
        byteBuffer.putInt(timings.observationMs);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 12L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Timings, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Timings lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
