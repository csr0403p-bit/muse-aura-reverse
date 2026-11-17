package com.facebook.aura.composer.dictation;

import X.AGE;
import X.AGF;
import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class WaveformBuffer {
    public static final int $stable = 8;
    public static final int CAPACITY = 200;
    public static final Companion Companion = new Companion();
    public final float[] data;
    public final MutableState elapsedSeconds$delegate;
    public final MutableState isProcessing$delegate;
    public int sampleCount;
    public final VoiceDictationSendRequest sendRequest;

    public final float get(int i) {
        int i2;
        int i3;
        if (i < 0 || i >= (i2 = this.sampleCount) || (i2 - 200 >= 0 && i < i3)) {
            return 0.0f;
        }
        return this.data[i % 200];
    }

    public /* synthetic */ WaveformBuffer(VoiceDictationSendRequest voiceDictationSendRequest, int i, C06H c06h) {
        this((i & 1) != 0 ? new VoiceDictationSendRequest() : voiceDictationSendRequest);
    }

    public final long getElapsedSeconds() {
        return ((Number) this.elapsedSeconds$delegate.getValue()).longValue();
    }

    public final int getSampleCount() {
        return this.sampleCount;
    }

    public final boolean isProcessing() {
        return MutableState.A0A(this.isProcessing$delegate);
    }

    public final boolean isSendRequested() {
        return this.sendRequest.isPending;
    }

    public final void push(float f) {
        float fA00 = AnonymousClass003.A00((f - (-50.0f)) / 50.0f);
        float[] fArr = this.data;
        int i = this.sampleCount;
        fArr[i % 200] = fA00;
        this.sampleCount = i + 1;
    }

    public final void reset() {
        float[] fArr = this.data;
        Arrays.fill(fArr, 0, fArr.length, 0.0f);
        this.sampleCount = 0;
        setProcessing(false);
        setElapsedSeconds(0L);
    }

    public final void setElapsedSeconds(long j) {
        this.elapsedSeconds$delegate.Af8(Long.valueOf(j));
    }

    public final void setProcessing(boolean z) {
        MutableState.A09(z, this.isProcessing$delegate);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public WaveformBuffer(VoiceDictationSendRequest voiceDictationSendRequest) {
        C7384Etj.A0Y(voiceDictationSendRequest, 0);
        this.sendRequest = voiceDictationSendRequest;
        this.data = new float[200];
        AGE ageA01 = AGF.A01();
        this.isProcessing$delegate = new ParcelableSnapshotMutableState(ageA01, false);
        this.elapsedSeconds$delegate = new ParcelableSnapshotMutableState(ageA01, 0L);
    }

    public WaveformBuffer() {
        this(new VoiceDictationSendRequest());
    }
}
