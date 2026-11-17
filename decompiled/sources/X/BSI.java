package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class BSI implements InterfaceC2045AxD {
    public final int $t;
    public final Object A00;
    public final boolean A01;

    public BSI(Object obj, int i, boolean z) {
        this.$t = i;
        this.A01 = z;
        this.A00 = obj;
    }

    private final void A00() {
        C1943Aug c1943Aug = (C1943Aug) this.A00;
        c1943Aug.A0C = true;
        C1943Aug.A05(c1943Aug);
        c1943Aug.A0J.Af8(null);
        c1943Aug.A0G.Af8(null);
    }

    @Override // X.InterfaceC2045AxD
    public final void ASa() {
        C1940Aud value;
        InterfaceC1497Ak4 interfaceC1497Ak4AGx;
        C1924Atl c1924AtlA00;
        InterfaceC1497Ak4 interfaceC1497Ak4;
        if (this.$t == 0) {
            boolean z = this.A01;
            C1943Aug c1943Aug = (C1943Aug) this.A00;
            if ((z ? c1943Aug.A0N : c1943Aug.A0K).getValue() == null || (value = c1943Aug.A0F.getValue()) == null) {
                return;
            }
            InterfaceC2043AxB interfaceC2043AxBA00 = AXH.A00(z ? value.A01 : value.A00, c1943Aug);
            if (interfaceC2043AxBA00 == null || (interfaceC1497Ak4AGx = interfaceC2043AxBA00.AGx()) == null) {
                return;
            }
            long jAG2 = interfaceC2043AxBA00.AG2(value, z);
            if ((9223372034707292159L & jAG2) != 9205357640488583168L) {
                c1943Aug.A0G.Af8(AWx.A0B(c1943Aug.A08().APm(interfaceC1497Ak4AGx, AWu.A00(jAG2))));
                c1943Aug.A0J.Af8(z ? AWv.A04 : AWv.A03);
                c1943Aug.A0C = false;
                C1943Aug.A05(c1943Aug);
                return;
            }
            return;
        }
        TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A00;
        boolean z2 = this.A01;
        textFieldSelectionManager.A0O.Af8(z2 ? AWv.A04 : AWv.A03);
        long jA00 = AWu.A00(textFieldSelectionManager.A06(z2));
        C1897AtH c1897AtH = textFieldSelectionManager.A03;
        if (c1897AtH == null || (c1924AtlA00 = C1897AtH.A00(c1897AtH)) == null) {
            return;
        }
        InterfaceC1497Ak4 interfaceC1497Ak42 = c1924AtlA00.A01;
        if (interfaceC1497Ak42 != null && interfaceC1497Ak42.isAttached() && (interfaceC1497Ak4 = c1924AtlA00.A00) != null && interfaceC1497Ak4.isAttached()) {
            jA00 = interfaceC1497Ak4.APm(interfaceC1497Ak42, jA00);
        }
        AWx.A0F(textFieldSelectionManager, jA00);
        textFieldSelectionManager.A00 = -1;
        C1897AtH c1897AtH2 = textFieldSelectionManager.A03;
        if (c1897AtH2 != null) {
            MutableState.A09(true, c1897AtH2.A0C);
        }
        TextFieldSelectionManager.A05(textFieldSelectionManager, false);
    }

    @Override // X.InterfaceC2045AxD
    public final void ASf(long j) {
        if (this.$t != 0) {
            TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A00;
            long jA05 = AWx.A05(textFieldSelectionManager.A02, j);
            textFieldSelectionManager.A02 = jA05;
            AWx aWxA0B = AWx.A0B(AWx.A05(textFieldSelectionManager.A01, jA05));
            MutableState mutableState = textFieldSelectionManager.A0N;
            mutableState.Af8(aWxA0B);
            TextFieldSelectionManager.A00(C2025Awe.A01, textFieldSelectionManager, new C2135Az3(9), C8j4.A0d(textFieldSelectionManager.A0S), AWx.A06(mutableState), false, this.A01, true);
            TextFieldSelectionManager.A05(textFieldSelectionManager, false);
            return;
        }
        C1943Aug c1943Aug = (C1943Aug) this.A00;
        if (c1943Aug.A0J.getValue() != null) {
            MutableState mutableState2 = c1943Aug.A0I;
            AWx.A0G(mutableState2, AWx.A05(AWx.A07(mutableState2), j));
            MutableState mutableState3 = c1943Aug.A0H;
            long jA052 = AWx.A05(AWx.A07(mutableState3), AWx.A07(mutableState2));
            if (C1943Aug.A07(C2025Awe.A01, c1943Aug, jA052, AWx.A07(mutableState3), this.A01)) {
                AWx.A0G(mutableState3, jA052);
                AWx.A0G(mutableState2, 0L);
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AW7(Ay9 ay9, long j) {
        String str;
        if (this.$t == 0) {
            C1943Aug c1943Aug = (C1943Aug) this.A00;
            if (c1943Aug.A0J.getValue() != null) {
                C1940Aud value = c1943Aug.A0F.getValue();
                C7384Etj.A0X(value);
                boolean z = this.A01;
                InterfaceC2043AxB interfaceC2043AxBA05 = c1943Aug.A0D.A09.A05((z ? value.A01 : value.A00).A01);
                if (interfaceC2043AxBA05 != null) {
                    InterfaceC2043AxB interfaceC2043AxB = interfaceC2043AxBA05;
                    InterfaceC1497Ak4 interfaceC1497Ak4AGx = interfaceC2043AxB.AGx();
                    if (interfaceC1497Ak4AGx != null) {
                        long jAG2 = interfaceC2043AxB.AG2(value, z);
                        if ((9223372034707292159L & jAG2) != 9205357640488583168L) {
                            AWx.A0G(c1943Aug.A0H, c1943Aug.A08().APm(interfaceC1497Ak4AGx, AWu.A00(jAG2)));
                            AWx.A0G(c1943Aug.A0I, 0L);
                            return;
                        }
                        return;
                    }
                    str = "Current selectable should have layout coordinates.";
                } else {
                    str = "SelectionRegistrar should contain the current selection's selectableIds";
                }
                throw C3cG.A0Q(str);
            }
        }
    }

    @Override // X.InterfaceC2045AxD
    public final void AWF() {
        if (this.$t == 0) {
            A00();
            return;
        }
        TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A00;
        TextFieldSelectionManager.A03(textFieldSelectionManager);
        TextFieldSelectionManager.A05(textFieldSelectionManager, true);
    }

    @Override // X.InterfaceC2045AxD
    public final void AWw() {
        if (this.$t == 0) {
            A00();
            return;
        }
        TextFieldSelectionManager textFieldSelectionManager = (TextFieldSelectionManager) this.A00;
        TextFieldSelectionManager.A03(textFieldSelectionManager);
        TextFieldSelectionManager.A05(textFieldSelectionManager, true);
    }

    @Override // X.InterfaceC2045AxD
    public final void onCancel() {
        if (this.$t == 0) {
            A00();
        }
    }
}
