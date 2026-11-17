package X;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.aura.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.FCg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7729FCg {
    public FGJ A00;
    public final FED<?, FBB, FCT<Object>> A01;
    public final FBB A02;
    public final Object A03;
    public final Executor A04;
    public final AtomicBoolean A05 = BV4.A12(false);
    public final AtomicBoolean A06;
    public final AtomicReference<C7684FAc> A07;
    public final InterfaceC7738FCp A08;
    public final F9b A09;
    public final Object A0A;
    public final List<F97> A0B;
    public final AtomicInteger A0C;
    public final AtomicReference<Map<String, Object>> A0D;
    public final boolean A0E;

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;Lcom/instagram/common/bloks/BloksParseResult;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/FBD;Landroid/util/SparseArray<Ljava/lang/Object;>;)V */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0047  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7729FCg(android.content.Context r14, android.util.SparseArray r15, com.instagram.common.bloks.BloksParseResult r16, X.FBD r17, java.util.Map r18, java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7729FCg.<init>(android.content.Context, android.util.SparseArray, com.instagram.common.bloks.BloksParseResult, X.FBD, java.util.Map, java.util.Map):void");
    }

    public final void A03() {
        this.A05.set(true);
        A00();
        FBB fbb = this.A02;
        HashMap map = (HashMap) fbb.A03(R.id.bk_context_key_animations);
        Iterator itA0x = BV5.A0x((AbstractMap) map.clone());
        while (itA0x.hasNext()) {
            AbstractC7607F5u.A0S(itA0x).cancel();
        }
        if (!map.isEmpty()) {
            map.clear();
        }
        HashMap map2 = (HashMap) fbb.A03(R.id.bk_context_key_timers);
        Iterator itA0x2 = BV5.A0x((AbstractMap) map2.clone());
        while (itA0x2.hasNext()) {
            ((F62) itA0x2.next()).A00();
        }
        if (!map2.isEmpty()) {
            FFI.A01(null, "Timer map is non-empty after cleanup!", null);
            map2.clear();
        }
        ((AbstractMap) fbb.A03(R.id.bk_context_key_videos)).clear();
        ((FOu) fbb.A03(R.id.bk_context_key_insets_listener_delegate)).A00.clear();
        HashSet hashSet = (HashSet) fbb.A03(R.id.bk_context_key_cleanup_callbacks);
        Iterator it = ((Set) hashSet.clone()).iterator();
        while (it.hasNext()) {
            AbstractC7724FCa.A01.remove(((FBG) it.next()).A00);
        }
        hashSet.clear();
        F9b f9bA03 = FBA.A03(fbb);
        f9bA03.A0R = true;
        f9bA03.A03 = null;
        FCA fca = f9bA03.A08;
        if (fca != null) {
            fca.A02.A03.A00();
            FCA fca2 = f9bA03.A08;
            int i = fca2.A00;
            FCH fch = fca2.A03;
            FCA fca3 = new FCA(F9N.A01, fca2.A02.A02, null, fch, new FCF(null, null, null), i);
            f9bA03.A08 = fca3;
            F8I f8i = f9bA03.A05;
            if (f8i != null) {
                AbstractC8162FXe.A02("Finalized EvaluationContext can only be set from the UI Thread");
                f8i.A00 = fca3;
            }
        }
        List<Hgy> list = f9bA03.A0H;
        synchronized (list) {
            list.clear();
        }
        List list2 = f9bA03.A0I;
        synchronized (list2) {
            list2.clear();
        }
        List<FBH> list3 = f9bA03.A0J;
        synchronized (list3) {
            list3.clear();
        }
        C3094By7 c3094By7 = f9bA03.A02;
        if (c3094By7 != null) {
            c3094By7.A00();
        }
        fbb.A06 = true;
        C7739FCq c7739FCq = (C7739FCq) FBB.A01(fbb, R.id.bk_context_key_render_callback_queue);
        if (c7739FCq != null) {
            c7739FCq.A00 = true;
            ((Handler) c7739FCq.A05.getValue()).removeCallbacksAndMessages(c7739FCq.A03);
            Choreographer.getInstance().removeFrameCallback(c7739FCq.A02);
        }
        C7743FCu.A00().removeCallbacksAndMessages(this.A03);
        FED<?, FBB, FCT<Object>> fed = this.A01;
        fed.A0L.A00 = null;
        fed.A04 = null;
        fed.A0K.removeCallbacksAndMessages(null);
        AbstractC7692FAm.A03.incrementAndGet();
    }

    private void A00() {
        FGJ fgj = this.A00;
        if (fgj != null) {
            fgj.setTag(R.id.bk_context_debug, null);
            this.A00.setRenderState(null);
            this.A00 = null;
        }
    }

    public static void A01(C7729FCg c7729FCg) {
        InterfaceC7734FCl fc9;
        synchronized (c7729FCg.A0A) {
            if (!c7729FCg.A05.get()) {
                C7684FAc c7684FAc = c7729FCg.A07.get();
                Map<String, Object> map = c7729FCg.A0D.get();
                if (c7684FAc == null || map == null) {
                    throw C3cG.A0Q("TreeState was null but it should have been initialised by the constructor");
                }
                if (c7729FCg.A0E) {
                    AtomicInteger atomicInteger = c7729FCg.A0C;
                    atomicInteger.incrementAndGet();
                    fc9 = new FCB(c7729FCg.A02, c7684FAc.A00, c7684FAc.A02, map, c7729FCg.A06, atomicInteger);
                } else {
                    FBB fbb = c7729FCg.A02;
                    fc9 = new FC9(fbb, new C7707FBf(fbb, c7684FAc, map));
                }
                FED.A01(fc9, c7729FCg.A01, true);
            }
        }
    }

    public final FBB A02() {
        if (this.A05.get()) {
            FFI.A01(null, "Trying to access a BloksContext form a destroyed BloksHostingComponent", null);
        }
        return this.A02;
    }

    public final void A04() {
        if (this.A05.get() && this.A00 == null) {
            FFI.A01(null, "Trying to detach a view from a destroyed BloksHostingComponent", null);
        } else {
            A00();
        }
    }

    public final void A05(FGJ fgj) {
        AtomicBoolean atomicBoolean = this.A05;
        if (atomicBoolean.get()) {
            FFI.A01(null, "Trying to attach a view to a destroyed BloksHostingComponent", null);
            return;
        }
        FGJ fgj2 = this.A00;
        if (fgj2 != null && fgj2 != fgj) {
            if (atomicBoolean.get() && this.A00 == null) {
                FFI.A01(null, "Trying to detach a view from a destroyed BloksHostingComponent", null);
            } else {
                A00();
            }
        }
        this.A00 = fgj;
        fgj.setRenderState(this.A01);
        this.A00.requestLayout();
        C6979Edd.A00();
        this.A02.A01.get(R.id.bloks_viewpoint_controller);
    }
}
