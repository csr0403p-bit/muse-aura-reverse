package com.facebook.aura.qpl;

import X.AbstractC4980DJx;
import X.C06H;
import X.C7384Etj;
import X.DIF;
import X.DJP;

/* loaded from: classes5.dex */
public final class AuraQPLConfiguration extends AbstractC4980DJx {
    public static final Companion Companion = new Companion();
    public static final int DEFAULT_SAMPLE_RATE = 1;
    public final DIF serverControlledQPLConfig;

    public AuraQPLConfiguration(DIF dif) {
        C7384Etj.A0Y(dif, 0);
        this.serverControlledQPLConfig = dif;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.DIF
    public long getMetadataConfigForMarker(int i) {
        return this.serverControlledQPLConfig.getMetadataConfigForMarker(i);
    }

    @Override // X.DIF
    public long getSamplingSpecForMarker(int i) {
        long samplingSpecForMarker = this.serverControlledQPLConfig.getSamplingSpecForMarker(i);
        return ((int) samplingSpecForMarker) == -1 ? DJP.A00(1, 3, 1) : samplingSpecForMarker;
    }

    @Override // X.DIF
    public int randomlySample(int i) {
        return this.serverControlledQPLConfig.randomlySample(i);
    }
}
