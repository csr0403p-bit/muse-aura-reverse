package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.EwP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7449EwP implements Ejq {
    public final Drawable A00;

    @Override // X.Ejq
    public final String ADg() {
        return "DrawableImageSource";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(BV5.A0N(obj))) {
            return false;
        }
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.DrawableImageSource");
        return this.A00.equals(((C7449EwP) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C3cJ.A0M("DrawableImageSource(drawable=", this.A00);
    }

    public C7449EwP(Drawable drawable) {
        this.A00 = drawable;
    }
}
