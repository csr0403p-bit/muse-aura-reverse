package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserCore implements FfiConverter<BrowserCore, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserCore INSTANCE = new FfiConverterTypeBrowserCore();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserCore browserCore) {
        C7384Etj.A0Y(browserCore, 0);
        return Long.valueOf(browserCore.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3245allocationSizeI7RO_PI(BrowserCore browserCore) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserCore lift(Long l) {
        return new BrowserCore(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserCore liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserCore) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserCore browserCore) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserCore);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserCore read(ByteBuffer byteBuffer) {
        return new BrowserCore(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserCore browserCore, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserCore, byteBuffer);
        byteBuffer.putLong(browserCore.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserCore browserCore) {
        return 8L;
    }

    public BrowserCore lift(long j) {
        return new BrowserCore(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserCore, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserCore liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserCore browserCore) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserCore);
    }
}
