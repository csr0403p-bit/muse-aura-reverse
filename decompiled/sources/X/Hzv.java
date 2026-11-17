package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Hzv extends C8053FRg {
    public static final Map<String, Integer> A06;
    public static final Map<String, Integer> A07;
    public static final Map<String, Integer> A08;
    public static final Map<String, String> A09;
    public int A00;
    public I01 A01;
    public final FBB A02;
    public final FDW A03;
    public final FDW A04;
    public final Map<Integer, I00> A05;

    private void A01(View view, int i) {
        I01 i01 = this.A01;
        if (i01 != null) {
            C7384Etj.A0Y(view, 0);
            if (i01.A04) {
                return;
            }
            if (i != 32768) {
                if (i == 65536) {
                    i01.A00 = true;
                    if (i01.A05) {
                        return;
                    }
                    i01.A05 = true;
                    view.post(i01.A08);
                    return;
                }
                return;
            }
            i01.A01 = true;
            if (!i01.A05) {
                i01.A05 = true;
                view.post(i01.A08);
            }
            if (i01.A02) {
                return;
            }
            i01.A02 = true;
            i01.A03 = false;
            i01.A07.A00(true);
        }
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        Number numberA0b;
        Number numberA0b2;
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        FDW fdw = this.A03;
        boolean zA0L = fdw.A0L(41, false);
        boolean zA0L2 = fdw.A0L(49, false);
        boolean zA0L3 = fdw.A0L(51, false);
        boolean zA0L4 = fdw.A0L(36, false);
        String strA0F = fdw.A0F(50);
        String strA0u = AbstractC7608F5v.A0u(fdw);
        String strA0v = AbstractC7608F5v.A0v(fdw);
        String strA0F2 = fdw.A0F(58);
        String strA0F3 = fdw.A0F(57);
        String strA0F4 = fdw.A0F(67);
        String strA0F5 = fdw.A0F(66);
        String strA0F6 = fdw.A0F(71);
        FDW fdwA0C = fdw.A0C(52);
        FDW fdwA0C2 = fdw.A0C(53);
        FDW fdwA0C3 = fdw.A0C(54);
        if (fdwA0C != null) {
            String strA0F7 = fdwA0C.A0F(40);
            float fA06 = fdwA0C.A06(38, -1.0f);
            float fA062 = fdwA0C.A06(36, -1.0f);
            float fA063 = fdwA0C.A06(35, -1.0f);
            if (fA06 >= 0.0f && fA063 >= 0.0f && fA062 >= 0.0f && (numberA0b2 = BV4.A0b(strA0F7, A08)) != null) {
                c2197BAc.A02.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(numberA0b2.intValue(), fA06, fA062, fA063));
            }
        }
        if (fdwA0C2 != null) {
            int iA07 = fdwA0C2.A07(35, -1);
            int iA072 = fdwA0C2.A07(38, -1);
            boolean zA0L5 = fdwA0C2.A0L(36, false);
            String strA0F8 = fdwA0C2.A0F(40);
            String str = strA0F8 != null ? strA0F8 : "none";
            if (iA07 >= -1 && iA072 >= -1 && (numberA0b = BV4.A0b(str, A07)) != null) {
                c2197BAc.A02.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(iA072, iA07, zA0L5, numberA0b.intValue()));
            }
        }
        if (fdwA0C3 != null) {
            int iA073 = fdwA0C3.A07(35, -1);
            int iA074 = fdwA0C3.A07(38, -1);
            int iA075 = fdwA0C3.A07(36, -1);
            int iA076 = fdwA0C3.A07(40, -1);
            if (iA073 >= 0 && iA074 >= 0 && iA075 >= 0 && iA076 >= 0) {
                c2197BAc.A02.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iA074, iA076, iA073, iA075, zA0L, zA0L2));
            }
        }
        Iterator itA10 = BV5.A10(this.A05);
        while (itA10.hasNext()) {
            I00 i00 = (I00) itA10.next();
            int i = i00.A00;
            Map<String, Integer> map = A06;
            if (map.containsKey("click") && i == BV7.A0H("click", map)) {
                c2197BAc.A02.setClickable(true);
            } else if (map.containsKey("long_click") && i == BV7.A0H("long_click", map)) {
                c2197BAc.A02.setLongClickable(true);
            }
            String str2 = i00.A02;
            if (str2 != null) {
                c2197BAc.A05(new C2203BAi(i, str2));
            } else {
                c2197BAc.A02.addAction(i);
            }
        }
        if (zA0L3) {
            AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(zA0L4);
        }
        if (strA0F != null) {
            c2197BAc.A02.setTooltipText(strA0F);
        }
        if (strA0u != null && !strA0u.equals("none")) {
            Map<String, String> map2 = A09;
            if (map2.containsKey(strA0u)) {
                c2197BAc.A02.setClassName(map2.get(strA0u));
            }
        }
        if (strA0v != null) {
            c2197BAc.A02.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", strA0v);
        }
        if (strA0F2 != null) {
            c2197BAc.A08(strA0F2);
        }
        if (strA0F3 != null && !strA0F3.isEmpty()) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
            accessibilityNodeInfo2.setContentInvalid(true);
            accessibilityNodeInfo2.setError(strA0F3);
        }
        if (strA0F4 != null) {
            c2197BAc.A02.setPaneTitle(strA0F4);
        }
        if (strA0F5 != null) {
            c2197BAc.A07(strA0F5);
        }
        if (strA0F6 != null) {
            c2197BAc.A02.setViewIdResourceName(strA0F6);
        }
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        HsM hsM;
        I00 i00 = (I00) BV5.A0f(this.A05, i);
        if (i00 == null || (hsM = i00.A01) == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        FDW fdw = this.A04;
        Object objA03 = F6D.A03(this.A02, fdw, C9115Fyg.A03(C9115Fyg.A00(), fdw, 0), hsM);
        if ((objA03 instanceof Number) || (objA03 instanceof Boolean)) {
            return HoH.A01(objA03);
        }
        FFI.A02(objA03 != null ? "Got a non-boolean result while evaluating action " : "Got a null result while evaluating action ", i);
        return false;
    }

    static {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(BrowserOperationCatalogKt.BUTTON, "android.widget.Button");
        mapA0u.put("checkbox", "android.widget.CompoundButton");
        mapA0u.put("checked_text_view", "android.widget.CheckedTextView");
        mapA0u.put("drop_down_list", "android.widget.Spinner");
        mapA0u.put("edit_text", "android.widget.EditText");
        mapA0u.put("grid", "android.widget.GridView");
        mapA0u.put("image", "android.widget.ImageView");
        mapA0u.put("list", "android.widget.AbsListView");
        mapA0u.put("pager", "androidx.viewpager.widget.ViewPager");
        mapA0u.put("radio_button", "android.widget.RadioButton");
        mapA0u.put("seek_control", "android.widget.SeekBar");
        mapA0u.put("switch", "android.widget.Switch");
        mapA0u.put("tab_bar", "android.widget.TabWidget");
        mapA0u.put("toggle_button", "android.widget.ToggleButton");
        mapA0u.put("view_group", "android.view.ViewGroup");
        mapA0u.put("web_view", "android.webkit.WebView");
        mapA0u.put("progress_bar", "android.widget.ProgressBar");
        mapA0u.put("action_bar_tab", "android.app.ActionBar$Tab");
        mapA0u.put("drawer_layout", "androidx.drawerlayout.widget.DrawerLayout");
        mapA0u.put("sliding_drawer", "android.widget.SlidingDrawer");
        mapA0u.put("icon_menu", "com.android.internal.view.menu.IconMenuView");
        mapA0u.put("toast", "android.widget.Toast$TN");
        mapA0u.put("alert_dialog", "android.app.AlertDialog");
        mapA0u.put("date_picker_dialog", "android.app.DatePickerDialog");
        mapA0u.put("time_picker_dialog", "android.app.TimePickerDialog");
        mapA0u.put("date_picker", "android.widget.DatePicker");
        mapA0u.put("time_picker", "android.widget.TimePicker");
        mapA0u.put("number_picker", "android.widget.NumberPicker");
        mapA0u.put("scroll_view", "android.widget.ScrollView");
        mapA0u.put("horizontal_scroll_view", "android.widget.HorizontalScrollView");
        mapA0u.put("keyboard_key", "android.inputmethodservice.Keyboard$Key");
        mapA0u.put("none", "");
        A09 = Collections.unmodifiableMap(mapA0u);
        HashMap mapA0u2 = BV4.A0u();
        mapA0u2.put("click", A00(C2203BAi.A08));
        mapA0u2.put("long_click", A00(C2203BAi.A0L));
        mapA0u2.put("scroll_forward", A00(C2203BAi.A0Z));
        mapA0u2.put("scroll_backward", A00(C2203BAi.A0X));
        mapA0u2.put("expand", A00(C2203BAi.A0H));
        mapA0u2.put("collapse", A00(C2203BAi.A09));
        mapA0u2.put(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS, A00(C2203BAi.A0D));
        mapA0u2.put("scroll_up", A00(C2203BAi.A0e));
        mapA0u2.put("scroll_left", A00(C2203BAi.A0b));
        mapA0u2.put("scroll_down", A00(C2203BAi.A0Y));
        mapA0u2.put("scroll_right", A00(C2203BAi.A0c));
        mapA0u2.put(ConnectorCatalogKt.CUSTOM_CATEGORY_ID, -1);
        A06 = Collections.unmodifiableMap(mapA0u2);
        HashMap mapA0u3 = BV4.A0u();
        Integer numA0X = BV4.A0X();
        mapA0u3.put("percent", numA0X);
        Integer numA0W = BV4.A0W();
        mapA0u3.put("float", numA0W);
        Integer numA0V = BV4.A0V();
        mapA0u3.put("int", numA0V);
        A08 = Collections.unmodifiableMap(mapA0u3);
        HashMap mapA0u4 = BV4.A0u();
        mapA0u4.put("none", numA0V);
        mapA0u4.put("single", numA0W);
        mapA0u4.put("multiple", numA0X);
        A07 = Collections.unmodifiableMap(mapA0u4);
    }

    public Hzv(FBB fbb, FDW fdw, FDW fdw2) {
        this.A00 = 1056964608;
        this.A03 = fdw;
        this.A04 = fdw2;
        this.A02 = fbb;
        HashMap mapA0u = BV4.A0u();
        List<FDW> listA0I = fdw.A0I(55);
        if (listA0I != null && !listA0I.isEmpty()) {
            Iterator<FDW> it = listA0I.iterator();
            while (it.hasNext()) {
                FDW fdwA0y = AbstractC7607F5u.A0y(it);
                String strA0o = AbstractC7608F5v.A0o(fdwA0y);
                String strA0p = AbstractC7608F5v.A0p(fdwA0y);
                HsM hsMA0D = fdwA0y.A0D(38);
                if (strA0o != null) {
                    Map<String, Integer> map = A06;
                    if (map.containsKey(strA0o)) {
                        int iA0H = BV7.A0H(strA0o, map);
                        if (map.containsKey(ConnectorCatalogKt.CUSTOM_CATEGORY_ID) && iA0H == BV7.A0H(ConnectorCatalogKt.CUSTOM_CATEGORY_ID, map)) {
                            iA0H = this.A00;
                            this.A00 = iA0H + 1;
                        }
                        Integer numValueOf = Integer.valueOf(iA0H);
                        I00 i00 = new I00();
                        i00.A02 = strA0p;
                        i00.A00 = iA0H;
                        i00.A01 = hsMA0D;
                        mapA0u.put(numValueOf, i00);
                    }
                }
            }
        }
        this.A05 = mapA0u;
    }

    public static Integer A00(C2203BAi c2203BAi) {
        C1H.A00(c2203BAi);
        return Integer.valueOf(((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getId());
    }

    @Override // X.C8053FRg
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        boolean zOnRequestSendAccessibilityEvent = super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        A01(viewGroup, eventType);
        return zOnRequestSendAccessibilityEvent;
    }

    @Override // X.C8053FRg
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        A01(view, eventType);
    }
}
