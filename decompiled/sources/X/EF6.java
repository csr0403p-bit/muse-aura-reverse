package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class EF6 {
    public final List<EEy> A00;
    public final byte[] A01;

    public EF6(String str, byte[] bArr, List<EEy> list) {
        C7384Etj.A0Y(list, 2);
        this.A01 = bArr;
        this.A00 = list;
        if (bArr != null && str == null) {
            throw C60O.A0i("a signature must identify its signing key");
        }
    }
}
