package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CDK implements CDU {
    public final /* synthetic */ CDH A00;

    @Override // X.CDU
    public final void ATy(String str) {
        List<CDP> listA0X;
        C7384Etj.A0Y(str, 0);
        String strA00 = AbstractC7473ExH.A00(str);
        CDH cdh = this.A00;
        if (cdh.A02(strA00)) {
            synchronized (cdh) {
                listA0X = AbstractC0878AGe.A0X(cdh.A02);
            }
            for (CDP cdp : listA0X) {
                cdp.A01.execute(new CDN(cdp, strA00));
            }
        }
    }

    public CDK(CDH cdh) {
        this.A00 = cdh;
    }
}
