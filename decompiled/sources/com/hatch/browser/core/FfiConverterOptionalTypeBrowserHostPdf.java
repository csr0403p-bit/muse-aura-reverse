package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeBrowserHostPdf implements FfiConverterRustBuffer<BrowserHostPdf> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeBrowserHostPdf INSTANCE = new FfiConverterOptionalTypeBrowserHostPdf();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostPdf browserHostPdf, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (browserHostPdf == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeBrowserHostPdf.INSTANCE.write(browserHostPdf, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3240allocationSizeI7RO_PI(BrowserHostPdf browserHostPdf) {
        return AbstractC7610F5x.A0X(browserHostPdf);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ BrowserHostPdf lift(RustBuffer.ByValue byValue) {
        return (BrowserHostPdf) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostPdf liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostPdf) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserHostPdf browserHostPdf) {
        return lower((Object) browserHostPdf);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserHostPdf browserHostPdf) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPdf);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostPdf read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeBrowserHostPdf.INSTANCE.lift(byteBuffer.getLong());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostPdf, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserHostPdf lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }
}
