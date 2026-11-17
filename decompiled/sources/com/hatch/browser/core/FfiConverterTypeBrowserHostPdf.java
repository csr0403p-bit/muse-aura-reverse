package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostPdf implements FfiConverter<BrowserHostPdf, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostPdf INSTANCE = new FfiConverterTypeBrowserHostPdf();
    public static final UniffiHandleMap<BrowserHostPdf> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostPdf browserHostPdf) {
        C7384Etj.A0Y(browserHostPdf, 0);
        return Long.valueOf(browserHostPdf instanceof BrowserHostPdfImpl ? ((BrowserHostPdfImpl) browserHostPdf).uniffiCloneHandle() : handleMap.insert(browserHostPdf));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3253allocationSizeI7RO_PI(BrowserHostPdf browserHostPdf) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostPdf> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostPdf lift(long j) {
        return (1 & j) == 0 ? new BrowserHostPdfImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostPdf liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostPdf) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostPdf browserHostPdf) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPdf);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostPdf read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostPdf browserHostPdf, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostPdf, byteBuffer);
        byteBuffer.putLong(lower(browserHostPdf).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostPdf browserHostPdf) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPdf lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostPdf, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPdf liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostPdf browserHostPdf) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPdf);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPdf read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
