package X;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.facebook.aura.ccv.CcvBloksHelperKt;

/* renamed from: X.FOm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7993FOm {
    public FrameLayout A00;
    public final Context A01;
    public final Handler A02 = C60O.A02();
    public final CcvBloksHelperKt.AnonymousClass5 A03;
    public final FHO A04;
    public final InterfaceC10557Hsn A05;
    public final boolean A06;

    public static final void A00(C7993FOm c7993FOm) {
        FrameLayout frameLayout = c7993FOm.A00;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(frameLayout);
                frameLayout.removeAllViews();
            }
        }
    }

    public C7993FOm(Context context, CcvBloksHelperKt.AnonymousClass5 anonymousClass5, FHO fho, InterfaceC10557Hsn interfaceC10557Hsn, boolean z) {
        this.A01 = context;
        this.A05 = interfaceC10557Hsn;
        this.A04 = fho;
        this.A03 = anonymousClass5;
        this.A06 = z;
    }
}
