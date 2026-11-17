package X;

/* renamed from: X.FOg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7989FOg {
    public static final FPN A00(EnumC7948FMe enumC7948FMe, boolean z) {
        FPN c7986FOd;
        AbstractC7957FMn abstractC7957FMn = AbstractC7957FMn.$redex_init_class;
        switch (enumC7948FMe.ordinal()) {
            case 0:
                return new C7986FOd(null, false, z);
            case 1:
                c7986FOd = new C7988FOf(0.75f, z);
                break;
            case 2:
                c7986FOd = new C7988FOf(0.75f, false);
                break;
            case 3:
                c7986FOd = new C7986FOd(Float.valueOf(0.75f), true, z);
                break;
            case 4:
                c7986FOd = FOE.A00;
                break;
            case 5:
                c7986FOd = FPO.A00;
                break;
            case 6:
                c7986FOd = new C7987FOe(0.75f, z);
                break;
            case 7:
                c7986FOd = new C7988FOf(0.75f, true);
                break;
            case 8:
                c7986FOd = new C7987FOe(1.0f, z);
                break;
            default:
                throw C3cG.A0q();
        }
        return c7986FOd;
    }
}
