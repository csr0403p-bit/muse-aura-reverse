package X;

import java.util.Set;

/* loaded from: classes4.dex */
public final class AlY implements InterfaceC1559AlZ {
    public final C0910AHm<InterfaceC1560Ala> A00 = C0910AHm.A01(new InterfaceC1560Ala[16]);
    public final Set<InterfaceC1559AlZ> A01;

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        C0910AHm<InterfaceC1560Ala> c0910AHm = this.A00;
        InterfaceC1560Ala[] interfaceC1560AlaArr = c0910AHm.A01;
        int i = c0910AHm.A00;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1559AlZ interfaceC1559AlZ = ((BAU) interfaceC1560AlaArr[i2]).A01;
            this.A01.remove(interfaceC1559AlZ);
            interfaceC1559AlZ.onRemembered();
        }
    }

    public AlY(Set<InterfaceC1559AlZ> set) {
        this.A01 = set;
    }
}
