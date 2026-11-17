package com.facebook.aura.conversation.view.richcontent;

import X.AXN;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C1D5;
import X.C1DG;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class InsetCornerSize extends C06G implements C1D5 {
    public final C1D5 base;
    public final float inset;

    public InsetCornerSize(C1D5 c1d5, float f) {
        C7384Etj.A0Y(c1d5, 0);
        this.base = c1d5;
        this.inset = f;
    }

    /* renamed from: copy-3ABfNKs, reason: not valid java name */
    public final InsetCornerSize m695copy3ABfNKs(C1D5 c1d5, float f) {
        C7384Etj.A0Y(c1d5, 0);
        return new InsetCornerSize(c1d5, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InsetCornerSize) {
                InsetCornerSize insetCornerSize = (InsetCornerSize) obj;
                if (!C7384Etj.areEqual(this.base, insetCornerSize.base) || !C1DG.A08(this.inset, insetCornerSize.inset)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1D5
    /* renamed from: toPx-TmRCtEA */
    public float mo1toPxTmRCtEA(long j, AXN axn) {
        C7384Etj.A0Y(axn, 1);
        float fMo1toPxTmRCtEA = this.base.mo1toPxTmRCtEA(j, axn) - axn.Ah4(this.inset);
        if (fMo1toPxTmRCtEA < 0.0f) {
            return 0.0f;
        }
        return fMo1toPxTmRCtEA;
    }

    /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ InsetCornerSize m693copy3ABfNKs$default(InsetCornerSize insetCornerSize, C1D5 c1d5, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            c1d5 = insetCornerSize.base;
        }
        if ((i & 2) != 0) {
            f = insetCornerSize.inset;
        }
        C7384Etj.A0Y(c1d5, 0);
        return new InsetCornerSize(c1d5, f);
    }

    public final C1D5 component1() {
        return this.base;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m694component2D9Ej5fM() {
        return this.inset;
    }

    public final C1D5 getBase() {
        return this.base;
    }

    /* renamed from: getInset-D9Ej5fM, reason: not valid java name */
    public final float m696getInsetD9Ej5fM() {
        return this.inset;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.base) + Float.floatToIntBits(this.inset);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ InsetCornerSize(C1D5 c1d5, float f, C06H c06h) {
        this(c1d5, f);
    }
}
