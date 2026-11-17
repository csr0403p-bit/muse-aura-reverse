package X;

import X.AbstractC5809Dpt;
import android.text.TextUtils;

/* renamed from: X.Dpt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5809Dpt<T extends AbstractC5809Dpt<T>> {
    public final int A00;
    public final int A01;
    public final C6154Dwx A02;
    public final C5382DhZ A03;

    public final int A01() {
        return this instanceof C6139Dwh ? ((C6139Dwh) this).A08 : this instanceof C6138Dwg ? ((C6138Dwg) this).A00 : this instanceof C5821DqA ? ((C5821DqA) this).A01 : ((C6135Dwd) this).A00;
    }

    public final boolean A02(T t) {
        boolean z;
        boolean z2;
        int i;
        String str;
        int i2;
        if (this instanceof C6139Dwh) {
            C6139Dwh c6139Dwh = (C6139Dwh) this;
            C6139Dwh c6139Dwh2 = (C6139Dwh) t;
            if (!c6139Dwh.A0A && !C6xC.A00(((AbstractC5809Dpt) c6139Dwh).A02.A0b, ((AbstractC5809Dpt) c6139Dwh2).A02.A0b)) {
                return false;
            }
            if (c6139Dwh.A09.A09) {
                return true;
            }
            if (c6139Dwh.A0H != c6139Dwh2.A0H) {
                return false;
            }
            z = c6139Dwh.A0G;
            z2 = c6139Dwh2.A0G;
        } else {
            if ((this instanceof C6138Dwg) || (this instanceof C5821DqA)) {
                return false;
            }
            C6135Dwd c6135Dwd = (C6135Dwd) this;
            C6135Dwd c6135Dwd2 = (C6135Dwd) t;
            C6136Dwe c6136Dwe = c6135Dwd.A01;
            if (!c6136Dwe.A02 && ((i2 = ((AbstractC5809Dpt) c6135Dwd).A02.A06) == -1 || i2 != ((AbstractC5809Dpt) c6135Dwd2).A02.A06)) {
                return false;
            }
            if (!c6136Dwe.A04 && ((str = ((AbstractC5809Dpt) c6135Dwd).A02.A0b) == null || !TextUtils.equals(str, ((AbstractC5809Dpt) c6135Dwd2).A02.A0b))) {
                return false;
            }
            if (!c6136Dwe.A05 && ((i = ((AbstractC5809Dpt) c6135Dwd).A02.A0L) == -1 || i != ((AbstractC5809Dpt) c6135Dwd2).A02.A0L)) {
                return false;
            }
            if (c6136Dwe.A03) {
                return true;
            }
            if (c6135Dwd.A04 != c6135Dwd2.A04) {
                return false;
            }
            z = c6135Dwd.A03;
            z2 = c6135Dwd2.A03;
        }
        return z == z2;
    }

    public AbstractC5809Dpt(C5382DhZ c5382DhZ, int i, int i2) {
        this.A00 = i;
        this.A03 = c5382DhZ;
        this.A01 = i2;
        this.A02 = c5382DhZ.A04[i2];
    }
}
