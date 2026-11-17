package X;

/* loaded from: classes5.dex */
public abstract class BkD implements Bl6 {
    public final Object A00;

    @Override // X.Bl6
    public Object AIM() {
        Object obj = this.A00;
        BeS.A05(obj instanceof BkG);
        return ((BkG) obj).A01;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BkD) {
            return C6xC.A00(this.A00, ((BkD) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BkD(Object obj) {
        this.A00 = obj;
    }

    @Override // X.Bl6
    public void Adm(int i) {
    }

    @Override // X.Bl6
    public void Aem(long j) {
    }
}
