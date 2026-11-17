package X;

import android.content.res.Resources;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.FVp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8131FVp implements InterfaceC8055FRi {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BottomSheetBehavior A01;

    public C8131FVp(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A01 = bottomSheetBehavior;
        this.A00 = i;
    }

    @Override // X.InterfaceC8055FRi
    public final boolean AXn(View view) throws Resources.NotFoundException {
        this.A01.A09(this.A00);
        return true;
    }
}
