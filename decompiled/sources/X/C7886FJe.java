package X;

import android.text.TextPaint;
import android.view.View;
import kotlin.Unit;

/* renamed from: X.FJe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7886FJe extends AbstractC7887FJf implements InterfaceC7885FJd {
    public Integer A00;
    public G0U<? super View, Unit> A01;
    public final FDW A02;
    public final FDW A03;
    public final HsM A04;
    public final boolean A05;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C7384Etj.A0Y(view, 0);
        G0U<? super View, Unit> g0u = this.A01;
        if (g0u != null) {
            g0u.invoke(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Integer num;
        int iIntValue;
        C7384Etj.A0Y(textPaint, 0);
        if (!super.A02 || (num = this.A00) == null || (iIntValue = num.intValue()) == 0) {
            return;
        }
        textPaint.setColor(iIntValue);
    }

    public C7886FJe(FDW fdw, FDW fdw2, HsM hsM, String str, String str2, boolean z) {
        super.A02 = false;
        super.A00 = str;
        super.A01 = str2;
        this.A04 = hsM;
        this.A03 = fdw;
        this.A02 = fdw2;
        this.A05 = z;
    }
}
