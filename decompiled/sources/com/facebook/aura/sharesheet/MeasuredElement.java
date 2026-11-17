package com.facebook.aura.sharesheet;

import X.C7384Etj;

/* loaded from: classes4.dex */
public final class MeasuredElement {
    public final ShareElement element;
    public final int height;
    public final int top;

    public MeasuredElement(ShareElement shareElement, int i, int i2) {
        C7384Etj.A0Y(shareElement, 0);
        this.element = shareElement;
        this.top = i;
        this.height = i2;
    }

    public final ShareElement getElement() {
        return this.element;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTop() {
        return this.top;
    }
}
