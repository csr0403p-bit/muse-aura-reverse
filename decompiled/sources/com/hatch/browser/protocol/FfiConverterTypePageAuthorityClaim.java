package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageAuthorityClaim implements FfiConverterRustBuffer<PageAuthorityClaim> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAuthorityClaim INSTANCE = new FfiConverterTypePageAuthorityClaim();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageAuthorityClaim pageAuthorityClaim) {
        C7384Etj.A0Y(pageAuthorityClaim, 0);
        long jMo3323allocationSizeI7RO_PI = FfiConverterTypeBrowserTaskBinding.INSTANCE.mo3323allocationSizeI7RO_PI(pageAuthorityClaim.task) + FfiConverterTypeNativePageIdentity.INSTANCE.mo3323allocationSizeI7RO_PI(pageAuthorityClaim.nativePage);
        C7384Etj.A0Y(pageAuthorityClaim.groupControlRevision, 0);
        C7384Etj.A0Y(pageAuthorityClaim.pageAuthorityRevision, 0);
        return jMo3323allocationSizeI7RO_PI + 8 + 8;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageAuthorityClaim read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PageAuthorityClaim(FfiConverterTypeBrowserTaskBinding.INSTANCE.read(byteBuffer), FfiConverterTypeNativePageIdentity.INSTANCE.read(byteBuffer), new TaskPageGroupControlRevision(byteBuffer.getLong()), new PageAuthorityRevision(byteBuffer.getLong()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageAuthorityClaim lift(RustBuffer.ByValue byValue) {
        return (PageAuthorityClaim) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageAuthorityClaim liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAuthorityClaim) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageAuthorityClaim pageAuthorityClaim) {
        return lower((Object) pageAuthorityClaim);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageAuthorityClaim pageAuthorityClaim) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAuthorityClaim);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageAuthorityClaim pageAuthorityClaim, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageAuthorityClaim, byteBuffer);
        FfiConverterTypeBrowserTaskBinding.INSTANCE.write(pageAuthorityClaim.task, byteBuffer);
        FfiConverterTypeNativePageIdentity.INSTANCE.write(pageAuthorityClaim.nativePage, byteBuffer);
        FfiConverterTypeTaskPageGroupControlRevision.INSTANCE.write(pageAuthorityClaim.groupControlRevision, byteBuffer);
        FfiConverterTypePageAuthorityRevision.INSTANCE.write(pageAuthorityClaim.pageAuthorityRevision, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7610F5x.A0r(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageAuthorityClaim, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageAuthorityClaim lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
