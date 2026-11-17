package com.facebook.aura.toast;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C78N;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public abstract class HatchGlobalToastKt {

    /* renamed from: com.facebook.aura.toast.HatchGlobalToastKt$HatchGlobalToast$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGlobalToastKt.HatchGlobalToast(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.toast.HatchGlobalToastKt$HatchSessionlessToast$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchGlobalToastKt.HatchSessionlessToast(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.toast.HatchGlobalToastKt", f = "HatchGlobalToast.kt", l = {53}, m = "collectToasts", v = 2)
    /* renamed from: com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGlobalToastKt.collectToasts(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.toast.HatchGlobalToastKt", f = "HatchGlobalToast.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "showAndAwaitDismiss", v = 2)
    /* renamed from: com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$1, reason: invalid class name and case insensitive filesystem */
    public final class C142451 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGlobalToastKt.showAndAwaitDismiss(null, null, null, this);
        }

        public C142451(HtJ<? super C142451> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectToasts(final android.view.View r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.toast.HatchGlobalToastKt.AnonymousClass1
            if (r0 == 0) goto L22
            r5 = r7
            com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$1 r5 = (com.facebook.aura.toast.HatchGlobalToastKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3e
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$1 r5 = new com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$1
            r5.<init>(r7)
            goto L12
        L28:
            X.Hwg.A00(r1)
            X.22I<com.facebook.aura.vds.toast.AuraToast$ToastArgs> r2 = com.facebook.aura.toast.api.ToastApi.toasts
            com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$2 r1 = new com.facebook.aura.toast.HatchGlobalToastKt$collectToasts$2
            r1.<init>()
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L41
            return r4
        L3e:
            X.Hwg.A00(r1)
        L41:
            kotlin.KotlinNothingValueException r0 = X.C3cG.A0p()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.toast.HatchGlobalToastKt.collectToasts(android.view.View, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object showAndAwaitDismiss(com.facebook.aura.vds.toast.AuraToast.Companion r7, android.view.View r8, com.facebook.aura.vds.toast.AuraToast.ToastArgs r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.toast.HatchGlobalToastKt.C142451
            if (r0 == 0) goto L26
            r6 = r10
            com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$1 r6 = (com.facebook.aura.toast.HatchGlobalToastKt.C142451) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L65
            java.lang.Object r3 = r6.L$4
            com.facebook.aura.vds.toast.AuraToast r3 = (com.facebook.aura.vds.toast.AuraToast) r3
            java.lang.Object r2 = r6.L$3
            X.HoC r2 = (X.HoC) r2
            goto L2c
        L26:
            com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$1 r6 = new com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$1
            r6.<init>(r10)
            goto L12
        L2c:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L5a
            goto L6a
        L30:
            X.Hwg.A00(r1)
            r1 = 0
            X.GAt r2 = new X.GAt
            r2.<init>(r1)
            com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$auraToast$1 r0 = new com.facebook.aura.toast.HatchGlobalToastKt$showAndAwaitDismiss$auraToast$1
            r0.<init>(r2)
            com.facebook.aura.vds.toast.AuraToast r3 = r7.make(r8, r9, r0)
            if (r3 == 0) goto L73
            r3.show()     // Catch: java.lang.Throwable -> L5a
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L5a
            r6.L$1 = r1     // Catch: java.lang.Throwable -> L5a
            r6.L$2 = r1     // Catch: java.lang.Throwable -> L5a
            r6.L$3 = r2     // Catch: java.lang.Throwable -> L5a
            r6.L$4 = r3     // Catch: java.lang.Throwable -> L5a
            r6.label = r4     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r0 = r2.A0E(r6)     // Catch: java.lang.Throwable -> L5a
            if (r0 != r5) goto L6a
            return r5
        L5a:
            r1 = move-exception
            boolean r0 = r2.AOG()
            if (r0 != 0) goto L69
            r3.dismiss()
            throw r1
        L65:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
        L69:
            throw r1
        L6a:
            boolean r0 = r2.AOG()
            if (r0 != 0) goto L73
            r3.dismiss()
        L73:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.toast.HatchGlobalToastKt.showAndAwaitDismiss(com.facebook.aura.vds.toast.AuraToast$Companion, android.view.View, com.facebook.aura.vds.toast.AuraToast$ToastArgs, X.HtJ):java.lang.Object");
    }

    public static final void HatchGlobalToast(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -300878733, i), bfm, i)) {
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Context applicationContext = AnonymousClass002.A0H(bfm).getApplicationContext();
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = C3cG.A0T();
                bfm.Ai0(objAaT);
            }
            boolean zA1S = AnonymousClass005.A1S(bfm, abstractC3358CGzA0g, applicationContext, objAaT);
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == obj) {
                objAaT2 = new HatchGlobalToastKt$HatchGlobalToast$1$1(abstractC3358CGzA0g, applicationContext, objAaT);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A19(bfm, objAaT2, abstractC3358CGzA0g, applicationContext);
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            boolean zA1V = AnonymousClass005.A1V(bfm, applicationContext, objAaT, view, bfm.A67(abstractC3358CGzA0g));
            Object objAaT3 = bfm.AaT();
            if (zA1V || objAaT3 == obj) {
                objAaT3 = new HatchGlobalToastKt$HatchGlobalToast$2$1(abstractC3358CGzA0g, applicationContext, objAaT, view, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A1A(bfm, objAaT3, abstractC3358CGzA0g, view);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    public static final void HatchSessionlessToast(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 258285403, i), bfm, i)) {
            View viewA0J = AnonymousClass001.A0J(bfm);
            boolean zA67 = bfm.A67(viewA0J);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGlobalToastKt$HatchSessionlessToast$1$1(viewA0J, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, viewA0J);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
