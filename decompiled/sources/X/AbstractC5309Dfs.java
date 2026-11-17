package X;

/* renamed from: X.Dfs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5309Dfs {
    public int A00 = -1;
    public boolean A01;
    public final Bs1<? super T> A02;
    public final /* synthetic */ AbstractC5306Dfp A03;

    public AbstractC5309Dfs(AbstractC5306Dfp abstractC5306Dfp, Bs1<? super T> bs1) {
        this.A03 = abstractC5306Dfp;
        this.A02 = bs1;
    }

    public final void A00(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            AbstractC5306Dfp abstractC5306Dfp = this.A03;
            int i = z ? 1 : -1;
            int i2 = abstractC5306Dfp.A00;
            abstractC5306Dfp.A00 = i + i2;
            if (!abstractC5306Dfp.A02) {
                abstractC5306Dfp.A02 = true;
                while (true) {
                    try {
                        int i3 = abstractC5306Dfp.A00;
                        if (i2 == i3) {
                            break;
                        }
                        if (i2 == 0) {
                            if (i3 > 0) {
                                abstractC5306Dfp.A03();
                            }
                        } else if (i2 > 0 && i3 == 0) {
                            abstractC5306Dfp.A04();
                        }
                        i2 = i3;
                    } finally {
                        abstractC5306Dfp.A02 = false;
                    }
                }
            }
            if (this.A01) {
                abstractC5306Dfp.A06(this);
            }
        }
    }
}
