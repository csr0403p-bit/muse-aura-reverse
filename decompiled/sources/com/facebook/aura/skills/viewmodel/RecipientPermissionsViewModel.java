package com.facebook.aura.skills.viewmodel;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.skills.repo.RecipientPermission;
import com.facebook.aura.skills.repo.RecipientPermissionsRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class RecipientPermissionsViewModel extends AEs {
    public final BLG<RecipientPermissionsUiState> _uiState;
    public final String connectorId;
    public final RecipientPermissionsRepository repository;
    public final SingleFlight singleFlight;
    public final C1BN<RecipientPermissionsUiState> uiState;

    public final class Factory extends AuraViewModelFactory<RecipientPermissionsViewModel> {
        public final String connectorId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public RecipientPermissionsViewModel create() {
            String str = this.connectorId;
            AbstractC3358CGz abstractC3358CGz = this.userSession;
            return new RecipientPermissionsViewModel(str, abstractC3358CGz, new RecipientPermissionsRepository(abstractC3358CGz));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel", f = "RecipientPermissionsViewModel.kt", l = {63}, m = "loadPermissions", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$loadPermissions$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RecipientPermissionsViewModel.this.loadPermissions(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$refresh$2", f = "RecipientPermissionsViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$refresh$2$1", f = "RecipientPermissionsViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$refresh$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ RecipientPermissionsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecipientPermissionsViewModel recipientPermissionsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = recipientPermissionsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    RecipientPermissionsViewModel recipientPermissionsViewModel = this.this$0;
                    this.label = 1;
                    if (recipientPermissionsViewModel.loadPermissions(this) == enumC10460Hji) {
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

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RecipientPermissionsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                RecipientPermissionsViewModel recipientPermissionsViewModel = RecipientPermissionsViewModel.this;
                SingleFlight singleFlight = recipientPermissionsViewModel.singleFlight;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(recipientPermissionsViewModel, null);
                this.label = 1;
                if (singleFlight.invoke("load", anonymousClass1, this) == enumC10460Hji) {
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
            return RecipientPermissionsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$revoke$3", f = "RecipientPermissionsViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$revoke$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ RecipientPermission $permission;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$revoke$3$1", f = "RecipientPermissionsViewModel.kt", l = {91, 109}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel$revoke$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ RecipientPermission $permission;
            public int label;
            public final /* synthetic */ RecipientPermissionsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RecipientPermissionsViewModel recipientPermissionsViewModel, RecipientPermission recipientPermission, HtJ<? super AnonymousClass1> htJ) {
                super(1, htJ);
                this.this$0 = recipientPermissionsViewModel;
                this.$permission = recipientPermission;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass1(this.this$0, this.$permission, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM2125revokePermissiongIAlus;
                RecipientPermissionsUiState value;
                RecipientPermissionsUiState recipientPermissionsUiState;
                ArrayList arrayListA0h;
                RecipientPermissionsUiState value2;
                RecipientPermissionsUiState recipientPermissionsUiState2;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    RecipientPermissionsRepository recipientPermissionsRepository = this.this$0.repository;
                    RecipientPermission recipientPermission = this.$permission;
                    this.label = 1;
                    objM2125revokePermissiongIAlus = recipientPermissionsRepository.m2125revokePermissiongIAlus(recipientPermission, this);
                    if (objM2125revokePermissiongIAlus == enumC10460Hji) {
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
                    objM2125revokePermissiongIAlus = AnonymousClass001.A0q(obj);
                }
                boolean z = objM2125revokePermissiongIAlus instanceof C10571Hud;
                BLG<RecipientPermissionsUiState> blg = this.this$0._uiState;
                RecipientPermission recipientPermission2 = this.$permission;
                if (z) {
                    do {
                        value2 = blg.getValue();
                        recipientPermissionsUiState2 = value2;
                    } while (!blg.A6e(value2, recipientPermissionsUiState2.copy(recipientPermissionsUiState2.groups, recipientPermissionsUiState2.isLoading, recipientPermissionsUiState2.loadFailed, recipientPermission2.permissionId, null)));
                } else {
                    do {
                        value = blg.getValue();
                        recipientPermissionsUiState = value;
                        AHD<RecipientPermissionGroup> ahd = recipientPermissionsUiState.groups;
                        ArrayList arrayListA0h2 = C3cG.A0h();
                        Iterator it = ahd.iterator();
                        while (it.hasNext()) {
                            AbstractC0882AGj.A0r(((RecipientPermissionGroup) it.next()).permissions, arrayListA0h2);
                        }
                        arrayListA0h = C3cG.A0h();
                        for (Object obj2 : arrayListA0h2) {
                            AnonymousClass006.A1O(((RecipientPermission) obj2).permissionId, recipientPermission2.permissionId, obj2, arrayListA0h);
                        }
                    } while (!blg.A6e(value, recipientPermissionsUiState.copy(RecipientPermissionsViewModelKt.toGroups(arrayListA0h), true, false, recipientPermissionsUiState.failedRevokePermissionId, null)));
                    RecipientPermissionsViewModel recipientPermissionsViewModel = this.this$0;
                    this.label = 2;
                    if (recipientPermissionsViewModel.loadPermissions(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RecipientPermission recipientPermission, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$permission = recipientPermission;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return RecipientPermissionsViewModel.this.new AnonymousClass3(this.$permission, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                RecipientPermissionsViewModel recipientPermissionsViewModel = RecipientPermissionsViewModel.this;
                SingleFlight singleFlight = recipientPermissionsViewModel.singleFlight;
                RecipientPermission recipientPermission = this.$permission;
                String str = recipientPermission.permissionId;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(recipientPermissionsViewModel, recipientPermission, null);
                this.label = 1;
                if (singleFlight.invoke(str, anonymousClass1, this) == enumC10460Hji) {
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
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RecipientPermissionsViewModel(String str, AbstractC3358CGz abstractC3358CGz, RecipientPermissionsRepository recipientPermissionsRepository) {
        AnonymousClass005.A10(str, abstractC3358CGz, recipientPermissionsRepository);
        this.connectorId = str;
        this.repository = recipientPermissionsRepository;
        this.singleFlight = C3cH.A0M();
        C9286GCn c9286GCnA14 = C3cG.A14(new RecipientPermissionsUiState(AHI.A01, false, false, null, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        refresh();
    }

    public final void revoke(RecipientPermission recipientPermission) {
        RecipientPermissionsUiState value;
        RecipientPermissionsUiState recipientPermissionsUiState;
        C7384Etj.A0Y(recipientPermission, 0);
        RecipientPermissionsUiState value2 = this._uiState.getValue();
        if (recipientPermission.revocable && !value2.isLoading && value2.revokingPermissionId == null) {
            AHD<RecipientPermissionGroup> ahd = value2.groups;
            if ((ahd instanceof Collection) && ahd.isEmpty()) {
                return;
            }
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                AHD<RecipientPermission> ahd2 = ((RecipientPermissionGroup) it.next()).permissions;
                if (!(ahd2 instanceof Collection) || !ahd2.isEmpty()) {
                    Iterator it2 = ahd2.iterator();
                    while (it2.hasNext()) {
                        if (C7384Etj.areEqual(it2.next(), recipientPermission)) {
                            BLG<RecipientPermissionsUiState> blg = this._uiState;
                            do {
                                value = blg.getValue();
                                recipientPermissionsUiState = value;
                            } while (!blg.A6e(value, recipientPermissionsUiState.copy(recipientPermissionsUiState.groups, recipientPermissionsUiState.isLoading, recipientPermissionsUiState.loadFailed, null, recipientPermission.permissionId)));
                            AnonymousClass001.A1J(new AnonymousClass3(recipientPermission, null), AEu.A00(this));
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
    
        if (r5.element != 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x0074, B:29:0x007b], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:33:0x0094, B:35:0x0097], limit reached: 53 */
    /* JADX WARN: Path cross not found for [B:35:0x0097, B:33:0x0094], limit reached: 53 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00d2 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadPermissions(X.HtJ<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.viewmodel.RecipientPermissionsViewModel.loadPermissions(X.HtJ):java.lang.Object");
    }

    public final C1BN<RecipientPermissionsUiState> getUiState() {
        return this.uiState;
    }

    public final void refresh() {
        RecipientPermissionsUiState value;
        RecipientPermissionsUiState recipientPermissionsUiState;
        if (this._uiState.getValue().isLoading || this._uiState.getValue().revokingPermissionId != null) {
            return;
        }
        BLG<RecipientPermissionsUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            recipientPermissionsUiState = value;
        } while (!blg.A6e(value, recipientPermissionsUiState.copy(recipientPermissionsUiState.groups, true, false, recipientPermissionsUiState.failedRevokePermissionId, recipientPermissionsUiState.revokingPermissionId)));
        AnonymousClass001.A1J(new AnonymousClass2(null), AEu.A00(this));
    }

    public /* synthetic */ RecipientPermissionsViewModel(String str, AbstractC3358CGz abstractC3358CGz, RecipientPermissionsRepository recipientPermissionsRepository, int i, C06H c06h) {
        this(str, abstractC3358CGz, (i & 4) != 0 ? new RecipientPermissionsRepository(abstractC3358CGz) : recipientPermissionsRepository);
    }
}
