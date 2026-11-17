package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePagePreparedReply implements FfiConverterRustBuffer<PagePreparedReply> {
    public static final int $stable = 0;
    public static final FfiConverterTypePagePreparedReply INSTANCE = new FfiConverterTypePagePreparedReply();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PagePreparedReply pagePreparedReply) {
        C7384Etj.A0Y(pagePreparedReply, 0);
        return FfiConverterTypeReportEnvelope.INSTANCE.mo3323allocationSizeI7RO_PI(pagePreparedReply.report) + 4 + FfiConverterTypePageReference.INSTANCE.mo3323allocationSizeI7RO_PI(pagePreparedReply.page) + FfiConverterTypePageOwnerView.INSTANCE.mo3323allocationSizeI7RO_PI(pagePreparedReply.owner);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PagePreparedReply read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PagePreparedReply(FfiConverterTypeReportEnvelope.INSTANCE.read(byteBuffer), byteBuffer.getInt(), new PageReference(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypePageOwnerView.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PagePreparedReply lift(RustBuffer.ByValue byValue) {
        return (PagePreparedReply) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PagePreparedReply liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PagePreparedReply) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PagePreparedReply pagePreparedReply) {
        return lower((Object) pagePreparedReply);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PagePreparedReply pagePreparedReply) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pagePreparedReply);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PagePreparedReply pagePreparedReply, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pagePreparedReply, byteBuffer);
        FfiConverterTypeReportEnvelope.INSTANCE.write(pagePreparedReply.report, byteBuffer);
        byteBuffer.putInt(pagePreparedReply.apiVersion);
        FfiConverterTypePageReference.INSTANCE.write(pagePreparedReply.page, byteBuffer);
        FfiConverterTypePageOwnerView.INSTANCE.write(pagePreparedReply.owner, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PagePreparedReply, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PagePreparedReply lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
