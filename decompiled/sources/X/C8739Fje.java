package X;

import java.util.List;

/* renamed from: X.Fje, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8739Fje<T> implements InterfaceC8760Fjz<T> {
    public final List<? extends C8725FjQ<T>> A03;
    public C8725FjQ<T> A01 = null;
    public float A00 = -1.0f;
    public C8725FjQ<T> A02 = A00(0.0f);

    private C8725FjQ<T> A00(float f) {
        List<? extends C8725FjQ<T>> list = this.A03;
        C8725FjQ<T> c8725FjQ = list.get(list.size() - 1);
        if (f < c8725FjQ.A01()) {
            for (int size = list.size() - 2; size >= 1; size--) {
                c8725FjQ = list.get(size);
                if (this.A02 == c8725FjQ || f < c8725FjQ.A01() || f >= c8725FjQ.A00()) {
                }
            }
            return list.get(0);
        }
        return c8725FjQ;
    }

    @Override // X.InterfaceC8760Fjz
    public final C8725FjQ<T> AES() {
        return this.A02;
    }

    @Override // X.InterfaceC8760Fjz
    public final float AFA() {
        return this.A03.get(r1.size() - 1).A00();
    }

    @Override // X.InterfaceC8760Fjz
    public final float AKv() {
        return this.A03.get(0).A01();
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean AOD(float f) {
        C8725FjQ<T> c8725FjQ = this.A01;
        C8725FjQ<T> c8725FjQ2 = this.A02;
        if (c8725FjQ == c8725FjQ2 && this.A00 == f) {
            return true;
        }
        this.A01 = c8725FjQ2;
        this.A00 = f;
        return false;
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean APF(float f) {
        C8725FjQ<T> c8725FjQ = this.A02;
        if (f >= c8725FjQ.A01() && f < c8725FjQ.A00()) {
            return !c8725FjQ.A02();
        }
        this.A02 = A00(f);
        return true;
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean isEmpty() {
        return false;
    }

    public C8739Fje(List<? extends C8725FjQ<T>> list) {
        this.A03 = list;
    }
}
