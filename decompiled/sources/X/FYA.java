package X;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes6.dex */
public final class FYA {
    public int A00;
    public int A01;
    public int A02;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public static final int[] A0B = new int[3];
    public static final float[] A09 = {0.0f, 0.5f, 1.0f};
    public static final int[] A0A = new int[4];
    public static final float[] A08 = {0.0f, 0.0f, 0.5f, 1.0f};
    public final Path A07 = AbstractC7607F5u.A0V();
    public Paint A03 = AbstractC7607F5u.A0T();

    public FYA() {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A06 = paintA0T;
        this.A02 = 1140850688;
        this.A01 = 335544320;
        this.A00 = 0;
        paintA0T.setColor(1140850688);
        this.A03.setColor(0);
        Paint paintA0U = AbstractC7607F5u.A0U(4);
        this.A04 = paintA0U;
        AbstractC7607F5u.A1G(paintA0U);
        this.A05 = new Paint(paintA0U);
    }
}
