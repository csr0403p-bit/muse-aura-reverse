package com.facebook.aura.bloks.extensions.cds;

import X.AbstractC10476Hkp;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7691FAk;
import X.AbstractC7947FMc;
import X.AbstractC7965FMw;
import X.AbstractC8330Fbx;
import X.AbstractC8571FgQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BV4;
import X.C1HY;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C7645F8k;
import X.C7942FLo;
import X.C7944FLz;
import X.C7963FMt;
import X.C7964FMu;
import X.C7967FMy;
import X.C9115Fyg;
import X.EnumC7946FMb;
import X.EnumC7948FMe;
import X.F6D;
import X.FBB;
import X.FDW;
import X.FFI;
import X.FN3;
import X.FN4;
import X.FOO;
import X.Hj6;
import X.HmY;
import X.HsM;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.bloks.data.AuraAppDataConfig;
import com.facebook.aura.bloks.listener.BloksCdsOpenScreenListener;
import com.facebook.dsp.core.ColorData;
import com.instagram.common.bloks.BloksParseResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AuraCDSExtensions {
    public static final AuraCDSExtensions INSTANCE = new AuraCDSExtensions();

    public final void dismissBottomSheet(FragmentActivity fragmentActivity, F6D f6d, Hj6 hj6) {
        C7384Etj.A0Y(fragmentActivity, 0);
        C7967FMy c7967FMyA02 = FN3.A00.A02(fragmentActivity);
        if (c7967FMyA02 == null) {
            FFI.A01(null, "Cannot dismiss without an existing bottom sheet.", null);
        } else {
            C7967FMy.A00(c7967FMyA02, null, null);
        }
    }

    public final FragmentActivity findActivityFromContext(Context context) {
        C7384Etj.A0Y(context, 0);
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C7384Etj.A0U(baseContext);
        return findActivityFromContext(baseContext);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9 A[Catch: all -> 0x023a, TryCatch #4 {all -> 0x023a, blocks: (B:53:0x0133, B:54:0x0142, B:73:0x01a1, B:77:0x01ad, B:100:0x01df, B:110:0x0212, B:113:0x021c, B:114:0x0222, B:115:0x0223, B:116:0x0224, B:125:0x0233, B:126:0x0236, B:127:0x0239, B:109:0x0210, B:89:0x01bf, B:91:0x01c9, B:92:0x01cf, B:93:0x01d0, B:94:0x01d1, B:99:0x01dc, B:70:0x0191, B:72:0x019e, B:84:0x01b7, B:85:0x01ba), top: B:140:0x0133, inners: #5 }] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void openBottomSheet(androidx.fragment.app.FragmentActivity r27, final X.F6D r28, X.Hj6 r29) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions.openBottomSheet(androidx.fragment.app.FragmentActivity, X.F6D, X.Hj6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.FDW A00(X.FDW r4) {
        /*
            r3 = 15932(0x3e3c, float:2.2325E-41)
            int r1 = r4.A05
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r1 != r0) goto L27
            r0 = 42
            java.lang.Object r1 = X.FDW.A01(r4, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.List r1 = (java.util.List) r1
        L14:
            java.util.Iterator r2 = r1.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2a
            X.FDW r1 = X.AbstractC7607F5u.A0y(r2)
            int r0 = r1.A05
            if (r0 != r3) goto L18
            return r1
        L27:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            goto L14
        L2a:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions.A00(X.FDW):X.FDW");
    }

    public static String A01(FDW fdw) {
        int i = fdw.A05;
        if (!AnonymousClass002.A1Q(i, 13647) && i != 13784) {
            throw C60O.A0i("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        String strA0F = fdw.A0F(35);
        strA0F.getClass();
        return strA0F;
    }

    public final void pushBottomSheet(FragmentActivity fragmentActivity, F6D f6d, Hj6 hj6) {
        int i;
        int i2;
        String string;
        AnonymousClass003.A0u(fragmentActivity, f6d);
        C7384Etj.A0Y(hj6, 2);
        Object obj = hj6.A01[0];
        if (obj == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        FDW fdw = (FDW) obj;
        int i3 = fdw.A05;
        if (i3 == 13647) {
            i = 43;
        } else {
            if (i3 != 13784) {
                throw C60O.A0i("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
            i = 38;
        }
        FDW fdwA0C = fdw.A0C(i);
        if (fdwA0C == null) {
            throw C3cG.A0Q("Required value was null.");
        }
        BloksParseResult bloksParseResultA00 = BloksParseResult.A00(f6d, fdwA0C);
        C7384Etj.A0U(bloksParseResultA00);
        HashMap map = (HashMap) hj6.A01[2];
        C7384Etj.A0X(map);
        LinkedHashMap linkedHashMapA14 = AbstractC7607F5u.A14(map);
        HashMap mapA0u = BV4.A0u();
        Iterator itA0i = C3cG.A0i(linkedHashMapA14);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object value = entryA0l.getValue();
            Object key = entryA0l.getKey();
            String string2 = ((key instanceof Number) || !(key instanceof Boolean)) ? key.toString() : AnonymousClass001.A1X(key) ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT;
            if (value == null) {
                string = null;
            } else {
                Object value2 = entryA0l.getValue();
                string = ((value2 instanceof Number) || !(value2 instanceof Boolean)) ? value2.toString() : AnonymousClass001.A1X(value2) ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT;
            }
            mapA0u.put(string2, string);
        }
        String strA01 = A01(fdw);
        ArrayList arrayListA0h = C3cG.A0h();
        int i4 = fdw.A05;
        if (AnonymousClass002.A1Q(i4, 13647)) {
            i2 = 44;
        } else {
            if (i4 != 13784) {
                throw C60O.A0i("screen should be an instance of BloksScreenData or BloksScreenV2Data");
            }
            i2 = 49;
        }
        FN4 fn4 = new FN4(null, strA01, mapA0u, arrayListA0h, null, null, null, fdw.A07(i2, 0));
        String strA00 = AbstractC10476Hkp.A00(fdw);
        FOO backButtonOverride = getBackButtonOverride(f6d, fdw);
        EnumC7946FMb enumC7946FMb = EnumC7946FMb.A02;
        AuraAppDataConfig auraAppDataConfig = new AuraAppDataConfig();
        C7967FMy c7967FMyA02 = FN3.A00.A02(fragmentActivity);
        if (c7967FMyA02 == null) {
            throw C3cG.A0Q("Cannot push a new Screen without an existing bottom sheet.");
        }
        C7967FMy.A02(c7967FMyA02, new C7964FMu(backButtonOverride != null ? new C7963FMt(null, backButtonOverride) : null, null, null, null, null, null, new C7942FLo(enumC7946FMb)).A00(AbstractC7965FMw.A00(fn4)), AbstractC7965FMw.A02(fragmentActivity, AbstractC7965FMw.A01(c7967FMyA02), fn4, bloksParseResultA00, auraAppDataConfig, strA00), new C7944FLz(null));
    }

    private final FOO getBackButtonOverride(final F6D f6d, FDW fdw) {
        final HsM hsMA0D;
        FDW fdwA00 = A00(fdw);
        if (fdwA00 == null || (hsMA0D = fdwA00.A0D(40)) == null) {
            return null;
        }
        return new FOO() { // from class: com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions$getBackButtonOverride$1$1
            @Override // X.FOO
            public final boolean onBackInvoked() {
                HsM hsM = hsMA0D;
                AbstractC7691FAk.A00(f6d, C9115Fyg.A03(C9115Fyg.A00(), f6d.A02, 0), hsM);
                return true;
            }
        };
    }

    private final void setOpenScreenListener(FragmentActivity fragmentActivity) {
        BloksCdsOpenScreenListener bloksCdsOpenScreenListener;
        AbstractC8571FgQ abstractC8571FgQA00 = AbstractC8330Fbx.A00(fragmentActivity);
        C7384Etj.A0U(abstractC8571FgQA00);
        C1HY c1hy = abstractC8571FgQA00.A07;
        if (!(c1hy instanceof BloksCdsOpenScreenListener) || (bloksCdsOpenScreenListener = (BloksCdsOpenScreenListener) c1hy) == null) {
            return;
        }
        bloksCdsOpenScreenListener.onOpenScreen();
    }

    public final void closeScreen(FragmentActivity fragmentActivity, F6D f6d, Hj6 hj6) {
        AnonymousClass005.A0x(fragmentActivity, f6d, hj6);
        FDW fdw = (FDW) hj6.A01[0];
        FBB fbbA04 = f6d.A04();
        HsM hsMA0Z = fdw != null ? AbstractC7608F5v.A0Z(fdw) : null;
        C7967FMy c7967FMyA02 = FN3.A00.A02(fragmentActivity);
        if (c7967FMyA02 == null) {
            FFI.A01(null, "Cannot dismiss without an existing bottom sheet.", null);
        } else {
            C7967FMy.A00(c7967FMyA02, null, (fdw == null || hsMA0Z == null) ? null : new HmY(fbbA04, fdw, hsMA0Z));
        }
    }

    public final void popBottomSheet(FragmentActivity fragmentActivity, Hj6 hj6) throws Exception {
        AnonymousClass003.A0u(fragmentActivity, hj6);
        String strA0o = AbstractC7608F5v.A0o((FDW) hj6.A01[0]);
        if (strA0o == null) {
            AbstractC7965FMw.A04(fragmentActivity, null, null);
        } else {
            AbstractC7965FMw.A07(fragmentActivity, strA0o, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeBottomSheet(androidx.fragment.app.FragmentActivity r5, X.Hj6 r6) {
        /*
            r4 = this;
            boolean r2 = X.C60P.A1Y(r5, r6)
            java.lang.Object[] r1 = r6.A01
            r0 = 0
            r4 = r1[r0]
            X.C7384Etj.A0U(r4)
            java.lang.String r4 = (java.lang.String) r4
            X.C7384Etj.A0Y(r4, r2)
            X.FN3 r3 = X.FN3.A00
            java.lang.Integer r2 = X.C79.A0C
            r1 = 2
            X.Fhj r0 = new X.Fhj
            r0.<init>(r1)
            X.F0C r0 = X.AbstractC5321DgF.A02(r2, r0)
            boolean r0 = X.AbstractC7609F5w.A1a(r0)
            if (r0 == 0) goto L8f
            X.A25 r0 = X.A23.A01(r5)
            java.util.ArrayList r0 = r0.A00
            java.util.List r0 = X.AbstractC0878AGe.A0V(r0)
            java.util.Iterator r2 = r0.iterator()
        L33:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r1 = r2.next()
            X.FMy r1 = (X.C7967FMy) r1
            boolean r0 = r1.A03(r4)
            if (r0 == 0) goto L33
        L45:
            X.FNP r0 = r1.A03
            X.FOS r0 = r0.A00
            java.util.Deque<X.FNZ> r1 = r0.A0K
            java.lang.Object r0 = r1.peekFirst()
            X.FNZ r0 = (X.FNZ) r0
            if (r0 == 0) goto La8
            X.FOj r0 = r0.A03
            java.lang.String r0 = r0.ACt()
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto La8
            java.util.Iterator r3 = r1.iterator()
            X.C7384Etj.A0U(r3)
        L66:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r2 = r3.next()
            X.FNZ r2 = (X.FNZ) r2
            X.FOj r1 = r2.A03
            java.lang.String r0 = r1.ACt()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L66
            android.view.View r0 = r2.A00
            if (r0 == 0) goto L88
            r1.A8v()
            r0 = 0
            r2.A00 = r0
        L88:
            r1.destroy()
            r3.remove()
            return
        L8f:
            android.app.Activity r0 = X.HiC.A00(r5)
            java.util.List r1 = X.HiC.A02(r0)
            if (r1 == 0) goto La5
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La5
            X.FMy r1 = X.FN3.A00(r3, r4, r1)
            if (r1 != 0) goto L45
        La5:
            java.lang.String r1 = "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID"
            goto Lad
        La8:
            java.lang.String r1 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead."
            goto Lad
        Lab:
            java.lang.String r1 = "No screen found with target ID, so the screen was not removed."
        Lad:
            r0 = 0
            X.FFI.A01(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bloks.extensions.cds.AuraCDSExtensions.removeBottomSheet(androidx.fragment.app.FragmentActivity, X.Hj6):void");
    }

    public final void updateBackButtonOverride(Hj6 hj6, F6D f6d) {
        Context context;
        AnonymousClass003.A0u(hj6, f6d);
        HsM hsM = (HsM) hj6.A01[0];
        FBB fbb = f6d.A02;
        if (fbb == null || (context = fbb.A00) == null) {
            return;
        }
        AbstractC7965FMw.A06(context, hsM != null ? new C7645F8k(hsM, f6d) : null);
    }

    public final void updateBottomSheet(F6D f6d, Hj6 hj6) {
        Context context;
        FDW fdwA0h = AbstractC7609F5w.A0h(hj6, AnonymousClass004.A1b(f6d, hj6) ? 1 : 0);
        String strA0q = AbstractC7608F5v.A0q(fdwA0h);
        EnumC7948FMe enumC7948FMeA00 = strA0q != null ? EnumC7948FMe.A00(strA0q) : null;
        ColorData colorDataA02 = AbstractC7947FMc.A02(AbstractC7608F5v.A0Y(fdwA0h));
        FBB fbb = f6d.A02;
        if (fbb == null || (context = fbb.A00) == null) {
            throw BV4.A0U();
        }
        AbstractC7965FMw.A03(context, null, colorDataA02, enumC7948FMeA00, null);
    }

    public final void updateModalContainer(F6D f6d, Hj6 hj6) {
        Context context;
        FDW fdwA0h = AbstractC7609F5w.A0h(hj6, AnonymousClass004.A1b(f6d, hj6) ? 1 : 0);
        ColorData colorDataA01 = AbstractC7947FMc.A01(fdwA0h.A0C(36));
        float fA06 = fdwA0h.A06(35, 0.0f);
        FBB fbb = f6d.A02;
        if (fbb == null || (context = fbb.A00) == null) {
            throw BV4.A0U();
        }
        AbstractC7965FMw.A05(context, colorDataA01, fA06);
    }
}
