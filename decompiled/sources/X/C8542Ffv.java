package X;

import android.animation.AnimatorSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.acra.util.JavaProcFileReader;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ffv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8542Ffv {
    public Integer A00;
    public Integer A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Fragment A07;
    public final List<C8552Fg5> A08;
    public final List<C8552Fg5> A0A;
    public final List<Runnable> A09 = C3cG.A0h();
    public boolean A02 = true;

    public C8542Ffv(Fragment fragment, Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
        this.A07 = fragment;
        ArrayList arrayListA0h = C3cG.A0h();
        this.A08 = arrayListA0h;
        this.A0A = arrayListA0h;
    }

    public void A02() {
        this.A06 = false;
        if (this.A04) {
            return;
        }
        if (AbstractC8571FgQ.A0L()) {
            AbstractC7610F5x.A1O(C3cG.A0f(this, "SpecialEffectsController: "), " has called complete.");
        }
        this.A04 = true;
        Iterator<Runnable> it = this.A09.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final void A03(ViewGroup viewGroup) throws Throwable {
        this.A06 = false;
        if (this.A03) {
            return;
        }
        this.A03 = true;
        if (this.A08.isEmpty()) {
            A02();
            return;
        }
        for (C8552Fg5 c8552Fg5 : AbstractC0878AGe.A0X(this.A0A)) {
            if (!c8552Fg5.A00) {
                if (c8552Fg5 instanceof C8540Fft) {
                    ((C8540Fft) c8552Fg5).A03.A00();
                } else if (c8552Fg5 instanceof C8535Ffo) {
                    C8535Ffo c8535Ffo = (C8535Ffo) c8552Fg5;
                    AnimatorSet animatorSet = c8535Ffo.A00;
                    C8533Ffm c8533Ffm = c8535Ffo.A01;
                    if (animatorSet == null) {
                        ((AbstractC8538Ffr) c8533Ffm).A00.A04(c8535Ffo);
                    } else {
                        C8542Ffv c8542Ffv = ((AbstractC8538Ffr) c8533Ffm).A00;
                        if (c8542Ffv.A05) {
                            animatorSet.reverse();
                        } else {
                            animatorSet.end();
                        }
                        if (AbstractC8571FgQ.A0L()) {
                            StringBuilder sbA0f = C3cG.A0f(c8542Ffv, "Animator from operation ");
                            sbA0f.append(" has been canceled");
                            sbA0f.append(c8542Ffv.A05 ? " with seeking." : ".");
                            AbstractC7607F5u.A1N(C8j3.A16(sbA0f, ' '));
                        }
                    }
                } else if (c8552Fg5 instanceof C8534Ffn) {
                    C8534Ffn c8534Ffn = (C8534Ffn) c8552Fg5;
                    C8542Ffv c8542Ffv2 = ((AbstractC8538Ffr) c8534Ffn.A00).A00;
                    View view = c8542Ffv2.A07.mView;
                    view.clearAnimation();
                    viewGroup.endViewTransition(view);
                    c8542Ffv2.A04(c8534Ffn);
                    if (AbstractC8571FgQ.A0L()) {
                        AbstractC7610F5x.A1O(C3cG.A0f(c8542Ffv2, "Animation from operation "), " has been cancelled.");
                    }
                }
            }
            c8552Fg5.A00 = true;
        }
    }

    public final void A05(Integer num, Integer num2) {
        Integer num3;
        int iIntValue = num2.intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 0 || this.A00 == C79.A00) {
                    return;
                }
                if (AbstractC8571FgQ.A0N(2)) {
                    StringBuilder sbA0x = C60O.A0x("SpecialEffectsController: For fragment ");
                    sbA0x.append(this.A07);
                    sbA0x.append(" mFinalState = ");
                    sbA0x.append(A01(this.A00));
                    sbA0x.append(JavaProcFileReader.LS_SYMLINK_ARROW);
                    sbA0x.append(A01(num));
                    Log.v("FragmentManager", C8j3.A16(sbA0x, '.'));
                }
                this.A00 = num;
                return;
            }
            if (AbstractC8571FgQ.A0N(2)) {
                StringBuilder sbA0x2 = C60O.A0x("SpecialEffectsController: For fragment ");
                sbA0x2.append(this.A07);
                sbA0x2.append(" mFinalState = ");
                sbA0x2.append(A01(this.A00));
                sbA0x2.append(" -> REMOVED. mLifecycleImpact  = ");
                sbA0x2.append(A00(this.A01));
                AbstractC7609F5w.A1N(sbA0x2, " to REMOVING.");
            }
            this.A00 = C79.A00;
            num3 = C79.A0C;
        } else {
            if (this.A00 != C79.A00) {
                return;
            }
            if (AbstractC8571FgQ.A0N(2)) {
                StringBuilder sbA0x3 = C60O.A0x("SpecialEffectsController: For fragment ");
                sbA0x3.append(this.A07);
                sbA0x3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                sbA0x3.append(A00(this.A01));
                AbstractC7609F5w.A1N(sbA0x3, " to ADDING.");
            }
            num3 = C79.A01;
            this.A00 = num3;
        }
        this.A01 = num3;
        this.A02 = true;
    }

    public final void A04(C8552Fg5 c8552Fg5) {
        List<C8552Fg5> list = this.A08;
        if (list.remove(c8552Fg5) && list.isEmpty()) {
            A02();
        }
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return HatchPersistedMessageJson.UNSEND_STATUS_NONE;
            case 1:
                return "ADDING";
            default:
                return "REMOVING";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "REMOVED";
            case 1:
                return "VISIBLE";
            case 2:
                return "GONE";
            default:
                return "INVISIBLE";
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C3cI.A0x("Operation {", BV7.A0x(this));
        sbA0x.append("} {finalState = ");
        sbA0x.append(A01(this.A00));
        sbA0x.append(" lifecycleImpact = ");
        sbA0x.append(A00(this.A01));
        sbA0x.append(" fragment = ");
        sbA0x.append(this.A07);
        return C8j3.A15(sbA0x);
    }
}
