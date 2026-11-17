package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class HBB implements Cloneable {
    public long A00 = 0;
    public HC3 A01;
    public C10340HBe A02;
    public HBD A03;
    public HBD A04;
    public HBD A05;
    public HC9 A06;
    public HC9 A07;
    public HC9 A08;
    public HC9 A09;
    public HC9 A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Float A0E;
    public Float A0F;
    public Float A0G;
    public Float A0H;
    public Float A0I;
    public Float A0J;
    public Float A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List<String> A0b;
    public HBD[] A0c;

    public static HBB A00() {
        HBB hbb = new HBB();
        hbb.A00 = -1L;
        C10340HBe c10340HBe = C10340HBe.A01;
        hbb.A06 = c10340HBe;
        Integer num = C79.A00;
        hbb.A0N = num;
        Float fValueOf = Float.valueOf(1.0f);
        hbb.A0E = fValueOf;
        hbb.A09 = null;
        hbb.A0J = fValueOf;
        HBD hbd = new HBD();
        hbd.A00 = 1.0f;
        hbd.A01 = num;
        hbb.A05 = hbd;
        hbb.A0R = num;
        hbb.A0S = num;
        hbb.A0I = Float.valueOf(4.0f);
        hbb.A0c = null;
        HBD hbd2 = new HBD();
        hbd2.A00 = 0.0f;
        hbd2.A01 = num;
        hbb.A04 = hbd2;
        hbb.A0F = fValueOf;
        hbb.A02 = c10340HBe;
        hbb.A0b = null;
        hbb.A03 = new HBD(C79.A0W, 12.0f);
        hbb.A0P = 400;
        hbb.A0O = num;
        hbb.A0U = num;
        hbb.A0M = num;
        hbb.A0T = num;
        hbb.A0C = AnonymousClass001.A0i();
        hbb.A01 = null;
        hbb.A0Z = null;
        hbb.A0Y = null;
        hbb.A0X = null;
        Boolean bool = Boolean.TRUE;
        hbb.A0B = bool;
        hbb.A0D = bool;
        hbb.A08 = c10340HBe;
        hbb.A0H = fValueOf;
        hbb.A0W = null;
        hbb.A0L = num;
        hbb.A0a = null;
        hbb.A07 = null;
        hbb.A0G = fValueOf;
        hbb.A0A = null;
        hbb.A0K = fValueOf;
        hbb.A0V = num;
        hbb.A0Q = num;
        return hbb;
    }

    public final Object clone() {
        HBB hbb = (HBB) super.clone();
        HBD[] hbdArr = this.A0c;
        if (hbdArr != null) {
            hbb.A0c = (HBD[]) hbdArr.clone();
        }
        return hbb;
    }
}
