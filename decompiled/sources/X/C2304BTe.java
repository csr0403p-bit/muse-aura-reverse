package X;

import androidx.glance.appwidget.GlanceAppWidgetReceiver;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.BTe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2304BTe implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final String A02;

    public C2304BTe(Object obj, String str, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        int iA02;
        int length;
        int i;
        if (this.$t != 0) {
            return GlanceAppWidgetReceiver.onReceive$lambda$0$1((GlanceAppWidgetReceiver) this.A01, this.A00, this.A02, (C76r) obj);
        }
        String str = this.A02;
        List list = (List) this.A01;
        int i2 = this.A00;
        C1891AtA c1891AtA = (C1891AtA) obj;
        Au3 au3 = c1891AtA.A02;
        if (au3 != null) {
            long j = au3.A00;
            AbstractC1921Ati.A01(c1891AtA, str, (int) (j >> 32), AnonymousClass002.A09(j));
            length = str.length();
            if (length > 0) {
                iA02 = (int) (au3.A00 >> 32);
                i = iA02 + length;
                c1891AtA.A06(list, iA02, i);
            }
        } else {
            long j2 = c1891AtA.A00;
            iA02 = Au3.A02(j2);
            AbstractC1921Ati.A01(c1891AtA, str, iA02, Au3.A01(j2));
            length = str.length();
            if (length > 0) {
                i = length + iA02;
                c1891AtA.A06(list, iA02, i);
            }
        }
        int iA022 = Au3.A02(c1891AtA.A00) + i2;
        int i3 = iA022 - length;
        if (i2 > 0) {
            i3 = iA022 - 1;
        }
        int iA04 = ATD.A04(i3, 0, c1891AtA.A05.length());
        c1891AtA.A04(AbstractC1815ArZ.A00(iA04, iA04));
        return Unit.INSTANCE;
    }
}
