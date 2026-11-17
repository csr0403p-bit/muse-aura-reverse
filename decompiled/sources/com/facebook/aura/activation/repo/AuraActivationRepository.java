package com.facebook.aura.activation.repo;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C31u;
import X.C3cG;
import X.C5b2;
import X.C60O;
import X.C7384Etj;
import X.CFK;
import X.Ey9;
import X.G0U;
import X.HtJ;
import X.HxE;
import X.HzP;
import X.InterfaceC7359EnW;
import X.InterfaceC7549F2g;
import android.net.Uri;
import com.facebook.aura.activation.repo.MC;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.wearablebroadcast.MC;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraActivationRepository implements InterfaceC7549F2g {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraActivationRepository.class, "agreementUrl", "getAgreementUrl()Ljava/lang/String;");
    public static final Companion Companion = new Companion();
    public final C31u agreementUrl$delegate;
    public final AbstractC3358CGz userSession;

    /* loaded from: classes.dex */
    public final class DebugResetActivationResult extends C06G {
        public final boolean consentRevoked;
        public final int redemptionsDeleted;
        public final boolean waitlistReset;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DebugResetActivationResult) {
                    DebugResetActivationResult debugResetActivationResult = (DebugResetActivationResult) obj;
                    if (this.waitlistReset != debugResetActivationResult.waitlistReset || this.redemptionsDeleted != debugResetActivationResult.redemptionsDeleted || this.consentRevoked != debugResetActivationResult.consentRevoked) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DebugResetActivationResult copy$default(DebugResetActivationResult debugResetActivationResult, boolean z, int i, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = debugResetActivationResult.waitlistReset;
            }
            if ((i2 & 2) != 0) {
                i = debugResetActivationResult.redemptionsDeleted;
            }
            if ((i2 & 4) != 0) {
                z2 = debugResetActivationResult.consentRevoked;
            }
            return new DebugResetActivationResult(z, i, z2);
        }

        public final boolean component1() {
            return this.waitlistReset;
        }

        public final int component2() {
            return this.redemptionsDeleted;
        }

        public final boolean component3() {
            return this.consentRevoked;
        }

        public final DebugResetActivationResult copy(boolean z, int i, boolean z2) {
            return new DebugResetActivationResult(z, i, z2);
        }

        public final boolean getConsentRevoked() {
            return this.consentRevoked;
        }

        public final int getRedemptionsDeleted() {
            return this.redemptionsDeleted;
        }

        public final boolean getWaitlistReset() {
            return this.waitlistReset;
        }

        public int hashCode() {
            return C0KA.A00((C0KA.A02(this.waitlistReset) + this.redemptionsDeleted) * 31, this.consentRevoked);
        }

        public DebugResetActivationResult(boolean z, int i, boolean z2) {
            this.waitlistReset = z;
            this.redemptionsDeleted = i;
            this.consentRevoked = z2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DebugResetInviteCodeRedemptionsResult extends C06G {
        public final int redemptionsDeleted;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof DebugResetInviteCodeRedemptionsResult) && this.redemptionsDeleted == ((DebugResetInviteCodeRedemptionsResult) obj).redemptionsDeleted);
        }

        public static /* synthetic */ DebugResetInviteCodeRedemptionsResult copy$default(DebugResetInviteCodeRedemptionsResult debugResetInviteCodeRedemptionsResult, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = debugResetInviteCodeRedemptionsResult.redemptionsDeleted;
            }
            return new DebugResetInviteCodeRedemptionsResult(i);
        }

        public final int component1() {
            return this.redemptionsDeleted;
        }

        public final DebugResetInviteCodeRedemptionsResult copy(int i) {
            return new DebugResetInviteCodeRedemptionsResult(i);
        }

        public final int getRedemptionsDeleted() {
            return this.redemptionsDeleted;
        }

        public int hashCode() {
            return this.redemptionsDeleted;
        }

        public DebugResetInviteCodeRedemptionsResult(int i) {
            this.redemptionsDeleted = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class DebugSetWaitlistStatusResult extends C06G {
        public final C5b2 status;
        public final boolean success;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DebugSetWaitlistStatusResult) {
                    DebugSetWaitlistStatusResult debugSetWaitlistStatusResult = (DebugSetWaitlistStatusResult) obj;
                    if (this.status != debugSetWaitlistStatusResult.status || this.success != debugSetWaitlistStatusResult.success) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DebugSetWaitlistStatusResult copy$default(DebugSetWaitlistStatusResult debugSetWaitlistStatusResult, C5b2 c5b2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                c5b2 = debugSetWaitlistStatusResult.status;
            }
            if ((i & 2) != 0) {
                z = debugSetWaitlistStatusResult.success;
            }
            return new DebugSetWaitlistStatusResult(c5b2, z);
        }

        public final C5b2 component1() {
            return this.status;
        }

        public final boolean component2() {
            return this.success;
        }

        public final DebugSetWaitlistStatusResult copy(C5b2 c5b2, boolean z) {
            return new DebugSetWaitlistStatusResult(c5b2, z);
        }

        public final C5b2 getStatus() {
            return this.status;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0D(this.status) * 31, this.success);
        }

        public DebugSetWaitlistStatusResult(C5b2 c5b2, boolean z) {
            this.status = c5b2;
            this.success = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class GenerateInviteCodeResult extends C06G {
        public final String code;
        public final String error;
        public final String inviteLink;
        public final Integer maxUses;
        public final String shareText;
        public final Integer useCount;

        public static /* synthetic */ GenerateInviteCodeResult copy$default(GenerateInviteCodeResult generateInviteCodeResult, String str, Integer num, Integer num2, String str2, String str3, String str4, int i, Object obj) {
            String str5 = str;
            Integer num3 = num;
            Integer num4 = num2;
            String str6 = str2;
            String str7 = str3;
            String str8 = str4;
            if ((i & 1) != 0) {
                str5 = generateInviteCodeResult.code;
            }
            if ((i & 2) != 0) {
                num3 = generateInviteCodeResult.maxUses;
            }
            if ((i & 4) != 0) {
                num4 = generateInviteCodeResult.useCount;
            }
            if ((i & 8) != 0) {
                str6 = generateInviteCodeResult.inviteLink;
            }
            if ((i & 16) != 0) {
                str7 = generateInviteCodeResult.shareText;
            }
            if ((i & 32) != 0) {
                str8 = generateInviteCodeResult.error;
            }
            return new GenerateInviteCodeResult(str5, num3, num4, str6, str7, str8);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof GenerateInviteCodeResult) {
                    GenerateInviteCodeResult generateInviteCodeResult = (GenerateInviteCodeResult) obj;
                    if (!C7384Etj.areEqual(this.code, generateInviteCodeResult.code) || !C7384Etj.areEqual(this.maxUses, generateInviteCodeResult.maxUses) || !C7384Etj.areEqual(this.useCount, generateInviteCodeResult.useCount) || !C7384Etj.areEqual(this.inviteLink, generateInviteCodeResult.inviteLink) || !C7384Etj.areEqual(this.shareText, generateInviteCodeResult.shareText) || !C7384Etj.areEqual(this.error, generateInviteCodeResult.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.code;
        }

        public final Integer component2() {
            return this.maxUses;
        }

        public final Integer component3() {
            return this.useCount;
        }

        public final String component4() {
            return this.inviteLink;
        }

        public final String component5() {
            return this.shareText;
        }

        public final String component6() {
            return this.error;
        }

        public final GenerateInviteCodeResult copy(String str, Integer num, Integer num2, String str2, String str3, String str4) {
            return new GenerateInviteCodeResult(str, num, num2, str2, str3, str4);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getError() {
            return this.error;
        }

        public final String getInviteLink() {
            return this.inviteLink;
        }

        public final Integer getMaxUses() {
            return this.maxUses;
        }

        public final String getShareText() {
            return this.shareText;
        }

        public final Integer getUseCount() {
            return this.useCount;
        }

        public int hashCode() {
            return (((((((((AnonymousClass006.A0G(this.code) * 31) + AnonymousClass006.A0D(this.maxUses)) * 31) + AnonymousClass006.A0D(this.useCount)) * 31) + AnonymousClass006.A0G(this.inviteLink)) * 31) + AnonymousClass006.A0G(this.shareText)) * 31) + AnonymousClass005.A0H(this.error);
        }

        public GenerateInviteCodeResult(String str, Integer num, Integer num2, String str2, String str3, String str4) {
            this.code = str;
            this.maxUses = num;
            this.useCount = num2;
            this.inviteLink = str2;
            this.shareText = str3;
            this.error = str4;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class JoinWaitlistResult extends C06G {
        public final String eligibilityError;
        public final C5b2 status;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof JoinWaitlistResult) {
                    JoinWaitlistResult joinWaitlistResult = (JoinWaitlistResult) obj;
                    if (this.status != joinWaitlistResult.status || !C7384Etj.areEqual(this.eligibilityError, joinWaitlistResult.eligibilityError)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ JoinWaitlistResult copy$default(JoinWaitlistResult joinWaitlistResult, C5b2 c5b2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                c5b2 = joinWaitlistResult.status;
            }
            if ((i & 2) != 0) {
                str = joinWaitlistResult.eligibilityError;
            }
            return new JoinWaitlistResult(c5b2, str);
        }

        public final C5b2 component1() {
            return this.status;
        }

        public final String component2() {
            return this.eligibilityError;
        }

        public final JoinWaitlistResult copy(C5b2 c5b2, String str) {
            return new JoinWaitlistResult(c5b2, str);
        }

        public final String getEligibilityError() {
            return this.eligibilityError;
        }

        public final C5b2 getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (AnonymousClass006.A0D(this.status) * 31) + AnonymousClass005.A0H(this.eligibilityError);
        }

        public JoinWaitlistResult(C5b2 c5b2, String str) {
            this.status = c5b2;
            this.eligibilityError = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ReTosAcceptResult {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ReTosAcceptResult[] $VALUES;
        public static final ReTosAcceptResult ACCEPTED;
        public static final ReTosAcceptResult FAILED;
        public static final ReTosAcceptResult STALE;

        static {
            ReTosAcceptResult reTosAcceptResult = new ReTosAcceptResult("ACCEPTED", 0);
            ACCEPTED = reTosAcceptResult;
            ReTosAcceptResult reTosAcceptResult2 = new ReTosAcceptResult("STALE", 1);
            STALE = reTosAcceptResult2;
            ReTosAcceptResult reTosAcceptResult3 = new ReTosAcceptResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
            FAILED = reTosAcceptResult3;
            ReTosAcceptResult[] reTosAcceptResultArr = {reTosAcceptResult, reTosAcceptResult2, reTosAcceptResult3};
            $VALUES = reTosAcceptResultArr;
            $ENTRIES = C3cG.A0w(reTosAcceptResultArr);
        }

        public static Ey9<ReTosAcceptResult> getEntries() {
            return $ENTRIES;
        }

        public static ReTosAcceptResult valueOf(String str) {
            return (ReTosAcceptResult) Enum.valueOf(ReTosAcceptResult.class, str);
        }

        public static ReTosAcceptResult[] values() {
            return (ReTosAcceptResult[]) $VALUES.clone();
        }

        public ReTosAcceptResult(String str, int i) {
        }
    }

    public final class RedeemInviteCodeResult extends C06G {
        public final String error;
        public final boolean success;
        public final C5b2 waitlistStatus;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RedeemInviteCodeResult) {
                    RedeemInviteCodeResult redeemInviteCodeResult = (RedeemInviteCodeResult) obj;
                    if (this.success != redeemInviteCodeResult.success || this.waitlistStatus != redeemInviteCodeResult.waitlistStatus || !C7384Etj.areEqual(this.error, redeemInviteCodeResult.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ RedeemInviteCodeResult copy$default(RedeemInviteCodeResult redeemInviteCodeResult, boolean z, C5b2 c5b2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = redeemInviteCodeResult.success;
            }
            if ((i & 2) != 0) {
                c5b2 = redeemInviteCodeResult.waitlistStatus;
            }
            if ((i & 4) != 0) {
                str = redeemInviteCodeResult.error;
            }
            return new RedeemInviteCodeResult(z, c5b2, str);
        }

        public final boolean component1() {
            return this.success;
        }

        public final C5b2 component2() {
            return this.waitlistStatus;
        }

        public final String component3() {
            return this.error;
        }

        public final RedeemInviteCodeResult copy(boolean z, C5b2 c5b2, String str) {
            return new RedeemInviteCodeResult(z, c5b2, str);
        }

        public final String getError() {
            return this.error;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public final C5b2 getWaitlistStatus() {
            return this.waitlistStatus;
        }

        public int hashCode() {
            return ((C0KA.A02(this.success) + AnonymousClass006.A0D(this.waitlistStatus)) * 31) + AnonymousClass005.A0H(this.error);
        }

        public RedeemInviteCodeResult(boolean z, C5b2 c5b2, String str) {
            this.success = z;
            this.waitlistStatus = c5b2;
            this.error = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {288}, m = "acceptNdaAgreement", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$acceptNdaAgreement$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.acceptNdaAgreement(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {519}, m = "acceptReTos", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$1, reason: invalid class name and case insensitive filesystem */
    public final class C106811 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C106811(HtJ<? super C106811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.acceptReTos(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {519}, m = "acceptTosConsent", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$1, reason: invalid class name and case insensitive filesystem */
    public final class C106821 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C106821(HtJ<? super C106821> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.acceptTosConsent(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "debugResetActivation", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$1, reason: invalid class name and case insensitive filesystem */
    public final class C106831 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C106831(HtJ<? super C106831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.debugResetActivation(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "debugResetInviteCodeRedemptions", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$1, reason: invalid class name and case insensitive filesystem */
    public final class C106841 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C106841(HtJ<? super C106841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.debugResetInviteCodeRedemptions(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {509}, m = "debugSetWaitlistStatus", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C106851 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C106851(HtJ<? super C106851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.debugSetWaitlistStatus(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "fetchInvitePage", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$1, reason: invalid class name and case insensitive filesystem */
    public final class C106861 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C106861(HtJ<? super C106861> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.fetchInvitePage(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "fetchNdaAgreement", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$1, reason: invalid class name and case insensitive filesystem */
    public final class C106871 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C106871(HtJ<? super C106871> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.fetchNdaAgreement(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "fetchTosMetadata", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$fetchTosMetadata$1, reason: invalid class name and case insensitive filesystem */
    public final class C106881 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C106881(HtJ<? super C106881> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.fetchTosMetadata(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "generateInviteCode", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C106891 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C106891(HtJ<? super C106891> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.generateInviteCode(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {519}, m = "joinWaitlist", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$1, reason: invalid class name and case insensitive filesystem */
    public final class C106901 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C106901(HtJ<? super C106901> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.joinWaitlist(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {519}, m = "redeemInviteCode", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$1, reason: invalid class name and case insensitive filesystem */
    public final class C106911 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C106911(HtJ<? super C106911> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.redeemInviteCode(null, false, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.repo.AuraActivationRepository", f = "AuraActivationRepository.kt", l = {253}, m = "refreshTosStatus", v = 2)
    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$refreshTosStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C106921 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C106921(HtJ<? super C106921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationRepository.this.refreshTosStatus(this);
        }
    }

    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$updateHasRedeemedInviteCode$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C106931 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public static final C106931 INSTANCE = new C106931();

        public C106931() {
            super(1);
        }

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, true, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16777151, null);
        }
    }

    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$updateLocalHasAcceptedTos$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C106941 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public final /* synthetic */ boolean $hasAcceptedTos;

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, false, this.$hasAcceptedTos, null, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16777087, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106941(boolean z) {
            super(1);
            this.$hasAcceptedTos = z;
        }
    }

    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$updateLocalIsNdaRequired$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C106951 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public final /* synthetic */ boolean $isNdaRequired;

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, null, false, false, null, null, false, false, this.$isNdaRequired, null, false, null, null, null, null, null, null, null, null, null, 16773119, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106951(boolean z) {
            super(1);
            this.$isNdaRequired = z;
        }
    }

    /* renamed from: com.facebook.aura.activation.repo.AuraActivationRepository$updateLocalWaitlistStatus$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C106961 extends AbstractC7559F3s implements G0U<AuraUserData, AuraUserData> {
        public final /* synthetic */ C5b2 $newStatus;

        @Override // X.G0U
        public final AuraUserData invoke(AuraUserData auraUserData) {
            C7384Etj.A0Y(auraUserData, 0);
            return AuraUserData.copy$default(auraUserData, null, null, null, null, null, this.$newStatus, false, false, null, null, false, false, false, null, false, null, null, null, null, null, null, null, null, null, 16777183, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106961(C5b2 c5b2) {
            super(1);
            this.$newStatus = c5b2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptReTos(java.lang.String r14, X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.ReTosAcceptResult> r15) {
        /*
            r13 = this;
            r3 = r15
            boolean r0 = r15 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106811
            if (r0 == 0) goto L62
            r15 = r3
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$1 r15 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106811) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r15.label = r2
        L13:
            java.lang.Object r3 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r15.label
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L7d
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L22:
            java.lang.Throwable r2 = X.HsJ.A00(r0)
            if (r2 != 0) goto L6b
            com.facebook.aura.activation.repo.SuccessResponseJson r0 = (com.facebook.aura.activation.repo.SuccessResponseJson) r0
            boolean r0 = r0.success
            if (r0 == 0) goto L68
            com.facebook.aura.activation.repo.AuraActivationRepository$ReTosAcceptResult r2 = com.facebook.aura.activation.repo.AuraActivationRepository.ReTosAcceptResult.ACCEPTED
            return r2
        L31:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$AcceptTos r7 = com.facebook.aura.network.api.StefiHatchPath.AcceptTos.INSTANCE
            r12 = 0
            com.facebook.aura.activation.repo.AcceptTosRequestJson r8 = new com.facebook.aura.activation.repo.AcceptTosRequestJson
            r8.<init>(r12, r12, r14)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$$inlined$executeStefiRequest-tZkwj4A$default$1 r4 = com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$$inlined$executeStefiRequest-tZkwj4A$default$2 r5 = com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r6 = 0
            r15.L$0 = r12
            r15.L$1 = r12
            r15.L$2 = r12
            r15.L$3 = r12
            r15.L$4 = r12
            r15.L$5 = r12
            r15.I$0 = r6
            r15.I$1 = r6
            r15.label = r0
            r11 = r6
            r13 = r6
            r14 = r12
            java.lang.Object r0 = r3.m1604executeStefiRequestWithjLovISM(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r0 != r2) goto L22
            return r2
        L62:
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$1 r15 = new com.facebook.aura.activation.repo.AuraActivationRepository$acceptReTos$1
            r15.<init>(r3)
            goto L13
        L68:
            com.facebook.aura.activation.repo.AuraActivationRepository$ReTosAcceptResult r2 = com.facebook.aura.activation.repo.AuraActivationRepository.ReTosAcceptResult.STALE
            return r2
        L6b:
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "acceptReTos failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AuraActivationRepository"
            X.CFK.A08(r0, r1, r2)
            com.facebook.aura.activation.repo.AuraActivationRepository$ReTosAcceptResult r2 = com.facebook.aura.activation.repo.AuraActivationRepository.ReTosAcceptResult.FAILED
            return r2
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.acceptReTos(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object debugResetActivation(X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.DebugResetActivationResult> r14) {
        /*
            r13 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106831
            if (r0 == 0) goto L59
            r14 = r3
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$1 r14 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106831) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r14.label
            r0 = 1
            if (r1 == 0) goto L36
            if (r1 != r0) goto L61
            java.lang.Object r3 = X.AnonymousClass001.A0q(r2)
        L22:
            java.lang.Throwable r0 = X.HsJ.A00(r3)
            if (r0 != 0) goto L5f
            com.facebook.aura.activation.repo.DebugResetActivationResponseJson r3 = (com.facebook.aura.activation.repo.DebugResetActivationResponseJson) r3
            boolean r2 = r3.waitlist_reset
            int r1 = r3.redemptions_deleted
            boolean r0 = r3.consent_revoked
            com.facebook.aura.activation.repo.AuraActivationRepository$DebugResetActivationResult r4 = new com.facebook.aura.activation.repo.AuraActivationRepository$DebugResetActivationResult
            r4.<init>(r2, r1, r0)
            return r4
        L36:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r2)
            com.facebook.aura.network.api.StefiHatchPath$DebugResetActivation r8 = com.facebook.aura.network.api.StefiHatchPath.DebugResetActivation.INSTANCE
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$$inlined$executeStefiRequest-bMdYcbs$default$1 r6 = com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r7 = 0
            r10 = 0
            r14.L$0 = r10
            r14.L$1 = r10
            r14.L$2 = r10
            r14.L$3 = r10
            r14.L$4 = r10
            r14.label = r0
            r11 = r10
            r13 = r12
            java.lang.Object r3 = r5.m1596executeBodylessStefiRequestWithtZkwj4A(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r4) goto L22
            return r4
        L59:
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$1 r14 = new com.facebook.aura.activation.repo.AuraActivationRepository$debugResetActivation$1
            r14.<init>(r3)
            goto L13
        L5f:
            r4 = 0
            return r4
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.debugResetActivation(X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object acceptTosConsent$default(AuraActivationRepository auraActivationRepository, String str, String str2, HtJ htJ, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return auraActivationRepository.acceptTosConsent(str, str2, htJ);
    }

    private final String getAgreementUrl() {
        return (String) this.agreementUrl$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final HxE<String, String> parseAgreementIds() {
        try {
            List<String> pathSegments = Uri.parse(getAgreementUrl()).getPathSegments();
            if (pathSegments.size() >= 2) {
                return C3cG.A0r(pathSegments.get(pathSegments.size() - 2), pathSegments.get(C60O.A00(pathSegments)));
            }
            CFK.A04(AuraActivationRepositoryKt.TAG, "hatch_agreement_url missing recipient_view_id/nonce_code segments");
            return null;
        } catch (Exception e) {
            CFK.A08(AuraActivationRepositoryKt.TAG, "Failed to parse hatch_agreement_url", e);
            return null;
        }
    }

    private final void updateHasRedeemedInviteCode(RedeemInviteCodeResult redeemInviteCodeResult) {
        try {
            AuraViewerDataProvider.Companion.getInstance(this.userSession).atomicUpdate(C106931.INSTANCE);
        } catch (Exception e) {
            CFK.A08(AuraActivationRepositoryKt.TAG, "Failed to update hasRedeemedInviteCode", e);
        }
    }

    private final void updateLocalHasAcceptedTos(boolean z) {
        try {
            AuraViewerDataProvider.Companion.getInstance(this.userSession).atomicUpdate(new C106941(z));
        } catch (Exception e) {
            CFK.A08(AuraActivationRepositoryKt.TAG, "Failed to update local TOS consent", e);
        }
    }

    private final void updateLocalIsNdaRequired(boolean z) {
        try {
            AuraViewerDataProvider.Companion.getInstance(this.userSession).atomicUpdate(new C106951(z));
        } catch (Exception e) {
            CFK.A08(AuraActivationRepositoryKt.TAG, "Failed to update local NDA required", e);
        }
    }

    private final void updateLocalWaitlistStatus(C5b2 c5b2) {
        try {
            AuraViewerDataProvider.Companion.getInstance(this.userSession).atomicUpdate(new C106961(c5b2));
        } catch (Exception e) {
            CFK.A08(AuraActivationRepositoryKt.TAG, "Failed to update local waitlist status", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc A[Catch: CancellationException -> 0x00db, Exception -> 0x00dd, TRY_ENTER, TryCatch #0 {Exception -> 0x00dd, blocks: (B:12:0x002e, B:21:0x0088, B:23:0x008f, B:25:0x0095, B:28:0x009d, B:39:0x00cc, B:41:0x00d6, B:18:0x0049), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6 A[Catch: CancellationException -> 0x00db, Exception -> 0x00dd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00dd, blocks: (B:12:0x002e, B:21:0x0088, B:23:0x008f, B:25:0x0095, B:28:0x009d, B:39:0x00cc, B:41:0x00d6, B:18:0x0049), top: B:50:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptNdaAgreement(java.lang.String r19, java.lang.String r20, X.HtJ<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.acceptNdaAgreement(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptTosConsent(java.lang.String r15, java.lang.String r16, X.HtJ<? super java.lang.Boolean> r17) {
        /*
            r14 = this;
            r5 = r17
            boolean r0 = r5 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106821
            r3 = r14
            if (r0 == 0) goto L71
            r4 = r5
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$1 r4 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106821) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r1 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r8 = 0
            r13 = 1
            if (r0 == 0) goto L3b
            if (r0 != r13) goto L77
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L25:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L39
            com.facebook.aura.activation.repo.SuccessResponseJson r1 = (com.facebook.aura.activation.repo.SuccessResponseJson) r1
            boolean r0 = r1.success
            if (r0 == 0) goto L34
            r3.updateLocalHasAcceptedTos(r13)
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L39:
            r0 = 0
            goto L34
        L3b:
            com.facebook.aura.network.http.HatchHttpApi r5 = X.C60O.A06(r1)
            com.facebook.aura.network.api.StefiHatchPath$AcceptTos r9 = com.facebook.aura.network.api.StefiHatchPath.AcceptTos.INSTANCE
            r14 = 0
            com.facebook.aura.activation.repo.AcceptTosRequestJson r10 = new com.facebook.aura.activation.repo.AcceptTosRequestJson
            r0 = r16
            r10.<init>(r15, r0, r14)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r12 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$$inlined$executeStefiRequest-tZkwj4A$default$1 r6 = com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$$inlined$executeStefiRequest-tZkwj4A$default$2 r7 = com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r4.L$0 = r14
            r4.L$1 = r14
            r4.L$2 = r14
            r4.L$3 = r14
            r4.L$4 = r14
            r4.L$5 = r14
            r4.L$6 = r14
            r4.I$0 = r13
            r4.I$1 = r8
            r4.label = r13
            r15 = r8
            r16 = r14
            r17 = r4
            java.lang.Object r1 = r5.m1604executeStefiRequestWithjLovISM(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != r2) goto L25
            return r2
        L71:
            com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$1 r4 = new com.facebook.aura.activation.repo.AuraActivationRepository$acceptTosConsent$1
            r4.<init>(r5)
            goto L15
        L77:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.acceptTosConsent(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object debugResetInviteCodeRedemptions(X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.DebugResetInviteCodeRedemptionsResult> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106841
            if (r0 == 0) goto L54
            r12 = r14
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$1 r12 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106841) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L5c
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L5a
            com.facebook.aura.activation.repo.DebugResetInviteCodeRedemptionResponseJson r1 = (com.facebook.aura.activation.repo.DebugResetInviteCodeRedemptionResponseJson) r1
            int r0 = r1.redemptions_deleted
            com.facebook.aura.activation.repo.AuraActivationRepository$DebugResetInviteCodeRedemptionsResult r2 = new com.facebook.aura.activation.repo.AuraActivationRepository$DebugResetInviteCodeRedemptionsResult
            r2.<init>(r0)
            return r2
        L31:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$DebugResetInviteCodeRedemption r6 = com.facebook.aura.network.api.StefiHatchPath.DebugResetInviteCodeRedemption.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r1 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L21
            return r2
        L54:
            com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$1 r12 = new com.facebook.aura.activation.repo.AuraActivationRepository$debugResetInviteCodeRedemptions$1
            r12.<init>(r14)
            goto L12
        L5a:
            r2 = 0
            return r2
        L5c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.debugResetInviteCodeRedemptions(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object debugSetWaitlistStatus(X.C5b2 r9, boolean r10, X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.DebugSetWaitlistStatusResult> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106851
            if (r0 == 0) goto L21
            r5 = r11
            com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$1 r5 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106851) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L27
            boolean r10 = r5.Z$0
            goto L64
        L21:
            com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$1 r5 = new com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$1
            r5.<init>(r11)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r4)
            com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationImpl$Builder r1 = new com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationImpl$Builder     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r1.<init>()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            java.lang.String r0 = r9.name()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutation$Builder r0 = r1.setStatus(r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            X.DY5 r6 = r0.build()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r5.L$0 = r3     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r5.L$1 = r6     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r5.Z$0 = r10     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r5.label = r2     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            X.GBL r5 = X.C7Bm.A04(r5)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            com.facebook.aura.graphql.AuraGraphQLService r4 = com.facebook.aura.graphql.AuraGraphQLService.INSTANCE     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            X.CGz r2 = r8.userSession     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$response$1$1 r1 = new com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$response$1$1     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r1.<init>()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$response$1$2 r0 = new com.facebook.aura.activation.repo.AuraActivationRepository$debugSetWaitlistStatus$response$1$2     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r0.<init>()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r4.execute(r2, r6, r1, r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            java.lang.Object r4 = r5.A0F()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            if (r4 != r7) goto L67
            return r7
        L64:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
        L67:
            com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationResponse r4 = (com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationResponse) r4     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationResponse$XabDebugSetHatchWaitlistStatus r0 = r4.getXabDebugSetHatchWaitlistStatus$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            if (r0 == 0) goto L87
            X.5b2 r1 = r0.getStatus$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
        L73:
            com.facebook.aura.activation.repo.AuraDebugSetHatchWaitlistStatusMutationResponse$XabDebugSetHatchWaitlistStatus r0 = r4.getXabDebugSetHatchWaitlistStatus$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            if (r0 == 0) goto L85
            boolean r0 = r0.getSuccess$fbandroid_express_aura_java_com_facebook_aura_activation_repo_repo()     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
        L7d:
            com.facebook.aura.activation.repo.AuraActivationRepository$DebugSetWaitlistStatusResult r7 = new com.facebook.aura.activation.repo.AuraActivationRepository$DebugSetWaitlistStatusResult     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r7.<init>(r1, r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            boolean r0 = r7.success     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            goto L89
        L85:
            r0 = 0
            goto L7d
        L87:
            r1 = r3
            goto L73
        L89:
            if (r0 == 0) goto L92
            if (r10 == 0) goto L92
            X.5b2 r0 = r7.status     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
            r8.updateLocalWaitlistStatus(r0)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> La4
        L92:
            return r7
        L93:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "AuraDebugSetHatchWaitlistStatusMutation failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AuraActivationRepository"
            X.CFK.A08(r0, r1, r2)
            return r3
        La4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.debugSetWaitlistStatus(X.5b2, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchInvitePage(X.HtJ<? super com.facebook.aura.activation.data.HatchInvitePage> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106861
            if (r0 == 0) goto L51
            r12 = r14
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$1 r12 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106861) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L2e
            if (r1 != r0) goto L59
            java.lang.Object r1 = X.AnonymousClass001.A0q(r3)
        L21:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L57
            com.facebook.aura.activation.repo.InvitePageResponseJson r1 = (com.facebook.aura.activation.repo.InvitePageResponseJson) r1
            com.facebook.aura.activation.data.HatchInvitePage r2 = r1.toDomain()
            return r2
        L2e:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.network.api.StefiHatchPath$Invite r6 = com.facebook.aura.network.api.StefiHatchPath.Invite.INSTANCE
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r1 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r1 != r2) goto L21
            return r2
        L51:
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$1 r12 = new com.facebook.aura.activation.repo.AuraActivationRepository$fetchInvitePage$1
            r12.<init>(r14)
            goto L12
        L57:
            r2 = 0
            return r2
        L59:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.fetchInvitePage(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchNdaAgreement(X.HtJ<? super com.facebook.aura.activation.data.HatchNdaAgreement> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106871
            if (r0 == 0) goto L68
            r13 = r15
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$1 r13 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106871) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r13.label = r2
        L12:
            java.lang.Object r1 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r9 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L6f
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L22:
            java.lang.Throwable r0 = X.HsJ.A00(r1)
            if (r0 != 0) goto L6e
            com.facebook.aura.activation.repo.NdaAgreementResponseJson r1 = (com.facebook.aura.activation.repo.NdaAgreementResponseJson) r1
            com.facebook.aura.activation.data.HatchNdaAgreement r0 = r1.toDomain()
            return r0
        L2f:
            X.Hwg.A00(r1)
            X.HxE r0 = r14.parseAgreementIds()
            if (r0 != 0) goto L39
            return r9
        L39:
            A r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            B r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.StefiHatchPath$OneClickAgreement r7 = new com.facebook.aura.network.api.StefiHatchPath$OneClickAgreement
            r7.<init>(r1, r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r11 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequest-bMdYcbs$default$1 r5 = com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r13.L$0 = r9
            r13.L$1 = r9
            r13.L$2 = r9
            r13.L$3 = r9
            r13.L$4 = r9
            r13.L$5 = r9
            r13.L$6 = r9
            r13.label = r2
            r6 = 0
            r10 = r9
            r12 = r11
            java.lang.Object r1 = r4.m1596executeBodylessStefiRequestWithtZkwj4A(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r1 != r3) goto L22
            return r3
        L68:
            com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$1 r13 = new com.facebook.aura.activation.repo.AuraActivationRepository$fetchNdaAgreement$1
            r13.<init>(r15)
            goto L12
        L6e:
            return r9
        L6f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.fetchNdaAgreement(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchTosMetadata(X.HtJ<? super com.facebook.aura.activation.data.HatchTosMetadata> r16) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.fetchTosMetadata(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateInviteCode(X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.GenerateInviteCodeResult> r17) {
        /*
            r16 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106891
            if (r0 == 0) goto L62
            r10 = r3
            com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$1 r10 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106891) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r10.label = r2
        L14:
            java.lang.Object r2 = r10.result
            X.Hji r11 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r0 = 1
            if (r1 == 0) goto L3f
            if (r1 != r0) goto L8d
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L23:
            java.lang.Throwable r2 = X.HsJ.A00(r0)
            if (r2 != 0) goto L6a
            com.facebook.aura.activation.repo.GenerateInviteCodeResponseJson r0 = (com.facebook.aura.activation.repo.GenerateInviteCodeResponseJson) r0
            java.lang.String r12 = r0.code
            java.lang.Integer r13 = r0.max_uses
            java.lang.Integer r14 = r0.use_count
            java.lang.String r15 = r0.invite_link
            java.lang.String r0 = r0.share_text
            r17 = 0
            com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult r11 = new com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L3f:
            com.facebook.aura.network.http.HatchHttpApi r1 = X.C60O.A06(r2)
            com.facebook.aura.network.api.StefiHatchPath$InviteCodeGenerate r4 = com.facebook.aura.network.api.StefiHatchPath.InviteCodeGenerate.INSTANCE
            com.facebook.aura.network.http.RequestType r5 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r8 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$$inlined$executeStefiRequest-bMdYcbs$default$1 r2 = com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r3 = 0
            r6 = 0
            r10.L$0 = r6
            r10.L$1 = r6
            r10.L$2 = r6
            r10.L$3 = r6
            r10.L$4 = r6
            r10.label = r0
            r7 = r6
            r9 = r8
            java.lang.Object r0 = r1.m1596executeBodylessStefiRequestWithtZkwj4A(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r11) goto L23
            return r11
        L62:
            com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$1 r10 = new com.facebook.aura.activation.repo.AuraActivationRepository$generateInviteCode$1
            r0 = r16
            r10.<init>(r3)
            goto L14
        L6a:
            boolean r0 = r2 instanceof com.facebook.aura.json.NetworkException
            r12 = 0
            if (r0 == 0) goto L7d
            com.facebook.aura.json.NetworkException r2 = (com.facebook.aura.json.NetworkException) r2
            if (r2 == 0) goto L7d
            int r1 = r2.httpResponseCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r1) goto L7e
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L7e
        L7d:
            return r12
        L7e:
            java.lang.String r17 = r2.getMessage()
            com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult r11 = new com.facebook.aura.activation.repo.AuraActivationRepository$GenerateInviteCodeResult
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17)
            return r11
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.generateInviteCode(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object joinWaitlist(java.lang.String r16, X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.JoinWaitlistResult> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106901
            if (r0 == 0) goto L72
            r14 = r3
            com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$1 r14 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106901) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r14.label = r2
        L14:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r10 = 1
            if (r0 == 0) goto L3e
            if (r0 != r10) goto L7a
            java.lang.Object r3 = X.AnonymousClass001.A0q(r2)
        L23:
            java.lang.Throwable r0 = X.HsJ.A00(r3)
            if (r0 != 0) goto L78
            com.facebook.aura.activation.repo.JoinWaitlistResponseJson r3 = (com.facebook.aura.activation.repo.JoinWaitlistResponseJson) r3
            java.lang.String r0 = r3.status
            X.5b2 r2 = com.facebook.aura.activation.repo.AuraActivationRepositoryJsonKt.toWaitlistStatusOrNull(r0)
            java.lang.String r0 = r3.eligibility_error
            com.facebook.aura.activation.repo.AuraActivationRepository$JoinWaitlistResult r1 = new com.facebook.aura.activation.repo.AuraActivationRepository$JoinWaitlistResult
            r1.<init>(r2, r0)
            X.5b2 r0 = r1.status
            r15.updateLocalWaitlistStatus(r0)
            return r1
        L3e:
            com.facebook.aura.network.http.HatchHttpApi r2 = X.C60O.A06(r2)
            com.facebook.aura.network.api.StefiHatchPath$WaitlistJoin r6 = com.facebook.aura.network.api.StefiHatchPath.WaitlistJoin.INSTANCE
            java.lang.String r0 = X.AnonymousClass001.A0u(r16)
            com.facebook.aura.activation.repo.JoinWaitlistRequestJson r7 = new com.facebook.aura.activation.repo.JoinWaitlistRequestJson
            r7.<init>(r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r5 = 0
            r11 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.L$5 = r11
            r14.I$0 = r10
            r14.I$1 = r5
            r14.label = r10
            r12 = r5
            r13 = r11
            java.lang.Object r3 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r3 != r1) goto L23
            return r1
        L72:
            com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$1 r14 = new com.facebook.aura.activation.repo.AuraActivationRepository$joinWaitlist$1
            r14.<init>(r3)
            goto L14
        L78:
            r1 = 0
            return r1
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.joinWaitlist(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object redeemInviteCode(java.lang.String r15, boolean r16, boolean r17, X.HtJ<? super com.facebook.aura.activation.repo.AuraActivationRepository.RedeemInviteCodeResult> r18) {
        /*
            r14 = this;
            r3 = r16
            r2 = r17
            r7 = r18
            boolean r0 = r7 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106911
            r4 = r14
            if (r0 == 0) goto L7e
            r5 = r7
            com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$1 r5 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106911) r5
            int r6 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r1
            if (r0 == 0) goto L7e
            int r6 = r6 - r1
            r5.label = r6
        L19:
            java.lang.Object r6 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r9 = 0
            r14 = 1
            if (r0 == 0) goto L47
            if (r0 != r14) goto Lab
            boolean r2 = r5.Z$1
            boolean r3 = r5.Z$0
            java.lang.Object r0 = X.AnonymousClass001.A0q(r6)
        L2d:
            java.lang.Throwable r6 = X.HsJ.A00(r0)
            r5 = 0
            if (r6 != 0) goto L84
            com.facebook.aura.activation.repo.RedeemInviteCodeResponseJson r0 = (com.facebook.aura.activation.repo.RedeemInviteCodeResponseJson) r0
            java.lang.String r0 = r0.waitlist_status
            X.5b2 r0 = com.facebook.aura.activation.repo.AuraActivationRepositoryJsonKt.toWaitlistStatusOrNull(r0)
            com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult r1 = new com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult
            r1.<init>(r14, r0, r5)
            if (r3 == 0) goto L46
            r4.updateHasRedeemedInviteCode(r1)
        L46:
            return r1
        L47:
            com.facebook.aura.network.http.HatchHttpApi r6 = X.C60O.A06(r6)
            com.facebook.aura.network.api.StefiHatchPath$InviteCodeRedeem r10 = com.facebook.aura.network.api.StefiHatchPath.InviteCodeRedeem.INSTANCE
            com.facebook.aura.activation.repo.RedeemInviteCodeRequestJson r11 = new com.facebook.aura.activation.repo.RedeemInviteCodeRequestJson
            r11.<init>(r15)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r13 = X.C9jH.A00
            com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$$inlined$executeStefiRequest-tZkwj4A$default$1 r7 = com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$$inlined$executeStefiRequest-tZkwj4A$default$2 r8 = com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r15 = 0
            r5.L$0 = r15
            r5.L$1 = r15
            r5.L$2 = r15
            r5.L$3 = r15
            r5.L$4 = r15
            r5.L$5 = r15
            r5.Z$0 = r3
            r5.Z$1 = r2
            r5.I$0 = r14
            r5.I$1 = r9
            r5.label = r14
            r16 = r9
            r17 = r15
            r18 = r5
            java.lang.Object r0 = r6.m1604executeStefiRequestWithjLovISM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r1) goto L2d
            return r1
        L7e:
            com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$1 r5 = new com.facebook.aura.activation.repo.AuraActivationRepository$redeemInviteCode$1
            r5.<init>(r7)
            goto L19
        L84:
            boolean r0 = r6 instanceof com.facebook.aura.json.NetworkException
            if (r0 == 0) goto L96
            com.facebook.aura.json.NetworkException r6 = (com.facebook.aura.json.NetworkException) r6
            if (r6 == 0) goto L96
            int r1 = r6.httpResponseCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r1) goto L97
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L97
        L96:
            return r5
        L97:
            if (r2 == 0) goto La1
            java.lang.Boolean r0 = r6.serverRetryable
            boolean r0 = X.AnonymousClass002.A1b(r0, r14)
            if (r0 != 0) goto L96
        La1:
            java.lang.String r0 = r6.getMessage()
            com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult r1 = new com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult
            r1.<init>(r9, r5, r0)
            return r1
        Lab:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.redeemInviteCode(java.lang.String, boolean, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshTosStatus(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.activation.repo.AuraActivationRepository.C106921
            if (r0 == 0) goto L1f
            r5 = r7
            com.facebook.aura.activation.repo.AuraActivationRepository$refreshTosStatus$1 r5 = (com.facebook.aura.activation.repo.AuraActivationRepository.C106921) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L2a
            if (r1 != r0) goto L25
            goto L36
        L1f:
            com.facebook.aura.activation.repo.AuraActivationRepository$refreshTosStatus$1 r5 = new com.facebook.aura.activation.repo.AuraActivationRepository$refreshTosStatus$1
            r5.<init>(r7)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r4)
            r5.label = r0     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            java.lang.Object r4 = r6.fetchTosMetadata(r5)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            if (r4 != r2) goto L39
            return r2
        L36:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
        L39:
            com.facebook.aura.activation.data.HatchTosMetadata r4 = (com.facebook.aura.activation.data.HatchTosMetadata) r4     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            if (r4 == 0) goto L48
            boolean r0 = r4.hasAcceptedTos     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            r6.updateLocalHasAcceptedTos(r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            boolean r0 = r4.hasAcceptedTos     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L5a
        L48:
            return r3
        L49:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "refreshTosStatus failed: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AuraActivationRepository"
            X.CFK.A08(r0, r1, r2)
            return r3
        L5a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.repo.AuraActivationRepository.refreshTosStatus(X.HtJ):java.lang.Object");
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final AuraActivationRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (AuraActivationRepository) abstractC3358CGz.A03(AuraActivationRepository.class, new AuraActivationRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraActivationRepository(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.agreementUrl$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.hatch_agreement_url);
    }

    public /* synthetic */ AuraActivationRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
