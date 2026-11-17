package com.facebook.aura.ui;

import X.AnonymousClass005;
import X.C06G;

/* loaded from: classes.dex */
public final class DraggedRowPosition extends C06G {
    public static final int $stable = 0;
    public final int height;
    public final float offsetY;
    public final float restingTopFromGroupBottom;
    public final int targetIndex;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DraggedRowPosition) {
                DraggedRowPosition draggedRowPosition = (DraggedRowPosition) obj;
                if (Float.compare(this.restingTopFromGroupBottom, draggedRowPosition.restingTopFromGroupBottom) != 0 || this.height != draggedRowPosition.height || Float.compare(this.offsetY, draggedRowPosition.offsetY) != 0 || this.targetIndex != draggedRowPosition.targetIndex) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DraggedRowPosition copy$default(DraggedRowPosition draggedRowPosition, float f, int i, float f2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            f = draggedRowPosition.restingTopFromGroupBottom;
        }
        if ((i3 & 2) != 0) {
            i = draggedRowPosition.height;
        }
        if ((i3 & 4) != 0) {
            f2 = draggedRowPosition.offsetY;
        }
        if ((i3 & 8) != 0) {
            i2 = draggedRowPosition.targetIndex;
        }
        return new DraggedRowPosition(f, i, f2, i2);
    }

    public final float component1() {
        return this.restingTopFromGroupBottom;
    }

    public final int component2() {
        return this.height;
    }

    public final float component3() {
        return this.offsetY;
    }

    public final int component4() {
        return this.targetIndex;
    }

    public final DraggedRowPosition copy(float f, int i, float f2, int i2) {
        return new DraggedRowPosition(f, i, f2, i2);
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRestingTopFromGroupBottom() {
        return this.restingTopFromGroupBottom;
    }

    public final int getTargetIndex() {
        return this.targetIndex;
    }

    public int hashCode() {
        return AnonymousClass005.A02(((Float.floatToIntBits(this.restingTopFromGroupBottom) * 31) + this.height) * 31, this.offsetY) + this.targetIndex;
    }

    public DraggedRowPosition(float f, int i, float f2, int i2) {
        this.restingTopFromGroupBottom = f;
        this.height = i;
        this.offsetY = f2;
        this.targetIndex = i2;
    }

    public String toString() {
        return super.toString();
    }
}
