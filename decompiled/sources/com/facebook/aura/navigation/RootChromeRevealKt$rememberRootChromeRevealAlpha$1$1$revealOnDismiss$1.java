package com.facebook.aura.navigation;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AT5<Float, AOW> $alpha;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C3UX $scope;

    @DebugMetadata(c = "com.facebook.aura.navigation.RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1$1", f = "RootChromeReveal.kt", l = {29, 30}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.navigation.RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AT5<Float, AOW> $alpha;
        public final /* synthetic */ AuraNavKey $leaving;
        public final /* synthetic */ AuraNavigator $navigator;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraNavigator auraNavigator, AuraNavKey auraNavKey, AT5<Float, AOW> at5, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$navigator = auraNavigator;
            this.$leaving = auraNavKey;
            this.$alpha = at5;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$navigator, this.$leaving, this.$alpha, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r9.label
                r8 = 0
                r3 = 1
                r6 = 2
                if (r0 == 0) goto L13
                if (r0 == r3) goto L3a
                if (r0 != r6) goto L58
                X.Hwg.A00(r10)
            L10:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L13:
                X.Hwg.A00(r10)
                com.facebook.aura.navigation.AuraNavigator r0 = r9.$navigator
                com.facebook.aura.navigation.AuraNavKey r1 = r0.currentKey(r8)
                com.facebook.aura.navigation.AuraNavKey r0 = r9.$leaving
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 != 0) goto L10
                boolean r0 = r1 instanceof com.facebook.aura.navigation.AuraFullScreenNavKey
                if (r0 != 0) goto L10
                X.AT5<java.lang.Float, X.AOW> r2 = r9.$alpha
                java.lang.Float r1 = X.AnonymousClass001.A0l()
                r0 = 0
                r9.L$0 = r0
                r9.label = r3
                java.lang.Object r0 = r2.A04(r1, r9)
                if (r0 != r7) goto L3d
                return r7
            L3a:
                X.Hwg.A00(r10)
            L3d:
                X.AT5<java.lang.Float, X.AOW> r5 = r9.$alpha
                java.lang.Float r4 = X.AnonymousClass001.A0m()
                X.28s r3 = X.C2HU.A02
                r2 = 0
                r1 = 250(0xfa, float:3.5E-43)
                X.ASj r0 = new X.ASj
                r0.<init>(r3, r1, r8)
                r9.L$0 = r2
                r9.label = r6
                java.lang.Object r0 = X.AnonymousClass002.A0i(r5, r0, r4, r9, r2)
                if (r0 != r7) goto L10
                return r7
            L58:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootChromeRevealKt$rememberRootChromeRevealAlpha$1$1$revealOnDismiss$1(AuraNavigator auraNavigator, C3UX c3ux, AT5<Float, AOW> at5) {
        super(0);
        this.$navigator = auraNavigator;
        this.$scope = c3ux;
        this.$alpha = at5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(false);
        if (auraNavKeyCurrentKey instanceof AuraFadesInRootChromeOnDismissNavKey) {
            AnonymousClass001.A1J(new AnonymousClass1(this.$navigator, auraNavKeyCurrentKey, this.$alpha, null), this.$scope);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
