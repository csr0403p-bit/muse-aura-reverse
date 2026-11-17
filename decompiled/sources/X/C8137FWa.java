package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.FWa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8137FWa {
    public static C8137FWa A05;
    public static final PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public static final HpY A07 = new HpY(6);
    public TypedValue A00;
    public InterfaceC8143FWh A01;
    public WeakHashMap<Context, Ao1<ColorStateList>> A02;
    public boolean A03;
    public final WeakHashMap<Context, C1685AoO<WeakReference<Drawable.ConstantState>>> A04 = new WeakHashMap<>(0);

    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.content.res.ColorStateList A02(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8137FWa.A02(android.content.Context, int):android.content.res.ColorStateList");
    }

    public final synchronized Drawable A03(Context context, int i) {
        return A04(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x022a, code lost:
    
        if (r14 == com.facebook.aura.R.drawable.abc_dialog_material_background) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3 A[Catch: all -> 0x026c, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0011, B:9:0x0015, B:128:0x0262, B:129:0x026b, B:11:0x0021, B:13:0x0025, B:14:0x002b, B:24:0x0066, B:29:0x0071, B:50:0x012b, B:32:0x008f, B:34:0x00ad, B:36:0x00b3, B:38:0x00b9, B:39:0x00c4, B:41:0x00cd, B:43:0x00d3, B:45:0x00d9, B:46:0x00f5, B:47:0x010c, B:59:0x0151, B:61:0x0157, B:63:0x015d, B:67:0x016d, B:68:0x0174, B:76:0x01b4, B:77:0x01d9, B:75:0x018b, B:79:0x01e3, B:81:0x01ee, B:84:0x01f3, B:110:0x023a, B:111:0x0244, B:113:0x0249, B:114:0x024a, B:116:0x024f, B:90:0x01ff, B:92:0x0205, B:95:0x020a, B:97:0x0211, B:99:0x0217, B:101:0x021b, B:102:0x021e, B:109:0x0230, B:123:0x025b), top: B:137:0x0001 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.graphics.drawable.Drawable, android.graphics.drawable.LayerDrawable] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable A04(android.content.Context r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8137FWa.A04(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i) {
        PorterDuffColorFilter porterDuffColorFilter;
        HpY hpY = A07;
        int i2 = (i + 31) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) hpY.A02(Integer.valueOf(AnonymousClass005.A0G(mode, i2)));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            hpY.A05(Integer.valueOf(AnonymousClass005.A0G(mode, i2)), porterDuffColorFilter);
        }
        return porterDuffColorFilter;
    }

    public static void A01(Drawable drawable, C8142FWg c8142FWg, int[] iArr) {
        ColorStateList colorStateList;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        if (c8142FWg.A02) {
            colorStateList = c8142FWg.A00;
        } else {
            if (!c8142FWg.A03) {
                drawable.clearColorFilter();
                return;
            }
            colorStateList = null;
        }
        PorterDuff.Mode mode = c8142FWg.A03 ? c8142FWg.A01 : A06;
        drawable.setColorFilter((colorStateList == null || mode == null) ? null : A00(mode, colorStateList.getColorForState(iArr, 0)));
    }
}
