package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.facebook.aura.R;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.FWz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8157FWz {
    public final Paint A00;
    public final C8156FWy A01;
    public final C8156FWy A02;
    public final C8156FWy A03;
    public final C8156FWy A04;
    public final C8156FWy A05;
    public final C8156FWy A06;
    public final C8156FWy A07;

    public C8157FWz(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(FWM.A00(context, MaterialCalendar.class.getCanonicalName(), R.attr._name_removed__res_0x7f0403c4), FX0.A09);
        this.A01 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.A02 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.A03 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.A05 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListA00 = AbstractC8141FWe.A00(context, typedArrayObtainStyledAttributes, 6);
        this.A07 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.A04 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.A06 = C8156FWy.A00(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paintA0T = AbstractC7607F5u.A0T();
        this.A00 = paintA0T;
        paintA0T.setColor(colorStateListA00.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
