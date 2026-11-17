package com.facebook.aura.navigation;

import X.AOB;
import X.AOI;
import X.AOP;
import X.AOQ;
import X.AOR;
import X.AOW;
import X.AVd;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.B81;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BLi;
import X.BMI;
import X.BRL;
import X.C0n6;
import X.C1BO;
import X.C31w;
import X.C7384Etj;
import X.C78N;
import X.C79;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.HzP;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import com.facebook.aura.ui.adaptive.AuraModalFlowPresentation;
import com.facebook.aura.ui.adaptive.AuraModalFlowPresentationKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ModalFlowScene<T> implements BLi<T> {
    public final G0V<BFM, Integer, Unit> content;
    public final Object key;
    public final G0U<ModalFlowScene<T>, Unit> onRemoved;
    public final MutableState sceneState$delegate;
    public AOI<Boolean> shownVisibility;

    /* renamed from: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ List<BRL<T>> $flowEntries;
        public final /* synthetic */ boolean $isFullBleed;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ C1BO<Float> $progress$delegate;

        /* renamed from: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$3$4, reason: invalid class name */
        public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ List<BRL<T>> $flowEntries;
            public final /* synthetic */ boolean $isFullBleed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(List<BRL<T>> list, boolean z) {
                super(2);
                this.$flowEntries = list;
                this.$isFullBleed = z;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    ModalFlowSceneStrategyKt.ModalFlowPages(this.$flowEntries, this.$isFullBleed, null, bfm, 0, 4);
                    AppFloatingLayerKt.AppFloatingLayers(null, false, bfm, 0, 3);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator, C1BO<Float> c1bo, boolean z, List<BRL<T>> list) {
            super(2);
            this.$navigator = auraNavigator;
            this.$progress$delegate = c1bo;
            this.$isFullBleed = z;
            this.$flowEntries = list;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                boolean zA67 = bfm.A67(this.$navigator);
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ModalFlowScene$ModalFlowDialog$3$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                B81.A00(false, (Function0) objAaT, bfm, 0, 1);
                boolean zA65 = bfm.A65(this.$progress$delegate);
                C1BO<Float> c1bo = this.$progress$delegate;
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new ModalFlowScene$ModalFlowDialog$3$2$1(c1bo);
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean z = this.$isFullBleed;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$flowEntries, bfm.A67(this.$navigator));
                AuraNavigator auraNavigator2 = this.$navigator;
                List<BRL<T>> list = this.$flowEntries;
                Object objAaT3 = bfm.AaT();
                if (zA1T || objAaT3 == C78N.A00) {
                    objAaT3 = new ModalFlowScene$ModalFlowDialog$3$3$1(auraNavigator2, list);
                    bfm.Ai0(objAaT3);
                }
                ModalFlowSceneStrategyKt.ModalFlowSurface(function0, z, (Function0) objAaT3, null, B1V.A00(bfm, new AnonymousClass4(this.$flowEntries, this.$isFullBleed), -2101566884), bfm, RuntimeInternals.IOPRIO_BACKGROUND, 8);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ List<BRL<T>> $flowEntries;
        public final /* synthetic */ ModalFlowScene<T> $tmp3_rcvr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ModalFlowScene<T> modalFlowScene, List<BRL<T>> list, int i) {
            super(2);
            this.$tmp3_rcvr = modalFlowScene;
            this.$flowEntries = list;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            this.$tmp3_rcvr.ModalFlowDialog(this.$flowEntries, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.navigation.ModalFlowScene", f = "ModalFlowSceneStrategy.kt", l = {113}, m = "onRemove", v = 2)
    /* renamed from: com.facebook.aura.navigation.ModalFlowScene$onRemove$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ ModalFlowScene<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ModalFlowScene<T> modalFlowScene, HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
            this.this$0 = modalFlowScene;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onRemove(this);
        }
    }

    /* renamed from: com.facebook.aura.navigation.ModalFlowScene$onRemove$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ AOI<Boolean> $visibility;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AOI<Boolean> aoi) {
            super(0);
            this.$visibility = aoi;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.$visibility.A0D());
        }
    }

    @DebugMetadata(c = "com.facebook.aura.navigation.ModalFlowScene$onRemove$3", f = "ModalFlowSceneStrategy.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.navigation.ModalFlowScene$onRemove$3, reason: invalid class name and case insensitive filesystem */
    public final class C127103 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public C127103(HtJ<? super C127103> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C127103 c127103 = new C127103(htJ);
            c127103.Z$0 = AnonymousClass001.A1X(obj);
            return c127103;
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
            return ((C127103) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModalFlowSceneState<T> getSceneState() {
        return (ModalFlowSceneState) this.sceneState$delegate.getValue();
    }

    private final void setSceneState(ModalFlowSceneState<T> modalFlowSceneState) {
        this.sceneState$delegate.Af8(modalFlowSceneState);
    }

    @Override // X.AMP
    public G0V<BFM, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // X.AMP
    public Object getKey() {
        return this.key;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    @Override // X.BLi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object onRemove(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.navigation.ModalFlowScene.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r7
            com.facebook.aura.navigation.ModalFlowScene$onRemove$1 r5 = (com.facebook.aura.navigation.ModalFlowScene.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 != r3) goto L56
            X.Hwg.A00(r1)
        L20:
            X.G0U<com.facebook.aura.navigation.ModalFlowScene<T>, kotlin.Unit> r0 = r6.onRemoved
            r0.invoke(r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L28:
            X.Hwg.A00(r1)
            X.AOI<java.lang.Boolean> r1 = r6.shownVisibility
            if (r1 == 0) goto L20
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            r1.A0C(r0)
            com.facebook.aura.navigation.ModalFlowScene$onRemove$2 r0 = new com.facebook.aura.navigation.ModalFlowScene$onRemove$2
            r0.<init>(r1)
            r2 = 0
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.navigation.ModalFlowScene$onRemove$3 r0 = new com.facebook.aura.navigation.ModalFlowScene$onRemove$3
            r0.<init>(r2)
            r5.L$0 = r2
            r5.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r5, r0, r1)
            if (r0 != r4) goto L20
            return r4
        L50:
            com.facebook.aura.navigation.ModalFlowScene$onRemove$1 r5 = new com.facebook.aura.navigation.ModalFlowScene$onRemove$1
            r5.<init>(r6, r7)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.ModalFlowScene.onRemove(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalFlowScene(Object obj, ModalFlowSceneState<T> modalFlowSceneState, G0U<? super ModalFlowScene<T>, Unit> g0u) {
        boolean zA1Z = AnonymousClass005.A1Z(obj, modalFlowSceneState, g0u);
        this.key = obj;
        this.onRemoved = g0u;
        this.sceneState$delegate = AnonymousClass002.A0P(modalFlowSceneState);
        this.content = B1V.A01(new ModalFlowScene$content$1(this), 1604720002, zA1Z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r5v33, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$progress$2] */
    public final void ModalFlowDialog(List<BRL<T>> list, BFM bfm, int i) {
        BBI bbiA0M;
        Object objA09;
        bfm.AgG(348187062);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, this);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1Z = AnonymousClass002.A1Z(AuraModalFlowPresentationKt.auraModalFlowPresentation(bfm, 0), AuraModalFlowPresentation.Pages);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            Object obj2 = objAaT;
            if (objAaT == obj) {
                AOI aoi = new AOI(false);
                aoi.A0C(true);
                bfm.Ai0(aoi);
                obj2 = aoi;
            }
            AOI aoi2 = (AOI) obj2;
            boolean zA1T = AnonymousClass001.A1T(bfm, aoi2, AnonymousClass003.A1C(iA05));
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == obj) {
                objAaT2 = new ModalFlowScene$ModalFlowDialog$1$1(this, aoi2);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, aoi2);
            final AOP aopA03 = AOR.A03(aoi2, bfm, "modalFlowVisibility", 48, 0);
            ?? r9 = ModalFlowScene$ModalFlowDialog$progress$2.INSTANCE;
            C31w<Float, AOW> c31w = AVd.A02;
            if (aopA03.A0G()) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1666827533);
                objA09 = aopA03.A02.A09();
            } else {
                boolean zA1Y = AnonymousClass001.A1Y(aopA03, bfm, 1666573488);
                Object objAaT3 = bfm.AaT();
                Object obj3 = objAaT3;
                if (zA1Y || objAaT3 == obj) {
                    Snapshot snapshotA03 = Snapshot.A03();
                    G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
                    ?? A04 = Snapshot.A04(snapshotA03);
                    try {
                        A04 = AnonymousClass007.A0S(aopA03, bfm, snapshotA03, A04, g0uA0D);
                        obj3 = A04;
                    } catch (Throwable th) {
                        Snapshot.A07(snapshotA03, A04, g0uA0D);
                        throw th;
                    }
                }
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
                objA09 = obj3;
            }
            boolean zA1X = AnonymousClass001.A1X(objA09);
            bfm.AgE(1611139165);
            Float fA0b = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA1X ? 1 : 0));
            boolean zA65 = bfm.A65(aopA03);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = AnonymousClass003.A0R(bfm, new Function0<Boolean>() { // from class: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$$inlined$animateFloat$1
                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Boolean, java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return aopA03.A07.getValue();
                    }
                });
            }
            boolean zA0F = C1BO.A0F((C1BO) objAaT4);
            bfm.AgE(1611139165);
            Float fA0b2 = AnonymousClass005.A0b(bbiA0M, AnonymousClass006.A00(zA0F ? 1 : 0));
            boolean zA652 = bfm.A65(aopA03);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == obj) {
                objAaT5 = AnonymousClass003.A0R(bfm, new Function0<AOB<Boolean>>() { // from class: com.facebook.aura.navigation.ModalFlowScene$ModalFlowDialog$$inlined$animateFloat$2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ AOB<Boolean> invoke() {
                        return aopA03.A03();
                    }
                });
            }
            AOQ aoqA01 = AOR.A01(r9.invoke(((C1BO) objAaT5).getValue(), bfm, 0), aopA03, c31w, bfm, fA0b, fA0b2, 196608);
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new ModalFlowScene$ModalFlowDialog$2$1(auraNavigatorA0b);
                bfm.Ai0(objAaT6);
            }
            C0n6.A00(bfm, new BA2(C79.A00, false, false, false, false), (Function0) objAaT6, B1V.A00(bfm, new AnonymousClass3(auraNavigatorA0b, aoqA01, zA1Z, list), -775320705), 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(this, list, i);
        }
    }

    @Override // X.AMP
    public List<BRL<T>> getEntries() {
        return getSceneState().flowEntries;
    }

    public /* bridge */ Map<String, Object> getMetadata() {
        return BMI.A00(this);
    }

    @Override // X.BLi
    public List<BRL<T>> getOverlaidEntries() {
        return getSceneState().overlaidEntries;
    }

    @Override // X.AMP
    public List<BRL<T>> getPreviousEntries() {
        return getSceneState().overlaidEntries;
    }

    public final void update(List<BRL<T>> list, List<BRL<T>> list2, boolean z) {
        AnonymousClass003.A0u(list, list2);
        if (C7384Etj.areEqual(getSceneState().flowEntries, list) && C7384Etj.areEqual(getSceneState().overlaidEntries, list2) && getSceneState().isHiddenByOverlay == z) {
            return;
        }
        setSceneState(new ModalFlowSceneState<>(list, list2, z));
    }
}
