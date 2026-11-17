package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.I0w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10652I0w implements BpS {
    public final int $t;
    public final Object A00;

    public C10652I0w(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.BpS
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        if (this.$t != 0) {
            return this.A00;
        }
        Fragment fragment = (Fragment) this.A00;
        Object obj2 = fragment.mHost;
        return obj2 instanceof InterfaceC10559Hsu ? ((InterfaceC10559Hsu) obj2).getActivityResultRegistry() : fragment.requireActivity().activityResultRegistry;
    }
}
