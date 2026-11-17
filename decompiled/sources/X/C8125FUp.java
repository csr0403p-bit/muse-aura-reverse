package X;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.FUp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8125FUp {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public Path A0E;
    public boolean A0F;
    public int[] A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final RectF A0K = AbstractC7607F5u.A0Y();

    public C8125FUp() {
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A0J = paintA0T;
        Paint paintA0T2 = AbstractC7607F5u.A0T();
        this.A0H = paintA0T2;
        Paint paintA0T3 = AbstractC7607F5u.A0T();
        this.A0I = paintA0T3;
        this.A04 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 0.0f;
        this.A08 = 5.0f;
        this.A00 = 1.0f;
        this.A09 = 255;
        paintA0T.setStrokeCap(Paint.Cap.SQUARE);
        paintA0T.setAntiAlias(true);
        paintA0T.setStyle(Paint.Style.STROKE);
        AbstractC7607F5u.A1G(paintA0T2);
        paintA0T2.setAntiAlias(true);
        paintA0T3.setColor(0);
    }
}
