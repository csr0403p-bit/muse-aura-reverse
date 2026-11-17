package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeSignalRuleDiagnostic implements FfiConverterRustBuffer<SignalRuleDiagnostic> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSignalRuleDiagnostic INSTANCE = new FfiConverterTypeSignalRuleDiagnostic();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(SignalRuleDiagnostic signalRuleDiagnostic) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(signalRuleDiagnostic);
        return AbstractC7607F5u.A0R(ffiConverterStringA0W, signalRuleDiagnostic.urlMatcher, ffiConverterStringA0W.mo3323allocationSizeI7RO_PI(signalRuleDiagnostic.ruleId) + 4 + 4 + FfiConverterOptionalString.INSTANCE.mo3323allocationSizeI7RO_PI(signalRuleDiagnostic.query)) + 1 + 4 + 4 + 4 + 4 + FfiConverterSequenceTypeSignalDiagnosticOutcome.INSTANCE.mo3323allocationSizeI7RO_PI(signalRuleDiagnostic.limitations);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ SignalRuleDiagnostic lift(RustBuffer.ByValue byValue) {
        return (SignalRuleDiagnostic) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ SignalRuleDiagnostic liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (SignalRuleDiagnostic) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(SignalRuleDiagnostic signalRuleDiagnostic) {
        return lower((Object) signalRuleDiagnostic);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(SignalRuleDiagnostic signalRuleDiagnostic) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, signalRuleDiagnostic);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public SignalRuleDiagnostic read(ByteBuffer byteBuffer) {
        FfiConverterString ffiConverterStringA0W = AbstractC7608F5v.A0W(byteBuffer);
        return new SignalRuleDiagnostic(ffiConverterStringA0W.read(byteBuffer), FfiConverterTypeSignalKind.INSTANCE.read(byteBuffer), FfiConverterTypeSignalEvidenceKind.INSTANCE.read(byteBuffer), AbstractC7607F5u.A11(byteBuffer), ffiConverterStringA0W.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), FfiConverterTypeSignalDiagnosticOutcome.INSTANCE.read(byteBuffer), byteBuffer.getInt(), byteBuffer.getInt(), byteBuffer.getInt(), FfiConverterSequenceTypeSignalDiagnosticOutcome.INSTANCE.read(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(SignalRuleDiagnostic signalRuleDiagnostic, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(signalRuleDiagnostic, byteBuffer);
        FfiConverterString ffiConverterString = FfiConverterString.INSTANCE;
        ffiConverterString.write(signalRuleDiagnostic.ruleId, byteBuffer);
        AbstractC7611F5y.A0q(signalRuleDiagnostic.signal, byteBuffer);
        AbstractC7611F5y.A0q(signalRuleDiagnostic.evidenceKind, byteBuffer);
        FfiConverterOptionalString.INSTANCE.write(signalRuleDiagnostic.query, byteBuffer);
        ffiConverterString.write(signalRuleDiagnostic.urlMatcher, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(signalRuleDiagnostic.requiresRenderedMatch, byteBuffer);
        AbstractC7611F5y.A0q(signalRuleDiagnostic.outcome, byteBuffer);
        byteBuffer.putInt(signalRuleDiagnostic.candidateCount);
        byteBuffer.putInt(signalRuleDiagnostic.confirmedCount);
        byteBuffer.putInt(signalRuleDiagnostic.renderedCount);
        FfiConverterSequenceTypeSignalDiagnosticOutcome.INSTANCE.write(signalRuleDiagnostic.limitations, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.SignalRuleDiagnostic, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ SignalRuleDiagnostic lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
