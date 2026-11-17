package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class APh implements APo, InterfaceC1559AlZ {
    public APe A00;
    public APh A01;
    public InterfaceC1068ATy A02;
    public final C00q A03;
    public final MutableState A04;
    public final MutableState A05;
    public final MutableState A06;
    public final MutableState A07;
    public final MutableState A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;

    public static APc A00(AQM aqm) {
        return (APc) aqm.A00.A0B.getValue();
    }

    public final boolean A03() {
        APL apl = (APL) this.A0C.getValue();
        if (!MutableState.A0A(this.A05)) {
            return false;
        }
        apl.A00.getValue();
        return true;
    }

    @Override // X.APo
    public final void A9U(AT3 at3) {
        AaC aaCA02;
        GraphicsLayer graphicsLayer = (GraphicsLayer) this.A06.getValue();
        if (graphicsLayer == null || (aaCA02 = APc.A00(this.A0B).A02()) == null || !A02()) {
            return;
        }
        long jA0J = AnonymousClass005.A0J(aaCA02.A01, aaCA02.A03);
        float fA03 = AnonymousClass003.A03(jA0J);
        float fA00 = AnonymousClass004.A00(jA0J);
        InterfaceC1068ATy interfaceC1068ATy = this.A02;
        if (interfaceC1068ATy == null) {
            AT2 at2A00 = AT2.A00(at3, fA03, fA00);
            try {
                ATI.A00(at3, graphicsLayer);
                return;
            } finally {
                AT2.A01(at2A00, fA03, fA00);
            }
        }
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            AT2 at2 = aaI.A01;
            at2.A6M(interfaceC1068ATy, 1);
            at2.AhL(fA03, fA00);
            try {
                ATI.A00(at3, graphicsLayer);
            } finally {
                AT2.A01(at2, fA03, fA00);
            }
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    @Override // X.APo
    public final float AMw() {
        return this.A03.AFn();
    }

    @Override // X.InterfaceC1559AlZ
    public final void onAbandoned() {
    }

    @Override // X.InterfaceC1559AlZ
    public final void onForgotten() {
        MutableState mutableState = this.A0B;
        APZ apz = ((APc) mutableState.getValue()).A01;
        APc aPc = (APc) mutableState.getValue();
        MutableState mutableState2 = aPc.A04;
        mutableState2.Af8(AbstractC0878AGe.A0b((Iterable) mutableState2.getValue(), this));
        MutableState mutableState3 = aPc.A05;
        mutableState3.Af8(AbstractC0878AGe.A0b((Iterable) mutableState3.getValue(), this));
        aPc.A01();
        apz.A00();
        apz.A04.remove(this);
        if (C8j3.A1C(mutableState2).isEmpty()) {
            AnonymousClass001.A1J(BU6.A0M(aPc, this, null, 2), aPc.A01.A07);
        }
        ((APc) mutableState.getValue()).A02.A00();
    }

    @Override // X.InterfaceC1559AlZ
    public final void onRemembered() {
        APh aPh;
        MutableState mutableState = this.A0B;
        APZ apz = ((APc) mutableState.getValue()).A01;
        APc aPc = (APc) mutableState.getValue();
        MutableState mutableState2 = aPc.A04;
        mutableState2.Af8(AbstractC0878AGe.A0Q(this, (Collection) mutableState2.getValue()));
        aPc.A01();
        apz.A00();
        SnapshotStateList<APo> snapshotStateList = apz.A04;
        Iterator it = snapshotStateList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            APo aPo = (APo) it.next();
            Object value = null;
            if ((aPo instanceof APh) && (aPh = (APh) aPo) != null) {
                value = aPh.A0B.getValue();
            }
            if (C7384Etj.areEqual(value, mutableState.getValue())) {
                break;
            } else {
                i++;
            }
        }
        if (i == snapshotStateList.size() - 1 || i == -1) {
            snapshotStateList.add(this);
        } else {
            snapshotStateList.add(i + 1, this);
        }
        ((APc) mutableState.getValue()).A02.A00();
    }

    public APh(C1008AOz c1008AOz, APc aPc, AOO aoo, InterfaceC1021AQf interfaceC1021AQf, APL apl, float f, boolean z, boolean z2) {
        Boolean boolA0h = AnonymousClass001.A0h();
        AGE age = AGE.A00;
        this.A05 = C3cG.A08(age, boolA0h);
        this.A03 = new ParcelableSnapshotMutableFloatState(f);
        this.A09 = C3cG.A08(age, Boolean.valueOf(z2));
        this.A0B = C3cG.A08(age, aPc);
        this.A04 = C3cG.A08(age, c1008AOz);
        this.A08 = C3cG.A08(age, interfaceC1021AQf);
        this.A0A = C3cG.A08(age, Boolean.valueOf(z));
        this.A07 = C3cG.A08(age, aoo);
        this.A0C = C3cG.A08(age, apl);
        this.A06 = C3cG.A08(age, null);
    }

    public static final boolean A01(APh aPh) {
        if (!C1008AOz.A00(aPh)) {
            MutableState mutableState = aPh.A0B;
            if ((!APc.A00(mutableState).A01() || APc.A00(mutableState).A04()) && MutableState.A0A(aPh.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02() {
        if (A01(this)) {
            MutableState mutableState = this.A0B;
            if (APc.A00(mutableState).A01() && A03() && MutableState.A0A(this.A09) && ((APc) mutableState.getValue()).A01.APC()) {
                return true;
            }
        }
        return false;
    }
}
