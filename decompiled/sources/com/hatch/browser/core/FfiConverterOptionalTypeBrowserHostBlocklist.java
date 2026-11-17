package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeBrowserHostBlocklist implements FfiConverterRustBuffer<BrowserHostBlocklist> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeBrowserHostBlocklist INSTANCE = new FfiConverterOptionalTypeBrowserHostBlocklist();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostBlocklist browserHostBlocklist, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (browserHostBlocklist == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeBrowserHostBlocklist.INSTANCE.write(browserHostBlocklist, byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3235allocationSizeI7RO_PI(BrowserHostBlocklist browserHostBlocklist) {
        return AbstractC7610F5x.A0X(browserHostBlocklist);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ BrowserHostBlocklist lift(RustBuffer.ByValue byValue) {
        return (BrowserHostBlocklist) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostBlocklist liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostBlocklist) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(BrowserHostBlocklist browserHostBlocklist) {
        return lower((Object) browserHostBlocklist);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(BrowserHostBlocklist browserHostBlocklist) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostBlocklist);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostBlocklist read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeBrowserHostBlocklist.INSTANCE.lift(byteBuffer.getLong());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0X(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostBlocklist, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ BrowserHostBlocklist lift(RustBuffer.ByValue byValue) {
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
