package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.widget.FrameLayout;

/* renamed from: X.FLh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7935FLh extends FHi<FRW, Void> {
    @Override // X.InterfaceC7830FGl
    public final /* bridge */ /* synthetic */ Object A7d(Context context) {
        C7384Etj.A0Y(context, 0);
        FRW frw = new FRW(context);
        frw.addView(new FGE(context), new FrameLayout.LayoutParams(-1, -1));
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(AbstractC7936FLi.A00);
        C7384Etj.A0U(typedArrayObtainStyledAttributes);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(1);
        if (colorStateList != null) {
            frw.setColorSchemeColors(colorStateList.getDefaultColor());
        }
        ColorStateList colorStateList2 = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList2 != null) {
            frw.setProgressBackgroundColorSchemeColor(colorStateList2.getDefaultColor());
        }
        return frw;
    }

    public C7935FLh(FBB fbb, FDW fdw) {
        super(fbb, fdw);
    }
}
