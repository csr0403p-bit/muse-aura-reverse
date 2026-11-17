package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterOptionalTypeVisualFrameGeometry implements FfiConverterRustBuffer<VisualFrameGeometry> {
    public static final int $stable = 0;
    public static final FfiConverterOptionalTypeVisualFrameGeometry INSTANCE = new FfiConverterOptionalTypeVisualFrameGeometry();

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(VisualFrameGeometry visualFrameGeometry, ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 1);
        if (visualFrameGeometry == null) {
            byteBuffer.put((byte) 0);
        } else {
            byteBuffer.put((byte) 1);
            FfiConverterTypeVisualFrameGeometry.INSTANCE.write(visualFrameGeometry, byteBuffer);
        }
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(VisualFrameGeometry visualFrameGeometry) {
        if (visualFrameGeometry == null) {
            return 1L;
        }
        C7384Etj.A0Y(visualFrameGeometry.region, 0);
        return 73L;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ VisualFrameGeometry lift(RustBuffer.ByValue byValue) {
        return (VisualFrameGeometry) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ VisualFrameGeometry liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (VisualFrameGeometry) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(VisualFrameGeometry visualFrameGeometry) {
        return lower((Object) visualFrameGeometry);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(VisualFrameGeometry visualFrameGeometry) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, visualFrameGeometry);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public VisualFrameGeometry read(ByteBuffer byteBuffer) {
        if (AbstractC7609F5w.A00(byteBuffer) == 0) {
            return null;
        }
        return FfiConverterTypeVisualFrameGeometry.INSTANCE.read(byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.VisualFrameGeometry, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ VisualFrameGeometry lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
