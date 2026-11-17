package X;

import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ApG extends AbstractC1718Ap2 implements C13s {
    public Object A00;
    public boolean A01;
    public final AT5<Float, AOW> A02;
    public final MutableState A03;
    public final Function0<Unit> A04;
    public final C3UX A05;
    public final boolean A06;
    public final Window A07;

    @Override // X.C13s
    public final Window AMm() {
        return this.A07;
    }

    @Override // X.AbstractC1718Ap2
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Landroid/view/Window;ZLkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/3UX;)V */
    public ApG(Context context, Window window, AT5 at5, Function0 function0, C3UX c3ux, boolean z) {
        super(context);
        this.A07 = window;
        this.A06 = z;
        this.A04 = function0;
        this.A02 = at5;
        this.A05 = c3ux;
        this.A03 = AbstractC1798ArH.A06(C1AO.A01);
    }

    @Override // X.AbstractC1718Ap2, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.A06 || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        Object objA00 = this.A00;
        if (objA00 == null) {
            Function0<Unit> function0 = this.A04;
            objA00 = i >= 34 ? AWi.A00(this.A02, function0, this.A05) : B9t.A00(function0);
            this.A00 = objA00;
        }
        B9t.A01(this, objA00);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            B9t.A02(this, this.A00);
        }
        this.A00 = null;
    }
}
