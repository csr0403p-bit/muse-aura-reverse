package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import kotlin.Unit;

/* renamed from: X.8iB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iB implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C8iB(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A01;
        switch (i) {
            case 0:
                ((C7b5) obj3).A00((C7az) this.A02, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 1:
            case 2:
            default:
                C7dr.A01((Icon) this.A02, (C7dr) obj3, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
            case 3:
                C7dr.A00((Drawable) this.A02, (C7dr) obj3, (BFM) obj, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }
}
