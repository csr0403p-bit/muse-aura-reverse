package X;

import androidx.activity.ComponentActivity;
import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ftw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8940Ftw implements Dg3, C2Kw {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C8940Ftw(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) throws NoSuchMethodException, SecurityException {
        switch (this.$t) {
            case 0:
                ComponentActivity.addObserverForBackInvoker$lambda$0((C2186B9f) this.A00, (ComponentActivity) this.A01, c1hy, enumC3085Bxl);
                break;
            case 1:
                C8419Fdc c8419Fdc = (C8419Fdc) this.A00;
                InterfaceC8348FcM interfaceC8348FcM = (InterfaceC8348FcM) this.A01;
                if (enumC3085Bxl == EnumC3085Bxl.ON_DESTROY) {
                    c8419Fdc.A00(interfaceC8348FcM);
                    break;
                }
                break;
            case 2:
                C7384Etj.A0Y(enumC3085Bxl, 1);
                if (enumC3085Bxl == EnumC3085Bxl.ON_START) {
                    ((F2N) this.A00).A05(this);
                    ((SavedStateRegistry) this.A01).A02();
                    break;
                }
                break;
            default:
                Object obj = this.A00;
                C1BO c1bo = (C1BO) this.A01;
                if (enumC3085Bxl == obj) {
                    ((Function0) c1bo.getValue()).invoke();
                    break;
                }
                break;
        }
    }
}
