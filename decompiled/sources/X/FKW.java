package X;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes6.dex */
public final class FKW implements Cloneable {
    public float A00;
    public float A01;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0G;
    public int A0H;
    public int A0N;
    public int A0O;
    public ColorStateList A0S;
    public Typeface A0T;
    public TextUtils.TruncateAt A0U;
    public InterfaceC7910FKh A0V;
    public FKJ A0W;
    public Boolean A0X;
    public CharSequence A0Y;
    public Integer A0Z;
    public Integer A0a;
    public String A0b;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0c = true;
    public int A0M = Integer.MIN_VALUE;
    public int A0J = Integer.MAX_VALUE;
    public int A0L = -1;
    public int A0I = -1;
    public int A0K = Integer.MAX_VALUE;
    public int A0P = -7829368;
    public int A0F = -16776961;
    public int A0Q = -1;
    public float A02 = Float.MAX_VALUE;
    public float A03 = 1.0f;
    public int A0R = Typeface.DEFAULT.getStyle();

    public final String toString() {
        String str;
        String str2;
        StringBuilder sbA0x = C60O.A0x("TextStyle(ellipsize=");
        sbA0x.append(this.A0U);
        sbA0x.append(", customEllipsisText=");
        sbA0x.append(this.A0Y);
        sbA0x.append(", includeFontPadding=");
        sbA0x.append(this.A0c);
        sbA0x.append(", minLines=");
        sbA0x.append(this.A0M);
        sbA0x.append(C8j2.A00(10));
        sbA0x.append(this.A0J);
        sbA0x.append(", minEms=");
        sbA0x.append(this.A0L);
        sbA0x.append(", maxEms=");
        sbA0x.append(this.A0I);
        sbA0x.append(", minTextWidth=");
        sbA0x.append(this.A0N);
        sbA0x.append(", maxTextWidth=");
        sbA0x.append(this.A0K);
        sbA0x.append(", shadowRadius=");
        sbA0x.append(this.A07);
        sbA0x.append(", shadowDx=");
        sbA0x.append(this.A05);
        sbA0x.append(", shadowDy=");
        sbA0x.append(this.A06);
        sbA0x.append(", shadowColor=");
        sbA0x.append(this.A0P);
        sbA0x.append(", isSingleLine=");
        sbA0x.append(this.A0d);
        sbA0x.append(C8j2.A00(33));
        sbA0x.append(this.A0F);
        sbA0x.append(", textSize=");
        sbA0x.append(this.A0Q);
        sbA0x.append(", shouldAddSpacingExtraToFirstLine=");
        sbA0x.append(this.A0f);
        sbA0x.append(", lineSpacingExtra=");
        sbA0x.append(this.A04);
        sbA0x.append(C8j2.A00(32));
        sbA0x.append(this.A02);
        sbA0x.append(", lineHeightMultiplier=");
        sbA0x.append(this.A03);
        sbA0x.append(", letterSpacing=");
        sbA0x.append(0.0f);
        sbA0x.append(C8j2.A00(44));
        sbA0x.append(this.A0R);
        sbA0x.append(", typeface=");
        sbA0x.append(this.A0T);
        sbA0x.append(C8j2.A00(8));
        Integer num = this.A0Z;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "TEXT_END";
                    break;
                case 2:
                    str = "CENTER";
                    break;
                case 3:
                    str = "LAYOUT_START";
                    break;
                case 4:
                    str = "LAYOUT_END";
                    break;
                case 5:
                    str = "LEFT";
                    break;
                case 6:
                    str = "RIGHT";
                    break;
                default:
                    str = "TEXT_START";
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(str);
        sbA0x.append(", breakStrategy=");
        sbA0x.append(this.A09);
        sbA0x.append(", hyphenationFrequency=");
        sbA0x.append(this.A0C);
        sbA0x.append(", justificationMode=");
        sbA0x.append(this.A0D);
        sbA0x.append(C8j2.A00(43));
        sbA0x.append(this.A0V);
        sbA0x.append(", clipToBounds=");
        sbA0x.append(false);
        sbA0x.append(", textBelongsToHost=");
        sbA0x.append(false);
        sbA0x.append(", exposeClickableSpansToAccessibility=");
        sbA0x.append(true);
        sbA0x.append(", verticalGravity=");
        switch (this.A0a.intValue()) {
            case 0:
                str2 = "TOP";
                break;
            case 1:
                str2 = "CENTER";
                break;
            default:
                str2 = "BOTTOM";
                break;
        }
        sbA0x.append(str2);
        sbA0x.append(", highlightColor=");
        sbA0x.append(this.A0A);
        sbA0x.append(", keyboardHighlightColor=");
        sbA0x.append(this.A0E);
        sbA0x.append(", highlightStartOffset=");
        sbA0x.append(-1);
        sbA0x.append(", highlightEndOffset=");
        sbA0x.append(-1);
        sbA0x.append(", highlightCornerRadius=");
        sbA0x.append(this.A0B);
        sbA0x.append(", shouldLayoutEmptyText=");
        sbA0x.append(this.A0g);
        sbA0x.append(", minimallyWide=");
        sbA0x.append(false);
        sbA0x.append(", minimallyWideThreshold=");
        sbA0x.append(0);
        sbA0x.append(", clickableSpanExpandedOffset=");
        sbA0x.append(0.0f);
        sbA0x.append(", shouldTruncateTextUsingConstraints=");
        sbA0x.append(false);
        sbA0x.append(", manualBaselineSpacing=");
        sbA0x.append(this.A0G);
        sbA0x.append(", manualCapSpacing=");
        sbA0x.append(this.A0H);
        sbA0x.append(", extraSpacingLeft=");
        sbA0x.append(this.A00);
        sbA0x.append(", extraSpacingRight=");
        sbA0x.append(this.A01);
        sbA0x.append(", outlineWidth=");
        sbA0x.append(0.0f);
        sbA0x.append(", outlineColor=");
        sbA0x.append(0);
        sbA0x.append(", roundedBackgroundProps=");
        sbA0x.append(this.A0W);
        sbA0x.append(", accessibilityLabel=");
        sbA0x.append(this.A0b);
        sbA0x.append(", isTextSelectable=");
        sbA0x.append(this.A0e);
        sbA0x.append(", selectionHandleColor=");
        sbA0x.append(this.A0O);
        sbA0x.append(", truncationStyle=");
        sbA0x.append("USE_MAX_LINES");
        sbA0x.append(", resolvedLayoutDirectionRtl=");
        sbA0x.append(this.A0X);
        sbA0x.append(C60N.A00(37));
        sbA0x.append(this.A08);
        sbA0x.append(", textColorStateList=");
        sbA0x.append(this.A0S);
        return BV7.A10(sbA0x);
    }

    public FKW() {
        Integer num = C79.A00;
        this.A0Z = num;
        this.A09 = -1;
        this.A0a = num;
        this.A0G = Integer.MIN_VALUE;
        this.A0H = Integer.MIN_VALUE;
        this.A08 = -16777216;
    }

    public final FKW A00() throws CloneNotSupportedException {
        try {
            Object objClone = super.clone();
            C7384Etj.A0Z(objClone, "null cannot be cast to non-null type com.facebook.rendercore.text.TextStyle");
            return (FKW) objClone;
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }

    public final /* bridge */ Object clone() {
        return super.clone();
    }
}
