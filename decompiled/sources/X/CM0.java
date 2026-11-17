package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontFamily;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class CM0 {
    public static final C7523EzA<String, Typeface> A00 = new C7523EzA<>(16);
    public static final DQZ<String, ArrayList<BeM<CMB>>> A01;
    public static final Object A02;
    public static final ExecutorService A03;

    static {
        ThreadFactoryC3073Bx1 threadFactoryC3073Bx1 = new ThreadFactoryC3073Bx1();
        threadFactoryC3073Bx1.A01 = "fonts-androidx";
        threadFactoryC3073Bx1.A00 = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), threadFactoryC3073Bx1);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        A03 = threadPoolExecutor;
        A02 = C3cG.A0T();
        A01 = new DQZ<>(0);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Landroid/content/Context;Ljava/util/List<LX/CLn;>;I)LX/CMB; */
    public static CMB A00(Context context, String str, List list, int i) {
        CMB cmb;
        int i2;
        int length;
        int i3;
        Typeface typefaceA01;
        AbstractC3136BzG.A00("getFontSync");
        try {
            C7523EzA<String, Typeface> c7523EzA = A00;
            Typeface typefaceA02 = c7523EzA.A02(str);
            if (typefaceA02 != null) {
                cmb = new CMB(typefaceA02);
            } else {
                try {
                    C3413CLm c3413CLmA00 = CLs.A00(context, list);
                    if (c3413CLmA00.A00 != 0) {
                        i3 = -2;
                    } else {
                        List<CLt[]> list2 = c3413CLmA00.A01;
                        CLt[] cLtArr = list2.get(0);
                        if (cLtArr == null || (length = cLtArr.length) == 0) {
                            i2 = 1;
                        } else {
                            int i4 = 0;
                            do {
                                i3 = cLtArr[i4].A00;
                                if (i3 != 0) {
                                    i2 = -3;
                                    if (i3 >= 0) {
                                    }
                                } else {
                                    i4++;
                                }
                            } while (i4 < length);
                            if (list2.size() > 1) {
                                AbstractC3136BzG.A00("TypefaceCompat.createFromFontInfoWithFallback");
                                try {
                                    CM1 cm1 = (CM1) CM2.A02;
                                    ContentResolver contentResolver = context.getContentResolver();
                                    typefaceA01 = null;
                                    try {
                                        FontFamily fontFamilyA01 = CM1.A01(contentResolver, cm1, list2.get(0));
                                        if (fontFamilyA01 != null) {
                                            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyA01);
                                            for (int i5 = 1; i5 < list2.size(); i5++) {
                                                FontFamily fontFamilyA012 = CM1.A01(contentResolver, cm1, list2.get(i5));
                                                if (fontFamilyA012 != null) {
                                                    customFallbackBuilder.addCustomFallback(fontFamilyA012);
                                                }
                                            }
                                            typefaceA01 = customFallbackBuilder.setStyle(CM1.A00(fontFamilyA01, i).getStyle()).build();
                                        }
                                    } catch (Exception e) {
                                        Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                                    }
                                    Trace.endSection();
                                } finally {
                                    Trace.endSection();
                                }
                            } else {
                                typefaceA01 = CM2.A01(context, list2.get(0), i);
                            }
                            if (typefaceA01 != null) {
                                c7523EzA.A05(str, typefaceA01);
                                cmb = new CMB(typefaceA01);
                            } else {
                                cmb = new CMB(-3);
                            }
                        }
                        cmb = new CMB(i2);
                    }
                    i2 = i3;
                    cmb = new CMB(i2);
                } catch (PackageManager.NameNotFoundException unused) {
                    cmb = new CMB(-1);
                }
            }
            return cmb;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static String A01(List<CLn> list, int i) {
        StringBuilder sbA0w = C60O.A0w();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sbA0w.append(list.get(i2).A00);
            sbA0w.append("-");
            sbA0w.append(i);
            if (i2 < C60O.A00(list)) {
                sbA0w.append(";");
            }
        }
        return sbA0w.toString();
    }
}
