package X;

/* loaded from: classes5.dex */
public abstract class CR0 {
    public final boolean A02(AbstractC3496CQt abstractC3496CQt, Object obj) {
        if (!(this instanceof C3501CQy)) {
            return AbstractC5217DdT.A00(abstractC3496CQt, null, obj, ((C3500CQx) this).A04);
        }
        synchronized (abstractC3496CQt) {
            if (abstractC3496CQt.a != null) {
                return false;
            }
            abstractC3496CQt.a = obj;
            return true;
        }
    }

    public final boolean A00(C3502CQz c3502CQz, C3502CQz c3502CQz2, AbstractC3496CQt abstractC3496CQt) {
        if (!(this instanceof C3501CQy)) {
            return AbstractC5217DdT.A00(abstractC3496CQt, c3502CQz, c3502CQz2, ((C3500CQx) this).A02);
        }
        synchronized (abstractC3496CQt) {
            if (abstractC3496CQt.c != c3502CQz) {
                return false;
            }
            abstractC3496CQt.c = c3502CQz2;
            return true;
        }
    }

    public final boolean A01(AbstractC3496CQt abstractC3496CQt, CR2 cr2, CR2 cr22) {
        if (!(this instanceof C3501CQy)) {
            return AbstractC5217DdT.A00(abstractC3496CQt, cr2, cr22, ((C3500CQx) this).A03);
        }
        synchronized (abstractC3496CQt) {
            if (abstractC3496CQt.b != cr2) {
                return false;
            }
            abstractC3496CQt.b = cr22;
            return true;
        }
    }
}
