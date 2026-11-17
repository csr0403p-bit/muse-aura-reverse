package X;

import java.util.List;

/* renamed from: X.Fjh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8742Fjh<T> implements InterfaceC8760Fjz<T> {
    public float A00 = -1.0f;
    public final C8725FjQ<T> A01;

    @Override // X.InterfaceC8760Fjz
    public final C8725FjQ<T> AES() {
        return this.A01;
    }

    @Override // X.InterfaceC8760Fjz
    public final float AFA() {
        return this.A01.A00();
    }

    @Override // X.InterfaceC8760Fjz
    public final float AKv() {
        return this.A01.A01();
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean AOD(float f) {
        if (this.A00 == f) {
            return true;
        }
        this.A00 = f;
        return false;
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean APF(float f) {
        return !this.A01.A02();
    }

    @Override // X.InterfaceC8760Fjz
    public final boolean isEmpty() {
        return false;
    }

    public C8742Fjh(List<? extends C8725FjQ<T>> list) {
        this.A01 = list.get(0);
    }
}
