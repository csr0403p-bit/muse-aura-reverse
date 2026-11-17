package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageStateChange implements FfiConverterRustBuffer<PageStateChange> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageStateChange INSTANCE = new FfiConverterTypePageStateChange();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageStateChange pageStateChange) {
        C7384Etj.A0Y(pageStateChange, 0);
        C7384Etj.A0Y(pageStateChange.revision, 0);
        return 8 + FfiConverterTypePageAuthorityState.INSTANCE.mo3323allocationSizeI7RO_PI(pageStateChange.state);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageStateChange lift(RustBuffer.ByValue byValue) {
        return (PageStateChange) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageStateChange liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageStateChange) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageStateChange pageStateChange) {
        return lower((Object) pageStateChange);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageStateChange pageStateChange) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageStateChange);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageStateChange read(ByteBuffer byteBuffer) {
        return new PageStateChange(new PageAuthorityRevision(AbstractC7609F5w.A0N(byteBuffer)), FfiConverterTypePageAuthorityState.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageStateChange pageStateChange, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageStateChange, byteBuffer);
        FfiConverterTypePageAuthorityRevision.INSTANCE.write(pageStateChange.revision, byteBuffer);
        FfiConverterTypePageAuthorityState.INSTANCE.write(pageStateChange.state, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageStateChange, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageStateChange lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
