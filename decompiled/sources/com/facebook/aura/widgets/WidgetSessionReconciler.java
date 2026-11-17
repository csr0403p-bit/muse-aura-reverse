package com.facebook.aura.widgets;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C60P;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class WidgetSessionReconciler {
    public static final int $stable = 0;
    public static final WidgetSessionReconciler INSTANCE = new WidgetSessionReconciler();

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler", f = "WidgetSessionReconciler.kt", l = {34, 36, 42}, m = "invalidateForSignedOut", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionReconciler.this.invalidateForSignedOut(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$3", f = "WidgetSessionReconciler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, HtJ<? super AnonymousClass3> htJ) {
            super(1, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass3(this.$context, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return new AnonymousClass3(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Context contextA02;
            Iterator<HomeScreenWidget> it;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                List<HomeScreenWidget> list = HomeScreenWidgetKt.homeScreenWidgets;
                contextA02 = this.$context;
                it = list.iterator();
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                it = (Iterator) this.L$2;
                contextA02 = C60P.A02(this.L$1, obj);
            }
            while (it.hasNext()) {
                HomeScreenWidget next = it.next();
                String strA0M = FGI.A0M("sign out ", next.getKey());
                WidgetSessionReconciler$invalidateForSignedOut$3$1$1 widgetSessionReconciler$invalidateForSignedOut$3$1$1 = new WidgetSessionReconciler$invalidateForSignedOut$3$1$1(next, contextA02, null);
                this.L$0 = null;
                this.L$1 = contextA02;
                this.L$2 = it;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                if (HomeScreenWidgetKt.runIsolated(WidgetSessionReconcilerKt.TAG, strA0M, widgetSessionReconciler$invalidateForSignedOut$3$1$1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler", f = "WidgetSessionReconciler.kt", l = {53}, m = "invalidateIfVmChanged", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$1, reason: invalid class name and case insensitive filesystem */
    public final class C144331 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C144331(HtJ<? super C144331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionReconciler.this.invalidateIfVmChanged(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler", f = "WidgetSessionReconciler.kt", l = {15, 16, 17, 18}, m = "reconcile", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconciler$reconcile$1, reason: invalid class name and case insensitive filesystem */
    public final class C144341 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C144341(HtJ<? super C144341> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionReconciler.this.reconcile(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.widgets.WidgetSessionReconciler", f = "WidgetSessionReconciler.kt", l = {25, 26, 28}, m = "reconcileAfterSignOut", v = 2)
    /* renamed from: com.facebook.aura.widgets.WidgetSessionReconciler$reconcileAfterSignOut$1, reason: invalid class name and case insensitive filesystem */
    public final class C144351 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C144351(HtJ<? super C144351> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetSessionReconciler.this.reconcileAfterSignOut(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invalidateForSignedOut(android.content.Context r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.widgets.WidgetSessionReconciler.AnonymousClass1
            if (r0 == 0) goto Lcc
            r5 = r13
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$1 r5 = (com.facebook.aura.widgets.WidgetSessionReconciler.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcc
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r6 = "WidgetSessionReconciler"
            r4 = 3
            r9 = 2
            r11 = 1
            r3 = 0
            if (r0 == 0) goto L60
            if (r0 == r11) goto L6a
            if (r0 == r9) goto Lbe
            if (r0 != r4) goto Ld6
            java.lang.Object r9 = r5.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r0 = r5.L$0
            android.content.Context r12 = X.C60P.A02(r0, r1)
        L30:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Ld3
            java.lang.Object r8 = r9.next()
            com.facebook.aura.widgets.HomeScreenWidget r8 = (com.facebook.aura.widgets.HomeScreenWidget) r8
            java.lang.String r2 = r8.getKey()
            java.lang.String r1 = "delete "
            java.lang.String r0 = " files"
            java.lang.String r1 = X.FGI.A0U(r1, r2, r0)
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$4$1 r0 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$4$1
            r0.<init>(r8, r12, r3)
            r5.L$0 = r12
            r5.L$1 = r3
            r5.L$2 = r9
            r5.L$3 = r3
            r5.L$4 = r3
            r5.label = r4
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r6, r1, r0, r5)
            if (r0 != r7) goto L30
            return r7
        L60:
            X.Hwg.A00(r1)
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.Iterator r10 = r0.iterator()
            goto L74
        L6a:
            java.lang.Object r10 = r5.L$2
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r0 = r5.L$0
            android.content.Context r12 = X.C60P.A02(r0, r1)
        L74:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r8 = r10.next()
            com.facebook.aura.widgets.HomeScreenWidget r8 = (com.facebook.aura.widgets.HomeScreenWidget) r8
            java.lang.String r2 = r8.getKey()
            java.lang.String r1 = "cancel "
            java.lang.String r0 = " work"
            java.lang.String r1 = X.FGI.A0U(r1, r2, r0)
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$2$1 r0 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$2$1
            r0.<init>(r8, r12, r3)
            r5.L$0 = r12
            r5.L$1 = r3
            r5.L$2 = r10
            r5.L$3 = r3
            r5.L$4 = r3
            r5.label = r11
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r6, r1, r0, r5)
            if (r0 != r7) goto L74
            return r7
        La4:
            com.facebook.aura.widgets.WidgetContentLock r1 = com.facebook.aura.widgets.WidgetContentLock.INSTANCE
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$3 r0 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$3
            r0.<init>(r12, r3)
            r5.L$0 = r12
            r5.L$1 = r3
            r5.L$2 = r3
            r5.L$3 = r3
            r5.L$4 = r3
            r5.label = r9
            java.lang.Object r0 = r1.exclusive(r0, r5)
            if (r0 != r7) goto Lc4
            return r7
        Lbe:
            java.lang.Object r0 = r5.L$0
            android.content.Context r12 = X.C60P.A02(r0, r1)
        Lc4:
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.Iterator r9 = r0.iterator()
            goto L30
        Lcc:
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$1 r5 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateForSignedOut$1
            r5.<init>(r13)
            goto L12
        Ld3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        Ld6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionReconciler.invalidateForSignedOut(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invalidateIfVmChanged(android.content.Context r8, X.AbstractC3358CGz r9, boolean r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.WidgetSessionReconciler.C144331
            if (r0 == 0) goto L72
            r2 = r11
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$1 r2 = (com.facebook.aura.widgets.WidgetSessionReconciler.C144331) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L72
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r1 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r3 = 1
            if (r0 == 0) goto L64
            if (r0 != r3) goto L7b
            boolean r10 = r2.Z$0
            java.lang.Object r5 = r2.L$4
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r9 = r2.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r2.L$0
            android.content.Context r8 = X.C60P.A02(r0, r1)
        L2d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L78
            java.lang.Object r7 = r5.next()
            com.facebook.aura.widgets.HomeScreenWidget r7 = (com.facebook.aura.widgets.HomeScreenWidget) r7
            java.lang.String r1 = r7.getKey()
            java.lang.String r0 = "reconcile "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            r11 = 0
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$2$1 r6 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$2$1
            r6.<init>(r7, r8, r9, r10, r11)
            r2.L$0 = r8
            r2.L$1 = r11
            r2.L$2 = r9
            r2.L$3 = r11
            r2.L$4 = r5
            r2.L$5 = r11
            r2.L$6 = r11
            r2.Z$0 = r10
            r2.label = r3
            java.lang.String r0 = "WidgetSessionReconciler"
            java.lang.Object r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.runIsolated(r0, r1, r6, r2)
            if (r0 != r4) goto L2d
            return r4
        L64:
            X.Hwg.A00(r1)
            java.lang.String r9 = X.C60P.A1K(r9)
            java.util.List<com.facebook.aura.widgets.HomeScreenWidget> r0 = com.facebook.aura.widgets.HomeScreenWidgetKt.homeScreenWidgets
            java.util.Iterator r5 = r0.iterator()
            goto L2d
        L72:
            com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$1 r2 = new com.facebook.aura.widgets.WidgetSessionReconciler$invalidateIfVmChanged$1
            r2.<init>(r11)
            goto L12
        L78:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionReconciler.invalidateIfVmChanged(android.content.Context, X.CGz, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcile(android.content.Context r9, boolean r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.widgets.WidgetSessionReconciler.C144341
            if (r0 == 0) goto L2b
            r3 = r11
            com.facebook.aura.widgets.WidgetSessionReconciler$reconcile$1 r3 = (com.facebook.aura.widgets.WidgetSessionReconciler.C144341) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r7 = r3.label
            r4 = 4
            r6 = 3
            r1 = 2
            r0 = 1
            if (r7 == 0) goto L31
            if (r7 == r0) goto L41
            if (r7 == r1) goto L9a
            if (r7 == r6) goto L9a
            if (r7 == r4) goto L9a
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            com.facebook.aura.widgets.WidgetSessionReconciler$reconcile$1 r3 = new com.facebook.aura.widgets.WidgetSessionReconciler$reconcile$1
            r3.<init>(r11)
            goto L12
        L31:
            X.Hwg.A00(r5)
            r3.L$0 = r9
            r3.Z$0 = r10
            r3.label = r0
            java.lang.Object r5 = com.facebook.aura.widgets.WidgetSessionKt.awaitSettledSessionState(r3)
            if (r5 != r2) goto L49
            return r2
        L41:
            boolean r10 = r3.Z$0
            java.lang.Object r0 = r3.L$0
            android.content.Context r9 = X.C60P.A02(r0, r5)
        L49:
            com.facebook.aura.auth.AuraSessionManager$SessionState r5 = (com.facebook.aura.auth.AuraSessionManager.SessionState) r5
            com.facebook.aura.auth.AuraSessionManager$SessionState$SignedOut r0 = com.facebook.aura.auth.AuraSessionManager.SessionState.SignedOut.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 == 0) goto L63
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.Z$0 = r10
            r3.label = r1
            java.lang.Object r0 = r8.invalidateForSignedOut(r9, r3)
        L60:
            if (r0 != r2) goto L9d
            return r2
        L63:
            boolean r0 = r5 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Activating
            if (r0 == 0) goto L79
            com.facebook.aura.auth.AuraSessionManager$SessionState$Activating r5 = (com.facebook.aura.auth.AuraSessionManager.SessionState.Activating) r5
            X.CGz r1 = r5.session
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.Z$0 = r10
            r3.label = r6
        L74:
            java.lang.Object r0 = r8.invalidateIfVmChanged(r9, r1, r10, r3)
            goto L60
        L79:
            boolean r0 = r5 instanceof com.facebook.aura.auth.AuraSessionManager.SessionState.Active
            if (r0 == 0) goto L8b
            com.facebook.aura.auth.AuraSessionManager$SessionState$Active r5 = (com.facebook.aura.auth.AuraSessionManager.SessionState.Active) r5
            X.CGz r1 = r5.session
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.Z$0 = r10
            r3.label = r4
            goto L74
        L8b:
            com.facebook.aura.auth.AuraSessionManager$SessionState$Initializing r0 = com.facebook.aura.auth.AuraSessionManager.SessionState.Initializing.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r5, r0)
            if (r0 != 0) goto L9d
            if (r5 == 0) goto L9d
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L9a:
            X.Hwg.A00(r5)
        L9d:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionReconciler.reconcile(android.content.Context, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcileAfterSignOut(android.content.Context r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.widgets.WidgetSessionReconciler.C144351
            if (r0 == 0) goto L28
            r6 = r9
            com.facebook.aura.widgets.WidgetSessionReconciler$reconcileAfterSignOut$1 r6 = (com.facebook.aura.widgets.WidgetSessionReconciler.C144351) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L3c
            if (r0 == r3) goto L5b
            if (r0 == r4) goto L5b
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L28:
            com.facebook.aura.widgets.WidgetSessionReconciler$reconcileAfterSignOut$1 r6 = new com.facebook.aura.widgets.WidgetSessionReconciler$reconcileAfterSignOut$1
            r6.<init>(r9)
            goto L12
        L2e:
            X.Hwg.A00(r1)
            r6.L$0 = r8
            r6.label = r2
            java.lang.Object r1 = com.facebook.aura.widgets.WidgetSessionKt.awaitSignedOut(r6)
            if (r1 != r5) goto L42
            return r5
        L3c:
            java.lang.Object r0 = r6.L$0
            android.content.Context r8 = X.C60P.A02(r0, r1)
        L42:
            boolean r1 = X.AnonymousClass001.A1X(r1)
            r0 = 0
            r6.L$0 = r0
            if (r1 == 0) goto L54
            r6.label = r3
            java.lang.Object r0 = r7.invalidateForSignedOut(r8, r6)
        L51:
            if (r0 != r5) goto L5e
            return r5
        L54:
            r6.label = r4
            java.lang.Object r0 = r7.reconcile(r8, r2, r6)
            goto L51
        L5b:
            X.Hwg.A00(r1)
        L5e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.widgets.WidgetSessionReconciler.reconcileAfterSignOut(android.content.Context, X.HtJ):java.lang.Object");
    }
}
