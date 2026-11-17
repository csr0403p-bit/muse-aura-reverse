package X;

import android.text.NoCopySpan;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebView;
import com.facebook.aura.R;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.EnG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7344EnG {
    public static boolean A05;
    public static C7344EnG A06;
    public Method A00;
    public Method A01;
    public static final String[] A08 = {"RCTextView", "GlyphView", "PreparedLayoutTextView", "WDSChip"};
    public static final Class<?>[] A07 = {TextWatcher.class, MetaKeyKeyListener.class, KeyListener.class, NoCopySpan.class, TransformationMethod.class};
    public static final Method[] A09 = new Method[4];
    public final C7348EnL A03 = new C7348EnL();
    public final BZ1 A02 = new BZ1();
    public final C7347EnK A04 = new C7347EnK(this);

    public static boolean A06(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }

    public static WebView A00(View view) {
        if (view instanceof WebView) {
            return (WebView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            WebView webViewA00 = A00(viewGroup.getChildAt(i));
            if (webViewA00 != null) {
                return webViewA00;
            }
        }
        return null;
    }

    public static String A01(CharSequence charSequence, int i, boolean z) {
        if (charSequence != null) {
            boolean z2 = true;
            if (charSequence.length() >= 1) {
                if (charSequence.length() > i) {
                    charSequence = charSequence.subSequence(0, i);
                } else {
                    z2 = false;
                }
                String strReplace = charSequence.toString().replace(" \n", InviteCodeScratcherKt.CODE_SEPARATOR).replace(PairsDiscretionDocument.TERMINATOR, InviteCodeScratcherKt.CODE_SEPARATOR);
                String strReplace2 = z ? strReplace.replace("\"", "\\\"") : strReplace.replace("\"", "");
                return z2 ? FGI.A0M(strReplace2, "...") : strReplace2;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(android.view.View r9, java.io.PrintWriter r10) {
        /*
            java.lang.String r5 = " "
            r10.print(r5)
            int r2 = r9.getVisibility()
            java.lang.String r8 = "V"
            java.lang.String r1 = "."
            if (r2 == 0) goto Lc9
            r0 = 4
            if (r2 == r0) goto Lc2
            r0 = 8
            if (r2 == r0) goto Lbf
            r10.print(r1)
        L19:
            boolean r2 = r9.isFocusable()
            java.lang.String r4 = "F"
            r0 = r1
            if (r2 == 0) goto L23
            r0 = r4
        L23:
            r10.print(r0)
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "E"
        L2e:
            r10.print(r0)
            r10.print(r1)
            boolean r0 = r9.isHorizontalScrollBarEnabled()
            r7 = 1
            r6 = -1
            java.lang.String r2 = "H"
            if (r0 != 0) goto L4b
            boolean r0 = r9.canScrollHorizontally(r6)
            if (r0 != 0) goto L4b
            boolean r3 = r9.canScrollHorizontally(r7)
            r0 = r1
            if (r3 == 0) goto L4c
        L4b:
            r0 = r2
        L4c:
            r10.print(r0)
            boolean r0 = r9.isVerticalScrollBarEnabled()
            if (r0 != 0) goto L62
            boolean r0 = r9.canScrollVertically(r6)
            if (r0 != 0) goto L62
            boolean r0 = r9.canScrollVertically(r7)
            if (r0 != 0) goto L62
            r8 = r1
        L62:
            r10.print(r8)
            boolean r0 = r9.isClickable()
            if (r0 == 0) goto Lba
            java.lang.String r0 = "C"
        L6d:
            r10.print(r0)
            boolean r0 = r9.isLongClickable()
            if (r0 == 0) goto Lb8
            java.lang.String r0 = "L"
        L78:
            r10.print(r0)
            r10.print(r5)
            boolean r0 = r9.isFocused()
            if (r0 != 0) goto L85
            r4 = r1
        L85:
            r10.print(r4)
            boolean r0 = r9.isSelected()
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "S"
        L90:
            r10.print(r0)
            boolean r0 = r9.isHovered()
            if (r0 != 0) goto L9a
            r2 = r1
        L9a:
            r10.print(r2)
            boolean r0 = r9.isActivated()
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "A"
        La5:
            r10.print(r0)
            boolean r0 = r9.isDirty()
            if (r0 == 0) goto Lb0
            java.lang.String r1 = "D"
        Lb0:
            r10.print(r1)
            return
        Lb4:
            r0 = r1
            goto La5
        Lb6:
            r0 = r1
            goto L90
        Lb8:
            r0 = r1
            goto L78
        Lba:
            r0 = r1
            goto L6d
        Lbc:
            r0 = r1
            goto L2e
        Lbf:
            java.lang.String r0 = "G"
            goto Lc4
        Lc2:
            java.lang.String r0 = "I"
        Lc4:
            r10.print(r0)
            goto L19
        Lc9:
            r10.print(r8)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7344EnG.A03(android.view.View, java.io.PrintWriter):void");
    }

    public static boolean A05(PrintWriter printWriter, String str, String[] strArr) throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, SecurityException, IllegalArgumentException {
        int length;
        StringBuilder sbA0g;
        String string;
        Field field;
        if (strArr != null && (length = strArr.length) > 0) {
            String str2 = strArr[0];
            if ("e2e".equals(str2)) {
                C7344EnG c7344EnG = A06;
                if (c7344EnG == null) {
                    c7344EnG = new C7344EnG();
                    A06 = c7344EnG;
                }
                printWriter.println("JEST_E2E_DUMPSYS_HELPER");
                printWriter.println(FGI.A0M("ENDPOINT ", C5V.A04 == null ? "" : C5V.A04.A02));
                printWriter.print(str);
                printWriter.println("Top Level Window View Hierarchy:");
                boolean zA06 = A06("all-roots", strArr);
                boolean zA062 = A06("top-root", strArr);
                boolean zA063 = A06("webview", strArr);
                boolean zA064 = A06("jpc", strArr);
                boolean zA065 = A06("spannables", strArr);
                boolean zA066 = A06("ignore-cd-for-text", strArr);
                A05 = A06("escape-quotes", strArr);
                try {
                    C7348EnL c7348EnL = c7344EnG.A03;
                    if (!c7348EnL.A03) {
                        c7348EnL.A03 = true;
                        try {
                            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                            c7348EnL.A00 = BV5.A0d("getInstance", cls);
                            Field declaredField = cls.getDeclaredField("mViews");
                            c7348EnL.A02 = declaredField;
                            if (declaredField != null) {
                                declaredField.setAccessible(true);
                            }
                            Field declaredField2 = cls.getDeclaredField("mParams");
                            c7348EnL.A01 = declaredField2;
                            if (declaredField2 != null) {
                                declaredField2.setAccessible(true);
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException unused) {
                        } catch (InvocationTargetException e) {
                            e.getCause();
                        }
                    }
                    Object obj = c7348EnL.A00;
                    if (obj != null && (field = c7348EnL.A02) != null && c7348EnL.A01 != null) {
                        try {
                            Object obj2 = field.get(obj);
                            List list = obj2 instanceof List ? (List) obj2 : null;
                            Field field2 = c7348EnL.A01;
                            Object obj3 = field2 != null ? field2.get(c7348EnL.A00) : null;
                            List list2 = obj3 instanceof List ? (List) obj3 : null;
                            ArrayList arrayListA0h = C3cG.A0h();
                            if (list == null) {
                                throw C3cG.A0Q("Required value was null.");
                            }
                            if (list2 == null) {
                                throw C3cG.A0Q("Required value was null.");
                            }
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                arrayListA0h.add(new C7346EnJ((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
                            }
                            if (!arrayListA0h.isEmpty()) {
                                Collections.reverse(arrayListA0h);
                                Iterator it = arrayListA0h.iterator();
                                WindowManager.LayoutParams layoutParams = null;
                                while (it.hasNext()) {
                                    C7346EnJ c7346EnJ = (C7346EnJ) it.next();
                                    View view = c7346EnJ.A00;
                                    if (view.getVisibility() == 0) {
                                        if (!zA06 && layoutParams != null && Math.abs(c7346EnJ.A01.type - layoutParams.type) != 1) {
                                            break;
                                        }
                                        c7344EnG.A04(view, printWriter, FGI.A0M(str, "  "), 0, 0, zA063, zA064, zA065, zA066);
                                        layoutParams = c7346EnJ.A01;
                                        if (zA062) {
                                            break;
                                        }
                                    }
                                }
                                BZ1 bz1 = c7344EnG.A02;
                                try {
                                    for (EnH enH : bz1.A01) {
                                        Map<String, String> map = bz1.A00;
                                        String str3 = enH.A04;
                                        String strA0p = C60O.A0p(str3, map);
                                        if (strA0p != null) {
                                            printWriter.print("WebView HTML for ");
                                            printWriter.print(enH);
                                            printWriter.println(":");
                                            String strReplace = strA0p.replace("\\u003C", "<").replace("\\n", "").replace("\\\"", "\"");
                                            printWriter.println(String.format("<html id=\"%s\" data-rect=\"%d,%d,%d,%d\">%s</html>", str3, Integer.valueOf(enH.A01), Integer.valueOf(enH.A02), Integer.valueOf(enH.A03), Integer.valueOf(enH.A00), strReplace.substring(1, strReplace.length() - 1)));
                                        }
                                    }
                                } catch (Exception unused2) {
                                }
                                bz1.A01.clear();
                                bz1.A00.clear();
                                return true;
                            }
                        } catch (IllegalAccessException | RuntimeException unused3) {
                        }
                    }
                } catch (Exception e2) {
                    sbA0g = C60O.A0x("Failure in view hierarchy dump: ");
                    string = e2.getMessage();
                }
                return true;
            }
            if ("uiqr".equals(str2)) {
                if (length < 2 || !"extract-uiqr-view-hierarchy".equals(strArr[1])) {
                    sbA0g = C3cG.A0g(str);
                    sbA0g.append("Unknown UIQR command: ");
                    string = length > 1 ? strArr[1] : "none";
                } else {
                    printWriter.println(FGI.A0M(str, "UIQR Extract View Hierarchy command received"));
                    printWriter.println(FGI.A0U(str, "Arguments: ", Arrays.toString(strArr)));
                    try {
                        printWriter.println(FGI.A0M(str, "Starting UIQR view hierarchy extraction for current screen"));
                        printWriter.println(FGI.A0M(str, "UIQR extractor not registered. This likely means the UIQR module is not initialized or not included in this build."));
                        return true;
                    } catch (Exception e3) {
                        printWriter.println(FGI.A0U(str, "Error extracting view hierarchy: ", e3.getMessage()));
                        sbA0g = C3cG.A0g(str);
                        sbA0g.append("Stack trace: ");
                        string = Arrays.toString(e3.getStackTrace());
                    }
                }
            }
            printWriter.println(AnonymousClass001.A0v(string, sbA0g));
            return true;
        }
        return false;
    }

    public static void A02(View view, PrintWriter printWriter) {
        Object tag = view.getTag(R.id.testing_id_view_tag_key);
        if (tag == null) {
            tag = view.getTag();
        }
        if (tag instanceof String) {
            String str = (String) tag;
            if (str.length() > 0) {
                printWriter.print(" app:tag/");
                printWriter.print(str.replace(' ', '_'));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8 A[Catch: Exception -> 0x00cc, TRY_LEAVE, TryCatch #0 {Exception -> 0x00cc, blocks: (B:7:0x0077, B:9:0x007e, B:12:0x0092, B:18:0x009f, B:21:0x00a9, B:22:0x00c8), top: B:166:0x0077 }] */
    /* JADX WARN: Type inference failed for: r46v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.view.View r45, java.io.PrintWriter r46, java.lang.String r47, int r48, int r49, boolean r50, boolean r51, boolean r52, boolean r53) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.ClassNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7344EnG.A04(android.view.View, java.io.PrintWriter, java.lang.String, int, int, boolean, boolean, boolean, boolean):void");
    }
}
