package X;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class DQh {
    public static final void A00(DQd dQd, G0U g0u) {
        int i;
        DQd dQd2 = new DQd(EIN.MAX_BIND_PARAMETER_CNT);
        int size = dQd.size();
        int i2 = 0;
        loop0: while (true) {
            i = 0;
            while (i2 < size) {
                dQd2.put(dQd.A05(i2), dQd.A07(i2));
                i2++;
                i++;
                if (i == 999) {
                    break;
                }
            }
            g0u.invoke(dQd2);
            dQd2.clear();
        }
        if (i > 0) {
            g0u.invoke(dQd2);
        }
    }
}
