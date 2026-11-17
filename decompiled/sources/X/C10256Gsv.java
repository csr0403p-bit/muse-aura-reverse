package X;

import java.util.Arrays;

/* renamed from: X.Gsv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10256Gsv extends Gt3 {
    public static final AbstractC10245Gsg A01;
    public final C10242Gsb A00;

    public C10256Gsv(Gt7 gt7, C10322Guc c10322Guc) {
        super(null, gt7, c10322Guc);
        this.A00 = new C10242Gsb();
    }

    static {
        String[] strArr = GuP.A00;
        C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
        A01 = GtJ.A08(Gt5.A00(", ", Arrays.asList(strArr).iterator()));
    }

    @Override // X.Gt3, X.Gt4
    /* renamed from: A0F */
    public final /* bridge */ /* synthetic */ Gt4 clone() {
        return super.clone();
    }

    @Override // X.Gt4
    public final void A0O(Gt4 gt4) {
        super.A0O(gt4);
        this.A00.remove(gt4);
    }

    @Override // X.Gt3
    /* renamed from: A0Z */
    public final /* bridge */ /* synthetic */ Gt3 clone() {
        return super.clone();
    }

    @Override // X.Gt3, X.Gt4
    public final /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }
}
