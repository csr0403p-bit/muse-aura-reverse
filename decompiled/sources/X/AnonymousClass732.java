package X;

import android.os.Bundle;

/* renamed from: X.732, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass732 extends AnonymousClass738 {
    public int A00;
    public Bundle A01;
    public C76B A02;

    public AnonymousClass732() {
        super(Integer.MAX_VALUE, true);
        this.A02 = C76B.A00;
        this.A00 = 0;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A02;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A02 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableLazyList(modifier=");
        sbA0x.append(this.A02);
        sbA0x.append(", horizontalAlignment=");
        sbA0x.append((Object) FGI.A0G("Horizontal(value=", ')', this.A00));
        sbA0x.append(", activityOptions=");
        return AnonymousClass738.A00(this, this.A01, sbA0x);
    }
}
