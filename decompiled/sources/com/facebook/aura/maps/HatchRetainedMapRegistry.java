package com.facebook.aura.maps;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C1HY;
import X.C7384Etj;
import X.C7438Evz;
import X.C8j3;
import X.EnumC10573Huf;
import X.G0U;
import X.InterfaceC7549F2g;
import com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.registry.HatchPresentationRegistry;
import com.facebook.aura.maps.registry.HatchPresentationRegistryKt;
import com.facebook.aura.maps.scene.HatchMapTheme;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchRetainedMapRegistry implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_LIVE_MAP_COUNT = 2;
    public final HatchPresentationRegistry<HatchRetainedMapPresentation> registry;

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$acquire$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<HatchRetainedMapPresentation, Boolean> {
        public AnonymousClass1(Object obj) {
            super(1, obj, HatchRetainedMapRegistry.class, "isDead", "isDead(Lcom/facebook/aura/maps/HatchRetainedMapPresentation;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
            return Boolean.valueOf(((HatchRetainedMapRegistry) AnonymousClass006.A0o(hatchRetainedMapPresentation, this)).isDead(hatchRetainedMapPresentation));
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$acquire$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchRetainedMapPresentation, Boolean> {
        public final /* synthetic */ HatchMapAgenticSceneFlowCache $cache;
        public final /* synthetic */ C1HY $owner;
        public final /* synthetic */ HatchMapScene $scene;
        public final /* synthetic */ HatchMapTheme $theme;

        /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
        @Override // X.G0U
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.facebook.aura.maps.HatchRetainedMapPresentation r3) {
            /*
                r2 = this;
                r0 = 0
                X.C7384Etj.A0Y(r3, r0)
                com.facebook.aura.maps.model.HatchMapScene r1 = r3.scene
                com.facebook.aura.maps.model.HatchMapScene r0 = r2.$scene
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2d
                X.1HY r1 = r3.owner
                X.1HY r0 = r2.$owner
                if (r1 != r0) goto L2d
                com.facebook.aura.maps.scene.HatchMapTheme r1 = r3.theme
                com.facebook.aura.maps.scene.HatchMapTheme r0 = r2.$theme
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2d
                com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r1 = r3.cache
                com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache r0 = r2.$cache
                if (r1 != r0) goto L2d
                X.AFR r0 = r3.retainedMap
                boolean r0 = r0.A00
                r1 = r0 ^ 1
                r0 = 1
                if (r1 != 0) goto L2e
            L2d:
                r0 = 0
            L2e:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.HatchRetainedMapRegistry.AnonymousClass2.invoke(com.facebook.aura.maps.HatchRetainedMapPresentation):java.lang.Boolean");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchMapScene hatchMapScene, C1HY c1hy, HatchMapTheme hatchMapTheme, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
            super(1);
            this.$scene = hatchMapScene;
            this.$owner = c1hy;
            this.$theme = hatchMapTheme;
            this.$cache = hatchMapAgenticSceneFlowCache;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$acquire$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<HatchRetainedMapPresentation> {
        public final /* synthetic */ Function0<HatchRetainedMapPresentation> $create;
        public final /* synthetic */ HatchRetainedMapRegistry this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<HatchRetainedMapPresentation> function0, HatchRetainedMapRegistry hatchRetainedMapRegistry) {
            super(0);
            this.$create = function0;
            this.this$0 = hatchRetainedMapRegistry;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchRetainedMapPresentation invoke() {
            HatchRetainedMapPresentation hatchRetainedMapPresentationInvoke = this.$create.invoke();
            hatchRetainedMapPresentationInvoke.onOwnerDestroyed(new HatchRetainedMapRegistry$acquire$3$1$1(this.this$0));
            return hatchRetainedMapPresentationInvoke;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchRetainedMapRegistry$release$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C126811 extends C7438Evz implements G0U<HatchRetainedMapPresentation, Boolean> {
        public C126811(Object obj) {
            super(1, obj, HatchRetainedMapRegistry.class, "isDead", "isDead(Lcom/facebook/aura/maps/HatchRetainedMapPresentation;)Z", 0);
        }

        @Override // X.G0U
        public final Boolean invoke(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
            return Boolean.valueOf(((HatchRetainedMapRegistry) AnonymousClass006.A0o(hatchRetainedMapPresentation, this)).isDead(hatchRetainedMapPresentation));
        }
    }

    public final void release(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
        C7384Etj.A0Y(hatchRetainedMapPresentation, 0);
        this.registry.release(hatchRetainedMapPresentation);
        this.registry.evictUnheld(new C126811(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDead(HatchRetainedMapPresentation hatchRetainedMapPresentation) {
        return !(hatchRetainedMapPresentation.retainedMap.A00 ^ true) || C8j3.A0m(hatchRetainedMapPresentation.owner) == EnumC10573Huf.A03;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.registry.clear();
    }

    public final class Companion {
        public final HatchRetainedMapRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchRetainedMapRegistry) abstractC3358CGz.A03(HatchRetainedMapRegistry.class, HatchRetainedMapRegistry$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final HatchRetainedMapPresentation acquire(String str, HatchMapScene hatchMapScene, C1HY c1hy, HatchMapTheme hatchMapTheme, HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache, Function0<HatchRetainedMapPresentation> function0) {
        AnonymousClass005.A17(str, hatchMapScene, c1hy, hatchMapTheme, hatchMapAgenticSceneFlowCache);
        C7384Etj.A0Y(function0, 5);
        this.registry.evictUnheld(new AnonymousClass1(this));
        return this.registry.acquire(HatchPresentationRegistryKt.hatchPresentationKey(str, hatchMapScene), new AnonymousClass2(hatchMapScene, c1hy, hatchMapTheme, hatchMapAgenticSceneFlowCache), new AnonymousClass3(function0, this));
    }

    public /* synthetic */ HatchRetainedMapRegistry(C06H c06h) {
        this();
    }

    public HatchRetainedMapRegistry() {
        this.registry = new HatchPresentationRegistry<>(2, HatchRetainedMapRegistry$registry$1.INSTANCE);
    }
}
