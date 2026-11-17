package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostBlocklist implements FfiConverter<BrowserHostBlocklist, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostBlocklist INSTANCE = new FfiConverterTypeBrowserHostBlocklist();
    public static final UniffiHandleMap<BrowserHostBlocklist> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostBlocklist browserHostBlocklist) {
        C7384Etj.A0Y(browserHostBlocklist, 0);
        return Long.valueOf(browserHostBlocklist instanceof BrowserHostBlocklistImpl ? ((BrowserHostBlocklistImpl) browserHostBlocklist).uniffiCloneHandle() : handleMap.insert(browserHostBlocklist));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3248allocationSizeI7RO_PI(BrowserHostBlocklist browserHostBlocklist) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostBlocklist> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostBlocklist lift(long j) {
        return (1 & j) == 0 ? new BrowserHostBlocklistImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostBlocklist liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostBlocklist) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostBlocklist browserHostBlocklist) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostBlocklist);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostBlocklist read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostBlocklist browserHostBlocklist, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostBlocklist, byteBuffer);
        byteBuffer.putLong(lower(browserHostBlocklist).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostBlocklist browserHostBlocklist) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostBlocklist lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostBlocklist, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostBlocklist liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostBlocklist browserHostBlocklist) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostBlocklist);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostBlocklist read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
