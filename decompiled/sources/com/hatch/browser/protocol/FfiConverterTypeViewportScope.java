package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeViewportScope implements FfiConverterRustBuffer<ViewportScope> {
    public static final int $stable = 0;
    public static final FfiConverterTypeViewportScope INSTANCE = new FfiConverterTypeViewportScope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ViewportScope viewportScope) {
        return AbstractC7608F5v.A0W(viewportScope).mo3323allocationSizeI7RO_PI(viewportScope.value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ViewportScope lift(RustBuffer.ByValue byValue) {
        return (ViewportScope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ViewportScope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ViewportScope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ViewportScope viewportScope) {
        return lower((Object) viewportScope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ViewportScope viewportScope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, viewportScope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ViewportScope read(ByteBuffer byteBuffer) {
        return new ViewportScope(AbstractC7610F5x.A0z(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ViewportScope viewportScope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(viewportScope, byteBuffer);
        FfiConverterString.INSTANCE.write(viewportScope.value, byteBuffer);
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

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object read(ByteBuffer byteBuffer) {
        return new ViewportScope(AbstractC7610F5x.A0z(byteBuffer));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ViewportScope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ViewportScope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
