package X;

/* loaded from: classes5.dex */
public final class Br1 implements Comparable<Br1> {
    public long A00;
    public EnumC2378BWr A01;
    public Long A02;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Br1)) {
            return false;
        }
        Br1 br1 = (Br1) obj;
        return this.A02.equals(br1.A02) && this.A01 == br1.A01 && this.A00 == br1.A00;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Br1 br1) {
        Br1 br12 = br1;
        EnumC2378BWr enumC2378BWr = this.A01;
        EnumC2378BWr enumC2378BWr2 = br12.A01;
        return enumC2378BWr != enumC2378BWr2 ? enumC2378BWr.compareTo(enumC2378BWr2) : (this.A00 > br12.A00 ? 1 : (this.A00 == br12.A00 ? 0 : -1));
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A02) + AnonymousClass005.A0E(this.A01) + C3cI.A01(this.A00);
    }
}
