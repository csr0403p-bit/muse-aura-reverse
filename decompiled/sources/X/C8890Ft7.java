package X;

/* renamed from: X.Ft7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8890Ft7 extends C7438Evz implements G0U {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8890Ft7(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 22:
            case 23:
                cls = C9143FzC.class;
                str = "kilocalories(D)Landroidx/health/connect/client/units/Energy;";
                i2 = 0;
                i3 = 1;
                str2 = "kilocalories";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                cls = C9145FzE.class;
                str = "millimetersOfMercury(D)Landroidx/health/connect/client/units/Pressure;";
                i2 = 0;
                i3 = 1;
                str2 = "millimetersOfMercury";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                cls = C9119Fyk.class;
                str = "meters(D)Landroidx/health/connect/client/units/Length;";
                i2 = 0;
                i3 = 1;
                str2 = "meters";
                break;
            case 13:
                cls = C9148FzH.class;
                str = "liters(D)Landroidx/health/connect/client/units/Volume;";
                i2 = 0;
                i3 = 1;
                str2 = "liters";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                cls = C9120Fyl.class;
                str = "grams(D)Landroidx/health/connect/client/units/Mass;";
                i2 = 0;
                i3 = 1;
                str2 = "grams";
                break;
        }
        super(i3, obj, cls, str2, str, i2);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
            case 1:
            case 22:
            case 23:
                return AbstractC7608F5v.A0I(BV6.A00(obj));
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return new C9095FyM(BV6.A00(obj));
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return AbstractC7608F5v.A0J(BV6.A00(obj));
            case 13:
                double dA00 = BV6.A00(obj);
                C9148FzH c9148FzH = C9079Fy6.A02;
                return new C9079Fy6(EnumC9092FyJ.A02, dA00);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                double dA002 = BV6.A00(obj);
                C9120Fyl c9120Fyl = C9072Fxy.A02;
                return new C9072Fxy(EnumC9160FzT.A02, dA002);
        }
    }
}
