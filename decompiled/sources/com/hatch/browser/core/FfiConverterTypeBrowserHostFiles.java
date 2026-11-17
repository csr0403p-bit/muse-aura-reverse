package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostFiles implements FfiConverter<BrowserHostFiles, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostFiles INSTANCE = new FfiConverterTypeBrowserHostFiles();
    public static final UniffiHandleMap<BrowserHostFiles> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostFiles browserHostFiles) {
        C7384Etj.A0Y(browserHostFiles, 0);
        return Long.valueOf(browserHostFiles instanceof BrowserHostFilesImpl ? ((BrowserHostFilesImpl) browserHostFiles).uniffiCloneHandle() : handleMap.insert(browserHostFiles));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3250allocationSizeI7RO_PI(BrowserHostFiles browserHostFiles) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostFiles> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostFiles lift(long j) {
        return (1 & j) == 0 ? new BrowserHostFilesImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostFiles liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostFiles) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostFiles browserHostFiles) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostFiles);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostFiles read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostFiles browserHostFiles, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostFiles, byteBuffer);
        byteBuffer.putLong(lower(browserHostFiles).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostFiles browserHostFiles) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostFiles lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostFiles, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostFiles liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostFiles browserHostFiles) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostFiles);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostFiles read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
