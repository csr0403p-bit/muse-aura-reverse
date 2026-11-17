package X;

import android.graphics.Canvas;
import com.facebook.rendercore.text.RCTextView;

/* loaded from: classes6.dex */
public final class Hle implements Hrs {
    public final /* synthetic */ Hrs A00;
    public final /* synthetic */ InterfaceC10565Htv A01;
    public final /* synthetic */ RCTextView A02;

    public Hle(Hrs hrs, InterfaceC10565Htv interfaceC10565Htv, RCTextView rCTextView) {
        this.A01 = interfaceC10565Htv;
        this.A00 = hrs;
        this.A02 = rCTextView;
    }

    @Override // X.Hrs
    public final void A9D(Canvas canvas) {
        this.A01.A9I(canvas, this.A00);
    }
}
