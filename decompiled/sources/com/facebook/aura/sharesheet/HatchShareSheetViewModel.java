package com.facebook.aura.sharesheet;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC05633ui;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.C05663ul;
import X.C06G;
import X.C06H;
import X.C10571Hud;
import X.C10650I0u;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C27k;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3pU;
import X.C3rb;
import X.C7384Etj;
import X.C7BY;
import X.C7Bq;
import X.CFK;
import X.EnumC10460Hji;
import X.F2X;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAX;
import X.GDB;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.components.reactions.AuraSingleTearKt;
import com.facebook.aura.dancingavatars.gating.DancingAvatarsGating;
import com.facebook.aura.explore.repo.IdeaCardShareAttempt;
import com.facebook.aura.explore.repo.IdeaCardShareResult;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.identity.dances.HatchAvatarDance;
import com.facebook.aura.identity.dances.HatchAvatarDancesRepository;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.opengraph.HatchWebPageMetadata;
import com.facebook.aura.settings.MC;
import com.facebook.aura.sharesheet.AvatarSharePage;
import com.facebook.aura.sharesheet.HatchOpenGraphPreviewState;
import com.facebook.aura.utils.MC;
import com.facebook.aura.widgets.MC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchShareSheetViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<Unit> _eligibilityCheckFailures;
    public final C3Em<HatchShareFailure> _sendFailures;
    public final BLG<HatchShareSheetUiState> _uiState;
    public final C1BN<AvatarShareTab> activeAvatarTab;
    public final C1BN<AvatarSharePages> avatarPages;
    public final HatchShareLogContext baseLogContext;
    public final String contentId;
    public final HatchDanceShare dance;
    public final C22I<Unit> eligibilityCheckFailures;
    public HoC eligibilityCheckJob;
    public HoC ideaShareDestinationJob;
    public C27k<? extends IdeaCardShareAttempt> ideaShareRequest;
    public IdeaCardShareResult ideaShareResult;
    public boolean ideaShareRetryable;
    public String ideaShareUrl;
    public final boolean includeRecipients;
    public final C1BN<Boolean> isAvatarDanceSelected;
    public final boolean isLinkShare;
    public final C1BN<HatchShareLogContext> logContext;
    public C27k<? extends HatchMessageShareAttemptResult> messageShareAuthorization;
    public final String messageShareOperationId;
    public boolean messageShareRetryable;
    public final HatchOpenGraphRepository openGraphRepository;
    public final Map<String, PendingRecipientSend> pendingRecipientSends;
    public final G0V<String, HtJ<? super String>, Object> prepareFacebookFeedMedia;
    public final G0V<IdeaCardShareResult, HtJ<? super String>, Object> prepareIdeaImage;
    public final HatchShareSheetRepository repository;
    public final boolean requiresMessageShareReview;
    public final boolean requiresShareCancellation;
    public final BLG<AvatarShareTab> selectedAvatarTab;
    public final C22I<HatchShareFailure> sendFailures;
    public boolean shareCancelled;
    public final C27k<HsJ<Boolean>> shareEligibilityRequest;
    public final ShareType shareType;
    public final AHD<HatchShareDestination> shareTypeDestinations;
    public final String shareUrl;
    public final C1BN<HatchShareSheetUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$1", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Unit>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = HatchShareSheetViewModel.this.new AnonymousClass1(htJ);
            anonymousClass1.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r2 = r18
                boolean r1 = r2.Z$0
                int r0 = r2.label
                if (r0 != 0) goto L4d
                X.Hwg.A00(r19)
                if (r1 != 0) goto L14
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.this
                com.facebook.aura.model.HatchDanceShare r0 = r0.dance
                r5 = 0
                if (r0 == 0) goto L15
            L14:
                r5 = 1
            L15:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r4 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.this
                X.BLG<com.facebook.aura.sharesheet.HatchShareSheetUiState> r3 = r4._uiState
            L19:
                java.lang.Object r2 = r3.getValue()
                r6 = r2
                com.facebook.aura.sharesheet.HatchShareSheetUiState r6 = (com.facebook.aura.sharesheet.HatchShareSheetUiState) r6
                com.facebook.aura.sharesheet.HatchShareSheetData r0 = r6.data
                X.AHD r1 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$destinationsFor(r4, r5)
                r7 = 0
                X.AHD<com.facebook.aura.sharesheet.HatchShareRecipient> r0 = r0.recipients
                X.AnonymousClass003.A0u(r0, r1)
                com.facebook.aura.sharesheet.HatchShareSheetData r9 = new com.facebook.aura.sharesheet.HatchShareSheetData
                r9.<init>(r0, r1)
                r18 = 1019(0x3fb, float:1.428E-42)
                r11 = 0
                r8 = r7
                r10 = r7
                r12 = r11
                r13 = r7
                r14 = r7
                r15 = r11
                r16 = r7
                r17 = r5
                r19 = r7
                com.facebook.aura.sharesheet.HatchShareSheetUiState r0 = com.facebook.aura.sharesheet.HatchShareSheetUiState.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                boolean r0 = r3.A6e(r2, r0)
                if (r0 == 0) goto L19
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L4d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Unit> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchShareSheetViewModel> {
        public static final int $stable = 8;
        public final HatchShareLogContext baseLogContext;
        public final String contentId;
        public final HatchDanceShare dance;
        public final boolean includeRecipients;
        public final G0V<String, HtJ<? super String>, Object> prepareFacebookFeedMedia;
        public final G0V<IdeaCardShareResult, HtJ<? super String>, Object> prepareIdeaImage;
        public final ShareType shareType;
        public final String shareUrl;
        public final AbstractC3358CGz userSession;

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, ShareType shareType, boolean z, String str, G0V g0v, G0V g0v2, String str2, HatchShareLogContext hatchShareLogContext, HatchDanceShare hatchDanceShare, int i, C06H c06h) {
            this(abstractC3358CGz, shareType, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : g0v, (i & 32) != 0 ? null : g0v2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? new HatchShareLogContext(shareType, null, null, false) : hatchShareLogContext, (i & 256) != 0 ? null : hatchDanceShare);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchShareSheetViewModel create() {
            return new HatchShareSheetViewModel(this.userSession, this.shareType, this.includeRecipients, null, 0 == true ? 1 : 0, this.shareUrl, this.prepareIdeaImage, this.prepareFacebookFeedMedia, this.contentId, this.baseLogContext, this.dance, 24, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(AbstractC3358CGz abstractC3358CGz, ShareType shareType, boolean z, String str, G0V<? super IdeaCardShareResult, ? super HtJ<? super String>, ? extends Object> g0v, G0V<? super String, ? super HtJ<? super String>, ? extends Object> g0v2, String str2, HatchShareLogContext hatchShareLogContext, HatchDanceShare hatchDanceShare) {
            AnonymousClass003.A0u(abstractC3358CGz, shareType);
            C7384Etj.A0Y(hatchShareLogContext, 7);
            this.userSession = abstractC3358CGz;
            this.shareType = shareType;
            this.includeRecipients = z;
            this.shareUrl = str;
            this.prepareIdeaImage = g0v;
            this.prepareFacebookFeedMedia = g0v2;
            this.contentId = str2;
            this.baseLogContext = hatchShareLogContext;
            this.dance = hatchDanceShare;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1", f = "HatchShareSheetViewModel.kt", l = {344}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1, reason: invalid class name and case insensitive filesystem */
    public final class C136821 extends AbstractC07127nr implements G0V<C20Z<? super AHD<? extends HatchAvatarDance>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAvatarDancesRepository $dancesRepository;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1", f = "HatchShareSheetViewModel.kt", l = {347, 350, 351, 353, 353}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Z<AHD<HatchAvatarDance>> $$this$flow;
            public final /* synthetic */ HatchAvatarDancesRepository $dancesRepository;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public boolean Z$0;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C03611(C20Z<? super AHD<HatchAvatarDance>> c20z, HatchAvatarDancesRepository hatchAvatarDancesRepository, HtJ<? super C03611> htJ) {
                super(2, htJ);
                this.$$this$flow = c20z;
                this.$dancesRepository = hatchAvatarDancesRepository;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03611 c03611 = new C03611(this.$$this$flow, this.$dancesRepository, htJ);
                c03611.L$0 = obj;
                return c03611;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0068 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x00ab A[RETURN] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r11 = r12.L$0
                    X.3UX r11 = (X.C3UX) r11
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r12.label
                    r6 = 5
                    r5 = 4
                    r8 = 3
                    r9 = 2
                    r10 = 1
                    r4 = 0
                    if (r0 == 0) goto L1f
                    if (r0 == r10) goto L41
                    if (r0 == r9) goto L94
                    if (r0 == r8) goto Lac
                    if (r0 == r5) goto Lb4
                    if (r0 == r6) goto Lb4
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L1f:
                    X.Hwg.A00(r13)
                    com.facebook.aura.identity.dances.HatchAvatarDancesRepository r1 = r12.$dancesRepository
                    com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1$load$1 r0 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1$load$1
                    r0.<init>(r1, r4)
                    X.Hrx r7 = X.AnonymousClass001.A10(r0, r11)
                    com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1$loaded$1 r2 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarDances$1$1$loaded$1
                    r2.<init>(r7, r4)
                    r12.L$0 = r11
                    r12.L$1 = r7
                    r12.label = r10
                    r0 = 5000(0x1388, double:2.4703E-320)
                    java.lang.Object r13 = X.GAX.A01(r12, r2, r0)
                    if (r13 != r3) goto L48
                    return r3
                L41:
                    java.lang.Object r7 = r12.L$1
                    X.27k r7 = (X.C27k) r7
                    X.Hwg.A00(r13)
                L48:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13
                    if (r13 == 0) goto L7a
                    boolean r2 = r13.booleanValue()
                L50:
                    X.20Z<X.AHD<com.facebook.aura.identity.dances.HatchAvatarDance>> r1 = r12.$$this$flow
                    if (r2 == 0) goto L69
                    com.facebook.aura.identity.dances.HatchAvatarDancesRepository r0 = r12.$dancesRepository
                    X.1BN<X.AHD<com.facebook.aura.identity.dances.HatchAvatarDance>> r0 = r0.dances
                    r12.L$0 = r4
                    r12.L$1 = r4
                    r12.L$2 = r4
                    r12.Z$0 = r2
                    r12.label = r5
                    java.lang.Object r0 = X.C3pU.A01(r12, r0, r1)
                L66:
                    if (r0 != r3) goto Lb7
                    return r3
                L69:
                    X.AHI r0 = X.AHI.A01
                    r12.L$0 = r4
                    r12.L$1 = r4
                    r12.L$2 = r4
                    r12.Z$0 = r2
                    r12.label = r6
                    java.lang.Object r0 = r1.emit(r0, r12)
                    goto L66
                L7a:
                    X.20Z<X.AHD<com.facebook.aura.identity.dances.HatchAvatarDance>> r2 = r12.$$this$flow
                    java.lang.String r1 = "HatchShareSheetViewModel"
                    java.lang.String r0 = "Avatar dances still loading after the display timeout"
                    X.CFK.A06(r1, r0)
                    X.AHI r0 = X.AHI.A01
                    r12.L$0 = r4
                    r12.L$1 = r7
                    r12.L$2 = r4
                    r12.label = r9
                    java.lang.Object r0 = r2.emit(r0, r12)
                    if (r0 != r3) goto L9b
                    return r3
                L94:
                    java.lang.Object r7 = r12.L$1
                    X.27k r7 = (X.C27k) r7
                    X.Hwg.A00(r13)
                L9b:
                    r12.L$0 = r4
                    r12.L$1 = r4
                    r12.L$2 = r4
                    r12.label = r8
                    X.GBM r7 = (X.GBM) r7
                    java.lang.Object r13 = r7.A0E(r12)
                    if (r13 != r3) goto Laf
                    return r3
                Lac:
                    X.Hwg.A00(r13)
                Laf:
                    boolean r2 = X.AnonymousClass001.A1X(r13)
                    goto L50
                Lb4:
                    X.Hwg.A00(r13)
                Lb7:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136821.C03611.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136821(HatchAvatarDancesRepository hatchAvatarDancesRepository, HtJ<? super C136821> htJ) {
            super(2, htJ);
            this.$dancesRepository = hatchAvatarDancesRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C136821 c136821 = new C136821(this.$dancesRepository, htJ);
            c136821.L$0 = obj;
            return c136821;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C20Z<? super AHD<? extends HatchAvatarDance>> c20z, HtJ<? super Unit> htJ) {
            return invoke2((C20Z<? super AHD<HatchAvatarDance>>) c20z, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C03611 c03611 = new C03611(c20z, this.$dancesRepository, null);
                this.L$0 = null;
                this.label = 1;
                if (Hxb.A00(c03611, this) == enumC10460Hji) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C20Z<? super AHD<HatchAvatarDance>> c20z, HtJ<? super Unit> htJ) {
            return ((C136821) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$2", f = "HatchShareSheetViewModel.kt", l = {326}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0W<C20Z<? super AHD<? extends HatchAvatarDance>>, String, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAvatarDancesRepository $dancesRepository;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAvatarDancesRepository hatchAvatarDancesRepository, HtJ<? super AnonymousClass2> htJ) {
            super(3, htJ);
            this.$dancesRepository = hatchAvatarDancesRepository;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(C20Z<? super AHD<? extends HatchAvatarDance>> c20z, String str, HtJ<? super Unit> htJ) {
            return invoke2((C20Z<? super AHD<HatchAvatarDance>>) c20z, str, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q c20qAvatarDances = HatchShareSheetViewModel.this.avatarDances(this.$dancesRepository);
                this.L$0 = null;
                this.label = 1;
                if (C3pU.A01(this, c20qAvatarDances, c20z) == enumC10460Hji) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C20Z<? super AHD<HatchAvatarDance>> c20z, String str, HtJ<? super Unit> htJ) {
            AnonymousClass2 anonymousClass2 = HatchShareSheetViewModel.this.new AnonymousClass2(this.$dancesRepository, htJ);
            anonymousClass2.L$0 = c20z;
            return anonymousClass2.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$3", f = "HatchShareSheetViewModel.kt", l = {329}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0W<C20Z<? super AHD<? extends HatchAvatarDance>>, Throwable, HtJ<? super Unit>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(C20Z<? super AHD<? extends HatchAvatarDance>> c20z, Throwable th, HtJ<? super Unit> htJ) {
            return invoke2((C20Z<? super AHD<HatchAvatarDance>>) c20z, th, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            Throwable th = (Throwable) this.L$1;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CFK.A0A(HatchShareSheetViewModelKt.SHARE_TAG, "Failed to load avatar dances", th);
                AHI ahi = AHI.A01;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20z.emit(ahi, this) == enumC10460Hji) {
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

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C20Z<? super AHD<HatchAvatarDance>> c20z, Throwable th, HtJ<? super Unit> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(htJ);
            anonymousClass3.L$0 = c20z;
            anonymousClass3.L$1 = th;
            return anonymousClass3.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$4, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass4 extends F2X implements G0W {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, HxE.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);
        }

        public final Object invoke(AiIdentity aiIdentity, boolean z, HtJ<? super HxE<AiIdentity, Boolean>> htJ) {
            return AnonymousClass002.A0q(aiIdentity, z);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return new HxE(obj, obj2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$5", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$avatarPagesFlow$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC07127nr implements G0W<AHD<? extends HatchAvatarDance>, HxE<? extends AiIdentity, ? extends Boolean>, HtJ<? super AvatarSharePages>, Object> {
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public int label;

        public AnonymousClass5(HtJ<? super AnonymousClass5> htJ) {
            super(3, htJ);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(AHD<? extends HatchAvatarDance> ahd, HxE<? extends AiIdentity, ? extends Boolean> hxE, HtJ<? super AvatarSharePages> htJ) {
            return invoke2((AHD<HatchAvatarDance>) ahd, (HxE<AiIdentity, Boolean>) hxE, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object c10571Hud;
            List list = (List) this.L$0;
            HxE hxE = (HxE) this.L$1;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                c10571Hud = HatchAvatarSharePagesKt.avatarSharePages((AiIdentity) hxE.first, list, AnonymousClass001.A1X(hxE.second), HatchShareSheetViewModel.this.userSession);
            } catch (Throwable th) {
                c10571Hud = new C10571Hud(th);
            }
            Throwable thA00 = HsJ.A00(c10571Hud);
            if (thA00 != null) {
                CFK.A0A(HatchShareSheetViewModelKt.SHARE_TAG, "Failed to build avatar share pages", thA00);
            }
            return c10571Hud instanceof C10571Hud ? AvatarSharePages.Empty : c10571Hud;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(AHD<HatchAvatarDance> ahd, HxE<AiIdentity, Boolean> hxE, HtJ<? super AvatarSharePages> htJ) {
            AnonymousClass5 anonymousClass5 = HatchShareSheetViewModel.this.new AnonymousClass5(htJ);
            anonymousClass5.L$0 = ahd;
            anonymousClass5.L$1 = hxE;
            return anonymousClass5.invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1767, 1790, 1807}, m = "awaitShareEligibility", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$awaitShareEligibility$1, reason: invalid class name and case insensitive filesystem */
    public final class C136831 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C136831(HtJ<? super C136831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.awaitShareEligibility(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$copyIdeaShareLink$2", f = "HatchShareSheetViewModel.kt", l = {457}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$copyIdeaShareLink$2, reason: invalid class name and case insensitive filesystem */
    public final class C136842 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<String, Unit> $onCopy;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136842(G0U<? super String, Unit> g0u, HtJ<? super C136842> htJ) {
            super(2, htJ);
            this.$onCopy = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136842(this.$onCopy, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchShareSheetViewModel hatchShareSheetViewModel = HatchShareSheetViewModel.this;
                    this.label = 1;
                    obj = hatchShareSheetViewModel.awaitShareEligibility(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (AnonymousClass001.A1X(obj) && (str = HatchShareSheetViewModel.this.ideaShareUrl) != null) {
                    this.$onCopy.invoke(str);
                }
                while (!C06G.A0w(HatchShareSheetViewModel.this._uiState)) {
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                while (!C06G.A0w(HatchShareSheetViewModel.this._uiState)) {
                }
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136842) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {571, 576}, m = "downloadMedia", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$downloadMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C136851 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C136851(HtJ<? super C136851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.downloadMedia(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$fetchRecipients$1", f = "HatchShareSheetViewModel.kt", l = {467}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$fetchRecipients$1, reason: invalid class name and case insensitive filesystem */
    public final class C136861 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C136861(HtJ<? super C136861> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136861(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM2006fetchRecipientsgIAlus;
            HatchShareSheetUiState value;
            HatchShareSheetUiState value2;
            HatchShareSheetUiState hatchShareSheetUiState;
            HatchShareSheetLoadingState hatchShareSheetLoadingState;
            AHD<HatchShareDestination> ahd;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareSheetViewModel hatchShareSheetViewModel = HatchShareSheetViewModel.this;
                HatchShareSheetRepository hatchShareSheetRepository = hatchShareSheetViewModel.repository;
                boolean zA1Z = AnonymousClass002.A1Z(hatchShareSheetViewModel.shareType, ShareType.INVITE);
                this.label = 1;
                objM2006fetchRecipientsgIAlus = hatchShareSheetRepository.m2006fetchRecipientsgIAlus(zA1Z, this);
                if (objM2006fetchRecipientsgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM2006fetchRecipientsgIAlus = AnonymousClass002.A0j(obj);
            }
            HatchShareSheetViewModel hatchShareSheetViewModel2 = HatchShareSheetViewModel.this;
            if (HsJ.A00(objM2006fetchRecipientsgIAlus) == null) {
                AHD ahd2 = (AHD) objM2006fetchRecipientsgIAlus;
                BLG<HatchShareSheetUiState> blg = hatchShareSheetViewModel2._uiState;
                do {
                    value2 = blg.getValue();
                    hatchShareSheetUiState = value2;
                    hatchShareSheetLoadingState = HatchShareSheetLoadingState.LOADED;
                    ahd = hatchShareSheetUiState.data.destinations;
                    AnonymousClass003.A0u(ahd2, ahd);
                } while (!blg.A6e(value2, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, hatchShareSheetLoadingState, null, new HatchShareSheetData(ahd2, ahd), null, false, false, null, null, false, null, false, 2042, null)));
            } else {
                BLG<HatchShareSheetUiState> blg2 = hatchShareSheetViewModel2._uiState;
                do {
                    value = blg2.getValue();
                } while (!blg2.A6e(value, HatchShareSheetUiState.copy$default(value, HatchShareSheetLoadingState.LOADED, null, null, null, false, false, null, null, false, null, false, 2046, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchShareSheetViewModel.this.new C136861(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1660}, m = "launchArtifactInstagramStory", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$launchArtifactInstagramStory$1, reason: invalid class name and case insensitive filesystem */
    public final class C136871 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C136871(HtJ<? super C136871> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.launchArtifactInstagramStory(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$loadOpenGraphPreview$2", f = "HatchShareSheetViewModel.kt", l = {439}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$loadOpenGraphPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C136882 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136882(String str, HtJ<? super C136882> htJ) {
            super(2, htJ);
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136882(this.$url, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchShareSheetUiState value;
            Object objMetadata = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objMetadata);
                HatchOpenGraphRepository hatchOpenGraphRepository = HatchShareSheetViewModel.this.openGraphRepository;
                String str = this.$url;
                this.label = 1;
                objMetadata = hatchOpenGraphRepository.metadata(str, this);
                if (objMetadata == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objMetadata);
            }
            AHD<String> ahd = ((HatchWebPageMetadata) objMetadata).imageCandidates;
            BLG<HatchShareSheetUiState> blg = HatchShareSheetViewModel.this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, null, false, false, null, ahd.isEmpty() ? HatchOpenGraphPreviewState.Unavailable.INSTANCE : new HatchOpenGraphPreviewState.Available(ahd), false, null, false, 1919, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136882) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {919, 925, 928}, m = "performNetworkRecipientSend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$performNetworkRecipientSend$1, reason: invalid class name and case insensitive filesystem */
    public final class C136891 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C136891(HtJ<? super C136891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.performNetworkRecipientSend(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {959, 964}, m = "performRecipientAppShare", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$performRecipientAppShare$1, reason: invalid class name and case insensitive filesystem */
    public final class C136901 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C136901(HtJ<? super C136901> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.performRecipientAppShare(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1638, 1640}, m = "prepareArtifactStoryMedia", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareArtifactStoryMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C136911 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C136911(HtJ<? super C136911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.prepareArtifactStoryMedia(null, null, null, null, null, 0, 0, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {392, 397}, m = "prepareIdeaShare", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareIdeaShare$1, reason: invalid class name and case insensitive filesystem */
    public final class C136921 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C136921(HtJ<? super C136921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.prepareIdeaShare(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1833}, m = "prepareShareContent", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareShareContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C136931 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C136931(HtJ<? super C136931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.prepareShareContent(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$requestIdeaShare$1", f = "HatchShareSheetViewModel.kt", l = {MC.mwa_help_and_support.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$requestIdeaShare$1, reason: invalid class name and case insensitive filesystem */
    public final class C136941 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super IdeaCardShareAttempt>, Object> {
        public int label;

        public C136941(HtJ<? super C136941> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136941(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object failed;
            HatchShareSheetUiState value;
            HatchShareSheetUiState value2;
            HatchShareEligibilityState hatchShareEligibilityState;
            HatchShareSheetUiState value3;
            Object obj2;
            HatchShareSheetUiState value4;
            Object objA01 = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    try {
                        if (i == 0) {
                            Hwg.A00(objA01);
                            HatchShareSheetViewModel hatchShareSheetViewModel = HatchShareSheetViewModel.this;
                            hatchShareSheetViewModel.ideaShareRetryable = false;
                            BLG<HatchShareSheetUiState> blg = hatchShareSheetViewModel._uiState;
                            do {
                                value4 = blg.getValue();
                            } while (!blg.A6e(value4, HatchShareSheetUiState.copy$default(value4, null, null, null, null, false, false, null, null, true, null, false, 1791, null)));
                            HatchShareSheetViewModel$requestIdeaShare$1$result$1 hatchShareSheetViewModel$requestIdeaShare$1$result$1 = new HatchShareSheetViewModel$requestIdeaShare$1$result$1(HatchShareSheetViewModel.this, null);
                            this.label = 1;
                            objA01 = GAX.A01(this, hatchShareSheetViewModel$requestIdeaShare$1$result$1, 60000L);
                            if (objA01 == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(objA01);
                        }
                        failed = (IdeaCardShareAttempt) objA01;
                        if (failed == null) {
                            failed = new IdeaCardShareAttempt.Failed(true);
                        }
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    CFK.A0K("HatchIdeaShare", e2, "Failed to prepare idea share");
                    failed = new IdeaCardShareAttempt.Failed(true);
                }
                BLG<HatchShareSheetUiState> blg2 = HatchShareSheetViewModel.this._uiState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, HatchShareSheetUiState.copy$default(value2, null, null, null, null, false, false, null, null, false, null, false, 1791, null)));
                if (failed instanceof IdeaCardShareAttempt.Shared) {
                    hatchShareEligibilityState = HatchShareEligibilityState.ELIGIBLE;
                } else if (failed.equals(IdeaCardShareAttempt.Unavailable.INSTANCE)) {
                    hatchShareEligibilityState = HatchShareEligibilityState.INELIGIBLE;
                } else {
                    if (!(failed instanceof IdeaCardShareAttempt.Failed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HatchShareSheetViewModel hatchShareSheetViewModel2 = HatchShareSheetViewModel.this;
                    boolean z = ((IdeaCardShareAttempt.Failed) failed).retryable;
                    hatchShareSheetViewModel2.ideaShareRetryable = z;
                    hatchShareEligibilityState = z ? HatchShareEligibilityState.PENDING : HatchShareEligibilityState.UNAVAILABLE;
                }
                BLG<HatchShareSheetUiState> blg3 = HatchShareSheetViewModel.this._uiState;
                do {
                    value3 = blg3.getValue();
                    obj2 = failed;
                } while (!blg3.A6e(value3, HatchShareSheetUiState.copy$default(value3, null, hatchShareEligibilityState, null, null, false, false, null, null, false, null, false, 2045, null)));
                return obj2;
            } catch (Throwable th) {
                BLG<HatchShareSheetUiState> blg4 = HatchShareSheetViewModel.this._uiState;
                do {
                    value = blg4.getValue();
                } while (!blg4.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, null, false, false, null, null, false, null, false, 1791, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super IdeaCardShareAttempt> htJ) {
            return HatchShareSheetViewModel.this.new C136941(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$requestMessageShareAuthorization$1", f = "HatchShareSheetViewModel.kt", l = {408}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$requestMessageShareAuthorization$1, reason: invalid class name and case insensitive filesystem */
    public final class C136951 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchMessageShareAttemptResult>, Object> {
        public Object L$0;
        public int label;

        public C136951(HtJ<? super C136951> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136951(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L1a
                if (r0 != r4) goto L3b
                X.Hwg.A00(r7)
            Lc:
                if (r7 != 0) goto L10
            Le:
                com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r7 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.UNAVAILABLE
            L10:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r1 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.this
                com.facebook.aura.sharesheet.HatchMessageShareAttemptResult r0 = com.facebook.aura.sharesheet.HatchMessageShareAttemptResult.UNAVAILABLE
                if (r7 == r0) goto L17
                r4 = 0
            L17:
                r1.messageShareRetryable = r4
                return r7
            L1a:
                X.Hwg.A00(r7)
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.this
                java.lang.String r3 = r0.contentId
                if (r3 == 0) goto Le
                boolean r0 = X.C7BY.A0j(r3)
                if (r0 != 0) goto Le
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.this
                com.facebook.aura.sharesheet.HatchShareSheetRepository r2 = r0.repository
                java.lang.String r1 = r0.messageShareOperationId
                r0 = 0
                r6.L$0 = r0
                r6.label = r4
                java.lang.Object r7 = r2.attemptMessageShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r3, r1, r6)
                if (r7 != r5) goto Lc
                return r5
            L3b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136951.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchMessageShareAttemptResult> htJ) {
            return HatchShareSheetViewModel.this.new C136951(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$save$1", f = "HatchShareSheetViewModel.kt", l = {MC.hatch_android_subscription.__CONFIG__, 524, MC.wearables_hatch_health_connectors.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$save$1, reason: invalid class name and case insensitive filesystem */
    public final class C136961 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $defaultFileName;
        public final /* synthetic */ HatchShareDownloadTarget $target;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136961(HatchShareDownloadTarget hatchShareDownloadTarget, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, HtJ<? super C136961> htJ) {
            super(1, htJ);
            this.$target = hatchShareDownloadTarget;
            this.this$0 = hatchShareSheetViewModel;
            this.$context = context;
            this.$defaultFileName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C136961(this.$target, this.this$0, this.$context, this.$defaultFileName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objDownloadSpaceExportHtml;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareDownloadTarget hatchShareDownloadTarget = this.$target;
                if (hatchShareDownloadTarget instanceof HatchShareDownloadTarget.Media) {
                    HatchShareSheetViewModel hatchShareSheetViewModel = this.this$0;
                    Context context = this.$context;
                    String str = ((HatchShareDownloadTarget.Media) hatchShareDownloadTarget).uri;
                    String str2 = this.$defaultFileName;
                    this.label = 1;
                    objDownloadSpaceExportHtml = hatchShareSheetViewModel.downloadMedia(context, str, str2, this);
                } else if (hatchShareDownloadTarget instanceof HatchShareDownloadTarget.Artifact) {
                    HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
                    Context context2 = this.$context;
                    HatchShareDownloadTarget.Artifact artifact = (HatchShareDownloadTarget.Artifact) hatchShareDownloadTarget;
                    String str3 = artifact.sourcePath;
                    String str4 = artifact.fileName;
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.label = 2;
                    objDownloadSpaceExportHtml = hatchFileUIUtils.downloadHtmlFile(context2, str3, str4, abstractC3358CGz, this);
                } else {
                    if (!(hatchShareDownloadTarget instanceof HatchShareDownloadTarget.Space)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HatchFileUIUtils hatchFileUIUtils2 = HatchFileUIUtils.INSTANCE;
                    Context context3 = this.$context;
                    HatchShareDownloadTarget.Space space = (HatchShareDownloadTarget.Space) hatchShareDownloadTarget;
                    String str5 = space.slug;
                    String str6 = space.title;
                    AbstractC3358CGz abstractC3358CGz2 = this.this$0.userSession;
                    this.label = 3;
                    objDownloadSpaceExportHtml = hatchFileUIUtils2.downloadSpaceExportHtml(context3, str5, str6, abstractC3358CGz2, this);
                }
                if (objDownloadSpaceExportHtml == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2 && i != 3) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C136961) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$scheduleRecipientSend$1", f = "HatchShareSheetViewModel.kt", l = {847}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$scheduleRecipientSend$1, reason: invalid class name and case insensitive filesystem */
    public final class C136971 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ PendingRecipientSend $pendingSend;
        public final /* synthetic */ String $recipientKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136971(String str, PendingRecipientSend pendingRecipientSend, HtJ<? super C136971> htJ) {
            super(2, htJ);
            this.$recipientKey = str;
            this.$pendingSend = pendingRecipientSend;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136971(this.$recipientKey, this.$pendingSend, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(3000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PendingRecipientSend pendingRecipientSendRemove = HatchShareSheetViewModel.this.pendingRecipientSends.remove(this.$recipientKey);
            PendingRecipientSend pendingRecipientSend = this.$pendingSend;
            if (pendingRecipientSendRemove == pendingRecipientSend) {
                HatchShareSheetViewModel.this.startNetworkRecipientSend(pendingRecipientSend);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136971) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1283}, m = "shareAvatarVideoToFacebookStories", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareAvatarVideoToFacebookStories$1, reason: invalid class name and case insensitive filesystem */
    public final class C136981 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C136981(HtJ<? super C136981> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.shareAvatarVideoToFacebookStories(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareContent$2", f = "HatchShareSheetViewModel.kt", l = {1729, 1732, 1734, 1735, 1752}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C136992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0V<HatchShareContent, HtJ<? super Unit>, Object> $action;
        public final /* synthetic */ String $composerText;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ G0V<String, HtJ<? super String>, Object> $resolveMediaUri;
        public final /* synthetic */ boolean $stripsAudio;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C136992(G0V<? super String, ? super HtJ<? super String>, ? extends Object> g0v, String str, Context context, String str2, HatchShareDestination hatchShareDestination, G0V<? super HatchShareContent, ? super HtJ<? super Unit>, ? extends Object> g0v2, boolean z, HtJ<? super C136992> htJ) {
            super(2, htJ);
            this.$resolveMediaUri = g0v;
            this.$mediaUri = str;
            this.$context = context;
            this.$composerText = str2;
            this.$destination = hatchShareDestination;
            this.$action = g0v2;
            this.$stripsAudio = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C136992(this.$resolveMediaUri, this.$mediaUri, this.$context, this.$composerText, this.$destination, this.$action, this.$stripsAudio, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x0112, TryCatch #0 {all -> 0x0112, blocks: (B:64:0x00f1, B:65:0x00f4, B:67:0x00fc, B:38:0x007e, B:39:0x0081, B:43:0x0089, B:45:0x008f, B:46:0x0094, B:51:0x00a6, B:53:0x00ac, B:55:0x00b5, B:57:0x00b9, B:60:0x00c0, B:61:0x00e1, B:30:0x0061, B:31:0x0064, B:33:0x0068, B:35:0x0070, B:23:0x0046, B:24:0x0049, B:26:0x004d, B:27:0x004f, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0037, B:20:0x003b, B:11:0x0020), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0089 A[Catch: all -> 0x0112, TRY_ENTER, TryCatch #0 {all -> 0x0112, blocks: (B:64:0x00f1, B:65:0x00f4, B:67:0x00fc, B:38:0x007e, B:39:0x0081, B:43:0x0089, B:45:0x008f, B:46:0x0094, B:51:0x00a6, B:53:0x00ac, B:55:0x00b5, B:57:0x00b9, B:60:0x00c0, B:61:0x00e1, B:30:0x0061, B:31:0x0064, B:33:0x0068, B:35:0x0070, B:23:0x0046, B:24:0x0049, B:26:0x004d, B:27:0x004f, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0037, B:20:0x003b, B:11:0x0020), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[Catch: all -> 0x0112, TRY_ENTER, TryCatch #0 {all -> 0x0112, blocks: (B:64:0x00f1, B:65:0x00f4, B:67:0x00fc, B:38:0x007e, B:39:0x0081, B:43:0x0089, B:45:0x008f, B:46:0x0094, B:51:0x00a6, B:53:0x00ac, B:55:0x00b5, B:57:0x00b9, B:60:0x00c0, B:61:0x00e1, B:30:0x0061, B:31:0x0064, B:33:0x0068, B:35:0x0070, B:23:0x0046, B:24:0x0049, B:26:0x004d, B:27:0x004f, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0037, B:20:0x003b, B:11:0x0020), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00fc A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0112, blocks: (B:64:0x00f1, B:65:0x00f4, B:67:0x00fc, B:38:0x007e, B:39:0x0081, B:43:0x0089, B:45:0x008f, B:46:0x0094, B:51:0x00a6, B:53:0x00ac, B:55:0x00b5, B:57:0x00b9, B:60:0x00c0, B:61:0x00e1, B:30:0x0061, B:31:0x0064, B:33:0x0068, B:35:0x0070, B:23:0x0046, B:24:0x0049, B:26:0x004d, B:27:0x004f, B:14:0x002b, B:15:0x002e, B:17:0x0034, B:18:0x0037, B:20:0x003b, B:11:0x0020), top: B:80:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:82:? A[LOOP:0: B:69:0x0109->B:82:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:? A[LOOP:1: B:48:0x009f->B:84:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136992.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C136992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareInviteCardToFacebookStories$2", f = "HatchShareSheetViewModel.kt", l = {1339, 1344}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareInviteCardToFacebookStories$2, reason: invalid class name and case insensitive filesystem */
    public final class C137002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $facebookPackage;
        public final /* synthetic */ String $storyCardUri;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137002(Context context, String str, String str2, HtJ<? super C137002> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$storyCardUri = str;
            this.$facebookPackage = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C137002(this.$context, this.$storyCardUri, this.$facebookPackage, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[Catch: all -> 0x00d8, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:18:0x0047, B:19:0x004a, B:22:0x0050, B:27:0x0060, B:30:0x007a, B:32:0x00a5, B:11:0x001f, B:12:0x0022, B:14:0x0028, B:15:0x0032, B:8:0x0014), top: B:45:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x00d8, TRY_ENTER, TryCatch #0 {all -> 0x00d8, blocks: (B:18:0x0047, B:19:0x004a, B:22:0x0050, B:27:0x0060, B:30:0x007a, B:32:0x00a5, B:11:0x001f, B:12:0x0022, B:14:0x0028, B:15:0x0032, B:8:0x0014), top: B:45:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[LOOP:0: B:24:0x0059->B:47:?, LOOP_END, SYNTHETIC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137002.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToFacebookFeed$1", f = "HatchShareSheetViewModel.kt", l = {676}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToFacebookFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C137011 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $caption;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $facebookPackage;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137011(Context context, String str, HatchShareSheetViewModel hatchShareSheetViewModel, String str2, HtJ<? super C137011> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$facebookPackage = str;
            this.this$0 = hatchShareSheetViewModel;
            this.$caption = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137011 c137011 = new C137011(this.$context, this.$facebookPackage, this.this$0, this.$caption, htJ);
            c137011.L$0 = obj;
            return c137011;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r7 = r14.L$0
                com.facebook.aura.sharesheet.HatchShareContent r7 = (com.facebook.aura.sharesheet.HatchShareContent) r7
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r5 = 1
                if (r0 == 0) goto L13
                if (r0 != r5) goto L53
                X.Hwg.A00(r15)
            L10:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L13:
                X.Hwg.A00(r15)
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r7.media
                if (r0 == 0) goto L40
                com.facebook.aura.file.actions.HatchShare r8 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                android.content.Context r9 = r14.$context
                android.net.Uri r10 = r0.uri
                java.lang.String r11 = r0.mimeType
                java.lang.String r12 = r7.text
                java.lang.String r13 = r14.$facebookPackage
                boolean r3 = r8.shareMediaToFacebookFeed(r9, r10, r11, r12, r13)
            L2a:
                if (r3 != 0) goto L10
            L2c:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r2 = r14.this$0
                android.content.Context r1 = r14.$context
                r0 = 0
                r14.L$0 = r0
                r14.L$1 = r0
                r14.I$0 = r3
                r14.label = r5
                java.lang.Object r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$shareToSystem(r2, r1, r7, r14)
                if (r0 != r6) goto L10
                return r6
            L40:
                java.lang.String r4 = r7.text
                if (r4 == 0) goto L51
                android.content.Context r3 = r14.$context
                java.lang.String r2 = r14.$facebookPackage
                java.lang.String r1 = r14.$caption
                com.facebook.aura.file.actions.HatchShare r0 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                boolean r3 = r0.shareTextToFacebookFeed(r3, r4, r2, r1)
                goto L2a
            L51:
                r3 = 0
                goto L2c
            L53:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137011.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137011) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToInstagram$2", f = "HatchShareSheetViewModel.kt", l = {1521, 1529, 1535, 1545, 1566, 1606, 1616}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToInstagram$2, reason: invalid class name and case insensitive filesystem */
    public final class C137022 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchAvatarStoryCard $avatarStoryCard;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDanceShare $dance;
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ Float $linkStickerCenterYRatio;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ String $stickerUri;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
        public Object L$17;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;

        /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToInstagram$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchShareDestination.values().length];
                try {
                    AnonymousClass002.A13(HatchShareDestination.INSTAGRAM_STORIES, iArr);
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137022(String str, Context context, HatchShareDestination hatchShareDestination, String str2, Float f, HatchAvatarStoryCard hatchAvatarStoryCard, HatchDanceShare hatchDanceShare, HtJ<? super C137022> htJ) {
            super(2, htJ);
            this.$mediaUri = str;
            this.$context = context;
            this.$destination = hatchShareDestination;
            this.$stickerUri = str2;
            this.$linkStickerCenterYRatio = f;
            this.$avatarStoryCard = hatchAvatarStoryCard;
            this.$dance = hatchDanceShare;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137022 c137022 = HatchShareSheetViewModel.this.new C137022(this.$mediaUri, this.$context, this.$destination, this.$stickerUri, this.$linkStickerCenterYRatio, this.$avatarStoryCard, this.$dance, htJ);
            c137022.L$0 = obj;
            return c137022;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b2 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0104 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0107 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0122 A[Catch: all -> 0x02aa, TRY_ENTER, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0175 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0194 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x023d A[Catch: all -> 0x02aa, TRY_ENTER, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0256 A[Catch: all -> 0x02aa, TryCatch #0 {all -> 0x02aa, blocks: (B:7:0x0017, B:11:0x002a, B:13:0x0030, B:14:0x0034, B:16:0x003c, B:18:0x0044, B:20:0x004a, B:25:0x006b, B:27:0x0070, B:28:0x0079, B:30:0x0082, B:32:0x008a, B:38:0x00ae, B:40:0x00b2, B:42:0x00c1, B:48:0x00ea, B:49:0x00ed, B:52:0x00f7, B:54:0x0104, B:59:0x0110, B:61:0x0116, B:66:0x0130, B:67:0x0134, B:72:0x016a, B:74:0x0175, B:97:0x0256, B:99:0x025e, B:101:0x0262, B:102:0x026f, B:75:0x0194, B:77:0x0198, B:78:0x01c0, B:80:0x01ce, B:82:0x01d2, B:88:0x022f, B:89:0x0231, B:95:0x0243, B:94:0x023d, B:65:0x0122, B:55:0x0107, B:35:0x00a3, B:19:0x0048, B:10:0x0026, B:24:0x0068, B:37:0x00ab, B:47:0x00e7, B:71:0x0167, B:87:0x022c, B:105:0x02a6), top: B:127:0x000b }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 824
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137022.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137022) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToInstagramDirect$1", f = "HatchShareSheetViewModel.kt", l = {510}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToInstagramDirect$1, reason: invalid class name and case insensitive filesystem */
    public final class C137031 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137031(Context context, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137031> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137031 c137031 = new C137031(this.$context, this.this$0, htJ);
            c137031.L$0 = obj;
            return c137031;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r6 = r14.L$0
                com.facebook.aura.sharesheet.HatchShareContent r6 = (com.facebook.aura.sharesheet.HatchShareContent) r6
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r4 = 1
                if (r0 == 0) goto L13
                if (r0 != r4) goto L50
                X.Hwg.A00(r15)
            L10:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L13:
                X.Hwg.A00(r15)
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r6.media
                if (r0 == 0) goto L40
                com.facebook.aura.file.actions.HatchShare r7 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                android.content.Context r8 = r14.$context
                android.net.Uri r9 = r0.uri
                java.lang.String r10 = r0.mimeType
                java.lang.String r11 = r6.text
                r12 = 0
                r13 = r12
                boolean r3 = r7.shareMediaToInstagramDirect(r8, r9, r10, r11, r12, r13)
            L2a:
                if (r3 != 0) goto L10
            L2c:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r2 = r14.this$0
                android.content.Context r1 = r14.$context
                r0 = 0
                r14.L$0 = r0
                r14.L$1 = r0
                r14.I$0 = r3
                r14.label = r4
                java.lang.Object r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$shareToSystem(r2, r1, r6, r14)
                if (r0 != r5) goto L10
                return r5
            L40:
                java.lang.String r3 = r6.text
                if (r3 == 0) goto L4e
                android.content.Context r2 = r14.$context
                com.facebook.aura.file.actions.HatchShare r1 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                r0 = 0
                boolean r3 = r1.shareTextToInstagramDirect(r2, r3, r0, r0)
                goto L2a
            L4e:
                r3 = 0
                goto L2c
            L50:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137031.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137031) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessages$1", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessages$1, reason: invalid class name and case insensitive filesystem */
    public final class C137041 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137041(Context context, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137041> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137041 c137041 = new C137041(this.$context, this.this$0, htJ);
            c137041.L$0 = obj;
            return c137041;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zShareTextToMessages;
            HatchShareContent hatchShareContent = (HatchShareContent) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchPreparedShareMedia hatchPreparedShareMedia = hatchShareContent.media;
            if (hatchPreparedShareMedia == null) {
                String str = hatchShareContent.text;
                if (str != null) {
                    zShareTextToMessages = HatchShare.INSTANCE.shareTextToMessages(this.$context, str);
                }
                this.this$0.launchSystemShare(this.$context, hatchShareContent);
                return Unit.INSTANCE;
            }
            zShareTextToMessages = HatchShare.INSTANCE.shareMediaToMessages(this.$context, hatchPreparedShareMedia.uri, hatchPreparedShareMedia.mimeType, hatchShareContent.text);
            if (!zShareTextToMessages) {
                this.this$0.launchSystemShare(this.$context, hatchShareContent);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137041) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessenger$1", f = "HatchShareSheetViewModel.kt", l = {641}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessenger$1, reason: invalid class name and case insensitive filesystem */
    public final class C137051 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137051(Context context, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137051> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137051 c137051 = new C137051(this.$context, this.this$0, htJ);
            c137051.L$0 = obj;
            return c137051;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r6 = r14.L$0
                com.facebook.aura.sharesheet.HatchShareContent r6 = (com.facebook.aura.sharesheet.HatchShareContent) r6
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r4 = 1
                if (r0 == 0) goto L13
                if (r0 != r4) goto L50
                X.Hwg.A00(r15)
            L10:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L13:
                X.Hwg.A00(r15)
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r6.media
                if (r0 == 0) goto L40
                com.facebook.aura.file.actions.HatchShare r7 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                android.content.Context r8 = r14.$context
                android.net.Uri r9 = r0.uri
                java.lang.String r10 = r0.mimeType
                java.lang.String r11 = r6.text
                r12 = 0
                r13 = r12
                boolean r3 = r7.shareMediaToMessenger(r8, r9, r10, r11, r12, r13)
            L2a:
                if (r3 != 0) goto L10
            L2c:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r2 = r14.this$0
                android.content.Context r1 = r14.$context
                r0 = 0
                r14.L$0 = r0
                r14.L$1 = r0
                r14.I$0 = r3
                r14.label = r4
                java.lang.Object r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$shareToSystem(r2, r1, r6, r14)
                if (r0 != r5) goto L10
                return r5
            L40:
                java.lang.String r3 = r6.text
                if (r3 == 0) goto L4e
                android.content.Context r2 = r14.$context
                com.facebook.aura.file.actions.HatchShare r1 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                r0 = 0
                boolean r3 = r1.shareTextToMessenger(r2, r3, r0, r0)
                goto L2a
            L4e:
                r3 = 0
                goto L2c
            L50:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137051.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137051) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {AuraSingleTearKt.SINGLE_TEAR_TOTAL_MS}, m = "shareToMessengerRecipient", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessengerRecipient$1, reason: invalid class name and case insensitive filesystem */
    public final class C137061 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C137061(HtJ<? super C137061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.shareToMessengerRecipient(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipient$3", f = "HatchShareSheetViewModel.kt", l = {796, 809}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipient$3, reason: invalid class name and case insensitive filesystem */
    public final class C137073 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $mediaUri;
        public final /* synthetic */ HatchShareRecipient $recipient;
        public final /* synthetic */ String $recipientKey;
        public final /* synthetic */ boolean $usesNetworkSend;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137073(String str, boolean z, Context context, String str2, HatchShareRecipient hatchShareRecipient, HtJ<? super C137073> htJ) {
            super(2, htJ);
            this.$recipientKey = str;
            this.$usesNetworkSend = z;
            this.$context = context;
            this.$mediaUri = str2;
            this.$recipient = hatchShareRecipient;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C137073(this.$recipientKey, this.$usesNetworkSend, this.$context, this.$mediaUri, this.$recipient, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareSheetViewModel hatchShareSheetViewModel = HatchShareSheetViewModel.this;
                this.label = 1;
                obj = hatchShareSheetViewModel.awaitShareEligibility(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    HatchShareSheetViewModel.this.finishRecipientSend(this.$recipientKey, (HatchRecipientSendState) obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                boolean z = this.$usesNetworkSend;
                HatchShareSheetViewModel hatchShareSheetViewModel2 = HatchShareSheetViewModel.this;
                if (z) {
                    hatchShareSheetViewModel2.finishRecipientSend(this.$recipientKey, HatchRecipientSendState.UNDO);
                    HatchShareSheetViewModel.this.scheduleRecipientSend(AnonymousClass001.A0I(this.$context), this.$mediaUri, this.$recipient);
                } else {
                    Context context = this.$context;
                    String str = this.$mediaUri;
                    HatchShareRecipient hatchShareRecipient = this.$recipient;
                    this.label = 2;
                    obj = hatchShareSheetViewModel2.performRecipientAppShare(context, str, hatchShareRecipient, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    HatchShareSheetViewModel.this.finishRecipientSend(this.$recipientKey, (HatchRecipientSendState) obj);
                }
            } else {
                HatchShareSheetViewModel hatchShareSheetViewModel3 = HatchShareSheetViewModel.this;
                hatchShareSheetViewModel3.finishRecipientSend(this.$recipientKey, (!hatchShareSheetViewModel3.requiresMessageShareReview || AnonymousClass006.A0e(hatchShareSheetViewModel3).showsReviewBeforeSharing) ? HatchRecipientSendState.IDLE : HatchRecipientSendState.FAILED);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137073) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {979, 983}, m = "shareToRecipientApp", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipientApp$1, reason: invalid class name and case insensitive filesystem */
    public final class C137081 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C137081(HtJ<? super C137081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.shareToRecipientApp(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$1", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$1, reason: invalid class name and case insensitive filesystem */
    public final class C137091 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137091(Context context, HtJ<? super C137091> htJ) {
            super(2, htJ);
            this.$context = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137091 c137091 = HatchShareSheetViewModel.this.new C137091(this.$context, htJ);
            c137091.L$0 = obj;
            return c137091;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchShareContent hatchShareContent = (HatchShareContent) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchShareSheetViewModel.this.launchSystemShare(this.$context, hatchShareContent);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137091) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1682}, m = "shareToSystem", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$2, reason: invalid class name and case insensitive filesystem */
    public final class C137102 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C137102(HtJ<? super C137102> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.shareToSystem((Context) null, (HatchShareContent) null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToThreads$1", f = "HatchShareSheetViewModel.kt", l = {707}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToThreads$1, reason: invalid class name and case insensitive filesystem */
    public final class C137111 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ HatchDanceShare $dance;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137111(Context context, HatchDanceShare hatchDanceShare, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137111> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$dance = hatchDanceShare;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137111 c137111 = new C137111(this.$context, this.$dance, this.this$0, htJ);
            c137111.L$0 = obj;
            return c137111;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r5 = r12.L$0
                com.facebook.aura.sharesheet.HatchShareContent r5 = (com.facebook.aura.sharesheet.HatchShareContent) r5
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r3 = 1
                if (r0 == 0) goto L13
                if (r0 != r3) goto L59
                X.Hwg.A00(r13)
            L10:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L13:
                X.Hwg.A00(r13)
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r5.media
                if (r0 == 0) goto L4a
                com.facebook.aura.file.actions.HatchShare r6 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                android.content.Context r7 = r12.$context
                android.net.Uri r8 = r0.uri
                java.lang.String r9 = r0.mimeType
                java.lang.String r10 = r5.text
                com.facebook.aura.model.HatchDanceShare r0 = r12.$dance
                if (r0 == 0) goto L48
                com.facebook.aura.model.HatchAttachmentAudio r0 = r0.audio
                if (r0 == 0) goto L48
                java.lang.String r11 = r0.audioClusterId
            L2e:
                boolean r6 = r6.shareMediaToThreads(r7, r8, r9, r10, r11)
            L32:
                if (r6 != 0) goto L10
            L34:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r2 = r12.this$0
                android.content.Context r1 = r12.$context
                r0 = 0
                r12.L$0 = r0
                r12.L$1 = r0
                r12.I$0 = r6
                r12.label = r3
                java.lang.Object r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$shareToSystem(r2, r1, r5, r12)
                if (r0 != r4) goto L10
                return r4
            L48:
                r11 = 0
                goto L2e
            L4a:
                java.lang.String r2 = r5.text
                if (r2 == 0) goto L57
                android.content.Context r1 = r12.$context
                com.facebook.aura.file.actions.HatchShare r0 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                boolean r6 = r0.shareTextToThreads(r1, r2)
                goto L32
            L57:
                r6 = 0
                goto L34
            L59:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137111.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137111) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToWhatsApp$1", f = "HatchShareSheetViewModel.kt", l = {MC.hatch_android_widgets.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToWhatsApp$1, reason: invalid class name and case insensitive filesystem */
    public final class C137121 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137121(Context context, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137121> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137121 c137121 = new C137121(this.$context, this.this$0, htJ);
            c137121.L$0 = obj;
            return c137121;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r6 = r13.L$0
                com.facebook.aura.sharesheet.HatchShareContent r6 = (com.facebook.aura.sharesheet.HatchShareContent) r6
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r13.label
                r4 = 1
                if (r0 == 0) goto L13
                if (r0 != r4) goto L51
                X.Hwg.A00(r14)
            L10:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L13:
                X.Hwg.A00(r14)
                com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r6.media
                if (r0 == 0) goto L40
                com.facebook.aura.file.actions.HatchShare r7 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                android.content.Context r8 = r13.$context
                android.net.Uri r9 = r0.uri
                java.lang.String r10 = r0.mimeType
                java.lang.String r11 = r6.text
                java.lang.String r12 = "com.whatsapp"
                boolean r3 = r7.shareMediaToWhatsApp(r8, r9, r10, r11, r12)
            L2a:
                if (r3 != 0) goto L10
            L2c:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r2 = r13.this$0
                android.content.Context r1 = r13.$context
                r0 = 0
                r13.L$0 = r0
                r13.L$1 = r0
                r13.I$0 = r3
                r13.label = r4
                java.lang.Object r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.access$shareToSystem(r2, r1, r6, r13)
                if (r0 != r5) goto L10
                return r5
            L40:
                java.lang.String r3 = r6.text
                if (r3 == 0) goto L4f
                android.content.Context r2 = r13.$context
                com.facebook.aura.file.actions.HatchShare r1 = com.facebook.aura.file.actions.HatchShare.INSTANCE
                java.lang.String r0 = "com.whatsapp"
                boolean r3 = r1.shareTextToWhatsApp(r2, r3, r0)
                goto L2a
            L4f:
                r3 = 0
                goto L2c
            L51:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137121.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137121) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToX$1", f = "HatchShareSheetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToX$1, reason: invalid class name and case insensitive filesystem */
    public final class C137131 extends AbstractC07127nr implements G0V<HatchShareContent, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137131(Context context, HatchShareSheetViewModel hatchShareSheetViewModel, HtJ<? super C137131> htJ) {
            super(2, htJ);
            this.$context = context;
            this.this$0 = hatchShareSheetViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C137131 c137131 = new C137131(this.$context, this.this$0, htJ);
            c137131.L$0 = obj;
            return c137131;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean zShareTextToX;
            HatchShareContent hatchShareContent = (HatchShareContent) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchPreparedShareMedia hatchPreparedShareMedia = hatchShareContent.media;
            if (hatchPreparedShareMedia == null) {
                String str = hatchShareContent.text;
                if (str != null) {
                    zShareTextToX = HatchShare.INSTANCE.shareTextToX(this.$context, str);
                }
                this.this$0.launchSystemShare(this.$context, hatchShareContent);
                return Unit.INSTANCE;
            }
            zShareTextToX = HatchShare.INSTANCE.shareMediaToX(this.$context, hatchPreparedShareMedia.uri, hatchPreparedShareMedia.mimeType, hatchShareContent.text);
            if (!zShareTextToX) {
                this.this$0.launchSystemShare(this.$context, hatchShareContent);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(HatchShareContent hatchShareContent, HtJ<? super Unit> htJ) {
            return ((C137131) create(hatchShareContent, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$startDownload$2", f = "HatchShareSheetViewModel.kt", l = {552}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$startDownload$2, reason: invalid class name and case insensitive filesystem */
    public final class C137142 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchShareDestination $destination;
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $download;
        public int label;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C137142(G0U<? super HtJ<? super Unit>, ? extends Object> g0u, HatchShareSheetViewModel hatchShareSheetViewModel, HatchShareDestination hatchShareDestination, HtJ<? super C137142> htJ) {
            super(2, htJ);
            this.$download = g0u;
            this.this$0 = hatchShareSheetViewModel;
            this.$destination = hatchShareDestination;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C137142(this.$download, this.this$0, this.$destination, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchShareSheetUiState value;
            HatchShareSheetUiState hatchShareSheetUiState;
            HatchShareSheetUiState value2;
            HatchShareSheetUiState hatchShareSheetUiState2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$download;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                BLG<HatchShareSheetUiState> blg = this.this$0._uiState;
                HatchShareDestination hatchShareDestination = this.$destination;
                do {
                    value2 = blg.getValue();
                    hatchShareSheetUiState2 = value2;
                } while (!blg.A6e(value2, HatchShareSheetUiState.copy$default(hatchShareSheetUiState2, null, null, null, hatchShareSheetUiState2.loadingDestination == hatchShareDestination ? null : hatchShareSheetUiState2.loadingDestination, false, false, null, null, false, null, false, 2039, null)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<HatchShareSheetUiState> blg2 = this.this$0._uiState;
                HatchShareDestination hatchShareDestination2 = this.$destination;
                do {
                    value = blg2.getValue();
                    hatchShareSheetUiState = value;
                } while (!blg2.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, null, null, hatchShareSheetUiState.loadingDestination == hatchShareDestination2 ? null : hatchShareSheetUiState.loadingDestination, false, false, null, null, false, null, false, 2039, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C137142) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$startNetworkRecipientSend$2", f = "HatchShareSheetViewModel.kt", l = {902}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$startNetworkRecipientSend$2, reason: invalid class name and case insensitive filesystem */
    public final class C137152 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ PendingRecipientSend $pendingSend;
        public final /* synthetic */ String $recipientKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C137152(PendingRecipientSend pendingRecipientSend, String str, HtJ<? super C137152> htJ) {
            super(1, htJ);
            this.$pendingSend = pendingRecipientSend;
            this.$recipientKey = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchShareSheetViewModel.this.new C137152(this.$pendingSend, this.$recipientKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchShareSheetViewModel hatchShareSheetViewModel = HatchShareSheetViewModel.this;
                PendingRecipientSend pendingRecipientSend = this.$pendingSend;
                Context context = pendingRecipientSend.context;
                String str = pendingRecipientSend.mediaUri;
                HatchShareRecipient hatchShareRecipient = pendingRecipientSend.recipient;
                this.label = 1;
                obj = hatchShareSheetViewModel.performNetworkRecipientSend(context, str, hatchShareRecipient, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (!AnonymousClass001.A1X(obj)) {
                HatchShareSheetViewModel.this.failNetworkRecipientSend(this.$recipientKey);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C137152) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel", f = "HatchShareSheetViewModel.kt", l = {1815}, m = "withoutAudio", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$withoutAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C137161 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C137161(HtJ<? super C137161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareSheetViewModel.this.withoutAudio(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HatchShareSheetViewModel(X.AbstractC3358CGz r18, com.facebook.aura.navigation.key.ShareType r19, boolean r20, com.facebook.aura.sharesheet.HatchShareSheetRepository r21, com.facebook.aura.opengraph.HatchOpenGraphRepository r22, java.lang.String r23, X.G0V<? super com.facebook.aura.explore.repo.IdeaCardShareResult, ? super X.HtJ<? super java.lang.String>, ? extends java.lang.Object> r24, X.G0V<? super java.lang.String, ? super X.HtJ<? super java.lang.String>, ? extends java.lang.Object> r25, java.lang.String r26, com.facebook.aura.sharesheet.HatchShareLogContext r27, com.facebook.aura.model.HatchDanceShare r28) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.<init>(X.CGz, com.facebook.aura.navigation.key.ShareType, boolean, com.facebook.aura.sharesheet.HatchShareSheetRepository, com.facebook.aura.opengraph.HatchOpenGraphRepository, java.lang.String, X.G0V, X.G0V, java.lang.String, com.facebook.aura.sharesheet.HatchShareLogContext, com.facebook.aura.model.HatchDanceShare):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C20Q<AHD<HatchAvatarDance>> avatarDances(HatchAvatarDancesRepository hatchAvatarDancesRepository) {
        return new C05663ul(new C136821(hatchAvatarDancesRepository, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performNetworkRecipientSend(android.content.Context r12, java.lang.String r13, com.facebook.aura.sharesheet.HatchShareRecipient r14, X.HtJ<? super java.lang.Boolean> r15) {
        /*
            r11 = this;
            r7 = r14
            boolean r0 = r15 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136891
            if (r0 == 0) goto L9e
            r10 = r15
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$performNetworkRecipientSend$1 r10 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136891) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r10.label = r2
        L13:
            java.lang.Object r1 = r10.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r2 = 3
            r6 = 2
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L49
            if (r0 == r6) goto L76
            if (r0 != r2) goto La5
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L29:
            boolean r0 = r0 instanceof X.C10571Hud
            r5 = r0 ^ 1
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L32:
            X.Hwg.A00(r1)
            java.lang.String r1 = r11.messagingShareText(r12)
            r10.L$0 = r12
            r0 = 0
            r10.L$1 = r0
            r10.L$2 = r14
            r10.label = r4
            java.lang.Object r1 = r11.prepareShareContent(r12, r13, r1, r10)
            if (r1 != r3) goto L54
            return r3
        L49:
            java.lang.Object r7 = r10.L$2
            com.facebook.aura.sharesheet.HatchShareRecipient r7 = (com.facebook.aura.sharesheet.HatchShareRecipient) r7
            java.lang.Object r12 = r10.L$0
            android.content.Context r12 = (android.content.Context) r12
            X.Hwg.A00(r1)
        L54:
            com.facebook.aura.sharesheet.HatchShareContent r1 = (com.facebook.aura.sharesheet.HatchShareContent) r1
            if (r1 == 0) goto L2d
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r0 = r1.media
            if (r0 != 0) goto L82
            java.lang.String r2 = r1.text
            if (r2 == 0) goto L2d
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r11.repository
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.L$4 = r0
            r10.label = r6
            java.lang.Object r0 = r1.m2008xc74d0c9(r7, r2, r10)
            if (r0 != r3) goto L7a
            return r3
        L76:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L7a:
            boolean r0 = r0 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 != r4) goto L2d
            r5 = 1
            goto L2d
        L82:
            com.facebook.aura.sharesheet.HatchShareSheetRepository r5 = r11.repository
            android.content.Context r6 = X.AnonymousClass001.A0I(r12)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r8 = r1.media
            java.lang.String r9 = r1.text
            r0 = 0
            r10.L$0 = r0
            r10.L$1 = r0
            r10.L$2 = r0
            r10.L$3 = r0
            r10.label = r2
            java.lang.Object r0 = r5.m2007x94ee276f(r6, r7, r8, r9, r10)
            if (r0 != r3) goto L29
            return r3
        L9e:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$performNetworkRecipientSend$1 r10 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$performNetworkRecipientSend$1
            r10.<init>(r15)
            goto L13
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.performNetworkRecipientSend(android.content.Context, java.lang.String, com.facebook.aura.sharesheet.HatchShareRecipient, X.HtJ):java.lang.Object");
    }

    public final void copyIdeaShareLink(G0U<? super String, Unit> g0u) {
        HatchShareSheetUiState value;
        C7384Etj.A0Y(g0u, 0);
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            HatchShareLogging hatchShareLogging = HatchShareLogging.INSTANCE;
            HatchShareDestination hatchShareDestination = HatchShareDestination.COPY_LINK;
            hatchShareLogging.logDestination(hatchShareDestination, this.logContext.getValue());
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
            AnonymousClass001.A1J(new C136842(g0u, null), AEu.A00(this));
        }
    }

    public final void onAvatarTabSelected$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(AvatarShareTab avatarShareTab) {
        C7384Etj.A0Y(avatarShareTab, 0);
        AnonymousClass002.A1I(this.selectedAvatarTab, avatarShareTab);
    }

    public final void save(Context context, HatchShareDownloadTarget hatchShareDownloadTarget, String str) {
        AnonymousClass005.A0x(context, hatchShareDownloadTarget, str);
        startDownload(HatchShareDestination.SAVE, new C136961(hatchShareDownloadTarget, this, context, str, null));
    }

    public final void shareArtifactToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        HatchShareSheetUiState value;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A12(str, str3, str4, 1);
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            String strFacebookAppPackage = HatchShare.INSTANCE.facebookAppPackage(context);
            HatchShareDestination hatchShareDestination = HatchShareDestination.FACEBOOK_STORIES;
            C1BN.A01(hatchShareDestination, this);
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
            AnonymousClass001.A1J(new HatchShareSheetViewModel$shareArtifactToFacebookStories$2(this, str, context, str2, str3, str4, i, i2, i3, strFacebookAppPackage, null), AEu.A00(this));
        }
    }

    public final void shareArtifactToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        HatchShareSheetUiState value;
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A12(str, str3, str4, 1);
        if (this.shareCancelled || AnonymousClass006.A0e(this).isCheckingEligibility || AnonymousClass006.A0e(this).loadingDestination != null) {
            return;
        }
        HatchShareDestination hatchShareDestination = HatchShareDestination.INSTAGRAM_STORIES;
        C1BN.A01(hatchShareDestination, this);
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
        AnonymousClass001.A1J(new HatchShareSheetViewModel$shareArtifactToInstagramStories$2(this, str, context, str2, str3, str4, i, i2, i3, null), AEu.A00(this));
    }

    public final void shareAvatarPageToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, AvatarSharePage avatarSharePage, String str2) {
        HatchAvatarStoryPalette hatchAvatarStoryPalettePaletteAt;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        C7384Etj.A0Y(str2, 3);
        if (avatarSharePage instanceof AvatarSharePage.Dance) {
            shareToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, null, Float.valueOf(0.88f), null, ((AvatarSharePage.Dance) avatarSharePage).dance);
            return;
        }
        if (avatarSharePage instanceof AvatarSharePage.Intro) {
            hatchAvatarStoryPalettePaletteAt = ((AvatarSharePage.Intro) avatarSharePage).palette;
        } else {
            if (avatarSharePage != null) {
                throw new NoWhenBranchMatchedException();
            }
            hatchAvatarStoryPalettePaletteAt = HatchAvatarSharePagesKt.paletteAt(zA1b ? 1 : 0);
        }
        shareAvatarCardToInstagramStories(context, str, hatchAvatarStoryPalettePaletteAt, str2);
    }

    public final void shareAvatarToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, HatchAvatarStoryCard hatchAvatarStoryCard) {
        HatchShareSheetUiState value;
        AnonymousClass005.A10(context, str, hatchAvatarStoryCard);
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            String strFacebookAppPackage = HatchShare.INSTANCE.facebookAppPackage(context);
            HatchShareDestination hatchShareDestination = HatchShareDestination.FACEBOOK_STORIES;
            C1BN.A01(hatchShareDestination, this);
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
            AnonymousClass001.A1J(new HatchShareSheetViewModel$shareAvatarToFacebookStories$2(this, context, str, hatchAvatarStoryCard, strFacebookAppPackage, null), AEu.A00(this));
        }
    }

    public final void shareImageToInstagramStories(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        shareToInstagram(context, str, HatchShareDestination.INSTAGRAM_STORIES, null, Float.valueOf(0.88f), null, null);
    }

    public final void shareToFacebookFeed(Context context, String str, String str2, String str3) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        String strFacebookAppPackage = HatchShare.INSTANCE.facebookAppPackage(context);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.FACEBOOK_FEED, this.prepareFacebookFeedMedia, new C137011(context, strFacebookAppPackage, this, str3, null));
    }

    public final void shareToInstagramDirect(Context context, String str, String str2) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.INSTAGRAM_DIRECT, null, new C137031(context, this, null));
    }

    public final void shareToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, HatchAvatarStoryCard hatchAvatarStoryCard, Float f, String str2, HatchDanceShare hatchDanceShare) {
        AnonymousClass003.A0u(context, str);
        shareToInstagram(context, str, HatchShareDestination.INSTAGRAM_STORIES, hatchAvatarStoryCard, f, str2, hatchDanceShare);
    }

    public final void shareToMessages(Context context, String str, String str2) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.OS_MESSAGES, null, new C137041(context, this, null));
    }

    public final void shareToMessenger(Context context, String str, String str2) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.MESSENGER, null, new C137051(context, this, null));
    }

    public final void shareToRecipient(Context context, String str, HatchShareRecipient hatchShareRecipient) {
        AnonymousClass005.A0x(context, str, hatchShareRecipient);
        if (HatchShareSheetViewModelKt.getDestination(hatchShareRecipient) != null) {
            String key = HatchShareSheetModelsKt.getKey(hatchShareRecipient);
            if (undoRecipientSend(key) || this.shareCancelled || AnonymousClass006.A0e(this).isCheckingEligibility) {
                return;
            }
            boolean usesNetworkSend = HatchShareSheetViewModelKt.getUsesNetworkSend(hatchShareRecipient);
            boolean canShare = HatchShareSheetViewModelKt.getCanShare(AnonymousClass006.A0e(this).eligibilityState);
            if (beginRecipientSend(key, (usesNetworkSend && canShare) ? HatchRecipientSendState.UNDO : HatchRecipientSendState.SENDING)) {
                HatchShareLogging hatchShareLogging = HatchShareLogging.INSTANCE;
                Iterator it = AnonymousClass006.A0e(this).data.recipients.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C7384Etj.areEqual(HatchShareSheetModelsKt.getKey((HatchShareRecipient) it.next()), HatchShareSheetModelsKt.getKey(hatchShareRecipient))) {
                        break;
                    } else {
                        i++;
                    }
                }
                Integer numValueOf = Integer.valueOf(i);
                if (numValueOf.intValue() < 0) {
                    numValueOf = null;
                }
                hatchShareLogging.logRecipientSend(hatchShareRecipient, numValueOf, this.logContext.getValue());
                if (usesNetworkSend && canShare) {
                    scheduleRecipientSend(AnonymousClass001.A0I(context), str, hatchShareRecipient);
                } else {
                    AnonymousClass001.A1J(new C137073(key, usesNetworkSend, context, str, hatchShareRecipient, null), AEu.A00(this));
                }
            }
        }
    }

    public final void shareToSystem(Context context, String str, String str2) {
        AnonymousClass003.A0u(context, str);
        shareContent(context, str, str2, HatchShareDestination.OS_SHARE_TO, null, new C137091(context, null));
    }

    public final void shareToThreads(Context context, String str, String str2, HatchDanceShare hatchDanceShare) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.THREADS, null, new C137111(context, hatchDanceShare, this, null));
    }

    public final void shareToWhatsApp(Context context, String str, String str2) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.WHATSAPP, null, new C137121(context, this, null));
    }

    public final void shareToX(Context context, String str, String str2) {
        String strMessagingShareText = str2;
        AnonymousClass003.A0u(context, str);
        if (str2 == null) {
            strMessagingShareText = messagingShareText(context);
        }
        shareContent(context, str, strMessagingShareText, HatchShareDestination.f315X, null, new C137131(context, this, null));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ShareType.values().length];
            try {
                AnonymousClass005.A0v(ShareType.IMAGE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ShareType.VIDEO, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(ShareType.SCREENSHOT, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ShareType.IDEA, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ShareType.ARTIFACT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ShareType.SPACE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(ShareType.INVITE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(ShareType.MESSAGE_MEDIA, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(ShareType.DEFAULT, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(ShareType.MESSAGE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(ShareType.AVATAR, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchMessageShareAttemptResult.values().length];
            try {
                AnonymousClass005.A0v(HatchMessageShareAttemptResult.ALLOWED, iArr2, 1);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageShareAttemptResult.ALLOWED_WITH_FRICTION, iArr2, 2);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageShareAttemptResult.BLOCKED, iArr2, 3);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageShareAttemptResult.UNAVAILABLE, iArr2, 4);
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[HatchShareAppTarget.values().length];
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.INSTAGRAM, iArr3, 1);
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AnonymousClass005.A0v(HatchShareAppTarget.MESSENGER, iArr3, 2);
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMessageShareResult(HatchMessageShareAttemptResult hatchMessageShareAttemptResult) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiState;
        HatchShareEligibilityState hatchShareEligibilityState;
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchShareSheetUiState = value;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = hatchMessageShareAttemptResult.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                hatchShareEligibilityState = HatchShareEligibilityState.ELIGIBLE;
            } else if (iOrdinal == 2) {
                hatchShareEligibilityState = HatchShareEligibilityState.INELIGIBLE;
            } else {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                hatchShareEligibilityState = HatchShareEligibilityState.UNAVAILABLE;
            }
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, hatchShareEligibilityState, null, null, false, AnonymousClass002.A1Z(hatchMessageShareAttemptResult, HatchMessageShareAttemptResult.ALLOWED_WITH_FRICTION), null, null, false, null, false, 2013, null)));
    }

    private final C1BN<AvatarSharePages> avatarPagesFlow() {
        HatchAvatarDancesRepository companion = HatchAvatarDancesRepository.Companion.getInstance(this.userSession);
        C1BN<AiIdentity> c1bn = HatchIdentityProvider.Companion.getInstance(this.userSession).aiIdentity;
        return AnonymousClass441.A00(null, AEu.A00(this), C3rb.A03(new AnonymousClass5(null), new C10650I0u(2, new AnonymousClass3(null), AbstractC05633ui.A00(new AnonymousClass2(companion, null), GDB.A01(new HatchShareSheetViewModel$avatarPagesFlow$$inlined$map$1(c1bn)))), C3rb.A03(AnonymousClass4.INSTANCE, c1bn, HatchAvatarAppearance.INSTANCE.isDarkFlow())), C3Ek.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitShareEligibility(X.HtJ<? super java.lang.Boolean> r34) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.awaitShareEligibility(X.HtJ):java.lang.Object");
    }

    private final boolean beginRecipientSend(String str, HatchRecipientSendState hatchRecipientSendState) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiStateCopy$default;
        BLG<HatchShareSheetUiState> blg = this._uiState;
        boolean z = false;
        do {
            value = blg.getValue();
            hatchShareSheetUiStateCopy$default = value;
            HatchRecipientSendState hatchRecipientSendState2 = hatchShareSheetUiStateCopy$default.recipientSendStates.get(str);
            if (hatchRecipientSendState2 == null) {
                hatchRecipientSendState2 = HatchRecipientSendState.IDLE;
            }
            if (hatchRecipientSendState2 == HatchRecipientSendState.IDLE || hatchRecipientSendState2 == HatchRecipientSendState.FAILED) {
                hatchShareSheetUiStateCopy$default = HatchShareSheetUiState.copy$default(hatchShareSheetUiStateCopy$default, null, null, null, null, false, false, AnonymousClass006.A11(str, hatchRecipientSendState, hatchShareSheetUiStateCopy$default.recipientSendStates), null, false, null, false, 1983, null);
                z = true;
            }
        } while (!blg.A6e(value, hatchShareSheetUiStateCopy$default));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<HatchShareDestination> destinationsFor(boolean z) {
        if (!z || DancingAvatarsGating.INSTANCE.getCanShareToNonMetaApps()) {
            return this.shareTypeDestinations;
        }
        AHD<HatchShareDestination> ahd = this.shareTypeDestinations;
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd) {
            if (((HatchShareDestination) obj).isMetaProperty()) {
                arrayList.add(obj);
            }
        }
        return AGI.A07(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object downloadMedia(android.content.Context r12, java.lang.String r13, java.lang.String r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136851
            if (r0 == 0) goto L79
            r10 = r15
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$downloadMedia$1 r10 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136851) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r1 = r10.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r10.label
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L2f
            if (r0 == r8) goto L26
            if (r0 != r3) goto L7f
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L26:
            java.lang.Object r14 = r10.L$2
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r10.L$0
            android.content.Context r12 = (android.content.Context) r12
            goto L48
        L2f:
            X.Hwg.A00(r1)
            com.facebook.aura.sharesheet.HatchShareSheetRepository r4 = r11.repository     // Catch: java.util.concurrent.CancellationException -> L85
            android.content.Context r1 = X.AnonymousClass001.A0I(r12)     // Catch: java.util.concurrent.CancellationException -> L85
            r10.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L85
            r0 = 0
            r10.L$1 = r0     // Catch: java.util.concurrent.CancellationException -> L85
            r10.L$2 = r14     // Catch: java.util.concurrent.CancellationException -> L85
            r10.label = r8     // Catch: java.util.concurrent.CancellationException -> L85
            java.lang.Object r1 = r4.prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r1, r13, r10)     // Catch: java.util.concurrent.CancellationException -> L85
            if (r1 != r2) goto L4b
            goto L84
        L48:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L85
        L4b:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r1 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r1     // Catch: java.util.concurrent.CancellationException -> L85
            if (r1 != 0) goto L58
            com.facebook.aura.file.utils.HatchSaveAnalytics r2 = com.facebook.aura.file.utils.HatchSaveAnalytics.INSTANCE
            r1 = 0
            java.lang.String r0 = "prepare_failed"
            r2.logFailed(r14, r0, r1)
            goto L23
        L58:
            com.facebook.aura.file.actions.HatchFileActions r4 = com.facebook.aura.file.actions.HatchFileActions.INSTANCE
            android.content.Context r5 = X.AnonymousClass001.A0I(r12)
            android.net.Uri r0 = r1.uri
            com.facebook.aura.file.actions.HatchFileRef$Local r6 = new com.facebook.aura.file.actions.HatchFileRef$Local
            r6.<init>(r0, r14)
            X.CGz r7 = r11.userSession
            r9 = 0
            r10.L$0 = r9
            r10.L$1 = r9
            r10.L$2 = r9
            r10.L$3 = r9
            r10.label = r3
            java.lang.Object r0 = r4.download(r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L23
            return r2
        L79:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$downloadMedia$1 r10 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$downloadMedia$1
            r10.<init>(r15)
            goto L12
        L7f:
            java.lang.IllegalStateException r3 = X.AnonymousClass001.A0n()
            throw r3
        L84:
            return r2
        L85:
            r3 = move-exception
            com.facebook.aura.file.utils.HatchSaveAnalytics r2 = com.facebook.aura.file.utils.HatchSaveAnalytics.INSTANCE
            r1 = 0
            java.lang.String r0 = "cancelled"
            r2.logFailed(r14, r0, r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.downloadMedia(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failMediaProcessing() {
        CFK.A06(HatchShareSheetViewModelKt.SHARE_TAG, "Share aborted: media could not be prepared");
        this._sendFailures.AhV(HatchShareFailure.MEDIA_PROCESSING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failNetworkRecipientSend(String str) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiState;
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchShareSheetUiState = value;
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, null, null, null, false, false, AnonymousClass006.A11(str, HatchRecipientSendState.IDLE, hatchShareSheetUiState.recipientSendStates), null, false, null, false, 1983, null)));
        this._sendFailures.AhV(HatchShareFailure.SEND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRecipientSend(String str, HatchRecipientSendState hatchRecipientSendState) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiState;
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchShareSheetUiState = value;
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, null, null, null, false, false, AnonymousClass006.A11(str, hatchRecipientSendState, hatchShareSheetUiState.recipientSendStates), null, false, null, false, 1983, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InstagramStoryBackgroundColors getInstagramStoryBackgroundColors() {
        ShareType shareType = this.shareType;
        return (shareType == ShareType.ARTIFACT || shareType == ShareType.SPACE) ? new InstagramStoryBackgroundColors(HatchShareSheetViewModelKt.INSTAGRAM_STORY_TOP_BACKGROUND_COLOR, HatchShareSheetViewModelKt.INSTAGRAM_STORY_BOTTOM_BACKGROUND_COLOR) : new InstagramStoryBackgroundColors(HatchShareSheetViewModelKt.INSTAGRAM_MESSAGE_STORY_BACKGROUND_COLOR, HatchShareSheetViewModelKt.INSTAGRAM_MESSAGE_STORY_BACKGROUND_COLOR);
    }

    private final boolean getSharesLinkOnly() {
        return this.isLinkShare || this.shareType == ShareType.INVITE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object launchArtifactInstagramStory(android.content.Context r13, com.facebook.aura.sharesheet.HatchPreparedShareMedia r14, java.lang.String r15, X.HtJ<? super java.lang.Boolean> r16) {
        /*
            r12 = this;
            r4 = r16
            r11 = r15
            r3 = r14
            r6 = r13
            boolean r0 = r4 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136871
            if (r0 == 0) goto L82
            r5 = r4
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$launchArtifactInstagramStory$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136871) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.label = r2
        L17:
            java.lang.Object r13 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L6a
            if (r0 != r2) goto L88
            java.lang.Object r11 = r5.L$2
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r5.L$1
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r3 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r3
            java.lang.Object r6 = r5.L$0
            android.content.Context r6 = (android.content.Context) r6
            X.Hwg.A00(r13)
        L31:
            android.net.Uri r13 = (android.net.Uri) r13
            com.facebook.aura.sharesheet.InstagramStoryBackgroundColors r0 = r12.getInstagramStoryBackgroundColors()
            com.facebook.aura.file.actions.HatchShare r5 = com.facebook.aura.file.actions.HatchShare.INSTANCE
            android.net.Uri r7 = r3.uri
            java.lang.String r8 = r3.mimeType
            int r9 = r0.top
            int r10 = r0.bottom
            boolean r0 = X.C7BY.A0j(r11)
            if (r0 == 0) goto L48
            r11 = 0
        L48:
            r1 = 2131887574(0x7f1205d6, float:1.9409759E38)
            java.lang.String r0 = "Muse"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r12 = r6.getString(r1, r0)
            r0 = 1062333317(0x3f51eb85, float:0.82)
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r0)
            java.lang.String r15 = "link_sticker_black_white"
            r16 = r2
            boolean r0 = r5.shareStickerToInstagramStory(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L6a:
            X.Hwg.A00(r13)
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r12.repository
            android.content.Context r0 = X.AnonymousClass001.A0I(r6)
            r5.L$0 = r6
            r5.L$1 = r14
            r5.L$2 = r15
            r5.label = r2
            java.lang.Object r13 = r1.prepareInstagramLinkStickerIcon$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r0, r5)
            if (r13 != r4) goto L31
            return r4
        L82:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$launchArtifactInstagramStory$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$launchArtifactInstagramStory$1
            r5.<init>(r4)
            goto L17
        L88:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.launchArtifactInstagramStory(android.content.Context, com.facebook.aura.sharesheet.HatchPreparedShareMedia, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchSystemShare(Context context, HatchShareContent hatchShareContent) {
        HatchPreparedShareMedia hatchPreparedShareMedia = hatchShareContent.media;
        if (hatchPreparedShareMedia != null) {
            HatchShare.INSTANCE.shareMedia(context, hatchPreparedShareMedia.uri, hatchPreparedShareMedia.mimeType, hatchShareContent.text, false);
            return;
        }
        String str = hatchShareContent.text;
        if (str != null) {
            HatchShare.INSTANCE.shareText(context, str, null, null);
        }
    }

    private final void loadOpenGraphPreview(String str) {
        HatchShareSheetUiState value;
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, null, false, false, null, HatchOpenGraphPreviewState.Loading.INSTANCE, false, null, false, 1919, null)));
        AnonymousClass001.A1J(new C136882(str, null), AEu.A00(this));
    }

    private final String messagingShareText(Context context) {
        int i;
        ShareType shareType = this.shareType;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        switch (shareType.ordinal()) {
            case 0:
            case 1:
            case 6:
            case 9:
                i = R.string._name_removed__res_0x7f1205ed;
                break;
            case 2:
            case 4:
            case 5:
                i = R.string._name_removed__res_0x7f1205dc;
                break;
            case 3:
                return this.ideaShareUrl;
            case 7:
            case 8:
            case 10:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return context.getString(i, HatchAppName.value, HatchShareSheetViewModelKt.getHatchShareDownloadLinkUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String museAvatarName() {
        String str;
        String strA0l;
        AiIdentity value = HatchIdentityProvider.Companion.getInstance(this.userSession).aiIdentity.getValue();
        if (value == null || (str = value.name) == null || (strA0l = AnonymousClass002.A0l(str)) == null || C7BY.A0j(strA0l)) {
            return null;
        }
        return strA0l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performRecipientAppShare(android.content.Context r7, java.lang.String r8, com.facebook.aura.sharesheet.HatchShareRecipient r9, X.HtJ<? super com.facebook.aura.sharesheet.HatchRecipientSendState> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136901
            if (r0 == 0) goto L64
            r5 = r10
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$performRecipientAppShare$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136901) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L43
            if (r0 != r3) goto L6a
            X.Hwg.A00(r1)
        L23:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L6f
            com.facebook.aura.sharesheet.HatchRecipientSendState r4 = com.facebook.aura.sharesheet.HatchRecipientSendState.IDLE
            return r4
        L2c:
            X.Hwg.A00(r1)
            java.lang.String r1 = r6.messagingShareText(r7)
            r5.L$0 = r7
            r0 = 0
            r5.L$1 = r0
            r5.L$2 = r9
            r5.label = r2
            java.lang.Object r1 = r6.prepareShareContent(r7, r8, r1, r5)
            if (r1 != r4) goto L4e
            return r4
        L43:
            java.lang.Object r9 = r5.L$2
            com.facebook.aura.sharesheet.HatchShareRecipient r9 = (com.facebook.aura.sharesheet.HatchShareRecipient) r9
            java.lang.Object r7 = r5.L$0
            android.content.Context r7 = (android.content.Context) r7
            X.Hwg.A00(r1)
        L4e:
            com.facebook.aura.sharesheet.HatchShareContent r1 = (com.facebook.aura.sharesheet.HatchShareContent) r1
            if (r1 == 0) goto L6f
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.label = r3
            java.lang.Object r1 = r6.shareToRecipientApp(r7, r9, r1, r5)
            if (r1 != r4) goto L23
            return r4
        L64:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$performRecipientAppShare$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$performRecipientAppShare$1
            r5.<init>(r10)
            goto L12
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6f:
            com.facebook.aura.sharesheet.HatchRecipientSendState r4 = com.facebook.aura.sharesheet.HatchRecipientSendState.FAILED
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.performRecipientAppShare(android.content.Context, java.lang.String, com.facebook.aura.sharesheet.HatchShareRecipient, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareArtifactStoryMedia(android.content.Context r15, java.lang.String r16, X.AHD<java.lang.String> r17, java.lang.String r18, java.lang.String r19, int r20, int r21, int r22, X.HtJ<? super com.facebook.aura.sharesheet.HatchPreparedShareMedia> r23) {
        /*
            r14 = this;
            r10 = r20
            r11 = r21
            r3 = r23
            r12 = r22
            r9 = r19
            r8 = r18
            r7 = r17
            r5 = r15
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136911
            if (r0 == 0) goto Lac
            r13 = r3
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareArtifactStoryMedia$1 r13 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136911) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lac
            int r2 = r2 - r1
            r13.label = r2
        L21:
            java.lang.Object r4 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r6 = 0
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 == r2) goto L6e
            if (r0 != r1) goto Lb3
            java.lang.Object r2 = r13.L$5
            X.Hwg.A00(r4)
        L35:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L47
            android.net.Uri r1 = android.net.Uri.parse(r4)
            X.C7384Etj.A0U(r1)
            java.lang.String r0 = "image/png"
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r2 = new com.facebook.aura.sharesheet.HatchPreparedShareMedia
            r2.<init>(r1, r0)
        L47:
            return r2
        L48:
            X.Hwg.A00(r4)
            r4 = r16
            if (r16 == 0) goto L6c
            com.facebook.aura.sharesheet.HatchShareSheetRepository r0 = r14.repository
            r13.L$0 = r15
            r13.L$1 = r6
            r13.L$2 = r7
            r13.L$3 = r8
            r13.L$4 = r9
            r13.L$5 = r6
            r13.I$0 = r10
            r13.I$1 = r11
            r13.I$2 = r12
            r13.label = r2
            java.lang.Object r4 = r0.prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r15, r4, r13)
            if (r4 != r3) goto L87
            return r3
        L6c:
            r2 = r6
            goto L8a
        L6e:
            int r12 = r13.I$2
            int r11 = r13.I$1
            int r10 = r13.I$0
            java.lang.Object r9 = r13.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r13.L$3
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r13.L$2
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r5 = r13.L$0
            android.content.Context r5 = (android.content.Context) r5
            X.Hwg.A00(r4)
        L87:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r4 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r4
            r2 = r4
        L8a:
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer r4 = com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.INSTANCE
            if (r2 == 0) goto L90
            android.net.Uri r6 = r2.uri
        L90:
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r0
            r13.L$4 = r0
            r13.L$5 = r2
            r13.I$0 = r10
            r13.I$1 = r11
            r13.I$2 = r12
            r13.label = r1
            java.lang.Object r4 = r4.render(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r4 != r3) goto L35
            return r3
        Lac:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareArtifactStoryMedia$1 r13 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareArtifactStoryMedia$1
            r13.<init>(r3)
            goto L21
        Lb3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.prepareArtifactStoryMedia(android.content.Context, java.lang.String, X.AHD, java.lang.String, java.lang.String, int, int, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareIdeaShare(X.HtJ<? super com.facebook.aura.explore.repo.IdeaCardShareAttempt> r17) {
        /*
            r16 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136921
            r5 = r16
            if (r0 == 0) goto L9e
            r6 = r3
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareIdeaShare$1 r6 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136921) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r14 = r6.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 == r2) goto L98
            if (r0 != r4) goto La5
            java.lang.Object r3 = r6.L$0
            X.Hwg.A00(r14)
        L29:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto Laa
            X.BLG<com.facebook.aura.sharesheet.HatchShareSheetUiState> r2 = r5._uiState
        L2f:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            com.facebook.aura.sharesheet.HatchShareSheetUiState r4 = (com.facebook.aura.sharesheet.HatchShareSheetUiState) r4
            r16 = 1535(0x5ff, float:2.151E-42)
            r5 = 0
            r9 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r9
            r11 = r5
            r12 = r5
            r13 = r9
            r15 = r9
            r17 = r5
            com.facebook.aura.sharesheet.HatchShareSheetUiState r0 = com.facebook.aura.sharesheet.HatchShareSheetUiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L2f
        L4e:
            return r3
        L4f:
            X.Hwg.A00(r14)
            java.lang.String r0 = r5.contentId
            if (r0 == 0) goto Lb0
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto Lb0
            com.facebook.aura.explore.repo.IdeaCardShareResult r0 = r5.ideaShareResult
            if (r0 == 0) goto L85
            com.facebook.aura.explore.repo.IdeaCardShareAttempt$Shared r14 = new com.facebook.aura.explore.repo.IdeaCardShareAttempt$Shared
            r14.<init>(r0)
        L65:
            boolean r0 = r14 instanceof com.facebook.aura.explore.repo.IdeaCardShareAttempt.Shared
            if (r0 == 0) goto Laf
            r0 = r14
            com.facebook.aura.explore.repo.IdeaCardShareAttempt$Shared r0 = (com.facebook.aura.explore.repo.IdeaCardShareAttempt.Shared) r0
            com.facebook.aura.explore.repo.IdeaCardShareResult r1 = r0.result
            r5.ideaShareResult = r1
            java.lang.String r0 = r1.shareUrl
            r5.ideaShareUrl = r0
            X.G0V<com.facebook.aura.explore.repo.IdeaCardShareResult, X.HtJ<? super java.lang.String>, java.lang.Object> r0 = r5.prepareIdeaImage
            if (r0 == 0) goto Laa
            r6.L$0 = r14
            r6.label = r4
            java.lang.Object r0 = r0.invoke(r1, r6)
            if (r0 == r3) goto L4e
            r3 = r14
            r14 = r0
            goto L29
        L85:
            com.facebook.aura.explore.repo.IdeaCardsDataSource$Companion r1 = com.facebook.aura.explore.repo.IdeaCardsDataSource.Companion
            X.CGz r0 = r5.userSession
            com.facebook.aura.explore.repo.IdeaCardsDataSource r1 = r1.getInstance(r0)
            java.lang.String r0 = r5.contentId
            r6.label = r2
            java.lang.Object r14 = r1.shareCard(r0, r6)
            if (r14 != r3) goto L9b
            return r3
        L98:
            X.Hwg.A00(r14)
        L9b:
            com.facebook.aura.explore.repo.IdeaCardShareAttempt r14 = (com.facebook.aura.explore.repo.IdeaCardShareAttempt) r14
            goto L65
        L9e:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareIdeaShare$1 r6 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareIdeaShare$1
            r6.<init>(r3)
            goto L16
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Laa:
            com.facebook.aura.explore.repo.IdeaCardShareAttempt$Failed r14 = new com.facebook.aura.explore.repo.IdeaCardShareAttempt$Failed
            r14.<init>(r2)
        Laf:
            return r14
        Lb0:
            com.facebook.aura.explore.repo.IdeaCardShareAttempt$Unavailable r14 = com.facebook.aura.explore.repo.IdeaCardShareAttempt.Unavailable.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.prepareIdeaShare(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareShareContent(android.content.Context r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super com.facebook.aura.sharesheet.HatchShareContent> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136931
            if (r0 == 0) goto L7b
            r5 = r10
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareShareContent$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C136931) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L38
            if (r0 != r3) goto L81
            java.lang.Object r9 = r5.L$2
            java.lang.String r9 = (java.lang.String) r9
            X.Hwg.A00(r1)
        L25:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r1 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r1
            if (r1 == 0) goto L86
            if (r9 == 0) goto L32
            boolean r0 = X.C7BY.A0j(r9)
            if (r0 != 0) goto L32
            r2 = r9
        L32:
            com.facebook.aura.sharesheet.HatchShareContent r4 = new com.facebook.aura.sharesheet.HatchShareContent
            r4.<init>(r1, r2)
            return r4
        L38:
            X.Hwg.A00(r1)
            com.facebook.aura.navigation.key.ShareType r1 = r6.shareType
            com.facebook.aura.navigation.key.ShareType r0 = com.facebook.aura.navigation.key.ShareType.IDEA
            if (r1 != r0) goto L4f
            java.lang.String r0 = r6.ideaShareUrl
            if (r0 == 0) goto L86
            java.lang.String r1 = com.facebook.aura.sharesheet.HatchIdeaShareTextKt.ideaShareText(r7, r0)
            com.facebook.aura.sharesheet.HatchShareContent r0 = new com.facebook.aura.sharesheet.HatchShareContent
            r0.<init>(r2, r1)
            return r0
        L4f:
            boolean r0 = r6.getSharesLinkOnly()
            if (r0 == 0) goto L66
            boolean r0 = X.C7BY.A0j(r8)
            if (r0 != 0) goto L86
            if (r8 == 0) goto L86
            if (r9 != 0) goto L60
            r9 = r8
        L60:
            com.facebook.aura.sharesheet.HatchShareContent r4 = new com.facebook.aura.sharesheet.HatchShareContent
            r4.<init>(r2, r9)
            return r4
        L66:
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r6.repository
            android.content.Context r0 = X.AnonymousClass001.A0I(r7)
            r5.L$0 = r2
            r5.L$1 = r2
            r5.L$2 = r9
            r5.label = r3
            java.lang.Object r1 = r1.prepareMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r0, r8, r5)
            if (r1 != r4) goto L25
            return r4
        L7b:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareShareContent$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$prepareShareContent$1
            r5.<init>(r10)
            goto L12
        L81:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L86:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.prepareShareContent(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void shareAvatarCardToInstagramStories(Context context, String str, HatchAvatarStoryPalette hatchAvatarStoryPalette, String str2) {
        shareToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, new HatchAvatarStoryCard(hatchAvatarStoryPalette, str2), Float.valueOf(0.88f), null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareAvatarVideoToFacebookStories(android.content.Context r15, com.facebook.aura.sharesheet.HatchPreparedShareMedia r16, com.facebook.aura.sharesheet.HatchAvatarStoryCard r17, java.lang.String r18, X.HtJ<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.shareAvatarVideoToFacebookStories(android.content.Context, com.facebook.aura.sharesheet.HatchPreparedShareMedia, com.facebook.aura.sharesheet.HatchAvatarStoryCard, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void shareContent(Context context, String str, String str2, HatchShareDestination hatchShareDestination, G0V<? super String, ? super HtJ<? super String>, ? extends Object> g0v, G0V<? super HatchShareContent, ? super HtJ<? super Unit>, ? extends Object> g0v2) {
        HatchShareSheetUiState value;
        boolean z;
        ShareType shareType = this.shareType;
        ShareType shareType2 = ShareType.INVITE;
        if (shareType == shareType2) {
            boolean z2 = !C7BY.A0j(str);
            HatchShareDestination hatchShareDestination2 = AnonymousClass006.A0e(this).loadingDestination;
            StringBuilder sb = new StringBuilder("Invite share requested destination=");
            sb.append(hatchShareDestination);
            sb.append(" payloadAvailable=");
            sb.append(z2);
            CFK.A05("HatchInviteShare", AnonymousClass006.A0y(hatchShareDestination2, " loadingDestination=", sb));
        }
        if (this.shareCancelled || AnonymousClass006.A0e(this).isCheckingEligibility || AnonymousClass006.A0e(this).loadingDestination != null) {
            if (this.shareType == shareType2) {
                CFK.A06("HatchInviteShare", "Invite share ignored because another destination is loading");
                return;
            }
            return;
        }
        C1BN.A01(hatchShareDestination, this);
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            z = false;
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
        if (!hatchShareDestination.isMetaProperty() && AnonymousClass006.A0e(this).isSharingDance) {
            z = true;
        }
        AnonymousClass001.A1J(new C136992(g0v, str, context, str2, hatchShareDestination, g0v2, z, null), AEu.A00(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void shareContent$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, HatchShareDestination hatchShareDestination, G0V g0v, G0V g0v2, int i, Object obj) {
        if ((i & 16) != 0) {
            g0v = null;
        }
        hatchShareSheetViewModel.shareContent(context, str, str2, hatchShareDestination, g0v, g0v2);
    }

    public static /* synthetic */ void shareToFacebookFeed$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        hatchShareSheetViewModel.shareToFacebookFeed(context, str, str2, str3);
    }

    public static /* synthetic */ void shareToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, HatchDanceShare hatchDanceShare, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            hatchDanceShare = null;
        }
        hatchShareSheetViewModel.shareToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, str2, hatchDanceShare);
    }

    private final void shareToInstagram(Context context, String str, HatchShareDestination hatchShareDestination, HatchAvatarStoryCard hatchAvatarStoryCard, Float f, String str2, HatchDanceShare hatchDanceShare) {
        HatchShareSheetUiState value;
        if (this.shareCancelled || AnonymousClass006.A0e(this).isCheckingEligibility || AnonymousClass006.A0e(this).loadingDestination != null) {
            return;
        }
        C1BN.A01(hatchShareDestination, this);
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
        AnonymousClass001.A1J(new C137022(str, context, hatchShareDestination, str2, f, hatchAvatarStoryCard, hatchDanceShare, null), AEu.A00(this));
    }

    public static /* synthetic */ void shareToInstagram$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, HatchShareDestination hatchShareDestination, HatchAvatarStoryCard hatchAvatarStoryCard, Float f, String str2, HatchDanceShare hatchDanceShare, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchAvatarStoryCard = null;
        }
        if ((i & 16) != 0) {
            f = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            hatchDanceShare = null;
        }
        hatchShareSheetViewModel.shareToInstagram(context, str, hatchShareDestination, hatchAvatarStoryCard, f, str2, hatchDanceShare);
    }

    private final boolean shareToInstagramRecipient(Context context, HatchShareRecipient hatchShareRecipient, HatchShareContent hatchShareContent) {
        HatchPreparedShareMedia hatchPreparedShareMedia = hatchShareContent.media;
        if (hatchPreparedShareMedia != null) {
            return HatchShare.INSTANCE.shareMediaToInstagramDirect(context, hatchPreparedShareMedia.uri, hatchPreparedShareMedia.mimeType, hatchShareContent.text, HatchShareSheetViewModelKt.getFoaContactType(hatchShareRecipient), hatchShareRecipient.recipientId);
        }
        String str = hatchShareContent.text;
        if (str != null) {
            return HatchShare.INSTANCE.shareTextToInstagramDirect(context, str, HatchShareSheetViewModelKt.getFoaContactType(hatchShareRecipient), hatchShareRecipient.recipientId);
        }
        return false;
    }

    public static /* synthetic */ void shareToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, HatchAvatarStoryCard hatchAvatarStoryCard, Float f, String str2, HatchDanceShare hatchDanceShare, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchAvatarStoryCard = null;
        }
        if ((i & 8) != 0) {
            f = Float.valueOf(0.88f);
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            hatchDanceShare = null;
        }
        hatchShareSheetViewModel.shareToInstagramStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, hatchAvatarStoryCard, f, str2, hatchDanceShare);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareToMessengerRecipient(android.content.Context r13, com.facebook.aura.sharesheet.HatchShareRecipient r14, com.facebook.aura.sharesheet.HatchShareContent r15, X.HtJ<? super java.lang.Boolean> r16) {
        /*
            r12 = this;
            r3 = r16
            r5 = r15
            r9 = r13
            boolean r0 = r3 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137061
            if (r0 == 0) goto L7c
            r8 = r3
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessengerRecipient$1 r8 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137061) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r8.label = r2
        L16:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r4 = 0
            r6 = 1
            if (r0 == 0) goto L4c
            if (r0 != r6) goto L82
            java.lang.Object r5 = r8.L$2
            com.facebook.aura.sharesheet.HatchShareContent r5 = (com.facebook.aura.sharesheet.HatchShareContent) r5
            java.lang.Object r14 = r8.L$1
            com.facebook.aura.sharesheet.HatchShareRecipient r14 = (com.facebook.aura.sharesheet.HatchShareRecipient) r14
            java.lang.Object r9 = r8.L$0
            android.content.Context r9 = (android.content.Context) r9
            X.Hwg.A00(r1)
        L31:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r1 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r1
            if (r1 == 0) goto L47
            com.facebook.aura.file.actions.HatchShare r8 = com.facebook.aura.file.actions.HatchShare.INSTANCE
            android.net.Uri r10 = r1.uri
            java.lang.String r11 = r1.mimeType
            java.lang.String r12 = r5.text
            java.lang.String r13 = com.facebook.aura.sharesheet.HatchShareSheetViewModelKt.getFoaContactType(r14)
            java.lang.String r14 = r14.recipientId
            boolean r4 = r8.shareMediaToMessenger(r9, r10, r11, r12, r13, r14)
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L4c:
            X.Hwg.A00(r1)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r3 = r15.media
            if (r3 == 0) goto L6b
            com.facebook.aura.sharesheet.HatchShareSheetRepository r2 = r12.repository
            android.content.Context r1 = X.AnonymousClass001.A0I(r13)
            r8.L$0 = r13
            r8.L$1 = r14
            r8.L$2 = r15
            r0 = 0
            r8.L$3 = r0
            r8.label = r6
            java.lang.Object r1 = r2.prepareMessengerRecipientMedia$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r1, r3, r8)
            if (r1 != r7) goto L31
            return r7
        L6b:
            java.lang.String r3 = r15.text
            if (r3 == 0) goto L47
            com.facebook.aura.file.actions.HatchShare r2 = com.facebook.aura.file.actions.HatchShare.INSTANCE
            java.lang.String r1 = com.facebook.aura.sharesheet.HatchShareSheetViewModelKt.getFoaContactType(r14)
            java.lang.String r0 = r14.recipientId
            boolean r4 = r2.shareTextToMessenger(r13, r3, r1, r0)
            goto L47
        L7c:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessengerRecipient$1 r8 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToMessengerRecipient$1
            r8.<init>(r3)
            goto L16
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.shareToMessengerRecipient(android.content.Context, com.facebook.aura.sharesheet.HatchShareRecipient, com.facebook.aura.sharesheet.HatchShareContent, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[PHI: r0 r8 r10
  0x0067: PHI (r0v7 int) = (r0v2 int), (r0v9 int) binds: [B:26:0x005f, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r8v1 android.content.Context) = (r8v0 android.content.Context), (r8v2 android.content.Context) binds: [B:26:0x005f, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r10v1 com.facebook.aura.sharesheet.HatchShareContent) = (r10v0 com.facebook.aura.sharesheet.HatchShareContent), (r10v2 com.facebook.aura.sharesheet.HatchShareContent) binds: [B:26:0x005f, B:28:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareToRecipientApp(android.content.Context r8, com.facebook.aura.sharesheet.HatchShareRecipient r9, com.facebook.aura.sharesheet.HatchShareContent r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137081
            if (r0 == 0) goto L79
            r6 = r11
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipientApp$1 r6 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137081) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L4f
            if (r0 != r3) goto L7f
            int r0 = r6.I$0
            X.Hwg.A00(r1)
            if (r0 == 0) goto L29
        L28:
            r4 = 1
        L29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.sharesheet.HatchShareAppTarget r1 = r9.appTarget
            if (r1 == 0) goto L5f
            int[] r0 = com.facebook.aura.sharesheet.HatchShareSheetViewModel.WhenMappings.$EnumSwitchMapping$0
            int r0 = r1.ordinal()
            if (r0 == r2) goto L61
            if (r0 != r3) goto L5f
            r6.L$0 = r8
            r0 = 0
            r6.L$1 = r0
            r6.L$2 = r10
            r6.label = r2
            java.lang.Object r1 = r7.shareToMessengerRecipient(r8, r9, r10, r6)
            if (r1 != r5) goto L5a
            return r5
        L4f:
            java.lang.Object r10 = r6.L$2
            com.facebook.aura.sharesheet.HatchShareContent r10 = (com.facebook.aura.sharesheet.HatchShareContent) r10
            java.lang.Object r8 = r6.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r1)
        L5a:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            goto L65
        L5f:
            r0 = 0
            goto L67
        L61:
            boolean r0 = r7.shareToInstagramRecipient(r8, r9, r10)
        L65:
            if (r0 != 0) goto L28
        L67:
            r1 = 0
            r6.L$0 = r1
            r6.L$1 = r1
            r6.L$2 = r1
            r6.I$0 = r0
            r6.label = r3
            java.lang.Object r0 = r7.shareToSystem(r8, r10, r6)
            if (r0 != r5) goto L29
            return r5
        L79:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipientApp$1 r6 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToRecipientApp$1
            r6.<init>(r11)
            goto L12
        L7f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.shareToRecipientApp(android.content.Context, com.facebook.aura.sharesheet.HatchShareRecipient, com.facebook.aura.sharesheet.HatchShareContent, X.HtJ):java.lang.Object");
    }

    private final void startDownload(HatchShareDestination hatchShareDestination, G0U<? super HtJ<? super Unit>, ? extends Object> g0u) {
        HatchShareSheetUiState value;
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            C1BN.A01(hatchShareDestination, this);
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, false, false, null, null, false, null, false, 2039, null)));
            AnonymousClass001.A1J(new C137142(g0u, this, hatchShareDestination, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startNetworkRecipientSend(PendingRecipientSend pendingRecipientSend) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiState;
        String key = HatchShareSheetModelsKt.getKey(pendingRecipientSend.recipient);
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchShareSheetUiState = value;
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, null, null, null, false, false, AnonymousClass006.A11(key, HatchRecipientSendState.SENT, hatchShareSheetUiState.recipientSendStates), null, false, null, false, 1983, null)));
        this.repository.launchRecipientSend$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(new C137152(pendingRecipientSend, key, null));
    }

    private final boolean undoRecipientSend(String str) {
        HatchShareSheetUiState value;
        HatchShareSheetUiState hatchShareSheetUiState;
        PendingRecipientSend pendingRecipientSendRemove = this.pendingRecipientSends.remove(str);
        int i = 0;
        if (pendingRecipientSendRemove == null) {
            return false;
        }
        HoC hoC = pendingRecipientSendRemove.delayJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLG<HatchShareSheetUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchShareSheetUiState = value;
        } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(hatchShareSheetUiState, null, null, null, null, false, false, AnonymousClass006.A11(str, HatchRecipientSendState.IDLE, hatchShareSheetUiState.recipientSendStates), null, false, null, false, 1983, null)));
        HatchShareLogging hatchShareLogging = HatchShareLogging.INSTANCE;
        HatchShareRecipient hatchShareRecipient = pendingRecipientSendRemove.recipient;
        Iterator it = AnonymousClass006.A0e(this).data.recipients.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (C7384Etj.areEqual(HatchShareSheetModelsKt.getKey((HatchShareRecipient) it.next()), str)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        hatchShareLogging.logRecipientUndo(hatchShareRecipient, numValueOf.intValue() >= 0 ? numValueOf : null, this.logContext.getValue());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object withoutAudio(android.content.Context r8, com.facebook.aura.sharesheet.HatchShareContent r9, X.HtJ<? super com.facebook.aura.sharesheet.HatchShareContent> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137161
            if (r0 == 0) goto L4d
            r6 = r10
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$withoutAudio$1 r6 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137161) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L53
            java.lang.Object r9 = r6.L$1
            com.facebook.aura.sharesheet.HatchShareContent r9 = (com.facebook.aura.sharesheet.HatchShareContent) r9
            X.Hwg.A00(r2)
        L25:
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r2 = (com.facebook.aura.sharesheet.HatchPreparedShareMedia) r2
            if (r2 == 0) goto L58
            java.lang.String r1 = r9.text
            com.facebook.aura.sharesheet.HatchShareContent r0 = new com.facebook.aura.sharesheet.HatchShareContent
            r0.<init>(r2, r1)
            return r0
        L31:
            X.Hwg.A00(r2)
            com.facebook.aura.sharesheet.HatchPreparedShareMedia r2 = r9.media
            if (r2 == 0) goto L58
            com.facebook.aura.sharesheet.HatchShareSheetRepository r1 = r7.repository
            android.content.Context r0 = X.AnonymousClass001.A0I(r8)
            r6.L$0 = r4
            r6.L$1 = r9
            r6.L$2 = r4
            r6.label = r3
            java.lang.Object r2 = r1.prepareMutedVideo$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(r0, r2, r6)
            if (r2 != r5) goto L25
            return r5
        L4d:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$withoutAudio$1 r6 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$withoutAudio$1
            r6.<init>(r10)
            goto L12
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.withoutAudio(android.content.Context, com.facebook.aura.sharesheet.HatchShareContent, X.HtJ):java.lang.Object");
    }

    public final void cancelShare$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        if (this.requiresShareCancellation) {
            this.shareCancelled = true;
            C27k<? extends IdeaCardShareAttempt> c27k = this.ideaShareRequest;
            if (c27k != null) {
                c27k.A5w(null);
            }
            HoC hoC = this.ideaShareDestinationJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.ideaShareDestinationJob = null;
            C27k<? extends HatchMessageShareAttemptResult> c27k2 = this.messageShareAuthorization;
            if (c27k2 != null) {
                c27k2.A5w(null);
            }
            HoC hoC2 = this.eligibilityCheckJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.eligibilityCheckJob = null;
        }
    }

    public final C1BN<AvatarShareTab> getActiveAvatarTab$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.activeAvatarTab;
    }

    public final C1BN<AvatarSharePages> getAvatarPages$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.avatarPages;
    }

    public final C22I<Unit> getEligibilityCheckFailures$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.eligibilityCheckFailures;
    }

    public final C1BN<HatchShareLogContext> getLogContext$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.logContext;
    }

    public final boolean getRequiresMessageShareReview$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.requiresMessageShareReview;
    }

    public final boolean getRequiresShareCancellation$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet() {
        return this.requiresShareCancellation;
    }

    public final C22I<HatchShareFailure> getSendFailures() {
        return this.sendFailures;
    }

    public final C1BN<HatchShareSheetUiState> getUiState() {
        return this.uiState;
    }

    public final void retryIdeaShare() {
        C27k<? extends IdeaCardShareAttempt> c27k;
        if (this.shareCancelled || (c27k = this.ideaShareRequest) == null || !c27k.AOG() || !this.ideaShareRetryable) {
            return;
        }
        this.ideaShareRequest = requestIdeaShare();
    }

    public final void sendPendingRecipientsImmediately() {
        List<PendingRecipientSend> listA0X = AbstractC0878AGe.A0X(this.pendingRecipientSends.values());
        this.pendingRecipientSends.clear();
        for (PendingRecipientSend pendingRecipientSend : listA0X) {
            AnonymousClass002.A1K(pendingRecipientSend.delayJob);
            startNetworkRecipientSend(pendingRecipientSend);
        }
    }

    public final void shareInviteCardToFacebookStories(Context context, String str) {
        HatchShareSheetUiState value;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        String strFacebookAppPackage = HatchShare.INSTANCE.facebookAppPackage(context);
        HatchShareDestination hatchShareDestination = HatchShareDestination.FACEBOOK_STORIES;
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            C1BN.A01(hatchShareDestination, this);
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, zA1b, zA1b, null, null, zA1b, null, zA1b, 2039, null)));
            AnonymousClass001.A1J(new C137002(context, str, strFacebookAppPackage, null), AEu.A00(this));
        }
    }

    public final void shareToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, String str2, HatchDanceShare hatchDanceShare) {
        HatchShareSheetUiState value;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        String strFacebookAppPackage = HatchShare.INSTANCE.facebookAppPackage(context);
        HatchShareDestination hatchShareDestination = HatchShareDestination.FACEBOOK_STORIES;
        if (AnonymousClass006.A0e(this).loadingDestination == null) {
            C1BN.A01(hatchShareDestination, this);
            BLG<HatchShareSheetUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, HatchShareSheetUiState.copy$default(value, null, null, null, hatchShareDestination, zA1b, zA1b, null, null, zA1b, null, zA1b, 2039, null)));
            AnonymousClass001.A1J(new HatchShareSheetViewModel$shareToFacebookStories$2(this, context, str, str2, strFacebookAppPackage, hatchDanceShare, null), AEu.A00(this));
        }
    }

    private final void fetchRecipients() {
        AnonymousClass001.A1J(new C136861(null), AEu.A00(this));
    }

    private final C27k<IdeaCardShareAttempt> requestIdeaShare() {
        return AnonymousClass001.A10(new C136941(null), AEu.A00(this));
    }

    private final C27k<HatchMessageShareAttemptResult> requestMessageShareAuthorization() {
        return AnonymousClass001.A10(new C136951(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleRecipientSend(Context context, String str, HatchShareRecipient hatchShareRecipient) {
        String key = HatchShareSheetModelsKt.getKey(hatchShareRecipient);
        PendingRecipientSend pendingRecipientSend = new PendingRecipientSend(context, str, hatchShareRecipient);
        this.pendingRecipientSends.put(key, pendingRecipientSend);
        pendingRecipientSend.delayJob = AnonymousClass001.A11(new C136971(key, pendingRecipientSend, null), AEu.A00(this));
    }

    public static /* synthetic */ void shareToThreads$default(HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, HatchDanceShare hatchDanceShare, int i, Object obj) {
        String strA0t = AnonymousClass006.A0t(i, str2);
        if ((i & 8) != 0) {
            hatchDanceShare = hatchShareSheetViewModel.dance;
        }
        hatchShareSheetViewModel.shareToThreads(context, str, strA0t, hatchDanceShare);
    }

    public final void shareAvatarPageToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(Context context, String str, AvatarSharePage avatarSharePage, String str2) {
        HatchAvatarStoryPalette hatchAvatarStoryPalettePaletteAt;
        boolean zA1b = AnonymousClass004.A1b(context, str);
        C7384Etj.A0Y(str2, 3);
        if (avatarSharePage instanceof AvatarSharePage.Dance) {
            shareToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, null, ((AvatarSharePage.Dance) avatarSharePage).dance);
            return;
        }
        if (avatarSharePage instanceof AvatarSharePage.Intro) {
            hatchAvatarStoryPalettePaletteAt = ((AvatarSharePage.Intro) avatarSharePage).palette;
        } else {
            if (avatarSharePage != null) {
                throw new NoWhenBranchMatchedException();
            }
            hatchAvatarStoryPalettePaletteAt = HatchAvatarSharePagesKt.paletteAt(zA1b ? 1 : 0);
        }
        shareAvatarToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, new HatchAvatarStoryCard(hatchAvatarStoryPalettePaletteAt, str2));
    }

    public /* synthetic */ HatchShareSheetViewModel(AbstractC3358CGz abstractC3358CGz, ShareType shareType, boolean z, HatchShareSheetRepository hatchShareSheetRepository, HatchOpenGraphRepository hatchOpenGraphRepository, String str, G0V g0v, G0V g0v2, String str2, HatchShareLogContext hatchShareLogContext, HatchDanceShare hatchDanceShare, int i, C06H c06h) {
        this(abstractC3358CGz, shareType, (i & 4) != 0 ? true : z, (i & 8) != 0 ? HatchShareSheetRepository.Companion.getInstance(abstractC3358CGz) : hatchShareSheetRepository, (i & 16) != 0 ? HatchOpenGraphRepository.Companion.getInstance(abstractC3358CGz) : hatchOpenGraphRepository, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : g0v, (i & 128) != 0 ? null : g0v2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? new HatchShareLogContext(shareType, null, null, false) : hatchShareLogContext, (i & 1024) != 0 ? null : hatchDanceShare);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object shareToSystem(android.content.Context r6, com.facebook.aura.sharesheet.HatchShareContent r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137102
            if (r0 == 0) goto L4c
            r4 = r8
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$2 r4 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel.C137102) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L52
            java.lang.Object r6 = r4.L$0
            android.content.Context r6 = (android.content.Context) r6
            X.Hwg.A00(r3)
        L24:
            r7 = r3
            com.facebook.aura.sharesheet.HatchShareContent r7 = (com.facebook.aura.sharesheet.HatchShareContent) r7
            if (r7 != 0) goto L48
            r5.failMediaProcessing()
        L2c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L2f:
            X.Hwg.A00(r3)
            com.facebook.aura.sharesheet.HatchShareSheetUiState r0 = X.AnonymousClass006.A0e(r5)
            boolean r0 = r0.isSharingDance
            if (r0 == 0) goto L48
            r4.L$0 = r6
            r0 = 0
            r4.L$1 = r0
            r4.label = r1
            java.lang.Object r3 = r5.withoutAudio(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L48:
            r5.launchSystemShare(r6, r7)
            goto L2c
        L4c:
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$2 r4 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$shareToSystem$2
            r4.<init>(r8)
            goto L12
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel.shareToSystem(android.content.Context, com.facebook.aura.sharesheet.HatchShareContent, X.HtJ):java.lang.Object");
    }
}
