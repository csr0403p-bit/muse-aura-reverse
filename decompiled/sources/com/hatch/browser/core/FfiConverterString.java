package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C7384Etj;
import X.DCl;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* loaded from: classes6.dex */
public final class FfiConverterString implements FfiConverter<String, RustBuffer.ByValue> {
    public static final int $stable = 0;
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(String str) {
        C7384Etj.A0Y(str, 0);
        return (str.length() * 3) + 4;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public String lift(RustBuffer.ByValue byValue) {
        C7384Etj.A0Y(byValue, 0);
        try {
            byte[] bArr = new byte[(int) byValue.len];
            ByteBuffer byteBufferAsByteBuffer = byValue.asByteBuffer();
            C7384Etj.A0X(byteBufferAsByteBuffer);
            byteBufferAsByteBuffer.get(bArr);
            return new String(bArr, DCl.A05);
        } finally {
            RustBuffer.Companion.free$fbandroid_express_aura_java_com_facebook_aura_localbrowser_sdk_sdk(byValue);
        }
    }

    @Override // com.hatch.browser.core.FfiConverter
    public RustBuffer.ByValue lower(String str) throws CharacterCodingException {
        C7384Etj.A0Y(str, 0);
        ByteBuffer utf8 = toUtf8(str);
        RustBuffer.ByValue byValueM3281xff5f08c4 = RustBuffer.Companion.m3281xff5f08c4(utf8.limit());
        ByteBuffer byteBufferAsByteBuffer = byValueM3281xff5f08c4.asByteBuffer();
        C7384Etj.A0X(byteBufferAsByteBuffer);
        byteBufferAsByteBuffer.put(utf8);
        return byValueM3281xff5f08c4;
    }

    public final ByteBuffer toUtf8(String str) throws CharacterCodingException {
        C7384Etj.A0Y(str, 0);
        CharsetEncoder charsetEncoderNewEncoder = DCl.A05.newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap(str));
        C7384Etj.A0U(byteBufferEncode);
        return byteBufferEncode;
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: liftFromRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ String liftFromRustBuffer2(RustBuffer.ByValue byValue) {
        return (String) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(String str) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, str);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public String read(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[AbstractC7609F5w.A0H(byteBuffer)];
        byteBuffer.get(bArr);
        return new String(bArr, DCl.A05);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(String str, ByteBuffer byteBuffer) throws CharacterCodingException {
        AnonymousClass003.A0u(str, byteBuffer);
        ByteBuffer utf8 = toUtf8(str);
        byteBuffer.putInt(utf8.limit());
        byteBuffer.put(utf8);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.String] */
    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ String liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    /* renamed from: lowerIntoRustBuffer, reason: avoid collision after fix types in other method */
    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer2(String str) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, str);
    }
}
