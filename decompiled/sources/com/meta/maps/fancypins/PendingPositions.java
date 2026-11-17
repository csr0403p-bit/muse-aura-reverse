package com.meta.maps.fancypins;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PendingPositions {
    public int count;
    public long frameIdentity;
    public int[] slotIndices = new int[0];
    public String[] pinIds = new String[0];
    public float[] screenXs = new float[0];
    public float[] screenYs = new float[0];

    public final void setPinIds(String[] strArr) {
        C7384Etj.A0Y(strArr, 0);
        this.pinIds = strArr;
    }

    public final void setScreenXs(float[] fArr) {
        C7384Etj.A0Y(fArr, 0);
        this.screenXs = fArr;
    }

    public final void setScreenYs(float[] fArr) {
        C7384Etj.A0Y(fArr, 0);
        this.screenYs = fArr;
    }

    public final void setSlotIndices(int[] iArr) {
        C7384Etj.A0Y(iArr, 0);
        this.slotIndices = iArr;
    }

    public final int getCount() {
        return this.count;
    }

    public final long getFrameIdentity() {
        return this.frameIdentity;
    }

    public final String[] getPinIds() {
        return this.pinIds;
    }

    public final float[] getScreenXs() {
        return this.screenXs;
    }

    public final float[] getScreenYs() {
        return this.screenYs;
    }

    public final int[] getSlotIndices() {
        return this.slotIndices;
    }

    public final void reset(int i) {
        this.frameIdentity = 0L;
        this.count = 0;
        if (this.slotIndices.length < i) {
            this.slotIndices = new int[i];
            this.pinIds = new String[i];
            this.screenXs = new float[i];
            this.screenYs = new float[i];
        }
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setFrameIdentity(long j) {
        this.frameIdentity = j;
    }
}
