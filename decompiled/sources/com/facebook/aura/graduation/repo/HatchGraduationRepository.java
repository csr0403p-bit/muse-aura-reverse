package com.facebook.aura.graduation.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C9286GCn;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.graduation.repo.GraduationStefiPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchGraduationRepository implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<HatchGraduationState> _state;
    public final C3UX scope;
    public final C1BN<HatchGraduationState> state;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.graduation.repo.HatchGraduationRepository$fetchGraduation$2", f = "HatchGraduationRepository.kt", l = {185}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.repo.HatchGraduationRepository$fetchGraduation$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGraduationRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return HatchGraduationRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                X.Hji r1 = X.EnumC10460Hji.A02
                r2 = r17
                int r0 = r2.label
                r11 = 0
                r3 = 1
                if (r0 == 0) goto L4a
                if (r0 != r3) goto L84
                java.lang.Object r8 = r2.L$0
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r0 = X.AnonymousClass001.A0q(r18)
            L14:
                boolean r7 = r0 instanceof X.C10571Hud
                if (r7 == 0) goto L19
                r0 = 0
            L19:
                com.facebook.aura.graduation.repo.GraduationStartResponseJson r0 = (com.facebook.aura.graduation.repo.GraduationStartResponseJson) r0
                if (r0 == 0) goto L45
                com.facebook.aura.graduation.repo.HatchGraduationRepository r2 = com.facebook.aura.graduation.repo.HatchGraduationRepository.this
                boolean r6 = r0.should_show
                boolean r5 = r0.is_user_graduation_enabled
                com.facebook.aura.graduation.repo.HatchGraduationStory r4 = com.facebook.aura.graduation.repo.HatchGraduationRepositoryJsonKt.toStory(r0)
                com.facebook.aura.common.prefs.AuraVMPrefs r1 = com.facebook.aura.common.prefs.AuraVMPrefs.INSTANCE
                com.facebook.aura.common.prefs.AuraVMPrefStore r0 = com.facebook.aura.common.prefs.AuraVMPrefStore.GRADUATION
                X.4oT r1 = r1.get(r8, r0)
                java.lang.String r0 = "seen"
                boolean r0 = r1.getBoolean(r0, r11)
                X.BLG<com.facebook.aura.graduation.repo.HatchGraduationState> r2 = r2._state
                if (r6 == 0) goto L3c
                r1 = 1
                if (r0 == 0) goto L3d
            L3c:
                r1 = 0
            L3d:
                com.facebook.aura.graduation.repo.HatchGraduationState r0 = new com.facebook.aura.graduation.repo.HatchGraduationState
                r0.<init>(r1, r5, r4, r3)
                X.AnonymousClass002.A1I(r2, r0)
            L45:
                java.lang.Boolean r1 = X.C3cG.A0P(r7)
                return r1
            L4a:
                X.Hwg.A00(r18)
                com.facebook.aura.graduation.repo.HatchGraduationRepository r0 = com.facebook.aura.graduation.repo.HatchGraduationRepository.this
                java.lang.String r8 = com.facebook.aura.graduation.repo.HatchGraduationRepository.access$currentVmId(r0)
                if (r8 != 0) goto L5a
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
                return r1
            L5a:
                com.facebook.aura.network.http.HatchHttpApi r9 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
                com.facebook.aura.graduation.repo.GraduationStefiPath$MuseGraduationStart r12 = new com.facebook.aura.graduation.repo.GraduationStefiPath$MuseGraduationStart
                r12.<init>(r8)
                com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.GET
                X.9jH r16 = X.AGH.A0E()
                com.facebook.aura.graduation.repo.HatchGraduationRepository$fetchGraduation$2$invokeSuspend$$inlined$executeStefiRequest-bMdYcbs$default$1 r10 = com.facebook.aura.graduation.repo.HatchGraduationRepository$fetchGraduation$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
                r2.L$0 = r8
                r14 = 0
                r2.L$1 = r14
                r2.L$2 = r14
                r2.L$3 = r14
                r2.L$4 = r14
                r2.L$5 = r14
                r2.label = r3
                r15 = r14
                r17 = r16
                r18 = r2
                java.lang.Object r0 = r9.m1596executeBodylessStefiRequestWithtZkwj4A(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                if (r0 != r1) goto L14
                return r1
            L84:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.graduation.repo.HatchGraduationRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.graduation.repo.HatchGraduationRepository$markSeen$1", f = "HatchGraduationRepository.kt", l = {188}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.repo.HatchGraduationRepository$markSeen$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $experienceId;
        public final /* synthetic */ String $vmId;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$vmId = str;
            this.$experienceId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$vmId, this.$experienceId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                GraduationStefiPath.MuseGraduationStore museGraduationStore = GraduationStefiPath.MuseGraduationStore.INSTANCE;
                GraduationStoreRequestJson graduationStoreRequestJson = new GraduationStoreRequestJson(this.$vmId, this.$experienceId);
                RequestType requestType = RequestType.POST;
                C9jH c9jHA0E = AGH.A0E();
                HatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                if (hatchHttpApiA06.m1604executeStefiRequestWithjLovISM(hatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchGraduationRepository$markSeen$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, museGraduationStore, graduationStoreRequestJson, requestType, c9jHA0E, true, null, false, null, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.graduation.repo.HatchGraduationRepository$saveVideoToDownloads$2", f = "HatchGraduationRepository.kt", l = {185, 123}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.graduation.repo.HatchGraduationRepository$saveVideoToDownloads$2, reason: invalid class name and case insensitive filesystem */
    public final class C121852 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;

        public C121852(HtJ<? super C121852> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchGraduationRepository.this.new C121852(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return HatchGraduationRepository.this.new C121852(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0095, code lost:
        
            if (r7 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x010d, TryCatch #1 {all -> 0x010d, blocks: (B:8:0x0020, B:11:0x002b, B:14:0x003f, B:15:0x0044), top: B:57:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.graduation.repo.HatchGraduationRepository.C121852.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentVmId() {
        String str = HatchGatewayServiceManager.INSTANCE.getGateway(this.userSession).currentWsUrl;
        if (str != null) {
            return HatcheryVMIdUtilsKt.extractHatcheryVMId(str);
        }
        return null;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        AnonymousClass001.A1E(this._state, null, new HatchGraduationState(false, false, null, false));
    }

    public final C1BN<HatchGraduationState> getState() {
        return this.state;
    }

    public final void markSeen() {
        String str;
        String strCurrentVmId;
        HatchGraduationState value = this._state.getValue();
        HatchGraduationStory hatchGraduationStory = value.story;
        if (hatchGraduationStory == null || (str = hatchGraduationStory.experienceId) == null || (strCurrentVmId = currentVmId()) == null) {
            return;
        }
        BzK bzKA9q = AuraVMPrefs.INSTANCE.get(strCurrentVmId, AuraVMPrefStore.GRADUATION).A9q();
        bzKA9q.A0A(HatchGraduationRepositoryKt.SEEN, true);
        bzKA9q.apply();
        AnonymousClass001.A1E(this._state, null, new HatchGraduationState(false, value.isUserGraduationEnabled, value.story, value.isLoaded));
        AnonymousClass001.A1J(new AnonymousClass1(strCurrentVmId, str, null), this.scope);
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchGraduationRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchGraduationRepository) abstractC3358CGz.A03(HatchGraduationRepository.class, new HatchGraduationRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchGraduationRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78T.A01(AnonymousClass001.A0y(), null);
        C9286GCn c9286GCnA14 = C3cG.A14(new HatchGraduationState(false, false, null, false));
        this._state = c9286GCnA14;
        this.state = C3cG.A11(c9286GCnA14);
    }

    public final Object fetchGraduation(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public final Object saveVideoToDownloads(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C121852(null));
    }

    public /* synthetic */ HatchGraduationRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
