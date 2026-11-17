package X;

import androidx.compose.ui.layout.WindowInsetsRulers;

/* renamed from: X.AmU, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1602AmU {
    public static final Ab0<WindowInsetsRulers> A00;
    public static final WindowInsetsRulers[] A01;

    static {
        Ab2 ab2 = new Ab2(8);
        C1612Ame c1612Ame = WindowInsetsRulers.A00;
        WindowInsetsRulers windowInsetsRulers = C1612Ame.A05;
        ab2.A0B(1, windowInsetsRulers);
        WindowInsetsRulers windowInsetsRulers2 = C1612Ame.A04;
        ab2.A0B(2, windowInsetsRulers2);
        WindowInsetsRulers windowInsetsRulers3 = C1612Ame.A00;
        ab2.A0B(4, windowInsetsRulers3);
        WindowInsetsRulers windowInsetsRulers4 = C1612Ame.A02;
        ab2.A0B(8, windowInsetsRulers4);
        WindowInsetsRulers windowInsetsRulers5 = C1612Ame.A06;
        ab2.A0B(16, windowInsetsRulers5);
        WindowInsetsRulers windowInsetsRulers6 = C1612Ame.A03;
        ab2.A0B(32, windowInsetsRulers6);
        WindowInsetsRulers windowInsetsRulers7 = C1612Ame.A07;
        ab2.A0B(64, windowInsetsRulers7);
        WindowInsetsRulers windowInsetsRulers8 = C1612Ame.A01;
        ab2.A0B(128, windowInsetsRulers8);
        A00 = ab2;
        A01 = new WindowInsetsRulers[]{windowInsetsRulers, windowInsetsRulers2, windowInsetsRulers3, windowInsetsRulers7, windowInsetsRulers5, windowInsetsRulers6, windowInsetsRulers4, C1612Ame.A08, windowInsetsRulers8};
    }

    public static final void A00(InterfaceC1601AmT interfaceC1601AmT, InterfaceC1620Amr interfaceC1620Amr, int i, int i2, long j) {
        if (j != -1) {
            interfaceC1620Amr.AYh(interfaceC1601AmT.AH2(), (int) ((j >>> 48) & 65535));
            interfaceC1620Amr.AYh(interfaceC1601AmT.ALo(), (int) ((j >>> 32) & 65535));
            interfaceC1620Amr.AYh(interfaceC1601AmT.AJp(), i - ((int) ((j >>> 16) & 65535)));
            interfaceC1620Amr.AYh(interfaceC1601AmT.ACz(), i2 - ((int) (j & 65535)));
        }
    }
}
