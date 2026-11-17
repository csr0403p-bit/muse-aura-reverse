package X;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.F5q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7603F5q implements F18 {
    public final int $t;
    public final Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    public C7603F5q(Object obj, T t) {
        this.$t = t;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.io.File] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, X.DIF] */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, X.COx] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, X.DGY] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, com.facebook.aura.qpl.AuraQplNameProvider] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, X.DIA] */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, X.DJl] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.Object] */
    @Override // X.F18
    /* renamed from: get */
    public final /* bridge */ /* synthetic */ T AMN() {
        T t;
        switch (this.$t) {
            case 0:
                Context context = (Context) this.A00;
                synchronized (DX4.class) {
                    synchronized (DX4.A02) {
                        DX4 dx4 = DX4.A01;
                        t = dx4;
                        if (dx4 == null) {
                            DX4 dx42 = new DX4(context);
                            DX4.A01 = dx42;
                            t = dx42;
                        }
                        C7384Etj.A0X(t);
                    }
                }
                return t;
            case 1:
                Context context2 = ((F37) this.A00).A01;
                String strA00 = AbstractC3294CCd.A00();
                if (strA00 == null) {
                    strA00 = "default";
                }
                return C3cG.A0O(context2.getDir("light_prefs", 0), strA00);
            case 2:
                Application application = ((C3249C5j) this.A00).A0D;
                C7384Etj.A0Y(application, 0);
                String[] strArrSplit = TextUtils.split(AbstractC3265C6o.A00(application), ":");
                C7384Etj.A0U(strArrSplit);
                return strArrSplit.length > 1 ? strArrSplit[1] : "";
            case 3:
                return AbstractC3265C6o.A00(((C3249C5j) this.A00).A0D);
            case 4:
            case 5:
            case 9:
            default:
                return this.A00;
            case 6:
                return ((DIU) this.A00).A09;
            case 7:
                return ((DIU) this.A00).A00;
            case 8:
                return ((DIU) this.A00).A08;
            case 10:
                return ((DIU) this.A00).A05;
            case 11:
                return null;
            case 12:
                return ((DIU) this.A00).A03;
            case 13:
                return ((C4957DIa) this.A00).A00();
        }
    }

    public final String toString() {
        if (14 - this.$t != 0) {
            return super.toString();
        }
        StringBuilder sbA0x = C60O.A0x("of(");
        sbA0x.append(this.A00);
        return BV7.A10(sbA0x);
    }
}
