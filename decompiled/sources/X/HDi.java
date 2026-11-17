package X;

/* loaded from: classes6.dex */
public abstract class HDi {
    public static final Hw7 A00;
    public static final Hw7 A01;
    public static final Hw7 A02;
    public static final C10376HDg A03;
    public static final C10376HDg A04;
    public static final C10376HDg A05;
    public static final C10376HDg A06;
    public static final C10376HDg A07;
    public static final C10376HDg A08;
    public static final C10376HDg A09;
    public static final C10376HDg A0A;
    public static final C10376HDg A0B;
    public static final C10376HDg A0C;
    public static final C10376HDg A0D;
    public static final C10376HDg A0E;
    public static final C10376HDg A0F;
    public static final C10376HDg A0G;
    public static final C10376HDg A0H;
    public static final C10376HDg A0I;
    public static final C10376HDg A0J;
    public static final HAi A0K;
    public static final HAi A0L;
    public static final float[] A0M;
    public static final float[] A0N;
    public static final Hw7[] A0O;
    public static final HAi A0P;
    public static final HAi A0Q;
    public static final float[] A0R;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        A0N = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        A0M = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        A0R = fArr3;
        HAi hAi = new HAi(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        A0Q = hAi;
        HAi hAi2 = new HAi(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        A0P = hAi2;
        HAi hAi3 = new HAi(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        A0K = hAi3;
        HAi hAi4 = new HAi(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        A0L = hAi4;
        C9193G4w c9193G4w = HDp.A03;
        C10376HDg c10376HDg = new C10376HDg(hAi, c9193G4w, "sRGB IEC61966-2.1", fArr, 0);
        A0I = c10376HDg;
        C10376HDg c10376HDg2 = new C10376HDg(c9193G4w, "sRGB IEC61966-2.1 (Linear)", fArr, 1.0d, 0.0f, 1.0f, 1);
        A0E = c10376HDg2;
        C10376HDg c10376HDg3 = new C10376HDg(new C10639I0j(0), new C10639I0j(1), hAi, c9193G4w, "scRGB-nl IEC 61966-2-2:2003", fArr, null, -0.799f, 2.399f, 2);
        A0C = c10376HDg3;
        C10376HDg c10376HDg4 = new C10376HDg(c9193G4w, "scRGB IEC 61966-2-2:2003", fArr, 1.0d, -0.5f, 7.499f, 3);
        A0D = c10376HDg4;
        C10376HDg c10376HDg5 = new C10376HDg(new HAi(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), c9193G4w, "Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, 4);
        A09 = c10376HDg5;
        C10376HDg c10376HDg6 = new C10376HDg(new HAi(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d), c9193G4w, "Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, 5);
        A06 = c10376HDg6;
        C10376HDg c10376HDg7 = new C10376HDg(new C9193G4w(0.314f, 0.351f), "SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 2.6d, 0.0f, 1.0f, 6);
        A0A = c10376HDg7;
        C10376HDg c10376HDg8 = new C10376HDg(hAi, c9193G4w, "Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, 7);
        A0B = c10376HDg8;
        C10376HDg c10376HDg9 = new C10376HDg(new HAi(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), HDp.A00, "NTSC (1953)", fArr2, 8);
        A0F = c10376HDg9;
        C10376HDg c10376HDg10 = new C10376HDg(new HAi(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), c9193G4w, "SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, 9);
        A0H = c10376HDg10;
        C10376HDg c10376HDg11 = new C10376HDg(c9193G4w, "Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, 2.2d, 0.0f, 1.0f, 10);
        A05 = c10376HDg11;
        C9193G4w c9193G4w2 = HDp.A01;
        C10376HDg c10376HDg12 = new C10376HDg(new HAi(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d), c9193G4w2, "ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, 11);
        A0G = c10376HDg12;
        C9193G4w c9193G4w3 = HDp.A02;
        C10376HDg c10376HDg13 = new C10376HDg(c9193G4w3, "SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, 1.0d, -65504.0f, 65504.0f, 12);
        A03 = c10376HDg13;
        C10376HDg c10376HDg14 = new C10376HDg(c9193G4w3, "Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, 1.0d, -65504.0f, 65504.0f, 13);
        A04 = c10376HDg14;
        HpN hpN = new HpN("Generic XYZ", AbstractC10598Hxv.A02, 14);
        A01 = hpN;
        long j = AbstractC10598Hxv.A00;
        HDn hDn = new HDn("Generic L*a*b*", j, 15);
        A00 = hDn;
        C10376HDg c10376HDg15 = new C10376HDg(hAi2, c9193G4w, "None", fArr, 16);
        A0J = c10376HDg15;
        C10376HDg c10376HDg16 = new C10376HDg(new C10639I0j(2), new C10639I0j(3), hAi3, c9193G4w, "Hybrid Log Gamma encoding", fArr3, null, 0.0f, 1.0f, 17);
        A07 = c10376HDg16;
        C10376HDg c10376HDg17 = new C10376HDg(new C10639I0j(4), new C10639I0j(5), hAi4, c9193G4w, "Perceptual Quantizer encoding", fArr3, null, 0.0f, 1.0f, 18);
        A08 = c10376HDg17;
        HDl hDl = new HDl("Oklab", j, 19);
        A02 = hDl;
        A0O = new Hw7[]{c10376HDg, c10376HDg2, c10376HDg3, c10376HDg4, c10376HDg5, c10376HDg6, c10376HDg7, c10376HDg8, c10376HDg9, c10376HDg10, c10376HDg11, c10376HDg12, c10376HDg13, c10376HDg14, hpN, hDn, c10376HDg15, c10376HDg16, c10376HDg17, hDl};
    }

    public static final double A00(HAi hAi, double d) {
        double dA01 = AbstractC7610F5x.A01((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)));
        double d2 = d * dA01;
        double d3 = hAi.A00;
        double d4 = hAi.A01;
        double d5 = hAi.A02;
        double d6 = hAi.A03;
        double d7 = hAi.A04;
        double d8 = d3 * d2;
        return (hAi.A05 + 1.0d) * dA01 * (d8 <= 1.0d ? Math.pow(d8, d4) : Math.exp((d2 - d7) * d5) + d6);
    }

    public static final double A01(HAi hAi, double d) {
        double dA01 = AbstractC7610F5x.A01((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)));
        double d2 = 1.0d / hAi.A00;
        double d3 = 1.0d / hAi.A01;
        double d4 = 1.0d / hAi.A02;
        double d5 = hAi.A03;
        double d6 = hAi.A04;
        double d7 = (d * dA01) / (hAi.A05 + 1.0d);
        return dA01 * (d7 <= 1.0d ? d2 * Math.pow(d7, d3) : (d4 * Math.log(d7 - d5)) + d6);
    }

    public static final double A02(HAi hAi, double d) {
        double dA01 = AbstractC7610F5x.A01((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)));
        double d2 = hAi.A00;
        double d3 = hAi.A01;
        double dPow = Math.pow(d * dA01, hAi.A02);
        double d4 = d2 + (d3 * dPow);
        return dA01 * Math.pow((d4 >= 0.0d ? d4 : 0.0d) / (hAi.A03 + (hAi.A04 * dPow)), hAi.A05);
    }

    public static final double A03(HAi hAi, double d) {
        double dA01 = AbstractC7610F5x.A01((d > 0.0d ? 1 : (d == 0.0d ? 0 : -1)));
        double d2 = -hAi.A00;
        double d3 = hAi.A03;
        double d4 = 1.0d / hAi.A05;
        double d5 = hAi.A01;
        double d6 = -hAi.A04;
        double d7 = 1.0d / hAi.A02;
        double dPow = Math.pow(d * dA01, d4);
        return dA01 * Math.pow(Math.max(d2 + (d3 * dPow), 0.0d) / (d5 + (d6 * dPow)), d7);
    }
}
