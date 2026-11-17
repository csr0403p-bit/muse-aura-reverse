package com.facebook.aura.maps;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C7384Etj;
import X.C78g;
import X.C8j4;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchMapHostKt$MapHostCallbacksEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnExpand$delegate;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnMarkerTapped$delegate;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnPlaceDetailsRequested$delegate;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnSelectedArtifactIdChanged$delegate;
    public final /* synthetic */ HatchMapAgenticSceneFlow $flow;
    public final /* synthetic */ G0U<String, Unit> $onExpand;
    public final /* synthetic */ G0U<String, Unit> $onMarkerTapped;
    public final /* synthetic */ G0U<String, Unit> $onPlaceDetailsRequested;
    public final /* synthetic */ Object $owner;

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnSelectedArtifactIdChanged$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends G0U<? super String, Unit>> c1bo) {
            super(1);
            this.$currentOnSelectedArtifactIdChanged$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C8j4.A1J(this.$currentOnSelectedArtifactIdChanged$delegate, str);
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnExpand$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C1BO<? extends G0U<? super String, Unit>> c1bo) {
            super(1);
            this.$currentOnExpand$delegate = c1bo;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            G0U g0uA0B = C1BO.A0B(this.$currentOnExpand$delegate);
            if (g0uA0B != null) {
                g0uA0B.invoke(str);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnPlaceDetailsRequested$delegate;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U g0uA0B = C1BO.A0B(this.$currentOnPlaceDetailsRequested$delegate);
            if (g0uA0B != null) {
                g0uA0B.invoke(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C1BO<? extends G0U<? super String, Unit>> c1bo) {
            super(1);
            this.$currentOnPlaceDetailsRequested$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnMarkerTapped$delegate;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            G0U g0uA0B = C1BO.A0B(this.$currentOnMarkerTapped$delegate);
            if (g0uA0B != null) {
                g0uA0B.invoke(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C1BO<? extends G0U<? super String, Unit>> c1bo) {
            super(1);
            this.$currentOnMarkerTapped$delegate = c1bo;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapHostKt$MapHostCallbacksEffect$1$1(HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow, Object obj, G0U<? super String, Unit> g0u, G0U<? super String, Unit> g0u2, G0U<? super String, Unit> g0u3, C1BO<? extends G0U<? super String, Unit>> c1bo, C1BO<? extends G0U<? super String, Unit>> c1bo2, C1BO<? extends G0U<? super String, Unit>> c1bo3, C1BO<? extends G0U<? super String, Unit>> c1bo4) {
        super(1);
        this.$flow = hatchMapAgenticSceneFlow;
        this.$owner = obj;
        this.$onExpand = g0u;
        this.$onPlaceDetailsRequested = g0u2;
        this.$onMarkerTapped = g0u3;
        this.$currentOnSelectedArtifactIdChanged$delegate = c1bo;
        this.$currentOnExpand$delegate = c1bo2;
        this.$currentOnPlaceDetailsRequested$delegate = c1bo3;
        this.$currentOnMarkerTapped$delegate = c1bo4;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$flow.acquireHostCallbacks(this.$owner, new AnonymousClass1(this.$currentOnSelectedArtifactIdChanged$delegate), this.$onExpand == null ? null : new AnonymousClass2(this.$currentOnExpand$delegate), this.$onPlaceDetailsRequested == null ? null : new AnonymousClass3(this.$currentOnPlaceDetailsRequested$delegate), this.$onMarkerTapped != null ? new AnonymousClass4(this.$currentOnMarkerTapped$delegate) : null);
        final HatchMapAgenticSceneFlow hatchMapAgenticSceneFlow = this.$flow;
        final Object obj = this.$owner;
        return new C78g() { // from class: com.facebook.aura.maps.HatchMapHostKt$MapHostCallbacksEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchMapAgenticSceneFlow.releaseHostCallbacks(obj);
            }
        };
    }
}
