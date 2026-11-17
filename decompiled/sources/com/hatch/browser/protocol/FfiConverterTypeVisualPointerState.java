package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualPointerState implements FfiConverterRustBuffer<VisualPointerState> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualPointerState INSTANCE = new FfiConverterTypeVisualPointerState();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualPointerState visualPointerState) {
        C7384Etj.A0Y(visualPointerState, 0);
        return AbstractC7610F5x.A0Y(visualPointerState.position) + 4;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualPointerState read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new VisualPointerState(FfiConverterOptionalTypePoint.INSTANCE.read(byteBuffer), byteBuffer.getInt());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualPointerState lift(RustBuffer.ByValue byValue) {
        return (VisualPointerState) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualPointerState liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualPointerState) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualPointerState visualPointerState) {
        return lower((Object) visualPointerState);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualPointerState visualPointerState) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualPointerState);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualPointerState visualPointerState, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualPointerState, byteBuffer);
        FfiConverterOptionalTypePoint.INSTANCE.write(visualPointerState.position, byteBuffer);
        byteBuffer.putInt(visualPointerState.buttons);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualPointerState, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualPointerState lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
