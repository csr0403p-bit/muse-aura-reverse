package X;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;

/* renamed from: X.AlO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1558AlO extends AlT implements InterfaceC1530Akm, AlU {
    public AutofillId A01;
    public Aeh A02;
    public InterfaceC1491Ajy A03;
    public boolean A04;
    public final View A05;
    public final C1557AlM A06;
    public final C1457AjQ A07;
    public final String A08 = "com.facebook.aura";
    public Rect A00 = new Rect();

    public C1558AlO(View view, InterfaceC1491Ajy interfaceC1491Ajy, C1557AlM c1557AlM, C1457AjQ c1457AjQ) {
        this.A03 = interfaceC1491Ajy;
        this.A06 = c1557AlM;
        this.A05 = view;
        this.A07 = c1457AjQ;
        view.setImportantForAutofill(1);
        AutofillId autofillId = view.getAutofillId();
        if (autofillId == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        this.A01 = autofillId;
        this.A02 = new Aeh(6);
    }

    @Override // X.InterfaceC1530Akm
    public final void ATO(InterfaceC1214Aes interfaceC1214Aes, InterfaceC1214Aes interfaceC1214Aes2) {
        C1453AjM c1453AjMA04;
        C0919AHv c0919AHvAKL;
        C1453AjM c1453AjMA042;
        C0919AHv c0919AHvAKL2;
        if (interfaceC1214Aes != null && (c1453AjMA042 = AbstractC1414Aij.A04(interfaceC1214Aes)) != null && (c0919AHvAKL2 = c1453AjMA042.AKL()) != null) {
            C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHvAKL2.A03;
            if (c0918AHu.A06(AbstractC1578Alt.A0A) || c0918AHu.A06(AbstractC1578Alt.A0C)) {
                ((AlR) this.A03).A00.notifyViewExited(this.A05, c1453AjMA042.A02);
            }
        }
        if (interfaceC1214Aes2 == null || (c1453AjMA04 = AbstractC1414Aij.A04(interfaceC1214Aes2)) == null || (c0919AHvAKL = c1453AjMA04.AKL()) == null) {
            return;
        }
        C0918AHu<C0920AHw<?>, Object> c0918AHu2 = c0919AHvAKL.A03;
        if (c0918AHu2.A06(AbstractC1578Alt.A0A) || c0918AHu2.A06(AbstractC1578Alt.A0C)) {
            int i = c1453AjMA04.A02;
            this.A07.A07.A02(new AlN(this, i), i);
        }
    }
}
