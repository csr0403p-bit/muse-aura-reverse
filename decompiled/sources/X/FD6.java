package X;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FD6 implements FDF {
    public static final FD6 A00 = new FD6();

    @Override // X.FDF
    public final void AVc(FD8 fd8) {
        FD4 fd4;
        C7384Etj.A0Y(fd8, 0);
        ArrayList<FD8> arrayList = FD3.A04;
        arrayList.remove(fd8);
        FD8 fd82 = FD3.A01;
        if (fd82 == fd8) {
            fd82 = (FD8) AbstractC0878AGe.A0I(arrayList);
            FD3.A01 = fd82;
        }
        if (fd82 == null || fd82.ACs() != null || (fd4 = FD3.A00) == null) {
            return;
        }
        fd4.A01();
    }
}
