package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: classes6.dex */
public final class FSP extends LinearLayoutManager {
    public final /* synthetic */ int A00;
    public final /* synthetic */ MaterialCalendar A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FSP(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.A01 = materialCalendar;
        this.A00 = i2;
    }
}
