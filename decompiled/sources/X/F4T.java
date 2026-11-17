package X;

import android.app.Application;

/* loaded from: classes5.dex */
public final class F4T implements C5E {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public F4T(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.C5E
    /* renamed from: create */
    public final /* bridge */ /* synthetic */ Object create2(C3241C4y c3241C4y) {
        switch (this.$t) {
            case 0:
                return new C62((Application) this.A00, (InterfaceC3222C4f) this.A01, F18.A00(c3241C4y));
            case 1:
                Application application = (Application) this.A00;
                InterfaceC3222C4f interfaceC3222C4f = (InterfaceC3222C4f) this.A01;
                C4Z c4zA00 = F18.A00(c3241C4y);
                AnonymousClass003.A0v(application, c4zA00);
                return new C5r(application, interfaceC3222C4f, c4zA00);
            case 2:
                return new C5o((Application) this.A00, (InterfaceC3222C4f) this.A01, F18.A00(c3241C4y));
            case 3:
                return new C3257C5z((Application) this.A01, c3241C4y.A00, BeS.A01(c3241C4y), (F18) this.A00);
            case 4:
                return new C63((Application) this.A00, (InterfaceC3222C4f) this.A01, F18.A00(c3241C4y));
            case 5:
                return new C5n((Application) this.A00, (InterfaceC3222C4f) this.A01, F18.A00(c3241C4y));
            case 6:
                return new C3251C5p((Application) this.A00, (InterfaceC3222C4f) this.A01, F18.A00(c3241C4y));
            default:
                C54 c54A01 = BeS.A01(c3241C4y);
                return new C3256C5y((C3267C6q) this.A00, c3241C4y.A00, c54A01, this, (F18) this.A01);
        }
    }
}
