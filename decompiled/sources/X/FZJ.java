package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.rtc.logging.connectfunnel.logger.gen.ConnectFunnel;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FZJ extends AbstractC7559F3s implements G0V {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FZJ(Object obj, int i) {
        super(2);
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, X.Hph] */
    /* JADX WARN: Type inference failed for: r0v91, types: [T, android.text.InputFilter$LengthFilter] */
    /* JADX WARN: Type inference failed for: r10v10, types: [State, X.FK1] */
    /* JADX WARN: Type inference failed for: r10v2, types: [State, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r10v5, types: [State, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r10v6, types: [State, X.GRH, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [State, X.GRH] */
    /* JADX WARN: Type inference failed for: r10v9, types: [State, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, X.I0T, java.lang.Object] */
    @Override // X.G0V
    public final /* bridge */ /* synthetic */ State invoke(State state, Object obj) {
        Object obj2;
        Object c9587GQk;
        Object next;
        boolean zBooleanValue;
        Boolean bool;
        int i;
        int i2;
        Function0 function0A00;
        FL4 fl4;
        C7925FKx c7925FKx;
        int iIntValue;
        boolean z;
        Object obj3;
        switch (this.$t) {
            case 0:
                EditText editText = (EditText) obj;
                boolean zA1b = AnonymousClass004.A1b(state, editText);
                C10543Hqv c10543HqvA0z = C3cG.A0z();
                Integer num = ((C7912FKk) this.A00).A0G;
                if (num != null && (iIntValue = num.intValue()) > -1) {
                    c10543HqvA0z.element = new InputFilter.LengthFilter(iIntValue);
                    InputFilter[] filters = editText.getFilters();
                    C7384Etj.A0U(filters);
                    Object obj4 = c10543HqvA0z.element;
                    int length = filters.length;
                    Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
                    objArrCopyOf[length] = obj4;
                    editText.setFilters((InputFilter[]) objArrCopyOf);
                }
                InputFilter inputFilter = (InputFilter) c10543HqvA0z.element;
                if (inputFilter != null) {
                    CharSequence charSequenceFilter = inputFilter.filter(editText.getText(), zA1b ? 1 : 0, AbstractC7609F5w.A0D(editText), new SpannedString(""), zA1b ? 1 : 0, zA1b ? 1 : 0);
                    if (charSequenceFilter != null && !charSequenceFilter.equals(editText.getText())) {
                        editText.setText(charSequenceFilter);
                    }
                }
                i2 = 18;
                c7925FKx = c10543HqvA0z;
                fl4 = editText;
                function0A00 = new C8197FYo(i2, fl4, c7925FKx);
                return new FK1(function0A00);
            case 1:
                View view = (View) obj;
                AnonymousClass003.A0u(state, view);
                View.OnFocusChangeListener onFocusChangeListener = view.getOnFocusChangeListener();
                ViewOnFocusChangeListenerC7920FKs viewOnFocusChangeListenerC7920FKs = onFocusChangeListener instanceof ViewOnFocusChangeListenerC7920FKs ? (ViewOnFocusChangeListenerC7920FKs) onFocusChangeListener : 0;
                C10543Hqv c10543HqvA0z2 = C3cG.A0z();
                if (viewOnFocusChangeListenerC7920FKs != 0) {
                    C7912FKk c7912FKk = (C7912FKk) this.A00;
                    if (c7912FKk.A0K != null || c7912FKk.A0L != null) {
                        ?? i0t = new I0T(c7912FKk, 2);
                        c10543HqvA0z2.element = i0t;
                        viewOnFocusChangeListenerC7920FKs.A00.add(i0t);
                    }
                }
                i2 = 19;
                c7925FKx = c10543HqvA0z2;
                fl4 = viewOnFocusChangeListenerC7920FKs;
                function0A00 = new C8197FYo(i2, fl4, c7925FKx);
                return new FK1(function0A00);
            case 2:
                TextView textView = (TextView) obj;
                AnonymousClass003.A0u(state, textView);
                C7912FKk c7912FKk2 = (C7912FKk) this.A00;
                textView.setOnEditorActionListener(c7912FKk2.A02 != null ? new C7921FKt(c7912FKk2) : C10461Hjn.A00);
                i = 17;
                function0A00 = C8472Feb.A00(i);
                return new FK1(function0A00);
            case 3:
                TextView textView2 = (TextView) obj;
                AnonymousClass003.A0u(state, textView2);
                C10543Hqv c10543HqvA0z3 = C3cG.A0z();
                G0V<String, String, Boolean> g0v = ((C7912FKk) this.A00).A0N;
                if (g0v != null) {
                    c10543HqvA0z3.element = new Hph(g0v);
                    InputFilter[] filters2 = textView2.getFilters();
                    C7384Etj.A0U(filters2);
                    Object obj5 = c10543HqvA0z3.element;
                    int length2 = filters2.length;
                    Object[] objArrCopyOf2 = Arrays.copyOf(filters2, length2 + 1);
                    objArrCopyOf2[length2] = obj5;
                    textView2.setFilters((InputFilter[]) objArrCopyOf2);
                }
                i2 = 20;
                c7925FKx = c10543HqvA0z3;
                fl4 = textView2;
                function0A00 = new C8197FYo(i2, fl4, c7925FKx);
                return new FK1(function0A00);
            case 4:
                AnonymousClass003.A0u(state, obj);
                function0A00 = FZO.A02(obj, 26);
                return new FK1(function0A00);
            case 5:
                TextView textView3 = (TextView) obj;
                AnonymousClass003.A0u(state, textView3);
                C7925FKx c7925FKx2 = (C7925FKx) this.A00;
                CharSequence charSequence = c7925FKx2.A04;
                if (charSequence != null) {
                    textView3.setText(charSequence);
                    c7925FKx2.A04 = null;
                }
                i = 21;
                function0A00 = C8472Feb.A00(i);
                return new FK1(function0A00);
            case 6:
                FL4 fl42 = (FL4) obj;
                AnonymousClass003.A0u(state, fl42);
                C7925FKx c7925FKx3 = (C7925FKx) this.A00;
                c7925FKx3.A00 = fl42.getKeyListener();
                HxE<Integer, Integer> hxE = c7925FKx3.A06;
                Editable text = fl42.getText();
                if (hxE != null) {
                    if (text != null) {
                        int iMin = Math.min(AnonymousClass001.A0F(hxE.second), text.length());
                        fl42.setSelection(Math.min(AnonymousClass001.A0F(hxE.first), iMin), iMin);
                    }
                } else if (text != null) {
                    fl42.setSelection(text.length());
                }
                if (!fl42.isFocused() && AbstractC7924FKw.A03(fl42) && AbstractC7924FKw.A02(fl42)) {
                    AbstractC7924FKw.A00(TextUtils.TruncateAt.END, c7925FKx3, fl42);
                }
                i2 = 23;
                c7925FKx = c7925FKx3;
                fl4 = fl42;
                function0A00 = new C8197FYo(i2, fl4, c7925FKx);
                return new FK1(function0A00);
            case 7:
                TextView textView4 = (TextView) obj;
                AnonymousClass003.A0u(state, textView4);
                C7926FKy c7926FKy = ((C7912FKk) this.A00).A06;
                if (c7926FKy != null) {
                    textView4.setShadowLayer(c7926FKy.A02, c7926FKy.A00, c7926FKy.A01, c7926FKy.A03);
                }
                i = 26;
                function0A00 = C8472Feb.A00(i);
                return new FK1(function0A00);
            case 8:
                Boolean bool2 = (Boolean) obj;
                GQK gqk = (GQK) this.A00;
                obj2 = gqk.A06;
                c9587GQk = Boolean.valueOf(bool2 != null ? bool2.booleanValue() : gqk.A09);
                AnonymousClass002.A1I(obj2, c9587GQk);
                return Unit.INSTANCE;
            case 9:
                Boolean bool3 = (Boolean) obj;
                GQK gqk2 = (GQK) this.A00;
                if (!gqk2.A03 || (bool = gqk2.A01) == null || bool.equals(bool3)) {
                    if (bool3 != null && gqk2.A03) {
                        gqk2.A03 = false;
                    }
                    HoC hoC = gqk2.A02;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    gqk2.A02 = null;
                    BLG<Boolean> blg = gqk2.A05;
                    if (bool3 != null) {
                        zBooleanValue = bool3.booleanValue();
                    } else {
                        Boolean bool4 = gqk2.A01;
                        zBooleanValue = bool4 != null ? bool4.booleanValue() : true;
                    }
                    C9286GCn.A00(null, Boolean.valueOf(zBooleanValue), (C9286GCn) blg);
                    gqk2.A00 = bool3;
                    String strA0a = AnonymousClass007.A0a("rsys bot audio state update: ", bool3);
                    C7384Etj.A0Y(strA0a, 1);
                    AbstractC7608F5v.A1L(strA0a);
                }
                return Unit.INSTANCE;
            case 10:
                AbstractCollection abstractCollection = (AbstractCollection) obj;
                if (abstractCollection != null) {
                    Iterator it = abstractCollection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            String str = ((CallParticipant) next).userId;
                            if (str == null || HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    CallParticipant callParticipant = (CallParticipant) next;
                    if (callParticipant != null) {
                        String str2 = callParticipant.userId;
                        UserProfile userProfile = callParticipant.userProfile;
                        String str3 = userProfile != null ? userProfile.name : null;
                        if (str2 != null) {
                            obj2 = ((GQM) this.A00).A00;
                            c9587GQk = new C9587GQk(str2, str3);
                            AnonymousClass002.A1I(obj2, c9587GQk);
                        }
                    }
                }
                return Unit.INSTANCE;
            case 11:
                String str4 = (String) state;
                String str5 = (String) obj;
                if (str4 != null) {
                    obj2 = ((GQM) this.A00).A01;
                    c9587GQk = new C9587GQk(str4, str5);
                    AnonymousClass002.A1I(obj2, c9587GQk);
                }
                return Unit.INSTANCE;
            case 12:
                if (AnonymousClass002.A1b(obj, true)) {
                    ConnectFunnel.CProxy.markPoint(((GQS) this.A00).A05, 24, null);
                }
                return Unit.INSTANCE;
            case 13:
                ((MetaAiRsysSdkRealTimeSession) this.A00).A0a.Af8(obj);
                return Unit.INSTANCE;
            case 14:
                C7384Etj.A0Y(state, 0);
                ((AtomicReference) this.A00).set(state);
                return state;
            case 15:
                ?? r10 = (GRH) state;
                int iA1b = AnonymousClass004.A1b(r10, obj);
                int i3 = new int[]{iA1b}[iA1b];
                if (i3 != 0) {
                    throw AnonymousClass005.A0c(i3);
                }
                Object objA00 = r10.A00(GRE.class);
                if (objA00 == null) {
                    obj3 = null;
                } else {
                    if (!(objA00 instanceof GRE)) {
                        throw C3cG.A0Q("Incorrect class passed to reducer.  Relying on RpStore to maintain class<>instance map - check this c ode");
                    }
                    obj3 = objA00;
                }
                if (obj instanceof GRG) {
                    obj3 = GRI.A00;
                } else if (obj instanceof GRE) {
                    obj3 = obj;
                }
                if (C7384Etj.areEqual(objA00, obj3)) {
                    return r10;
                }
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put(GRE.class, obj3);
                return new GRH(r10.A00, AGH.A02(r10.A01, arrayMap));
            case 16:
                G7T g7t = (G7T) state;
                G7Y g7y = (G7Y) obj;
                AnonymousClass003.A0u(g7t, g7y);
                G7J g7j = (G7J) ((G7E) this.A00);
                Iterator<InterfaceC9228G7j<C9242G7x>> it2 = (g7j instanceof G7L ? ((G7L) g7j).A00 : g7j.A01).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                    } else if (it2.next().ANs(g7t, g7y)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 17:
                G76 g76 = (G76) state;
                G76 g762 = (G76) obj;
                if (g762 != null) {
                    return Integer.valueOf(g76.compareTo(g762));
                }
                C7384Etj.A0a("LOAD_PARAM");
                throw F60.createAndThrow();
            default:
                C7384Etj.A0Y(obj, 1);
                G0V[] g0vArr = (G0V[]) this.A00;
                int length3 = g0vArr.length;
                int i4 = 0;
                State state2 = state;
                while (i4 < length3) {
                    Object objInvoke = g0vArr[i4].invoke(state2, obj);
                    i4++;
                    state2 = objInvoke;
                }
                return state2;
        }
    }
}
