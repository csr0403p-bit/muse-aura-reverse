package androidx.media3.decoder;

import X.FGI;

/* loaded from: classes5.dex */
public final class DecoderInputBuffer$InsufficientCapacityException extends IllegalStateException {
    public final int currentCapacity;
    public final int requiredCapacity;

    public DecoderInputBuffer$InsufficientCapacityException(int i, int i2) {
        super(FGI.A0Y("Buffer too small (", " < ", ")", i, i2));
        this.currentCapacity = i;
        this.requiredCapacity = i2;
    }
}
