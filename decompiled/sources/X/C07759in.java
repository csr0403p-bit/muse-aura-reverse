package X;

import X.AMl;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation3.runtime.NavBackStack;

/* renamed from: X.9in, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07759in<T extends AMl> implements C9hr<NavBackStack<T>> {
    public final C07689id<T> A00;
    public final C9hr<T> A01;
    public final C9iZ A02;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        return new NavBackStack((SnapshotStateList) interfaceC07829iw.A8b(this.A00));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A02;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        interfaceC07789is.AAR(((NavBackStack) obj).A00, this.A00);
    }

    public C07759in(C9hr<T> c9hr) {
        this.A01 = c9hr;
        C07689id<T> c07689id = new C07689id<>(c9hr);
        this.A00 = c07689id;
        this.A02 = C9iY.A04("androidx.navigation3.runtime.NavBackStack", c07689id.A01);
    }
}
