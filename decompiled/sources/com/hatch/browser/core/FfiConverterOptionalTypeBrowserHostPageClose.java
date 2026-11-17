package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeBrowserHostPageClose implements FfiConverterRustBuffer<BrowserHostPageClose> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeBrowserHostPageClose INSTANCE = new FfiConverterOptionalTypeBrowserHostPageClose();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostPageClose browserHostPageClose, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (browserHostPageClose == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeBrowserHostPageClose.INSTANCE.write(browserHostPageClose, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3239allocationSizeI7RO_PI(BrowserHostPageClose browserHostPageClose) {
        return AbstractC7610F5x.A0X(browserHostPageClose);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ BrowserHostPageClose lift(RustBuffer.ByValue byValue) {
        return (BrowserHostPageClose) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostPageClose liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostPageClose) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserHostPageClose browserHostPageClose) {
        return lower((Object) browserHostPageClose);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserHostPageClose browserHostPageClose) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPageClose);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostPageClose read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeBrowserHostPageClose.INSTANCE.lift(byteBuffer.getLong());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostPageClose, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserHostPageClose lift(RustBuffer.ByValue byValue) {
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
