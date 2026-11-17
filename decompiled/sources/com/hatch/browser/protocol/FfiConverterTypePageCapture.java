package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypePageCapture implements FfiConverterRustBuffer<PageCapture> {
    public static final int $stable = 0;
    public static final FfiConverterTypePageCapture INSTANCE = new FfiConverterTypePageCapture();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(PageCapture pageCapture) {
        C7384Etj.A0Y(pageCapture, 0);
        long jMo3323allocationSizeI7RO_PI = FfiConverterTypeProtectedImage.INSTANCE.mo3323allocationSizeI7RO_PI(pageCapture.image) + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(pageCapture.document) + FfiConverterTypeCoordinateScope.INSTANCE.mo3323allocationSizeI7RO_PI(pageCapture.scope) + FfiConverterTypeViewport.INSTANCE.mo3323allocationSizeI7RO_PI(pageCapture.viewport) + 1;
        C7384Etj.A0Y(pageCapture.region, 0);
        return jMo3323allocationSizeI7RO_PI + 32 + FfiConverterOptionalTypePageImageLoads.INSTANCE.mo3323allocationSizeI7RO_PI(pageCapture.imageLoads);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public PageCapture read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new PageCapture(FfiConverterTypeProtectedImage.INSTANCE.read(byteBuffer), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypeCoordinateScope.INSTANCE.read(byteBuffer), FfiConverterTypeViewport.INSTANCE.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), FfiConverterTypeCaptureCrop.INSTANCE.read(byteBuffer), FfiConverterOptionalTypePageImageLoads.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ PageCapture lift(RustBuffer.ByValue byValue) {
        return (PageCapture) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ PageCapture liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (PageCapture) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(PageCapture pageCapture) {
        return lower((Object) pageCapture);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(PageCapture pageCapture) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, pageCapture);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(PageCapture pageCapture, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(pageCapture, byteBuffer);
        FfiConverterTypeProtectedImage.INSTANCE.write(pageCapture.image, byteBuffer);
        FfiConverterTypeDocumentKey.INSTANCE.write(pageCapture.document, byteBuffer);
        FfiConverterTypeCoordinateScope.INSTANCE.write(pageCapture.scope, byteBuffer);
        FfiConverterTypeViewport.INSTANCE.write(pageCapture.viewport, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(pageCapture.redactionsPresent, byteBuffer);
        FfiConverterTypeCaptureCrop.INSTANCE.write(pageCapture.region, byteBuffer);
        FfiConverterOptionalTypePageImageLoads.INSTANCE.write(pageCapture.imageLoads, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.PageCapture, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ PageCapture lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
