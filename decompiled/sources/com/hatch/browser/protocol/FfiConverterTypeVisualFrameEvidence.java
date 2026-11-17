package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeVisualFrameEvidence implements FfiConverterRustBuffer<VisualFrameEvidence> {
    public static final int $stable = 0;
    public static final FfiConverterTypeVisualFrameEvidence INSTANCE = new FfiConverterTypeVisualFrameEvidence();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualFrameEvidence visualFrameEvidence) {
        C7384Etj.A0Y(visualFrameEvidence, 0);
        return FfiConverterTypeVisualFrameGeometry.INSTANCE.mo3323allocationSizeI7RO_PI(visualFrameEvidence.geometry) + FfiConverterTypeProtectedImage.INSTANCE.mo3323allocationSizeI7RO_PI(visualFrameEvidence.image);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualFrameEvidence read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new VisualFrameEvidence(FfiConverterTypeVisualFrameGeometry.INSTANCE.read(byteBuffer), FfiConverterTypeProtectedImage.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualFrameEvidence lift(RustBuffer.ByValue byValue) {
        return (VisualFrameEvidence) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualFrameEvidence liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualFrameEvidence) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualFrameEvidence visualFrameEvidence) {
        return lower((Object) visualFrameEvidence);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualFrameEvidence visualFrameEvidence) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualFrameEvidence);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualFrameEvidence visualFrameEvidence, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(visualFrameEvidence, byteBuffer);
        FfiConverterTypeVisualFrameGeometry.INSTANCE.write(visualFrameEvidence.geometry, byteBuffer);
        FfiConverterTypeProtectedImage.INSTANCE.write(visualFrameEvidence.image, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualFrameEvidence, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualFrameEvidence lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
