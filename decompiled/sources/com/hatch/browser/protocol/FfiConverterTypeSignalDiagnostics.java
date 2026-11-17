package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSignalDiagnostics implements FfiConverterRustBuffer<SignalDiagnostics> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSignalDiagnostics INSTANCE = new FfiConverterTypeSignalDiagnostics();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SignalDiagnostics signalDiagnostics) {
        C7384Etj.A0Y(signalDiagnostics, 0);
        return 4 + FfiConverterSequenceTypeSignalRuleDiagnostic.INSTANCE.mo3323allocationSizeI7RO_PI(signalDiagnostics.rules);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SignalDiagnostics lift(RustBuffer.ByValue byValue) {
        return (SignalDiagnostics) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SignalDiagnostics liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SignalDiagnostics) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SignalDiagnostics signalDiagnostics) {
        return lower((Object) signalDiagnostics);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SignalDiagnostics signalDiagnostics) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, signalDiagnostics);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SignalDiagnostics read(ByteBuffer byteBuffer) {
        return new SignalDiagnostics(AbstractC7609F5w.A0H(byteBuffer), FfiConverterSequenceTypeSignalRuleDiagnostic.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SignalDiagnostics signalDiagnostics, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(signalDiagnostics, byteBuffer);
        byteBuffer.putInt(signalDiagnostics.schemaVersion);
        FfiConverterSequenceTypeSignalRuleDiagnostic.INSTANCE.write(signalDiagnostics.rules, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SignalDiagnostics, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SignalDiagnostics lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
