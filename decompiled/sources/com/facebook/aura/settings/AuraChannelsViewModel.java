package com.facebook.aura.settings;

import X.AEs;
import X.AEu;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AuraChannelsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<AuraChannelsUiState> _uiState;
    public final SingleFlight refreshFlight;
    public final HatchChannelStatusRepository statusRepository;
    public final C1BN<AuraChannelsUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.AuraChannelsViewModel$1", f = "AuraChannelsViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.AuraChannelsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraChannelsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final AuraChannelsViewModel auraChannelsViewModel = AuraChannelsViewModel.this;
                C20Q<List<ChannelJson>> c20q = auraChannelsViewModel.statusRepository.channels;
                C20Z<? super List<ChannelJson>> c20z = new C20Z() { // from class: com.facebook.aura.settings.AuraChannelsViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((List<ChannelJson>) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(List<ChannelJson> list, HtJ<? super Unit> htJ) {
                        AuraChannelsUiState value;
                        AuraChannelsViewModel auraChannelsViewModel2 = auraChannelsViewModel;
                        BLG<AuraChannelsUiState> blg = auraChannelsViewModel2._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, AuraChannelsViewModelKt.withItems(value, auraChannelsViewModel2.channelUiItems(list))));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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
            return AuraChannelsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<AuraChannelsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new AuraChannelsViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraChannelsViewModel create() {
            return new AuraChannelsViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.AuraChannelsViewModel$fetchChannelStatuses$1", f = "AuraChannelsViewModel.kt", l = {93}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.AuraChannelsViewModel$fetchChannelStatuses$1, reason: invalid class name and case insensitive filesystem */
    public final class C134681 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.AuraChannelsViewModel$fetchChannelStatuses$1$1", f = "AuraChannelsViewModel.kt", l = {SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.AuraChannelsViewModel$fetchChannelStatuses$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03431 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AuraChannelsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03431(AuraChannelsViewModel auraChannelsViewModel, HtJ<? super C03431> htJ) {
                super(1, htJ);
                this.this$0 = auraChannelsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03431(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C03431(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    X.Hji r6 = X.EnumC10460Hji.A02
                    int r0 = r7.label
                    r5 = 1
                    if (r0 == 0) goto L49
                    if (r0 != r5) goto L72
                    X.Hwg.A00(r8)
                Lc:
                    java.util.List r8 = (java.util.List) r8
                    com.facebook.aura.settings.AuraChannelsViewModel r6 = r7.this$0
                    X.BLG<com.facebook.aura.settings.AuraChannelsUiState> r5 = r6._uiState
                L12:
                    java.lang.Object r4 = r5.getValue()
                    r3 = r4
                    com.facebook.aura.settings.AuraChannelsUiState r3 = (com.facebook.aura.settings.AuraChannelsUiState) r3
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r0 = r3.connectedChannels
                    boolean r0 = r0.isEmpty()
                    if (r0 == 0) goto L2a
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r0 = r3.availableChannels
                    boolean r1 = r0.isEmpty()
                    r0 = 0
                    if (r1 != 0) goto L2b
                L2a:
                    r0 = 1
                L2b:
                    if (r8 != 0) goto L2f
                    if (r0 != 0) goto L37
                L2f:
                    java.util.List r0 = com.facebook.aura.settings.AuraChannelsViewModel.access$channelUiItems(r6, r8)
                    com.facebook.aura.settings.AuraChannelsUiState r3 = com.facebook.aura.settings.AuraChannelsViewModelKt.withItems(r3, r0)
                L37:
                    r2 = 0
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r1 = r3.connectedChannels
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r0 = r3.availableChannels
                    com.facebook.aura.settings.AuraChannelsUiState r0 = r3.copy(r1, r0, r2)
                    boolean r0 = r5.A6e(r4, r0)
                    if (r0 == 0) goto L12
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L49:
                    X.Hwg.A00(r8)
                    com.facebook.aura.settings.AuraChannelsViewModel r0 = r7.this$0
                    X.BLG<com.facebook.aura.settings.AuraChannelsUiState> r4 = r0._uiState
                L50:
                    java.lang.Object r3 = r4.getValue()
                    r2 = r3
                    com.facebook.aura.settings.AuraChannelsUiState r2 = (com.facebook.aura.settings.AuraChannelsUiState) r2
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r1 = r2.connectedChannels
                    X.AHD<com.facebook.aura.settings.ChannelUiItem> r0 = r2.availableChannels
                    com.facebook.aura.settings.AuraChannelsUiState r0 = r2.copy(r1, r0, r5)
                    boolean r0 = r4.A6e(r3, r0)
                    if (r0 == 0) goto L50
                    com.facebook.aura.settings.AuraChannelsViewModel r0 = r7.this$0
                    com.facebook.aura.settings.HatchChannelStatusRepository r0 = r0.statusRepository
                    r7.label = r5
                    java.lang.Object r8 = r0.refresh(r7)
                    if (r8 != r6) goto Lc
                    return r6
                L72:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.AuraChannelsViewModel.C134681.C03431.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C134681(HtJ<? super C134681> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraChannelsViewModel.this.new C134681(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraChannelsViewModel auraChannelsViewModel = AuraChannelsViewModel.this;
                SingleFlight singleFlight = auraChannelsViewModel.refreshFlight;
                C03431 c03431 = new C03431(auraChannelsViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c03431, this) == enumC10460Hji) {
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
            return AuraChannelsViewModel.this.new C134681(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraChannelsViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.statusRepository = HatchChannelStatusRepository.Companion.getInstance(abstractC3358CGz);
        this.refreshFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        AHI ahi = AHI.A01;
        C9286GCn c9286GCn = new C9286GCn(new AuraChannelsUiState(ahi, ahi, false));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[PHI: r1
  0x0054: PHI (r1v4 boolean) = (r1v1 boolean), (r1v5 boolean) binds: [B:19:0x0052, B:17:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r1
  0x0063: PHI (r1v3 boolean) = (r1v1 boolean), (r1v4 boolean) binds: [B:19:0x0052, B:21:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.facebook.aura.settings.ChannelUiItem> channelUiItems(java.util.List<com.facebook.aura.settings.ChannelJson> r8) {
        /*
            r7 = this;
            com.facebook.aura.settings.HatchChannelGating r2 = com.facebook.aura.settings.HatchChannelGating.INSTANCE
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate$Companion r1 = com.facebook.aura.confidentialvm.session.ConfidentialSessionGate.Companion
            X.CGz r0 = r7.userSession
            com.facebook.aura.confidentialvm.session.ConfidentialSessionGate r0 = r1.getInstance(r0)
            boolean r0 = r0.getShouldHideUnsupportedCvmFeatures()
            java.util.List r0 = r2.enabledChannels(r0)
            java.util.ArrayList r6 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r7 = r0.iterator()
        L1a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r5 = r7.next()
            com.facebook.aura.settings.MessagingChannel r5 = (com.facebook.aura.settings.MessagingChannel) r5
            r4 = 0
            if (r8 == 0) goto L49
            java.util.Iterator r3 = r8.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.facebook.aura.settings.ChannelJson r0 = (com.facebook.aura.settings.ChannelJson) r0
            java.lang.String r1 = r0.provider
            java.lang.String r0 = r5.getProvider()
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L2d
            r4 = r2
        L47:
            com.facebook.aura.settings.ChannelJson r4 = (com.facebook.aura.settings.ChannelJson) r4
        L49:
            r2 = 1
            if (r4 == 0) goto L51
            boolean r0 = r4.linked
            r1 = 1
            if (r0 == r2) goto L54
        L51:
            r1 = 0
            if (r4 == 0) goto L63
        L54:
            boolean r0 = r4.needsAttention()
            if (r0 != r2) goto L63
        L5a:
            com.facebook.aura.settings.ChannelUiItem r0 = new com.facebook.aura.settings.ChannelUiItem
            r0.<init>(r5, r1, r2)
            r6.add(r0)
            goto L1a
        L63:
            r2 = 0
            goto L5a
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.AuraChannelsViewModel.channelUiItems(java.util.List):java.util.List");
    }

    public final C1BN<AuraChannelsUiState> getUiState() {
        return this.uiState;
    }

    public final void fetchChannelStatuses() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134681(null), AEu.A00(this));
    }
}
