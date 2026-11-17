package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FP3 implements Runnable {
    public static final String __redex_internal_original_name = "CdsScreenErrorViewHandler$showErrorView$1";
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ C7997FOq A01;

    public FP3(FrameLayout frameLayout, C7997FOq c7997FOq) {
        this.A01 = c7997FOq;
        this.A00 = frameLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        FrameLayout frameLayout;
        ViewParent parent;
        C7997FOq c7997FOq = this.A01;
        FrameLayout frameLayout2 = this.A00;
        FrameLayout frameLayout3 = c7997FOq.A00;
        if (frameLayout3 == null) {
            c7997FOq.A00 = new FrameLayout(c7997FOq.A01);
        } else if (frameLayout3.getParent() != null && (frameLayout = c7997FOq.A00) != null) {
            AbstractC7610F5x.A19(frameLayout);
            frameLayout.removeAllViews();
        }
        boolean zAOJ = c7997FOq.A05.AOJ();
        Hi8 hi8 = Hi8.A04;
        EnumC7995FOo themeName = FP4.A00.getThemeName();
        C7384Etj.A0Y(themeName, 0);
        float fAft = FQX.A00(themeName).Aft(hi8);
        Context context = c7997FOq.A01;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        Context contextA0E = AbstractC7608F5v.A0E(linearLayout);
        linearLayout.setPadding((int) HsH.A00(contextA0E, fAft), 0, (int) HsH.A00(contextA0E, fAft), 0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        ImageView imageView = new ImageView(context);
        Context context2 = imageView.getContext();
        Resources resources = context2.getResources();
        C8406FdN c8406FdN = new C8406FdN();
        ((AbstractC8146FWk) c8406FdN).A00 = resources.getDrawable(R.drawable.xmds_icon_plus__vector_exclamation_circle_blue, null);
        imageView.setImageDrawable(c8406FdN);
        imageView.setPadding(0, 0, 0, (int) HsH.A00(context2, FPW.A00().Aft(Hi8.A06)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        FPJ fpjAhb = FPW.A00().Ahb(C79.A05);
        TextView textView = new TextView(context);
        textView.setText(R.string._name_removed__res_0x7f120003);
        textView.setGravity(17);
        textView.setMaxLines(3);
        FP5 fp5 = FP5.A0H;
        textView.setTextColor(FP4.A00(fp5, zAOJ));
        textView.setTextSize(fpjAhb.A00);
        textView.setLineSpacing(0.0f, fpjAhb.A02.A00);
        Context contextA0E2 = AbstractC7608F5v.A0E(textView);
        textView.setLetterSpacing(fpjAhb.A01 / (((int) r6) / C60Q.A0B(contextA0E2).scaledDensity));
        FJA fjaA0O = AbstractC7608F5v.A0O();
        textView.setTypeface(fjaA0O.createTypefaceFromFontFamily(contextA0E2, ((FP6) fpjAhb.A03).value, 1));
        textView.setPadding(0, 0, 0, (int) HsH.A00(contextA0E2, FPW.A00().Aft(Hi8.A05)));
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView);
        FPJ fpjAhb2 = FPW.A00().Ahb(C79.A00);
        TextView textView2 = new TextView(context);
        textView2.setText(R.string._name_removed__res_0x7f120001);
        textView2.setGravity(17);
        textView2.setMaxLines(7);
        textView2.setTextColor(FP4.A00(fp5, zAOJ));
        textView2.setTextSize(fpjAhb2.A00);
        textView2.setLineSpacing(0.0f, fpjAhb2.A02.A00);
        Context contextA0E3 = AbstractC7608F5v.A0E(textView2);
        textView2.setLetterSpacing(fpjAhb2.A01 / (((int) r4) / C60Q.A0B(contextA0E3).scaledDensity));
        C6979Edd.A00();
        textView2.setTypeface(fjaA0O.createTypefaceFromFontFamily(contextA0E3, ((FP6) fpjAhb2.A03).value, 0));
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2);
        FrameLayout frameLayout4 = c7997FOq.A00;
        if (frameLayout4 != null) {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.company_layer_icons_close_outline_24);
            imageView2.setColorFilter(FP4.A00(FP5.A0F, zAOJ));
            imageView2.setOnClickListener(new I0W(c7997FOq, 2));
            imageView2.setContentDescription(context.getString(android.R.string.cancel));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) HsH.A00(context, 24.0f), (int) HsH.A00(context, 24.0f));
            layoutParams2.setMargins((int) HsH.A00(context, 20.0f), (int) HsH.A00(context, 30.0f), 0, 0);
            layoutParams2.gravity = 51;
            frameLayout4.addView(imageView2, layoutParams2);
        }
        FrameLayout frameLayout5 = c7997FOq.A00;
        if (frameLayout5 != null) {
            frameLayout5.addView(linearLayout);
        }
        FrameLayout frameLayout6 = c7997FOq.A00;
        if (frameLayout6 != null) {
            FP8 fp8A5K = FPW.A00().A5K(C79.A01);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(HsH.A00(context, FPW.A00().A7P(C79.A0P)));
            gradientDrawable.setColor(FP4.A00(FP5.A0C, zAOJ));
            gradientDrawable.setStroke((int) fp8A5K.A00, FP4.A00((FP5) fp8A5K.A01, zAOJ));
            FPJ fpjAhb3 = FPW.A00().Ahb(C79.A0L);
            Button button = new Button(context);
            button.setBackground(gradientDrawable);
            button.setText(R.string._name_removed__res_0x7f120002);
            button.setTextSize(fpjAhb3.A00);
            button.setTextColor(FP4.A00(FP5.A0E, zAOJ));
            button.setHeight((int) HsH.A00(context, FPW.A00().Afi(C79.A0C)));
            button.setLineSpacing(0.0f, fpjAhb3.A02.A00);
            C6979Edd.A00();
            button.setTypeface(fjaA0O.createTypefaceFromFontFamily(context, ((FP6) fpjAhb3.A03).name(), 0));
            button.setLetterSpacing(fpjAhb3.A01 / (((int) r1) / C60Q.A0B(context).scaledDensity));
            int iAft = (int) FPW.A00().Aft(Hi8.A02);
            button.setPadding(iAft, 0, iAft, 0);
            button.setOnClickListener(new I0W(c7997FOq, 3));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setGravity(80);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins((int) HsH.A00(context, 20.0f), 0, (int) HsH.A00(context, 20.0f), (int) HsH.A00(context, 20.0f));
            layoutParams3.weight = 1.0f;
            linearLayout2.addView(button, layoutParams3);
            frameLayout6.addView(linearLayout2);
        }
        FrameLayout frameLayout7 = c7997FOq.A00;
        if (frameLayout7 != null && (parent = frameLayout7.getParent()) != null) {
            ((ViewGroup) parent).removeView(c7997FOq.A00);
        }
        frameLayout2.addView(c7997FOq.A00);
    }
}
