package X;

import android.content.Context;
import android.view.View;

/* loaded from: classes6.dex */
public final class FI8<Content extends View> implements InterfaceC7830FGl<Content> {
    public final FJI<Content> A00;
    public final int A01;
    public final FEZ A02;
    public final Integer A03 = C79.A01;

    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ Object A7d(Context context) {
        C7384Etj.A0Y(context, 0);
        return this.A00.A4G(context);
    }

    @Override // X.InterfaceC7830FGl
    public final Class AIr() {
        return this.A00.getClass();
    }

    @Override // X.InterfaceC7830FGl
    public final FEZ AIs() {
        return this.A02;
    }

    @Override // X.InterfaceC7830FGl
    public final Integer AJX() {
        return this.A03;
    }

    @Override // X.InterfaceC7830FGl
    public final int AY3() {
        return this.A01;
    }

    public FI8(FEZ fez, FJI fji, int i) {
        this.A01 = i;
        this.A02 = fez;
        this.A00 = fji;
    }
}
