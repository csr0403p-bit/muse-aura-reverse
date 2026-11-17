package com.hatch.browser.protocol;

import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass003;
import X.C7384Etj;
import X.FKC;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeTransitionEvidence implements FfiConverterRustBuffer<TransitionEvidence> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTransitionEvidence INSTANCE = new FfiConverterTypeTransitionEvidence();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(TransitionEvidence transitionEvidence) {
        C7384Etj.A0Y(transitionEvidence, 0);
        long jA0W = AbstractC7610F5x.A0W(transitionEvidence.kind) + AbstractC7610F5x.A0W(transitionEvidence.waitedMs);
        FfiConverterOptionalTypeDocumentKey ffiConverterOptionalTypeDocumentKey = FfiConverterOptionalTypeDocumentKey.INSTANCE;
        return AbstractC7609F5w.A0M(jA0W + ffiConverterOptionalTypeDocumentKey.mo3323allocationSizeI7RO_PI(transitionEvidence.before) + ffiConverterOptionalTypeDocumentKey.mo3323allocationSizeI7RO_PI(transitionEvidence.after), 1L);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public TransitionEvidence read(ByteBuffer byteBuffer) {
        C7384Etj.A0Y(byteBuffer, 0);
        TransitionKind transitionKind = FfiConverterOptionalTypeTransitionKind.INSTANCE.read(byteBuffer);
        FKC fkc = FfiConverterOptionalUInt.INSTANCE.read(byteBuffer);
        FfiConverterOptionalTypeDocumentKey ffiConverterOptionalTypeDocumentKey = FfiConverterOptionalTypeDocumentKey.INSTANCE;
        return new TransitionEvidence(transitionKind, fkc, ffiConverterOptionalTypeDocumentKey.read(byteBuffer), ffiConverterOptionalTypeDocumentKey.read(byteBuffer), AbstractC7610F5x.A1V(FfiConverterBoolean.INSTANCE, byteBuffer), FfiConverterTypeReadiness.INSTANCE.read(byteBuffer));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ TransitionEvidence lift(RustBuffer.ByValue byValue) {
        return (TransitionEvidence) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ TransitionEvidence liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (TransitionEvidence) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(TransitionEvidence transitionEvidence) {
        return lower((Object) transitionEvidence);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(TransitionEvidence transitionEvidence) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, transitionEvidence);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(TransitionEvidence transitionEvidence, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(transitionEvidence, byteBuffer);
        FfiConverterOptionalTypeTransitionKind.INSTANCE.write(transitionEvidence.kind, byteBuffer);
        FfiConverterOptionalUInt.INSTANCE.write(transitionEvidence.waitedMs, byteBuffer);
        FfiConverterOptionalTypeDocumentKey ffiConverterOptionalTypeDocumentKey = FfiConverterOptionalTypeDocumentKey.INSTANCE;
        ffiConverterOptionalTypeDocumentKey.write(transitionEvidence.before, byteBuffer);
        ffiConverterOptionalTypeDocumentKey.write(transitionEvidence.after, byteBuffer);
        FfiConverterBoolean.INSTANCE.write(transitionEvidence.documentChanged, byteBuffer);
        AbstractC7611F5y.A0q(transitionEvidence.readiness, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.TransitionEvidence, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ TransitionEvidence lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
