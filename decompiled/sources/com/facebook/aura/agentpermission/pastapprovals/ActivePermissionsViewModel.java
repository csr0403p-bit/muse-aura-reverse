package com.facebook.aura.agentpermission.pastapprovals;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C0953AJg;
import X.C10550Hrx;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC0962AJp;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import com.facebook.aura.toast.api.ToastApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ActivePermissionsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ActivePermissionsUiState> _uiState;
    public final HatchConnectorCatalogRepository connectorRepository;
    public final ActivePermissionsRepository repository;
    public final C1BN<ActivePermissionsUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$1", f = "ActivePermissionsViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivePermissionsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectorCatalogRepository hatchConnectorCatalogRepository = ActivePermissionsViewModel.this.connectorRepository;
                this.label = 1;
                if (hatchConnectorCatalogRepository.m2118fetchConnectedConnectorsIoAF18A(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$2", f = "ActivePermissionsViewModel.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivePermissionsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<AHD<Skill>> c20qObserveCachedConnectors = ActivePermissionsViewModel.this.connectorRepository.observeCachedConnectors(null);
                final ActivePermissionsViewModel activePermissionsViewModel = ActivePermissionsViewModel.this;
                C20Z<? super AHD<Skill>> c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.2.1
                    public final Object emit(AHD<Skill> ahd, HtJ<? super Unit> htJ) {
                        ActivePermissionsUiState value;
                        ArrayList arrayListA0h = C3cG.A0h();
                        for (Skill skill : ahd) {
                            String str = skill.iconUrl;
                            if (str != null) {
                                AnonymousClass002.A1J(skill.id, str, arrayListA0h);
                            }
                        }
                        InterfaceC0962AJp interfaceC0962AJpA0F = AGI.A0F(AGH.A06(arrayListA0h));
                        BLG<ActivePermissionsUiState> blg = activePermissionsViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, ActivePermissionsUiState.copy$default(value, null, null, false, null, null, null, false, false, null, null, false, interfaceC0962AJpA0F, 2047, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AHD<Skill>) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20qObserveCachedConnectors.collect(c20z, this) == enumC10460Hji) {
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
    }

    public final class Factory extends AuraViewModelFactory<ActivePermissionsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ActivePermissionsViewModel create() {
            return new ActivePermissionsViewModel(this.userSession, null, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel", f = "ActivePermissionsViewModel.kt", l = {273}, m = "applyRefreshedPage", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$applyRefreshedPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C108701 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C108701(HtJ<? super C108701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePermissionsViewModel.this.applyRefreshedPage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel", f = "ActivePermissionsViewModel.kt", l = {118}, m = "loadFirstPage", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadFirstPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C108711 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C108711(HtJ<? super C108711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePermissionsViewModel.this.loadFirstPage(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadFirstPage$2", f = "ActivePermissionsViewModel.kt", l = {121, 121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadFirstPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C108722 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends ActivePermissionsGroupedPage, ? extends ActivePermissionsPage>>, Object> {
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        public C108722(HtJ<? super C108722> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C108722 c108722 = ActivePermissionsViewModel.this.new C108722(htJ);
            c108722.L$0 = obj;
            return c108722;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA01;
            Object obj2;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivePermissionsViewModel$loadFirstPage$2$grouped$1 activePermissionsViewModel$loadFirstPage$2$grouped$1 = new ActivePermissionsViewModel$loadFirstPage$2$grouped$1(ActivePermissionsViewModel.this, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, activePermissionsViewModel$loadFirstPage$2$grouped$1, c3ux);
                objA01 = GAo.A01(num, c6ys, new ActivePermissionsViewModel$loadFirstPage$2$flat$1(ActivePermissionsViewModel.this, null), c3ux);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = objA01;
                this.label = 1;
                obj = c10550HrxA01.A0E(this);
                if (obj != enumC10460Hji) {
                }
                return enumC10460Hji;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                obj2 = this.L$3;
                Hwg.A00(obj);
                return C3cG.A0r(obj2, obj);
            }
            objA01 = (C27k) this.L$2;
            Hwg.A00(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = obj;
            this.label = 2;
            Object objA0W = C3cG.A0W(objA01, this);
            if (objA0W != enumC10460Hji) {
                obj2 = obj;
                obj = objA0W;
                return C3cG.A0r(obj2, obj);
            }
            return enumC10460Hji;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HxE<ActivePermissionsGroupedPage, ActivePermissionsPage>> htJ) {
            return ((C108722) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends ActivePermissionsGroupedPage, ? extends ActivePermissionsPage>> htJ) {
            return invoke2(c3ux, (HtJ<? super HxE<ActivePermissionsGroupedPage, ActivePermissionsPage>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel", f = "ActivePermissionsViewModel.kt", l = {157}, m = "loadNextPage", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadNextPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C108731 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C108731(HtJ<? super C108731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ActivePermissionsViewModel.this.loadNextPage(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadNextPage$2", f = "ActivePermissionsViewModel.kt", l = {162, 162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadNextPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C108742 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends ActivePermissionsGroupedPage, ? extends ActivePermissionsPage>>, Object> {
        public final /* synthetic */ String $flatCursor;
        public final /* synthetic */ String $groupCursor;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ ActivePermissionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108742(String str, ActivePermissionsViewModel activePermissionsViewModel, String str2, HtJ<? super C108742> htJ) {
            super(2, htJ);
            this.$groupCursor = str;
            this.this$0 = activePermissionsViewModel;
            this.$flatCursor = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C108742 c108742 = new C108742(this.$groupCursor, this.this$0, this.$flatCursor, htJ);
            c108742.L$0 = obj;
            return c108742;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA01;
            Object obj2;
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ActivePermissionsViewModel$loadNextPage$2$grouped$1 activePermissionsViewModel$loadNextPage$2$grouped$1 = new ActivePermissionsViewModel$loadNextPage$2$grouped$1(this.$groupCursor, this.this$0, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                C10550Hrx c10550HrxA01 = GAo.A01(num, c6ys, activePermissionsViewModel$loadNextPage$2$grouped$1, c3ux);
                objA01 = GAo.A01(num, c6ys, new ActivePermissionsViewModel$loadNextPage$2$flat$1(this.$flatCursor, this.this$0, null), c3ux);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = objA01;
                this.label = 1;
                obj = c10550HrxA01.A0E(this);
                if (obj != enumC10460Hji) {
                }
                return enumC10460Hji;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                obj2 = this.L$3;
                Hwg.A00(obj);
                return C3cG.A0r(obj2, obj);
            }
            objA01 = (C27k) this.L$2;
            Hwg.A00(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = obj;
            this.label = 2;
            Object objA0W = C3cG.A0W(objA01, this);
            if (objA0W != enumC10460Hji) {
                obj2 = obj;
                obj = objA0W;
                return C3cG.A0r(obj2, obj);
            }
            return enumC10460Hji;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HxE<ActivePermissionsGroupedPage, ActivePermissionsPage>> htJ) {
            return ((C108742) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends ActivePermissionsGroupedPage, ? extends ActivePermissionsPage>> htJ) {
            return invoke2(c3ux, (HtJ<? super HxE<ActivePermissionsGroupedPage, ActivePermissionsPage>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadPermissions$1", f = "ActivePermissionsViewModel.kt", l = {109, 111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$loadPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C108751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $reset;
        public int I$0;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108751(boolean z, HtJ<? super C108751> htJ) {
            super(2, htJ);
            this.$reset = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new C108751(this.$reset, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                r26 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                r8 = r26
                int r0 = r8.label
                r6 = 2
                r5 = 1
                if (r0 == 0) goto L13
                if (r0 == r5) goto L9a
                if (r0 == r6) goto L9a
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L13:
                X.Hwg.A00(r27)
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.this
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r4 = X.C60Q.A0E(r0)
                boolean r0 = r8.$reset
                if (r0 != 0) goto L27
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState r1 = r4.loadingState
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState.IDLE
                r3 = 0
                if (r1 != r0) goto L28
            L27:
                r3 = 1
            L28:
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.this
                X.BLG<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState> r2 = r0._uiState
            L2c:
                java.lang.Object r1 = r2.getValue()
                r13 = r1
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r13 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState) r13
                if (r3 == 0) goto L7b
                X.AHI r16 = X.AHI.A01
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState r19 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState.LOADING
                r14 = 0
                boolean r12 = r13.isGrouped
                java.lang.String r11 = r13.revokingPermissionId
                java.lang.String r10 = r13.updatingPermissionId
                boolean r9 = r13.isResetting
                X.BO6<java.lang.String, java.lang.String> r0 = r13.connectorIconUrls
                r23 = 0
                r15 = r13
                r17 = r16
                r18 = r12
                r20 = r14
                r21 = r14
                r22 = r5
                r24 = r11
                r25 = r10
                r26 = r9
                r27 = r0
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = r15.copy(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            L5d:
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L2c
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.this
                r8.L$0 = r14
                r8.I$0 = r3
                if (r3 == 0) goto L74
                r8.label = r5
                java.lang.Object r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.access$loadFirstPage(r0, r8)
            L71:
                if (r0 != r7) goto L9d
                return r7
            L74:
                r8.label = r6
                java.lang.Object r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.access$loadNextPage(r0, r4, r8)
                goto L71
            L7b:
                r26 = 3967(0xf7f, float:5.559E-42)
                r14 = 0
                r16 = 0
                r15 = r14
                r17 = r14
                r18 = r14
                r19 = r14
                r20 = r16
                r22 = r14
                r23 = r14
                r24 = r16
                r25 = r14
                r27 = r14
                r21 = r5
                com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState.copy$default(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                goto L5d
            L9a:
                X.Hwg.A00(r27)
            L9d:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.C108751.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C108751) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$resetPermissions$1", f = "ActivePermissionsViewModel.kt", l = {258, 260}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$resetPermissions$1, reason: invalid class name and case insensitive filesystem */
    public final class C108761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C108761(HtJ<? super C108761> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new C108761(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ActivePermissionsViewModel.this.new C108761(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ActivePermissionsUiState value;
            Object objM198resetPermissionsIoAF18A;
            ActivePermissionsUiState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<ActivePermissionsUiState> blg = ActivePermissionsViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, ActivePermissionsUiState.copy$default(value, null, null, false, null, null, null, false, false, null, null, true, null, 3071, null)));
                ActivePermissionsRepository activePermissionsRepository = ActivePermissionsViewModel.this.repository;
                this.label = 1;
                objM198resetPermissionsIoAF18A = activePermissionsRepository.m198resetPermissionsIoAF18A(this);
                if (objM198resetPermissionsIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                objM198resetPermissionsIoAF18A = AnonymousClass002.A0j(obj);
            }
            ActivePermissionsViewModel activePermissionsViewModel = ActivePermissionsViewModel.this;
            if (HsJ.A00(objM198resetPermissionsIoAF18A) == null) {
                this.L$0 = null;
                this.label = 2;
                if (activePermissionsViewModel.applyRefreshedPage((ActivePermissionsPage) objM198resetPermissionsIoAF18A, null, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                BLG<ActivePermissionsUiState> blg2 = activePermissionsViewModel._uiState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, ActivePermissionsUiState.copy$default(value2, null, null, false, null, null, null, false, false, null, null, false, null, 3071, null)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$revokePermission$1", f = "ActivePermissionsViewModel.kt", l = {236, 239}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$revokePermission$1, reason: invalid class name and case insensitive filesystem */
    public final class C108771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ActivePermission $permission;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108771(ActivePermission activePermission, HtJ<? super C108771> htJ) {
            super(2, htJ);
            this.$permission = activePermission;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new C108771(this.$permission, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ActivePermissionsUiState value;
            Object objM199revokePermissiongIAlus;
            ActivePermissionsUiState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<ActivePermissionsUiState> blg = ActivePermissionsViewModel.this._uiState;
                ActivePermission activePermission = this.$permission;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, ActivePermissionsUiState.copy$default(value, null, null, false, null, null, null, false, false, activePermission.permissionId, null, false, null, 3839, null)));
                ActivePermissionsRepository activePermissionsRepository = ActivePermissionsViewModel.this.repository;
                ActivePermission activePermission2 = this.$permission;
                this.label = 1;
                objM199revokePermissiongIAlus = activePermissionsRepository.m199revokePermissiongIAlus(activePermission2, this);
                if (objM199revokePermissiongIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                objM199revokePermissiongIAlus = AnonymousClass002.A0j(obj);
            }
            ActivePermissionsViewModel activePermissionsViewModel = ActivePermissionsViewModel.this;
            ActivePermission activePermission3 = this.$permission;
            if (HsJ.A00(objM199revokePermissiongIAlus) == null) {
                String str = activePermission3.permissionId;
                this.L$0 = null;
                this.label = 2;
                if (activePermissionsViewModel.applyRefreshedPage((ActivePermissionsPage) objM199revokePermissiongIAlus, str, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                BLG<ActivePermissionsUiState> blg2 = activePermissionsViewModel._uiState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, ActivePermissionsUiState.copy$default(value2, null, null, false, null, null, null, false, false, null, null, false, null, 3839, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C108771) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$setPermissionMode$1", f = "ActivePermissionsViewModel.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 219}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$setPermissionMode$1, reason: invalid class name and case insensitive filesystem */
    public final class C108781 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectorPermissionMode $mode;
        public final /* synthetic */ ActivePermission $permission;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108781(ActivePermission activePermission, ConnectorPermissionMode connectorPermissionMode, HtJ<? super C108781> htJ) {
            super(2, htJ);
            this.$permission = activePermission;
            this.$mode = connectorPermissionMode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ActivePermissionsViewModel.this.new C108781(this.$permission, this.$mode, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ActivePermissionsUiState value;
            Object objM200setPermissionMode0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<ActivePermissionsUiState> blg = ActivePermissionsViewModel.this._uiState;
                ActivePermission activePermission = this.$permission;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, ActivePermissionsUiState.copy$default(value, null, null, false, null, null, null, false, false, null, activePermission.permissionId, false, null, 3583, null)));
                ActivePermissionsRepository activePermissionsRepository = ActivePermissionsViewModel.this.repository;
                ActivePermission activePermission2 = this.$permission;
                ConnectorPermissionMode connectorPermissionMode = this.$mode;
                this.label = 1;
                objM200setPermissionMode0E7RQCE = activePermissionsRepository.m200setPermissionMode0E7RQCE(activePermission2, connectorPermissionMode, this);
                if (objM200setPermissionMode0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                objM200setPermissionMode0E7RQCE = AnonymousClass002.A0j(obj);
            }
            if (HsJ.A00(objM200setPermissionMode0E7RQCE) != null) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f12014b);
            }
            ActivePermissionsViewModel activePermissionsViewModel = ActivePermissionsViewModel.this;
            this.label = 2;
            if (activePermissionsViewModel.loadFirstPage(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C108781) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ActivePermissionsViewModel(AbstractC3358CGz abstractC3358CGz, ActivePermissionsRepository activePermissionsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository) {
        AnonymousClass005.A10(abstractC3358CGz, activePermissionsRepository, hatchConnectorCatalogRepository);
        this.repository = activePermissionsRepository;
        this.connectorRepository = hatchConnectorCatalogRepository;
        AHI ahi = AHI.A01;
        C9286GCn c9286GCnA14 = C3cG.A14(new ActivePermissionsUiState(ahi, ahi, false, ActivePermissionsLoadingState.IDLE, null, null, true, false, null, null, false, C0953AJg.A00()));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        BLL bllA00 = AEu.A00(this);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass1, bllA00));
    }

    public final void revokePermission(ActivePermission activePermission) {
        C7384Etj.A0Y(activePermission, 0);
        if (activePermission.revocable && C60Q.A0E(this).revokingPermissionId == null && C60Q.A0E(this).updatingPermissionId == null && !C60Q.A0E(this).isLoadingMore && !C60Q.A0E(this).isResetting) {
            AnonymousClass001.A1J(new C108771(activePermission, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyRefreshedPage(com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage r23, java.lang.String r24, X.HtJ<? super kotlin.Unit> r25) {
        /*
            r22 = this;
            r3 = r25
            r5 = r24
            r4 = r23
            boolean r0 = r3 instanceof com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.C108701
            r8 = r22
            if (r0 == 0) goto Lb7
            r9 = r3
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$applyRefreshedPage$1 r9 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.C108701) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb7
            int r2 = r2 - r1
            r9.label = r2
        L1a:
            java.lang.Object r2 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r7 = 0
            r1 = 1
            if (r0 == 0) goto L98
            if (r0 != r1) goto Lbe
            boolean r6 = r9.Z$0
            java.lang.Object r5 = r9.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r9.L$0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage r4 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage) r4
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)
        L34:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 != 0) goto L39
            r7 = r1
        L39:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsGroupedPage r7 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsGroupedPage) r7
        L3b:
            X.BLG<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState> r3 = r8._uiState
        L3d:
            java.lang.Object r2 = r3.getValue()
            r13 = r2
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r13 = (com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState) r13
            if (r7 == 0) goto L8d
            java.util.List<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionGroup> r0 = r7.groups
            X.AHH r15 = X.AGI.A0C(r0)
            java.lang.String r1 = r7.nextCursor
        L4e:
            java.util.List<com.facebook.aura.agentpermission.pastapprovals.ActivePermission> r0 = r4.items
            X.AHH r14 = X.AGI.A0C(r0)
            r9 = 0
            if (r6 != 0) goto L5b
            r16 = 0
            if (r7 == 0) goto L5d
        L5b:
            r16 = 1
        L5d:
            java.lang.String r0 = r4.nextCursor
            if (r6 != 0) goto L63
            if (r7 == 0) goto L64
        L63:
            r9 = 1
        L64:
            boolean r20 = r8.canLoadMore(r9, r1, r0)
            r22 = 0
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsLoadingState r12 = r13.loadingState
            boolean r11 = r13.isLoadingMore
            java.lang.String r10 = r13.updatingPermissionId
            X.BO6<java.lang.String, java.lang.String> r9 = r13.connectorIconUrls
            r24 = 0
            r25 = r9
            r21 = r11
            r23 = r10
            r19 = r1
            r18 = r0
            r17 = r12
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = r13.copy(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r3.A6e(r2, r0)
            if (r0 == 0) goto L3d
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L8d:
            X.AHD<com.facebook.aura.agentpermission.pastapprovals.ActivePermissionGroup> r15 = r13.groups
            if (r6 == 0) goto L95
            X.AHD r15 = r8.withoutPermission(r15, r5)
        L95:
            java.lang.String r1 = r13.groupCursor
            goto L4e
        L98:
            X.Hwg.A00(r2)
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r0 = X.C60Q.A0E(r8)
            boolean r6 = r0.isGrouped
            if (r6 == 0) goto L3b
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsRepository r2 = r8.repository
            r9.L$0 = r4
            r9.L$1 = r5
            r9.Z$0 = r6
            r9.label = r1
            r1 = 0
            r0 = 20
            java.lang.Object r1 = r2.m197getGroupedActivePermissions0E7RQCE(r1, r0, r9)
            if (r1 != r3) goto L34
            return r3
        Lb7:
            com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$applyRefreshedPage$1 r9 = new com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel$applyRefreshedPage$1
            r9.<init>(r3)
            goto L1a
        Lbe:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.applyRefreshedPage(com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsPage, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final boolean canLoadMore(boolean z, String str, String str2) {
        if (str2 == null || C7BY.A0j(str2)) {
            return (!z || str == null || C7BY.A0j(str)) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadFirstPage(X.HtJ<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.loadFirstPage(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadNextPage(com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsViewModel.loadNextPage(com.facebook.aura.agentpermission.pastapprovals.ActivePermissionsUiState, X.HtJ):java.lang.Object");
    }

    private final AHD<ActivePermissionGroup> withoutPermission(AHD<ActivePermissionGroup> ahd, String str) {
        if (str == null) {
            return AHI.A01;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (ActivePermissionGroup activePermissionGroup : ahd) {
            List<ActivePermission> list = activePermissionGroup.items;
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (ActivePermission activePermission : list) {
                if (!str.equals(activePermission.permissionId)) {
                    arrayListA0h2.add(activePermission);
                }
            }
            if (!arrayListA0h2.isEmpty()) {
                ActivePermissionScope activePermissionScope = activePermissionGroup.scope;
                C7384Etj.A0Y(activePermissionScope, 0);
                arrayListA0h.add(new ActivePermissionGroup(activePermissionScope, arrayListA0h2));
            }
        }
        return AGI.A0C(arrayListA0h);
    }

    public final C1BN<ActivePermissionsUiState> getUiState() {
        return this.uiState;
    }

    public final void loadPermissions(boolean z) {
        ActivePermissionsUiState activePermissionsUiStateA0E = C60Q.A0E(this);
        ActivePermissionsLoadingState activePermissionsLoadingState = activePermissionsUiStateA0E.loadingState;
        if (activePermissionsLoadingState == ActivePermissionsLoadingState.LOADING || activePermissionsUiStateA0E.isLoadingMore || activePermissionsUiStateA0E.revokingPermissionId != null || activePermissionsUiStateA0E.updatingPermissionId != null || activePermissionsUiStateA0E.isResetting) {
            return;
        }
        if (z || activePermissionsUiStateA0E.canLoadMore || activePermissionsLoadingState == ActivePermissionsLoadingState.IDLE) {
            AnonymousClass001.A1J(new C108751(z, null), AEu.A00(this));
        }
    }

    public final void resetPermissions() {
        if (C60Q.A0E(this).revokingPermissionId != null || C60Q.A0E(this).updatingPermissionId != null || C60Q.A0E(this).isLoadingMore || C60Q.A0E(this).isResetting) {
            return;
        }
        AnonymousClass001.A1J(new C108761(null), AEu.A00(this));
    }

    public final void setPermissionMode(ActivePermission activePermission, ConnectorPermissionMode connectorPermissionMode) {
        AnonymousClass003.A0u(activePermission, connectorPermissionMode);
        ActivePermissionsUiState activePermissionsUiStateA0E = C60Q.A0E(this);
        if (activePermission.mode == connectorPermissionMode || activePermission.modeOptions.isEmpty() || activePermissionsUiStateA0E.updatingPermissionId != null || activePermissionsUiStateA0E.revokingPermissionId != null || activePermissionsUiStateA0E.isLoadingMore || activePermissionsUiStateA0E.isResetting) {
            return;
        }
        AnonymousClass001.A1J(new C108781(activePermission, connectorPermissionMode, null), AEu.A00(this));
    }

    public /* synthetic */ ActivePermissionsViewModel(AbstractC3358CGz abstractC3358CGz, ActivePermissionsRepository activePermissionsRepository, HatchConnectorCatalogRepository hatchConnectorCatalogRepository, int i, C06H c06h) {
        this(abstractC3358CGz, (i & 2) != 0 ? ActivePermissionsRepository.Companion.getInstance(abstractC3358CGz) : activePermissionsRepository, (i & 4) != 0 ? HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz) : hatchConnectorCatalogRepository);
    }
}
