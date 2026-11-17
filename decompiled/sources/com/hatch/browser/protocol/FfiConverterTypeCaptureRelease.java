package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.CaptureRelease;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeCaptureRelease implements FfiConverterRustBuffer<CaptureRelease> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCaptureRelease INSTANCE = new FfiConverterTypeCaptureRelease();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(CaptureRelease captureRelease) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(captureRelease, 0);
        if (captureRelease instanceof CaptureRelease.Available) {
            jMo3323allocationSizeI7RO_PI = FfiConverterTypePageCapture.INSTANCE.mo3323allocationSizeI7RO_PI(((CaptureRelease.Available) captureRelease).capture);
        } else {
            if (!(captureRelease instanceof CaptureRelease.Withheld)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = 4;
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ CaptureRelease lift(RustBuffer.ByValue byValue) {
        return (CaptureRelease) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ CaptureRelease liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (CaptureRelease) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(CaptureRelease captureRelease) {
        return lower((Object) captureRelease);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(CaptureRelease captureRelease) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, captureRelease);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public CaptureRelease read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new CaptureRelease.Available(FfiConverterTypePageCapture.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new CaptureRelease.Withheld(FfiConverterTypeReleaseReason.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(CaptureRelease captureRelease, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(captureRelease, byteBuffer);
        if (captureRelease instanceof CaptureRelease.Available) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterTypePageCapture.INSTANCE.write(((CaptureRelease.Available) captureRelease).capture, byteBuffer);
        } else {
            if (!(captureRelease instanceof CaptureRelease.Withheld)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            AbstractC7611F5y.A0q(((CaptureRelease.Withheld) captureRelease).reason, byteBuffer);
        }
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.CaptureRelease, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ CaptureRelease lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
