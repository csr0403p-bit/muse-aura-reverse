package com.facebook.aura.ui;

import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class ItemPosition extends C06G {
    public static final int $stable = 8;
    public final int index;
    public final Object key;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ItemPosition) {
                ItemPosition itemPosition = (ItemPosition) obj;
                if (this.index != itemPosition.index || !C7384Etj.areEqual(this.key, itemPosition.key)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ItemPosition copy$default(ItemPosition itemPosition, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = itemPosition.index;
        }
        if ((i2 & 2) != 0) {
            obj = itemPosition.key;
        }
        return new ItemPosition(i, obj);
    }

    public final int component1() {
        return this.index;
    }

    public final Object component2() {
        return this.key;
    }

    public final ItemPosition copy(int i, Object obj) {
        return new ItemPosition(i, obj);
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getKey() {
        return this.key;
    }

    public int hashCode() {
        return (this.index * 31) + AnonymousClass006.A0D(this.key);
    }

    public ItemPosition(int i, Object obj) {
        this.index = i;
        this.key = obj;
    }

    public String toString() {
        return super.toString();
    }
}
