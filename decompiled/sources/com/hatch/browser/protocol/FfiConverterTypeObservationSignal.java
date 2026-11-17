package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeObservationSignal implements FfiConverterRustBuffer<ObservationSignal> {
    public static final int $stable = 0;
    public static final FfiConverterTypeObservationSignal INSTANCE = new FfiConverterTypeObservationSignal();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ObservationSignal observationSignal) {
        C7384Etj.A0Y(observationSignal, 0);
        return 4 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(observationSignal.ruleId);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ObservationSignal read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new ObservationSignal(FfiConverterTypeSignalKind.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ObservationSignal lift(RustBuffer.ByValue byValue) {
        return (ObservationSignal) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ObservationSignal liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ObservationSignal) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ObservationSignal observationSignal) {
        return lower((Object) observationSignal);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ObservationSignal observationSignal) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, observationSignal);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ObservationSignal observationSignal, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(observationSignal, byteBuffer);
        AbstractC7611F5y.A0q(observationSignal.signal, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(observationSignal.ruleId, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ObservationSignal, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ObservationSignal lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
