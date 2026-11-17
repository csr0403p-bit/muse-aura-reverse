package X;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;

/* renamed from: X.9id, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07689id<T> implements C9hr<SnapshotStateList<T>> {
    public final C9hr<List<T>> A00;
    public final C9iZ A01;
    public final C9hr<T> A02;

    public C07689id(C9hr<T> c9hr) {
        C7384Etj.A0Y(c9hr, 0);
        this.A02 = c9hr;
        A64 a64A19 = C3cG.A19(c9hr);
        this.A00 = a64A19;
        this.A01 = C9iY.A04("androidx.compose.runtime.SnapshotStateList", a64A19.A00);
    }

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Iterable iterable = (Iterable) interfaceC07829iw.A8b(this.A00);
        SnapshotStateList snapshotStateList = new SnapshotStateList();
        snapshotStateList.addAll(AbstractC0878AGe.A0X(iterable));
        return snapshotStateList;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        interfaceC07789is.AAR(obj, this.A00);
    }
}
