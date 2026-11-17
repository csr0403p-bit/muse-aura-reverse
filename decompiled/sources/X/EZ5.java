package X;

/* loaded from: classes5.dex */
public final class EZ5 extends AbstractC7559F3s implements G0V {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZ5(int i) {
        super(2);
        this.$t = i;
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        C06827l3 c06827l3;
        boolean zA07;
        switch (this.$t) {
            case 0:
                ((Number) obj).intValue();
                return Boolean.valueOf(zA07);
            case 1:
                ((Number) obj).intValue();
                str = (String) obj2;
                C7384Etj.A0Y(str, 1);
                c06827l3 = C5192Dd3.A07;
                zA07 = c06827l3.A07(str);
                return Boolean.valueOf(zA07);
            case 2:
                ((Number) obj).intValue();
                str = (String) obj2;
                C7384Etj.A0Y(str, 1);
                c06827l3 = C5192Dd3.A06;
                zA07 = c06827l3.A07(str);
                return Boolean.valueOf(zA07);
            case 3:
            case 4:
                zA07 = AnonymousClass001.A1X(obj) && AnonymousClass001.A1X(obj2);
                return Boolean.valueOf(zA07);
            default:
                return null;
        }
    }
}
