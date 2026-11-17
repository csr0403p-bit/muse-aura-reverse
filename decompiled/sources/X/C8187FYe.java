package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.transition.FragmentTransitionSupport;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FYe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8187FYe extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8187FYe(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.$t = i;
        this.A00 = obj2;
        this.A03 = obj4;
        this.A02 = obj3;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [T, X.FYf] */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                if (AbstractC8571FgQ.A0N(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                C8540Fft c8540Fft = (C8540Fft) this.A03;
                AbstractC8522FfX abstractC8522FfX = c8540Fft.A04;
                ViewGroup viewGroup = (ViewGroup) this.A00;
                Object obj = this.A01;
                C8444Fe8 c8444Fe8A01 = abstractC8522FfX instanceof FragmentTransitionSupport ? AbstractC8431Fdu.A01(viewGroup, (AbstractC8429Fds) obj) : null;
                c8540Fft.A00 = c8444Fe8A01;
                if (c8444Fe8A01 == null) {
                    if (AbstractC8571FgQ.A0N(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    c8540Fft.A01 = true;
                    break;
                } else {
                    ((C10543Hqv) this.A02).element = new C8188FYf(viewGroup, c8540Fft, obj, 2);
                    if (AbstractC8571FgQ.A0N(2)) {
                        StringBuilder sbA0x = C60O.A0x("Started executing operations from ");
                        sbA0x.append(c8540Fft.A05);
                        sbA0x.append(" to ");
                        Log.v("FragmentManager", C8j3.A14(c8540Fft.A06, sbA0x));
                        break;
                    }
                }
                break;
            case 1:
                InterfaceC10512HoG interfaceC10512HoG = (InterfaceC10512HoG) this.A00;
                Collection collection = (Collection) this.A02;
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                if (collection != null) {
                    linkedHashMapA0j.put(BV3.A00(9), String.valueOf(collection.size()));
                    int i = 0;
                    for (Object obj2 : collection) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC0885AGm.A14();
                            throw F60.createAndThrow();
                        }
                        AbstractC10579HwA abstractC10579HwA = (AbstractC10579HwA) obj2;
                        String strA0I = FGI.A0I("item_", i, "_external_transaction_id");
                        String strA03 = abstractC10579HwA.A03();
                        linkedHashMapA0j.put(strA0I, strA03);
                        linkedHashMapA0j.put(FGI.A0I("item_", i, "_external_product_id"), abstractC10579HwA.A05());
                        String strA0I2 = FGI.A0I("item_", i, "_external_purchase_time");
                        long jA00 = abstractC10579HwA.A00();
                        StringBuilder sbA0w = C60O.A0w();
                        sbA0w.append(jA00);
                        linkedHashMapA0j.put(strA0I2, sbA0w.toString());
                        boolean z = abstractC10579HwA instanceof Huq;
                        linkedHashMapA0j.put(FGI.A0I("item_", i, "_external_purchase_signature"), z ? ((Huq) abstractC10579HwA).A08 : ((Hz9) abstractC10579HwA).A08);
                        linkedHashMapA0j.put(FGI.A0I("item_", i, "_developer_payload"), z ? ((Huq) abstractC10579HwA).A04 : ((Hz9) abstractC10579HwA).A04);
                        linkedHashMapA0j.put(FGI.A0I("item_", i, "_external_purchase_token"), abstractC10579HwA.A04());
                        linkedHashMapA0j.put(FGI.A0I("item_", i, "_request_id"), strA03);
                        i = i2;
                    }
                }
                AbstractC9579GPq.A01(interfaceC10512HoG, linkedHashMapA0j);
                return AGH.A02(linkedHashMapA0j, (Map) this.A01);
            case 2:
                C7925FKx c7925FKx = (C7925FKx) this.A00;
                EditText editText = (EditText) this.A03;
                c7925FKx.A05 = editText.getText();
                c7925FKx.A02 = null;
                ViewOnFocusChangeListenerC7920FKs viewOnFocusChangeListenerC7920FKs = (ViewOnFocusChangeListenerC7920FKs) this.A02;
                Object obj3 = this.A01;
                C7384Etj.A0Y(obj3, 0);
                viewOnFocusChangeListenerC7920FKs.A00.remove(obj3);
                editText.setOnFocusChangeListener(null);
                editText.removeTextChangedListener(c7925FKx.A01);
                C7923FKv c7923FKv = c7925FKx.A03;
                if (c7923FKv == null) {
                    throw BV4.A0U();
                }
                Editable text = editText.getText();
                Editable editable = c7923FKv.A0F;
                if (!C7384Etj.areEqual(text, editable)) {
                    editText.setText(editable);
                }
                float textSize = editText.getTextSize();
                float f = c7923FKv.A03;
                if (textSize != f) {
                    editText.setTextSize(f);
                }
                ColorStateList textColors = editText.getTextColors();
                ColorStateList colorStateList = c7923FKv.A0A;
                if (textColors != colorStateList) {
                    editText.setTextColor(colorStateList);
                }
                CharSequence hint = editText.getHint();
                CharSequence charSequence = c7923FKv.A0J;
                if (!C7384Etj.areEqual(hint, charSequence)) {
                    editText.setHint(charSequence);
                }
                ColorStateList hintTextColors = editText.getHintTextColors();
                ColorStateList colorStateList2 = c7923FKv.A09;
                if (hintTextColors != colorStateList2) {
                    editText.setHintTextColor(colorStateList2);
                }
                int highlightColor = editText.getHighlightColor();
                int i3 = c7923FKv.A05;
                if (highlightColor != i3) {
                    editText.setHighlightColor(i3);
                }
                int gravity = editText.getGravity();
                int i4 = c7923FKv.A04;
                if (gravity != i4) {
                    editText.setGravity(i4);
                }
                Rect rect = c7923FKv.A0B;
                editText.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                C7926FKy c7926FKy = c7923FKv.A0I;
                editText.setShadowLayer(c7926FKy.A02, c7926FKy.A00, c7926FKy.A01, c7926FKy.A03);
                editText.setLineSpacing(c7923FKv.A01, c7923FKv.A02);
                FLM.A00(c7923FKv.A0E, editText);
                Drawable background = editText.getBackground();
                Drawable drawable = c7923FKv.A0D;
                if (background != drawable) {
                    editText.setBackground(drawable);
                }
                int imeOptions = editText.getImeOptions();
                int i5 = c7923FKv.A06;
                if (imeOptions != i5) {
                    editText.setImeOptions(i5);
                }
                int inputType = editText.getInputType();
                int i6 = c7923FKv.A07;
                if (inputType != i6) {
                    editText.setInputType(i6);
                }
                editText.setSingleLine(c7923FKv.A0K);
                int maxLines = editText.getMaxLines();
                int i7 = c7923FKv.A08;
                if (maxLines != i7) {
                    editText.setMaxLines(i7);
                }
                KeyListener keyListener = editText.getKeyListener();
                KeyListener keyListener2 = c7923FKv.A0H;
                if (keyListener != keyListener2) {
                    editText.setKeyListener(keyListener2);
                }
                editText.setEnabled(true);
                Typeface typeface = editText.getTypeface();
                Typeface typeface2 = c7923FKv.A0C;
                if (!C7384Etj.areEqual(typeface, typeface2)) {
                    editText.setTypeface(typeface2);
                }
                editText.setOnEditorActionListener(null);
                TextUtils.TruncateAt ellipsize = editText.getEllipsize();
                TextUtils.TruncateAt truncateAt = c7923FKv.A0G;
                if (ellipsize != truncateAt) {
                    editText.setEllipsize(truncateAt);
                }
                editText.setLetterSpacing(c7923FKv.A00);
                boolean showSoftInputOnFocus = editText.getShowSoftInputOnFocus();
                boolean z2 = c7923FKv.A0L;
                if (showSoftInputOnFocus != z2) {
                    editText.setShowSoftInputOnFocus(z2);
                }
                FLX.A01(editText);
                AbstractC8060FRo.A07(editText, null, null);
                break;
            default:
                GS0 gs0 = (GS0) ((GSR) this.A03);
                Object obj4 = this.A00;
                Object obj5 = this.A02;
                Object obj6 = this.A01;
                C7384Etj.A0Y(obj4, 0);
                G0W g0w = gs0.A00;
                if (!(obj5 instanceof Integer)) {
                    obj5 = null;
                }
                if (!(obj6 instanceof Integer)) {
                    obj6 = null;
                }
                g0w.invoke(obj4, obj5, obj6);
                break;
        }
        return Unit.INSTANCE;
    }
}
