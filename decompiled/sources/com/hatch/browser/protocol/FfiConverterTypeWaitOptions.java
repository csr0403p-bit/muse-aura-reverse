package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeWaitOptions implements FfiConverterRustBuffer<WaitOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWaitOptions INSTANCE = new FfiConverterTypeWaitOptions();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(WaitOptions waitOptions) {
        C7384Etj.A0Y(waitOptions, 0);
        return AbstractC7610F5x.A0W(waitOptions.timeoutMs) + AbstractC7610F5x.A0W(waitOptions.pollMs);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public WaitOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        return new WaitOptions(ffiConverterOptionalUInt.read(byteBuffer), ffiConverterOptionalUInt.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ WaitOptions lift(RustBuffer.ByValue byValue) {
        return (WaitOptions) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ WaitOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (WaitOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(WaitOptions waitOptions) {
        return lower((Object) waitOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(WaitOptions waitOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, waitOptions);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(WaitOptions waitOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(waitOptions, byteBuffer);
        FfiConverterOptionalUInt ffiConverterOptionalUInt = FfiConverterOptionalUInt.INSTANCE;
        ffiConverterOptionalUInt.write(waitOptions.timeoutMs, byteBuffer);
        ffiConverterOptionalUInt.write(waitOptions.pollMs, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.WaitOptions, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ WaitOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
