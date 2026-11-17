package X;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.aura.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BA0 extends DialogC10469Hka {
    public BA2 A00;
    public Function0<Unit> A01;
    public boolean A02;
    public final View A03;
    public final B1N A04;

    public static final void A00(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof B1N) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ViewGroup) && (viewGroup2 = (ViewGroup) childAt) != null) {
                A00(viewGroup2);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA2;LX/Arj;)V */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.EnumC1820Arj r9, X.BA2 r10, kotlin.jvm.functions.Function0 r11) {
        /*
            r8 = this;
            r8.A01 = r11
            r8.A00 = r10
            java.lang.Integer r2 = r10.A00
            android.view.View r0 = r8.A03
            boolean r1 = X.AYW.A02(r0)
            int r0 = r2.intValue()
            r7 = 1
            r3 = 1
            if (r0 == r7) goto L15
            r3 = r1
        L15:
            android.view.Window r2 = r8.getWindow()
            X.C7384Etj.A0X(r2)
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = -8193(0xffffffffffffdfff, float:NaN)
            if (r3 == 0) goto L24
            r0 = 8192(0x2000, float:1.14794E-41)
        L24:
            r2.setFlags(r0, r1)
            X.B1N r6 = r8.A04
            int r2 = r9.ordinal()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L38
            if (r2 == r7) goto L39
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L38:
            r1 = 0
        L39:
            r6.setLayoutDirection(r1)
            boolean r5 = r10.A01
            boolean r4 = r10.A04
            boolean r0 = r6.A01
            if (r0 == 0) goto L4d
            boolean r0 = r6.A03
            if (r4 != r0) goto L4d
            boolean r1 = r6.A00
            r0 = 0
            if (r5 == r1) goto L4e
        L4d:
            r0 = 1
        L4e:
            r6.A03 = r4
            r6.A00 = r5
            if (r0 == 0) goto L6c
            android.view.Window r3 = r6.A04
            android.view.WindowManager$LayoutParams r0 = r3.getAttributes()
            r2 = -2
            r1 = -1
            if (r4 == 0) goto L5f
            r1 = -2
        L5f:
            int r0 = r0.width
            if (r1 != r0) goto L67
            boolean r0 = r6.A01
            if (r0 != 0) goto L6c
        L67:
            r3.setLayout(r1, r2)
            r6.A01 = r7
        L6c:
            boolean r0 = r10.A03
            r8.setCanceledOnTouchOutside(r0)
            android.view.Window r3 = r8.getWindow()
            if (r3 == 0) goto L7d
            if (r5 == 0) goto L7e
            r2 = 0
        L7a:
            r3.setSoftInputMode(r2)
        L7d:
            return
        L7e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r2 = 48
            if (r1 >= r0) goto L7a
            r2 = 16
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA0.A05(X.Arj, X.BA2, kotlin.jvm.functions.Function0):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.A00.A02 || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.A01.invoke();
        return true;
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/BA2;Landroid/view/View;LX/Arj;LX/AXN;Ljava/util/UUID;)V */
    public BA0(View view, AXN axn, EnumC1820Arj enumC1820Arj, BA2 ba2, UUID uuid, Function0 function0) {
        ViewGroup viewGroup;
        super(new ContextThemeWrapper(view.getContext(), ba2.A01 ? R.style._name_removed__res_0x7f130082 : R.style._name_removed__res_0x7f130085), 0);
        this.A01 = function0;
        this.A00 = ba2;
        this.A03 = view;
        Window window = getWindow();
        if (window == null) {
            throw C3cG.A0Q("Dialog has no window");
        }
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        BA9.A00(window, this.A00.A01);
        window.setGravity(17);
        if (!this.A00.A01) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.layoutInDisplayCutoutMode = 3;
            if (Build.VERSION.SDK_INT >= 30) {
                B1P.A01(attributes2);
                B1P.A02(attributes2);
            }
            window.setAttributes(attributes2);
        }
        B1N b1n = new B1N(getContext(), window);
        setTitle("");
        b1n.setTag(R.id.compose_view_saveable_id_tag, AnonymousClass007.A0a("Dialog:", uuid));
        b1n.setClipChildren(false);
        b1n.setElevation(axn.Ah4(8.0f));
        b1n.setOutlineProvider(new BSA(2));
        this.A04 = b1n;
        View decorView = window.getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            A00(viewGroup);
        }
        setContentView(b1n);
        Ap6.A01(view, b1n);
        A05(enumC1820Arj, this.A00, this.A01);
        C2186B9f onBackPressedDispatcher = getOnBackPressedDispatcher();
        C2326BUa c2326BUa = new C2326BUa(this, 14);
        C7384Etj.A0Y(onBackPressedDispatcher, 0);
        onBackPressedDispatcher.A01(new BSB(c2326BUa), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (r0 == 3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[PHI: r0
  0x006c: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:18:0x006a, B:23:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r8 = super.onTouchEvent(r10)
            X.BA2 r0 = r9.A00
            boolean r0 = r0.A03
            r7 = 3
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L64
            X.B1N r2 = r9.A04
            float r0 = r10.getX()
            float r0 = java.lang.Math.abs(r0)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L6f
            float r0 = r10.getY()
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L6f
            android.view.View r1 = r2.getChildAt(r6)
            if (r1 == 0) goto L6f
            int r4 = r2.getLeft()
            int r0 = r1.getLeft()
            int r4 = r4 + r0
            int r3 = r1.getWidth()
            int r3 = r3 + r4
            int r2 = r2.getTop()
            int r0 = r1.getTop()
            int r2 = r2 + r0
            int r1 = r1.getHeight()
            int r1 = r1 + r2
            float r0 = r10.getX()
            int r0 = X.Ab3.A01(r0)
            if (r4 > r0) goto L6f
            if (r0 > r3) goto L6f
            float r0 = r10.getY()
            int r0 = X.Ab3.A01(r0)
            if (r2 > r0) goto L6f
            if (r0 > r1) goto L6f
        L64:
            int r0 = r10.getActionMasked()
            if (r0 == 0) goto L83
            if (r0 == r5) goto L83
        L6c:
            if (r0 == r7) goto L83
        L6e:
            return r8
        L6f:
            int r0 = r10.getActionMasked()
            if (r0 == 0) goto L86
            if (r0 != r5) goto L6c
            boolean r0 = r9.A02
            if (r0 == 0) goto L6e
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.A01
            r0.invoke()
            r9.A02 = r6
            return r5
        L83:
            r9.A02 = r6
            return r8
        L86:
            r9.A02 = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BA0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
