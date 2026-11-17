package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeBrowserHostAuthority implements FfiConverter<BrowserHostAuthority, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBrowserHostAuthority INSTANCE = new FfiConverterTypeBrowserHostAuthority();
    public static final UniffiHandleMap<BrowserHostAuthority> handleMap = new UniffiHandleMap<>();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(BrowserHostAuthority browserHostAuthority) {
        C7384Etj.A0Y(browserHostAuthority, 0);
        return Long.valueOf(browserHostAuthority instanceof BrowserHostAuthorityImpl ? ((BrowserHostAuthorityImpl) browserHostAuthority).uniffiCloneHandle() : handleMap.insert(browserHostAuthority));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3247allocationSizeI7RO_PI(BrowserHostAuthority browserHostAuthority) {
        return 8L;
    }

    public final UniffiHandleMap<BrowserHostAuthority> getHandleMap$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk() {
        return handleMap;
    }

    public BrowserHostAuthority lift(long j) {
        return (1 & j) == 0 ? new BrowserHostAuthorityImpl(UniffiWithHandle.INSTANCE, j) : handleMap.remove(j);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ BrowserHostAuthority liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (BrowserHostAuthority) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(BrowserHostAuthority browserHostAuthority) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostAuthority);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public BrowserHostAuthority read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(BrowserHostAuthority browserHostAuthority, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(browserHostAuthority, byteBuffer);
        byteBuffer.putLong(lower(browserHostAuthority).longValue());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(BrowserHostAuthority browserHostAuthority) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostAuthority lift(Long l) {
        return lift(C3cG.A05(l));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.BrowserHostAuthority, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostAuthority liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(BrowserHostAuthority browserHostAuthority) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, browserHostAuthority);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ BrowserHostAuthority read(ByteBuffer byteBuffer) {
        return lift(AbstractC7609F5w.A0N(byteBuffer));
    }
}
