package X;

import android.content.res.ColorStateList;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class FKY {
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public TextUtils.TruncateAt A0G;
    public CharSequence A0I;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final /* synthetic */ C7905FKa A0N;
    public TextPaint A0F = new TextPaint(1);
    public float A05 = 1.0f;
    public float A00 = Float.MAX_VALUE;
    public boolean A0J = true;
    public int A0A = Integer.MAX_VALUE;
    public Layout.Alignment A0E = Layout.Alignment.ALIGN_NORMAL;
    public InterfaceC7910FKh A0H = AbstractC8200FYr.A01;

    public FKY(C7905FKa c7905FKa) {
        this.A0N = c7905FKa;
    }

    public final void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public final int hashCode() {
        int iA02 = (AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02((AnonymousClass005.A02((this.A0F.getColor() + 31) * 31, this.A0F.getTextSize()) + (this.A0F.getTypeface() != null ? this.A0F.getTypeface().hashCode() : 0)) * 31, this.A01), this.A02), this.A03) + this.A09) * 31;
        TextPaint textPaint = this.A0F;
        return ((((((((AnonymousClass005.A0F(this.A0H, AnonymousClass005.A0F(this.A0E, (((((((((AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02((((((AnonymousClass005.A02((iA02 + textPaint.linkColor) * 31, textPaint.density) + Arrays.hashCode(textPaint.drawableState)) * 31) + this.A0C) * 31) + this.A0B) * 31, this.A05), this.A04), this.A00) + (this.A0J ? 1 : 0)) * 31) + 1) * 31) + C60R.A01(this.A0G)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31)) + this.A06) * 31) + this.A07) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31) + C8j4.A0E(this.A0I, 0);
    }
}
