package X;

import com.fasterxml.jackson.core.JsonParseException;

/* renamed from: X.Gnr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10019Gnr extends AbstractC10020Gns {
    public int A00;
    public int A01;
    public C10086GpA A02;
    public C10019Gnr A03;
    public Object A04;
    public String A05;
    public final C10019Gnr A06;

    public final void A04(String str) throws JsonParseException {
        this.A05 = str;
        C10086GpA c10086GpA = this.A02;
        if (c10086GpA == null || !c10086GpA.A00(str)) {
            return;
        }
        Object obj = c10086GpA.A03;
        AbstractC9916Gl7 abstractC9916Gl7 = obj instanceof AbstractC9916Gl7 ? (AbstractC9916Gl7) obj : null;
        String strA0U = FGI.A0U("Duplicate field '", str, "'");
        C9516GMj c9516GMjA1I = abstractC9916Gl7 == null ? null : abstractC9916Gl7.A1I();
        JsonParseException jsonParseException = new JsonParseException(strA0U, null);
        jsonParseException._location = c9516GMjA1I;
        jsonParseException.A00 = abstractC9916Gl7;
        throw jsonParseException;
    }

    public C10019Gnr(C10086GpA c10086GpA, C10019Gnr c10019Gnr, int i, int i2, int i3, int i4) {
        this.A06 = c10019Gnr;
        this.A02 = c10086GpA;
        super.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        super.A00 = -1;
        super.A01 = i;
    }
}
