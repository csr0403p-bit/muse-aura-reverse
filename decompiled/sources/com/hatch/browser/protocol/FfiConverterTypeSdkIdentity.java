package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSdkIdentity implements FfiConverterRustBuffer<SdkIdentity> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSdkIdentity INSTANCE = new FfiConverterTypeSdkIdentity();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SdkIdentity sdkIdentity) {
        C7384Etj.A0Y(sdkIdentity, 0);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        long jA0M = AbstractC7609F5w.A0M(AbstractC7607F5u.A0R(ffiConverterString, sdkIdentity.target, AbstractC7607F5u.A0R(ffiConverterString, sdkIdentity.artifactId, AbstractC7607F5u.A0R(ffiConverterString, sdkIdentity.bindingVersion, ffiConverterString.mo3323allocationSizeI7RO_PI(sdkIdentity.sourceRevision) + 4))), FfiConverterSequenceString.INSTANCE.mo3323allocationSizeI7RO_PI(sdkIdentity.features));
        C7384Etj.A0Y(sdkIdentity.limits, 0);
        return jA0M + 32;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SdkIdentity lift(RustBuffer.ByValue byValue) {
        return (SdkIdentity) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SdkIdentity liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SdkIdentity) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SdkIdentity sdkIdentity) {
        return lower((Object) sdkIdentity);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SdkIdentity sdkIdentity) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, sdkIdentity);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SdkIdentity read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new SdkIdentity(ffiConverterStringA0W.read(byteBuffer), byteBuffer.getInt(), ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), ffiConverterStringA0W.read(byteBuffer), FfiConverterSequenceString.INSTANCE.read(byteBuffer), byteBuffer.getInt(), FfiConverterTypeSdkLimits.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SdkIdentity sdkIdentity, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(sdkIdentity, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(sdkIdentity.sourceRevision, byteBuffer);
        byteBuffer.putInt(sdkIdentity.semanticApiVersion);
        ffiConverterString.write(sdkIdentity.bindingVersion, byteBuffer);
        ffiConverterString.write(sdkIdentity.artifactId, byteBuffer);
        ffiConverterString.write(sdkIdentity.target, byteBuffer);
        FfiConverterSequenceString.INSTANCE.write(sdkIdentity.features, byteBuffer);
        byteBuffer.putInt(sdkIdentity.policyRevision);
        FfiConverterTypeSdkLimits.INSTANCE.write(sdkIdentity.limits, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SdkIdentity, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SdkIdentity lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
