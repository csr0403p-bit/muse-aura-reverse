package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.facebook.aura.R;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class FN2 implements FOG {
    public final Context A02;
    public final SparseArray<Object> A03;
    public final FBD A05;
    public final Huk A06;
    public final Map<String, Object> A07;
    public final Map<String, Object> A08;
    public final FNM A04 = new FNM(Looper.getMainLooper(), new FN7(this));
    public final AtomicBoolean A09 = BV4.A12(false);
    public final AtomicReference<FOH> A0A = new AtomicReference<>();
    public C7729FCg A00 = null;
    public volatile boolean A0C = false;
    public volatile boolean A0B = false;
    public FGJ A01 = null;

    public static void A00(FN2 fn2, int i) {
        FOH foh = fn2.A0A.get();
        if (foh != null) {
            foh.onRenderSurface(i);
        }
    }

    public static void A01(final FN2 fn2, Hsv hsv, int i, final int i2) {
        A00(fn2, 10);
        Runnable runnable = new Runnable() { // from class: X.FNa
            public static final String __redex_internal_original_name = "BloksSurface$$ExternalSyntheticLambda0";

            @Override // java.lang.Runnable
            public final void run() {
                FN2 fn22 = this.A01;
                int i3 = i2;
                if (i3 != -1) {
                    FN2.A00(fn22, i3);
                }
            }
        };
        Map<String, Object> map = fn2.A08;
        map.putAll(hsv.A02);
        Context context = fn2.A02;
        BloksParseResult bloksParseResult = hsv.A00;
        FBD fbd = fn2.A05;
        new SparseArray();
        Map<String, Object> map2 = fn2.A07;
        SparseArray<Object> sparseArrayClone = fn2.A03.clone();
        sparseArrayClone.put(R.id.bloks_surface_on_data_rendered_runnable, runnable);
        context.getClass();
        fbd.getClass();
        FNV fnv = new FNV(new C7729FCg(context, sparseArrayClone, bloksParseResult, fbd, map, map2), i);
        FNM fnm = fn2.A04;
        Message messageObtainMessage = fnm.obtainMessage(1, fnv);
        C7384Etj.A0Y(messageObtainMessage, 0);
        if (C7384Etj.areEqual(Looper.myLooper(), fnm.getLooper())) {
            fnm.A00.handleMessage(messageObtainMessage);
        } else {
            fnm.sendMessageAtFrontOfQueue(messageObtainMessage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    @Override // X.FOG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResponse(X.Huk r6) {
        /*
            r5 = this;
            boolean r0 = r5.A0B
            if (r0 != 0) goto L36
            X.HoB r0 = r6.A00
            int r4 = r0.A00
            r2 = 4
            if (r4 == r2) goto L36
            r0 = 5
            if (r4 == r0) goto L36
            r1 = 3
            r3 = 1
            r0 = 0
            if (r4 != r1) goto L15
            r0 = 1
            r2 = 5
        L15:
            A00(r5, r2)
            if (r0 != 0) goto L36
            r0 = 6
            A00(r5, r0)
            if (r4 == r3) goto L24
            r0 = 2
            r2 = -1
            if (r4 != r0) goto L26
        L24:
            r2 = 9
        L26:
            boolean r0 = r6 instanceof X.Hsv
            r1 = 7
            if (r0 == 0) goto L36
            X.Hsv r6 = (X.Hsv) r6
            boolean r0 = r5.A0C
            if (r0 != 0) goto L36
            A01(r5, r6, r1, r2)
            r5.A0C = r3
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FN2.onResponse(X.Huk):void");
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/FBD;Landroid/util/SparseArray<Ljava/lang/Object;>;Lcom/instagram/common/bloks/BloksParseResult;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V */
    public FN2(Context context, SparseArray sparseArray, BloksParseResult bloksParseResult, FBD fbd, Map map, Map map2) {
        this.A05 = fbd;
        this.A02 = context;
        this.A03 = sparseArray;
        this.A06 = bloksParseResult != null ? new Hsv(bloksParseResult, HoB.A02) : null;
        this.A08 = map;
        this.A07 = map2;
    }
}
