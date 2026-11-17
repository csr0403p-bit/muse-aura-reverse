package X;

import android.view.View;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FQ4 implements Runnable {
    public static final String __redex_internal_original_name = "BloksViewpointVisibilityExtensionBinder$unbind$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ FPv A02;
    public final /* synthetic */ FDW A03;
    public final /* synthetic */ C8021FPx A04;
    public final /* synthetic */ Map<FDW, C7686FAf> A05;

    /* JADX WARN: Incorrect types in method signature: (LX/FPx;Landroid/view/View;Ljava/util/Map<LX/FDW;LX/FAf;>;LX/FDW;LX/FPv;I)V */
    public FQ4(View view, FPv fPv, FDW fdw, C8021FPx c8021FPx, Map map, int i) {
        this.A04 = c8021FPx;
        this.A01 = view;
        this.A05 = map;
        this.A03 = fdw;
        this.A02 = fPv;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A04.A00(this.A01, C8020FPu.A03);
        this.A05.remove(this.A03);
        this.A02.A01.remove(this.A00);
    }
}
