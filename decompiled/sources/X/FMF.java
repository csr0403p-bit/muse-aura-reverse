package X;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.facebook.aura.R;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public abstract class FMF {
    public static final long A00(long j, String str) {
        Calendar calendar = str != null ? Calendar.getInstance(TimeZone.getTimeZone(str)) : Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(i, i2, i3);
        return calendar2.getTimeInMillis();
    }

    public static final void A01(Context context, DatePicker datePicker, CharSequence charSequence, String str) {
        int identifier;
        if (charSequence == null || (identifier = context.getResources().getIdentifier(str, "id", "android")) == 0) {
            return;
        }
        View viewFindViewById = datePicker.findViewById(identifier);
        if (viewFindViewById instanceof NumberPicker) {
            View childAt = ((ViewGroup) viewFindViewById).getChildAt(0);
            if (childAt instanceof EditText) {
                childAt.setTooltipText(charSequence);
            }
        }
    }

    public static final void A03(Context context, FBB fbb, F6D f6d, HsM hsM, HsM hsM2, Calendar calendar, boolean z) {
        int i = R.style._name_removed__res_0x7f130081;
        if (z) {
            i = R.style._name_removed__res_0x7f130080;
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(context, i, new HkJ(f6d, hsM, calendar), calendar.get(11), calendar.get(12), DateFormat.is24HourFormat(context));
        timePickerDialog.setTitle(context.getString(R.string._name_removed__res_0x7f12110a));
        timePickerDialog.setButton(-1, context.getString(R.string._name_removed__res_0x7f1208cb), timePickerDialog);
        if (hsM2 != null) {
            timePickerDialog.setOnCancelListener(new FXX(fbb, f6d, hsM2, 1));
        }
        timePickerDialog.show();
    }

    public static final void A02(Context context, FM2 fm2, FBB fbb, F6D f6d, HsM hsM, HsM hsM2, Long l, Long l2, String str, String str2, Calendar calendar, boolean z, boolean z2) {
        int i;
        boolean z3;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        TextView textView;
        if ("calendar".equals(str)) {
            i = R.style._name_removed__res_0x7f13007a;
            if (z2) {
                i = R.style._name_removed__res_0x7f130079;
            }
            z3 = false;
        } else if ("wheels".equals(str)) {
            i = R.style._name_removed__res_0x7f13007e;
            if (z2) {
                i = R.style._name_removed__res_0x7f13007d;
            }
            z3 = true;
        } else {
            FFI.A03("Unexpected date picker style: ", str);
            return;
        }
        if (str2 != null) {
            TimeZone.getTimeZone(str2).getDisplayName(Locale.US);
        }
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, i, new FME(context, fm2, fbb, f6d, hsM, hsM2, calendar, z, z2), calendar.get(1), calendar.get(2), calendar.get(5));
        if (l != null) {
            datePickerDialog.getDatePicker().setMinDate(A00(l.longValue(), str2));
        }
        if (l2 != null) {
            datePickerDialog.getDatePicker().setMaxDate(A00(l2.longValue(), str2));
        }
        if (z3) {
            datePickerDialog.setTitle(context.getString(R.string._name_removed__res_0x7f1208ca));
        }
        datePickerDialog.setButton(-1, context.getString(R.string._name_removed__res_0x7f1208cb), datePickerDialog);
        if (hsM2 != null) {
            datePickerDialog.setOnCancelListener(new FXX(fbb, f6d, hsM2, 0));
        }
        DatePicker datePicker = datePickerDialog.getDatePicker();
        C7384Etj.A0U(datePicker);
        try {
            A01(context, datePicker, context.getString(R.string._name_removed__res_0x7f120023), "day");
            A01(context, datePicker, context.getString(R.string._name_removed__res_0x7f120024), "month");
            A01(context, datePicker, context.getString(R.string._name_removed__res_0x7f120025), "year");
        } catch (Exception e) {
            FFI.A03("Failed to set DatePicker field accessibility: ", e.getMessage());
        }
        DatePicker datePicker2 = datePickerDialog.getDatePicker();
        C7384Etj.A0U(datePicker2);
        try {
            Resources resources = datePicker2.getResources();
            int identifier = resources.getIdentifier("date_picker_header_year", "id", "android");
            if (identifier != 0) {
                View viewFindViewById = datePicker2.findViewById(identifier);
                if ((viewFindViewById instanceof TextView) && (textView = (TextView) viewFindViewById) != null) {
                    textView.setSelected(true);
                    C8631Fhi c8631FhiA00 = C8631Fhi.A00(4);
                    C8053FRg c8053FRgA00 = AbstractC8060FRo.A00(textView);
                    if (!(c8053FRgA00 instanceof FRc)) {
                        AbstractC8060FRo.A06(textView, new FRc(c8053FRgA00, c8631FhiA00));
                    }
                }
            }
            int identifier2 = resources.getIdentifier("date_picker_year_picker", "id", "android");
            if (identifier2 != 0) {
                View viewFindViewById2 = datePicker2.findViewById(identifier2);
                if ((viewFindViewById2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewFindViewById2) != null) {
                    viewGroup2.setOnHierarchyChangeListener(new FMG());
                }
            }
        } catch (Exception e2) {
            FFI.A03("Failed to set DatePicker year selected state: ", e2.getMessage());
        }
        DatePicker datePicker3 = datePickerDialog.getDatePicker();
        C7384Etj.A0U(datePicker3);
        String string = context.getString(R.string._name_removed__res_0x7f1208ca);
        try {
            int identifier3 = datePicker3.getResources().getIdentifier("day_picker_view_pager", "id", "android");
            if (identifier3 != 0) {
                View viewFindViewById3 = datePicker3.findViewById(identifier3);
                if ((viewFindViewById3 instanceof ViewGroup) && (viewGroup = (ViewGroup) viewFindViewById3) != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        C7384Etj.A0U(childAt);
                        C8053FRg c8053FRgA002 = AbstractC8060FRo.A00(childAt);
                        if (c8053FRgA002 != null && !(c8053FRgA002 instanceof C8049FRb)) {
                            AbstractC8060FRo.A06(childAt, new C8049FRb(c8053FRgA002, string));
                        }
                    }
                    viewGroup.setOnHierarchyChangeListener(new FMH(string));
                }
            }
        } catch (Exception e3) {
            FFI.A03("Failed to set DatePicker day cell accessibility: ", e3.getMessage());
        }
        datePickerDialog.show();
    }
}
