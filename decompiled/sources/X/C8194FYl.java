package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FYl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8194FYl extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/FDW;Ljava/util/List<LX/FDW;>;IIIZIZ)V */
    public C8194FYl(FDW fdw, List list, int i, int i2, int i3, int i4, int i5, boolean z) {
        super(1);
        this.$t = i5;
        this.A05 = fdw;
        this.A04 = list;
        if (i5 != 0) {
            this.A03 = i;
            this.A01 = i2;
            this.A02 = i3;
        } else {
            this.A02 = i;
            this.A01 = i2;
            this.A03 = i3;
        }
        this.A00 = i4;
        this.A06 = z;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ArrayList arrayListA0i;
        int i = this.$t;
        InterfaceC7780FEk interfaceC7780FEk = (InterfaceC7780FEk) obj;
        C7384Etj.A0Y(interfaceC7780FEk, 0);
        FDW fdw = (FDW) this.A05;
        if (i != 0) {
            C7779FEj c7779FEj = new C7779FEj(fdw, interfaceC7780FEk);
            List list = (List) this.A04;
            C7384Etj.A0X(list);
            int i2 = this.A03;
            int i3 = this.A01;
            int i4 = this.A02;
            int i5 = this.A00;
            arrayListA0i = AnonymousClass003.A0i(list);
            int i6 = 0;
            for (Object obj2 : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                FDW fdw2 = (FDW) obj2;
                C7789FEv c7789FEv = C7789FEv.A00;
                C7384Etj.A0X(fdw2);
                int i8 = i4;
                if (i2 == 1) {
                    i8 = i3;
                }
                int i9 = FF1.A00;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                int i10 = i3;
                if (i2 == 1) {
                    i10 = i4;
                }
                arrayListA0i.add(new C7782FEm(C7789FEv.A05(c7779FEj, c7789FEv, fdw2, fdw, interfaceC7780FEk, i2, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i5, true), fdw2));
                i6 = i7;
            }
        } else {
            C7779FEj c7779FEj2 = new C7779FEj(fdw, interfaceC7780FEk);
            List<FDW> list2 = (List) this.A04;
            C7384Etj.A0X(list2);
            int i11 = this.A02;
            int i12 = this.A01;
            int i13 = this.A03;
            int i14 = this.A00;
            arrayListA0i = AnonymousClass003.A0i(list2);
            for (FDW fdw3 : list2) {
                C7789FEv c7789FEv2 = C7789FEv.A00;
                C7384Etj.A0X(fdw3);
                int i15 = i13;
                int i16 = i12;
                if (i11 == 1) {
                    i15 = i12;
                    i16 = i13;
                }
                arrayListA0i.add(new C7782FEm(C7789FEv.A05(c7779FEj2, c7789FEv2, fdw3, fdw, interfaceC7780FEk, i11, i15, i16, i14, true), fdw3));
            }
        }
        if (this.A06) {
            interfaceC7780FEk.Aih(fdw, arrayListA0i);
        }
        C7743FCu.A01(fdw.A04, fdw.A0L(73, false), arrayListA0i);
        return arrayListA0i;
    }
}
