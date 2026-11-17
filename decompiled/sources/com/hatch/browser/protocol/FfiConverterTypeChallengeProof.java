package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass003;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeChallengeProof implements FfiConverterRustBuffer<ChallengeProof> {
    public static final int $stable = 0;
    public static final FfiConverterTypeChallengeProof INSTANCE = new FfiConverterTypeChallengeProof();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(ChallengeProof challengeProof) {
        return AbstractC7608F5v.A0W(challengeProof).mo3323allocationSizeI7RO_PI(challengeProof.value);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ ChallengeProof lift(RustBuffer.ByValue byValue) {
        return (ChallengeProof) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ ChallengeProof liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (ChallengeProof) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(ChallengeProof challengeProof) {
        return lower((Object) challengeProof);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(ChallengeProof challengeProof) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, challengeProof);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public ChallengeProof read(ByteBuffer byteBuffer) {
        return new ChallengeProof(AbstractC7610F5x.A0z(byteBuffer));
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(ChallengeProof challengeProof, ByteBuffer byteBuffer) {
        AnonymousClass003.A0u(challengeProof, byteBuffer);
        FfiConverterString.INSTANCE.write(challengeProof.value, byteBuffer);
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

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ /* synthetic */ Object read(ByteBuffer byteBuffer) {
        return new ChallengeProof(AbstractC7610F5x.A0z(byteBuffer));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.ChallengeProof, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ ChallengeProof lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
