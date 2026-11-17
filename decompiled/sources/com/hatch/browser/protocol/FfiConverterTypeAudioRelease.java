package com.hatch.browser.protocol;

import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import com.hatch.browser.protocol.AudioRelease;
import com.hatch.browser.protocol.FfiConverter;
import com.hatch.browser.protocol.RustBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class FfiConverterTypeAudioRelease implements FfiConverterRustBuffer<AudioRelease> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAudioRelease INSTANCE = new FfiConverterTypeAudioRelease();

    @Override // com.hatch.browser.protocol.FfiConverter
    /* renamed from: allocationSize-I7RO_PI, reason: not valid java name and merged with bridge method [inline-methods] */
    public long mo3323allocationSizeI7RO_PI(AudioRelease audioRelease) {
        long jMo3323allocationSizeI7RO_PI;
        C7384Etj.A0Y(audioRelease, 0);
        if (audioRelease instanceof AudioRelease.Available) {
            jMo3323allocationSizeI7RO_PI = FfiConverterSequenceTypeAudioClip.INSTANCE.mo3323allocationSizeI7RO_PI(((AudioRelease.Available) audioRelease).clips);
        } else {
            if (!(audioRelease instanceof AudioRelease.Withheld)) {
                throw C3cG.A0q();
            }
            jMo3323allocationSizeI7RO_PI = 4;
        }
        return jMo3323allocationSizeI7RO_PI + 4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ AudioRelease lift(RustBuffer.ByValue byValue) {
        return (AudioRelease) AbstractC7609F5w.A0q(this, byValue);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public /* bridge */ AudioRelease liftFromRustBuffer(RustBuffer.ByValue byValue) {
        return (AudioRelease) FfiConverter.CC.$default$liftFromRustBuffer(this, byValue);
    }

    public /* bridge */ RustBuffer.ByValue lower(AudioRelease audioRelease) {
        return lower((Object) audioRelease);
    }

    public /* bridge */ RustBuffer.ByValue lowerIntoRustBuffer(AudioRelease audioRelease) {
        return FfiConverter.CC.$default$lowerIntoRustBuffer(this, audioRelease);
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public AudioRelease read(ByteBuffer byteBuffer) {
        int iA0H = AbstractC7609F5w.A0H(byteBuffer);
        if (iA0H == 1) {
            return new AudioRelease.Available(FfiConverterSequenceTypeAudioClip.INSTANCE.read(byteBuffer));
        }
        if (iA0H == 2) {
            return new AudioRelease.Withheld(FfiConverterTypeReleaseReason.INSTANCE.read(byteBuffer));
        }
        throw AbstractC7608F5v.A0l();
    }

    @Override // com.hatch.browser.protocol.FfiConverter
    public void write(AudioRelease audioRelease, ByteBuffer byteBuffer) {
        boolean zA1Y = C60P.A1Y(audioRelease, byteBuffer);
        if (audioRelease instanceof AudioRelease.Available) {
            byteBuffer.putInt(zA1Y ? 1 : 0);
            FfiConverterSequenceTypeAudioClip.INSTANCE.write(((AudioRelease.Available) audioRelease).clips, byteBuffer);
        } else {
            if (!(audioRelease instanceof AudioRelease.Withheld)) {
                throw C3cG.A0q();
            }
            byteBuffer.putInt(2);
            AbstractC7611F5y.A0q(((AudioRelease.Withheld) audioRelease).reason, byteBuffer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [com.hatch.browser.protocol.AudioRelease, java.lang.Object] */
    @Override // com.hatch.browser.protocol.FfiConverterRustBuffer
    public /* bridge */ /* synthetic */ AudioRelease lift(RustBuffer.ByValue byValue) {
        return AbstractC7609F5w.A0q(this, byValue);
    }
}
