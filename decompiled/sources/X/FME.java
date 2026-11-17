package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import java.util.Calendar;

/* loaded from: classes6.dex */
public final class FME implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FM2 A01;
    public final /* synthetic */ FBB A02;
    public final /* synthetic */ F6D A03;
    public final /* synthetic */ HsM A04;
    public final /* synthetic */ HsM A05;
    public final /* synthetic */ Calendar A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    public FME(Context context, FM2 fm2, FBB fbb, F6D f6d, HsM hsM, HsM hsM2, Calendar calendar, boolean z, boolean z2) {
        this.A06 = calendar;
        this.A08 = z;
        this.A00 = context;
        this.A02 = fbb;
        this.A05 = hsM;
        this.A04 = hsM2;
        this.A01 = fm2;
        this.A03 = f6d;
        this.A07 = z2;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        Calendar calendar = this.A06;
        calendar.set(i, i2, i3);
        if (!this.A08) {
            HsM hsM = this.A05;
            AbstractC7691FAk.A02(this.A03, C9115Fyg.A00(), hsM, String.valueOf(calendar.getTimeInMillis() / 1000), 0);
            return;
        }
        FMF.A03(this.A00, this.A02, this.A03, this.A05, this.A04, calendar, this.A07);
    }
}
