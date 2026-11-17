package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.Bhc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2679Bhc {
    public InterfaceC2497BcO A00;
    public InterfaceC2541BdS A01;
    public BgD A02;
    public ListenableFuture<Void> A03;
    public Integer A04;
    public final Handler A05;
    public final HandlerThread A06;
    public final C2647Bge A07;
    public final InterfaceC2670BhE A08;
    public final ListenableFuture<Void> A0A;
    public final Executor A0C;
    public static final Object A0E = C3cG.A0T();
    public static final SparseArray<Integer> A0D = BV4.A0B();
    public final C2569Bdy A09 = new C2569Bdy();
    public final Object A0B = C3cG.A0T();

    /* JADX WARN: Can't wrap try/catch for region: R(16:12|(2:105|20)|(1:22)(28:25|98|26|(1:28)(1:29)|97|31|(1:33)|24|102|34|36|107|37|39|(1:41)|42|(1:44)(1:49)|45|14c|65|100|66|67|(1:69)(1:73)|70|1c1|78|79)|23|24|102|34|36|107|37|39|(0)|42|(0)(0)|45|14c) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:12|105|20|(1:22)(28:25|98|26|(1:28)(1:29)|97|31|(1:33)|24|102|34|36|107|37|39|(1:41)|42|(1:44)(1:49)|45|14c|65|100|66|67|(1:69)(1:73)|70|1c1|78|79)|23|24|102|34|36|107|37|39|(0)|42|(0)(0)|45|14c) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0118, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b A[Catch: all -> 0x01e4, PHI: r1
  0x019b: PHI (r1v17 int) = (r1v16 int), (r1v16 int), (r1v18 int), (r1v19 int), (r1v20 int) binds: [B:54:0x017e, B:56:0x0184, B:58:0x018b, B:60:0x0192, B:62:0x0199] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {, blocks: (B:64:0x019d, B:50:0x0155, B:52:0x0169, B:53:0x0172, B:55:0x0180, B:57:0x0186, B:59:0x018d, B:61:0x0194, B:63:0x019b), top: B:95:0x0155 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2679Bhc(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2679Bhc.<init>(android.content.Context):void");
    }

    public static Set<Class<? extends BX1>> A00(String[] strArr) throws ClassNotFoundException {
        Class<?> cls;
        HashSet hashSetA13 = C60O.A13();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                AbstractC2875Bni.A06("QuirkSettingsLoader", FGI.A0M("Class not found: ", str), e);
            }
            if (!BX1.class.isAssignableFrom(cls)) {
                AbstractC2875Bni.A03("QuirkSettingsLoader", FGI.A0M(str, " does not implement the Quirk interface."));
                cls = null;
            }
            if (cls != null) {
                hashSetA13.add(cls);
            }
        }
        return hashSetA13;
    }

    public static String[] A01(Context context, Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            int i = bundle.getInt(str, -1);
            if (i != -1) {
                try {
                    return context.getResources().getStringArray(i);
                } catch (Resources.NotFoundException e) {
                    AbstractC2875Bni.A06("QuirkSettingsLoader", FGI.A0H("Quirk class names resource not found: ", i), e);
                    return new String[0];
                }
            }
            AbstractC2875Bni.A03("QuirkSettingsLoader", FGI.A0M("Resource ID not found for key: ", str));
        }
        return new String[0];
    }
}
