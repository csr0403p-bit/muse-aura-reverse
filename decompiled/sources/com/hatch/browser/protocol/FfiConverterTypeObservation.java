package com.hatch.browser.protocol;

import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import X.C7384Etj;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeObservation implements FfiConverterRustBuffer<Observation> {
    public static final int $stable = 0;
    public static final FfiConverterTypeObservation INSTANCE = new FfiConverterTypeObservation();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(Observation observation) {
        C7384Etj.A0Y(observation, 0);
        return AbstractC7607F5u.A0R(FfiConverterString.INSTANCE, observation.text, FfiConverterOptionalTypeElementRef.INSTANCE.mo3323allocationSizeI7RO_PI(observation.blockingLocator) + FfiConverterOptionalSequenceTypeRedactedItems.INSTANCE.mo3323allocationSizeI7RO_PI(observation.redactions) + FfiConverterOptionalTypeViewMotion.INSTANCE.mo3323allocationSizeI7RO_PI(observation.viewMotion) + FfiConverterOptionalTypeTransitionEvidence.INSTANCE.mo3323allocationSizeI7RO_PI(observation.renderFence)) + FfiConverterTypeRefScope.INSTANCE.mo3323allocationSizeI7RO_PI(observation.scope) + FfiConverterTypeDocumentKey.INSTANCE.mo3323allocationSizeI7RO_PI(observation.document) + FfiConverterTypePageMetadata.INSTANCE.mo3323allocationSizeI7RO_PI(observation.metadata) + FfiConverterSequenceTypeObservationSignal.INSTANCE.mo3323allocationSizeI7RO_PI(observation.signals) + FfiConverterOptionalTypeSignalDiagnostics.INSTANCE.mo3323allocationSizeI7RO_PI(observation.signalDiagnostics) + FfiConverterSequenceTypeControlFact.INSTANCE.mo3323allocationSizeI7RO_PI(observation.controlFacts);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public Observation read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        return new Observation(FfiConverterOptionalTypeElementRef.INSTANCE.read(byteBuffer), FfiConverterOptionalSequenceTypeRedactedItems.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeViewMotion.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeTransitionEvidence.INSTANCE.read(byteBuffer), AbstractC7607F5u.A12(byteBuffer), new RefScope(AbstractC7610F5x.A0z(byteBuffer)), new DocumentKey(AbstractC7610F5x.A0z(byteBuffer)), FfiConverterTypePageMetadata.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeObservationSignal.INSTANCE.read(byteBuffer), FfiConverterOptionalTypeSignalDiagnostics.INSTANCE.read(byteBuffer), FfiConverterSequenceTypeControlFact.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ Observation lift(RustBuffer.ByValue byValue) {
        return (Observation) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ Observation liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (Observation) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(Observation observation) {
        return lower((Object) observation);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(Observation observation) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, observation);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(Observation observation, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(observation, byteBuffer);
        FfiConverterOptionalTypeElementRef.INSTANCE.write(observation.blockingLocator, byteBuffer);
        FfiConverterOptionalSequenceTypeRedactedItems.INSTANCE.write(observation.redactions, byteBuffer);
        FfiConverterOptionalTypeViewMotion.INSTANCE.write(observation.viewMotion, byteBuffer);
        FfiConverterOptionalTypeTransitionEvidence.INSTANCE.write(observation.renderFence, byteBuffer);
        FfiConverterString.INSTANCE.write(observation.text, byteBuffer);
        FfiConverterTypeRefScope.INSTANCE.write(observation.scope, byteBuffer);
        FfiConverterTypeDocumentKey.INSTANCE.write(observation.document, byteBuffer);
        FfiConverterTypePageMetadata.INSTANCE.write(observation.metadata, byteBuffer);
        FfiConverterSequenceTypeObservationSignal.INSTANCE.write(observation.signals, byteBuffer);
        FfiConverterOptionalTypeSignalDiagnostics.INSTANCE.write(observation.signalDiagnostics, byteBuffer);
        FfiConverterSequenceTypeControlFact.INSTANCE.write(observation.controlFacts, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.Observation, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ Observation lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
