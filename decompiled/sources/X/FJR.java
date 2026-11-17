package X;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.text.BreakIterator;

/* loaded from: classes6.dex */
public final class FJR implements FJD {
    public final C7912FKk A00;
    public final CharSequence A01;

    @Override // X.FJD
    public final C7881FIw APX(FJH fjh, long j) {
        TextView fjs;
        int iIntValue;
        int iA01 = AbstractC7826FGh.A01(j);
        int iA00 = AbstractC7826FGh.A00(j);
        CharSequence charSequence = this.A01;
        CharSequence charSequence2 = charSequence;
        C7764FDr<Object> c7764FDr = fjh.A00;
        Context context = c7764FDr.A03;
        try {
            fjs = new FJS(context, (AttributeSet) null);
            fjs.setBackgroundResource(R.color.transparent);
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !C7BY.A0q(message, "ConstantState.newDrawable", false)) {
                throw e;
            }
            View viewInflate = LayoutInflater.from(context).inflate(com.facebook.aura.R.layout._name_removed__res_0x7f0d0146, (ViewGroup) null, false);
            C7384Etj.A0Z(viewInflate, "null cannot be cast to non-null type com.facebook.primitive.textinput.TextInputViewForMeasure");
            fjs = (TextView) viewInflate;
        }
        C7912FKk c7912FKk = this.A00;
        Integer num = c7912FKk.A0G;
        if (num != null && (iIntValue = num.intValue()) > -1) {
            fjs.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(iIntValue)});
        }
        if (charSequence == null) {
            charSequence2 = c7912FKk.A09;
        }
        fjs.setText(charSequence2);
        try {
            fjs.setHint(c7912FKk.A08);
        } catch (AndroidRuntimeException e2) {
            if (!C7BY.A0q(C60Q.A0e(e2), "CalledFromWrongThreadException", false)) {
                throw e2;
            }
        }
        Integer num2 = c7912FKk.A0D;
        if (num2 != null) {
            fjs.setGravity(num2.intValue());
        }
        Rect rect = c7912FKk.A00;
        if (rect != null) {
            fjs.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        }
        FJB fjb = c7912FKk.A07;
        if (fjb != null) {
            fjs.setTextSize(fjb.A01, fjb.A00);
        }
        Float f = c7912FKk.A0A;
        float lineSpacingExtra = fjs.getLineSpacingExtra();
        float lineSpacingMultiplier = fjs.getLineSpacingMultiplier();
        if (f != null) {
            float fFloatValue = f.floatValue();
            float fontMetrics = fjs.getPaint().getFontMetrics(null);
            lineSpacingExtra = fFloatValue == fontMetrics ? 0.0f : fFloatValue - fontMetrics;
        }
        fjs.setLineSpacing(lineSpacingExtra, lineSpacingMultiplier);
        FIH fih = c7912FKk.A05;
        Integer numValueOf = fih != null ? Integer.valueOf(fih.A00()) : null;
        HiJ hiJ = c7912FKk.A03;
        boolean z = c7912FKk.A0P;
        int iA002 = Hl4.A00(hiJ, numValueOf, z);
        fjs.setInputType(iA002);
        if (z && !AbstractC7924FKw.A01(iA002)) {
            fjs.setSingleLine(true);
        }
        Typeface typeface = c7912FKk.A01;
        if (typeface != null) {
            fjs.setTypeface(typeface);
        }
        if (c7764FDr.A01) {
            int mode = View.MeasureSpec.getMode(iA01);
            int size = View.MeasureSpec.getSize(iA01);
            if (mode != 0 && size == 0) {
                if (charSequence == null) {
                    charSequence = c7912FKk.A09;
                }
                TextPaint paint = fjs.getPaint();
                BreakIterator wordInstance = BreakIterator.getWordInstance();
                wordInstance.setText(charSequence.toString());
                int iFirst = wordInstance.first();
                int next = wordInstance.next();
                float fMax = 0.0f;
                while (true) {
                    int i = iFirst;
                    iFirst = next;
                    if (next == -1) {
                        break;
                    }
                    fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, i, next, paint));
                    next = wordInstance.next();
                }
                iA01 = View.MeasureSpec.makeMeasureSpec(AbstractC7607F5u.A08(fMax), Integer.MIN_VALUE);
            }
            int mode2 = View.MeasureSpec.getMode(iA00);
            int size2 = View.MeasureSpec.getSize(iA00);
            if (mode2 != 0 && size2 == 0) {
                iA00 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
        }
        fjs.measure(iA01, iA00);
        return new C7881FIw(null, FEP.A00(View.MeasureSpec.getMode(iA01) == Integer.MIN_VALUE ? View.MeasureSpec.getSize(iA01) : fjs.getMeasuredWidth(), fjs.getMeasuredHeight()));
    }

    public FJR(C7912FKk c7912FKk, CharSequence charSequence) {
        this.A00 = c7912FKk;
        this.A01 = charSequence;
    }

    @Override // X.FJD
    /* renamed from: AOM */
    public final /* bridge */ boolean AON(FJD fjd) {
        return AbstractC7609F5w.A1W(fjd, this);
    }

    @Override // X.InterfaceC10547Hrt
    public final /* bridge */ /* synthetic */ boolean AON(FJD fjd) {
        return AbstractC7609F5w.A1W(fjd, this);
    }
}
