package X;

/* loaded from: classes5.dex */
public final class DD8 implements DDC {
    public final DDC A00;

    @Override // X.DDC
    public final /* bridge */ /* synthetic */ Object AjF() {
        Object objAjF = this.A00.AjF();
        if (objAjF != null) {
            return objAjF;
        }
        throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
    }

    public DD8(DDC ddc) {
        this.A00 = ddc;
    }
}
