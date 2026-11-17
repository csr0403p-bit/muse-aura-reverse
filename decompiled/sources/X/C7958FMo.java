package X;

/* renamed from: X.FMo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7958FMo extends AbstractC7959FMp {
    public final FOO A00;

    public C7958FMo() {
        this(null, null, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7958FMo(FOO foo, EnumC7946FMb enumC7946FMb, int i) {
        if (enumC7946FMb == null) {
            if (i != 16) {
                if (i != 32) {
                    enumC7946FMb = EnumC7946FMb.A05;
                } else {
                    enumC7946FMb = EnumC7946FMb.A02;
                }
            } else {
                enumC7946FMb = EnumC7946FMb.A04;
            }
        }
        super(foo, enumC7946FMb);
        this.A00 = foo;
    }
}
