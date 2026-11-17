package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.PageImageLoads;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageImageLoads implements FfiConverterRustBuffer<PageImageLoads> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageImageLoads INSTANCE = new FfiConverterTypePageImageLoads();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageImageLoads pageImageLoads) {
        C7384Etj.A0Y(pageImageLoads, 0);
        if (pageImageLoads instanceof PageImageLoads.Sampled) {
            return FfiConverterSequenceTypePageImageLoad.INSTANCE.mo3323allocationSizeI7RO_PI(((PageImageLoads.Sampled) pageImageLoads).images) + 4;
        }
        if (pageImageLoads instanceof PageImageLoads.Unavailable) {
            return 4L;
        }
        throw C3cG.A0q();
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
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new PageImageLoads.Sampled(FfiConverterSequenceTypePageImageLoad.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return PageImageLoads.Unavailable.INSTANCE;
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageImageLoads pageImageLoads, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(pageImageLoads, byteBuffer);
        if (pageImageLoads instanceof PageImageLoads.Sampled) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterSequenceTypePageImageLoad.INSTANCE.write(((PageImageLoads.Sampled) pageImageLoads).images, byteBuffer);
        } else {
            if (!(pageImageLoads instanceof PageImageLoads.Unavailable)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
        }
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
