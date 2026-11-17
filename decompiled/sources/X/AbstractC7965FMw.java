package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.dsp.core.ColorData;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.FMw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7965FMw {
    public static final void A03(Context context, Interpolator interpolator, ColorData colorData, EnumC7948FMe enumC7948FMe, Integer num) {
        C7967FMy c7967FMyA02 = FN3.A00.A02(context);
        if (c7967FMyA02 == null) {
            throw C3cG.A0Q("Cannot update bottom sheet without an existing bottom sheet.");
        }
        FOS fos = c7967FMyA02.A01;
        if (fos.A0A.A0J instanceof FOE) {
            throw C3cG.A0Q("Cannot update a full screen using the UpdateBottomSheet action.");
        }
        FPN fpnA00 = enumC7948FMe != null ? AbstractC7989FOg.A00(enumC7948FMe, false) : null;
        C7964FMu c7964FMu = new C7964FMu(null, null, colorData == null ? null : new C7999FOs(colorData, null), null, null, fpnA00 != null ? new C7994FOn(interpolator, fpnA00, num) : null, null);
        Context contextRequireContext = c7967FMyA02.A00.requireContext();
        C7384Etj.A0U(contextRequireContext);
        fos.A0C(contextRequireContext, c7964FMu);
    }

    public static void A07(Context context, String str, boolean z) throws Exception {
        String str2;
        String strA0U = "Cannot pop without an existing bottom sheet.";
        C7967FMy c7967FMyA02 = FN3.A00.A02(context);
        if (c7967FMyA02 != null) {
            FNP fnp = c7967FMyA02.A03;
            FOS fos = fnp.A00;
            Context contextInvoke = fnp.A01.invoke();
            C7384Etj.A0Y(contextInvoke, 0);
            FNW fnw = FOF.A00;
            Deque<FNZ> deque = fos.A0K;
            deque.size();
            fnw.A04();
            AbstractC7610F5x.A1T(deque);
            fnw.A00();
            if (FOS.A09(fos)) {
                FNZ fnzPeekFirst = deque.peekFirst();
                if (fnzPeekFirst == null || str.equals(fnzPeekFirst.A03.ACt())) {
                    str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
                } else {
                    Iterator<FNZ> it = deque.iterator();
                    C7384Etj.A0U(it);
                    int i = 0;
                    while (it.hasNext()) {
                        if (str.equals(it.next().A03.ACt())) {
                            if (z) {
                                i++;
                            }
                            for (int i2 = 0; i2 < i; i2++) {
                                FOS.A08(contextInvoke, fos, null, C79.A01);
                            }
                            deque.size();
                            FON fon = FON.$redex_init_class;
                            fnw.A02();
                            return;
                        }
                        i++;
                    }
                    str2 = "No screen found with target ID, so no screens were popped.";
                }
                FFI.A01(null, str2, null);
                deque.size();
                String str3 = (String) C7384Etj.A0G(FNW.A00);
                if (!str3.equals("DEFAULT")) {
                    throw AbstractC7610F5x.A0o(str3);
                }
            }
            FD4 fd4 = FD3.A00;
            if (fd4 != null) {
                fd4.A00();
            }
            strA0U = FGI.A0U("Failed to pop to ", str, " bottom sheet.");
        }
        FFI.A01(null, strA0U, null);
    }

    public static final void A08(DialogFragment dialogFragment, FragmentActivity fragmentActivity, FOI foi, BloksParseResult bloksParseResult, HsN hsN, C7958FMo c7958FMo, String str) {
        C7384Etj.A0Y(fragmentActivity, 0);
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(fragmentActivity);
        C7384Etj.A0U(abstractC8571FgQA00);
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            FFI.A01(null, "Activity is finishing or destroyed, not launching CDS bottom sheet fragment.", null);
        } else if (abstractC8571FgQA00.A0F) {
            FFI.A01(null, "Fragment manager is destroyed, not launching CDS bottom sheet fragment.", null);
        } else {
            try {
                if (abstractC8571FgQA00.A0J || abstractC8571FgQA00.A0K) {
                    try {
                        F0C f0cA02 = AbstractC5321DgF.A02(C79.A0C, new C8632Fhj(4));
                        C7384Etj.A0U(f0cA02);
                        if (!AbstractC7609F5w.A1a(f0cA02)) {
                            AbstractC8571FgQ.A0Q(abstractC8571FgQA00, -1, 0);
                        }
                        C8573FgU c8573FgU = new C8573FgU(abstractC8571FgQA00);
                        c8573FgU.A01(dialogFragment, null, 0, 1);
                        c8573FgU.A03(true, true);
                    } catch (Exception e) {
                        CFK.A08("CdsContainerLauncher", "Attempting to show CDS fragment while allowing state loss failed.", e);
                    }
                } else {
                    C8573FgU c8573FgU2 = new C8573FgU(abstractC8571FgQA00);
                    if (!c8573FgU2.A0F) {
                        throw C3cG.A0Q("This FragmentTransaction is not allowed to be added to the back stack.");
                    }
                    c8573FgU2.A0E = true;
                    c8573FgU2.A09 = null;
                    dialogFragment.show(c8573FgU2, (String) null);
                }
            } catch (IllegalStateException e2) {
                FFI.A01(null, "Failed to open bottom sheet.", e2);
            }
        }
        HiZ.A00(C60O.A02(), dialogFragment, new RunnableC7960FMq(dialogFragment, fragmentActivity, foi, bloksParseResult, hsN, c7958FMo, str));
    }

    public static final C7932FLe A00(FOI foi) {
        FMd fMd;
        C7933FLf c7933FLf;
        FHL fhl = (!(foi instanceof C7933FLf) || (c7933FLf = (C7933FLf) foi) == null) ? null : c7933FLf.A02;
        G0U<?, Boolean> g0u = (!(fhl instanceof FMd) || (fMd = (FMd) fhl) == null) ? null : fMd.A04;
        if (!C0862A6j.A04(1, g0u) || g0u == null) {
            return null;
        }
        return new C7932FLe(g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FOA A01(C7967FMy c7967FMy) {
        FND fnd = FND.A02;
        FOB fob = c7967FMy.A02;
        HxE hxEA00 = (HxE) fob.A04.get(fnd);
        if (hxEA00 == null) {
            hxEA00 = FOB.A00(fob, fnd);
        }
        FOA foa = (FOA) hxEA00.first;
        C7384Etj.A0Z(foa, "null cannot be cast to non-null type com.bloks.foa.cds.bottomsheet.intf.CdsBloksBottomSheetBehavior");
        return foa;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7 A[Catch: all -> 0x01ee, TRY_LEAVE, TryCatch #5 {, blocks: (B:38:0x0130, B:47:0x0181, B:50:0x018d, B:51:0x018f, B:79:0x01e2, B:60:0x01a2, B:62:0x01a7, B:66:0x01bc, B:65:0x01b8, B:86:0x01ed, B:67:0x01bf, B:69:0x01c6, B:72:0x01d2, B:73:0x01d4, B:85:0x01ea, B:46:0x017f, B:63:0x01b3), top: B:106:0x0130, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC7992FOj A02(android.content.Context r16, X.FOA r17, X.FOI r18, com.instagram.common.bloks.BloksParseResult r19, X.HsN r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC7965FMw.A02(android.content.Context, X.FOA, X.FOI, com.instagram.common.bloks.BloksParseResult, X.HsN, java.lang.String):X.FOj");
    }

    public static void A04(Context context, HiG hiG, F0C f0c) {
        String str = "Cannot pop without an existing bottom sheet.";
        C7967FMy c7967FMyA02 = FN3.A00.A02(context);
        if (c7967FMyA02 != null) {
            FNP fnp = c7967FMyA02.A03;
            FOS fos = fnp.A00;
            Deque<FNZ> deque = fos.A0K;
            if (deque.size() == 1 && f0c != null && AbstractC7609F5w.A1a(f0c)) {
                C7967FMy.A00(c7967FMyA02, hiG, null);
                return;
            }
            Context contextInvoke = fnp.A01.invoke();
            C7384Etj.A0Y(contextInvoke, 0);
            FNW fnw = FOF.A00;
            deque.size();
            fnw.A04();
            AbstractC7610F5x.A1T(deque);
            fnw.A00();
            boolean zA08 = FOS.A08(contextInvoke, fos, hiG, C79.A00);
            deque.size();
            FON fon = FON.$redex_init_class;
            fnw.A02();
            if (zA08) {
                return;
            }
            FD4 fd4 = FD3.A00;
            if (fd4 != null) {
                fd4.A00();
            }
            str = "Failed to pop bottom sheet.";
        }
        FFI.A01(null, str, null);
    }

    public static final void A05(Context context, ColorData colorData, float f) {
        C7967FMy c7967FMyA02 = FN3.A00.A02(context);
        if (c7967FMyA02 == null) {
            throw C3cG.A0Q("Cannot update modal container without an existing bottom sheet.");
        }
        FOS fos = c7967FMyA02.A01;
        C7384Etj.A0U(c7967FMyA02.A00.requireContext());
        FOV fov = fos.A04;
        if (fov != null) {
            InterfaceC10557Hsn interfaceC10557Hsn = fos.A0B;
            if (interfaceC10557Hsn == null) {
                C7384Etj.A0b("isDarkModeProvider");
                throw F60.createAndThrow();
            }
            int i = fov.A00;
            int iA00 = colorData != null ? InterfaceC10557Hsn.A00(colorData, interfaceC10557Hsn) : 0;
            if (i != iA00) {
                ValueAnimator valueAnimator = fov.A04;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(iA00));
                valueAnimatorOfObject.setDuration(((long) f) * 1000);
                valueAnimatorOfObject.addUpdateListener(new C8918Fta(fov, iA00, 0));
                valueAnimatorOfObject.addListener(new FNR(fov));
                valueAnimatorOfObject.start();
                fov.A04 = valueAnimatorOfObject;
            }
        }
    }

    public static final void A06(Context context, FOO foo) {
        C7967FMy c7967FMyA02 = FN3.A00.A02(context);
        if (c7967FMyA02 == null) {
            throw C3cG.A0Q("Cannot update back button override without an existing bottom sheet.");
        }
        FNZ fnzPeek = c7967FMyA02.A01.A0K.peek();
        if (fnzPeek != null) {
            fnzPeek.A01 = foo != null ? new FNY(foo) : null;
        }
    }
}
