package X;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class EY3 extends AbstractC6735EXt<Number> {
    public static final EYY A01 = new F4K(new EY3(EY7.A02), 0);
    public final EY0 A00;

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ void write(C6733EXr c6733EXr, Number number) throws IOException {
        c6733EXr.A0F(number);
    }

    public EY3(EY0 ey0) {
        this.A00 = ey0;
    }

    @Override // X.AbstractC6735EXt
    public final /* bridge */ /* synthetic */ Number read(EY1 ey1) throws MalformedJsonException {
        Integer numA0R = ey1.A0R();
        int iIntValue = numA0R.intValue();
        if (iIntValue == 8) {
            ey1.A0a();
            return null;
        }
        if (iIntValue == 6 || iIntValue == 5) {
            return this.A00.AZR(ey1);
        }
        throw new JsonSyntaxException(FGI.A0d("Expecting number, got: ", EY2.A00(numA0R), "; at path ", ey1.A0S()));
    }
}
