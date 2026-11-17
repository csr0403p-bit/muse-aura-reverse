package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.AtB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1892AtB implements C1BO<C1958Aux>, BDs {
    public C1868Asi A00;
    public final MutableState A03 = C3cG.A08(C1931Atu.A05, null);
    public final MutableState A02 = C3cG.A08(C1915Atc.A06, null);
    public C1904AtP A01 = new C1904AtP();

    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1958Aux A00(X.C1915Atc r27, X.C1931Atu r28, X.C1892AtB r29) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892AtB.A00(X.Atc, X.Atu, X.AtB):X.Aux");
    }

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A01;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.A01 = (C1904AtP) an8;
    }

    @Override // X.C1BO
    public final /* bridge */ /* synthetic */ C1958Aux getValue() {
        C1915Atc c1915Atc;
        C1931Atu c1931Atu = (C1931Atu) this.A03.getValue();
        if (c1931Atu == null || (c1915Atc = (C1915Atc) this.A02.getValue()) == null) {
            return null;
        }
        return A00(c1915Atc, c1931Atu, this);
    }

    @Override // X.BDs
    public final AN8 AQi(AN8 an8, AN8 an82, AN8 an83) {
        return an83;
    }
}
