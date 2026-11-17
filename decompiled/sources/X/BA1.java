package X;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.aura.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BA1 extends DialogC10469Hka {
    public BA3 A00;
    public Function0<Unit> A01;
    public final View A02;
    public final ApG A03;

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA3;LX/Arj;)V */
    public final void A05(BA3 ba3, EnumC1820Arj enumC1820Arj, Function0 function0) {
        this.A01 = function0;
        this.A00 = ba3;
        ViewGroup.LayoutParams layoutParams = this.A02.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = false;
        if (layoutParams2 != null && (layoutParams2.flags & 8192) != 0) {
            z = true;
        }
        Window window = getWindow();
        C7384Etj.A0X(window);
        window.setFlags(z ? 8192 : -8193, 8192);
        ApG apG = this.A03;
        int iOrdinal = enumC1820Arj.ordinal();
        int i = 1;
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            throw C3cG.A0q();
        }
        apG.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA3;Landroid/view/View;LX/Arj;LX/AXN;Ljava/util/UUID;LX/AT5<Ljava/lang/Float;LX/AOW;>;LX/3UX;Z)V */
    public BA1(View view, AT5 at5, BA3 ba3, AXN axn, EnumC1820Arj enumC1820Arj, UUID uuid, Function0 function0, C3UX c3ux, boolean z) {
        super(new ContextThemeWrapper(view.getContext(), R.style._name_removed__res_0x7f130084), 0);
        this.A01 = function0;
        this.A00 = ba3;
        this.A02 = view;
        Window window = getWindow();
        if (window == null) {
            throw C3cG.A0Q("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        BA9.A00(window, false);
        ApG apG = new ApG(getContext(), window, at5, this.A01, c3ux, this.A00.A01);
        apG.setTag(R.id.compose_view_saveable_id_tag, AnonymousClass007.A0a("Dialog:", uuid));
        apG.setClipChildren(false);
        apG.setElevation(axn.Ah4(8.0f));
        apG.setOutlineProvider(new BSA(0));
        this.A03 = apG;
        setContentView(apG);
        Ap6.A01(view, apG);
        A05(this.A00, enumC1820Arj, this.A01);
        C1971Avc c1971Avc = new C1971Avc(window.getDecorView(), window);
        boolean z2 = !z;
        c1971Avc.A01(z2);
        c1971Avc.A00(z2);
        C2186B9f onBackPressedDispatcher = getOnBackPressedDispatcher();
        BUX buxA00 = BUX.A00(this, 12);
        C7384Etj.A0Y(onBackPressedDispatcher, 0);
        onBackPressedDispatcher.A01(new BSB(buxA00), this);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.A01.invoke();
        }
        return zOnTouchEvent;
    }
}
