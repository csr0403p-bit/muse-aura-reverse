package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostDownloads implements FfiConverter<BrowserHostDownloads, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostDownloads INSTANCE = new FfiConverterTypeBrowserHostDownloads();
    public static final UniffiHandleMap<BrowserHostDownloads> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostDownloads browserHostDownloads) {
        C7384Etj.A0Y(browserHostDownloads, 0);
        return Long.valueOf(browserHostDownloads instanceof BrowserHostDownloadsImpl ? ((BrowserHostDownloadsImpl) browserHostDownloads).uniffiCloneHandle() : handleMap.insert(browserHostDownloads));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3249allocationSizeI7RO_PI(BrowserHostDownloads browserHostDownloads) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostDownloads> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostDownloads lift(long j) {
        return (1 & j) == 0 ? new BrowserHostDownloadsImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostDownloads liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostDownloads) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostDownloads browserHostDownloads) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostDownloads);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostDownloads read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostDownloads browserHostDownloads, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostDownloads, byteBuffer);
        byteBuffer.putLong(lower(browserHostDownloads).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostDownloads browserHostDownloads) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostDownloads lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostDownloads, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostDownloads liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostDownloads browserHostDownloads) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostDownloads);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostDownloads read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
