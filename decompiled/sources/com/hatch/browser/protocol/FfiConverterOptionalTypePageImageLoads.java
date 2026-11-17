package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypePageImageLoads implements FfiConverterRustBuffer<PageImageLoads> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypePageImageLoads INSTANCE = new FfiConverterOptionalTypePageImageLoads();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageImageLoads pageImageLoads, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (pageImageLoads == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypePageImageLoads.INSTANCE.write(pageImageLoads, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageImageLoads pageImageLoads) {
        if (pageImageLoads != null) {
            return FfiConverterTypePageImageLoads.INSTANCE.mo3323allocationSizeI7RO_PI(pageImageLoads) + 1;
        }
        return 1L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageImageLoads lift(RustBuffer.ByValue byValue) {
        return (PageImageLoads) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageImageLoads liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageImageLoads) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageImageLoads pageImageLoads) {
        return lower((Object) pageImageLoads);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageImageLoads pageImageLoads) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageImageLoads);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageImageLoads read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypePageImageLoads.INSTANCE.read(byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageImageLoads, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageImageLoads lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
