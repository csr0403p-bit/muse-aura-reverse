package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FSQ implements G3f {
    public final /* synthetic */ FTN A00;

    public FSQ(FTN ftn) {
        this.A00 = ftn;
    }

    @Override // X.G3f
    public final View ADX(int i) {
        return this.A00.A0x(i);
    }

    @Override // X.G3f
    public final int AIZ() {
        FTN ftn = this.A00;
        return ftn.A00 - ftn.A0j();
    }

    @Override // X.G3f
    public final int AIb() {
        return this.A00.A0m();
    }

    @Override // X.G3f
    public final int ADZ(View view) {
        return view.getBottom() + FTf.A00(view).bottom + AbstractC7607F5u.A0e(view).bottomMargin;
    }

    @Override // X.G3f
    public final int ADa(View view) {
        return (view.getTop() - FTf.A00(view).top) - AbstractC7607F5u.A0e(view).topMargin;
    }
}
