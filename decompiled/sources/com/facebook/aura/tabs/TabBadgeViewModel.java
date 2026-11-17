package com.facebook.aura.tabs;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BGK;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Ej;
import X.C3Ek;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7Bq;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.HrH;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.tabs.api.TabAttentions;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiControlActionSink;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class TabBadgeViewModel extends AEs {
    public static final int $stable = 8;
    public final UiControlActionSink actionSink;
    public final HatchAgentPermissionsRepository agentPermissionsRepository;
    public final C1BN<Map<FixedTab, Set<String>>> attentionIds;
    public final BLG<FixedTab> currentTab;
    public HoC lightupJob;
    public final BLG<FixedTab> lightupTab;
    public final C1BN<Set<String>> pendingAgentPermissionApprovalIds;
    public final BLG<Set<String>> seenAgentPermissionApprovalIds;
    public final BLG<Map<FixedTab, Set<String>>> seenAttentionIds;
    public final C1BN<Map<FixedTab, TabBadgeType>> uiState;
    public final C20Q<Set<FixedTab>> wavingTabs;

    @DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$1", f = "TabBadgeViewModel.kt", l = {111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.tabs.TabBadgeViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final TabBadgeViewModel tabBadgeViewModel = TabBadgeViewModel.this;
                C22I<UiAction> c22i = tabBadgeViewModel.actionSink.pendingTabLightup;
                C20Z<? super UiAction> c20z = new C20Z() { // from class: com.facebook.aura.tabs.TabBadgeViewModel.1.1

                    @DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$1$1$1", f = "TabBadgeViewModel.kt", l = {117}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.tabs.TabBadgeViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C04081 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ FixedTab $tab;
                        public int label;
                        public final /* synthetic */ TabBadgeViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C04081(TabBadgeViewModel tabBadgeViewModel, FixedTab fixedTab, HtJ<? super C04081> htJ) {
                            super(2, htJ);
                            this.this$0 = tabBadgeViewModel;
                            this.$tab = fixedTab;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            return new C04081(this.this$0, this.$tab, htJ);
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                this.label = 1;
                                if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } else {
                                if (i != 1) {
                                    throw AnonymousClass001.A0n();
                                }
                                Hwg.A00(obj);
                            }
                            this.this$0.lightupTab.A6e(this.$tab, null);
                            return Unit.INSTANCE;
                        }

                        @Override // X.G0V
                        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                            return ((C04081) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((UiAction) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(UiAction uiAction, HtJ<? super Unit> htJ) {
                        FixedTab fixedTab = TabBadgeViewModelKt.toFixedTab(uiAction);
                        if (fixedTab != null) {
                            HtJ htJA13 = AnonymousClass006.A13(tabBadgeViewModel.lightupJob);
                            AnonymousClass001.A1E(tabBadgeViewModel.lightupTab, htJA13, fixedTab);
                            TabBadgeViewModel tabBadgeViewModel2 = tabBadgeViewModel;
                            tabBadgeViewModel2.lightupJob = AnonymousClass001.A11(new C04081(tabBadgeViewModel, fixedTab, htJA13), AEu.A00(tabBadgeViewModel2));
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$2", f = "TabBadgeViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.tabs.TabBadgeViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final TabBadgeViewModel tabBadgeViewModel = TabBadgeViewModel.this;
                C1BN<Map<FixedTab, Set<String>>> c1bn = tabBadgeViewModel.attentionIds;
                C20Z<? super Map<FixedTab, Set<String>>> c20z = new C20Z() { // from class: com.facebook.aura.tabs.TabBadgeViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Map<FixedTab, ? extends Set<String>>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Map<FixedTab, ? extends Set<String>> map, HtJ<? super Unit> htJ) {
                        Map<FixedTab, Set<String>> value;
                        LinkedHashMap linkedHashMap;
                        BLG<Map<FixedTab, Set<String>>> blg = tabBadgeViewModel.seenAttentionIds;
                        do {
                            value = blg.getValue();
                            Map<FixedTab, Set<String>> map2 = value;
                            linkedHashMap = new LinkedHashMap(AIW.A0H(map2.size()));
                            for (Map.Entry<FixedTab, Set<String>> entry : map2.entrySet()) {
                                FixedTab key = entry.getKey();
                                FixedTab key2 = entry.getKey();
                                Set<String> value2 = entry.getValue();
                                Set<String> set = map.get(key2);
                                if (set == null) {
                                    set = A3q.A00;
                                }
                                linkedHashMap.put(key, AbstractC0878AGe.A0S(value2, set));
                            }
                        } while (!blg.A6e(value, linkedHashMap));
                        FixedTab value3 = tabBadgeViewModel.currentTab.getValue();
                        if (value3 != null) {
                            tabBadgeViewModel.markAttentionSeen(value3);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.tabs.TabBadgeViewModel$3", f = "TabBadgeViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.tabs.TabBadgeViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final TabBadgeViewModel tabBadgeViewModel = TabBadgeViewModel.this;
                C1BN<Set<String>> c1bn = tabBadgeViewModel.pendingAgentPermissionApprovalIds;
                C20Z<? super Set<String>> c20z = new C20Z() { // from class: com.facebook.aura.tabs.TabBadgeViewModel.3.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Set<String>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(Set<String> set, HtJ<? super Unit> htJ) {
                        Set<String> value;
                        BLG<Set<String>> blg = tabBadgeViewModel.seenAgentPermissionApprovalIds;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, AbstractC0878AGe.A0S(value, set)));
                        if (tabBadgeViewModel.currentTab.getValue() == FixedTab.CHAT) {
                            tabBadgeViewModel.markCurrentAgentPermissionApprovalsSeen();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return TabBadgeViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<TabBadgeViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public TabBadgeViewModel create() {
            return new TabBadgeViewModel(HatchAgentPermissionsRepository.Companion.getInstance(this.userSession), UiControlActionSink.Companion.getInstance(this.userSession), TabAttentions.INSTANCE.observe(this.userSession));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markAttentionSeen(FixedTab fixedTab) {
        Map<FixedTab, Set<String>> value;
        Map<FixedTab, Set<String>> map;
        Set<String> set;
        Set<String> set2 = this.attentionIds.getValue().get(fixedTab);
        if (set2 != null) {
            BLG<Map<FixedTab, Set<String>>> blg = this.seenAttentionIds;
            do {
                value = blg.getValue();
                map = value;
                set = map.get(fixedTab);
                if (set == null) {
                    set = A3q.A00;
                }
            } while (!blg.A6e(value, AGH.A0C(map, new HxE(fixedTab, BGK.A01(set2, set)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markCurrentAgentPermissionApprovalsSeen() {
        Set<String> value;
        Set<String> value2 = this.pendingAgentPermissionApprovalIds.getValue();
        if (value2.isEmpty()) {
            return;
        }
        BLG<Set<String>> blg = this.seenAgentPermissionApprovalIds;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, BGK.A01(value2, value)));
    }

    public final C1BN<Map<FixedTab, TabBadgeType>> getUiState() {
        return this.uiState;
    }

    public TabBadgeViewModel(HatchAgentPermissionsRepository hatchAgentPermissionsRepository, UiControlActionSink uiControlActionSink, C20Q<? extends Map<AuraTabRootNavKey, ? extends Set<String>>> c20q) {
        AnonymousClass005.A0x(hatchAgentPermissionsRepository, uiControlActionSink, c20q);
        this.agentPermissionsRepository = hatchAgentPermissionsRepository;
        this.actionSink = uiControlActionSink;
        HrH hrH = HwN.A01;
        C9286GCn c9286GCn = new C9286GCn(hrH);
        this.lightupTab = c9286GCn;
        C9286GCn c9286GCn2 = new C9286GCn(hrH);
        this.currentTab = c9286GCn2;
        A3q a3q = A3q.A00;
        C9286GCn c9286GCnA01 = HnJ.A01(a3q);
        this.seenAgentPermissionApprovalIds = c9286GCnA01;
        C20Q c20qA01 = GDB.A01(new TabBadgeViewModel$special$$inlined$map$1(hatchAgentPermissionsRepository.pendingApprovals));
        BLL bllA00 = AEu.A00(this);
        C3Ej c3Ej = C3Ek.A00;
        C3Pi c3PiA00 = AnonymousClass441.A00(a3q, bllA00, c20qA01, c3Ej);
        this.pendingAgentPermissionApprovalIds = c3PiA00;
        C20Q c20qA012 = GDB.A01(new TabBadgeViewModel$special$$inlined$map$2(c20q));
        BLL bllA002 = AEu.A00(this);
        C9jH c9jHA0E = AGH.A0E();
        C3Pi c3PiA002 = AnonymousClass441.A00(c9jHA0E, bllA002, c20qA012, c3Ej);
        this.attentionIds = c3PiA002;
        C9286GCn c9286GCnA012 = HnJ.A01(c9jHA0E);
        this.seenAttentionIds = c9286GCnA012;
        AnonymousClass603 anonymousClass603A00 = C3rb.A00(new TabBadgeViewModel$wavingTabs$1(null), c9286GCn2, c3PiA002, c9286GCnA012);
        this.wavingTabs = anonymousClass603A00;
        this.uiState = AnonymousClass441.A00(c9jHA0E, AEu.A00(this), C3rb.A02(new TabBadgeViewModel$uiState$1(null), c9286GCn2, c3PiA00, c9286GCnA01, c9286GCn, anonymousClass603A00), c3Ej);
        BLL bllA003 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass3(null), AnonymousClass001.A0e(this, num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA003)));
    }

    public final void onCurrentTabRootChanged(AuraTabRootNavKey auraTabRootNavKey) {
        FixedTab fixedTab = TabBadgeViewModelKt.toFixedTab(auraTabRootNavKey);
        this.currentTab.Af8(fixedTab);
        if (fixedTab != null && this.lightupTab.getValue() == fixedTab) {
            HoC hoC = this.lightupJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.lightupJob = null;
            this.lightupTab.Af8(null);
        }
        if (fixedTab == FixedTab.CHAT) {
            markCurrentAgentPermissionApprovalsSeen();
        } else if (fixedTab == null) {
            return;
        }
        markAttentionSeen(fixedTab);
    }
}
