package X;

import java.util.List;

/* renamed from: X.GoK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10040GoK {
    public C9955GmN A00;
    public List<C9955GmN> A01;
    public List<C9955GmN> A02;
    public List<C9955GmN> A03;

    public final void A00(AbstractC9901Gkh<?> abstractC9901Gkh, C9955GmN c9955GmN, String str) {
        C9955GmN c9955GmN2 = this.A00;
        if (c9955GmN2 != null) {
            throw BV5.A0T("Conflicting property-based creators: already had %s creator %s, encountered another: %s", new Object[]{str, c9955GmN2.A04, c9955GmN.A04});
        }
        c9955GmN.A00(abstractC9901Gkh);
        this.A00 = c9955GmN;
    }
}
