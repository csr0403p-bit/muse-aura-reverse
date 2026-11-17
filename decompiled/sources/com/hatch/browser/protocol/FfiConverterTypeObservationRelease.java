package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.ObservationRelease;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeObservationRelease implements FfiConverterRustBuffer<ObservationRelease> {
    public static final int $stable = 0;
    public static final FfiConverterTypeObservationRelease INSTANCE = new FfiConverterTypeObservationRelease();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ObservationRelease observationRelease) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(observationRelease, 0);
        if (observationRelease instanceof ObservationRelease.Available) {
            jMo3323allocationSizeI7RO_PI = FfiConverterTypeObservation.INSTANCE.mo3323allocationSizeI7RO_PI(((ObservationRelease.Available) observationRelease).observation);
        } else {
            if (!(observationRelease instanceof ObservationRelease.Unavailable)) {
                if (observationRelease instanceof ObservationRelease.NotRequested) {
                    return 4L;
                }
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = 4;
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ObservationRelease lift(RustBuffer.ByValue byValue) {
        return (ObservationRelease) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ObservationRelease liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ObservationRelease) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ObservationRelease observationRelease) {
        return lower((Object) observationRelease);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ObservationRelease observationRelease) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, observationRelease);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ObservationRelease read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new ObservationRelease.Available(FfiConverterTypeObservation.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new ObservationRelease.Unavailable(FfiConverterTypeReleaseReason.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 3) {
            return ObservationRelease.NotRequested.INSTANCE;
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ObservationRelease observationRelease, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(observationRelease, byteBuffer);
        if (observationRelease instanceof ObservationRelease.Available) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterTypeObservation.INSTANCE.write(((ObservationRelease.Available) observationRelease).observation, byteBuffer);
        } else if (observationRelease instanceof ObservationRelease.Unavailable) {
            byteBuffer.putInt(2);
            AbstractC7611F5y.A0q(((ObservationRelease.Unavailable) observationRelease).reason, byteBuffer);
        } else {
            if (!(observationRelease instanceof ObservationRelease.NotRequested)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(3);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ObservationRelease, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ObservationRelease lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
