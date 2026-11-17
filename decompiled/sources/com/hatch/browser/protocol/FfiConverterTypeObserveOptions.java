package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeObserveOptions implements FfiConverterRustBuffer<ObserveOptions> {
    public static final int $stable = 0;
    public static final FfiConverterTypeObserveOptions INSTANCE = new FfiConverterTypeObserveOptions();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ObserveOptions observeOptions) {
        C7384Etj.A0Y(observeOptions, 0);
        return 5 + FfiConverterOptionalTypeFailureContext.INSTANCE.mo3323allocationSizeI7RO_PI(observeOptions.failureContext) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(observeOptions.query) + FfiConverterOptionalTypeCaptureOptions.INSTANCE.mo3323allocationSizeI7RO_PI(observeOptions.capture) + 1 + 1 + (observeOptions.listen != null ? 5L : 1L);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ObserveOptions read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        return new ObserveOptions(AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), FfiConverterTypeRenderFence.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeFailureContext.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), FfiConverterOptionalTypeCaptureOptions.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), AbstractC7610F5x.A1V(ffiConverterBoolean, byteBuffer), FfiConverterOptionalUInt.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ObserveOptions lift(RustBuffer.ByValue byValue) {
        return (ObserveOptions) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ObserveOptions liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ObserveOptions) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ObserveOptions observeOptions) {
        return lower((Object) observeOptions);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ObserveOptions observeOptions) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, observeOptions);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ObserveOptions observeOptions, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(observeOptions, byteBuffer);
        FfiConverterBoolean ffiConverterBoolean = FfiConverterBoolean.INSTANCE;
        ffiConverterBoolean.write(observeOptions.signalDiagnostics, byteBuffer);
        AbstractC7611F5y.A0q(observeOptions.renderFence, byteBuffer);
        FfiConverterOptionalTypeFailureContext.INSTANCE.write(observeOptions.failureContext, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(observeOptions.query, byteBuffer);
        FfiConverterOptionalTypeCaptureOptions.INSTANCE.write(observeOptions.capture, byteBuffer);
        ffiConverterBoolean.write(observeOptions.redactions, byteBuffer);
        ffiConverterBoolean.write(observeOptions.audio, byteBuffer);
        FfiConverterOptionalUInt.INSTANCE.write(observeOptions.listen, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ObserveOptions, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ObserveOptions lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
