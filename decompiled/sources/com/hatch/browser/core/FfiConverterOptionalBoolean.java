package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalBoolean implements FfiConverterRustBuffer<Boolean> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalBoolean INSTANCE = new FfiConverterOptionalBoolean();

    @Override // com.hatch.browser.core.FfiConverter
    public void write(Boolean bool, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (bool == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterBoolean.INSTANCE.write(bool.booleanValue(), byteBuffer);
        }
    }

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3232allocationSizeI7RO_PI(Boolean bool) {
        return AbstractC7610F5x.A0V(bool);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ Boolean lift(RustBuffer.ByValue byValue) {
        return (Boolean) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ Boolean liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Boolean) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Boolean bool) {
        return lower((Object) bool);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Boolean bool) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, bool);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public Boolean read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass002.A1L(byteBuffer.get()));
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        return AbstractC7610F5x.A0V(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Boolean, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Boolean lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: lowerIntoRustBuffer */
    public /* bridge */ /* synthetic */ RustBuffer.ByValue lower(Object obj) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, obj);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ /* synthetic */ Object lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0p(this, byValue);
    }
}
