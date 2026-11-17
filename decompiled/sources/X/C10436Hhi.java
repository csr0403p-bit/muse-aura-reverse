package X;

import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.Hhi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10436Hhi {
    public final int A00;
    public final int A01;
    public final PrecomputedText.Params A02;
    public final TextDirectionHeuristic A03;
    public final TextPaint A04;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C10436Hhi) {
                C10436Hhi c10436Hhi = (C10436Hhi) obj;
                if (this.A00 == c10436Hhi.A00 && this.A01 == c10436Hhi.A01) {
                    TextPaint textPaint = this.A04;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = c10436Hhi.A04;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
                        if (textPaint.getTypeface() == null) {
                            if (textPaint2.getTypeface() == null) {
                            }
                        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                            return false;
                        }
                        if (this.A03 == c10436Hhi.A03) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TextPaint textPaint = this.A04;
        return Arrays.hashCode(new Object[]{Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{");
        TextPaint textPaint = this.A04;
        float textSize = textPaint.getTextSize();
        StringBuilder sbA0g = C3cG.A0g("textSize=");
        sbA0g.append(textSize);
        sbA0x.append(sbA0g.toString());
        float textScaleX = textPaint.getTextScaleX();
        StringBuilder sbA0g2 = C3cG.A0g(", textScaleX=");
        sbA0g2.append(textScaleX);
        sbA0x.append(sbA0g2.toString());
        float textSkewX = textPaint.getTextSkewX();
        StringBuilder sbA0g3 = C3cG.A0g(", textSkewX=");
        sbA0g3.append(textSkewX);
        sbA0x.append(sbA0g3.toString());
        float letterSpacing = textPaint.getLetterSpacing();
        StringBuilder sbA0g4 = C3cG.A0g(", letterSpacing=");
        sbA0g4.append(letterSpacing);
        sbA0x.append(sbA0g4.toString());
        FGI.A0y(", elegantTextHeight=", sbA0x, textPaint.isElegantTextHeight());
        AbstractC7609F5w.A1I(textPaint.getTextLocales(), C60O.A0x(", textLocale="), sbA0x);
        AbstractC7609F5w.A1I(textPaint.getTypeface(), C60O.A0x(", typeface="), sbA0x);
        FGI.A0v(", variationSettings=", textPaint.getFontVariationSettings(), sbA0x);
        AbstractC7609F5w.A1I(this.A03, C60O.A0x(", textDir="), sbA0x);
        FGI.A0w(", breakStrategy=", sbA0x, this.A00);
        return AbstractC7610F5x.A0w(FGI.A0H(", hyphenationFrequency=", this.A01), sbA0x);
    }

    public C10436Hhi(PrecomputedText.Params params) {
        this.A04 = params.getTextPaint();
        this.A03 = params.getTextDirection();
        this.A00 = params.getBreakStrategy();
        this.A01 = params.getHyphenationFrequency();
        this.A02 = params;
    }
}
