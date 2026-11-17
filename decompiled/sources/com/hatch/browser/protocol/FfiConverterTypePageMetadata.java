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
public final class FfiConverterTypePageMetadata implements FfiConverterRustBuffer<PageMetadata> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageMetadata INSTANCE = new FfiConverterTypePageMetadata();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageMetadata pageMetadata) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(pageMetadata);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, pageMetadata.title, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(pageMetadata.url)) + FfiConverterOptionalTypeViewport.INSTANCE.mo3323allocationSizeI7RO_PI(pageMetadata.viewport) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(pageMetadata.contentType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageMetadata lift(RustBuffer.ByValue byValue) {
        return (PageMetadata) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageMetadata liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageMetadata) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageMetadata pageMetadata) {
        return lower((Object) pageMetadata);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageMetadata pageMetadata) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageMetadata);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageMetadata read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new PageMetadata(ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), FfiConverterOptionalTypeViewport.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageMetadata pageMetadata, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageMetadata, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(pageMetadata.url, byteBuffer);
        ffiConverterString.write(pageMetadata.title, byteBuffer);
        FfiConverterOptionalTypeViewport.INSTANCE.write(pageMetadata.viewport, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(pageMetadata.contentType, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageMetadata, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageMetadata lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
