package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.errorreporting.field.ReportFieldString;

/* renamed from: X.C4n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3230C4n implements InterfaceC3231C4o {
    public final Integer A00;
    public final InterfaceC3231C4o[] A01;

    public C3230C4n() {
        Integer num = C79.A0D;
        InterfaceC3231C4o[] interfaceC3231C4oArr = {new C3243C5a(), new C3229C4m()};
        this.A00 = num;
        this.A01 = interfaceC3231C4oArr;
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return this.A00;
    }

    @Override // X.InterfaceC3231C4o
    public final void AY4(C3228C4l c3228C4l, EnumC3223C4g enumC3223C4g) {
        InterfaceC3231C4o[] interfaceC3231C4oArr = this.A01;
        int i = 0;
        do {
            InterfaceC3231C4o interfaceC3231C4o = interfaceC3231C4oArr[i];
            try {
                interfaceC3231C4o.AY4(c3228C4l, enumC3223C4g);
            } catch (Throwable th) {
                C2Q.A00().AT9(C6L.A00(this.A00), th, null);
                ReportFieldString reportFieldString = C6B.A7e;
                String strA0p = C60O.A0p(reportFieldString, c3228C4l.A07);
                if (strA0p == null) {
                    strA0p = "";
                }
                c3228C4l.A03(reportFieldString, FGI.A0j(strA0p, "Error: ", C6L.A00(interfaceC3231C4o.AHt()), ": ", th.getMessage(), PairsDiscretionDocument.TERMINATOR));
            }
            i++;
        } while (i < 2);
    }
}
