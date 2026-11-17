package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageImageLoad implements FfiConverterRustBuffer<PageImageLoad> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageImageLoad INSTANCE = new FfiConverterTypePageImageLoad();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageImageLoad pageImageLoad) {
        return AbstractC7608F5v.A0W(pageImageLoad).mo3323allocationSizeI7RO_PI(pageImageLoad.frame) + 4 + 4 + 4 + (pageImageLoad.bounds != null ? 33L : 1L);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageImageLoad lift(RustBuffer.ByValue byValue) {
        return (PageImageLoad) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageImageLoad liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageImageLoad) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageImageLoad pageImageLoad) {
        return lower((Object) pageImageLoad);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageImageLoad pageImageLoad) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageImageLoad);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageImageLoad read(ByteBuffer byteBuffer) {
        return new PageImageLoad(AbstractC7610F5x.A0z(byteBuffer), FfiConverterTypePageImageLoadState.INSTANCE.read(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt(), FfiConverterOptionalTypeCaptureCrop.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageImageLoad pageImageLoad, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageImageLoad, byteBuffer);
        FfiConverterString.INSTANCE.write(pageImageLoad.frame, byteBuffer);
        AbstractC7611F5y.A0q(pageImageLoad.state, byteBuffer);
        byteBuffer.putInt(pageImageLoad.intrinsicWidth);
        byteBuffer.putInt(pageImageLoad.intrinsicHeight);
        FfiConverterOptionalTypeCaptureCrop.INSTANCE.write(pageImageLoad.bounds, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageImageLoad, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageImageLoad lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
