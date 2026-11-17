package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCommandReply implements FfiConverterRustBuffer<PageCommandReply> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCommandReply INSTANCE = new FfiConverterTypePageCommandReply();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCommandReply pageCommandReply) {
        C7384Etj.A0Y(pageCommandReply, 0);
        return FfiConverterTypeReportEnvelope.INSTANCE.mo3323allocationSizeI7RO_PI(pageCommandReply.report) + FfiConverterTypePageOwnerView.INSTANCE.mo3323allocationSizeI7RO_PI(pageCommandReply.owner);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCommandReply read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PageCommandReply(FfiConverterTypeReportEnvelope.INSTANCE.read(byteBuffer), FfiConverterTypePageOwnerView.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCommandReply lift(RustBuffer.ByValue byValue) {
        return (PageCommandReply) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCommandReply liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCommandReply) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCommandReply pageCommandReply) {
        return lower((Object) pageCommandReply);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCommandReply pageCommandReply) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCommandReply);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCommandReply pageCommandReply, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCommandReply, byteBuffer);
        FfiConverterTypeReportEnvelope.INSTANCE.write(pageCommandReply.report, byteBuffer);
        FfiConverterTypePageOwnerView.INSTANCE.write(pageCommandReply.owner, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCommandReply, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCommandReply lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
