package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostNativeControls implements FfiConverter<BrowserHostNativeControls, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostNativeControls INSTANCE = new FfiConverterTypeBrowserHostNativeControls();
    public static final UniffiHandleMap<BrowserHostNativeControls> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostNativeControls browserHostNativeControls) {
        C7384Etj.A0Y(browserHostNativeControls, 0);
        return Long.valueOf(browserHostNativeControls instanceof BrowserHostNativeControlsImpl ? ((BrowserHostNativeControlsImpl) browserHostNativeControls).uniffiCloneHandle() : handleMap.insert(browserHostNativeControls));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3251allocationSizeI7RO_PI(BrowserHostNativeControls browserHostNativeControls) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostNativeControls> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostNativeControls lift(long j) {
        return (1 & j) == 0 ? new BrowserHostNativeControlsImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostNativeControls liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostNativeControls) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostNativeControls browserHostNativeControls) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostNativeControls);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostNativeControls read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostNativeControls browserHostNativeControls, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostNativeControls, byteBuffer);
        byteBuffer.putLong(lower(browserHostNativeControls).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostNativeControls browserHostNativeControls) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostNativeControls lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostNativeControls, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostNativeControls liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostNativeControls browserHostNativeControls) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostNativeControls);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostNativeControls read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
