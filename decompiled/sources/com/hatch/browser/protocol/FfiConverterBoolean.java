package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterBoolean implements FfiConverter<Boolean, Byte> {
    public static final int $stable = 0;
    public static final FfiConverterBoolean INSTANCE = new FfiConverterBoolean();

    public void write(boolean z, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.put(Byte.valueOf(z ? (byte) 1 : (byte) 0).byteValue());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Boolean bool) {
        return 1L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Boolean lift(Byte b) {
        return Boolean.valueOf(AnonymousClass002.A1L(b.byteValue()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Boolean liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Boolean) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Byte lower(Boolean bool) {
        return Byte.valueOf(AnonymousClass001.A1X(bool) ? (byte) 1 : (byte) 0);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(boolean z) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Boolean.valueOf(z));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public Boolean read(ByteBuffer byteBuffer) {
        return Boolean.valueOf(AnonymousClass002.A1L(AbstractC7609F5w.A00(byteBuffer)));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3324allocationSizeI7RO_PI(boolean z) {
        return 1L;
    }

    public Boolean lift(byte b) {
        return Boolean.valueOf(AnonymousClass002.A1L(b));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Boolean liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public Byte lower(boolean z) {
        return Byte.valueOf(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Boolean bool) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, bool);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(Boolean bool, ByteBuffer byteBuffer) {
        write(AnonymousClass001.A1X(bool), byteBuffer);
    }
}
