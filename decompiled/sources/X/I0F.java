package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class I0F extends AbstractC8334Fc1 {
    public final int $t;
    public int A00;
    public boolean A01;
    public final Object A02;

    public I0F(C8264Fam c8264Fam) {
        this.$t = 0;
        this.A02 = c8264Fam;
        this.A01 = false;
        this.A00 = 0;
    }

    @Override // X.AbstractC8334Fc1, X.FT0
    public final void onAnimationCancel(View view) {
        if (1 - this.$t == 0) {
            this.A01 = true;
        }
    }

    @Override // X.AbstractC8334Fc1, X.FT0
    public final void onAnimationEnd(View view) {
        if (this.$t != 0) {
            if (this.A01) {
                return;
            }
            ((C8254Faa) this.A02).A09.setVisibility(this.A00);
            return;
        }
        int i = this.A00 + 1;
        this.A00 = i;
        C8264Fam c8264Fam = (C8264Fam) this.A02;
        if (i == c8264Fam.A04.size()) {
            FT0 ft0 = c8264Fam.A02;
            if (ft0 != null) {
                ft0.onAnimationEnd(null);
            }
            this.A00 = 0;
            this.A01 = false;
            c8264Fam.A03 = false;
        }
    }

    @Override // X.AbstractC8334Fc1, X.FT0
    public final void onAnimationStart(View view) {
        if (this.$t != 0) {
            ((C8254Faa) this.A02).A09.setVisibility(0);
            return;
        }
        if (this.A01) {
            return;
        }
        this.A01 = true;
        FT0 ft0 = ((C8264Fam) this.A02).A02;
        if (ft0 != null) {
            ft0.onAnimationStart(null);
        }
    }

    public I0F(C8254Faa c8254Faa, int i) {
        this.$t = 1;
        this.A02 = c8254Faa;
        this.A00 = i;
        this.A01 = false;
    }
}
