package X;

/* loaded from: classes5.dex */
public final class F4C extends EnumC6485E8p {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public F4C(int i) {
        String str;
        int i2;
        this.$t = i;
        switch (i) {
            case 0:
                str = "STRONG";
                i2 = 0;
                break;
            case 1:
                str = "STRONG_ACCESS";
                i2 = 1;
                break;
            case 2:
                str = "STRONG_WRITE";
                i2 = 2;
                break;
            case 3:
                str = "STRONG_ACCESS_WRITE";
                i2 = 3;
                break;
            case 4:
                str = "WEAK";
                i2 = 4;
                break;
            case 5:
                str = "WEAK_ACCESS";
                i2 = 5;
                break;
            case 6:
                str = "WEAK_WRITE";
                i2 = 6;
                break;
            default:
                str = "WEAK_ACCESS_WRITE";
                i2 = 7;
                break;
        }
        super(str, i2);
    }
}
