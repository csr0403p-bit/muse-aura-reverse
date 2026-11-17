package X;

/* renamed from: X.3bO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bO implements Ht9, G0V {
    public final int $t;

    public C3bO(int i) {
        this.$t = i;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int iAQo;
        switch (this.$t) {
            case 0:
            case 5:
                iAQo = ((C3Tr) obj).AQo(AnonymousClass001.A0F(obj2));
                break;
            case 1:
            case 4:
                iAQo = ((C3Tr) obj).AQO(AnonymousClass001.A0F(obj2));
                break;
            case 2:
            case 7:
                iAQo = ((C3Tr) obj).AQq(AnonymousClass001.A0F(obj2));
                break;
            case 3:
            case 6:
                iAQo = ((C3Tr) obj).AQM(AnonymousClass001.A0F(obj2));
                break;
            default:
                return null;
        }
        return Integer.valueOf(iAQo);
    }
}
