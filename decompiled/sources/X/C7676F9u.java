package X;

import java.util.List;

/* renamed from: X.F9u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7676F9u implements InterfaceC7738FCp<FCA> {
    public final FBB A00;

    @Override // X.InterfaceC7738FCp
    public final /* bridge */ /* synthetic */ void A6d(AbstractC7688FAh abstractC7688FAh, Object obj) {
        Hgy[] hgyArr;
        List listA0X;
        FCA fcaA04 = (FCA) obj;
        if (fcaA04 != null) {
            F9b f9bA03 = FBA.A03(this.A00);
            AbstractC8162FXe.A02("Evaluation Context can only be set from the UI Thread");
            f9bA03.A0P = abstractC7688FAh;
            if (abstractC7688FAh != null) {
                throw BV4.A0a("markAwaitingCompletion");
            }
            FCA fca = f9bA03.A08;
            if (fca != null) {
                if (fca.A03 == fcaA04.A03) {
                    return;
                }
                fca.A02.A03.A00();
                fcaA04 = fcaA04.A04(fca.A03);
            }
            F8I f8i = f9bA03.A05;
            if (f8i != null) {
                AbstractC8162FXe.A02("EvaluationContext can only be set from the UI Thread");
                f8i.A00 = fcaA04;
            }
            f9bA03.A08 = fcaA04;
            FA0 fa0 = fcaA04.A02;
            f9bA03.A06 = new FAK(fa0);
            C7671F9p c7671F9p = f9bA03.A0E;
            C7384Etj.A0Y(fa0, 0);
            c7671F9p.A00 = new C7677F9v(fa0);
            C7670F9o c7670F9o = f9bA03.A0F;
            FA0 fa02 = f9bA03.A08.A02;
            c7670F9o.A00 = fa02.A04;
            FAE<FAT> fae = fa02.A03;
            FAV fav = f9bA03.A0C;
            C7384Etj.A0Y(fav, 0);
            AbstractC8162FXe.A02("Handler's commit hook can only be changed on the main thread");
            int i = fae.A00;
            if (i != 2 && i != 1) {
                fae.A00 = 1;
                fae.A01 = fav;
                synchronized (fae) {
                    List<FAT> list = fae.A02;
                    listA0X = list != null ? AbstractC0878AGe.A0X(list) : null;
                    List<FAT> list2 = fae.A02;
                    if (list2 != null) {
                        list2.clear();
                    }
                }
                if (listA0X != null) {
                    int size = listA0X.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        FAT fat = (FAT) listA0X.get(i2);
                        if (fae.A00 != 2) {
                            AbstractC8162FXe.A01(new RunnableC7675F9t(fav, fat));
                        }
                    }
                }
            }
            List<Hgy> list3 = f9bA03.A0H;
            synchronized (list3) {
                hgyArr = (Hgy[]) list3.toArray(new Hgy[0]);
            }
            if (0 < hgyArr.length) {
                throw BV4.A0a("onCommit");
            }
        }
    }

    public C7676F9u(FBB fbb) {
        this.A00 = fbb;
    }
}
