package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.aura.R;
import com.facebook.aura.ccv.CcvBloksHelperKt;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FP2 implements Runnable {
    public static final String __redex_internal_original_name = "CdsScreenLoadingViewHandler$showLoadingView$1";
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C7993FOm A01;

    public FP2(FrameLayout frameLayout, C7993FOm c7993FOm) {
        this.A01 = c7993FOm;
        this.A00 = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        C7993FOm c7993FOm = this.A01;
        CcvBloksHelperKt.AnonymousClass5 anonymousClass5 = c7993FOm.A03;
        FrameLayout frameLayout = this.A00;
        if (anonymousClass5 != null) {
            C7993FOm.A00(c7993FOm);
            FrameLayout frameLayout2 = c7993FOm.A00;
            if (frameLayout2 == null) {
                frameLayout2 = new FrameLayout(c7993FOm.A01);
                c7993FOm.A00 = frameLayout2;
            }
            if (frameLayout2 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            frameLayout.addView(frameLayout2);
            return;
        }
        C7993FOm.A00(c7993FOm);
        boolean zAOJ = c7993FOm.A05.AOJ();
        Interpolator interpolator = FMU.A09;
        Context context = c7993FOm.A01;
        int iA00 = FP4.A00(FP5.A0I, zAOJ);
        Integer num = C79.A0R;
        EnumC7995FOo themeName = FP4.A00.getThemeName();
        C7384Etj.A0Y(themeName, 0);
        FMU fmu = new FMU(context, iA00, (int) HsH.A00(context, FQX.A00(themeName).Afi(num)));
        FMN fmn = new FMN(context);
        fmn.A00(fmu);
        FrameLayout frameLayout3 = c7993FOm.A00;
        if (frameLayout3 == null) {
            frameLayout3 = new FrameLayout(context);
            c7993FOm.A00 = frameLayout3;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        if (!c7993FOm.A06) {
            FP8 fp8A5K = FPW.A00().A5K(C79.A0T);
            FP5 fp5 = (FP5) fp8A5K.A01;
            float f = fp8A5K.A00;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(HsH.A00(context, FPW.A00().A7P(C79.A0P)));
            gradientDrawable.setStroke((int) f, FP4.A00(fp5, zAOJ));
            gradientDrawable.setColor(FP4.A00(FP5.A0J, zAOJ));
            FPJ fpjAhb = FPW.A00().Ahb(C79.A0L);
            Button button = new Button(context);
            button.setBackgroundDrawable(gradientDrawable);
            button.setText(R.string._name_removed__res_0x7f120004);
            button.setTextSize(fpjAhb.A00);
            button.setTextColor(FP4.A00(FP5.A0P, zAOJ));
            button.setHeight((int) HsH.A00(context, FPW.A00().Afi(C79.A0C)));
            button.setLineSpacing(0.0f, fpjAhb.A02.A00);
            button.setTypeface(AbstractC7608F5v.A0O().createTypefaceFromFontFamily(context, ((FP6) fpjAhb.A03).name(), 0));
            button.setLetterSpacing(fpjAhb.A01 / (((int) r13) / C60Q.A0B(context).scaledDensity));
            button.setOnClickListener(new I0W(c7993FOm, 4));
            button.setAlpha(0.0f);
            C8093FSz c8093FSzA02 = AbstractC8060FRo.A02(button);
            WeakReference<View> weakReference = c8093FSzA02.A00;
            View viewA0c = AbstractC7607F5u.A0c(weakReference);
            if (viewA0c != null) {
                viewA0c.animate().setStartDelay(3000L);
            }
            c8093FSzA02.A02(1.0f);
            c8093FSzA02.A03(200L);
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            View viewA0c2 = AbstractC7607F5u.A0c(weakReference);
            if (viewA0c2 != null) {
                viewA0c2.animate().setInterpolator(linearInterpolator);
            }
            View viewA0c3 = AbstractC7607F5u.A0c(weakReference);
            if (viewA0c3 != null) {
                viewA0c3.animate().start();
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(80);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins((int) HsH.A00(context, 20.0f), 0, (int) HsH.A00(context, 20.0f), (int) HsH.A00(context, 20.0f));
            layoutParams2.weight = 1.0f;
            linearLayout.addView(button, layoutParams2);
            frameLayout3.addView(linearLayout);
        }
        frameLayout3.addView(fmn, layoutParams);
        frameLayout.addView(frameLayout3);
        Animatable animatable = fmn.A00;
        if (animatable != null) {
            animatable.start();
        }
        fmn.A01 = true;
    }
}
