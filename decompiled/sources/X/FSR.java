package X;

import android.view.View;

/* loaded from: classes6.dex */
public final class FSR implements G3f {
    public final /* synthetic */ FTN A00;

    public FSR(FTN ftn) {
        this.A00 = ftn;
    }

    @Override // X.G3f
    public final View ADX(int i) {
        return this.A00.A0x(i);
    }

    @Override // X.G3f
    public final int AIZ() {
        FTN ftn = this.A00;
        return ftn.A03 - ftn.A0l();
    }

    @Override // X.G3f
    public final int AIb() {
        return this.A00.A0k();
    }

    @Override // X.G3f
    public final int ADZ(View view) {
        return view.getRight() + FTf.A00(view).right + AbstractC7607F5u.A0e(view).rightMargin;
    }

    @Override // X.G3f
    public final int ADa(View view) {
        return (view.getLeft() - FTf.A00(view).left) - AbstractC7607F5u.A0e(view).leftMargin;
    }
}
