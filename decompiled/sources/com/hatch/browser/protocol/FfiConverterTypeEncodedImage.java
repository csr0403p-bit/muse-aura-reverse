package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeEncodedImage implements FfiConverterRustBuffer<EncodedImage> {
    public static final int $stable = 0;
    public static final FfiConverterTypeEncodedImage INSTANCE = new FfiConverterTypeEncodedImage();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(EncodedImage encodedImage) {
        C7384Etj.A0Y(encodedImage, 0);
        return AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, encodedImage.base64, 4L);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public EncodedImage read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new EncodedImage(FfiConverterTypeImageMimeType.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ EncodedImage lift(RustBuffer.ByValue byValue) {
        return (EncodedImage) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ EncodedImage liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (EncodedImage) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(EncodedImage encodedImage) {
        return lower((Object) encodedImage);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(EncodedImage encodedImage) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, encodedImage);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(EncodedImage encodedImage, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(encodedImage, byteBuffer);
        AbstractC7611F5y.A0q(encodedImage.mimeType, byteBuffer);
        FfiConverterString.INSTANCE.write(encodedImage.base64, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.EncodedImage, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ EncodedImage lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
