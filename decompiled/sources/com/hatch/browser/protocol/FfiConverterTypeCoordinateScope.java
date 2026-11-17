package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCoordinateScope implements FfiConverterRustBuffer<CoordinateScope> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoordinateScope INSTANCE = new FfiConverterTypeCoordinateScope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CoordinateScope coordinateScope) {
        C7384Etj.A0Y(coordinateScope, 0);
        return FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(coordinateScope.document) + FfiConverterTypeViewportScope.INSTANCE.mo3323allocationSizeI7RO_PI(coordinateScope.viewport);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CoordinateScope read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new CoordinateScope(new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), new ViewportScope(AbstractC7610F5x.A0z(byteBuffer)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CoordinateScope lift(RustBuffer.ByValue byValue) {
        return (CoordinateScope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CoordinateScope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CoordinateScope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CoordinateScope coordinateScope) {
        return lower((Object) coordinateScope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CoordinateScope coordinateScope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, coordinateScope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CoordinateScope coordinateScope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(coordinateScope, byteBuffer);
        FfiConverterTypeDocumentKey.INSTANCE.write(coordinateScope.document, byteBuffer);
        FfiConverterTypeViewportScope.INSTANCE.write(coordinateScope.viewport, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CoordinateScope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CoordinateScope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
