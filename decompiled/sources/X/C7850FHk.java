package X;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

/* renamed from: X.FHk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7850FHk<T extends View, U> extends AbstractC7798FFe<FDW, T, U> {
    public final FBB A00;
    public final FHi<T, U> A01;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC7833FGo
    public final /* bridge */ /* synthetic */ void Ahd(Object obj, Object obj2, Object obj3) {
        Application application;
        View view = (View) obj;
        FDW fdw = (FDW) obj2;
        FHi<T, U> fHi = this.A01;
        FBB fbb = this.A00;
        if (fHi instanceof C7935FLh) {
            FRW frw = (FRW) view;
            C7384Etj.A0Y(frw, 0);
            frw.A0J = null;
            FRX frx = frw.A00;
            C7384Etj.A0Y(frx, 0);
            frx.A04 = null;
            frx.A03 = C8472Feb.A00(7);
            frx.A01 = null;
            frx.A05 = false;
            return;
        }
        if (fHi instanceof C7810FFr) {
            C7810FFr c7810FFr = (C7810FFr) fHi;
            ((C7809FFq) AbstractC7608F5v.A0i(c7810FFr.A00, c7810FFr.A01)).A00 = null;
            return;
        }
        if (fHi instanceof C7853FHp) {
            C7384Etj.A0Y(view, 0);
            view.setBackground(null);
            return;
        }
        if (fHi instanceof FKD) {
            ImageView imageView = (ImageView) view;
            C7384Etj.A0Y(imageView, 0);
            imageView.clearColorFilter();
            return;
        }
        if (fHi instanceof C7917FKp) {
            SeekBar seekBar = (SeekBar) view;
            boolean zA1Z = AnonymousClass005.A1Z(seekBar, fbb, fdw);
            C7918FKq c7918FKq = (C7918FKq) FBA.A05(fbb, fdw);
            if (c7918FKq == null) {
                throw BV4.A0c("SliderController is null even though a controller is defined");
            }
            C7919FKr.A00.removeMessages(0, c7918FKq);
            seekBar.setOnSeekBarChangeListener(null);
            c7918FKq.A02 = seekBar.getProgress();
            c7918FKq.A0F = null;
            seekBar.setProgress(0);
            seekBar.setEnabled(zA1Z);
            GradientDrawable gradientDrawable = c7918FKq.A0C;
            if (gradientDrawable != null && c7918FKq.A0D != null && c7918FKq.A0E != null) {
                C7384Etj.A0X(gradientDrawable);
                gradientDrawable.clearColorFilter();
                GradientDrawable gradientDrawable2 = c7918FKq.A0D;
                C7384Etj.A0X(gradientDrawable2);
                gradientDrawable2.clearColorFilter();
                GradientDrawable gradientDrawable3 = c7918FKq.A0E;
                C7384Etj.A0X(gradientDrawable3);
                gradientDrawable3.clearColorFilter();
            }
            C7919FKr.A01(c7918FKq, c7918FKq.A06);
            seekBar.setMin(0);
            seekBar.setMax(0);
            return;
        }
        if (fHi instanceof FEX) {
            return;
        }
        if (fHi instanceof FMP) {
            ((FMR) ((FJJ) view)).A00.setOnCheckedChangeListener(null);
            return;
        }
        if (!(fHi instanceof FMM) && !(fHi instanceof FML)) {
            if (fHi instanceof FR5) {
                return;
            }
            if (fHi instanceof C7787FEs) {
                C7787FEs c7787FEs = (C7787FEs) fHi;
                c7787FEs.A00 = null;
                Context applicationContext = fbb.A00.getApplicationContext();
                if (!(applicationContext instanceof Application) || (application = (Application) applicationContext) == null) {
                    return;
                }
                application.unregisterActivityLifecycleCallbacks(c7787FEs.A01);
                return;
            }
            if (!(fHi instanceof FMK)) {
                return;
            }
        }
        FMN fmn = (FMN) view;
        C7384Etj.A0Y(fmn, 0);
        Animatable animatable = fmn.A00;
        if (animatable != null) {
            animatable.stop();
        }
        fmn.A01 = false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FHi<TT;TU;>;LX/FBB;)V */
    public C7850FHk(FBB fbb, FHi fHi) {
        super(fbb);
        this.A01 = fHi;
        this.A00 = fbb;
    }
}
