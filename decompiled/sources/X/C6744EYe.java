package X;

import java.sql.Timestamp;
import java.util.Date;

/* renamed from: X.EYe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6744EYe extends AbstractC6735EXt<Timestamp> {
    public static final EYY A01 = new F4J(5);
    public final AbstractC6735EXt<Date> A00;

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Timestamp read(EY1 ey1) {
        Date date = this.A00.read(ey1);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Timestamp timestamp) {
        this.A00.write(c6733EXr, timestamp);
    }

    public C6744EYe(AbstractC6735EXt<Date> abstractC6735EXt) {
        this.A00 = abstractC6735EXt;
    }
}
