package X;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.util.Calendar;

/* loaded from: classes6.dex */
public final class HkJ implements TimePickerDialog.OnTimeSetListener {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;
    public final /* synthetic */ Calendar A02;

    public HkJ(F6D f6d, HsM hsM, Calendar calendar) {
        this.A02 = calendar;
        this.A01 = hsM;
        this.A00 = f6d;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        Calendar calendar = this.A02;
        calendar.set(11, i);
        calendar.set(12, i2);
        HsM hsM = this.A01;
        AbstractC7691FAk.A02(this.A00, C9115Fyg.A00(), hsM, String.valueOf(calendar.getTimeInMillis() / 1000), 0);
    }
}
