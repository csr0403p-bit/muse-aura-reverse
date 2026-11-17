package com.meta.maps.fancypins;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AbstractC7559F3s;
import X.AbstractC7607F5u;
import X.AbstractC7608F5v;
import X.AbstractC7609F5w;
import X.AbstractC7610F5x;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.BV5;
import X.C06H;
import X.C0881AGi;
import X.C10543Hqv;
import X.C10571Hud;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7438Evz;
import X.C9jH;
import X.CU7;
import X.Ey9;
import X.G0U;
import X.HsJ;
import X.Hwg;
import android.os.Handler;
import android.util.Log;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.meta.maps.core.GeoCoordinates;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinDataController implements AutoCloseable {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "FancyPinDataController";
    public Object activeMutation;
    public final LinkedHashMap<String, FancyPinRetirement> awaitingVisualRetirements;
    public boolean closeComplete;
    public boolean closeStarted;
    public Object committedMutation;
    public FancyPinRuntimeClusterCatalog committedRuntimeClusterCatalog;
    public boolean drainingMutations;
    public final FancyPinEngineDataSink engine;
    public final FancyPinLayoutDataSink layoutEngine;
    public final FancyPinMeasurementPipeline measurementPipeline;
    public Set<String> nativePinIds;
    public final ArrayDeque<PendingSourceMutation> pendingMutations;
    public Set<String> presentedPinIds;
    public List<FancyPinClusterBlueprint> projectedClusterBlueprints;
    public FancyPinSourceState projectedSourceState;
    public int publicationDepth;
    public long publicationGeneration;
    public final Function0<Unit> requestUpdate;
    public boolean requiresFullReplay;
    public boolean runtimeClusterCatalogIsManaged;
    public final FancyPinRuntimeClusterCatalogPublisher runtimeClusterCatalogPublisher;
    public FancyPinRuntimeClusterFrameConsumer runtimeClusterFrameConsumer;
    public final FancyPinSlotConsumer slotConsumer;
    public final FancyPinSourceStateStore sourceStore;

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements Function0<FancyPinRuntimeClusterCatalog> {
        public AnonymousClass8() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final FancyPinRuntimeClusterCatalog invoke() {
            return FancyPinDataController.this.runtimeClusterCatalogPublisher.current;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ FancyPinRuntimeClusterCatalog invoke() {
            return FancyPinDataController.this.runtimeClusterCatalogPublisher.current;
        }
    }

    public final class PendingSourceMutation {
        public static final Companion Companion = new Companion();
        public final List<FancyPinBlueprint> blueprints;
        public final FancyPinClusterBlueprint clusterBlueprint;
        public final FancyPinRuntimeClusterCatalogPublication clusterCatalogPublication;
        public boolean completed;
        public final G0U<HsJ<Unit>, Unit> completion;
        public final Kind kind;
        public final String pinId;
        public final List<String> pinIds;
        public final List<FancyPin> pins;
        public final Integer rank;
        public final FancyPinSourceState replacementCandidate;
        public final List<byte[]> serializedBlueprints;
        public final String variantId;
        public final Float zOrder;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Kind {
            public static final /* synthetic */ Ey9 $ENTRIES;
            public static final /* synthetic */ Kind[] $VALUES;
            public static final Kind ADD;
            public static final Kind CLEAR_ACTIVE_VARIANT;
            public static final Kind CLEAR_RANK;
            public static final Kind CLEAR_Z_ORDER;
            public static final Kind REGISTER_BLUEPRINTS;
            public static final Kind REGISTER_CLUSTER_BLUEPRINT;
            public static final Kind REMOVE;
            public static final Kind REPLACE;
            public static final Kind SET_ACTIVE_VARIANT;
            public static final Kind SET_RANK;
            public static final Kind SET_Z_ORDER;
            public static final Kind UPDATE;

            static {
                Kind kind = new Kind("REPLACE", 0);
                REPLACE = kind;
                Kind kind2 = new Kind("ADD", 1);
                ADD = kind2;
                Kind kind3 = new Kind("UPDATE", 2);
                UPDATE = kind3;
                Kind kind4 = new Kind("REMOVE", 3);
                REMOVE = kind4;
                Kind kind5 = new Kind("REGISTER_BLUEPRINTS", 4);
                REGISTER_BLUEPRINTS = kind5;
                Kind kind6 = new Kind("REGISTER_CLUSTER_BLUEPRINT", 5);
                REGISTER_CLUSTER_BLUEPRINT = kind6;
                Kind kind7 = new Kind("SET_ACTIVE_VARIANT", 6);
                SET_ACTIVE_VARIANT = kind7;
                Kind kind8 = new Kind("CLEAR_ACTIVE_VARIANT", 7);
                CLEAR_ACTIVE_VARIANT = kind8;
                Kind kind9 = new Kind("SET_RANK", 8);
                SET_RANK = kind9;
                Kind kind10 = new Kind("CLEAR_RANK", 9);
                CLEAR_RANK = kind10;
                Kind kind11 = new Kind("SET_Z_ORDER", 10);
                SET_Z_ORDER = kind11;
                Kind kind12 = new Kind("CLEAR_Z_ORDER", 11);
                CLEAR_Z_ORDER = kind12;
                Kind[] kindArr = {kind, kind2, kind3, kind4, kind5, kind6, kind7, kind8, kind9, kind10, kind11, kind12};
                $VALUES = kindArr;
                $ENTRIES = C3cG.A0w(kindArr);
            }

            public static Ey9<Kind> getEntries() {
                return $ENTRIES;
            }

            public static Kind valueOf(String str) {
                return (Kind) Enum.valueOf(Kind.class, str);
            }

            public static Kind[] values() {
                return (Kind[]) $VALUES.clone();
            }

            public Kind(String str, int i) {
            }
        }

        public final class Companion {
            public final PendingSourceMutation addition(List<FancyPin> list, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(list, g0u);
                Kind kind = Kind.ADD;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, list, c0881AGi, null, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation blueprintRegistration(List<FancyPinBlueprint> list, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(list, g0u);
                Kind kind = Kind.REGISTER_BLUEPRINTS;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, null, null, null, null, g0u, list, null);
            }

            public final PendingSourceMutation clearActiveVariant(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(str, g0u);
                Kind kind = Kind.CLEAR_ACTIVE_VARIANT;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation clearRank(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(str, g0u);
                Kind kind = Kind.CLEAR_RANK;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation clearZOrder(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(str, g0u);
                Kind kind = Kind.CLEAR_Z_ORDER;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation clusterBlueprintRegistration(FancyPinClusterBlueprint fancyPinClusterBlueprint, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(fancyPinClusterBlueprint, g0u);
                Kind kind = Kind.REGISTER_CLUSTER_BLUEPRINT;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, null, null, null, null, g0u, c0881AGi, fancyPinClusterBlueprint);
            }

            public final PendingSourceMutation removal(List<String> list, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(list, g0u);
                Kind kind = Kind.REMOVE;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, list, null, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation replacement(FancyPinSourceState fancyPinSourceState, List<byte[]> list, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass005.A0y(fancyPinSourceState, list, g0u);
                Kind kind = Kind.REPLACE;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, fancyPinSourceState, list, fancyPinRuntimeClusterCatalogPublication, c0881AGi, c0881AGi, null, null, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation setActiveVariant(String str, String str2, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass005.A0x(str, str2, g0u);
                Kind kind = Kind.SET_ACTIVE_VARIANT;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, str2, null, null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation setRank(String str, int i, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0v(str, g0u);
                Kind kind = Kind.SET_RANK;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, null, Integer.valueOf(i), null, g0u, c0881AGi, null);
            }

            public final PendingSourceMutation setZOrder(String str, float f, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0v(str, g0u);
                Kind kind = Kind.SET_Z_ORDER;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, c0881AGi, c0881AGi, str, null, null, Float.valueOf(f), g0u, c0881AGi, null);
            }

            public final PendingSourceMutation update(List<FancyPin> list, G0U<? super HsJ<Unit>, Unit> g0u) {
                AnonymousClass003.A0u(list, g0u);
                Kind kind = Kind.UPDATE;
                C0881AGi c0881AGi = C0881AGi.A00;
                return new PendingSourceMutation(kind, null, null, null, list, c0881AGi, null, null, null, null, g0u, c0881AGi, null);
            }

            public Companion() {
            }

            public /* synthetic */ Companion(C06H c06h) {
            }
        }

        public final void complete(Object obj) {
            if (this.completed) {
                return;
            }
            this.completed = true;
            this.completion.invoke(new HsJ<>(obj));
        }

        public final List<FancyPinBlueprint> getBlueprints() {
            return this.blueprints;
        }

        public final FancyPinClusterBlueprint getClusterBlueprint() {
            return this.clusterBlueprint;
        }

        public final FancyPinRuntimeClusterCatalogPublication getClusterCatalogPublication() {
            return this.clusterCatalogPublication;
        }

        public final Kind getKind() {
            return this.kind;
        }

        public final String getPinId() {
            return this.pinId;
        }

        public final List<String> getPinIds() {
            return this.pinIds;
        }

        public final List<FancyPin> getPins() {
            return this.pins;
        }

        public final Integer getRank() {
            return this.rank;
        }

        public final FancyPinSourceState getReplacementCandidate() {
            return this.replacementCandidate;
        }

        public final List<byte[]> getSerializedBlueprints() {
            return this.serializedBlueprints;
        }

        public final String getVariantId() {
            return this.variantId;
        }

        public final Float getZOrder() {
            return this.zOrder;
        }

        public /* synthetic */ PendingSourceMutation(Kind kind, FancyPinSourceState fancyPinSourceState, List list, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, List list2, List list3, String str, String str2, Integer num, Float f, G0U g0u, List list4, FancyPinClusterBlueprint fancyPinClusterBlueprint, C06H c06h) {
            this(kind, fancyPinSourceState, list, fancyPinRuntimeClusterCatalogPublication, list2, list3, str, str2, num, f, g0u, list4, fancyPinClusterBlueprint);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PendingSourceMutation(Kind kind, FancyPinSourceState fancyPinSourceState, List<byte[]> list, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, List<FancyPin> list2, List<String> list3, String str, String str2, Integer num, Float f, G0U<? super HsJ<Unit>, Unit> g0u, List<FancyPinBlueprint> list4, FancyPinClusterBlueprint fancyPinClusterBlueprint) {
            this.kind = kind;
            this.replacementCandidate = fancyPinSourceState;
            this.serializedBlueprints = list;
            this.clusterCatalogPublication = fancyPinRuntimeClusterCatalogPublication;
            this.pins = list2;
            this.pinIds = list3;
            this.pinId = str;
            this.variantId = str2;
            this.rank = num;
            this.zOrder = f;
            this.completion = g0u;
            this.blueprints = list4;
            this.clusterBlueprint = fancyPinClusterBlueprint;
        }

        public /* synthetic */ PendingSourceMutation(Kind kind, FancyPinSourceState fancyPinSourceState, List list, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, List list2, List list3, String str, String str2, Integer num, Float f, G0U g0u, List list4, FancyPinClusterBlueprint fancyPinClusterBlueprint, int i, C06H c06h) {
            this(kind, fancyPinSourceState, list, fancyPinRuntimeClusterCatalogPublication, list2, list3, str, str2, num, f, g0u, (i & 2048) != 0 ? C0881AGi.A00 : list4, (i & 4096) != 0 ? null : fancyPinClusterBlueprint);
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$addPins$1, reason: invalid class name and case insensitive filesystem */
    public final class C144461 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144461 INSTANCE = new C144461();

        public C144461() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3882invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearActiveVariant$1, reason: invalid class name and case insensitive filesystem */
    public final class C144471 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144471 INSTANCE = new C144471();

        public C144471() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3883invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearActiveVariant$3, reason: invalid class name and case insensitive filesystem */
    public final class C144483 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144483(String str) {
            super(0);
            this.$pinId = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.clearActiveVariant(this.$pinId));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearRank$1, reason: invalid class name and case insensitive filesystem */
    public final class C144491 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144491 INSTANCE = new C144491();

        public C144491() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3884invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearRank$3, reason: invalid class name and case insensitive filesystem */
    public final class C144503 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144503(String str) {
            super(0);
            this.$pinId = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.clearRank(this.$pinId));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearZOrder$1, reason: invalid class name and case insensitive filesystem */
    public final class C144511 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144511 INSTANCE = new C144511();

        public C144511() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3885invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$clearZOrder$3, reason: invalid class name and case insensitive filesystem */
    public final class C144523 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144523(String str) {
            super(0);
            this.$pinId = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.clearZOrder(this.$pinId));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$publishData$1, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144531 extends C7438Evz implements G0U<FancyPinRetirement, Unit> {
        public C144531(Object obj) {
            super(1, obj, FancyPinDataController.class, "completeVisualRetirement", "completeVisualRetirement(Lcom/meta/maps/fancypins/FancyPinRetirement;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FancyPinRetirement fancyPinRetirement) {
            ((FancyPinDataController) AnonymousClass006.A0o(fancyPinRetirement, this)).completeVisualRetirement(fancyPinRetirement);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(FancyPinRetirement fancyPinRetirement) {
            invoke2(fancyPinRetirement);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$registerBlueprint$1, reason: invalid class name and case insensitive filesystem */
    public final class C144541 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144541 INSTANCE = new C144541();

        public C144541() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3886invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$registerBlueprints$1, reason: invalid class name and case insensitive filesystem */
    public final class C144551 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144551 INSTANCE = new C144551();

        public C144551() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3887invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$registerClusterBlueprint$1, reason: invalid class name and case insensitive filesystem */
    public final class C144561 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144561 INSTANCE = new C144561();

        public C144561() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3888invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$removeAllPins$1, reason: invalid class name and case insensitive filesystem */
    public final class C144571 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144571 INSTANCE = new C144571();

        public C144571() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3889invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$removePins$1, reason: invalid class name and case insensitive filesystem */
    public final class C144581 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144581 INSTANCE = new C144581();

        public C144581() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3890invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$replaceData$1, reason: invalid class name and case insensitive filesystem */
    public final class C144591 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144591 INSTANCE = new C144591();

        public C144591() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3891invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$replaceDataWithClusters$1, reason: invalid class name and case insensitive filesystem */
    public final class C144601 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144601 INSTANCE = new C144601();

        public C144601() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3892invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setActiveVariant$1, reason: invalid class name and case insensitive filesystem */
    public final class C144611 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144611 INSTANCE = new C144611();

        public C144611() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3893invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setActiveVariant$3, reason: invalid class name and case insensitive filesystem */
    public final class C144623 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;
        public final /* synthetic */ String $variantId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144623(String str, String str2) {
            super(0);
            this.$pinId = str;
            this.$variantId = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.setActiveVariant(this.$pinId, this.$variantId));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setRank$1, reason: invalid class name and case insensitive filesystem */
    public final class C144631 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144631 INSTANCE = new C144631();

        public C144631() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3894invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setRank$3, reason: invalid class name and case insensitive filesystem */
    public final class C144643 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;
        public final /* synthetic */ int $rank;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144643(String str, int i) {
            super(0);
            this.$pinId = str;
            this.$rank = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.setRank(this.$pinId, this.$rank));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setZOrder$1, reason: invalid class name and case insensitive filesystem */
    public final class C144651 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144651 INSTANCE = new C144651();

        public C144651() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3895invoke(Object obj) {
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$setZOrder$4, reason: invalid class name and case insensitive filesystem */
    public final class C144664 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ String $pinId;
        public final /* synthetic */ float $zOrder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144664(String str, float f) {
            super(0);
            this.$pinId = str;
            this.$zOrder = f;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = FancyPinDataController.this.runtimeClusterFrameConsumer;
            if (fancyPinRuntimeClusterFrameConsumer != null) {
                return Boolean.valueOf(fancyPinRuntimeClusterFrameConsumer.setZOrder(this.$pinId, this.$zOrder));
            }
            return null;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$startReplacement$1, reason: invalid class name and case insensitive filesystem */
    public final class C144671 extends AbstractC7559F3s implements G0U<FancyPinMeasurementBatch, Unit> {
        public final /* synthetic */ FancyPinSourceState $candidate;
        public final /* synthetic */ PendingSourceMutation $request;

        /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(com.meta.maps.fancypins.FancyPinMeasurementBatch r16) {
            /*
                r15 = this;
                r0 = 0
                r6 = r16
                X.C7384Etj.A0Y(r6, r0)
                r4 = r15
                com.meta.maps.fancypins.FancyPinDataController r7 = com.meta.maps.fancypins.FancyPinDataController.this
                java.lang.Object r0 = r7.activeMutation
                com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r5 = r15.$request
                if (r0 != r5) goto L72
                com.meta.maps.fancypins.FancyPinSourceState r1 = r15.$candidate
                int r0 = r7.publicationDepth
                int r0 = r0 + 1
                r7.publicationDepth = r0
                java.util.Map<java.lang.String, java.lang.Long> r0 = r6.registrationRevisions     // Catch: java.lang.Throwable -> L4a
                com.meta.maps.fancypins.FancyPinSourceState r3 = r1.withRegistrationRevisions(r0)     // Catch: java.lang.Throwable -> L4a
                java.util.List<com.meta.maps.fancypins.PinMeasurement> r2 = r6.measurements     // Catch: java.lang.Throwable -> L4a
                X.AGi r1 = X.C0881AGi.A00     // Catch: java.lang.Throwable -> L4a
                java.util.Map<java.lang.String, java.lang.Long> r0 = r6.registrationRevisions     // Catch: java.lang.Throwable -> L4a
                com.meta.maps.fancypins.FancyPinSourceState r8 = r3.withCaches(r2, r1, r0)     // Catch: java.lang.Throwable -> L4a
                java.util.List r0 = r8.getPinIds()     // Catch: java.lang.Throwable -> L4a
                java.util.Set r12 = X.AbstractC0878AGe.A0g(r0)     // Catch: java.lang.Throwable -> L4a
                java.util.Map<java.lang.String, java.lang.Long> r9 = r6.registrationRevisions     // Catch: java.lang.Throwable -> L4a
                java.util.List<byte[]> r10 = r5.serializedBlueprints     // Catch: java.lang.Throwable -> L4a
                if (r10 == 0) goto L45
                java.util.List r11 = r8.getMeasurements()     // Catch: java.lang.Throwable -> L4a
                com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublication r14 = r5.clusterCatalogPublication     // Catch: java.lang.Throwable -> L4a
                r15 = 1
                r13 = r12
                r16 = r15
                com.meta.maps.fancypins.FancyPinDataController.access$publishData(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L4a
                kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4a
                goto L4f
            L45:
                java.lang.IllegalStateException r0 = X.BV4.A0U()     // Catch: java.lang.Throwable -> L4a
                throw r0     // Catch: java.lang.Throwable -> L4a
            L4a:
                r0 = move-exception
                X.Hud r3 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> L6a
            L4f:
                int r0 = r7.publicationDepth
                int r0 = r0 + (-1)
                r7.publicationDepth = r0
                java.lang.Throwable r2 = X.HsJ.A00(r3)
                if (r2 == 0) goto L62
                java.lang.String r1 = "FancyPinDataController"
                java.lang.String r0 = "FancyPins: Failed to publish measured source snapshot"
                android.util.Log.e(r1, r0, r2)
            L62:
                com.meta.maps.fancypins.FancyPinDataController r1 = com.meta.maps.fancypins.FancyPinDataController.this
                com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r0 = r4.$request
                com.meta.maps.fancypins.FancyPinDataController.access$finishMutation(r1, r0, r3)
                return
            L6a:
                r1 = move-exception
                int r0 = r7.publicationDepth
                int r0 = r0 + (-1)
                r7.publicationDepth = r0
                throw r1
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.C144671.invoke2(com.meta.maps.fancypins.FancyPinMeasurementBatch):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144671(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState) {
            super(1);
            this.$request = pendingSourceMutation;
            this.$candidate = fancyPinSourceState;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            invoke2(fancyPinMeasurementBatch);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$startReplacement$2, reason: invalid class name and case insensitive filesystem */
    public final class C144682 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ PendingSourceMutation $request;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            if (!(th instanceof CancellationException)) {
                Log.e(FancyPinDataController.TAG, "FancyPins: Failed to measure source snapshot", th);
            }
            FancyPinDataController.this.finishMutation(this.$request, C3cG.A0s(th));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144682(PendingSourceMutation pendingSourceMutation) {
            super(1);
            this.$request = pendingSourceMutation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$submitIncrementalMeasurement$1, reason: invalid class name and case insensitive filesystem */
    public final class C144691 extends AbstractC7559F3s implements G0U<FancyPinMeasurementBatch, Unit> {
        public final /* synthetic */ FancyPinSourceState $candidate;
        public final /* synthetic */ FancyPinRuntimeClusterCatalogPublication $clusterCatalogPublication;
        public final /* synthetic */ Set<String> $contentDirtyPinIds;
        public final /* synthetic */ Set<String> $explicitlyChangedPinIds;
        public final /* synthetic */ boolean $fullReplay;
        public final /* synthetic */ PendingSourceMutation $request;
        public final /* synthetic */ List<byte[]> $serializedBlueprints;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            Object objA0s;
            C7384Etj.A0Y(fancyPinMeasurementBatch, 0);
            FancyPinDataController fancyPinDataController = FancyPinDataController.this;
            if (fancyPinDataController.activeMutation == this.$request) {
                Set setPinIdsRequiringRefresh = fancyPinDataController.pinIdsRequiringRefresh(this.$candidate, this.$explicitlyChangedPinIds, fancyPinMeasurementBatch.registrationRevisions);
                List<FancyPin> list = fancyPinMeasurementBatch.pins;
                HashSet hashSetA13 = C60O.A13();
                Iterator<FancyPin> it = list.iterator();
                while (it.hasNext()) {
                    AbstractC7609F5w.A1Q(hashSetA13, it);
                }
                boolean zContainsAll = hashSetA13.containsAll(setPinIdsRequiringRefresh);
                FancyPinDataController fancyPinDataController2 = FancyPinDataController.this;
                if (!zContainsAll) {
                    fancyPinDataController2.submitIncrementalMeasurement(this.$request, this.$candidate, this.$explicitlyChangedPinIds, setPinIdsRequiringRefresh, this.$contentDirtyPinIds, this.$serializedBlueprints, this.$fullReplay, this.$clusterCatalogPublication);
                    return;
                }
                FancyPinSourceState fancyPinSourceState = this.$candidate;
                List<byte[]> list2 = this.$serializedBlueprints;
                boolean z = this.$fullReplay;
                Set<String> set = this.$contentDirtyPinIds;
                FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication = this.$clusterCatalogPublication;
                fancyPinDataController2.publicationDepth++;
                try {
                    FancyPinSourceState fancyPinSourceStateWithCaches = fancyPinSourceState.withRegistrationRevisions(fancyPinMeasurementBatch.registrationRevisions).withCaches(fancyPinMeasurementBatch.measurements, C0881AGi.A00, fancyPinMeasurementBatch.registrationRevisions);
                    FancyPinDataController.publishData$default(fancyPinDataController2, fancyPinSourceStateWithCaches, fancyPinMeasurementBatch.registrationRevisions, list2, z ? fancyPinSourceStateWithCaches.getMeasurements() : fancyPinMeasurementBatch.measurements, hashSetA13, set, fancyPinRuntimeClusterCatalogPublication, z, false, 256, null);
                    objA0s = Unit.INSTANCE;
                } finally {
                    try {
                        fancyPinDataController2.publicationDepth--;
                        FancyPinDataController.this.finishIncrementalPublication(this.$request, objA0s);
                    } catch (Throwable th) {
                    }
                }
                fancyPinDataController2.publicationDepth--;
                FancyPinDataController.this.finishIncrementalPublication(this.$request, objA0s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144691(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, Set<String> set, Set<String> set2, List<byte[]> list, boolean z, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication) {
            super(1);
            this.$request = pendingSourceMutation;
            this.$candidate = fancyPinSourceState;
            this.$explicitlyChangedPinIds = set;
            this.$contentDirtyPinIds = set2;
            this.$serializedBlueprints = list;
            this.$fullReplay = z;
            this.$clusterCatalogPublication = fancyPinRuntimeClusterCatalogPublication;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(FancyPinMeasurementBatch fancyPinMeasurementBatch) {
            invoke2(fancyPinMeasurementBatch);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$submitIncrementalMeasurement$2, reason: invalid class name and case insensitive filesystem */
    public final class C144702 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ PendingSourceMutation $request;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            if (!(th instanceof CancellationException)) {
                Log.e(FancyPinDataController.TAG, "FancyPins: Failed to measure incremental source mutation", th);
            }
            FancyPinDataController.this.finishMutation(this.$request, C3cG.A0s(th));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C144702(PendingSourceMutation pendingSourceMutation) {
            super(1);
            this.$request = pendingSourceMutation;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinDataController$updatePins$1, reason: invalid class name and case insensitive filesystem */
    public final class C144711 extends AbstractC7559F3s implements G0U<HsJ<? extends Unit>, Unit> {
        public static final C144711 INSTANCE = new C144711();

        public C144711() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HsJ<? extends Unit> hsJ) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m3896invoke(Object obj) {
        }
    }

    private final void prepareIncremental(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, Set<String> set, Set<String> set2, List<byte[]> list, boolean z, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication) {
        Object objA0s;
        Object objA0s2;
        FancyPinMeasurementPipeline fancyPinMeasurementPipeline = this.measurementPipeline;
        try {
            if (fancyPinMeasurementPipeline == null) {
                this.publicationDepth++;
                try {
                    if (!set.isEmpty()) {
                        throw C3cG.A0Q("Asynchronous FancyPin measurement is unavailable for this internal controller");
                    }
                    publishData(fancyPinSourceState, null, list, z ? fancyPinSourceState.getMeasurements() : C0881AGi.A00, set, set2, fancyPinRuntimeClusterCatalogPublication, z, false);
                    objA0s2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    objA0s2 = C3cG.A0s(th);
                }
            } else {
                try {
                    objA0s = fancyPinMeasurementPipeline.registrationRevisions(fancyPinSourceState.getBlueprints());
                } catch (Throwable th2) {
                    objA0s = C3cG.A0s(th2);
                }
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 != null) {
                    finishMutation(pendingSourceMutation, C3cG.A0s(thA00));
                    return;
                }
                Map<String, Long> map = (Map) objA0s;
                Set<String> setPinIdsRequiringRefresh = pinIdsRequiringRefresh(fancyPinSourceState, set, map);
                if (!setPinIdsRequiringRefresh.isEmpty()) {
                    submitIncrementalMeasurement(pendingSourceMutation, fancyPinSourceState, set, setPinIdsRequiringRefresh, set2, list, z, fancyPinRuntimeClusterCatalogPublication);
                    return;
                }
                this.publicationDepth++;
                try {
                    publishData(fancyPinSourceState.withRegistrationRevisions(map), map, list, z ? fancyPinSourceState.getMeasurements() : C0881AGi.A00, A3q.A00, set2, fancyPinRuntimeClusterCatalogPublication, z, false);
                    objA0s2 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    objA0s2 = C3cG.A0s(th3);
                }
            }
            this.publicationDepth--;
            finishIncrementalPublication(pendingSourceMutation, objA0s2);
        } catch (Throwable th4) {
            this.publicationDepth--;
            throw th4;
        }
    }

    private final void publishZOrder(FancyPinSourceState fancyPinSourceState, String str) {
        this.requiresFullReplay = true;
        this.slotConsumer.updateZOrder(this.engine, str, fancyPinSourceState.zOrderOverride(str));
        this.sourceStore.current = fancyPinSourceState;
        this.requiresFullReplay = false;
        this.committedMutation = this.activeMutation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:39:0x00a0, B:42:0x00a7, B:43:0x00b3, B:45:0x00b9), top: B:69:0x00a0 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.A3q] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Hud] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.meta.maps.fancypins.FancyPinDataController] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startIncremental(com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation r10) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.startIncremental(com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitIncrementalMeasurement(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, Set<String> set, Set<String> set2, Set<String> set3, List<byte[]> list, boolean z, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication) {
        FancyPinMeasurementPipeline fancyPinMeasurementPipeline = this.measurementPipeline;
        if (fancyPinMeasurementPipeline == null) {
            throw BV4.A0U();
        }
        List<FancyPin> pins = fancyPinSourceState.getPins();
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPin fancyPin : pins) {
            C60Q.A1G(fancyPin.id, fancyPin, arrayListA0h, set2);
        }
        fancyPinMeasurementPipeline.submit(arrayListA0h, fancyPinSourceState.getBlueprints(), new C144691(pendingSourceMutation, fancyPinSourceState, set, set3, list, z, fancyPinRuntimeClusterCatalogPublication), new C144702(pendingSourceMutation), C9jH.A00);
    }

    public final FancyPinBlueprint blueprint(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread("blueprint");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        return this.sourceStore.current.blueprint(str);
    }

    public final List<String> clusterMemberPinIds(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread("clusterMemberPinIds");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (!str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            return null;
        }
        List<String> listCopyRuntimeClusterMemberPinIds = this.engine.copyRuntimeClusterMemberPinIds(str);
        if (listCopyRuntimeClusterMemberPinIds.isEmpty()) {
            return null;
        }
        return AbstractC0878AGe.A0X(listCopyRuntimeClusterMemberPinIds);
    }

    public final boolean onRenderFrame$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(FancyPinRenderFrame fancyPinRenderFrame) {
        C7384Etj.A0Y(fancyPinRenderFrame, 0);
        checkMainThread("onRenderFrame");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = this.runtimeClusterFrameConsumer;
        if (fancyPinRuntimeClusterFrameConsumer != null) {
            return fancyPinRuntimeClusterFrameConsumer.onFrame(fancyPinRenderFrame);
        }
        return true;
    }

    public final FancyPin pin(String str) {
        C7384Etj.A0Y(str, 0);
        checkMainThread("pin");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        return this.sourceStore.current.pin(str);
    }

    public final List<String> rankedClusterMemberPinIds(String str, int i) {
        C7384Etj.A0Y(str, 0);
        checkMainThread("rankedClusterMemberPinIds");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (!str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            return null;
        }
        FancyPinEngineDataSink fancyPinEngineDataSink = this.engine;
        if (i < 0) {
            i = 0;
        }
        List<String> listCopyRankedRuntimeClusterMemberPinIds = fancyPinEngineDataSink.copyRankedRuntimeClusterMemberPinIds(str, i);
        if (listCopyRankedRuntimeClusterMemberPinIds.isEmpty()) {
            return null;
        }
        return AbstractC0878AGe.A0X(listCopyRankedRuntimeClusterMemberPinIds);
    }

    public final void removeAllPins(G0U<? super HsJ<Unit>, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        checkMainThread("removeAllPins");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        List<String> pinIds = this.projectedSourceState.getPinIds();
        if (pinIds.isEmpty() && this.activeMutation == null && this.pendingMutations.isEmpty()) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.removal(pinIds, g0u), this.projectedSourceState.removing(pinIds));
        }
    }

    public final void replaceData(List<FancyPin> list, List<FancyPinBlueprint> list2, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass005.A17(list, list2, map, map2, map3);
        C7384Etj.A0Y(g0u, 5);
        replaceDataInternal(list, list2, null, map, map2, map3, g0u);
    }

    public final void replaceDataNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, Map<String, Long> map4) {
        AnonymousClass005.A17(list, list2, list3, map, map2);
        C7384Etj.A0Y(map3, 5);
        replaceDataNowInternal(list, list2, null, list3, map, map2, map3, map4);
    }

    public final FancyPin runtimeClusterPin(String str) {
        FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer;
        C7384Etj.A0Y(str, 0);
        checkMainThread("runtimeClusterPin");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (!str.startsWith(FancyPinRuntimeClusterId.PREFIX) || (fancyPinRuntimeClusterFrameConsumer = this.runtimeClusterFrameConsumer) == null) {
            return null;
        }
        return fancyPinRuntimeClusterFrameConsumer.pin(str);
    }

    /* loaded from: classes5.dex */
    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public final Executor mainThreadExecutor() {
            final Handler handlerA02 = C60O.A02();
            return new Executor() { // from class: com.meta.maps.fancypins.FancyPinDataController$Companion$mainThreadExecutor$1
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    if (C3cH.A1K()) {
                        runnable.run();
                    } else if (!handlerA02.post(runnable)) {
                        throw new RejectedExecutionException("FancyPin data controller rejected measurement");
                    }
                }
            };
        }

        public Companion() {
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PendingSourceMutation.Kind.values().length];
            try {
                AnonymousClass002.A13(PendingSourceMutation.Kind.SET_ACTIVE_VARIANT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PendingSourceMutation.Kind.CLEAR_ACTIVE_VARIANT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PendingSourceMutation.Kind.SET_RANK, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PendingSourceMutation.Kind.CLEAR_RANK, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(PendingSourceMutation.Kind.SET_Z_ORDER, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(PendingSourceMutation.Kind.CLEAR_Z_ORDER, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(PendingSourceMutation.Kind.ADD, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(PendingSourceMutation.Kind.UPDATE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(PendingSourceMutation.Kind.REMOVE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(PendingSourceMutation.Kind.REGISTER_BLUEPRINTS, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(PendingSourceMutation.Kind.REGISTER_CLUSTER_BLUEPRINT, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(PendingSourceMutation.Kind.REPLACE, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FancyPinDataController(FancyPinEngineDataSink fancyPinEngineDataSink, FancyPinLayoutDataSink fancyPinLayoutDataSink, FancyPinSlotConsumer fancyPinSlotConsumer, FancyPinMeasurementPipeline fancyPinMeasurementPipeline, FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, Function0 function0, int i, C06H c06h) {
        this(fancyPinEngineDataSink, fancyPinLayoutDataSink, fancyPinSlotConsumer, (i & 8) != 0 ? null : fancyPinMeasurementPipeline, (i & 16) != 0 ? null : fancyPinRuntimeClusterFrameConsumer, (i & 32) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addPins$default(FancyPinDataController fancyPinDataController, List list, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144461.INSTANCE;
        }
        fancyPinDataController.addPins(list, g0u);
    }

    private final List<PendingSourceMutation> cancelDependentQueuedMutations() {
        List<PendingSourceMutation> listA0X = AbstractC0878AGe.A0X(this.pendingMutations);
        Iterator<PendingSourceMutation> it = listA0X.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next().kind != PendingSourceMutation.Kind.REPLACE) {
                i++;
            } else if (i >= 0) {
                List<PendingSourceMutation> listA0a = AbstractC0878AGe.A0a(listA0X, i);
                this.pendingMutations.clear();
                this.pendingMutations.addAll(AbstractC0878AGe.A0Z(listA0X, i));
                rebuildProjectedClusterBlueprintsFromPending();
                return listA0a;
            }
        }
        this.pendingMutations.clear();
        this.projectedSourceState = this.sourceStore.current;
        this.projectedClusterBlueprints = this.committedRuntimeClusterCatalog.blueprints;
        return listA0X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearActiveVariant$default(FancyPinDataController fancyPinDataController, String str, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144471.INSTANCE;
        }
        fancyPinDataController.clearActiveVariant(str, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearRank$default(FancyPinDataController fancyPinDataController, String str, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144491.INSTANCE;
        }
        fancyPinDataController.clearRank(str, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void clearZOrder$default(FancyPinDataController fancyPinDataController, String str, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144511.INSTANCE;
        }
        fancyPinDataController.clearZOrder(str, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void close$recordFailure(C10543Hqv<Throwable> c10543Hqv, Throwable th) {
        Throwable th2 = c10543Hqv.element;
        if (th2 == null) {
            c10543Hqv.element = th;
        } else if (th2 != th) {
            CU7.A01(th2, th);
        }
    }

    private final List<FancyPinClusterBlueprint> clusterBlueprintsPreservedBySourceReplacement() {
        PendingSourceMutation pendingSourceMutation;
        List<FancyPinClusterBlueprint> list;
        if (this.publicationDepth != 0) {
            Object obj = this.activeMutation;
            if ((obj instanceof PendingSourceMutation) && (pendingSourceMutation = (PendingSourceMutation) obj) != null) {
                FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication = pendingSourceMutation.clusterCatalogPublication;
                if (fancyPinRuntimeClusterCatalogPublication != null && (list = fancyPinRuntimeClusterCatalogPublication.blueprints) != null) {
                    return list;
                }
                FancyPinClusterBlueprint fancyPinClusterBlueprint = pendingSourceMutation.clusterBlueprint;
                if (fancyPinClusterBlueprint != null) {
                    return AbstractC0878AGe.A0Q(fancyPinClusterBlueprint, this.committedRuntimeClusterCatalog.blueprints);
                }
            }
        }
        return this.committedRuntimeClusterCatalog.blueprints;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void completeVisualRetirement(FancyPinRetirement fancyPinRetirement) {
        checkMainThread("completeVisualRetirement");
        if (this.awaitingVisualRetirements.get(fancyPinRetirement.pinId) == fancyPinRetirement) {
            this.awaitingVisualRetirements.remove(fancyPinRetirement.pinId);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        throw X.BV4.A0U();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void drainMutations() {
        /*
            r13 = this;
            boolean r0 = r13.drainingMutations
            if (r0 != 0) goto L89
            java.lang.Object r0 = r13.activeMutation
            if (r0 != 0) goto L89
            boolean r0 = r13.closeStarted
            if (r0 != 0) goto L89
            r0 = 1
            r13.drainingMutations = r0
        Lf:
            r1 = 0
            java.lang.Object r0 = r13.activeMutation     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L82
            java.util.ArrayDeque<com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation> r0 = r13.pendingMutations     // Catch: java.lang.Throwable -> L85
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L82
            boolean r0 = r13.closeStarted     // Catch: java.lang.Throwable -> L85
            if (r0 != 0) goto L82
            java.util.ArrayDeque<com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation> r0 = r13.pendingMutations     // Catch: java.lang.Throwable -> L85
            java.lang.Object r2 = r0.removeFirst()     // Catch: java.lang.Throwable -> L85
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r2 = (com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation) r2     // Catch: java.lang.Throwable -> L85
            r13.activeMutation = r2     // Catch: java.lang.Throwable -> L85
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r3 = r2.kind     // Catch: java.lang.Throwable -> L85
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.REPLACE     // Catch: java.lang.Throwable -> L85
            if (r3 != r0) goto L5d
            com.meta.maps.fancypins.FancyPinSourceState r3 = r2.replacementCandidate     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L7d
            com.meta.maps.fancypins.FancyPinSourceStateStore r4 = r13.sourceStore     // Catch: java.lang.Throwable -> L85
            java.util.List r5 = r3.getPins()     // Catch: java.lang.Throwable -> L85
            java.util.List r6 = r3.getBlueprints()     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r3.activeVariantsByPinId     // Catch: java.lang.Throwable -> L85
            java.util.Map r9 = X.AGH.A0A(r0)     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap<java.lang.String, java.lang.Integer> r0 = r3.rankOverridesByPinId     // Catch: java.lang.Throwable -> L85
            java.util.Map r10 = X.AGH.A0A(r0)     // Catch: java.lang.Throwable -> L85
            java.util.LinkedHashMap<java.lang.String, java.lang.Float> r0 = r3.zOrderOverridesByPinId     // Catch: java.lang.Throwable -> L85
            java.util.Map r11 = X.AGH.A0A(r0)     // Catch: java.lang.Throwable -> L85
            X.AGi r7 = X.C0881AGi.A00     // Catch: java.lang.Throwable -> L85
            X.9jH r12 = X.C9jH.A00     // Catch: java.lang.Throwable -> L85
            r8 = r7
            com.meta.maps.fancypins.FancyPinSourceState r0 = r4.replacement(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L85
            r13.startReplacement(r2, r0)     // Catch: java.lang.Throwable -> L85
            goto Lf
        L5d:
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.SET_ACTIVE_VARIANT     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.CLEAR_ACTIVE_VARIANT     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.SET_RANK     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.CLEAR_RANK     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.SET_Z_ORDER     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Kind r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Kind.CLEAR_Z_ORDER     // Catch: java.lang.Throwable -> L85
            if (r3 == r0) goto L79
            r13.startIncremental(r2)     // Catch: java.lang.Throwable -> L85
            goto Lf
        L79:
            r13.startFrameStateMutation(r2)     // Catch: java.lang.Throwable -> L85
            goto Lf
        L7d:
            java.lang.IllegalStateException r0 = X.BV4.A0U()     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L82:
            r13.drainingMutations = r1
            return
        L85:
            r0 = move-exception
            r13.drainingMutations = r1
            throw r0
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.drainMutations():void");
    }

    private final void enqueueCatalogMutation(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, List<FancyPinClusterBlueprint> list) {
        this.projectedSourceState = fancyPinSourceState;
        this.projectedClusterBlueprints = list;
        this.pendingMutations.addLast(pendingSourceMutation);
        drainMutations();
    }

    private final void enqueueIncremental(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState) {
        this.projectedSourceState = fancyPinSourceState;
        this.pendingMutations.addLast(pendingSourceMutation);
        drainMutations();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishMutation(PendingSourceMutation pendingSourceMutation, Object obj) {
        List<PendingSourceMutation> listCancelDependentQueuedMutations;
        if (this.activeMutation != pendingSourceMutation) {
            pendingSourceMutation.complete(obj);
            return;
        }
        this.activeMutation = null;
        this.committedMutation = null;
        if (obj instanceof C10571Hud) {
            listCancelDependentQueuedMutations = cancelDependentQueuedMutations();
        } else {
            if (this.pendingMutations.isEmpty()) {
                this.projectedSourceState = this.sourceStore.current;
                this.projectedClusterBlueprints = this.committedRuntimeClusterCatalog.blueprints;
            }
            listCancelDependentQueuedMutations = C0881AGi.A00;
        }
        try {
            pendingSourceMutation.complete(obj);
        } finally {
            CancellationException cancellationException = new CancellationException("FancyPin mutation was cancelled after an earlier failure");
            Iterator<PendingSourceMutation> it = listCancelDependentQueuedMutations.iterator();
            while (it.hasNext()) {
                C10571Hud.A00(cancellationException, it);
            }
            drainMutations();
        }
    }

    private final void finishSynchronousMutation(Object obj, Object obj2) {
        List<PendingSourceMutation> listCancelDependentQueuedMutations;
        if (this.activeMutation == obj) {
            this.activeMutation = null;
            this.committedMutation = null;
            if (obj2 instanceof C10571Hud) {
                listCancelDependentQueuedMutations = cancelDependentQueuedMutations();
            } else {
                if (this.pendingMutations.isEmpty()) {
                    this.projectedSourceState = this.sourceStore.current;
                    this.projectedClusterBlueprints = this.committedRuntimeClusterCatalog.blueprints;
                }
                listCancelDependentQueuedMutations = C0881AGi.A00;
            }
            CancellationException cancellationException = new CancellationException("FancyPin mutation was cancelled after an earlier failure");
            Iterator<PendingSourceMutation> it = listCancelDependentQueuedMutations.iterator();
            while (it.hasNext()) {
                C10571Hud.A00(cancellationException, it);
            }
            drainMutations();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List makeStates$default(FancyPinDataController fancyPinDataController, FancyPinSourceState fancyPinSourceState, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = fancyPinSourceState.getPins();
        }
        if ((i & 4) != 0) {
            list2 = fancyPinSourceState.getBlueprints();
        }
        return fancyPinDataController.makeStates(fancyPinSourceState, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> pinIdsRequiringRefresh(FancyPinSourceState fancyPinSourceState, Set<String> set, Map<String, Long> map) {
        Set setKeySet = AGH.A0A(fancyPinSourceState.registrationRevisionsByBlueprintId).keySet();
        HashSet hashSetA13 = C60O.A13();
        for (Object obj : setKeySet) {
            if (!C7384Etj.areEqual(AGH.A0A(fancyPinSourceState.registrationRevisionsByBlueprintId).get(obj), map.get(obj))) {
                hashSetA13.add(obj);
            }
        }
        List<FancyPin> pins = fancyPinSourceState.getPins();
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPin fancyPin : pins) {
            FancyPin fancyPin2 = fancyPin;
            if (set.contains(fancyPin2.id) || hashSetA13.contains(fancyPin2.blueprintId)) {
                arrayListA0h.add(fancyPin);
            }
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            AbstractC7609F5w.A1Q(linkedHashSetA0k, it);
        }
        return linkedHashSetA0k;
    }

    public static /* synthetic */ void prepareIncremental$default(FancyPinDataController fancyPinDataController, PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, Set set, Set set2, List list, boolean z, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, int i, Object obj) {
        if ((i & 64) != 0) {
            fancyPinRuntimeClusterCatalogPublication = null;
        }
        fancyPinDataController.prepareIncremental(pendingSourceMutation, fancyPinSourceState, set, set2, list, z, fancyPinRuntimeClusterCatalogPublication);
    }

    public static /* synthetic */ void publishData$default(FancyPinDataController fancyPinDataController, FancyPinSourceState fancyPinSourceState, Map map, List list, List list2, Set set, Set set2, FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication, boolean z, boolean z2, int i, Object obj) {
        if ((i & 64) != 0) {
            fancyPinRuntimeClusterCatalogPublication = null;
        }
        fancyPinDataController.publishData(fancyPinSourceState, map, list, list2, set, set2, fancyPinRuntimeClusterCatalogPublication, C3cG.A1K(i & 128, z), C3cG.A1K(i & 256, z2));
    }

    private final void queueReplacement(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState, List<FancyPinClusterBlueprint> list) {
        CancellationException cancellationException = new CancellationException("FancyPin mutation was superseded by replacement");
        List listA0X = AbstractC0878AGe.A0X(this.pendingMutations);
        this.pendingMutations.clear();
        this.projectedSourceState = fancyPinSourceState;
        this.projectedClusterBlueprints = list;
        this.pendingMutations.addLast(pendingSourceMutation);
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            C10571Hud.A00(cancellationException, it);
        }
    }

    public static /* synthetic */ List rankedClusterMemberPinIds$default(FancyPinDataController fancyPinDataController, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return fancyPinDataController.rankedClusterMemberPinIds(str, i);
    }

    private final void rebuildProjectedClusterBlueprintsFromPending() {
        FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication;
        List<FancyPinClusterBlueprint> listA0c = this.committedRuntimeClusterCatalog.blueprints;
        Iterator<PendingSourceMutation> it = this.pendingMutations.iterator();
        C7384Etj.A0U(it);
        while (it.hasNext()) {
            PendingSourceMutation next = it.next();
            int iOrdinal = next.kind.ordinal();
            if (iOrdinal == 5) {
                FancyPinClusterBlueprint fancyPinClusterBlueprint = next.clusterBlueprint;
                if (fancyPinClusterBlueprint == null) {
                    throw BV4.A0U();
                }
                if (!(listA0c instanceof Collection) || !listA0c.isEmpty()) {
                    Iterator<FancyPinClusterBlueprint> it2 = listA0c.iterator();
                    while (it2.hasNext()) {
                        if (C7384Etj.areEqual(it2.next().id, fancyPinClusterBlueprint.id)) {
                            break;
                        }
                    }
                }
                listA0c = AbstractC0878AGe.A0c(AbstractC0878AGe.A0Q(fancyPinClusterBlueprint, listA0c), new Comparator() { // from class: com.meta.maps.fancypins.FancyPinDataController$rebuildProjectedClusterBlueprintsFromPending$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return AbstractC7536F0j.A00(((FancyPinClusterBlueprint) t).id, ((FancyPinClusterBlueprint) t2).id);
                    }
                });
            } else if (iOrdinal == 0 && (fancyPinRuntimeClusterCatalogPublication = next.clusterCatalogPublication) != null) {
                listA0c = fancyPinRuntimeClusterCatalogPublication.blueprints;
            }
        }
        this.projectedClusterBlueprints = listA0c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerBlueprint$default(FancyPinDataController fancyPinDataController, FancyPinBlueprint fancyPinBlueprint, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144541.INSTANCE;
        }
        fancyPinDataController.registerBlueprint(fancyPinBlueprint, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerBlueprints$default(FancyPinDataController fancyPinDataController, List list, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144551.INSTANCE;
        }
        fancyPinDataController.registerBlueprints(list, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void registerClusterBlueprint$default(FancyPinDataController fancyPinDataController, FancyPinClusterBlueprint fancyPinClusterBlueprint, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144561.INSTANCE;
        }
        fancyPinDataController.registerClusterBlueprint(fancyPinClusterBlueprint, g0u);
    }

    private final boolean registrationRevisionsAreCurrent(FancyPinSourceState fancyPinSourceState) {
        FancyPinMeasurementPipeline fancyPinMeasurementPipeline = this.measurementPipeline;
        if (fancyPinMeasurementPipeline == null) {
            return true;
        }
        return C7384Etj.areEqual(fancyPinMeasurementPipeline.registrationRevisions(fancyPinSourceState.getBlueprints()), AGH.A0A(fancyPinSourceState.registrationRevisionsByBlueprintId));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removeAllPins$default(FancyPinDataController fancyPinDataController, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            g0u = C144571.INSTANCE;
        }
        fancyPinDataController.removeAllPins(g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void removePins$default(FancyPinDataController fancyPinDataController, List list, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144581.INSTANCE;
        }
        fancyPinDataController.removePins(list, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replaceData$default(FancyPinDataController fancyPinDataController, List list, List list2, Map map, Map map2, Map map3, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C9jH.A00;
        }
        if ((i & 8) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 16) != 0) {
            map3 = C9jH.A00;
        }
        if ((i & 32) != 0) {
            g0u = C144591.INSTANCE;
        }
        fancyPinDataController.replaceData(list, list2, map, map2, map3, g0u);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void replaceDataInternal(java.util.List<com.meta.maps.fancypins.FancyPin> r10, java.util.List<com.meta.maps.fancypins.FancyPinBlueprint> r11, java.util.List<com.meta.maps.fancypins.FancyPinClusterBlueprint> r12, java.util.Map<java.lang.String, java.lang.String> r13, java.util.Map<java.lang.String, java.lang.Integer> r14, java.util.Map<java.lang.String, java.lang.Float> r15, X.G0U<? super X.HsJ<kotlin.Unit>, kotlin.Unit> r16) {
        /*
            r9 = this;
            java.lang.String r0 = "replaceData"
            r9.checkMainThread(r0)
            boolean r0 = r9.closeStarted
            if (r0 != 0) goto L69
            com.meta.maps.fancypins.FancyPinMeasurementPipeline r0 = r9.measurementPipeline
            if (r0 == 0) goto L62
            com.meta.maps.fancypins.FancyPinSourceStateStore r0 = r9.sourceStore
            X.AGi r3 = X.C0881AGi.A00
            X.9jH r8 = X.C9jH.A00
            r1 = r10
            r2 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            r4 = r3
            com.meta.maps.fancypins.FancyPinSourceState r4 = r0.replacement(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.List r0 = r4.getBlueprints()
            java.util.ArrayList r3 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        L29:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L33
            X.AbstractC7610F5x.A1Q(r3, r1)
            goto L29
        L33:
            if (r12 == 0) goto L60
            com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublisher r0 = r9.runtimeClusterCatalogPublisher
            com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublication r1 = r0.prepare(r12)
            if (r1 == 0) goto L41
            java.util.List<com.meta.maps.fancypins.FancyPinClusterBlueprint> r2 = r1.blueprints
            if (r2 != 0) goto L45
        L41:
            java.util.List r2 = r9.clusterBlueprintsPreservedBySourceReplacement()
        L45:
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation$Companion r0 = com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation.Companion
            r5 = r16
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r1 = r0.replacement(r4, r3, r1, r5)
            int r0 = r9.publicationDepth
            if (r0 <= 0) goto L55
            r9.queueReplacement(r1, r4, r2)
        L54:
            return
        L55:
            r9.supersedeWith(r1, r4, r2)
            java.lang.Object r0 = r9.activeMutation
            if (r0 != r1) goto L54
            r9.startReplacement(r1, r4)
            return
        L60:
            r1 = 0
            goto L41
        L62:
            java.lang.String r0 = "Asynchronous FancyPin measurement is unavailable for this internal controller"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L69:
            java.lang.IllegalStateException r0 = X.AbstractC7608F5v.A0f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.replaceDataInternal(java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map, java.util.Map, X.G0U):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replaceDataNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinDataController fancyPinDataController, List list, List list2, List list3, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 4) != 0) {
            list3 = C0881AGi.A00;
        }
        if ((i & 8) != 0) {
            map = C9jH.A00;
        }
        if ((i & 16) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 32) != 0) {
            map3 = C9jH.A00;
        }
        if ((i & 64) != 0) {
            map4 = null;
        }
        fancyPinDataController.replaceDataNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(list, list2, list3, map, map2, map3, map4);
    }

    private final void replaceDataNowInternal(List<FancyPin> list, List<FancyPinBlueprint> list2, List<FancyPinClusterBlueprint> list3, List<PinMeasurement> list4, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, Map<String, Long> map4) {
        List<FancyPinClusterBlueprint> list5;
        Object objA0s;
        checkMainThread("replaceDataNow");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinSourceState fancyPinSourceStateReplacement = this.sourceStore.replacement(list, list2, list4, C0881AGi.A00, map, map2, map3, map4 == null ? C9jH.A00 : map4);
        List<FancyPinBlueprint> blueprints = fancyPinSourceStateReplacement.getBlueprints();
        ArrayList arrayListA0i = AnonymousClass003.A0i(blueprints);
        Iterator<FancyPinBlueprint> it = blueprints.iterator();
        while (it.hasNext()) {
            AbstractC7610F5x.A1Q(arrayListA0i, it);
        }
        FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublicationPrepare = list3 != null ? this.runtimeClusterCatalogPublisher.prepare(list3) : null;
        Object objA0T = C3cG.A0T();
        if (fancyPinRuntimeClusterCatalogPublicationPrepare == null || (list5 = fancyPinRuntimeClusterCatalogPublicationPrepare.blueprints) == null) {
            list5 = this.committedRuntimeClusterCatalog.blueprints;
        }
        supersedeWith(objA0T, fancyPinSourceStateReplacement, list5);
        Set<String> setA0g = AbstractC0878AGe.A0g(fancyPinSourceStateReplacement.getPinIds());
        this.publicationDepth++;
        try {
            publishData(fancyPinSourceStateReplacement, map4, arrayListA0i, fancyPinSourceStateReplacement.getMeasurements(), setA0g, setA0g, fancyPinRuntimeClusterCatalogPublicationPrepare, true, true);
            objA0s = Unit.INSTANCE;
        } finally {
            try {
                this.publicationDepth--;
                finishSynchronousMutation(objA0T, objA0s);
                Hwg.A00(objA0s);
            } catch (Throwable th) {
            }
        }
        this.publicationDepth--;
        finishSynchronousMutation(objA0T, objA0s);
        Hwg.A00(objA0s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replaceDataWithClusters$default(FancyPinDataController fancyPinDataController, List list, List list2, List list3, Map map, Map map2, Map map3, G0U g0u, int i, Object obj) {
        if ((i & 8) != 0) {
            map = C9jH.A00;
        }
        if ((i & 16) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 32) != 0) {
            map3 = C9jH.A00;
        }
        if ((i & 64) != 0) {
            g0u = C144601.INSTANCE;
        }
        fancyPinDataController.replaceDataWithClusters(list, list2, list3, map, map2, map3, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void replaceDataWithClustersNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin$default(FancyPinDataController fancyPinDataController, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 8) != 0) {
            list4 = C0881AGi.A00;
        }
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        if ((i & 32) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 64) != 0) {
            map3 = C9jH.A00;
        }
        if ((i & 128) != 0) {
            map4 = null;
        }
        fancyPinDataController.replaceDataWithClustersNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(list, list2, list3, list4, map, map2, map3, map4);
    }

    /* renamed from: runPublication-IoAF18A, reason: not valid java name */
    private final Object m3881runPublicationIoAF18A(Function0<Unit> function0) {
        Object objA0s;
        this.publicationDepth++;
        try {
            objA0s = function0.invoke();
        } finally {
            try {
                return objA0s;
            } finally {
            }
        }
        return objA0s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setActiveVariant$default(FancyPinDataController fancyPinDataController, String str, String str2, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            g0u = C144611.INSTANCE;
        }
        fancyPinDataController.setActiveVariant(str, str2, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setRank$default(FancyPinDataController fancyPinDataController, String str, int i, G0U g0u, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            g0u = C144631.INSTANCE;
        }
        fancyPinDataController.setRank(str, i, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setZOrder$default(FancyPinDataController fancyPinDataController, String str, float f, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            g0u = C144651.INSTANCE;
        }
        fancyPinDataController.setZOrder(str, f, g0u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.Hud] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.Hud] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startFrameStateMutation(com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation r15) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.startFrameStateMutation(com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation):void");
    }

    private final void supersedeWith(Object obj, FancyPinSourceState fancyPinSourceState, List<FancyPinClusterBlueprint> list) {
        CancellationException cancellationException = new CancellationException("FancyPin mutation was superseded by replacement");
        Object obj2 = this.activeMutation;
        PendingSourceMutation pendingSourceMutation = obj2 instanceof PendingSourceMutation ? (PendingSourceMutation) obj2 : null;
        List listA0X = AbstractC0878AGe.A0X(this.pendingMutations);
        this.pendingMutations.clear();
        this.activeMutation = obj;
        this.projectedSourceState = fancyPinSourceState;
        this.projectedClusterBlueprints = list;
        FancyPinMeasurementPipeline fancyPinMeasurementPipeline = this.measurementPipeline;
        if (fancyPinMeasurementPipeline != null) {
            fancyPinMeasurementPipeline.cancelPending(cancellationException);
        }
        if (pendingSourceMutation != null) {
            pendingSourceMutation.complete(C3cG.A0s(cancellationException));
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            C10571Hud.A00(cancellationException, it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updatePins$default(FancyPinDataController fancyPinDataController, List list, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C144711.INSTANCE;
        }
        fancyPinDataController.updatePins(list, g0u);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:4|(1:6)|7|(21:9|(0)(1:13)|14|(1:16)|17|(2:20|18)|47|23|(1:25)|26|53|29|(1:31)|34|51|35|49|38|(1:42)|43|(1:45)(1:55))(1:21)|22|14|(0)|17|(1:18)|47|23|(0)|26|53|29|(0)|34|51|35|49|38|(0)|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        close$recordFailure(r2, r0);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        close$recordFailure(r2, r0);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        close$recordFailure(r2, r0);
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
    
        close$recordFailure(r2, r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[LOOP:0: B:18:0x005c->B:20:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:23:0x0079, B:25:0x007d), top: B:47:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #3 {all -> 0x008f, blocks: (B:29:0x0087, B:31:0x008b), top: B:53:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "close"
            r9.checkMainThread(r0)
            boolean r0 = r9.closeComplete
            if (r0 != 0) goto Lbc
            r4 = 1
            r9.closeStarted = r4
            long r7 = r9.publicationGeneration
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L1a
            long r1 = r1 + r7
        L1a:
            r9.publicationGeneration = r1
            java.lang.String r0 = "FancyPin data controller was closed"
            java.util.concurrent.CancellationException r6 = new java.util.concurrent.CancellationException
            r6.<init>(r0)
            java.lang.Object r7 = r9.activeMutation
            boolean r0 = r7 instanceof com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation
            r3 = 0
            if (r0 == 0) goto L73
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r7 = (com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation) r7
            if (r7 == 0) goto L74
            java.lang.Object r0 = r9.committedMutation
            if (r0 != r7) goto L74
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L34:
            java.util.ArrayDeque<com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation> r1 = r9.pendingMutations
            java.util.List r5 = X.AbstractC0878AGe.A0X(r1)
            r9.activeMutation = r3
            r9.committedMutation = r3
            java.util.ArrayDeque<com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation> r1 = r9.pendingMutations
            r1.clear()
            com.meta.maps.fancypins.FancyPinSourceStateStore r1 = r9.sourceStore
            com.meta.maps.fancypins.FancyPinSourceState r1 = r1.current
            r9.projectedSourceState = r1
            com.meta.maps.fancypins.FancyPinRuntimeClusterCatalog r1 = r9.committedRuntimeClusterCatalog
            java.util.List<com.meta.maps.fancypins.FancyPinClusterBlueprint> r1 = r1.blueprints
            r9.projectedClusterBlueprints = r1
            X.Hqv r2 = X.C3cG.A0z()
            if (r7 == 0) goto L58
            close$completeRequest(r2, r7, r0)
        L58:
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r1 = r5.next()
            com.meta.maps.fancypins.FancyPinDataController$PendingSourceMutation r1 = (com.meta.maps.fancypins.FancyPinDataController.PendingSourceMutation) r1
            X.C7384Etj.A0X(r1)
            X.Hud r0 = X.C3cG.A0s(r6)
            close$completeRequest(r2, r1, r0)
            goto L5c
        L73:
            r7 = r3
        L74:
            X.Hud r0 = X.C3cG.A0s(r6)
            goto L34
        L79:
            com.meta.maps.fancypins.FancyPinRuntimeClusterFrameConsumer r0 = r9.runtimeClusterFrameConsumer     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L80
            r0.close()     // Catch: java.lang.Throwable -> L82
        L80:
            r1 = 0
            goto L87
        L82:
            r0 = move-exception
            close$recordFailure(r2, r0)
            r1 = 1
        L87:
            com.meta.maps.fancypins.FancyPinMeasurementPipeline r0 = r9.measurementPipeline     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L94
            r0.close()     // Catch: java.lang.Throwable -> L8f
            goto L94
        L8f:
            r0 = move-exception
            close$recordFailure(r2, r0)
            r1 = 1
        L94:
            java.util.LinkedHashMap<java.lang.String, com.meta.maps.fancypins.FancyPinRetirement> r0 = r9.awaitingVisualRetirements
            r0.clear()
            com.meta.maps.fancypins.FancyPinSlotConsumer r0 = r9.slotConsumer     // Catch: java.lang.Throwable -> L9f
            r0.clearRetirements()     // Catch: java.lang.Throwable -> L9f
            goto La4
        L9f:
            r0 = move-exception
            close$recordFailure(r2, r0)
            r1 = 1
        La4:
            com.meta.maps.fancypins.FancyPinSlotConsumer r0 = r9.slotConsumer     // Catch: java.lang.Throwable -> Lac
            r0.clearAnimatedAppearances()     // Catch: java.lang.Throwable -> Lac
            r9.presentedPinIds = r3     // Catch: java.lang.Throwable -> Lac
            goto Lb1
        Lac:
            r0 = move-exception
            close$recordFailure(r2, r0)
            goto Lb5
        Lb1:
            if (r1 != 0) goto Lb5
            r9.closeComplete = r4
        Lb5:
            T r0 = r2.element
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto Lbc
            throw r0
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.close():void");
    }

    public final List<FancyPinBlueprint> getCurrentBlueprints() {
        checkMainThread("currentBlueprints");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        return this.sourceStore.current.getBlueprints();
    }

    public final List<FancyPinClusterBlueprint> getCurrentClusterBlueprints() {
        checkMainThread("currentClusterBlueprints");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        return AbstractC0878AGe.A0X(this.committedRuntimeClusterCatalog.blueprints);
    }

    public final List<FancyPin> getCurrentPins() {
        checkMainThread("currentPins");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        return this.sourceStore.current.getPins();
    }

    public final FancyPinRuntimeClusterCatalog getRuntimeClusterCatalogForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.runtimeClusterCatalogPublisher.current;
    }

    public final FancyPinSourceState getSourceStateForTesting$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return this.sourceStore.current;
    }

    public final Map<String, FancyPin> projectedPinsForMutation() {
        checkMainThread("projectedPinsForMutation");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        List<FancyPin> pins = this.projectedSourceState.getPins();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (FancyPin fancyPin : pins) {
            linkedHashMapA0j.put(fancyPin.id, fancyPin);
        }
        return linkedHashMapA0j;
    }

    public final void setRuntimeClusterPinsChangedListener(G0U<? super List<FancyPin>, Unit> g0u) {
        checkMainThread("setRuntimeClusterPinsChangedListener");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer = this.runtimeClusterFrameConsumer;
        if (fancyPinRuntimeClusterFrameConsumer != null) {
            fancyPinRuntimeClusterFrameConsumer.setPinsChangedListener(g0u);
        }
    }

    private final void checkMainThread(String str) {
        if (!C3cH.A1K()) {
            throw BV5.A0V("FancyPinDataController.", str, " must run on the main thread");
        }
    }

    public static final void close$completeRequest(C10543Hqv<Throwable> c10543Hqv, PendingSourceMutation pendingSourceMutation, Object obj) {
        try {
            pendingSourceMutation.complete(obj);
        } catch (Throwable th) {
            close$recordFailure(c10543Hqv, th);
        }
    }

    private final void completeRuntimeClusterMutation(G0U<? super HsJ<Unit>, Unit> g0u, Function0<Boolean> function0) {
        Object objA0s;
        try {
            function0.invoke();
            objA0s = Unit.INSTANCE;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        g0u.invoke(new HsJ(objA0s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishIncrementalPublication(PendingSourceMutation pendingSourceMutation, Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 != null) {
            Log.e(TAG, "FancyPins: Failed to publish incremental source mutation", thA00);
        }
        finishMutation(pendingSourceMutation, obj);
    }

    private final List<FancyPinFrameState> makeStates(FancyPinSourceState fancyPinSourceState, List<FancyPin> list, List<FancyPinBlueprint> list2) {
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list2));
        for (FancyPinBlueprint fancyPinBlueprint : list2) {
            linkedHashMapA15.put(fancyPinBlueprint.id, fancyPinBlueprint);
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (FancyPin fancyPin : list) {
            String str = fancyPin.id;
            GeoCoordinates geoCoordinates = fancyPin.coordinates;
            String strActiveVariant = fancyPinSourceState.activeVariant(str);
            if (strActiveVariant == null) {
                Object obj = linkedHashMapA15.get(fancyPin.blueprintId);
                if (obj == null) {
                    throw BV4.A0U();
                }
                strActiveVariant = ((FancyPinBlueprint) obj).defaultVariantId;
            }
            Integer numRankOverride = fancyPinSourceState.rankOverride(fancyPin.id);
            arrayListA0m.add(new FancyPinFrameState(str, geoCoordinates, strActiveVariant, numRankOverride != null ? numRankOverride.intValue() : fancyPin.rank));
        }
        return arrayListA0m;
    }

    private final void publishActiveVariant(FancyPinSourceState fancyPinSourceState, String str) {
        List<FancyPinFrameState> listMakeStates = makeStates(fancyPinSourceState, fancyPinSourceState.getPins(), fancyPinSourceState.getBlueprints());
        Iterator<FancyPinFrameState> it = listMakeStates.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FancyPinFrameState next = it.next();
            FancyPinFrameState fancyPinFrameState = next;
            if (C7384Etj.areEqual(fancyPinFrameState.id, str)) {
                if (next != null) {
                    String str2 = fancyPinFrameState.variantId;
                    long j = this.publicationGeneration;
                    this.publicationGeneration = j != LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 + j : 1L;
                    this.requiresFullReplay = true;
                    this.slotConsumer.invalidatePresentation();
                    this.engine.updateStates(listMakeStates);
                    this.slotConsumer.updateActiveVariant(this.engine, str, str2);
                    this.sourceStore.current = fancyPinSourceState;
                    this.requiresFullReplay = false;
                    this.committedMutation = this.activeMutation;
                    this.requestUpdate.invoke();
                    return;
                }
            }
        }
        throw BV4.A0U();
    }

    private final void publishRank(FancyPinSourceState fancyPinSourceState, String str) {
        List<FancyPinFrameState> listMakeStates = makeStates(fancyPinSourceState, fancyPinSourceState.getPins(), fancyPinSourceState.getBlueprints());
        Iterator<FancyPinFrameState> it = listMakeStates.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FancyPinFrameState next = it.next();
            FancyPinFrameState fancyPinFrameState = next;
            if (C7384Etj.areEqual(fancyPinFrameState.id, str)) {
                if (next != null) {
                    int i = fancyPinFrameState.rank;
                    long j = this.publicationGeneration;
                    this.publicationGeneration = j != LinkEncryptedPairingKt.LINK_COUNTER_MAX ? 1 + j : 1L;
                    this.requiresFullReplay = true;
                    this.slotConsumer.invalidatePresentation();
                    this.engine.updateStates(listMakeStates);
                    this.slotConsumer.updateRank(this.engine, str, i);
                    this.sourceStore.current = fancyPinSourceState;
                    this.requiresFullReplay = false;
                    this.committedMutation = this.activeMutation;
                    this.requestUpdate.invoke();
                    return;
                }
            }
        }
        throw BV4.A0U();
    }

    private final void startReplacement(PendingSourceMutation pendingSourceMutation, FancyPinSourceState fancyPinSourceState) {
        List<FancyPin> pins = fancyPinSourceState.getPins();
        List<FancyPinBlueprint> blueprints = fancyPinSourceState.getBlueprints();
        FancyPinMeasurementPipeline fancyPinMeasurementPipeline = this.measurementPipeline;
        if (fancyPinMeasurementPipeline == null) {
            throw BV4.A0U();
        }
        fancyPinMeasurementPipeline.submit(pins, blueprints, new C144671(pendingSourceMutation, fancyPinSourceState), new C144682(pendingSourceMutation), C9jH.A00);
    }

    public final void addPins(List<FancyPin> list, G0U<? super HsJ<Unit>, Unit> g0u) {
        List list2;
        PendingSourceMutation.Companion companion;
        AnonymousClass003.A0u(list, g0u);
        checkMainThread("addPins");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinSourceState fancyPinSourceStateAdding = this.projectedSourceState.adding(list);
        if (fancyPinSourceStateAdding == this.projectedSourceState) {
            if (this.activeMutation == null && this.pendingMutations.isEmpty()) {
                G0U.A01(g0u);
                return;
            } else {
                companion = PendingSourceMutation.Companion;
                list2 = C0881AGi.A00;
            }
        } else {
            if (this.measurementPipeline == null) {
                throw C3cG.A0Q("Asynchronous FancyPin measurement is unavailable for this internal controller");
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<FancyPin> it = list.iterator();
            while (it.hasNext()) {
                FancyPin fancyPinPin = fancyPinSourceStateAdding.pin(it.next().id);
                if (fancyPinPin == null) {
                    throw BV4.A0U();
                }
                arrayListA0i.add(fancyPinPin);
            }
            companion = PendingSourceMutation.Companion;
            list2 = arrayListA0i;
        }
        enqueueIncremental(companion.addition(list2, g0u), fancyPinSourceStateAdding);
    }

    public final void clearActiveVariant(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(str, g0u);
        checkMainThread("clearActiveVariant");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            completeRuntimeClusterMutation(g0u, new C144483(str));
            return;
        }
        FancyPinSourceState fancyPinSourceStateClearingActiveVariant = this.projectedSourceState.clearingActiveVariant(str);
        if (fancyPinSourceStateClearingActiveVariant == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty() && !this.requiresFullReplay && registrationRevisionsAreCurrent(fancyPinSourceStateClearingActiveVariant)) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.clearActiveVariant(str, g0u), fancyPinSourceStateClearingActiveVariant);
        }
    }

    public final void clearRank(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(str, g0u);
        checkMainThread("clearRank");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            completeRuntimeClusterMutation(g0u, new C144503(str));
            return;
        }
        FancyPinSourceState fancyPinSourceStateClearingRank = this.projectedSourceState.clearingRank(str);
        if (fancyPinSourceStateClearingRank == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty() && registrationRevisionsAreCurrent(fancyPinSourceStateClearingRank)) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.clearRank(str, g0u), fancyPinSourceStateClearingRank);
        }
    }

    public final void clearZOrder(String str, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(str, g0u);
        checkMainThread("clearZOrder");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            completeRuntimeClusterMutation(g0u, new C144523(str));
            return;
        }
        FancyPinSourceState fancyPinSourceStateClearingZOrder = this.projectedSourceState.clearingZOrder(str);
        if (fancyPinSourceStateClearingZOrder == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty()) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.clearZOrder(str, g0u), fancyPinSourceStateClearingZOrder);
        }
    }

    public final void registerBlueprint(FancyPinBlueprint fancyPinBlueprint, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(fancyPinBlueprint, g0u);
        registerBlueprints(Collections.singletonList(fancyPinBlueprint), g0u);
    }

    public final void registerBlueprints(List<FancyPinBlueprint> list, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(list, g0u);
        checkMainThread("registerBlueprints");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinSourceState fancyPinSourceStateRegisteringBlueprints = this.projectedSourceState.registeringBlueprints(list);
        if (fancyPinSourceStateRegisteringBlueprints == this.projectedSourceState) {
            G0U.A01(g0u);
        } else {
            if (this.measurementPipeline == null) {
                throw C3cG.A0Q("Asynchronous FancyPin measurement is unavailable for this internal controller");
            }
            Iterator<FancyPinBlueprint> it = list.iterator();
            while (it.hasNext()) {
                it.next().toJson();
            }
            enqueueCatalogMutation(PendingSourceMutation.Companion.blueprintRegistration(AbstractC0878AGe.A0X(list), g0u), fancyPinSourceStateRegisteringBlueprints, this.projectedClusterBlueprints);
        }
    }

    public final void registerClusterBlueprint(FancyPinClusterBlueprint fancyPinClusterBlueprint, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0u(fancyPinClusterBlueprint, g0u);
        checkMainThread("registerClusterBlueprint");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        List<FancyPinClusterBlueprint> list = this.projectedClusterBlueprints;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<FancyPinClusterBlueprint> it = list.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(it.next().id, fancyPinClusterBlueprint.id)) {
                    throw C60Q.A0V("FancyPin cluster blueprint '", fancyPinClusterBlueprint.id, "' is already registered");
                }
            }
        }
        if (this.measurementPipeline == null) {
            throw C3cG.A0Q("Asynchronous FancyPin measurement is unavailable for this internal controller");
        }
        enqueueCatalogMutation(PendingSourceMutation.Companion.clusterBlueprintRegistration(fancyPinClusterBlueprint, g0u), this.projectedSourceState, this.runtimeClusterCatalogPublisher.prepare(AbstractC0878AGe.A0Q(fancyPinClusterBlueprint, this.projectedClusterBlueprints)).blueprints);
    }

    public final void removePins(List<String> list, G0U<? super HsJ<Unit>, Unit> g0u) {
        FancyPinSourceState fancyPinSourceStateRemoving;
        AnonymousClass003.A0u(list, g0u);
        checkMainThread("removePins");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if ((list.isEmpty() && this.activeMutation == null && this.pendingMutations.isEmpty()) || ((fancyPinSourceStateRemoving = this.projectedSourceState.removing(list)) == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty())) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.removal(AbstractC0878AGe.A0X(list), g0u), fancyPinSourceStateRemoving);
        }
    }

    public final void replaceDataWithClusters(List<FancyPin> list, List<FancyPinBlueprint> list2, List<FancyPinClusterBlueprint> list3, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass005.A17(list, list2, list3, map, map2);
        AnonymousClass003.A0z(map3, g0u);
        replaceDataInternal(list, list2, list3, map, map2, map3, g0u);
    }

    public final void replaceDataWithClustersNow$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(List<FancyPin> list, List<FancyPinBlueprint> list2, List<FancyPinClusterBlueprint> list3, List<PinMeasurement> list4, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, Map<String, Long> map4) {
        AnonymousClass005.A17(list, list2, list3, list4, map);
        AnonymousClass003.A0z(map2, map3);
        replaceDataNowInternal(list, list2, list3, list4, map, map2, map3, map4);
    }

    public final void setActiveVariant(String str, String str2, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass005.A0x(str, str2, g0u);
        checkMainThread("setActiveVariant");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            completeRuntimeClusterMutation(g0u, new C144623(str, str2));
            return;
        }
        FancyPinSourceState fancyPinSourceState = this.projectedSourceState.settingActiveVariant(str, str2);
        if (fancyPinSourceState == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty() && !this.requiresFullReplay && registrationRevisionsAreCurrent(fancyPinSourceState)) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.setActiveVariant(str, str2, g0u), fancyPinSourceState);
        }
    }

    public final void setRank(String str, int i, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0v(str, g0u);
        checkMainThread("setRank");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            completeRuntimeClusterMutation(g0u, new C144643(str, i));
            return;
        }
        FancyPinSourceState fancyPinSourceState = this.projectedSourceState.settingRank(str, i);
        if (fancyPinSourceState == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty() && registrationRevisionsAreCurrent(fancyPinSourceState)) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.setRank(str, i, g0u), fancyPinSourceState);
        }
    }

    public final void setZOrder(String str, float f, G0U<? super HsJ<Unit>, Unit> g0u) {
        AnonymousClass003.A0v(str, g0u);
        checkMainThread("setZOrder");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        if (str.startsWith(FancyPinRuntimeClusterId.PREFIX)) {
            if (Math.abs(f) > Float.MAX_VALUE) {
                throw C60O.A0i("FancyPin z-order must be finite");
            }
            completeRuntimeClusterMutation(g0u, new C144664(str, f));
            return;
        }
        FancyPinSourceState fancyPinSourceState = this.projectedSourceState.settingZOrder(str, f);
        if (fancyPinSourceState == this.projectedSourceState && this.activeMutation == null && this.pendingMutations.isEmpty()) {
            G0U.A01(g0u);
        } else {
            enqueueIncremental(PendingSourceMutation.Companion.setZOrder(str, f, g0u), fancyPinSourceState);
        }
    }

    public final void updatePins(List<FancyPin> list, G0U<? super HsJ<Unit>, Unit> g0u) {
        List list2;
        PendingSourceMutation.Companion companion;
        AnonymousClass003.A0u(list, g0u);
        checkMainThread("updatePins");
        if (this.closeStarted) {
            throw AbstractC7608F5v.A0f();
        }
        FancyPinSourceState fancyPinSourceStateUpdating = this.projectedSourceState.updating(list);
        if (fancyPinSourceStateUpdating == this.projectedSourceState) {
            if (this.activeMutation == null && this.pendingMutations.isEmpty()) {
                G0U.A01(g0u);
                return;
            } else {
                companion = PendingSourceMutation.Companion;
                list2 = C0881AGi.A00;
            }
        } else {
            if (this.measurementPipeline == null) {
                throw C3cG.A0Q("Asynchronous FancyPin measurement is unavailable for this internal controller");
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<FancyPin> it = list.iterator();
            while (it.hasNext()) {
                FancyPin fancyPinPin = fancyPinSourceStateUpdating.pin(it.next().id);
                if (fancyPinPin == null) {
                    throw BV4.A0U();
                }
                arrayListA0i.add(fancyPinPin);
            }
            companion = PendingSourceMutation.Companion;
            list2 = arrayListA0i;
        }
        enqueueIncremental(companion.update(list2, g0u), fancyPinSourceStateUpdating);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void publishData(com.meta.maps.fancypins.FancyPinSourceState r26, java.util.Map<java.lang.String, java.lang.Long> r27, java.util.List<byte[]> r28, java.util.List<com.meta.maps.fancypins.PinMeasurement> r29, java.util.Set<java.lang.String> r30, java.util.Set<java.lang.String> r31, com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublication r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinDataController.publishData(com.meta.maps.fancypins.FancyPinSourceState, java.util.Map, java.util.List, java.util.List, java.util.Set, java.util.Set, com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublication, boolean, boolean):void");
    }

    public FancyPinDataController(final FancyPinEngine fancyPinEngine, final LayoutEngine layoutEngine, final FancyPinViewRegistry fancyPinViewRegistry, Executor executor, Function0<Unit> function0) {
        AnonymousClass005.A17(fancyPinEngine, layoutEngine, fancyPinViewRegistry, executor, function0);
        FancyPinEngineDataSink fancyPinEngineDataSink = new FancyPinEngineDataSink() { // from class: com.meta.maps.fancypins.FancyPinDataController.3
            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public List<String> copyRankedRuntimeClusterMemberPinIds(String str, int i) {
                C7384Etj.A0Y(str, 0);
                return fancyPinEngine.copyRankedRuntimeClusterMemberPinIds(str, i);
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public List<String> copyRuntimeClusterMemberPinIds(String str) {
                C7384Etj.A0Y(str, 0);
                return fancyPinEngine.copyRuntimeClusterMemberPinIds(str);
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public void registerBlueprint(String str, byte[] bArr) {
                C7384Etj.A0Y(bArr, 1);
                fancyPinEngine.registerBlueprint(bArr);
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public List<Integer> replaceClusterBlueprintCatalog(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                return fancyPinEngine.replaceClusterBlueprintCatalog(bArr);
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotResolver
            public int slotForPinId(String str) {
                C7384Etj.A0Y(str, 0);
                return fancyPinEngine.slotForPinId(str);
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public void updateLayouts(List<PinLayout> list) {
                C7384Etj.A0Y(list, 0);
                fancyPinEngine.updateLayouts(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public void updatePinMapping(Map<String, String> map) {
                C7384Etj.A0Y(map, 0);
                fancyPinEngine.updatePinMapping(AbstractC7607F5u.A14(map));
            }

            @Override // com.meta.maps.fancypins.FancyPinEngineDataSink
            public void updateStates(List<FancyPinFrameState> list) {
                C7384Etj.A0Y(list, 0);
                fancyPinEngine.updateStates(list);
            }
        };
        FancyPinLayoutDataSink fancyPinLayoutDataSink = new FancyPinLayoutDataSink() { // from class: com.meta.maps.fancypins.FancyPinDataController.4
            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void registerBlueprint(String str, byte[] bArr) {
                C7384Etj.A0Y(bArr, 1);
                layoutEngine.registerBlueprint(bArr);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public List<PinLayout> solveLayouts(List<FancyPinFrameState> list) {
                C7384Etj.A0Y(list, 0);
                return layoutEngine.solveLayouts(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void updateMeasurements(List<PinMeasurement> list) {
                C7384Etj.A0Y(list, 0);
                layoutEngine.updateMeasurements(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void updatePins(Map<String, String> map) {
                C7384Etj.A0Y(map, 0);
                layoutEngine.updatePins(AbstractC7607F5u.A14(map));
            }
        };
        FancyPinSlotConsumer fancyPinSlotConsumer = new FancyPinSlotConsumer() { // from class: com.meta.maps.fancypins.FancyPinDataController.5
            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public Set<FancyPinRetirement> replacePresentation(FancyPinSlotResolver fancyPinSlotResolver, List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinLayout> list3, List<FancyPinFrameState> list4, Map<String, Long> map, List<FancyPinRetirement> list5, Set<String> set, Set<String> set2, Map<String, Float> map2, boolean z) {
                AnonymousClass005.A17(fancyPinSlotResolver, list, list2, list3, list4);
                AnonymousClass005.A13(list5, set, set2, 6);
                C7384Etj.A0Y(map2, 9);
                return fancyPinViewRegistry.replacePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, list, list2, list3, list4, map, list5, set, set2, map2, z);
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void clearAnimatedAppearances() {
                fancyPinViewRegistry.clearAnimatedAppearances$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void clearRetirements() {
                fancyPinViewRegistry.clearRetirements$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void invalidatePresentation() {
                fancyPinViewRegistry.invalidatePresentation$xplat_maps_sdk_packages_fancypins_fancypins_kotlin();
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void updateActiveVariant(FancyPinSlotResolver fancyPinSlotResolver, String str, String str2) {
                AnonymousClass005.A0x(fancyPinSlotResolver, str, str2);
                fancyPinViewRegistry.updateActiveVariant$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, str, str2);
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void updateRank(FancyPinSlotResolver fancyPinSlotResolver, String str, int i) {
                AnonymousClass003.A0u(fancyPinSlotResolver, str);
                fancyPinViewRegistry.updateRank$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, str, i);
            }

            @Override // com.meta.maps.fancypins.FancyPinSlotConsumer
            public void updateZOrder(FancyPinSlotResolver fancyPinSlotResolver, String str, Float f) {
                AnonymousClass003.A0u(fancyPinSlotResolver, str);
                fancyPinViewRegistry.updateZOrder$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(fancyPinSlotResolver, str, f);
            }
        };
        Companion companion = Companion;
        this(fancyPinEngineDataSink, fancyPinLayoutDataSink, fancyPinSlotConsumer, new FancyPinMeasurementPipeline(fancyPinViewRegistry, executor, companion.mainThreadExecutor()), null, function0);
        final LayoutEngine layoutEngine2 = new LayoutEngine();
        this.runtimeClusterFrameConsumer = new FancyPinRuntimeClusterCoordinator(new FancyPinRuntimeClusterEngineSink() { // from class: com.meta.maps.fancypins.FancyPinDataController.6
            @Override // com.meta.maps.fancypins.FancyPinSlotResolver
            public int slotForPinId(String str) {
                C7384Etj.A0Y(str, 0);
                return fancyPinEngine.slotForPinId(str);
            }

            @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterEngineSink
            public void updateRuntimeClusterLayouts(List<PinLayout> list) {
                C7384Etj.A0Y(list, 0);
                fancyPinEngine.updateRuntimeClusterLayouts(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterEngineSink
            public void updateRuntimeClusterRanks(Map<String, Integer> map) {
                C7384Etj.A0Y(map, 0);
                fancyPinEngine.updateRuntimeClusterRanks(AbstractC7607F5u.A14(map));
            }

            @Override // com.meta.maps.fancypins.FancyPinRuntimeClusterEngineSink
            public void updateRuntimeClusterVariants(Map<String, String> map) {
                C7384Etj.A0Y(map, 0);
                fancyPinEngine.updateRuntimeClusterVariants(AbstractC7607F5u.A14(map));
            }
        }, new FancyPinRuntimeClusterLayoutResolver(new FancyPinLayoutDataSink() { // from class: com.meta.maps.fancypins.FancyPinDataController.7
            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void registerBlueprint(String str, byte[] bArr) {
                C7384Etj.A0Y(bArr, 1);
                layoutEngine2.registerBlueprint(bArr);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public List<PinLayout> solveLayouts(List<FancyPinFrameState> list) {
                C7384Etj.A0Y(list, 0);
                return layoutEngine2.solveLayouts(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void updateMeasurements(List<PinMeasurement> list) {
                C7384Etj.A0Y(list, 0);
                layoutEngine2.updateMeasurements(list);
            }

            @Override // com.meta.maps.fancypins.FancyPinLayoutDataSink
            public void updatePins(Map<String, String> map) {
                C7384Etj.A0Y(map, 0);
                layoutEngine2.updatePins(AbstractC7607F5u.A14(map));
            }
        }), fancyPinViewRegistry, new FancyPinMeasurementPipeline(fancyPinViewRegistry, executor, companion.mainThreadExecutor()), new AnonymousClass8(), function0);
    }

    public final Map<String, FancyPin> projectedPinsForMutation(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        checkMainThread("projectedPinsForMutation");
        if (!this.closeStarted) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                FancyPin fancyPinPin = this.projectedSourceState.pin(strA0j);
                if (fancyPinPin != null) {
                    AnonymousClass002.A1J(strA0j, fancyPinPin, arrayListA0h);
                }
            }
            LinkedHashMap linkedHashMapA0j = C3cG.A0j();
            AGH.A0F(arrayListA0h, linkedHashMapA0j);
            return linkedHashMapA0j;
        }
        throw AbstractC7608F5v.A0f();
    }

    public FancyPinDataController(FancyPinEngineDataSink fancyPinEngineDataSink, FancyPinLayoutDataSink fancyPinLayoutDataSink, FancyPinSlotConsumer fancyPinSlotConsumer, FancyPinMeasurementPipeline fancyPinMeasurementPipeline, FancyPinRuntimeClusterFrameConsumer fancyPinRuntimeClusterFrameConsumer, Function0<Unit> function0) {
        AnonymousClass005.A0x(fancyPinEngineDataSink, fancyPinLayoutDataSink, fancyPinSlotConsumer);
        C7384Etj.A0Y(function0, 5);
        this.engine = fancyPinEngineDataSink;
        this.layoutEngine = fancyPinLayoutDataSink;
        this.slotConsumer = fancyPinSlotConsumer;
        this.measurementPipeline = fancyPinMeasurementPipeline;
        this.runtimeClusterFrameConsumer = fancyPinRuntimeClusterFrameConsumer;
        this.requestUpdate = function0;
        this.nativePinIds = A3q.A00;
        FancyPinSourceStateStore fancyPinSourceStateStore = new FancyPinSourceStateStore();
        this.sourceStore = fancyPinSourceStateStore;
        FancyPinRuntimeClusterCatalogPublisher fancyPinRuntimeClusterCatalogPublisher = new FancyPinRuntimeClusterCatalogPublisher(new FancyPinDataController$runtimeClusterCatalogPublisher$1(fancyPinEngineDataSink));
        this.runtimeClusterCatalogPublisher = fancyPinRuntimeClusterCatalogPublisher;
        this.committedRuntimeClusterCatalog = fancyPinRuntimeClusterCatalogPublisher.current;
        this.projectedSourceState = fancyPinSourceStateStore.current;
        this.projectedClusterBlueprints = C0881AGi.A00;
        this.pendingMutations = new ArrayDeque<>();
        this.awaitingVisualRetirements = C3cG.A0j();
    }

    public /* synthetic */ FancyPinDataController(FancyPinEngine fancyPinEngine, LayoutEngine layoutEngine, FancyPinViewRegistry fancyPinViewRegistry, Executor executor, Function0 function0, int i, C06H c06h) {
        this(fancyPinEngine, layoutEngine, fancyPinViewRegistry, executor, (i & 16) != 0 ? AnonymousClass2.INSTANCE : function0);
    }
}
