package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeExpectedOrigins implements FfiConverterRustBuffer<ExpectedOrigins> {
    public static final int $stable = 0;
    public static final FfiConverterTypeExpectedOrigins INSTANCE = new FfiConverterTypeExpectedOrigins();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ExpectedOrigins expectedOrigins) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(expectedOrigins);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, expectedOrigins.frameOrigin, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(expectedOrigins.pageOrigin));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ExpectedOrigins lift(RustBuffer.ByValue byValue) {
        return (ExpectedOrigins) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ExpectedOrigins liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ExpectedOrigins) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ExpectedOrigins expectedOrigins) {
        return lower((Object) expectedOrigins);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ExpectedOrigins expectedOrigins) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, expectedOrigins);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ExpectedOrigins read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new ExpectedOrigins(ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ExpectedOrigins expectedOrigins, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(expectedOrigins, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(expectedOrigins.pageOrigin, byteBuffer);
        ffiConverterString.write(expectedOrigins.frameOrigin, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ExpectedOrigins, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ExpectedOrigins lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
