package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHG;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.BLL;
import X.BQI;
import X.C0881AGi;
import X.C0943AIw;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.pairs.SpaceCollaboratorsUiState;
import com.facebook.aura.toast.api.ToastApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorsViewModel extends AEs {
    public static final int $stable = 8;
    public HoC load;
    public final BLG<SpaceCollaboratorsUiState> mutableState;
    public volatile SpaceViewerProfileJson owner;
    public final PairsRepository repository;
    public final String slug;
    public final C1BN<SpaceCollaboratorsUiState> state;

    public final class Factory extends AuraViewModelFactory<SpaceCollaboratorsViewModel> {
        public static final int $stable = 8;
        public final String slug;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SpaceCollaboratorsViewModel create() {
            return new SpaceCollaboratorsViewModel(PairsRepository.Companion.getInstance(this.userSession), this.slug);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.slug = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorsViewModel", f = "SpaceCollaboratorsViewModel.kt", l = {134, 137, 137}, m = "applyOnce", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$applyOnce$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceCollaboratorsViewModel.this.applyOnce(null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$approve$1, reason: invalid class name and case insensitive filesystem */
    public final class C130301 extends AbstractC7559F3s implements G0U<SpaceCollaborators, SpaceCollaboratorsUpdateJson> {
        public final /* synthetic */ SpaceAccessRequest $request;

        @Override // X.G0U
        public final SpaceCollaboratorsUpdateJson invoke(SpaceCollaborators spaceCollaborators) {
            C7384Etj.A0Y(spaceCollaborators, 0);
            if (spaceCollaborators.principals.contains(this.$request.principal)) {
                SpaceAccessRequest spaceAccessRequest = this.$request;
                return spaceCollaborators.update(null, C3cG.A0r(spaceAccessRequest.principal, spaceAccessRequest.role), C0881AGi.A00);
            }
            SpaceCollaboratorsUpdateJson spaceCollaboratorsUpdateJsonUpdate = spaceCollaborators.update(null, null, C0881AGi.A00);
            SpaceAccessRequest spaceAccessRequest2 = this.$request;
            return new SpaceCollaboratorsUpdateJson(AbstractC0878AGe.A0Q(new SpaceCollaboratorUpdateJson(spaceAccessRequest2.principal, spaceAccessRequest2.role.getWire()), spaceCollaboratorsUpdateJsonUpdate.collaborators), spaceCollaboratorsUpdateJsonUpdate.expected_connection_revision);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130301(SpaceAccessRequest spaceAccessRequest) {
            super(1);
            this.$request = spaceAccessRequest;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorsViewModel$decline$1", f = "SpaceCollaboratorsViewModel.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, MinidumpReader.MODULE_FULL_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$decline$1, reason: invalid class name and case insensitive filesystem */
    public final class C130311 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SpaceAccessRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130311(SpaceAccessRequest spaceAccessRequest, HtJ<? super C130311> htJ) {
            super(2, htJ);
            this.$request = spaceAccessRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorsViewModel.this.new C130311(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120fb3);
            }
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository pairsRepository = SpaceCollaboratorsViewModel.this.repository;
                String str = this.$request.activityId;
                this.label = 1;
                if (pairsRepository.dismissActivity(str, this) == enumC10460Hji) {
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
                Hwg.A00(obj);
            }
            SpaceCollaboratorsViewModel.this.setBusy(this.$request.activityId, false);
            SpaceCollaboratorsViewModel spaceCollaboratorsViewModel = SpaceCollaboratorsViewModel.this;
            this.label = 2;
            if (spaceCollaboratorsViewModel.refresh(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130311) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorsViewModel", f = "SpaceCollaboratorsViewModel.kt", l = {142}, m = "refresh", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C130321 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C130321(HtJ<? super C130321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceCollaboratorsViewModel.this.refresh(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorsViewModel$reload$1", f = "SpaceCollaboratorsViewModel.kt", l = {53, 55}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$reload$1, reason: invalid class name and case insensitive filesystem */
    public final class C130331 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C130331(HtJ<? super C130331> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorsViewModel.this.new C130331(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SpaceCollaboratorsViewModel.this.new C130331(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L16
                if (r0 == r2) goto L2e
                if (r0 != r3) goto L11
                java.lang.Object r2 = r5.L$0
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r2 = (com.facebook.aura.pairs.SpaceCollaboratorsViewModel) r2
                goto L4a
            L11:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L16:
                X.Hwg.A00(r6)
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r0 = com.facebook.aura.pairs.SpaceCollaboratorsViewModel.this
                com.facebook.aura.pairs.SpaceViewerProfileJson r0 = r0.owner
                if (r0 != 0) goto L39
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r0 = com.facebook.aura.pairs.SpaceCollaboratorsViewModel.this
                com.facebook.aura.pairs.PairsRepository r1 = r0.repository
                r5.L$0 = r0
                r5.label = r2
                java.lang.Object r6 = r1.viewerProfile(r5)
                if (r6 != r4) goto L35
                return r4
            L2e:
                java.lang.Object r0 = r5.L$0
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r0 = (com.facebook.aura.pairs.SpaceCollaboratorsViewModel) r0
                X.Hwg.A00(r6)
            L35:
                com.facebook.aura.pairs.SpaceViewerProfileJson r6 = (com.facebook.aura.pairs.SpaceViewerProfileJson) r6
                r0.owner = r6
            L39:
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r2 = com.facebook.aura.pairs.SpaceCollaboratorsViewModel.this     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                com.facebook.aura.pairs.PairsRepository r1 = r2.repository     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                java.lang.String r0 = r2.slug     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                r5.L$0 = r2     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                r5.label = r3     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                java.lang.Object r6 = r1.spaceCollaborators(r0, r5)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                if (r6 != r4) goto L4d
                return r4
            L4a:
                X.Hwg.A00(r6)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
            L4d:
                com.facebook.aura.pairs.SpaceCollaborators r6 = (com.facebook.aura.pairs.SpaceCollaborators) r6     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel.access$publish(r2, r6)     // Catch: java.lang.Exception -> L53 java.util.concurrent.CancellationException -> L6b
                goto L68
            L53:
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r0 = com.facebook.aura.pairs.SpaceCollaboratorsViewModel.this
                X.BLG<com.facebook.aura.pairs.SpaceCollaboratorsUiState> r0 = r0.mutableState
                java.lang.Object r0 = r0.getValue()
                boolean r0 = r0 instanceof com.facebook.aura.pairs.SpaceCollaboratorsUiState.Loaded
                if (r0 != 0) goto L68
                com.facebook.aura.pairs.SpaceCollaboratorsViewModel r0 = com.facebook.aura.pairs.SpaceCollaboratorsViewModel.this
                X.BLG<com.facebook.aura.pairs.SpaceCollaboratorsUiState> r1 = r0.mutableState
                com.facebook.aura.pairs.SpaceCollaboratorsUiState$Failed r0 = com.facebook.aura.pairs.SpaceCollaboratorsUiState.Failed.INSTANCE
                r1.Af8(r0)
            L68:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L6b:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorsViewModel.C130331.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C130341 extends AbstractC7559F3s implements G0U<SpaceCollaborators, SpaceCollaboratorsUpdateJson> {
        public final /* synthetic */ String $principal;

        @Override // X.G0U
        public final SpaceCollaboratorsUpdateJson invoke(SpaceCollaborators spaceCollaborators) {
            C7384Etj.A0Y(spaceCollaborators, 0);
            return spaceCollaborators.update(this.$principal, null, C0881AGi.A00);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130341(String str) {
            super(1);
            this.$principal = str;
        }
    }

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$setRole$1, reason: invalid class name and case insensitive filesystem */
    public final class C130351 extends AbstractC7559F3s implements G0U<SpaceCollaborators, SpaceCollaboratorsUpdateJson> {
        public final /* synthetic */ String $principal;
        public final /* synthetic */ SpaceRole $role;

        @Override // X.G0U
        public final SpaceCollaboratorsUpdateJson invoke(SpaceCollaborators spaceCollaborators) {
            C7384Etj.A0Y(spaceCollaborators, 0);
            return spaceCollaborators.update(null, C3cG.A0r(this.$principal, this.$role), C0881AGi.A00);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130351(String str, SpaceRole spaceRole) {
            super(1);
            this.$principal = str;
            this.$role = spaceRole;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SpaceCollaboratorsViewModel$write$1", f = "SpaceCollaboratorsViewModel.kt", l = {118, 123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorsViewModel$write$1, reason: invalid class name and case insensitive filesystem */
    public final class C130361 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ SpaceCollaboratorsUiState.Loaded $loaded;
        public final /* synthetic */ G0U<SpaceCollaborators, SpaceCollaboratorsUpdateJson> $update;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130361(SpaceCollaboratorsUiState.Loaded loaded, G0U<? super SpaceCollaborators, SpaceCollaboratorsUpdateJson> g0u, String str, HtJ<? super C130361> htJ) {
            super(2, htJ);
            this.$loaded = loaded;
            this.$update = g0u;
            this.$key = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SpaceCollaboratorsViewModel.this.new C130361(this.$loaded, this.$update, this.$key, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            SpaceCollaboratorsViewModel spaceCollaboratorsViewModel;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                ToastApi.INSTANCE.showToast(SpaceCollaboratorsViewModelKt.writeFailureMessage(e2));
                SpaceCollaboratorsViewModel spaceCollaboratorsViewModel2 = SpaceCollaboratorsViewModel.this;
                this.L$0 = null;
                this.label = 2;
                if (spaceCollaboratorsViewModel2.refresh(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (i == 0) {
                Hwg.A00(obj);
                spaceCollaboratorsViewModel = SpaceCollaboratorsViewModel.this;
                SpaceCollaborators spaceCollaborators = this.$loaded.collaborators;
                G0U<SpaceCollaborators, SpaceCollaboratorsUpdateJson> g0u = this.$update;
                this.L$0 = spaceCollaboratorsViewModel;
                this.label = 1;
                obj = spaceCollaboratorsViewModel.applyOnce(spaceCollaborators, g0u, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    SpaceCollaboratorsViewModel.this.setBusy(this.$key, false);
                    return Unit.INSTANCE;
                }
                spaceCollaboratorsViewModel = (SpaceCollaboratorsViewModel) this.L$0;
                Hwg.A00(obj);
            }
            spaceCollaboratorsViewModel.publish((SpaceCollaborators) obj);
            SpaceCollaboratorsViewModel.this.setBusy(this.$key, false);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130361) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void write(String str, G0U<? super SpaceCollaborators, SpaceCollaboratorsUpdateJson> g0u) {
        SpaceCollaboratorsUiState.Loaded loaded;
        SpaceCollaboratorsUiState value = this.mutableState.getValue();
        if (!(value instanceof SpaceCollaboratorsUiState.Loaded) || (loaded = (SpaceCollaboratorsUiState.Loaded) value) == null || loaded.busy.contains(str)) {
            return;
        }
        setBusy(str, true);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C130361(loaded, g0u, str, null), AEu.A00(this));
    }

    public final void approve(SpaceAccessRequest spaceAccessRequest) {
        C7384Etj.A0Y(spaceAccessRequest, 0);
        write(spaceAccessRequest.activityId, new C130301(spaceAccessRequest));
    }

    public final void decline(SpaceAccessRequest spaceAccessRequest) {
        SpaceCollaboratorsUiState.Loaded loaded;
        C7384Etj.A0Y(spaceAccessRequest, 0);
        SpaceCollaboratorsUiState value = this.mutableState.getValue();
        if (!(value instanceof SpaceCollaboratorsUiState.Loaded) || (loaded = (SpaceCollaboratorsUiState.Loaded) value) == null || loaded.busy.contains(spaceAccessRequest.activityId)) {
            return;
        }
        setBusy(spaceAccessRequest.activityId, true);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C130311(spaceAccessRequest, null), AEu.A00(this));
    }

    public final void remove(String str) {
        C7384Etj.A0Y(str, 0);
        write(str, new C130341(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[PHI: r0
  0x0026: PHI (r0v9 java.lang.Object) = (r0v5 java.lang.Object), (r0v1 java.lang.Object) binds: [B:26:0x0091, B:12:0x0023] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object applyOnce(com.facebook.aura.pairs.SpaceCollaborators r10, X.G0U<? super com.facebook.aura.pairs.SpaceCollaborators, com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson> r11, X.HtJ<? super com.facebook.aura.pairs.SpaceCollaborators> r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.pairs.SpaceCollaboratorsViewModel.AnonymousClass1
            if (r0 == 0) goto L94
            r4 = r12
            com.facebook.aura.pairs.SpaceCollaboratorsViewModel$applyOnce$1 r4 = (com.facebook.aura.pairs.SpaceCollaboratorsViewModel.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L2f
            if (r1 == r8) goto L27
            if (r1 == r7) goto L69
            if (r1 != r3) goto L9c
            X.Hwg.A00(r0)
        L26:
            return r0
        L27:
            java.lang.Object r11 = r4.L$1
            X.G0U r11 = (X.G0U) r11
            X.Hwg.A00(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L48
            goto L9b
        L2f:
            X.Hwg.A00(r0)
            com.facebook.aura.pairs.PairsRepository r6 = r9.repository     // Catch: com.facebook.aura.pairs.PairsException -> L48
            java.lang.String r2 = r9.slug     // Catch: com.facebook.aura.pairs.PairsException -> L48
            java.lang.Object r1 = r11.invoke(r10)     // Catch: com.facebook.aura.pairs.PairsException -> L48
            com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson r1 = (com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson) r1     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r0 = 0
            r4.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r4.L$1 = r11     // Catch: com.facebook.aura.pairs.PairsException -> L48
            r4.label = r8     // Catch: com.facebook.aura.pairs.PairsException -> L48
            java.lang.Object r0 = r6.updateSpaceCollaborators(r2, r1, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L48
            goto L91
        L48:
            r2 = move-exception
            com.facebook.aura.pairs.PairsError r1 = r2.error
            com.facebook.aura.pairs.PairsError r0 = com.facebook.aura.pairs.PairsError.CONFLICT
            if (r1 != r0) goto La0
            com.facebook.aura.pairs.PairsRepository r2 = r9.repository
            java.lang.String r6 = r9.slug
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r2
            r4.L$4 = r6
            r4.L$5 = r11
            r4.label = r7
            java.lang.Object r0 = r2.spaceCollaborators(r6, r4)
            if (r0 != r5) goto L78
            return r5
        L69:
            java.lang.Object r11 = r4.L$5
            X.G0U r11 = (X.G0U) r11
            java.lang.Object r6 = r4.L$4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r4.L$3
            com.facebook.aura.pairs.PairsRepository r2 = (com.facebook.aura.pairs.PairsRepository) r2
            X.Hwg.A00(r0)
        L78:
            java.lang.Object r1 = r11.invoke(r0)
            com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson r1 = (com.facebook.aura.pairs.SpaceCollaboratorsUpdateJson) r1
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r0
            r4.L$5 = r0
            r4.label = r3
            java.lang.Object r0 = r2.updateSpaceCollaborators(r6, r1, r4)
        L91:
            if (r0 != r5) goto L26
            return r5
        L94:
            com.facebook.aura.pairs.SpaceCollaboratorsViewModel$applyOnce$1 r4 = new com.facebook.aura.pairs.SpaceCollaboratorsViewModel$applyOnce$1
            r4.<init>(r12)
            goto L12
        L9b:
            return r0
        L9c:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        La0:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorsViewModel.applyOnce(com.facebook.aura.pairs.SpaceCollaborators, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publish(SpaceCollaborators spaceCollaborators) {
        SpaceCollaboratorsUiState value;
        SpaceViewerProfileJson spaceViewerProfileJson;
        BQI bqi;
        SpaceCollaboratorsUiState.Loaded loaded;
        BLG<SpaceCollaboratorsUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
            SpaceCollaboratorsUiState spaceCollaboratorsUiState = value;
            spaceViewerProfileJson = this.owner;
            if (!(spaceCollaboratorsUiState instanceof SpaceCollaboratorsUiState.Loaded) || (loaded = (SpaceCollaboratorsUiState.Loaded) spaceCollaboratorsUiState) == null || (bqi = loaded.busy) == null) {
                bqi = C0943AIw.A03;
            }
        } while (!blg.A6e(value, new SpaceCollaboratorsUiState.Loaded(spaceCollaborators, spaceViewerProfileJson, bqi)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refresh(X.HtJ<? super kotlin.Unit> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.SpaceCollaboratorsViewModel.C130321
            if (r0 == 0) goto L22
            r4 = r6
            com.facebook.aura.pairs.SpaceCollaboratorsViewModel$refresh$1 r4 = (com.facebook.aura.pairs.SpaceCollaboratorsViewModel.C130321) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            java.lang.Object r5 = r4.L$0
            com.facebook.aura.pairs.SpaceCollaboratorsViewModel r5 = (com.facebook.aura.pairs.SpaceCollaboratorsViewModel) r5
            goto L3f
        L22:
            com.facebook.aura.pairs.SpaceCollaboratorsViewModel$refresh$1 r4 = new com.facebook.aura.pairs.SpaceCollaboratorsViewModel$refresh$1
            r4.<init>(r6)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.pairs.PairsRepository r1 = r5.repository     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            java.lang.String r0 = r5.slug     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            r4.L$0 = r5     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            r4.label = r2     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            java.lang.Object r1 = r1.spaceCollaborators(r0, r4)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            if (r1 != r3) goto L42
            return r3
        L3f:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
        L42:
            com.facebook.aura.pairs.SpaceCollaborators r1 = (com.facebook.aura.pairs.SpaceCollaborators) r1     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
            r5.publish(r1)     // Catch: java.lang.Exception -> L47 java.util.concurrent.CancellationException -> L4a
        L47:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L4a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SpaceCollaboratorsViewModel.refresh(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBusy(String str, boolean z) {
        SpaceCollaboratorsUiState value;
        SpaceCollaboratorsUiState loaded;
        BLG<SpaceCollaboratorsUiState> blg = this.mutableState;
        do {
            value = blg.getValue();
            loaded = value;
            if (loaded instanceof SpaceCollaboratorsUiState.Loaded) {
                SpaceCollaboratorsUiState.Loaded loaded2 = (SpaceCollaboratorsUiState.Loaded) loaded;
                SpaceCollaborators spaceCollaborators = loaded2.collaborators;
                SpaceViewerProfileJson spaceViewerProfileJson = loaded2.owner;
                AHG ahgA0H = AGI.A0H(loaded2.busy);
                loaded = new SpaceCollaboratorsUiState.Loaded(spaceCollaborators, spaceViewerProfileJson, z ? ahgA0H.A35(str) : ahgA0H.Aaa(str));
            }
        } while (!blg.A6e(value, loaded));
    }

    public final C1BN<SpaceCollaboratorsUiState> getState() {
        return this.state;
    }

    public final void reload() {
        HoC hoC = this.load;
        if (hoC == null || !hoC.isActive()) {
            BLL bllA00 = AEu.A00(this);
            this.load = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C130331(null), bllA00);
        }
    }

    public final void retry() {
        this.mutableState.Af8(SpaceCollaboratorsUiState.Loading.INSTANCE);
        reload();
    }

    public SpaceCollaboratorsViewModel(PairsRepository pairsRepository, String str) {
        AnonymousClass003.A0u(pairsRepository, str);
        this.repository = pairsRepository;
        this.slug = str;
        C9286GCn c9286GCnA01 = HnJ.A01(SpaceCollaboratorsUiState.Loading.INSTANCE);
        this.mutableState = c9286GCnA01;
        this.state = C3Pi.A00(c9286GCnA01);
    }

    public final void setRole(String str, SpaceRole spaceRole) {
        AnonymousClass003.A0u(str, spaceRole);
        write(str, new C130351(str, spaceRole));
    }
}
