package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostPageClose implements FfiConverter<BrowserHostPageClose, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostPageClose INSTANCE = new FfiConverterTypeBrowserHostPageClose();
    public static final UniffiHandleMap<BrowserHostPageClose> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostPageClose browserHostPageClose) {
        C7384Etj.A0Y(browserHostPageClose, 0);
        return Long.valueOf(browserHostPageClose instanceof BrowserHostPageCloseImpl ? ((BrowserHostPageCloseImpl) browserHostPageClose).uniffiCloneHandle() : handleMap.insert(browserHostPageClose));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3252allocationSizeI7RO_PI(BrowserHostPageClose browserHostPageClose) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostPageClose> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostPageClose lift(long j) {
        return (1 & j) == 0 ? new BrowserHostPageCloseImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostPageClose liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostPageClose) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostPageClose browserHostPageClose) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPageClose);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostPageClose read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostPageClose browserHostPageClose, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostPageClose, byteBuffer);
        byteBuffer.putLong(lower(browserHostPageClose).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostPageClose browserHostPageClose) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPageClose lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostPageClose, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPageClose liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostPageClose browserHostPageClose) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostPageClose);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostPageClose read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
