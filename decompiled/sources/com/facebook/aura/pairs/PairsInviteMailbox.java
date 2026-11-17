package com.facebook.aura.pairs;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78W;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.HzS;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.OnDuplicateCall;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PairsInviteMailbox implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final HashMap<String, String> deliveries;
    public final SingleFlight pullFlight;
    public HoC pullTriggers;
    public final HashSet<String> reportedFailures;
    public String reportedTarget;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$decline$1", f = "PairsInviteMailbox.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$decline$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $deliveryId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$deliveryId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsInviteMailbox.this.new AnonymousClass1(this.$deliveryId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsInviteMailbox pairsInviteMailbox = PairsInviteMailbox.this;
                PeerInvitesPath peerInvitesPath = PeerInvitesPath.Decline;
                String str = this.$deliveryId;
                this.label = 1;
                if (pairsInviteMailbox.finish(peerInvitesPath, str, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {396}, m = "finish", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$finish$1, reason: invalid class name and case insensitive filesystem */
    public final class C129161 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C129161(HtJ<? super C129161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.finish(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {396}, m = "finish", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$finish$2, reason: invalid class name */
    public final class AnonymousClass2 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.finish(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {396}, m = PairsPendingLevelStoreKt.STATE_PENDING, v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$pending$1, reason: invalid class name and case insensitive filesystem */
    public final class C129171 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C129171(HtJ<? super C129171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.pending(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {54}, m = "pull", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$pull$1, reason: invalid class name and case insensitive filesystem */
    public final class C129181 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C129181(HtJ<? super C129181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.pull(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$pull$2", f = "PairsInviteMailbox.kt", l = {55, 56}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$pull$2, reason: invalid class name and case insensitive filesystem */
    public final class C129192 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $target;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129192(String str, HtJ<? super C129192> htJ) {
            super(1, htJ);
            this.$target = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return PairsInviteMailbox.this.new C129192(this.$target, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(PairsInviteMailbox.this.userSession);
                this.label = 1;
                if (gateway.awaitConnected(this) == enumC10460Hji) {
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
            PairsInviteMailbox pairsInviteMailbox = PairsInviteMailbox.this;
            String str = this.$target;
            this.label = 2;
            if (pairsInviteMailbox.pullOnce(str, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Unit> htJ) {
            return ((C129192) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE, 184, 195, 214, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE}, m = "pullOnce", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$pullOnce$1, reason: invalid class name and case insensitive filesystem */
    public final class C129201 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C129201(HtJ<? super C129201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.pullOnce(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {392}, m = "send", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$send$1, reason: invalid class name and case insensitive filesystem */
    public final class C129211 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C129211(HtJ<? super C129211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.send(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$send$3", f = "PairsInviteMailbox.kt", l = {115}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$send$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $deliveryId;
        public final /* synthetic */ PairsMintedInvite $invite;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PairsMintedInvite pairsMintedInvite, String str, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$invite = pairsMintedInvite;
            this.$deliveryId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsInviteMailbox.this.new AnonymousClass3(this.$invite, this.$deliveryId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PairsRepository companion = PairsRepository.Companion.getInstance(PairsInviteMailbox.this.userSession);
                String str = this.$invite.inviteId;
                String str2 = this.$deliveryId;
                this.label = 1;
                if (companion.recordDelivery(str, str2, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox", f = "PairsInviteMailbox.kt", l = {403}, m = "sentOnMuseInviteIds", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$sentOnMuseInviteIds$1, reason: invalid class name and case insensitive filesystem */
    public final class C129221 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C129221(HtJ<? super C129221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PairsInviteMailbox.this.sentOnMuseInviteIds(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.PairsInviteMailbox$uploadInvitePhoto$1", f = "PairsInviteMailbox.kt", l = {396}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.PairsInviteMailbox$uploadInvitePhoto$1, reason: invalid class name and case insensitive filesystem */
    public final class C129231 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $expiresAtMs;
        public final /* synthetic */ String $jpegB64;
        public final /* synthetic */ String $signedSha256;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C129231(String str, long j, String str2, HtJ<? super C129231> htJ) {
            super(2, htJ);
            this.$jpegB64 = str;
            this.$expiresAtMs = j;
            this.$signedSha256 = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return PairsInviteMailbox.this.new C129231(this.$jpegB64, this.$expiresAtMs, this.$signedSha256, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PeerInvitesPath peerInvitesPath = PeerInvitesPath.PhotoUpload;
                PeerInvitePhotoUploadJson peerInvitePhotoUploadJson = new PeerInvitePhotoUploadJson(this.$jpegB64, this.$expiresAtMs);
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                RequestType requestType = RequestType.POST;
                C9jH c9jHA0E = AGH.A0E();
                PairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$1 pairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$1 = PairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$1.INSTANCE;
                PairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$2 pairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$2 = PairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 1;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = hatchHttpApi.m1604executeStefiRequestWithjLovISM(pairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$1, pairsInviteMailbox$uploadInvitePhoto$1$invokeSuspend$$inlined$stefiBWLJW6A$default$2, false, peerInvitesPath, peerInvitePhotoUploadJson, requestType, c9jHA0E, true, null, true, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1604executeStefiRequestWithjLovISM = AnonymousClass002.A0j(obj);
            }
            String str2 = this.$signedSha256;
            if ((!(objM1604executeStefiRequestWithjLovISM instanceof C10571Hud)) && (str = ((PeerInvitePhotoUploadResponseJson) objM1604executeStefiRequestWithjLovISM).sha256) != null && str2 != null && !str.equals(str2)) {
                CFK.A06(PairsInviteMailboxKt.TAG, "invite photo digest differs from the signed one");
            }
            Throwable thA00 = HsJ.A00(objM1604executeStefiRequestWithjLovISM);
            if (thA00 != null) {
                CFK.A0H(PairsInviteMailboxKt.TAG, "invite photo upload failed (code=%d)", C60Q.A1Y(PairsInviteMailboxKt.httpCode(thA00)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C129231) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finish(com.facebook.aura.pairs.PeerInvitesPath r12, java.lang.String r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            r6 = r12
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.pairs.PairsInviteMailbox.AnonymousClass2
            if (r0 == 0) goto L82
            r14 = r3
            com.facebook.aura.pairs.PairsInviteMailbox$finish$2 r14 = (com.facebook.aura.pairs.PairsInviteMailbox.AnonymousClass2) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r14.label = r2
        L14:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L47
            if (r0 != r5) goto L88
            java.lang.Object r6 = r14.L$0
            com.facebook.aura.pairs.PeerInvitesPath r6 = (com.facebook.aura.pairs.PeerInvitesPath) r6
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L27:
            java.lang.Throwable r0 = X.HsJ.A00(r0)
            if (r0 == 0) goto L44
            java.lang.String r1 = r6.getValue()
            int r0 = com.facebook.aura.pairs.PairsInviteMailboxKt.httpCode(r0)
            java.lang.Integer r0 = X.C3cG.A0R(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r0}
            java.lang.String r1 = "PairsInviteMailbox"
            java.lang.String r0 = "%s failed (code=%d)"
            X.CFK.A0H(r1, r0, r2)
        L44:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L47:
            X.Hwg.A00(r2)
            com.facebook.aura.pairs.PeerInviteDeliveryIdJson r7 = new com.facebook.aura.pairs.PeerInviteDeliveryIdJson
            r7.<init>(r13)
            com.facebook.aura.network.http.HatchHttpApi r2 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefi-BWLJW6A$default$3 r3 = com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefiBWLJW6A$default$3.INSTANCE
            com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefi-BWLJW6A$default$4 r4 = com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefiBWLJW6A$default$4.INSTANCE
            r14.L$0 = r12
            r11 = 0
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.L$5 = r11
            r14.L$6 = r11
            r14.L$7 = r11
            r14.L$8 = r11
            r14.L$9 = r11
            r14.I$0 = r5
            r14.I$1 = r5
            r14.I$2 = r5
            r14.label = r5
            r10 = r5
            r12 = r5
            r13 = r11
            java.lang.Object r0 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L27
            return r1
        L82:
            com.facebook.aura.pairs.PairsInviteMailbox$finish$2 r14 = new com.facebook.aura.pairs.PairsInviteMailbox$finish$2
            r14.<init>(r3)
            goto L14
        L88:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.finish(com.facebook.aura.pairs.PeerInvitesPath, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void report(String str, String str2, String str3, Integer num, String str4, boolean z) {
        boolean zAdd;
        String str5 = str4;
        int iIntValue = num != null ? num.intValue() : -1;
        if (str4 == null) {
            str5 = "";
        }
        if (!z) {
            CFK.A00(str2, str3, Integer.valueOf(iIntValue), str5, PairsInviteMailboxKt.TAG, "stage=%s outcome=%s status=%d delivery_key=%s");
            return;
        }
        synchronized (this.reportedFailures) {
            if (!C7384Etj.areEqual(this.reportedTarget, str) || this.reportedFailures.size() >= 64) {
                this.reportedTarget = str;
                this.reportedFailures.clear();
            }
            HashSet<String> hashSet = this.reportedFailures;
            StringBuilder sbA0g = C3cG.A0g(str2);
            C60O.A1R("|", str3, sbA0g);
            sbA0g.append(iIntValue);
            zAdd = hashSet.add(C60P.A1M("|", str5, sbA0g));
        }
        if (zAdd) {
            CFK.A0H(PairsInviteMailboxKt.TAG, "stage=%s outcome=%s status=%d delivery_key=%s", str2, str3, Integer.valueOf(iIntValue), str5);
        }
    }

    public final void decline(String str) {
        C7384Etj.A0Y(str, 0);
        if (PairsInviteMailboxKt.isDeliveryId(str)) {
            AnonymousClass001.A1J(new AnonymousClass1(str, null), this.scope);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void restoreDeliveries(List<HxE<String, String>> list) {
        C7384Etj.A0Y(list, 0);
        synchronized (this.deliveries) {
            Iterator<HxE<String, String>> it = list.iterator();
            while (it.hasNext()) {
                HxE hxEA10 = C60Q.A10(it);
                String str = (String) hxEA10.first;
                String str2 = (String) hxEA10.second;
                if (PairsInviteMailboxKt.isDeliveryId(str2)) {
                    this.deliveries.putIfAbsent(str, str2);
                }
            }
        }
    }

    public final void startPullTriggers() {
        synchronized (this) {
            HoC hoC = this.pullTriggers;
            if (hoC == null || !hoC.isActive()) {
                this.pullTriggers = AnonymousClass001.A11(new PairsInviteMailbox$startPullTriggers$1$1(this, null), this.scope);
            }
        }
    }

    public final void uploadInvitePhoto(String str, long j, String str2) {
        C7384Etj.A0Y(str, 0);
        if (PairsInviteMailboxKt.isInvitePhoto(str)) {
            AnonymousClass001.A1J(new C129231(str, j, str2, null), this.scope);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsInboxOutcome.values().length];
            try {
                AnonymousClass002.A13(PairsInboxOutcome.DELIVERED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsInboxOutcome.DECLINE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(PairsInboxOutcome.RETRY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(PairsInboxOutcome.CONTRACT_MISMATCH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String currentTarget() {
        return C60O.A0q(C60O.A0m(HatchGatewayPrefsStore.Companion, this.userSession));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pending(java.lang.String r17, X.HtJ<? super java.util.List<com.facebook.aura.pairs.PeerInvitePendingItemJson>> r18) {
        /*
            r16 = this;
            r6 = r18
            r0 = r17
            boolean r2 = r6 instanceof com.facebook.aura.pairs.PairsInviteMailbox.C129171
            r1 = r16
            if (r2 == 0) goto L72
            r5 = r6
            com.facebook.aura.pairs.PairsInviteMailbox$pending$1 r5 = (com.facebook.aura.pairs.PairsInviteMailbox.C129171) r5
            int r4 = r5.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L72
            int r4 = r4 - r3
            r5.label = r4
        L18:
            java.lang.Object r3 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r2 = r5.label
            r14 = 1
            if (r2 == 0) goto L36
            if (r2 != r14) goto L90
            java.lang.Object r0 = r5.L$0
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = X.AnonymousClass001.A0q(r3)
        L2b:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 != 0) goto L78
            com.facebook.aura.pairs.PeerInvitePendingResponseJson r3 = (com.facebook.aura.pairs.PeerInvitePendingResponseJson) r3
            java.util.List<com.facebook.aura.pairs.PeerInvitePendingItemJson> r4 = r3.items
            return r4
        L36:
            X.Hwg.A00(r3)
            com.facebook.aura.pairs.PeerInvitesPath r10 = com.facebook.aura.pairs.PeerInvitesPath.Pending
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r13 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsInviteMailbox$pending$$inlined$stefi-BWLJW6A$default$1 r7 = com.facebook.aura.pairs.PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$1.INSTANCE
            com.facebook.aura.pairs.PairsInviteMailbox$pending$$inlined$stefi-BWLJW6A$default$2 r8 = com.facebook.aura.pairs.PairsInviteMailbox$pending$$inlined$stefiBWLJW6A$default$2.INSTANCE
            r5.L$0 = r0
            r15 = 0
            r5.L$1 = r15
            r5.L$2 = r15
            r9 = 0
            java.lang.String r11 = ""
            r5.L$3 = r15
            r5.L$4 = r15
            r5.L$5 = r15
            r5.L$6 = r15
            r5.L$7 = r15
            r5.L$8 = r15
            r5.I$0 = r14
            r5.I$1 = r14
            r5.I$2 = r14
            r5.label = r14
            r16 = r14
            r17 = r15
            r18 = r5
            java.lang.Object r3 = r6.m1604executeStefiRequestWithjLovISM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r3 != r4) goto L2b
            return r4
        L72:
            com.facebook.aura.pairs.PairsInviteMailbox$pending$1 r5 = new com.facebook.aura.pairs.PairsInviteMailbox$pending$1
            r5.<init>(r6)
            goto L18
        L78:
            int r3 = com.facebook.aura.pairs.PairsInviteMailboxKt.httpCode(r2)
            r2 = 404(0x194, float:5.66E-43)
            if (r3 == r2) goto L8e
            java.lang.Integer r5 = X.C3cG.A0R(r3)
            r6 = 0
            java.lang.String r3 = "mailbox_read"
            java.lang.String r4 = "failed"
            r7 = r14
            r2 = r0
            r1.report(r2, r3, r4, r5, r6, r7)
        L8e:
            r4 = 0
            return r4
        L90:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.pending(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        X.C3cG.A1H(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        if (X.C7384Etj.areEqual(currentTarget(), r10) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        r11 = com.facebook.aura.pairs.PairsInviteMailboxKt.deliveryKey(r3.delivery_id);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0127, code lost:
    
        r9.L$0 = r10;
        r9.L$1 = r2;
        r9.L$2 = r4;
        r9.L$3 = r6;
        r9.L$4 = r7;
        r9.L$5 = r3;
        r9.L$6 = r11;
        r9.L$7 = null;
        r9.L$8 = null;
        r9.J$0 = r0;
        r9.label = 3;
        r14 = r2.deliverToInbox(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
    
        if (r14 != r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0220, code lost:
    
        return r8;
     */
    /* JADX WARN: Path cross not found for [B:62:0x0184, B:64:0x018a], limit reached: 99 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fc A[EDGE_INSN: B:90:0x01fc->B:82:0x01fc BREAK  A[LOOP:0: B:39:0x00f2->B:94:0x00f2], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01aa -> B:39:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01ad -> B:39:0x00f2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01f9 -> B:39:0x00f2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pullOnce(java.lang.String r22, X.HtJ<? super kotlin.Unit> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.pullOnce(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object cancelDelivery(String str, HtJ<? super Unit> htJ) {
        String strRemove;
        Object objFinish;
        synchronized (this.deliveries) {
            strRemove = this.deliveries.remove(str);
        }
        return (strRemove == null || (objFinish = finish(PeerInvitesPath.Cancel, strRemove, htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objFinish;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        HzS.A04(this.scope.AEA());
        this.pullFlight.clearAndCancelAll();
        synchronized (this.deliveries) {
            this.deliveries.clear();
        }
        synchronized (this.reportedFailures) {
            this.reportedFailures.clear();
            this.reportedTarget = null;
        }
        synchronized (this) {
            this.pullTriggers = null;
        }
    }

    public final Set<String> deliveredInviteIds() {
        Set<String> setA0g;
        synchronized (this.deliveries) {
            Set<String> setKeySet = this.deliveries.keySet();
            C7384Etj.A0U(setKeySet);
            setA0g = AbstractC0878AGe.A0g(setKeySet);
        }
        return setA0g;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pull(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.PairsInviteMailbox.C129181
            if (r0 == 0) goto L3f
            r6 = r8
            com.facebook.aura.pairs.PairsInviteMailbox$pull$1 r6 = (com.facebook.aura.pairs.PairsInviteMailbox.C129181) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            java.lang.String r3 = r7.currentTarget()
            if (r3 == 0) goto L20
            com.facebook.aura.common.coroutines.SingleFlight r2 = r7.pullFlight
            r1 = 0
            com.facebook.aura.pairs.PairsInviteMailbox$pull$2 r0 = new com.facebook.aura.pairs.PairsInviteMailbox$pull$2
            r0.<init>(r3, r1)
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r0 = r2.invoke(r3, r0, r6)
            if (r0 != r5) goto L20
            return r5
        L3f:
            com.facebook.aura.pairs.PairsInviteMailbox$pull$1 r6 = new com.facebook.aura.pairs.PairsInviteMailbox$pull$1
            r6.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.pull(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object send(com.facebook.aura.navigation.key.PairsMuseRecipient r17, com.facebook.aura.pairs.PairsMintedInvite r18, com.facebook.aura.pairs.PairsLevel r19, X.HtJ<? super java.lang.Boolean> r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.send(com.facebook.aura.navigation.key.PairsMuseRecipient, com.facebook.aura.pairs.PairsMintedInvite, com.facebook.aura.pairs.PairsLevel, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sentOnMuseInviteIds(X.HtJ<? super java.util.Set<java.lang.String>> r17) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.sentOnMuseInviteIds(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final PairsInviteMailbox getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (PairsInviteMailbox) abstractC3358CGz.A03(PairsInviteMailbox.class, new PairsInviteMailbox$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PairsInviteMailbox(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C78W.A03();
        this.pullFlight = SingleFlightKt.SingleFlight(abstractC3358CGz, OnDuplicateCall.Join.INSTANCE, false);
        this.deliveries = new HashMap<>();
        this.reportedFailures = C60O.A13();
    }

    private final boolean isCurrent(String str) {
        return C7384Etj.areEqual(currentTarget(), str);
    }

    /* renamed from: stefi-BWLJW6A, reason: not valid java name */
    private final /* synthetic */ <Req, Res> Object m1676stefiBWLJW6A(PeerInvitesPath peerInvitesPath, Req req, boolean z, HtJ<? super HsJ<? extends Res>> htJ) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* renamed from: stefi-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m1677stefiBWLJW6A$default(PairsInviteMailbox pairsInviteMailbox, PeerInvitesPath peerInvitesPath, Object obj, boolean z, HtJ htJ, int i, Object obj2) {
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    public /* synthetic */ PairsInviteMailbox(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object finish(com.facebook.aura.pairs.PeerInvitesPath r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super kotlin.Unit> r19) {
        /*
            r14 = this;
            r7 = r19
            r2 = r18
            r1 = r17
            boolean r0 = r7 instanceof com.facebook.aura.pairs.PairsInviteMailbox.C129161
            r3 = r14
            if (r0 == 0) goto L9e
            r6 = r7
            com.facebook.aura.pairs.PairsInviteMailbox$finish$1 r6 = (com.facebook.aura.pairs.PairsInviteMailbox.C129161) r6
            int r5 = r6.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r4
            if (r0 == 0) goto L9e
            int r5 = r5 - r4
            r6.label = r5
        L19:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r10 = 1
            if (r0 == 0) goto L56
            if (r0 != r10) goto La5
            java.lang.Object r2 = r6.L$3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r6.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = X.AnonymousClass001.A0q(r5)
        L30:
            boolean r4 = r5 instanceof X.C10571Hud
            r0 = r4 ^ 1
            if (r0 == 0) goto L53
            java.lang.String r6 = "ok"
        L38:
            java.lang.Throwable r0 = X.HsJ.A00(r5)
            if (r0 == 0) goto L51
            int r0 = com.facebook.aura.pairs.PairsInviteMailboxKt.httpCode(r0)
            java.lang.Integer r7 = X.C3cG.A0R(r0)
        L46:
            java.lang.String r5 = "mailbox_ack"
            r8 = r2
            r9 = r4
            r4 = r1
            r3.report(r4, r5, r6, r7, r8, r9)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L51:
            r7 = 0
            goto L46
        L53:
            java.lang.String r6 = "failed"
            goto L38
        L56:
            X.Hwg.A00(r5)
            com.facebook.aura.pairs.PeerInviteDeliveryIdJson r12 = new com.facebook.aura.pairs.PeerInviteDeliveryIdJson
            r0 = r16
            r12.<init>(r0)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r14 = X.AGH.A0E()
            com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefi-BWLJW6A$default$1 r8 = com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefiBWLJW6A$default$1.INSTANCE
            com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefi-BWLJW6A$default$2 r9 = com.facebook.aura.pairs.PairsInviteMailbox$finish$$inlined$stefiBWLJW6A$default$2.INSTANCE
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r1
            r6.L$3 = r2
            r6.L$4 = r0
            r6.L$5 = r0
            r6.L$6 = r0
            r6.L$7 = r0
            r6.L$8 = r0
            r6.L$9 = r0
            r6.L$10 = r0
            r6.L$11 = r0
            r6.I$0 = r10
            r6.I$1 = r10
            r6.I$2 = r10
            r6.label = r10
            r11 = r15
            r15 = r10
            r17 = r10
            r18 = r0
            r19 = r6
            r16 = r0
            java.lang.Object r5 = r7.m1604executeStefiRequestWithjLovISM(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r5 != r4) goto L30
            return r4
        L9e:
            com.facebook.aura.pairs.PairsInviteMailbox$finish$1 r6 = new com.facebook.aura.pairs.PairsInviteMailbox$finish$1
            r6.<init>(r7)
            goto L19
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsInviteMailbox.finish(com.facebook.aura.pairs.PeerInvitesPath, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
