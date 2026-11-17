package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserBlocklistFilter implements FfiConverter<BrowserBlocklistFilter, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserBlocklistFilter INSTANCE = new FfiConverterTypeBrowserBlocklistFilter();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserBlocklistFilter browserBlocklistFilter) {
        C7384Etj.A0Y(browserBlocklistFilter, 0);
        return Long.valueOf(browserBlocklistFilter.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3244allocationSizeI7RO_PI(BrowserBlocklistFilter browserBlocklistFilter) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserBlocklistFilter lift(Long l) {
        return new BrowserBlocklistFilter(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserBlocklistFilter liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserBlocklistFilter) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserBlocklistFilter browserBlocklistFilter) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserBlocklistFilter);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserBlocklistFilter read(ByteBuffer byteBuffer) {
        return new BrowserBlocklistFilter(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserBlocklistFilter browserBlocklistFilter, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserBlocklistFilter, byteBuffer);
        byteBuffer.putLong(browserBlocklistFilter.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserBlocklistFilter browserBlocklistFilter) {
        return 8L;
    }

    public BrowserBlocklistFilter lift(long j) {
        return new BrowserBlocklistFilter(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserBlocklistFilter, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserBlocklistFilter liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserBlocklistFilter browserBlocklistFilter) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserBlocklistFilter);
    }
}
