package X;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.Has, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10389Has {
    public Uri A00;
    public Bundle A01;
    public ImmutableList<String> A02;
    public Boolean A03;
    public Boolean A04;
    public CharSequence A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
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
    public Long A0V;
    public byte[] A0W;

    public final void A00(C10388Har c10388Har) {
        CharSequence charSequence = c10388Har.A0G;
        if (charSequence != null) {
            this.A0G = charSequence;
        }
        CharSequence charSequence2 = c10388Har.A07;
        if (charSequence2 != null) {
            this.A07 = charSequence2;
        }
        CharSequence charSequence3 = c10388Har.A06;
        if (charSequence3 != null) {
            this.A06 = charSequence3;
        }
        CharSequence charSequence4 = c10388Har.A05;
        if (charSequence4 != null) {
            this.A05 = charSequence4;
        }
        CharSequence charSequence5 = c10388Har.A0C;
        if (charSequence5 != null) {
            this.A0C = charSequence5;
        }
        CharSequence charSequence6 = c10388Har.A0F;
        if (charSequence6 != null) {
            this.A0F = charSequence6;
        }
        CharSequence charSequence7 = c10388Har.A0B;
        if (charSequence7 != null) {
            this.A0B = charSequence7;
        }
        Long l = c10388Har.A0W;
        if (l != null) {
            C1G.A07(C8j3.A1Q((l.longValue() > 0L ? 1 : (l.longValue() == 0L ? 0 : -1))));
            this.A0V = l;
        }
        Uri uri = c10388Har.A00;
        if (uri != null || c10388Har.A0X != null) {
            this.A00 = uri;
            byte[] bArr = c10388Har.A0X;
            Integer num = c10388Har.A0I;
            this.A0W = bArr == null ? null : (byte[]) bArr.clone();
            this.A0I = num;
        }
        Integer num2 = c10388Har.A0U;
        if (num2 != null) {
            this.A0U = num2;
        }
        Integer num3 = c10388Har.A0T;
        if (num3 != null) {
            this.A0T = num3;
        }
        Integer num4 = c10388Har.A0K;
        if (num4 != null) {
            this.A0K = num4;
        }
        Boolean bool = c10388Har.A03;
        if (bool != null) {
            this.A03 = bool;
        }
        Boolean bool2 = c10388Har.A04;
        if (bool2 != null) {
            this.A04 = bool2;
        }
        Integer num5 = c10388Har.A0V;
        if (num5 != null) {
            this.A0O = num5;
        }
        Integer num6 = c10388Har.A0O;
        if (num6 != null) {
            this.A0O = num6;
        }
        Integer num7 = c10388Har.A0N;
        if (num7 != null) {
            this.A0N = num7;
        }
        Integer num8 = c10388Har.A0M;
        if (num8 != null) {
            this.A0M = num8;
        }
        Integer num9 = c10388Har.A0R;
        if (num9 != null) {
            this.A0R = num9;
        }
        Integer num10 = c10388Har.A0Q;
        if (num10 != null) {
            this.A0Q = num10;
        }
        Integer num11 = c10388Har.A0P;
        if (num11 != null) {
            this.A0P = num11;
        }
        CharSequence charSequence8 = c10388Har.A0H;
        if (charSequence8 != null) {
            this.A0H = charSequence8;
        }
        CharSequence charSequence9 = c10388Har.A09;
        if (charSequence9 != null) {
            this.A09 = charSequence9;
        }
        CharSequence charSequence10 = c10388Har.A0A;
        if (charSequence10 != null) {
            this.A0A = charSequence10;
        }
        Integer num12 = c10388Har.A0J;
        if (num12 != null) {
            this.A0J = num12;
        }
        Integer num13 = c10388Har.A0S;
        if (num13 != null) {
            this.A0S = num13;
        }
        CharSequence charSequence11 = c10388Har.A0D;
        if (charSequence11 != null) {
            this.A0D = charSequence11;
        }
        CharSequence charSequence12 = c10388Har.A08;
        if (charSequence12 != null) {
            this.A08 = charSequence12;
        }
        CharSequence charSequence13 = c10388Har.A0E;
        if (charSequence13 != null) {
            this.A0E = charSequence13;
        }
        Integer num14 = c10388Har.A0L;
        if (num14 != null) {
            this.A0L = num14;
        }
        Bundle bundle = c10388Har.A01;
        if (bundle != null) {
            this.A01 = bundle;
        }
        ImmutableList<String> immutableList = c10388Har.A02;
        if (immutableList.isEmpty()) {
            return;
        }
        this.A02 = ImmutableList.copyOf((Collection) immutableList);
    }

    public final void A01(byte[] bArr, int i) {
        if (this.A0W == null || i == 3 || !C6xC.A00(this.A0I, 3)) {
            this.A0W = (byte[]) bArr.clone();
            this.A0I = Integer.valueOf(i);
        }
    }

    public C10389Has() {
        this.A02 = ImmutableList.of();
    }

    public C10389Has(C10388Har c10388Har) {
        this.A0G = c10388Har.A0G;
        this.A07 = c10388Har.A07;
        this.A06 = c10388Har.A06;
        this.A05 = c10388Har.A05;
        this.A0C = c10388Har.A0C;
        this.A0F = c10388Har.A0F;
        this.A0B = c10388Har.A0B;
        this.A0V = c10388Har.A0W;
        this.A0W = c10388Har.A0X;
        this.A0I = c10388Har.A0I;
        this.A00 = c10388Har.A00;
        this.A0U = c10388Har.A0U;
        this.A0T = c10388Har.A0T;
        this.A0K = c10388Har.A0K;
        this.A03 = c10388Har.A03;
        this.A04 = c10388Har.A04;
        this.A0O = c10388Har.A0O;
        this.A0N = c10388Har.A0N;
        this.A0M = c10388Har.A0M;
        this.A0R = c10388Har.A0R;
        this.A0Q = c10388Har.A0Q;
        this.A0P = c10388Har.A0P;
        this.A0H = c10388Har.A0H;
        this.A09 = c10388Har.A09;
        this.A0A = c10388Har.A0A;
        this.A0J = c10388Har.A0J;
        this.A0S = c10388Har.A0S;
        this.A0D = c10388Har.A0D;
        this.A08 = c10388Har.A08;
        this.A0E = c10388Har.A0E;
        this.A0L = c10388Har.A0L;
        this.A02 = c10388Har.A02;
        this.A01 = c10388Har.A01;
    }
}
