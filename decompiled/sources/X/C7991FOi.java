package X;

import android.view.View;

/* renamed from: X.FOi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7991FOi implements FSC {
    public final /* synthetic */ FOV A00;
    public final /* synthetic */ FOX A01;
    public final /* synthetic */ boolean A02;

    public C7991FOi(FOV fov, FOX fox, boolean z) {
        this.A00 = fov;
        this.A01 = fox;
        this.A02 = z;
    }

    @Override // X.FSC
    public final void ASh(int i) {
    }

    @Override // X.FSC
    public final void AUm(View view, int i) {
        FOV fov = this.A00;
        fov.requestLayout();
        fov.invalidate();
    }

    @Override // X.FSC
    public final void AUp(View view, FSE fse) {
        FOX fox = this.A01;
        FS7 fs7 = fox.A0A;
        fs7.A0J.remove(this);
        if (this.A02) {
            fox.A07 = null;
            fs7.A00 = -1;
            fs7.A06.A0A(null);
        }
    }
}
