package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AnonymousClass001;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterInt implements FfiConverter<Integer, Integer> {
    public static final int $stable = 0;
    public static final FfiConverterInt INSTANCE = new FfiConverterInt();

    public void write(int i, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        byteBuffer.putInt(i);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Integer num) {
        num.intValue();
        return 4L;
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Integer lift(Integer num) {
        return Integer.valueOf(AnonymousClass001.A0F(num));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Integer liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Integer) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Integer lower(Integer num) {
        return Integer.valueOf(AnonymousClass001.A0F(num));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Integer num) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Integer.valueOf(AnonymousClass001.A0F(num)));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverter
    public Integer read(ByteBuffer byteBuffer) {
        return Integer.valueOf(AbstractC7609F5w.A0H(byteBuffer));
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3328allocationSizeI7RO_PI(int i) {
        return 4L;
    }

    public Integer lift(int i) {
        return Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Integer liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public Integer lower(int i) {
        return Integer.valueOf(i);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(int i) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, Integer.valueOf(i));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Integer read(ByteBuffer byteBuffer) {
        return Integer.valueOf(AbstractC7609F5w.A0H(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ void write(Integer num, ByteBuffer byteBuffer) {
        write(AnonymousClass001.A0F(num), byteBuffer);
    }
}
