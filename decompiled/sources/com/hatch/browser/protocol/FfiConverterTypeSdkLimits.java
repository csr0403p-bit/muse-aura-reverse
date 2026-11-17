package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSdkLimits implements FfiConverterRustBuffer<SdkLimits> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSdkLimits INSTANCE = new FfiConverterTypeSdkLimits();

    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    public long m3532allocationSizeI7RO_PI(SdkLimits sdkLimits) {
        C7384Etj.A0Y(sdkLimits, 0);
        return 32L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SdkLimits lift(RustBuffer.ByValue byValue) {
        return (SdkLimits) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SdkLimits liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SdkLimits) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SdkLimits sdkLimits) {
        return lower((Object) sdkLimits);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SdkLimits sdkLimits) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, sdkLimits);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SdkLimits read(ByteBuffer byteBuffer) {
        return new SdkLimits(AbstractC7609F5w.A0H(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt());
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SdkLimits sdkLimits, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(sdkLimits, byteBuffer);
        byteBuffer.putInt(sdkLimits.maxRequestBytes);
        byteBuffer.putInt(sdkLimits.maxReportBytes);
        byteBuffer.putInt(sdkLimits.maxOperations);
        byteBuffer.putInt(sdkLimits.maxPages);
        byteBuffer.putInt(sdkLimits.maxTaskPageGroups);
        byteBuffer.putInt(sdkLimits.maxReports);
        byteBuffer.putInt(sdkLimits.maxRefs);
        byteBuffer.putInt(sdkLimits.releaseTimeoutMs);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI */
    public /* bridge */ /* synthetic */ long mo3323allocationSizeI7RO_PI(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return 32L;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SdkLimits, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SdkLimits lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
