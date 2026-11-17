package X;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class HiO extends AccessibilityNodeProvider {
    public final AccessibilityNodeProvider A00;
    public final SimpleDateFormat A01;
    public final Calendar A02;
    public final CharSequence A03;
    public final DateFormat A04;
    public final Locale A05;

    public HiO(AccessibilityNodeProvider accessibilityNodeProvider, CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 1);
        this.A00 = accessibilityNodeProvider;
        this.A03 = charSequence;
        Locale locale = Locale.getDefault();
        this.A05 = locale;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy", locale);
        simpleDateFormat.setLenient(false);
        this.A01 = simpleDateFormat;
        this.A04 = DateFormat.getDateInstance(0, locale);
        this.A02 = Calendar.getInstance();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
        C7384Etj.A0Y(str, 0);
        return this.A00.findAccessibilityNodeInfosByText(str, i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        CharSequence contentDescription;
        String string;
        ParsePosition parsePosition;
        Date date;
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = this.A00.createAccessibilityNodeInfo(i);
        if (accessibilityNodeInfoCreateAccessibilityNodeInfo == null) {
            return null;
        }
        if (i == -1 || (contentDescription = accessibilityNodeInfoCreateAccessibilityNodeInfo.getContentDescription()) == null || contentDescription.length() == 0 || (date = this.A01.parse((string = contentDescription.toString()), (parsePosition = new ParsePosition(0)))) == null || parsePosition.getIndex() != string.length()) {
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }
        Calendar calendar = this.A02;
        calendar.setTime(date);
        if (calendar.get(5) != i) {
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }
        accessibilityNodeInfoCreateAccessibilityNodeInfo.setContentDescription(this.A04.format(date));
        if (!accessibilityNodeInfoCreateAccessibilityNodeInfo.isEnabled()) {
            return accessibilityNodeInfoCreateAccessibilityNodeInfo;
        }
        accessibilityNodeInfoCreateAccessibilityNodeInfo.setHintText(this.A03);
        return accessibilityNodeInfoCreateAccessibilityNodeInfo;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        return this.A00.findFocus(i);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.A00.performAction(i, i2, bundle);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        AnonymousClass003.A0x(accessibilityNodeInfo, str);
        this.A00.addExtraDataToAccessibilityNodeInfo(i, accessibilityNodeInfo, str, bundle);
    }
}
