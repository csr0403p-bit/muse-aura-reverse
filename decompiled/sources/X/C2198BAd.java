package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.BAd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2198BAd extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final C2197BAc A02;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.A01);
        C2197BAc c2197BAc = this.A02;
        c2197BAc.A02.performAction(this.A00, bundle);
    }

    public C2198BAd(C2197BAc c2197BAc, int i, int i2) {
        this.A01 = i;
        this.A02 = c2197BAc;
        this.A00 = i2;
    }
}
