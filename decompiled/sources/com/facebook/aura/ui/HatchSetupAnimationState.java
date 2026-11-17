package com.facebook.aura.ui;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HtJ;
import X.HwN;
import X.HzP;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchSetupAnimationState {
    public static final int $stable = 0;
    public static final BLG<Boolean> _isFinishing;
    public static final BLG<Boolean> _isHostRendering;
    public static final BLG<Boolean> _isRequested;
    public static final BLG<Boolean> _isSuppressed;
    public static final BLG<Integer> _logoTopPx;
    public static final C1BN<Boolean> isFinishing;
    public static final C1BN<Boolean> isHostRendering;
    public static final C1BN<Boolean> isRequested;
    public static final C1BN<Boolean> isSuppressed;
    public static final C1BN<Integer> logoTopPx;
    public static int requestGeneration;
    public static final Set<Object> suppressors;
    public static final HatchSetupAnimationState INSTANCE = new HatchSetupAnimationState();
    public static final Set<Object> tokens = new LinkedHashSet();

    @DebugMetadata(c = "com.facebook.aura.ui.HatchSetupAnimationState", f = "HatchSetupAnimationHost.kt", l = {121}, m = "finishAfterHold", v = 2)
    /* renamed from: com.facebook.aura.ui.HatchSetupAnimationState$finishAfterHold$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchSetupAnimationState.this.finishAfterHold(this);
        }
    }

    private final synchronized void commitFinish(int i) {
        if (i == requestGeneration) {
            AnonymousClass004.A1D(true, _isFinishing);
        }
    }

    private final synchronized int currentGeneration() {
        return requestGeneration;
    }

    public final synchronized Object acquire() {
        Object obj;
        obj = new Object();
        tokens.add(obj);
        requestGeneration++;
        C9286GCn.A00(null, true, (C9286GCn) _isRequested);
        AnonymousClass003.A14(_isFinishing, false);
        return obj;
    }

    public final synchronized void cancelFinish$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        AnonymousClass004.A1D(false, _isFinishing);
    }

    public final synchronized void finish() {
        AnonymousClass004.A1D(true, _isFinishing);
    }

    public final synchronized void release(Object obj) {
        C7384Etj.A0Y(obj, 0);
        tokens.remove(obj);
        AnonymousClass004.A1D(!r0.isEmpty(), _isRequested);
    }

    public final synchronized void releaseSuppression(Object obj) {
        C7384Etj.A0Y(obj, 0);
        suppressors.remove(obj);
        AnonymousClass004.A1D(!r0.isEmpty(), _isSuppressed);
    }

    public final synchronized void reset$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        tokens.clear();
        requestGeneration++;
        BLG<Boolean> blg = _isRequested;
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn.A00(null, boolA0h, (C9286GCn) blg);
        AnonymousClass001.A1E(_isHostRendering, null, boolA0h);
        AnonymousClass001.A1E(_isFinishing, null, boolA0h);
        _logoTopPx.Af8(null);
    }

    public final synchronized void setHostRendering$fbandroid_express_aura_java_com_facebook_aura_ui_ui(boolean z) {
        AnonymousClass004.A1D(z, _isHostRendering);
    }

    public final synchronized Object suppress() {
        Object obj;
        obj = new Object();
        suppressors.add(obj);
        AnonymousClass004.A1D(true, _isSuppressed);
        return obj;
    }

    static {
        Boolean boolA0h = AnonymousClass001.A0h();
        C9286GCn c9286GCn = new C9286GCn(boolA0h);
        _isRequested = c9286GCn;
        isRequested = new C3Pi(null, c9286GCn);
        C9286GCn c9286GCn2 = new C9286GCn(boolA0h);
        _isHostRendering = c9286GCn2;
        isHostRendering = new C3Pi(null, c9286GCn2);
        C9286GCn c9286GCn3 = new C9286GCn(boolA0h);
        _isFinishing = c9286GCn3;
        isFinishing = new C3Pi(null, c9286GCn3);
        suppressors = new LinkedHashSet();
        C9286GCn c9286GCn4 = new C9286GCn(boolA0h);
        _isSuppressed = c9286GCn4;
        isSuppressed = new C3Pi(null, c9286GCn4);
        C9286GCn c9286GCn5 = new C9286GCn(HwN.A01);
        _logoTopPx = c9286GCn5;
        logoTopPx = new C3Pi(null, c9286GCn5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finishAfterHold(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.ui.HatchSetupAnimationState.AnonymousClass1
            if (r0 == 0) goto L3c
            r5 = r7
            com.facebook.aura.ui.HatchSetupAnimationState$finishAfterHold$1 r5 = (com.facebook.aura.ui.HatchSetupAnimationState.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 != r0) goto L42
            int r2 = r5.I$0
            X.Hwg.A00(r4)
        L22:
            r6.commitFinish(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L28:
            X.Hwg.A00(r4)
            int r2 = r6.currentGeneration()
            r5.I$0 = r2
            r5.label = r0
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C7Bq.A01(r0, r5)
            if (r0 != r3) goto L22
            return r3
        L3c:
            com.facebook.aura.ui.HatchSetupAnimationState$finishAfterHold$1 r5 = new com.facebook.aura.ui.HatchSetupAnimationState$finishAfterHold$1
            r5.<init>(r7)
            goto L12
        L42:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchSetupAnimationState.finishAfterHold(X.HtJ):java.lang.Object");
    }

    public final C1BN<Integer> getLogoTopPx$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return logoTopPx;
    }

    public final C1BN<Boolean> isFinishing$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return isFinishing;
    }

    public final C1BN<Boolean> isHostRendering$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return isHostRendering;
    }

    public final C1BN<Boolean> isRequested$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return isRequested;
    }

    public final C1BN<Boolean> isSuppressed$fbandroid_express_aura_java_com_facebook_aura_ui_ui() {
        return isSuppressed;
    }

    public final void setLogoTopPx(int i) {
        AnonymousClass002.A1I(_logoTopPx, Integer.valueOf(i));
    }
}
