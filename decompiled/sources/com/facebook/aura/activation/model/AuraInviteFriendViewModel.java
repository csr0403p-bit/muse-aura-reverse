package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import android.content.Context;
import com.facebook.aura.activation.data.HatchInviteGiftVideo;
import com.facebook.aura.activation.data.HatchInviteReward;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraInviteFriendViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final AuraActivationRepository activationRepository;
    public final SingleFlight loadSingleFlight;
    public HxE<String, String> renderedStoryCardContent;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<AuraInviteFriendViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraInviteFriendViewModel create() {
            return new AuraInviteFriendViewModel(AuraActivationRepository.Companion.getInstance(this.userSession), this.userSession);
        }
    }

    /* loaded from: classes.dex */
    public final class UiState extends C06G {
        public final int completedLoads;
        public final HatchInviteGiftVideo giftVideo;
        public final String inviteCode;
        public final String inviteLink;
        public final boolean isLoading;
        public final HatchInviteReward reward;
        public final String shareText;
        public final boolean showRedeemButton;
        public final boolean showsGift;
        public final String storyCardUri;
        public final String storyShareText;
        public final String subtitle;
        public final String subtitleLinkText;
        public final String subtitleLinkUrl;

        public UiState() {
            this(null, null, null, null, null, null, null, true, null, null, false, true, 0, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.subtitle, uiState.subtitle) || !C7384Etj.areEqual(this.subtitleLinkText, uiState.subtitleLinkText) || !C7384Etj.areEqual(this.subtitleLinkUrl, uiState.subtitleLinkUrl) || !C7384Etj.areEqual(this.inviteCode, uiState.inviteCode) || !C7384Etj.areEqual(this.inviteLink, uiState.inviteLink) || !C7384Etj.areEqual(this.shareText, uiState.shareText) || !C7384Etj.areEqual(this.storyShareText, uiState.storyShareText) || this.showsGift != uiState.showsGift || !C7384Etj.areEqual(this.reward, uiState.reward) || !C7384Etj.areEqual(this.giftVideo, uiState.giftVideo) || this.showRedeemButton != uiState.showRedeemButton || this.isLoading != uiState.isLoading || this.completedLoads != uiState.completedLoads || !C7384Etj.areEqual(this.storyCardUri, uiState.storyCardUri)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, boolean z2, boolean z3, int i, String str8, int i2, Object obj) {
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            String str13 = str6;
            String str14 = str7;
            boolean z4 = z;
            HatchInviteReward hatchInviteReward2 = hatchInviteReward;
            HatchInviteGiftVideo hatchInviteGiftVideo2 = hatchInviteGiftVideo;
            boolean z5 = z2;
            boolean z6 = z3;
            int i3 = i;
            String str15 = str8;
            if ((i2 & 1) != 0) {
                str = uiState.subtitle;
            }
            if ((i2 & 2) != 0) {
                str9 = uiState.subtitleLinkText;
            }
            if ((i2 & 4) != 0) {
                str10 = uiState.subtitleLinkUrl;
            }
            if ((i2 & 8) != 0) {
                str11 = uiState.inviteCode;
            }
            if ((i2 & 16) != 0) {
                str12 = uiState.inviteLink;
            }
            if ((i2 & 32) != 0) {
                str13 = uiState.shareText;
            }
            if ((i2 & 64) != 0) {
                str14 = uiState.storyShareText;
            }
            if ((i2 & 128) != 0) {
                z4 = uiState.showsGift;
            }
            if ((i2 & 256) != 0) {
                hatchInviteReward2 = uiState.reward;
            }
            if ((i2 & 512) != 0) {
                hatchInviteGiftVideo2 = uiState.giftVideo;
            }
            if ((i2 & 1024) != 0) {
                z5 = uiState.showRedeemButton;
            }
            if ((i2 & 2048) != 0) {
                z6 = uiState.isLoading;
            }
            if ((i2 & 4096) != 0) {
                i3 = uiState.completedLoads;
            }
            if ((i2 & 8192) != 0) {
                str15 = uiState.storyCardUri;
            }
            return new UiState(str, str9, str10, str11, str12, str13, str14, z4, hatchInviteReward2, hatchInviteGiftVideo2, z5, z6, i3, str15);
        }

        public final String component1() {
            return this.subtitle;
        }

        public final HatchInviteGiftVideo component10() {
            return this.giftVideo;
        }

        public final boolean component11() {
            return this.showRedeemButton;
        }

        public final boolean component12() {
            return this.isLoading;
        }

        public final int component13() {
            return this.completedLoads;
        }

        public final String component14() {
            return this.storyCardUri;
        }

        public final String component2() {
            return this.subtitleLinkText;
        }

        public final String component3() {
            return this.subtitleLinkUrl;
        }

        public final String component4() {
            return this.inviteCode;
        }

        public final String component5() {
            return this.inviteLink;
        }

        public final String component6() {
            return this.shareText;
        }

        public final String component7() {
            return this.storyShareText;
        }

        public final boolean component8() {
            return this.showsGift;
        }

        public final HatchInviteReward component9() {
            return this.reward;
        }

        public final UiState copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, boolean z2, boolean z3, int i, String str8) {
            return new UiState(str, str2, str3, str4, str5, str6, str7, z, hatchInviteReward, hatchInviteGiftVideo, z2, z3, i, str8);
        }

        public final int getCompletedLoads() {
            return this.completedLoads;
        }

        public final HatchInviteGiftVideo getGiftVideo() {
            return this.giftVideo;
        }

        public final String getInviteCode() {
            return this.inviteCode;
        }

        public final String getInviteLink() {
            return this.inviteLink;
        }

        public final HatchInviteReward getReward() {
            return this.reward;
        }

        public final String getShareText() {
            return this.shareText;
        }

        public final boolean getShowRedeemButton() {
            return this.showRedeemButton;
        }

        public final boolean getShowsGift() {
            return this.showsGift;
        }

        public final String getStoryCardUri() {
            return this.storyCardUri;
        }

        public final String getStoryShareText() {
            return this.storyShareText;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getSubtitleLinkText() {
            return this.subtitleLinkText;
        }

        public final String getSubtitleLinkUrl() {
            return this.subtitleLinkUrl;
        }

        public int hashCode() {
            return ((C0KA.A01(C0KA.A01((((C0KA.A01(((((((((((((AnonymousClass006.A0G(this.subtitle) * 31) + AnonymousClass006.A0G(this.subtitleLinkText)) * 31) + AnonymousClass006.A0G(this.subtitleLinkUrl)) * 31) + AnonymousClass006.A0G(this.inviteCode)) * 31) + AnonymousClass006.A0G(this.inviteLink)) * 31) + AnonymousClass006.A0G(this.shareText)) * 31) + AnonymousClass006.A0G(this.storyShareText)) * 31, this.showsGift) + AnonymousClass006.A0D(this.reward)) * 31) + AnonymousClass006.A0D(this.giftVideo)) * 31, this.showRedeemButton), this.isLoading) + this.completedLoads) * 31) + AnonymousClass005.A0H(this.storyCardUri);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, boolean z2, boolean z3, int i, String str8, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) != 0 ? null : str7, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? null : hatchInviteReward, (i2 & 512) != 0 ? null : hatchInviteGiftVideo, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) == 0 ? z3 : true, (i2 & 4096) == 0 ? i : 0, (i2 & 8192) != 0 ? null : str8);
        }

        public UiState(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, HatchInviteReward hatchInviteReward, HatchInviteGiftVideo hatchInviteGiftVideo, boolean z2, boolean z3, int i, String str8) {
            this.subtitle = str;
            this.subtitleLinkText = str2;
            this.subtitleLinkUrl = str3;
            this.inviteCode = str4;
            this.inviteLink = str5;
            this.shareText = str6;
            this.storyShareText = str7;
            this.showsGift = z;
            this.reward = hatchInviteReward;
            this.giftVideo = hatchInviteGiftVideo;
            this.showRedeemButton = z2;
            this.isLoading = z3;
            this.completedLoads = i;
            this.storyCardUri = str8;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteFriendViewModel", f = "AuraInviteFriendViewModel.kt", l = {103}, m = "generateInviteCode", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteFriendViewModel$generateInviteCode$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraInviteFriendViewModel.this.generateInviteCode(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteFriendViewModel", f = "AuraInviteFriendViewModel.kt", l = {66, 97}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteFriendViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C106741 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C106741(HtJ<? super C106741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraInviteFriendViewModel.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteFriendViewModel$refresh$1", f = "AuraInviteFriendViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteFriendViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C106751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteFriendViewModel$refresh$1$1", f = "AuraInviteFriendViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.activation.model.AuraInviteFriendViewModel$refresh$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00071 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ AuraInviteFriendViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00071(AuraInviteFriendViewModel auraInviteFriendViewModel, HtJ<? super C00071> htJ) {
                super(1, htJ);
                this.this$0 = auraInviteFriendViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C00071(this.this$0, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return new C00071(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    AuraInviteFriendViewModel auraInviteFriendViewModel = this.this$0;
                    this.label = 1;
                    if (auraInviteFriendViewModel.load(this) == enumC10460Hji) {
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

        public C106751(HtJ<? super C106751> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraInviteFriendViewModel.this.new C106751(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraInviteFriendViewModel.this.new C106751(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraInviteFriendViewModel auraInviteFriendViewModel = AuraInviteFriendViewModel.this;
                SingleFlight singleFlight = auraInviteFriendViewModel.loadSingleFlight;
                C00071 c00071 = new C00071(auraInviteFriendViewModel, null);
                this.label = 1;
                if (singleFlight.invoke(Unit.INSTANCE, c00071, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraInviteFriendViewModel$renderStoryCard$1", f = "AuraInviteFriendViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraInviteFriendViewModel$renderStoryCard$1, reason: invalid class name and case insensitive filesystem */
    public final class C106761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $accessCodeMessage;
        public final /* synthetic */ HxE<String, String> $content;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $message;
        public int label;
        public final /* synthetic */ AuraInviteFriendViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106761(Context context, String str, String str2, AuraInviteFriendViewModel auraInviteFriendViewModel, HxE<String, String> hxE, HtJ<? super C106761> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$message = str;
            this.$accessCodeMessage = str2;
            this.this$0 = auraInviteFriendViewModel;
            this.$content = hxE;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106761(this.$context, this.$message, this.$accessCodeMessage, this.this$0, this.$content, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            Object objRender = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objRender);
                HatchInviteStoryImageRenderer hatchInviteStoryImageRenderer = HatchInviteStoryImageRenderer.INSTANCE;
                Context context = this.$context;
                String str = this.$message;
                String str2 = this.$accessCodeMessage;
                this.label = 1;
                objRender = hatchInviteStoryImageRenderer.render(context, str, str2, this);
                if (objRender == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objRender);
            }
            String str3 = (String) objRender;
            if (C7384Etj.areEqual(this.this$0.renderedStoryCardContent, this.$content)) {
                AuraInviteFriendViewModel auraInviteFriendViewModel = this.this$0;
                if (str3 == null) {
                    auraInviteFriendViewModel.renderedStoryCardContent = null;
                } else {
                    BLG<UiState> blg = auraInviteFriendViewModel._uiState;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, null, null, null, false, null, null, false, false, 0, str3, 8191, null)));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106761) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraInviteFriendViewModel(AuraActivationRepository auraActivationRepository, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(auraActivationRepository, abstractC3358CGz);
        this.activationRepository = auraActivationRepository;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(null, null, null, null, null, null, null, zA1a, null, null, false, zA1a, 0, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.loadSingleFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
    }

    public final void renderStoryCard(Context context, String str, String str2) {
        AnonymousClass003.A0u(context, str);
        HxE<String, String> hxEA0r = C3cG.A0r(str, str2);
        if (C7384Etj.areEqual(this.renderedStoryCardContent, hxEA0r)) {
            return;
        }
        this.renderedStoryCardContent = hxEA0r;
        AnonymousClass001.A1J(new C106761(context, str, str2, this, hxEA0r, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[PHI: r7
  0x0036: PHI (r7v1 boolean) = (r7v0 boolean), (r7v4 boolean), (r7v4 boolean) binds: [B:12:0x0028, B:14:0x002d, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateInviteCode(X.HtJ<? super kotlin.Unit> r20) {
        /*
            r19 = this;
            r3 = r20
            boolean r0 = r3 instanceof com.facebook.aura.activation.model.AuraInviteFriendViewModel.AnonymousClass1
            r5 = r19
            if (r0 == 0) goto Lbc
            r4 = r3
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$generateInviteCode$1 r4 = (com.facebook.aura.activation.model.AuraInviteFriendViewModel.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbc
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto Lae
            if (r0 != r1) goto Lc3
            X.Hwg.A00(r3)
        L24:
            com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult r3 = (com.facebook.aura.activation.repo.AuraActivationRepository.GenerateInviteCodeResult) r3
            r2 = 0
            r7 = 0
            if (r3 == 0) goto L36
            r7 = 1
            java.lang.String r0 = r3.code
            if (r0 == 0) goto L36
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L37
        L36:
            r0 = 1
        L37:
            r6 = r0 ^ 1
            if (r3 == 0) goto L46
            java.lang.String r0 = r3.inviteLink
            if (r0 == 0) goto L46
            boolean r1 = X.C7BY.A0j(r0)
            r0 = 0
            if (r1 == 0) goto L47
        L46:
            r0 = 1
        L47:
            r4 = r0 ^ 1
            if (r3 == 0) goto L55
            java.lang.String r0 = r3.shareText
            if (r0 == 0) goto L55
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L56
        L55:
            r2 = 1
        L56:
            r2 = r2 ^ 1
            java.lang.String r0 = "POST /hatch/invite_code/generate completed resultAvailable="
            java.lang.StringBuilder r1 = X.C60O.A10(r0, r7)
            java.lang.String r0 = " codeAvailable="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " inviteLinkAvailable="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " shareTextAvailable="
            java.lang.String r1 = X.C60P.A1P(r0, r1, r2)
            java.lang.String r0 = "HatchInviteShare"
            X.CFK.A05(r0, r1)
            com.facebook.aura.activation.model.HatchInviteLogging r0 = com.facebook.aura.activation.model.HatchInviteLogging.INSTANCE
            r0.logInviteCodeGenerate(r3)
            if (r3 == 0) goto Lab
            X.BLG<com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState> r2 = r5._uiState
        L82:
            java.lang.Object r1 = r2.getValue()
            r4 = r1
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState r4 = (com.facebook.aura.activation.model.AuraInviteFriendViewModel.UiState) r4
            java.lang.String r8 = r3.code
            java.lang.String r9 = r3.inviteLink
            java.lang.String r10 = r3.shareText
            r19 = 16327(0x3fc7, float:2.2879E-41)
            r5 = 0
            r12 = 0
            r6 = r5
            r7 = r5
            r11 = r5
            r13 = r5
            r14 = r5
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r5
            r20 = r5
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$UiState r0 = com.facebook.aura.activation.model.AuraInviteFriendViewModel.UiState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L82
        Lab:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        Lae:
            X.Hwg.A00(r3)
            com.facebook.aura.activation.repo.AuraActivationRepository r0 = r5.activationRepository
            r4.label = r1
            java.lang.Object r3 = r0.generateInviteCode(r4)
            if (r3 != r2) goto L24
            return r2
        Lbc:
            com.facebook.aura.activation.model.AuraInviteFriendViewModel$generateInviteCode$1 r4 = new com.facebook.aura.activation.model.AuraInviteFriendViewModel$generateInviteCode$1
            r4.<init>(r3)
            goto L16
        Lc3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraInviteFriendViewModel.generateInviteCode(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super kotlin.Unit> r29) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraInviteFriendViewModel.load(X.HtJ):java.lang.Object");
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void refresh() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106751(null), AEu.A00(this));
    }
}
