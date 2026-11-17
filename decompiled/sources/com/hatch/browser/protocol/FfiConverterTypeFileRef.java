package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeFileRef implements FfiConverterRustBuffer<FileRef> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFileRef INSTANCE = new FfiConverterTypeFileRef();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(FileRef fileRef) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(fileRef);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, fileRef.sha256, AbstractC7607F5u.A0R(ffiConverterStringA0W, fileRef.name, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(fileRef.path)) + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(fileRef.mimeType) + 8);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ FileRef lift(RustBuffer.ByValue byValue) {
        return (FileRef) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ FileRef liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (FileRef) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(FileRef fileRef) {
        return lower((Object) fileRef);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(FileRef fileRef) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, fileRef);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public FileRef read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new FileRef(ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), byteBuffer.getLong(), ffiConverterStringA0W.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(FileRef fileRef, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(fileRef, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(fileRef.path, byteBuffer);
        ffiConverterString.write(fileRef.name, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(fileRef.mimeType, byteBuffer);
        byteBuffer.putLong(fileRef.bytes);
        ffiConverterString.write(fileRef.sha256, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.FileRef, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ FileRef lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
