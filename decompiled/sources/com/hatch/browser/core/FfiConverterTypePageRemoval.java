package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageRemoval implements FfiConverter<PageRemoval, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageRemoval INSTANCE = new FfiConverterTypePageRemoval();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PageRemoval pageRemoval) {
        C7384Etj.A0Y(pageRemoval, 0);
        return Long.valueOf(pageRemoval.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3267allocationSizeI7RO_PI(PageRemoval pageRemoval) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageRemoval lift(Long l) {
        return new PageRemoval(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PageRemoval liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageRemoval) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PageRemoval pageRemoval) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageRemoval);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PageRemoval read(ByteBuffer byteBuffer) {
        return new PageRemoval(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PageRemoval pageRemoval, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageRemoval, byteBuffer);
        byteBuffer.putLong(pageRemoval.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PageRemoval pageRemoval) {
        return 8L;
    }

    public PageRemoval lift(long j) {
        return new PageRemoval(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PageRemoval, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageRemoval liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PageRemoval pageRemoval) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageRemoval);
    }
}
