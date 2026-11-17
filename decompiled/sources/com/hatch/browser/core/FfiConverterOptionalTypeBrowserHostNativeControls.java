package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeBrowserHostNativeControls implements FfiConverterRustBuffer<BrowserHostNativeControls> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeBrowserHostNativeControls INSTANCE = new FfiConverterOptionalTypeBrowserHostNativeControls();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostNativeControls browserHostNativeControls, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (browserHostNativeControls == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeBrowserHostNativeControls.INSTANCE.write(browserHostNativeControls, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3238allocationSizeI7RO_PI(BrowserHostNativeControls browserHostNativeControls) {
        return AbstractC7610F5x.A0X(browserHostNativeControls);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ BrowserHostNativeControls lift(RustBuffer.ByValue byValue) {
        return (BrowserHostNativeControls) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostNativeControls liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostNativeControls) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserHostNativeControls browserHostNativeControls) {
        return lower((Object) browserHostNativeControls);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserHostNativeControls browserHostNativeControls) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostNativeControls);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostNativeControls read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeBrowserHostNativeControls.INSTANCE.lift(byteBuffer.getLong());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostNativeControls, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserHostNativeControls lift(RustBuffer.ByValue byValue) {
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
