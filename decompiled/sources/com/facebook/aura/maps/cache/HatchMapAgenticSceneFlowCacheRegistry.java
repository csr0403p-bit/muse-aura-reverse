package com.facebook.aura.maps.cache;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C60O;
import X.C7384Etj;
import X.C78W;
import X.G0U;
import X.HzC;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.maps.data.HatchPlaceDetailsLoader;
import com.facebook.aura.maps.data.HatchRichPlaceLoaderKt;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.registry.HatchPresentationRegistry;
import com.facebook.aura.maps.registry.HatchPresentationRegistryKt;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneFlowCacheRegistry implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static final int MAX_RETAINED_IMAGES = 32;
    public static final int MIN_RETAINED_IMAGES = 8;
    public final HatchPresentationRegistry<HatchMapAgenticSceneFlowCache> registry;
    public final AuraTrimmable trimmable;
    public final AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$acquire$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchMapAgenticSceneFlowCache, Boolean> {
        public final /* synthetic */ HatchMapScene $scene;

        @Override // X.G0U
        public final Boolean invoke(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
            C7384Etj.A0Y(hatchMapAgenticSceneFlowCache, 0);
            return C60O.A0h(hatchMapAgenticSceneFlowCache.scene, this.$scene);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchMapScene hatchMapScene) {
            super(1);
            this.$scene = hatchMapScene;
        }
    }

    /* renamed from: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$acquire$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<HatchMapAgenticSceneFlowCache> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchMapScene $scene;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchMapScene hatchMapScene, Context context) {
            super(0);
            this.$scene = hatchMapScene;
            this.$context = context;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final HatchMapAgenticSceneFlowCache invoke() {
            return HatchMapAgenticSceneFlowCacheRegistry.this.create(this.$scene, this.$context);
        }
    }

    public final void release(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
        C7384Etj.A0Y(hatchMapAgenticSceneFlowCache, 0);
        this.registry.release(hatchMapAgenticSceneFlowCache);
    }

    public final void retain(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
        C7384Etj.A0Y(hatchMapAgenticSceneFlowCache, 0);
        this.registry.retain(hatchMapAgenticSceneFlowCache);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AuraMemoryPressure.INSTANCE.unregister(this.trimmable);
        this.registry.clear();
    }

    public final class Companion {
        public final HatchMapAgenticSceneFlowCacheRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchMapAgenticSceneFlowCacheRegistry) abstractC3358CGz.A03(HatchMapAgenticSceneFlowCacheRegistry.class, new HatchMapAgenticSceneFlowCacheRegistry$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchMapAgenticSceneFlowCacheRegistry(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.registry = new HatchPresentationRegistry<>(8, HatchMapAgenticSceneFlowCacheRegistry$registry$1.INSTANCE);
        AuraTrimmable auraTrimmable = new AuraTrimmable() { // from class: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$trimmable$1
            @Override // com.facebook.aura.memory.AuraTrimmable
            public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
                C7384Etj.A0Y(auraMemoryPressureLevel, 0);
                if (auraMemoryPressureLevel != AuraMemoryPressureLevel.MODERATE) {
                    this.this$0.registry.evictUnheld(AnonymousClass1.INSTANCE);
                }
            }

            /* renamed from: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCacheRegistry$trimmable$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<HatchMapAgenticSceneFlowCache, Boolean> {
                public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                public AnonymousClass1() {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
                    return AnonymousClass001.A0i();
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Boolean invoke(HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache) {
                    return AnonymousClass001.A0i();
                }
            }
        };
        this.trimmable = auraTrimmable;
        AuraMemoryPressure.INSTANCE.register(auraTrimmable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchMapAgenticSceneFlowCache create(HatchMapScene hatchMapScene, Context context) {
        HzC hzCA03 = C78W.A03();
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        OnDuplicateCall.Join join = OnDuplicateCall.Join.INSTANCE;
        SingleFlight SingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, join, false);
        SingleFlight SingleFlight2 = SingleFlightKt.SingleFlight(this.userSession, join, false);
        HatchPlaceDetailsLoader hatchPlaceDetailsLoaderHatchRichPlaceLoader = HatchRichPlaceLoaderKt.hatchRichPlaceLoader(this.userSession);
        int i = VitoHatchPlaceBitmapLoader.PLACE_IMAGE_DECODE_SIZE_PX;
        VitoHatchPlaceBitmapLoader vitoHatchPlaceBitmapLoader = new VitoHatchPlaceBitmapLoader(AnonymousClass001.A0I(context));
        int size = hatchMapScene.elements.size();
        if (size < 8) {
            size = 8;
        } else if (size > 32) {
            size = 32;
        }
        return new HatchMapAgenticSceneFlowCache(hatchMapScene, hzCA03, hatchPlaceDetailsLoaderHatchRichPlaceLoader, SingleFlight, new HatchSharedPlaceImageProvider(vitoHatchPlaceBitmapLoader, SingleFlight2, hzCA03, hatchMapScene, size));
    }

    public final HatchMapAgenticSceneFlowCache acquire(String str, HatchMapScene hatchMapScene, Context context) {
        AnonymousClass005.A0x(str, hatchMapScene, context);
        return this.registry.acquire(HatchPresentationRegistryKt.hatchPresentationKey(str, hatchMapScene), new AnonymousClass1(hatchMapScene), new AnonymousClass2(hatchMapScene, context));
    }

    public /* synthetic */ HatchMapAgenticSceneFlowCacheRegistry(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
