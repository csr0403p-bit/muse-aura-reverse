package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.C7384Etj;
import X.FKC;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterUInt implements FfiConverter<FKC, Integer> {
    public static final int $stable = 0;
    public static final FfiConverterUInt INSTANCE = new FfiConverterUInt();

    /* renamed from: write-qim9Vi0, reason: not valid java name */
    public void m3587writeqim9Vi0(int i, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putInt(i);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(FKC fkc) {
        return 4L;
    }

    /* renamed from: allocationSize-j8A87jM, reason: not valid java name */
    public long m3581allocationSizej8A87jM(int i) {
        return 4L;
    }

    /* renamed from: lift-OGnWXxg, reason: not valid java name */
    public int m3582liftOGnWXxg(int i) {
        return i;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Integer lower(FKC fkc) {
        return Integer.valueOf(fkc.A00);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(FKC fkc) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, FKC.A01(fkc.A00));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(FKC fkc, ByteBuffer byteBuffer) {
        m3587writeqim9Vi0(fkc.A00, byteBuffer);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ FKC lift(Integer num) {
        return FKC.A01(AnonymousClass001.A0F(num));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ FKC liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FKC.A01(m3583liftFromRustBufferOGnWXxg(byValue));
    }

    /* renamed from: liftFromRustBuffer-OGnWXxg, reason: not valid java name */
    public /* bridge */ int m3583liftFromRustBufferOGnWXxg(RustBuffer.ByValue byValue) {
        return ((FKC) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue)).A00;
    }

    /* renamed from: lower-WZ4Q5Ns, reason: not valid java name */
    public Integer m3584lowerWZ4Q5Ns(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: lowerIntoRustBuffer-WZ4Q5Ns, reason: not valid java name */
    public /* bridge */ RustBuffer.ByValue m3585lowerIntoRustBufferWZ4Q5Ns(int i) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, FKC.A01(i));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ FKC read(ByteBuffer byteBuffer) {
        return FKC.A01(AbstractC7609F5w.A0H(byteBuffer));
    }

    /* renamed from: read-OGnWXxg, reason: not valid java name */
    public int m3586readOGnWXxg(ByteBuffer byteBuffer) {
        return AbstractC7609F5w.A0H(byteBuffer);
    }
}
