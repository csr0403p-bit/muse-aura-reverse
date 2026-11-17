package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.aura.R;
import java.util.AbstractMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8196FYn extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8196FYn(GRZ grz) {
        super(2);
        this.$t = 26;
        this.A01 = grz;
        this.A00 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v40, types: [T, X.Hk5, java.lang.Object] */
    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int iIntValue;
        Object obj3;
        Function0 function0A02;
        int i4;
        Drawable colorDrawable;
        Drawable.ConstantState constantState;
        switch (this.$t) {
            case 0:
                Hj6 hj6A03 = C9115Fyg.A03(C9115Fyg.A02(obj), obj2, AnonymousClass002.A1a(obj, obj2) ? 1 : 0);
                FDW fdw = (FDW) this.A01;
                C7384Etj.A0Y(fdw, 0);
                return Boolean.valueOf(HoH.A01(F6D.A03((FBB) this.A00, fdw, hj6A03, fdw.A0D(62))));
            case 1:
                C7384Etj.A0Y(obj2, 1);
                if (obj != null) {
                    ((AbstractMap) ((FBB) this.A00).A03(R.id.bk_context_key_videos)).remove(obj);
                }
                ((AbstractMap) ((FBB) this.A00).A03(R.id.bk_context_key_videos)).put(obj2, this.A01);
                return Unit.INSTANCE;
            case 2:
                C7384Etj.A0Y(obj, 0);
                ((G0V) this.A00).invoke(obj, obj2);
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) this.A01;
                Unit unit = Unit.INSTANCE;
                C3cG.A1F(interfaceC10560Hsz, unit);
                return unit;
            case 3:
                InterfaceC10512HoG interfaceC10512HoG = (InterfaceC10512HoG) obj;
                C7384Etj.A0Y(interfaceC10512HoG, 0);
                HuV huV = (HuV) this.A01;
                InterfaceC10560Hsz interfaceC10560Hsz2 = (InterfaceC10560Hsz) this.A00;
                if (obj2 != null) {
                    HsD<V> hsD = new HsD<>(obj2);
                    synchronized (huV.A02) {
                        if (huV.A01 == interfaceC10560Hsz2) {
                            huV.A00 = hsD;
                            huV.A01 = null;
                        }
                    }
                    C3cG.A1F(interfaceC10560Hsz2, hsD);
                } else {
                    HuV.A01(interfaceC10512HoG, huV, interfaceC10560Hsz2);
                }
                return Unit.INSTANCE;
            case 4:
                TextView textView = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView);
                C7923FKv c7923FKv = ((C7925FKx) this.A00).A03;
                if (c7923FKv == null) {
                    throw BV4.A0U();
                }
                textView.setLetterSpacing(c7923FKv.A00);
                i2 = 12;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 5:
                TextView textView2 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView2);
                C7923FKv c7923FKv2 = ((C7925FKx) this.A00).A03;
                if (c7923FKv2 == null) {
                    throw BV4.A0U();
                }
                Float f = ((C7912FKk) this.A01).A0A;
                float f2 = c7923FKv2.A01;
                float f3 = c7923FKv2.A02;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    float fontMetrics = textView2.getPaint().getFontMetrics(null);
                    f2 = fFloatValue == fontMetrics ? 0.0f : fFloatValue - fontMetrics;
                }
                textView2.setLineSpacing(f2, f3);
                i2 = 13;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 6:
                TextView textView3 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView3);
                C7923FKv c7923FKv3 = ((C7925FKx) this.A00).A03;
                if (c7923FKv3 == null) {
                    throw BV4.A0U();
                }
                Drawable drawableNewDrawable = c7923FKv3.A0E;
                Integer num = ((C7912FKk) this.A01).A0C;
                if (num != null && drawableNewDrawable != null && (constantState = drawableNewDrawable.getConstantState()) != null) {
                    drawableNewDrawable = constantState.newDrawable();
                    C7384Etj.A0U(drawableNewDrawable);
                    drawableNewDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_OVER));
                }
                FLM.A00(drawableNewDrawable, textView3);
                i2 = 14;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 7:
                View view = (View) obj2;
                AnonymousClass003.A0u(obj, view);
                Integer num2 = ((C7912FKk) this.A01).A0B;
                if (num2 != null) {
                    colorDrawable = new ColorDrawable(num2.intValue());
                } else {
                    C7923FKv c7923FKv4 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv4 == null) {
                        throw BV4.A0U();
                    }
                    colorDrawable = c7923FKv4.A0D;
                }
                view.setBackgroundDrawable(colorDrawable);
                i2 = 15;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 8:
                TextView textView4 = (TextView) obj2;
                boolean zA1a = AnonymousClass002.A1a(obj, textView4);
                FIc fIc = ((C7912FKk) this.A01).A04;
                if (fIc != null) {
                    int iOrdinal = fIc.ordinal();
                    i4 = 6;
                    if (iOrdinal != 0) {
                        i4 = 2;
                        if (iOrdinal != zA1a) {
                            i4 = 5;
                            if (iOrdinal != 2) {
                                if (iOrdinal == 3) {
                                    i4 = 3;
                                } else {
                                    if (iOrdinal != 4) {
                                        throw C3cG.A0q();
                                    }
                                    i4 = 4;
                                }
                            }
                        }
                    }
                } else {
                    C7923FKv c7923FKv5 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv5 == null) {
                        throw BV4.A0U();
                    }
                    i4 = c7923FKv5.A06;
                }
                textView4.setImeOptions(i4);
                i2 = 16;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 9:
                FL4 fl4 = (FL4) obj2;
                AnonymousClass003.A0u(obj, fl4);
                C7925FKx c7925FKx = (C7925FKx) this.A00;
                Drawable textCursorDrawable = fl4.getTextCursorDrawable();
                float letterSpacing = fl4.getLetterSpacing();
                boolean showSoftInputOnFocus = fl4.getShowSoftInputOnFocus();
                int highlightColor = fl4.getHighlightColor();
                Editable text = fl4.getText();
                float textSize = fl4.getTextSize();
                ColorStateList textColors = fl4.getTextColors();
                CharSequence hint = fl4.getHint();
                ColorStateList hintTextColors = fl4.getHintTextColors();
                int gravity = fl4.getGravity();
                Rect rect = new Rect(fl4.getPaddingLeft(), fl4.getPaddingTop(), fl4.getPaddingRight(), fl4.getPaddingBottom());
                C7926FKy c7926FKy = new C7926FKy(fl4.getShadowDx(), fl4.getShadowDy(), fl4.getShadowRadius(), fl4.getShadowColor());
                float lineSpacingExtra = fl4.getLineSpacingExtra();
                float lineSpacingMultiplier = fl4.getLineSpacingMultiplier();
                c7925FKx.A03 = new C7923FKv(textColors, hintTextColors, rect, fl4.getTypeface(), textCursorDrawable, fl4.getBackground(), text, fl4.getEllipsize(), fl4.getKeyListener(), c7926FKy, hint, textSize, lineSpacingExtra, lineSpacingMultiplier, letterSpacing, highlightColor, gravity, fl4.getImeOptions(), fl4.getInputType(), fl4.getMaxLines(), fl4.isSingleLine(), showSoftInputOnFocus);
                c7925FKx.A02 = fl4;
                CharSequence charSequence = c7925FKx.A05;
                if (charSequence == null) {
                    charSequence = ((C7912FKk) this.A01).A09;
                }
                fl4.setText(charSequence);
                ViewOnFocusChangeListenerC7920FKs viewOnFocusChangeListenerC7920FKs = new ViewOnFocusChangeListenerC7920FKs();
                I0T i0t = new I0T(c7925FKx, 0);
                viewOnFocusChangeListenerC7920FKs.A00.add(i0t);
                fl4.setOnFocusChangeListener(viewOnFocusChangeListenerC7920FKs);
                fl4.addTextChangedListener(c7925FKx.A01);
                function0A02 = new C8187FYe(i0t, c7925FKx, viewOnFocusChangeListenerC7920FKs, fl4, 2);
                return new FK1(function0A02);
            case 10:
                TextView textView5 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView5);
                C7923FKv c7923FKv6 = ((C7925FKx) this.A00).A03;
                if (c7923FKv6 == null) {
                    throw BV4.A0U();
                }
                textView5.setMaxLines(c7923FKv6.A08);
                i2 = 19;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 11:
                int iA0F = AnonymousClass001.A0F(obj);
                int iA0F2 = AnonymousClass001.A0F(obj2);
                EditText editText = (EditText) this.A01;
                int maxLines = editText.getMaxLines();
                if (maxLines == -1 || iA0F2 <= maxLines || iA0F < maxLines) {
                    ((G0U) this.A00).invoke(editText.getText().subSequence(0, AbstractC7609F5w.A0D(editText)));
                }
                return Unit.INSTANCE;
            case 12:
                EditText editText2 = (EditText) obj2;
                AnonymousClass003.A0u(obj, editText2);
                C10543Hqv c10543HqvA0z = C3cG.A0z();
                String str = ((C7912FKk) this.A01).A0J;
                if (str != null && str.length() != 0) {
                    ?? hk5 = new Hk5(editText2, str);
                    c10543HqvA0z.element = hk5;
                    ((C7925FKx) this.A00).A01.A02.add(hk5);
                }
                function0A02 = new C8197FYo(22, c10543HqvA0z, this.A00);
                return new FK1(function0A02);
            case 13:
                C7384Etj.A0Y(obj, 0);
                Function0<Unit> function0 = ((C7912FKk) this.A01).A0M;
                if (function0 != null) {
                    ((C7925FKx) this.A00).A01.A00 = new FLI(function0);
                }
                i = 25;
                obj3 = this.A00;
                function0A02 = FZO.A02(obj3, i);
                return new FK1(function0A02);
            case 14:
                View view2 = (View) obj2;
                AnonymousClass003.A0u(obj, view2);
                String str2 = ((C7912FKk) this.A01).A0I;
                if (str2 != null) {
                    Context context = (Context) this.A00;
                    C7384Etj.A0Y(context, 0);
                    FLX.A00.A04(context, view2, str2);
                }
                i3 = 20;
                return new FK1(C8472Feb.A00(i3));
            case 15:
                TextView textView6 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView6);
                CharSequence charSequence2 = ((C7912FKk) this.A01).A08;
                if (charSequence2 == null) {
                    C7923FKv c7923FKv7 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv7 == null) {
                        throw BV4.A0U();
                    }
                    charSequence2 = c7923FKv7.A0J;
                }
                textView6.setHint(charSequence2);
                i2 = 18;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 16:
                TextView textView7 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView7);
                Integer num3 = ((C7912FKk) this.A01).A0E;
                if (num3 != null) {
                    textView7.setHintTextColor(num3.intValue());
                } else {
                    C7923FKv c7923FKv8 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv8 == null) {
                        throw BV4.A0U();
                    }
                    textView7.setHintTextColor(c7923FKv8.A09);
                }
                i3 = 22;
                return new FK1(C8472Feb.A00(i3));
            case 17:
                TextView textView8 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView8);
                C7923FKv c7923FKv9 = ((C7925FKx) this.A00).A03;
                if (c7923FKv9 == null) {
                    throw BV4.A0U();
                }
                textView8.setHighlightColor(c7923FKv9.A05);
                i2 = 23;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 18:
                TextView textView9 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView9);
                Integer num4 = ((C7912FKk) this.A01).A0D;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                } else {
                    C7923FKv c7923FKv10 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv10 == null) {
                        throw BV4.A0U();
                    }
                    iIntValue = c7923FKv10.A04;
                }
                textView9.setGravity(iIntValue);
                i2 = 24;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 19:
                View view3 = (View) obj2;
                AnonymousClass003.A0u(obj, view3);
                Rect rect2 = ((C7912FKk) this.A01).A00;
                if (rect2 == null) {
                    C7923FKv c7923FKv11 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv11 == null) {
                        throw BV4.A0U();
                    }
                    rect2 = c7923FKv11.A0B;
                }
                view3.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
                i2 = 25;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 20:
                EditText editText3 = (EditText) obj2;
                boolean zA1b = AnonymousClass004.A1b(obj, editText3);
                C7912FKk c7912FKk = (C7912FKk) this.A01;
                FJB fjb = c7912FKk.A07;
                if (fjb != null) {
                    editText3.setTextSize(fjb.A01, fjb.A00);
                    if (c7912FKk.A0Q) {
                        BTQ btq = new BTQ(A6B.A03(C7927FKz.A00, AbstractC0878AGe.A06(((C7925FKx) this.A00).A01.A02)));
                        while (btq.hasNext()) {
                            ((FL0) btq.next()).afterTextChanged(editText3.getText());
                        }
                    }
                } else {
                    C7923FKv c7923FKv12 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv12 == null) {
                        throw BV4.A0U();
                    }
                    editText3.setTextSize(zA1b ? 1 : 0, c7923FKv12.A03);
                }
                i3 = 27;
                return new FK1(C8472Feb.A00(i3));
            case 21:
                TextView textView10 = (TextView) obj2;
                AnonymousClass003.A0u(obj, textView10);
                Integer num5 = ((C7912FKk) this.A01).A0F;
                if (num5 != null) {
                    textView10.setTextColor(num5.intValue());
                } else {
                    C7923FKv c7923FKv13 = ((C7925FKx) this.A00).A03;
                    if (c7923FKv13 == null) {
                        throw BV4.A0U();
                    }
                    ColorStateList colorStateList = c7923FKv13.A0A;
                    if (colorStateList != null) {
                        textView10.setTextColor(colorStateList);
                    }
                }
                return new FK1(C8472Feb.A00(28));
            case 22:
                C7384Etj.A0Y(obj, 0);
                i2 = 31;
                function0A02 = C8472Feb.A00(i2);
                return new FK1(function0A02);
            case 23:
                C7384Etj.A0Y(obj, 0);
                FKF fkf = (FKF) this.A00;
                fkf.A00 = ((FT3) this.A01).A03;
                i = 28;
                obj3 = fkf;
                function0A02 = FZO.A02(obj3, i);
                return new FK1(function0A02);
            case 24:
                C7384Etj.A0Y(obj, 0);
                FKF fkf2 = (FKF) this.A00;
                fkf2.A06 = ((FT3) this.A01).A0C;
                i = 29;
                obj3 = fkf2;
                function0A02 = FZO.A02(obj3, i);
                return new FK1(function0A02);
            case 25:
                C7384Etj.A0Y(obj, 0);
                FKF fkf3 = (FKF) this.A00;
                fkf3.A05 = ((FT3) this.A01).A0B;
                i = 30;
                obj3 = fkf3;
                function0A02 = FZO.A02(obj3, i);
                return new FK1(function0A02);
            default:
                int iA0F3 = AnonymousClass001.A0F(obj);
                G0U g0u = (G0U) obj2;
                C7384Etj.A0Y(g0u, 1);
                GRT grt = new GRT(g0u, iA0F3);
                Object obj4 = this.A01;
                C7384Etj.A0Y(obj4, 0);
                return new FZG(22, grt, obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8196FYn(C7925FKx c7925FKx, C7912FKk c7912FKk, int i) {
        super(2);
        this.$t = i;
        switch (i) {
            case 4:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                this.A01 = c7912FKk;
                this.A00 = c7925FKx;
                break;
            case 5:
            case 6:
            case 9:
            case 11:
            case 14:
            default:
                this.A00 = c7925FKx;
                this.A01 = c7912FKk;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8196FYn(int i, Object obj, Object obj2) {
        super(2);
        this.$t = i;
        this.A01 = obj2;
        this.A00 = obj;
    }
}
