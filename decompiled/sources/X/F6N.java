package X;

/* loaded from: classes6.dex */
public final class F6N implements FAW {
    public final String A00;

    public F6N(String str) {
        this.A00 = str;
    }

    @Override // X.FAW
    public final boolean Agn(FDW fdw) {
        return fdw.A0E() != null && fdw.A0E().equals(this.A00);
    }
}
