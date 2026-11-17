package X;

import androidx.compose.ui.layout.WindowInsetsRulers;

/* renamed from: X.Amc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1610Amc implements WindowInsetsRulers {
    public final InterfaceC1601AmT A00;
    public final InterfaceC1601AmT A01;
    public final String A02;

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final InterfaceC1601AmT AEL() {
        return this.A00;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public final InterfaceC1601AmT AHW() {
        return this.A01;
    }

    public final String toString() {
        return this.A02;
    }

    public C1610Amc(String str) {
        this.A02 = str;
        this.A00 = new C1588AmF(str);
        this.A01 = new C1588AmF(FGI.A0M(str, " maximum"));
    }
}
