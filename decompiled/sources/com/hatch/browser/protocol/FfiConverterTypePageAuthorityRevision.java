package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageAuthorityRevision implements FfiConverterRustBuffer<PageAuthorityRevision> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageAuthorityRevision INSTANCE = new FfiConverterTypePageAuthorityRevision();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3481allocationSizeI7RO_PI(PageAuthorityRevision pageAuthorityRevision) {
        C7384Etj.A0Y(pageAuthorityRevision, 0);
        return 8L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageAuthorityRevision lift(RustBuffer.ByValue byValue) {
        return (PageAuthorityRevision) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageAuthorityRevision liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageAuthorityRevision) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageAuthorityRevision pageAuthorityRevision) {
        return lower((Object) pageAuthorityRevision);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageAuthorityRevision pageAuthorityRevision) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageAuthorityRevision);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageAuthorityRevision read(ByteBuffer byteBuffer) {
        return new PageAuthorityRevision(AbstractC7609F5w.A0N(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageAuthorityRevision pageAuthorityRevision, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageAuthorityRevision, byteBuffer);
        byteBuffer.putLong(pageAuthorityRevision.value);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 8L;
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

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object read(ByteBuffer byteBuffer) {
        return new PageAuthorityRevision(AbstractC7609F5w.A0N(byteBuffer));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageAuthorityRevision, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageAuthorityRevision lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
