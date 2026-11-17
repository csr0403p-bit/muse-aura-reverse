package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageAccess implements FfiConverter<PageAccess, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAccess INSTANCE = new FfiConverterTypePageAccess();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PageAccess pageAccess) {
        C7384Etj.A0Y(pageAccess, 0);
        return Long.valueOf(pageAccess.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3265allocationSizeI7RO_PI(PageAccess pageAccess) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageAccess lift(Long l) {
        return new PageAccess(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PageAccess liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAccess) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PageAccess pageAccess) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAccess);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PageAccess read(ByteBuffer byteBuffer) {
        return new PageAccess(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PageAccess pageAccess, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageAccess, byteBuffer);
        byteBuffer.putLong(pageAccess.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PageAccess pageAccess) {
        return 8L;
    }

    public PageAccess lift(long j) {
        return new PageAccess(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PageAccess, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageAccess liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PageAccess pageAccess) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAccess);
    }
}
