package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes4.dex */
public final class AVg extends AbE implements C1Z2 {
    public C1881Asv A00;
    public TransformedTextFieldState A01;
    public TextFieldSelectionState A02;
    public boolean A03;
    public HoC A04;
    public final AT5<AWx, ARY> A05;
    public final AvQ A06;
    public final MutableState A07;

    public static final void A00(AVg aVg) {
        HoC hoC = aVg.A04;
        if (hoC != null) {
            hoC.A5w(null);
        }
        aVg.A04 = null;
        aVg.A04 = AnonymousClass001.A11(new BU6(aVg, null, 30), aVg.getCoroutineScope());
    }

    @Override // X.AbE, X.InterfaceC1476Ajj
    public final void A4Y(InterfaceC0857A6e interfaceC0857A6e) {
        this.A06.A4Y(interfaceC0857A6e);
    }

    public AVg(C1881Asv c1881Asv, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, boolean z) {
        this.A01 = transformedTextFieldState;
        this.A02 = textFieldSelectionState;
        this.A00 = c1881Asv;
        this.A03 = z;
        ParcelableSnapshotMutableState parcelableSnapshotMutableStateA06 = AbstractC1798ArH.A06(BL4.A00(0L));
        this.A07 = parcelableSnapshotMutableStateA06;
        this.A05 = new AT5<>(AVf.A03, AWx.A0B(AbstractC1876Asq.A00(this.A00, this.A01, this.A02, ((BL4) parcelableSnapshotMutableStateA06.getValue()).A00)), AWx.A0B(AVf.A00));
        AvQ avQ = new AvQ(AVh.A00, C2294BSu.A00(this, 41), C2294BSu.A00(this, 42), Float.NaN, Float.NaN, Float.NaN, 9205357640488583168L, true, true);
        A0G(avQ);
        this.A06 = avQ;
    }

    @Override // X.AbE, X.InterfaceC1332AhJ
    public final void draw(C16Z c16z) {
        c16z.A9O();
        this.A06.draw(c16z);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        A00(this);
    }
}
