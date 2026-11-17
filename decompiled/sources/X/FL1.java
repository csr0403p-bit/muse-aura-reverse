package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.aura.R;
import com.facebook.aura.bloks.extensions.visibility.AuraBloksVisibilityExtensionBinderUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FL1 {
    public static final FL1 A00 = new FL1();

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FBB;Ljava/util/List<+Ljava/lang/Object;>;)V */
    public static final void A01(FBB fbb, FDW fdw, List list) {
        View viewA09;
        C7384Etj.A0Y(list, 2);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            FB7 fb7 = new FB7(new F6N(next == null ? null : next instanceof String ? (String) next : next.toString()));
            FB5.A00(fdw, fb7, 0);
            FDW fdw2 = fb7.A00;
            if (fdw2 == null || (viewA09 = fdw2.A09(fbb)) == null) {
                return;
            } else {
                viewA09.setAccessibilityTraversalAfter(-1);
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FDW;LX/FBB;Ljava/util/List<+Ljava/lang/Object;>;)V */
    public static final void A02(FBB fbb, FDW fdw, List list) {
        C7384Etj.A0Y(list, 2);
        if (list.isEmpty()) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw BV4.A0U();
        }
        new Handler(looperMyLooper).post(new RunnableC7786FEr(fbb, fdw, list));
    }

    public static RunnableC7742FCt A00(SparseArray sparseArray, Runnable runnable) {
        RunnableC7742FCt runnableC7742FCt = new RunnableC7742FCt(runnable);
        C7739FCq c7739FCq = (C7739FCq) sparseArray.get(R.id.bk_context_key_render_callback_queue);
        if (c7739FCq != null && AbstractC8162FXe.A03() && !c7739FCq.A00 && !c7739FCq.A01) {
            ArrayList<RunnableC7742FCt> arrayList = c7739FCq.A04;
            arrayList.isEmpty();
            arrayList.add(runnableC7742FCt);
        }
        return runnableC7742FCt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Type inference failed for: r0v154, types: [X.FLT] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.FRp, X.I0D] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(final X.FBB r19, X.FDW r20, final X.FDW r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FL1.A03(X.FBB, X.FDW, X.FDW, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A04(FBB fbb, FDW fdw, FDW fdw2, Object obj) {
        Handler handler;
        Runnable runnable;
        RunnableC7742FCt runnableC7742FCt;
        int i;
        RunnableC7742FCt runnableC7742FCt2;
        int i2 = fdw.A05;
        if (AnonymousClass801.A0h(i2)) {
            View view = (View) obj;
            switch (i2) {
                case 13313:
                    C7384Etj.A0Y(view, 0);
                    FLQ flq = (FLQ) FBA.A05(fbb, fdw);
                    if (flq != null) {
                        flq.A02 = view.isFocused();
                        AbstractC8060FRo.A06(view, null);
                        Integer num = flq.A00;
                        view.setImportantForAccessibility(num != null ? num.intValue() : 0);
                        view.setFocusable(flq.A01);
                        A01(fbb, fdw2, AbstractC7608F5v.A15(fdw, 45));
                        return;
                    }
                    return;
                case 13337:
                    Hi7 hi7 = (Hi7) FBA.A05(fbb, fdw);
                    if (hi7 != null) {
                        hi7.A00 = null;
                        C7925FKx c7925FKx = (C7925FKx) FBA.A05(fbb, fdw2);
                        if (c7925FKx != null) {
                            AbstractC8162FXe.A02(null);
                            c7925FKx.A01.A02.remove(hi7);
                            return;
                        }
                        return;
                    }
                    return;
                case 13538:
                    AuraBloksVisibilityExtensionBinderUtils.unbind(view, fbb, fdw, fdw2);
                    return;
                case 13566:
                    i = R.id.testing_id_view_tag_key;
                    view.setTag(i, null);
                    return;
                case 13615:
                    C7650F8r c7650F8r = (C7650F8r) FBA.A05(fbb, fdw);
                    if (c7650F8r == null) {
                        throw BV4.A0c("TextInputCurrencyFormatterExtensionBinder defines a controller but none was found");
                    }
                    TextWatcher textWatcher = c7650F8r.A02;
                    if (textWatcher != null) {
                        Object objA05 = FBA.A05(fbb, fdw2);
                        if (objA05 instanceof C7925FKx) {
                            AbstractC8162FXe.A02(null);
                            ((C7925FKx) objA05).A01.A02.remove(textWatcher);
                        } else {
                            FFI.A01(fbb, objA05 != null ? FGI.A0M("Unrecognized controller type: ", C0861A6i.A01(objA05.getClass())) : "Missing text input controller", null);
                        }
                    }
                    c7650F8r.A03 = null;
                    c7650F8r.A04 = null;
                    return;
                case 13656:
                    C7384Etj.A0Y(view, 0);
                    Runnable runnable2 = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
                    if (!(runnable2 instanceof RunnableC7742FCt) || (runnableC7742FCt = (RunnableC7742FCt) runnable2) == null) {
                        return;
                    }
                    runnableC7742FCt.A00 = true;
                    return;
                case 13688:
                    C7384Etj.A0Y(view, 0);
                    FL2 fl2 = (FL2) FBA.A05(fbb, fdw);
                    if (fl2 == null) {
                        FFI.A01(null, "Null controller while binding ViewTransformsExtension", null);
                        return;
                    }
                    fl2.A0D = false;
                    FL3 fl3 = fl2.A0C;
                    if (fl3 != null) {
                        View view2 = fl3.A01;
                        view2.removeOnAttachStateChangeListener(fl3);
                        ViewTreeObserver viewTreeObserver = fl3.A00;
                        if (viewTreeObserver != null || (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                            viewTreeObserver.removeOnPreDrawListener(fl3);
                        }
                        fl3.A00 = null;
                    }
                    fl2.A0C = null;
                    fl2.A0B = null;
                    view.setAlpha(1.0f);
                    view.setRotation(0.0f);
                    view.setRotationX(0.0f);
                    view.setRotationY(0.0f);
                    float f = C60Q.A0B(FBB.A00(fbb)).density;
                    view.setCameraDistance(f * f * (-1280.0f) * AbstractC10446Hic.A00);
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    if (fl2.A0E) {
                        view.resetPivot();
                        return;
                    }
                    return;
                case 13762:
                    C7384Etj.A0Y(view, 0);
                    FLS fls = (FLS) FBA.A05(fbb, fdw);
                    if (fls != null) {
                        view.removeOnLayoutChangeListener(fls.A00);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setTranslationY(0.0f);
                        return;
                    }
                    return;
                case 13768:
                    C7651F8s c7651F8s = (C7651F8s) FBA.A05(fbb, fdw);
                    if (c7651F8s != null) {
                        C7925FKx c7925FKx2 = (C7925FKx) FBA.A05(fbb, fdw2);
                        if (c7925FKx2 != null) {
                            AbstractC8162FXe.A02(null);
                            c7925FKx2.A01.A02.remove(c7651F8s);
                        }
                        c7651F8s.A02 = null;
                        c7651F8s.A00 = null;
                        c7651F8s.A03 = null;
                        c7651F8s.A01 = null;
                        return;
                    }
                    return;
                case 13774:
                    FLO flo = (FLO) FBA.A05(fbb, fdw);
                    if (flo != null) {
                        FQI fqi = flo.A00;
                        if (fqi == null) {
                            flo.A01 = false;
                            return;
                        }
                        flo.A01 = fqi.A00;
                        fqi.A03.clear();
                        ViewTreeObserver viewTreeObserver2 = fqi.A02.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeOnGlobalLayoutListener(fqi);
                        }
                        flo.A00 = null;
                    }
                    view.setOnKeyListener(null);
                    return;
                case 13914:
                    HsM hsMA0D = fdw.A0D(43);
                    if (hsMA0D != null) {
                        F6D.A03(fbb, fdw, C9115Fyg.A04(fdw2), hsMA0D);
                    }
                    HsM hsMA0D2 = fdw.A0D(54);
                    if (hsMA0D2 != null) {
                        FLL.A00.postAtTime(new FLE(FBC.A00(F6D.A01(fbb, fdw.A09)), C9115Fyg.A04(fdw2), hsMA0D2), ((FJZ) AbstractC7608F5v.A0i(fbb, fdw)).A01, SystemClock.uptimeMillis());
                        return;
                    }
                    return;
                case 13981:
                    view.setOnTouchListener(null);
                    view.setOnKeyListener(null);
                    return;
                case 14001:
                    FL9 fl9 = (FL9) FBA.A05(fbb, fdw);
                    if (fl9 != null) {
                        fl9.A0D = view.isFocused();
                        Hzv hzv = fl9.A00;
                        if (hzv != null) {
                            I01 i01 = hzv.A01;
                            if (i01 != null) {
                                Hil hil = new Hil(view, 8);
                                i01.A04 = true;
                                view.removeCallbacks(i01.A08);
                                if (i01.A02) {
                                    view.getContext().getMainExecutor().execute(new I03(i01, hil));
                                }
                            }
                            fl9.A00 = null;
                        }
                        AbstractC8060FRo.A06(view, null);
                        view.setContentDescription(fl9.A05);
                        Integer num2 = fl9.A02;
                        view.setImportantForAccessibility(num2 != null ? num2.intValue() : 0);
                        Integer num3 = fl9.A03;
                        view.setAccessibilityLiveRegion(num3 != null ? num3.intValue() : 0);
                        Integer num4 = fl9.A01;
                        if (num4 != null) {
                            view.setFocusable(num4.intValue());
                        }
                        view.setSelected(fl9.A0A);
                        view.setEnabled(fl9.A06);
                        AbstractC8060FRo.A0B(view, fl9.A07);
                        new I0D(0).A02(view, Boolean.valueOf(fl9.A09));
                        view.setKeyboardNavigationCluster(fl9.A08);
                        if (fl9.A0C) {
                            view.setOnLongClickListener(null);
                        }
                        if (fl9.A0B) {
                            view.setOnFocusChangeListener(null);
                        }
                        A01(fbb, fdw2, fdw.A0H(56));
                        view.setLabelFor(-1);
                        return;
                    }
                    return;
                case 15833:
                    C7384Etj.A0Y(view, 0);
                    view.setOnTouchListener(null);
                    view.setOnKeyListener(null);
                    FLA fla = (FLA) AbstractC7608F5v.A0i(fbb, fdw);
                    ScaleGestureDetectorOnScaleGestureListenerC8018FPr scaleGestureDetectorOnScaleGestureListenerC8018FPr = fla.A01;
                    if (scaleGestureDetectorOnScaleGestureListenerC8018FPr != null) {
                        scaleGestureDetectorOnScaleGestureListenerC8018FPr.A04 = null;
                    }
                    handler = FLK.A00;
                    runnable = fla.A03;
                    handler.post(runnable);
                    return;
                case 16310:
                    FL6 fl6 = (FL6) AbstractC7608F5v.A0i(fbb, fdw);
                    handler = FLJ.A00;
                    runnable = fl6.A04;
                    handler.post(runnable);
                    return;
                case 16515:
                    C7384Etj.A0Y(view, 0);
                    i = R.id.bk_extension_viewtag_int;
                    view.setTag(i, null);
                    return;
                case 16529:
                    Runnable runnable3 = ((FLR) AbstractC7608F5v.A0i(fbb, fdw)).A00;
                    if (!(runnable3 instanceof RunnableC7742FCt) || (runnableC7742FCt2 = (RunnableC7742FCt) runnable3) == null) {
                        return;
                    }
                    runnableC7742FCt2.A00 = true;
                    return;
                case 16913:
                    C7384Etj.A0Y(view, 0);
                    if (fdw.A0L(38, true) && (view instanceof FLN)) {
                        FLN fln = (FLN) view;
                        fln.setAllowedContentTypes(null);
                        fln.setContentCommittedListener(null);
                        return;
                    }
                    return;
                case 23426:
                    C7384Etj.A0Y(view, 0);
                    view.setOnClickListener(null);
                    return;
                default:
                    throw AnonymousClass005.A0c(i2);
            }
        }
    }
}
