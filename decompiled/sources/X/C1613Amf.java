package X;

import androidx.compose.ui.layout.WindowInsetsRulers;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Amf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1613Amf implements WindowInsetsRulers {
    public final InterfaceC1601AmT A00;
    public final InterfaceC1601AmT A01;
    public final String A02;
    public final WindowInsetsRulers[] A03;

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

    public C1613Amf(String str, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.A02 = str;
        this.A03 = windowInsetsRulersArr;
        ArrayList arrayListA11 = C60O.A11(windowInsetsRulersArr.length);
        for (WindowInsetsRulers windowInsetsRulers : windowInsetsRulersArr) {
            arrayListA11.add(windowInsetsRulers.AEL());
        }
        InterfaceC1601AmT[] interfaceC1601AmTArr = (InterfaceC1601AmT[]) arrayListA11.toArray(new InterfaceC1601AmT[0]);
        this.A00 = new C1614Amg((InterfaceC1601AmT[]) Arrays.copyOf(interfaceC1601AmTArr, interfaceC1601AmTArr.length));
        WindowInsetsRulers[] windowInsetsRulersArr2 = this.A03;
        ArrayList arrayListA112 = C60O.A11(windowInsetsRulersArr2.length);
        for (WindowInsetsRulers windowInsetsRulers2 : windowInsetsRulersArr2) {
            arrayListA112.add(windowInsetsRulers2.AHW());
        }
        InterfaceC1601AmT[] interfaceC1601AmTArr2 = (InterfaceC1601AmT[]) arrayListA112.toArray(new InterfaceC1601AmT[0]);
        this.A01 = new C1614Amg((InterfaceC1601AmT[]) Arrays.copyOf(interfaceC1601AmTArr2, interfaceC1601AmTArr2.length));
    }
}
