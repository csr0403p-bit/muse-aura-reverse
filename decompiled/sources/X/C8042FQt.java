package X;

import android.content.Context;
import android.view.animation.Interpolator;
import com.instagram.common.bloks.BloksParseResult;

/* renamed from: X.FQt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8042FQt {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final Interpolator A04;
    public final Interpolator A05;
    public final FR2 A06;
    public final FR1 A07;
    public final BloksParseResult A08;
    public final FBD A09;
    public final Integer A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C8042FQt(Context context, Interpolator interpolator, Interpolator interpolator2, FR2 fr2, FR1 fr1, BloksParseResult bloksParseResult, FBD fbd, Integer num, String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = context;
        this.A09 = fbd;
        this.A08 = bloksParseResult;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A05 = interpolator;
        this.A04 = interpolator2;
        this.A07 = fr1;
        this.A06 = fr2;
        this.A0D = z;
        this.A0B = str;
        this.A0C = z2;
        this.A0A = num;
    }
}
