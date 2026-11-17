package X;

import androidx.compose.ui.layout.WindowInsetsRulers;

/* renamed from: X.Ame, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1612Ame {
    public static final WindowInsetsRulers A00;
    public static final WindowInsetsRulers A01;
    public static final WindowInsetsRulers A02;
    public static final WindowInsetsRulers A03;
    public static final WindowInsetsRulers A04;
    public static final WindowInsetsRulers A05;
    public static final WindowInsetsRulers A06;
    public static final WindowInsetsRulers A07;
    public static final WindowInsetsRulers A08;
    public static final WindowInsetsRulers A09;
    public static final WindowInsetsRulers A0A;
    public static final WindowInsetsRulers A0B;
    public static final WindowInsetsRulers A0C;
    public static final /* synthetic */ C1612Ame A0D = new C1612Ame();

    static {
        C1610Amc c1610Amc = new C1610Amc("caption bar");
        A00 = c1610Amc;
        C1610Amc c1610Amc2 = new C1610Amc("display cutout");
        A01 = c1610Amc2;
        C1610Amc c1610Amc3 = new C1610Amc("ime");
        A02 = c1610Amc3;
        C1610Amc c1610Amc4 = new C1610Amc("mandatory system gestures");
        A03 = c1610Amc4;
        C1610Amc c1610Amc5 = new C1610Amc("navigation bars");
        A04 = c1610Amc5;
        C1610Amc c1610Amc6 = new C1610Amc("status bars");
        A05 = c1610Amc6;
        A0C = new C1613Amf("system bars", new WindowInsetsRulers[]{c1610Amc6, c1610Amc5, c1610Amc});
        C1610Amc c1610Amc7 = new C1610Amc("system gestures");
        A06 = c1610Amc7;
        C1610Amc c1610Amc8 = new C1610Amc("tappable element");
        A07 = c1610Amc8;
        C1610Amc c1610Amc9 = new C1610Amc("waterfall");
        A08 = c1610Amc9;
        A0A = new C1613Amf("safe drawing", new WindowInsetsRulers[]{c1610Amc6, c1610Amc5, c1610Amc, c1610Amc2, c1610Amc3, c1610Amc8});
        A0B = new C1613Amf("safe gestures", new WindowInsetsRulers[]{c1610Amc4, c1610Amc7, c1610Amc8, c1610Amc9});
        A09 = new C1613Amf("safe content", new WindowInsetsRulers[]{c1610Amc6, c1610Amc5, c1610Amc, c1610Amc3, c1610Amc7, c1610Amc4, c1610Amc8, c1610Amc2, c1610Amc9});
    }
}
