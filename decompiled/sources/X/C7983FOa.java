package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.aura.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FOa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7983FOa extends FrameLayout {
    public final int A00;
    public final int A01;
    public final InterfaceC10557Hsn A02;
    public final Function0<Unit> A03;
    public final float A04;
    public final int A05;
    public final Integer A06;

    public C7983FOa(Context context, InterfaceC10557Hsn interfaceC10557Hsn, Integer num, Function0 function0, float f) {
        super(context);
        this.A02 = interfaceC10557Hsn;
        this.A06 = num;
        this.A04 = 2.0f;
        this.A03 = function0;
        float f2 = 2.0f * 6.0f;
        float fMax = Math.max(f - 6.0f, 0.0f);
        this.A01 = (int) HsH.A00(context, 36.0f + f2);
        HsH.A00(context, 4.0f + f2);
        this.A00 = (int) HsH.A00(context, fMax);
        this.A05 = (int) HsH.A00(context, 6.0f);
        setupView(context);
    }

    private final void setupView(Context context) {
        int i = this.A05;
        setPadding(i, i, i, i);
        Integer num = this.A06;
        int iIntValue = num != null ? num.intValue() : FP4.A00(FP5.A05, this.A02.AOJ());
        View frameLayout = new FrameLayout(context);
        C7985FOc c7985FOc = new C7985FOc();
        Paint paint = c7985FOc.A01;
        if (iIntValue != paint.getColor()) {
            paint.setColor(iIntValue);
            c7985FOc.invalidateSelf();
        }
        Arrays.fill(c7985FOc.A04, (int) HsH.A00(context, this.A04));
        c7985FOc.A00 = true;
        c7985FOc.invalidateSelf();
        frameLayout.setBackground(c7985FOc);
        addView(frameLayout);
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setContentDescription(context.getString(R.string._name_removed__res_0x7f120000));
        setImportantForAccessibility(1);
        AbstractC8060FRo.A06(this, new HmE());
        setOnClickListener(new I0Y(2, context, this));
        setOnKeyListener(new FPE(this));
    }
}
