package com.facebook.aura.status.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C1BO;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.tabs.AuraTabBarHostState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1", f = "HatchStatusPillAvatarAnimation.kt", l = {53, 66}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<Float, AOW> $avatarSize;
    public final /* synthetic */ C1BO<AuraNavKey> $currentDestination$delegate;
    public final /* synthetic */ C1BO<AuraTabBarHostState> $currentTabBarHostState$delegate;
    public final /* synthetic */ boolean $isExpanded;
    public final /* synthetic */ boolean $isTakeoverAvatar;
    public final /* synthetic */ float $targetSize;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $updateRetention$delegate;
    public int I$0;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1", f = "HatchStatusPillAvatarAnimation.kt", l = {59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ C1BO<AuraNavKey> $currentDestination$delegate;
        public final /* synthetic */ C1BO<AuraTabBarHostState> $currentTabBarHostState$delegate;
        public int label;

        /* renamed from: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03971 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ C1BO<AuraNavKey> $currentDestination$delegate;
            public final /* synthetic */ C1BO<AuraTabBarHostState> $currentTabBarHostState$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03971(C1BO<? extends AuraNavKey> c1bo, C1BO<AuraTabBarHostState> c1bo2) {
                super(0);
                this.$currentDestination$delegate = c1bo;
                this.$currentTabBarHostState$delegate = c1bo2;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() {
                /*
                    r2 = this;
                    X.1BO<com.facebook.aura.navigation.AuraNavKey> r0 = r2.$currentDestination$delegate
                    java.lang.Object r1 = r0.getValue()
                    com.facebook.aura.navigation.AuraNavKey r1 = (com.facebook.aura.navigation.AuraNavKey) r1
                    boolean r0 = r1 instanceof com.facebook.aura.navigation.AuraTabRootNavKey
                    if (r0 == 0) goto L27
                    com.facebook.aura.navigation.AuraTabRootNavKey r1 = (com.facebook.aura.navigation.AuraTabRootNavKey) r1
                Le:
                    X.1BO<com.facebook.aura.tabs.AuraTabBarHostState> r0 = r2.$currentTabBarHostState$delegate
                    java.lang.Object r0 = r0.getValue()
                    com.facebook.aura.tabs.AuraTabBarHostState r0 = (com.facebook.aura.tabs.AuraTabBarHostState) r0
                    if (r1 == 0) goto L21
                    if (r0 == 0) goto L21
                    boolean r1 = r0.hasDrawnContent(r1)
                    r0 = 0
                    if (r1 == 0) goto L22
                L21:
                    r0 = 1
                L22:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L27:
                    r1 = 0
                    goto Le
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1.AnonymousClass1.C03971.invoke():java.lang.Boolean");
            }
        }

        @DebugMetadata(c = "com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1$2", f = "HatchStatusPillAvatarAnimation.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends AuraNavKey> c1bo, C1BO<AuraTabBarHostState> c1bo2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$currentDestination$delegate = c1bo;
            this.$currentTabBarHostState$delegate = c1bo2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$currentDestination$delegate, this.$currentTabBarHostState$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C05663ul c05663ulA01 = C6v3.A01(new C03971(this.$currentDestination$delegate, this.$currentTabBarHostState$delegate));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                obj = AbstractC9777Gfy.A00(this, anonymousClass2, c05663ulA01);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1(boolean z, boolean z2, AT5<Float, AOW> at5, float f, C1BO<? extends G0U<? super Boolean, Unit>> c1bo, C1BO<? extends AuraNavKey> c1bo2, C1BO<AuraTabBarHostState> c1bo3, HtJ<? super HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1> htJ) {
        super(2, htJ);
        this.$isTakeoverAvatar = z;
        this.$isExpanded = z2;
        this.$avatarSize = at5;
        this.$targetSize = f;
        this.$updateRetention$delegate = c1bo;
        this.$currentDestination$delegate = c1bo2;
        this.$currentTabBarHostState$delegate = c1bo3;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1(this.$isTakeoverAvatar, this.$isExpanded, this.$avatarSize, this.$targetSize, this.$updateRetention$delegate, this.$currentDestination$delegate, this.$currentTabBarHostState$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L56
            if (r0 != r4) goto L8b
            X.Hwg.A00(r8)
        L10:
            X.1BO<X.G0U<java.lang.Boolean, kotlin.Unit>> r0 = r7.$updateRetention$delegate
            X.G0U r1 = X.C1BO.A0B(r0)
            boolean r0 = r7.$isTakeoverAvatar
            X.AnonymousClass001.A1K(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1e:
            X.Hwg.A00(r8)
            boolean r0 = r7.$isTakeoverAvatar
            if (r0 == 0) goto L2e
            X.1BO<X.G0U<java.lang.Boolean, kotlin.Unit>> r0 = r7.$updateRetention$delegate
            X.G0U r0 = X.C1BO.A0B(r0)
            X.AnonymousClass001.A1K(r3, r0)
        L2e:
            boolean r0 = r7.$isTakeoverAvatar
            if (r0 == 0) goto L59
            boolean r0 = r7.$isExpanded
            if (r0 != 0) goto L59
            X.AT5<java.lang.Float, X.AOW> r0 = r7.$avatarSize
            float r1 = androidx.compose.runtime.MutableState.A00(r0)
            float r0 = r7.$targetSize
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L59
            X.1BO<com.facebook.aura.navigation.AuraNavKey> r1 = r7.$currentDestination$delegate
            X.1BO<com.facebook.aura.tabs.AuraTabBarHostState> r0 = r7.$currentTabBarHostState$delegate
            com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1 r2 = new com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1$1
            r2.<init>(r1, r0, r6)
            r7.label = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.GAX.A01(r7, r2, r0)
            if (r0 != r5) goto L59
            return r5
        L56:
            X.Hwg.A00(r8)
        L59:
            boolean r0 = r7.$isTakeoverAvatar
            if (r0 == 0) goto L6f
            boolean r0 = r7.$isExpanded
            if (r0 != 0) goto L6f
            float r1 = r7.$targetSize
            X.AT5<java.lang.Float, X.AOW> r0 = r7.$avatarSize
            float r0 = androidx.compose.runtime.MutableState.A00(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r3 = 220(0xdc, float:3.08E-43)
            if (r0 < 0) goto L71
        L6f:
            r3 = 350(0x15e, float:4.9E-43)
        L71:
            X.AT5<java.lang.Float, X.AOW> r2 = r7.$avatarSize
            float r0 = r7.$targetSize
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r0)
            X.28s r0 = X.C2HU.A01
            X.ASj r0 = X.AnonymousClass002.A0J(r0, r3)
            r7.I$0 = r3
            r7.label = r4
            java.lang.Object r0 = X.AnonymousClass002.A0i(r2, r0, r1, r7, r6)
            if (r0 != r5) goto L10
            return r5
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchStatusPillAvatarAnimationKt$StatusPillAvatarAnimation$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
