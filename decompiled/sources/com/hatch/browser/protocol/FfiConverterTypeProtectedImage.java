package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeProtectedImage implements FfiConverterRustBuffer<ProtectedImage> {
    public static final int $stable = 0;
    public static final FfiConverterTypeProtectedImage INSTANCE = new FfiConverterTypeProtectedImage();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ProtectedImage protectedImage) {
        C7384Etj.A0Y(protectedImage, 0);
        C7384Etj.A0Y(protectedImage.png, 0);
        return r0.length + 4 + 4 + 4 + FfiConverterOptionalTypeEncodedImage.INSTANCE.mo3323allocationSizeI7RO_PI(protectedImage.encoded);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ProtectedImage lift(RustBuffer.ByValue byValue) {
        return (ProtectedImage) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ProtectedImage liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ProtectedImage) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ProtectedImage protectedImage) {
        return lower((Object) protectedImage);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ProtectedImage protectedImage) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, protectedImage);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ProtectedImage read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return new ProtectedImage(bArr, byteBuffer.getInt(), byteBuffer.getInt(), FfiConverterOptionalTypeEncodedImage.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ProtectedImage protectedImage, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(protectedImage, byteBuffer);
        FfiConverterByteArray.INSTANCE.write(protectedImage.png, byteBuffer);
        byteBuffer.putInt(protectedImage.width);
        byteBuffer.putInt(protectedImage.height);
        FfiConverterOptionalTypeEncodedImage.INSTANCE.write(protectedImage.encoded, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ProtectedImage, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ProtectedImage lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
