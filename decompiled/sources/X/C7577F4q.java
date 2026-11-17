package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.F4q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7577F4q implements InterfaceC5344Dgn {
    public final int $t;
    public final Object A00;

    public C7577F4q(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.InterfaceC5344Dgn
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                E01 e01 = (E01) this.A00;
                E00 e00 = (E00) obj;
                E02 e02 = new E02(E0I.A00(e00.A03, e00.A00), e00.A02);
                e01.A08.add(e02);
                long j = e01.A01;
                if (j == -9223372036854775807L || e00.A01 >= j) {
                    InterfaceC5563Dkg interfaceC5563Dkg = e01.A02;
                    C1G.A05(interfaceC5563Dkg);
                    byte[] bArr = e02.A01;
                    int length = bArr.length;
                    E1P e1p = e01.A06;
                    e1p.A0T(bArr, length);
                    interfaceC5563Dkg.Abv(e1p, length);
                    InterfaceC5563Dkg.A02(e01.A02, length, e02.A00);
                    break;
                }
                break;
            case 1:
                ((ImmutableList.Builder) this.A00).add((ImmutableList.Builder) obj);
                break;
            default:
                InterfaceC5344Dgn interfaceC5344Dgn = (InterfaceC5344Dgn) this.A00;
                if (obj instanceof InterfaceC5369DhL) {
                    interfaceC5344Dgn.accept(obj);
                    break;
                }
                break;
        }
    }
}
