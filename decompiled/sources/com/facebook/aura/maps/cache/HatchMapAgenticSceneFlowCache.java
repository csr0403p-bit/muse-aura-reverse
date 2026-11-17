package com.facebook.aura.maps.cache;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.maps.cache.HatchPlaceDetailsState;
import com.facebook.aura.maps.data.HatchPlaceDetailsLoader;
import com.facebook.aura.maps.model.HatchMapPlace;
import com.facebook.aura.maps.model.HatchMapScene;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchMapAgenticSceneFlowCache {
    public final ConcurrentHashMap<String, BLG<HatchPlaceDetailsState>> detailStates;
    public final HatchPlaceDetailsLoader detailsLoader;
    public final SingleFlight detailsSingleFlight;
    public final HatchSharedPlaceImageProvider placeImageProvider;
    public final Set<String> resolvedPlaceIds;
    public final HatchMapScene scene;
    public final C3UX scope;

    @DebugMetadata(c = "com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache$observeDetails$1", f = "HatchMapAgenticSceneFlowCache.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache$observeDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C126821 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $placeId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126821(String str, HtJ<? super C126821> htJ) {
            super(2, htJ);
            this.$placeId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchMapAgenticSceneFlowCache.this.new C126821(this.$placeId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchMapAgenticSceneFlowCache hatchMapAgenticSceneFlowCache = HatchMapAgenticSceneFlowCache.this;
                String str = this.$placeId;
                this.label = 1;
                if (hatchMapAgenticSceneFlowCache.resolveDetails(str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126821) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache", f = "HatchMapAgenticSceneFlowCache.kt", l = {104}, m = "resolveDetails", v = 2)
    /* renamed from: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache$resolveDetails$1, reason: invalid class name and case insensitive filesystem */
    public final class C126831 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C126831(HtJ<? super C126831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMapAgenticSceneFlowCache.this.resolveDetails(null, this);
        }
    }

    public final C1BN<HatchPlaceDetailsState> observeDetails(String str) {
        C7384Etj.A0Y(str, 0);
        BLG<HatchPlaceDetailsState> blgDetailState = detailState(str);
        if (!this.resolvedPlaceIds.contains(str)) {
            AnonymousClass001.A1J(new C126821(str, null), this.scope);
        }
        return blgDetailState;
    }

    private final BLG<HatchPlaceDetailsState> detailState(String str) {
        BLG<HatchPlaceDetailsState> blgComputeIfAbsent = this.detailStates.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache.detailState.1
            public final BLG<HatchPlaceDetailsState> apply(String str2) {
                return HnJ.A01(HatchPlaceDetailsState.Loading.INSTANCE);
            }

            @Override // java.util.function.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return HnJ.A01(HatchPlaceDetailsState.Loading.INSTANCE);
            }
        });
        C7384Etj.A0U(blgComputeIfAbsent);
        return blgComputeIfAbsent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveDetails(java.lang.String r10, X.HtJ<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.maps.cache.HatchMapAgenticSceneFlowCache.resolveDetails(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void close() {
        this.detailsSingleFlight.clearAndCancelAll();
        this.placeImageProvider.close();
        Hxb.A03(null, this.scope);
    }

    public final HatchSharedPlaceImageProvider getPlaceImageProvider() {
        return this.placeImageProvider;
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public final void startDetailsResolution() {
        for (HatchMapPlace hatchMapPlace : this.scene.getPlaces()) {
            if (!this.resolvedPlaceIds.contains(hatchMapPlace.placeId)) {
                AnonymousClass001.A1J(new HatchMapAgenticSceneFlowCache$startDetailsResolution$1$1(this, hatchMapPlace, null), this.scope);
            }
        }
    }

    public HatchMapAgenticSceneFlowCache(HatchMapScene hatchMapScene, C3UX c3ux, HatchPlaceDetailsLoader hatchPlaceDetailsLoader, SingleFlight singleFlight, HatchSharedPlaceImageProvider hatchSharedPlaceImageProvider) {
        AnonymousClass005.A17(hatchMapScene, c3ux, hatchPlaceDetailsLoader, singleFlight, hatchSharedPlaceImageProvider);
        this.scene = hatchMapScene;
        this.scope = c3ux;
        this.detailsLoader = hatchPlaceDetailsLoader;
        this.detailsSingleFlight = singleFlight;
        this.placeImageProvider = hatchSharedPlaceImageProvider;
        this.detailStates = C60O.A1C();
        this.resolvedPlaceIds = Collections.synchronizedSet(C3cG.A0k());
    }
}
