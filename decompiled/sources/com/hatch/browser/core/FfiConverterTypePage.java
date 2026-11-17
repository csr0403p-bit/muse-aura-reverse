package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePage implements FfiConverter<Page, Long> {
    public static final int $stable = 0;
    public static final FfiConverterTypePage INSTANCE = new FfiConverterTypePage();

    @Override // com.hatch.browser.core.FfiConverter
    public Long lower(Page page) {
        C7384Etj.A0Y(page, 0);
        return Long.valueOf(page.uniffiCloneHandle());
    }

    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name */
    public long m3264allocationSizeI7RO_PI(Page page) {
        return 8L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Page lift(Long l) {
        return new Page(UniffiWithHandle.INSTANCE, C3cG.A05(l));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ Page liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Page) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(Page page) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, page);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverter
    public Page read(ByteBuffer byteBuffer) {
        return new Page(UniffiWithHandle.INSTANCE, AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(Page page, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(page, byteBuffer);
        byteBuffer.putLong(page.uniffiCloneHandle());
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Page page) {
        return 8L;
    }

    public Page lift(long j) {
        return new Page(UniffiWithHandle.INSTANCE, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.Page, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Page liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Page page) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, page);
    }
}
