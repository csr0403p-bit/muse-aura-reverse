package com.hatch.browser.core;

import X.AbstractC7609F5w;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.core.FfiConverter;
import com.hatch.browser.core.RustBuffer;
import com.hatch.browser.protocol.FfiConverterTypePageAuthorityDecision;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeNativePageAuthorityDecision implements FfiConverterRustBuffer<NativePageAuthorityDecision> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativePageAuthorityDecision INSTANCE = new FfiConverterTypeNativePageAuthorityDecision();

    @Override // com.hatch.browser.core.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3228allocationSizeI7RO_PI(NativePageAuthorityDecision nativePageAuthorityDecision) {
        C7384Etj.A0Y(nativePageAuthorityDecision, 0);
        return FfiConverterTypePageAuthorityDecision.INSTANCE.mo3323allocationSizeI7RO_PI(nativePageAuthorityDecision.decision);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public NativePageAuthorityDecision read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new NativePageAuthorityDecision(FfiConverterTypePageAuthorityDecision.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ NativePageAuthorityDecision lift(RustBuffer.ByValue byValue) {
        return (NativePageAuthorityDecision) AbstractC7609F5w.A0p(this, byValue);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public /* bridge */ NativePageAuthorityDecision liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (NativePageAuthorityDecision) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(NativePageAuthorityDecision nativePageAuthorityDecision) {
        return lower((Object) nativePageAuthorityDecision);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(NativePageAuthorityDecision nativePageAuthorityDecision) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, nativePageAuthorityDecision);
    }

    @Override // com.hatch.browser.core.FfiConverter
    public void write(NativePageAuthorityDecision nativePageAuthorityDecision, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(nativePageAuthorityDecision, byteBuffer);
        FfiConverterTypePageAuthorityDecision.INSTANCE.write(nativePageAuthorityDecision.decision, byteBuffer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.core.NativePageAuthorityDecision, java.lang.Object] */
    @Override // com.hatch.browser.core.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ NativePageAuthorityDecision lift(RustBuffer.ByValue byValue) {
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
