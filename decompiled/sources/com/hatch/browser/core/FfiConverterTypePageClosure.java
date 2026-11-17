package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageClosure implements FfiConverter<PageClosure, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageClosure INSTANCE = new FfiConverterTypePageClosure();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(PageClosure pageClosure) {
        C7384Etj.A0Y(pageClosure, 0);
        return Long.valueOf(pageClosure.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3266allocationSizeI7RO_PI(PageClosure pageClosure) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageClosure lift(Long l) {
        return new PageClosure(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ PageClosure liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageClosure) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(PageClosure pageClosure) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageClosure);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public PageClosure read(ByteBuffer byteBuffer) {
        return new PageClosure(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(PageClosure pageClosure, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageClosure, byteBuffer);
        byteBuffer.putLong(pageClosure.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(PageClosure pageClosure) {
        return 8L;
    }

    public PageClosure lift(long j) {
        return new PageClosure(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.PageClosure, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ PageClosure liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(PageClosure pageClosure) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageClosure);
    }
}
