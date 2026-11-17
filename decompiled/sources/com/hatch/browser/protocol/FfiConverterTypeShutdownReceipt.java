package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeShutdownReceipt implements FfiConverterRustBuffer<ShutdownReceipt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeShutdownReceipt INSTANCE = new FfiConverterTypeShutdownReceipt();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3535allocationSizeI7RO_PI(ShutdownReceipt shutdownReceipt) {
        C7384Etj.A0Y(shutdownReceipt, 0);
        return 2L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ShutdownReceipt read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new ShutdownReceipt(AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ShutdownReceipt lift(RustBuffer.ByValue byValue) {
        return (ShutdownReceipt) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ShutdownReceipt liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ShutdownReceipt) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ShutdownReceipt shutdownReceipt) {
        return lower((Object) shutdownReceipt);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ShutdownReceipt shutdownReceipt) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, shutdownReceipt);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ShutdownReceipt shutdownReceipt, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(shutdownReceipt, byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(shutdownReceipt.closed, byteBuffer);
        ffiConverterBoolean.write(shutdownReceipt.settled, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 2L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ShutdownReceipt, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ShutdownReceipt lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
