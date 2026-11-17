package com.facebook.aura.file.view;

import X.C06G;

/* loaded from: classes.dex */
public final class DiffSummary extends C06G {
    public static final int $stable = 0;
    public final int added;
    public final int removed;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiffSummary) {
                DiffSummary diffSummary = (DiffSummary) obj;
                if (this.added != diffSummary.added || this.removed != diffSummary.removed) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DiffSummary copy$default(DiffSummary diffSummary, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = diffSummary.added;
        }
        if ((i3 & 2) != 0) {
            i2 = diffSummary.removed;
        }
        return new DiffSummary(i, i2);
    }

    public final int component1() {
        return this.added;
    }

    public final int component2() {
        return this.removed;
    }

    public final DiffSummary copy(int i, int i2) {
        return new DiffSummary(i, i2);
    }

    public final int getAdded() {
        return this.added;
    }

    public final int getRemoved() {
        return this.removed;
    }

    public int hashCode() {
        return (this.added * 31) + this.removed;
    }

    public DiffSummary(int i, int i2) {
        this.added = i;
        this.removed = i2;
    }

    public String toString() {
        return super.toString();
    }
}
