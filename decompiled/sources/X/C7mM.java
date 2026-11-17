package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7mM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7mM extends C7mI {
    public static WeakReference<C7381Etf> A00 = new WeakReference<>(null);

    /* JADX WARN: Illegal instructions before constructor call */
    public C7mM(C7mP c7mP, C7mY c7mY) {
        C7381Etf c7381EtfA00;
        synchronized (C7mM.class) {
            c7381EtfA00 = A00.get();
            if (c7381EtfA00 == null) {
                c7381EtfA00 = C7mB.A00("*|all_packages|*", AbstractC10402HbJ.A0o);
                A00 = new WeakReference<>(c7381EtfA00);
            }
        }
        super(c7mP, c7mY, c7381EtfA00, "FamilyIntentScope");
    }

    @Override // X.C7n1
    public final Integer AK1() {
        return C79.A0C;
    }

    @Override // X.C7n1
    public final boolean AKY() {
        return true;
    }
}
