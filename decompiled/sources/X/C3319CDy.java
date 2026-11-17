package X;

/* renamed from: X.CDy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3319CDy implements InterfaceC3390CIx {
    public final /* synthetic */ C3313CDn A00;

    public C3319CDy(C3313CDn c3313CDn) {
        this.A00 = c3313CDn;
    }

    @Override // X.CIz
    public final /* bridge */ /* synthetic */ void onStateUpdate(CJN cjn) {
        CJN cjn2 = cjn;
        C7384Etj.A0Y(cjn2, 0);
        C3313CDn c3313CDn = this.A00;
        synchronized (c3313CDn) {
            int i = ((C3381CIn) cjn2).A01;
            boolean z = true;
            if (i != 2 && i != 1 && i != 4) {
                z = false;
            }
            c3313CDn.A00 = z;
        }
        c3313CDn.A0D.execute(new CEA(c3313CDn, cjn2));
    }
}
