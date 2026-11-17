package X;

import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.FSw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8090FSw implements Runnable {
    public static final String __redex_internal_original_name = "MaterialCalendar$10";
    public final /* synthetic */ int A00;
    public final /* synthetic */ MaterialCalendar A01;

    public RunnableC8090FSw(MaterialCalendar materialCalendar, int i) {
        this.A01 = materialCalendar;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A02.A0p(this.A00);
    }
}
