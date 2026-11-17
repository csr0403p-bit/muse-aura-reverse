package com.meta.maps.fancypins;

import X.BV4;
import X.C06H;
import X.C3cI;
import X.C7384Etj;
import X.C8j3;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.HashSet;

/* loaded from: classes6.dex */
public final class FancyPinSlotRows {
    public final SparseIntArray effectiveRanks;
    public final SparseArray<FancyPinPresentation> presentations;
    public final SparseArray<Float> zOrderOverrides;

    public FancyPinSlotRows() {
        this(0);
    }

    public final void put(int i, FancyPinPresentation fancyPinPresentation, int i2, Float f) {
        C7384Etj.A0Y(fancyPinPresentation, 1);
        this.presentations.put(i, fancyPinPresentation);
        this.effectiveRanks.put(i, i2);
        if (f != null) {
            this.zOrderOverrides.put(i, Float.valueOf(f.floatValue()));
        }
    }

    public final boolean contains(int i) {
        return C8j3.A1Q(this.presentations.indexOfKey(i));
    }

    public final SparseIntArray getEffectiveRanks() {
        return this.effectiveRanks;
    }

    public final SparseArray<FancyPinPresentation> getPresentations() {
        return this.presentations;
    }

    public final SparseArray<Float> getZOrderOverrides() {
        return this.zOrderOverrides;
    }

    public final int highestSlot() {
        SparseArray<FancyPinPresentation> sparseArray = this.presentations;
        if (sparseArray.size() == 0) {
            return -1;
        }
        return sparseArray.keyAt(sparseArray.size() - 1);
    }

    public final HashSet<String> pinIds() {
        HashSet<String> hashSet = new HashSet<>(this.presentations.size());
        int size = this.presentations.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(this.presentations.valueAt(i).pin.id);
        }
        return hashSet;
    }

    public /* synthetic */ FancyPinSlotRows(int i, int i2, C06H c06h) {
        this(C3cI.A00(i2, i));
    }

    public FancyPinSlotRows(int i) {
        this.presentations = new SparseArray<>(i);
        this.effectiveRanks = new SparseIntArray(i);
        this.zOrderOverrides = BV4.A0B();
    }
}
