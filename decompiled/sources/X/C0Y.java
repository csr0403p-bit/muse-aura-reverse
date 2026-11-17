package X;

import java.util.TreeSet;

/* loaded from: classes5.dex */
public final class C0Y implements C0S {
    public long A00;
    public final long A01;
    public final TreeSet<C0J> A02 = new TreeSet<>(new C7572F4l(24));

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final synchronized void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        this.A02.add(c0j);
        this.A00 += c0j.A03;
        A00(interfaceC3158C0g, 0L);
    }

    @Override // X.C0R
    public final synchronized void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        this.A02.remove(c0j);
        this.A00 -= c0j.A03;
    }

    @Override // X.C0R
    public final synchronized void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
        AnonymousClass005.A14(interfaceC3158C0g, c0j, c0j2, num);
        AW4(interfaceC3158C0g, c0j);
        AW3(interfaceC3158C0g, c0j2);
    }

    @Override // X.C0S
    public final synchronized void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
        AnonymousClass003.A0u(interfaceC3158C0g, str);
        if (j2 != -1) {
            A00(interfaceC3158C0g, j2);
        }
    }

    private void A00(InterfaceC3158C0g interfaceC3158C0g, long j) {
        C0Q.A01("evictCache");
        while (this.A00 + j > this.A01) {
            TreeSet<C0J> treeSet = this.A02;
            if (treeSet.isEmpty()) {
                break;
            } else {
                interfaceC3158C0g.Aax(treeSet.first());
            }
        }
        C0Q.A00();
    }

    @Override // X.C0S
    public final boolean AbD() {
        return true;
    }

    public C0Y(long j) {
        this.A01 = j;
    }

    @Override // X.C0S
    public final /* synthetic */ void Acy(String str) {
    }
}
