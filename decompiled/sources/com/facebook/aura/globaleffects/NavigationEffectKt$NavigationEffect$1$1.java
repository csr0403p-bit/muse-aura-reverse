package com.facebook.aura.globaleffects;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C05663ul;
import X.C0Hi;
import X.C10649I0t;
import X.C1BO;
import X.C1C3;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.effect.api.NavigationEffectApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1", f = "NavigationEffect.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NavigationEffectKt$NavigationEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ C1BO<Boolean> $imeVisible;
    public final /* synthetic */ C1C3 $keyboardController;
    public final /* synthetic */ AuraNavigator $navigator;
    public int label;

    /* renamed from: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1<T> implements C20Z {
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ C1BO<Boolean> $imeVisible;
        public final /* synthetic */ C1C3 $keyboardController;
        public final /* synthetic */ AuraNavigator $navigator;

        @DebugMetadata(c = "com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1", f = "NavigationEffect.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ C1BO<Boolean> $imeVisible;
            public int label;

            /* renamed from: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public final class C01781 extends AbstractC7559F3s implements Function0<Boolean> {
                public final /* synthetic */ C1BO<Boolean> $imeVisible;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01781(C1BO<Boolean> c1bo) {
                    super(0);
                    this.$imeVisible = c1bo;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return this.$imeVisible.getValue();
                }
            }

            @DebugMetadata(c = "com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1$2", f = "NavigationEffect.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1$2, reason: invalid class name */
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
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return C3cG.A0P(z);
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
            public C01771(C1BO<Boolean> c1bo, HtJ<? super C01771> htJ) {
                super(2, htJ);
                this.$imeVisible = c1bo;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01771(this.$imeVisible, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C05663ul c05663ulA01 = C6v3.A01(new C01781(this.$imeVisible));
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
                return new C01771(this.$imeVisible, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(C1BO<Boolean> c1bo, C0Hi c0Hi, C1C3 c1c3, AuraNavigator auraNavigator) {
            this.$imeVisible = c1bo;
            this.$focusManager = c0Hi;
            this.$keyboardController = c1c3;
            this.$navigator = auraNavigator;
        }

        @Override // X.C20Z
        public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
            return emit((NavigationEffectApi.NavigationRequest) obj, (HtJ<? super Unit>) htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(com.facebook.aura.navigation.effect.api.NavigationEffectApi.NavigationRequest r7, X.HtJ<? super kotlin.Unit> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$emit$1
                if (r0 == 0) goto L68
                r4 = r8
                com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$emit$1 r4 = (com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$emit$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L68
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r5 = 1
                if (r0 == 0) goto L30
                if (r0 != r5) goto L6e
                java.lang.Object r7 = r4.L$0
                com.facebook.aura.navigation.effect.api.NavigationEffectApi$NavigationRequest r7 = (com.facebook.aura.navigation.effect.api.NavigationEffectApi.NavigationRequest) r7
                X.Hwg.A00(r1)
            L24:
                com.facebook.aura.navigation.AuraNavigator r2 = r6.$navigator
                com.facebook.aura.navigation.AuraNavKey r1 = r7.key
                com.facebook.aura.navigation.LaunchFlag r0 = r7.launchFlag
                r2.navigate(r1, r0)
            L2d:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L30:
                X.Hwg.A00(r1)
                com.facebook.aura.navigation.effect.api.NavigationEffectApi r0 = com.facebook.aura.navigation.effect.api.NavigationEffectApi.INSTANCE
                boolean r0 = r0.consumeNavigationRequest(r7)
                if (r0 == 0) goto L2d
                boolean r0 = r7.dismissKeyboardFirst
                if (r0 == 0) goto L24
                X.1BO<java.lang.Boolean> r0 = r6.$imeVisible
                boolean r0 = X.C1BO.A0F(r0)
                if (r0 == 0) goto L24
                X.0Hi r0 = r6.$focusManager
                r0.A6G(r5)
                X.1C3 r0 = r6.$keyboardController
                if (r0 == 0) goto L53
                r0.hide()
            L53:
                X.1BO<java.lang.Boolean> r1 = r6.$imeVisible
                r0 = 0
                com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1 r2 = new com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$1
                r2.<init>(r1, r0)
                r4.L$0 = r7
                r4.label = r5
                r0 = 400(0x190, double:1.976E-321)
                java.lang.Object r0 = X.GAX.A01(r4, r2, r0)
                if (r0 != r3) goto L24
                return r3
            L68:
                com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$emit$1 r4 = new com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1$1$emit$1
                r4.<init>(r6, r8)
                goto L12
            L6e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$1$1.AnonymousClass1.emit(com.facebook.aura.navigation.effect.api.NavigationEffectApi$NavigationRequest, X.HtJ):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationEffectKt$NavigationEffect$1$1(C1BO<Boolean> c1bo, C0Hi c0Hi, C1C3 c1c3, AuraNavigator auraNavigator, HtJ<? super NavigationEffectKt$NavigationEffect$1$1> htJ) {
        super(2, htJ);
        this.$imeVisible = c1bo;
        this.$focusManager = c0Hi;
        this.$keyboardController = c1c3;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NavigationEffectKt$NavigationEffect$1$1(this.$imeVisible, this.$focusManager, this.$keyboardController, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                NavigationEffectApi.INSTANCE.clearNavigationRequest();
                C10649I0t c10649I0t = new C10649I0t(NavigationEffectApi.navigationRequest, 2);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$imeVisible, this.$focusManager, this.$keyboardController, this.$navigator);
                this.label = 1;
                if (c10649I0t.collect(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            NavigationEffectApi.INSTANCE.clearNavigationRequest();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            NavigationEffectApi.INSTANCE.clearNavigationRequest();
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((NavigationEffectKt$NavigationEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
