package X;

import java.util.List;

/* renamed from: X.EtK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7376EtK extends C06G implements InterfaceC7824FGf {
    public final int A00;
    public final List<InterfaceC7430Evn> A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7376EtK) {
                C7376EtK c7376EtK = (C7376EtK) obj;
                if (this.A00 != c7376EtK.A00 || !C7384Etj.areEqual(this.A01, c7376EtK.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7376EtK(int i, List<? extends InterfaceC7430Evn> list) {
        this.A00 = i;
        this.A01 = list;
        this.A02 = AnonymousClass005.A0G(list, i * 31);
    }
}
