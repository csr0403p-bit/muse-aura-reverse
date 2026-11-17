package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePagePrepareEnvelope implements FfiConverterRustBuffer<PagePrepareEnvelope> {
    public static final int $stable = 0;
    public static final FfiConverterTypePagePrepareEnvelope INSTANCE = new FfiConverterTypePagePrepareEnvelope();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PagePrepareEnvelope pagePrepareEnvelope) {
        C7384Etj.A0Y(pagePrepareEnvelope, 0);
        return 4 + FfiConverterTypePagePrepareRequest.INSTANCE.mo3323allocationSizeI7RO_PI(pagePrepareEnvelope.request);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PagePrepareEnvelope lift(RustBuffer.ByValue byValue) {
        return (PagePrepareEnvelope) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PagePrepareEnvelope liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PagePrepareEnvelope) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PagePrepareEnvelope pagePrepareEnvelope) {
        return lower((Object) pagePrepareEnvelope);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PagePrepareEnvelope pagePrepareEnvelope) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pagePrepareEnvelope);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PagePrepareEnvelope read(ByteBuffer byteBuffer) {
        return new PagePrepareEnvelope(AbstractC7609F5w.A0H(byteBuffer), FfiConverterTypePagePrepareRequest.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PagePrepareEnvelope pagePrepareEnvelope, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pagePrepareEnvelope, byteBuffer);
        byteBuffer.putInt(pagePrepareEnvelope.apiVersion);
        FfiConverterTypePagePrepareRequest.INSTANCE.write(pagePrepareEnvelope.request, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PagePrepareEnvelope, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PagePrepareEnvelope lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
