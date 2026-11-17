package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalString implements FfiConverterRustBuffer<String> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalString INSTANCE = new FfiConverterOptionalString();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(String str, ByteBuffer byteBuffer) throws CharacterCodingException {
        C7384Etj.A0Y(byteBuffer, 1);
        if (str == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterString.INSTANCE.write(str, byteBuffer);
        }
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(String str) {
        if (str != null) {
            return FfiConverterString.INSTANCE.mo3228allocationSizeI7RO_PI(str) + 1;
        }
        return 1L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ String liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (String) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public String read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterString.INSTANCE.read(byteBuffer);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ String lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(String str) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, str);
    }

    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    /* renamed from: lift, reason: avoid collision after fix types in other method */
    public /* bridge */ String lift2(RustBuffer.ByValue byValue) {
        return (String) AbstractC7609F5w.A0p(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(String str) {
        return lower((Object) str);
    }
}
