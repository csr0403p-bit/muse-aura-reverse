package com.facebook.aura.vds.compose.spinner;

import X.AVy;
import X.AbstractC8407FdO;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C1DG;
import X.C7384Etj;
import com.facebook.aura.vds.compose.theme.AuraDrawables;
import com.facebook.aura.vds.compose.theme.AuraDrawablesKt;

/* loaded from: classes.dex */
public final class AuraSpinnerStyle extends C06G {
    public final AVy painter;
    public final float size;
    public static final Companion Companion = new Companion();
    public static final int $stable = AVy.$stable;

    public final class Companion {
        public final AuraSpinnerStyle large(BFM bfm, int i) {
            return new AuraSpinnerStyle(AbstractC8407FdO.A00(bfm, ((AuraDrawables) bfm.A6v(AuraDrawablesKt.LocalAuraDrawables)).spinnerLarge), AnonymousClass002.A0d(bfm).spinnerLarge);
        }

        public final AuraSpinnerStyle small(BFM bfm, int i) {
            return new AuraSpinnerStyle(AbstractC8407FdO.A00(bfm, ((AuraDrawables) bfm.A6v(AuraDrawablesKt.LocalAuraDrawables)).spinnerSmall), AnonymousClass002.A0d(bfm).spinnerSmall);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraSpinnerStyle(AVy aVy, float f) {
        C7384Etj.A0Y(aVy, 0);
        this.painter = aVy;
        this.size = f;
    }

    /* renamed from: copy-3ABfNKs, reason: not valid java name */
    public final AuraSpinnerStyle m2614copy3ABfNKs(AVy aVy, float f) {
        C7384Etj.A0Y(aVy, 0);
        return new AuraSpinnerStyle(aVy, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraSpinnerStyle) {
                AuraSpinnerStyle auraSpinnerStyle = (AuraSpinnerStyle) obj;
                if (!C7384Etj.areEqual(this.painter, auraSpinnerStyle.painter) || !C1DG.A08(this.size, auraSpinnerStyle.size)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: copy-3ABfNKs$default, reason: not valid java name */
    public static /* synthetic */ AuraSpinnerStyle m2612copy3ABfNKs$default(AuraSpinnerStyle auraSpinnerStyle, AVy aVy, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            aVy = auraSpinnerStyle.painter;
        }
        if ((i & 2) != 0) {
            f = auraSpinnerStyle.size;
        }
        C7384Etj.A0Y(aVy, 0);
        return new AuraSpinnerStyle(aVy, f);
    }

    public final AVy component1() {
        return this.painter;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public final float m2613component2D9Ej5fM() {
        return this.size;
    }

    public final AVy getPainter() {
        return this.painter;
    }

    /* renamed from: getSize-D9Ej5fM, reason: not valid java name */
    public final float m2615getSizeD9Ej5fM() {
        return this.size;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.painter) + Float.floatToIntBits(this.size);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraSpinnerStyle(AVy aVy, float f, C06H c06h) {
        this(aVy, f);
    }
}
