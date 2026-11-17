package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativeControlDecision implements FfiConverterRustBuffer<NativeControlDecision> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeControlDecision INSTANCE = new FfiConverterTypeNativeControlDecision();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3256allocationSizeI7RO_PI(NativeControlDecision nativeControlDecision) {
        C7384Etj.A0Y(nativeControlDecision, 0);
        return 1L;
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativeControlDecision read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new NativeControlDecision(AnonymousClass002.A1L(byteBuffer.get()));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativeControlDecision lift(RustBuffer.ByValue byValue) {
        return (NativeControlDecision) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativeControlDecision liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativeControlDecision) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativeControlDecision nativeControlDecision) {
        return lower((Object) nativeControlDecision);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativeControlDecision nativeControlDecision) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativeControlDecision);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativeControlDecision nativeControlDecision, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativeControlDecision, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(nativeControlDecision.allowed, byteBuffer);
    }

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3228allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 1L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativeControlDecision, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativeControlDecision lift(RustBuffer.ByValue byValue) {
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
