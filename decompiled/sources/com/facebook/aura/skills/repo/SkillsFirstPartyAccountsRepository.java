package com.facebook.aura.skills.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9jH;
import X.EnumC10460Hji;
import X.F0C;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class SkillsFirstPartyAccountsRepository {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository", f = "SkillsFirstPartyAccountsRepository.kt", l = {48}, m = "fetchLinkedAccounts", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccounts$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SkillsFirstPartyAccountsRepository.this.fetchLinkedAccounts(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2", f = "SkillsFirstPartyAccountsRepository.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super OAuthLinkedAccountsResult>, Object> {
        public final /* synthetic */ FirstPartyConnectorConfig $config;
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
        public AnonymousClass2(FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$config = firstPartyConnectorConfig;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SkillsFirstPartyAccountsRepository.this.new AnonymousClass2(this.$config, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                JarvisPath.FoaAccounts foaAccounts = JarvisPath.FoaAccounts.INSTANCE;
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                RequestType requestType = RequestType.GET;
                AbstractC3358CGz abstractC3358CGz = SkillsFirstPartyAccountsRepository.this.userSession;
                HxE<String, ? extends Object>[] hxEArr = {C3cG.A0r(ErrorReportingConstants.APP_NAME_KEY, this.$config.accountIdentity.getWireName())};
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 skillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = SkillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                this.I$2 = 0;
                this.label = 1;
                objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(skillsFirstPartyAccountsRepository$fetchLinkedAccountsResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, foaAccounts, requestType, abstractC3358CGz, null, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY instanceof C10571Hud) {
                objM1595executeBodylessJarvisRequestWithp3iPjrY = null;
            }
            JsonObject jsonObject = (JsonObject) objM1595executeBodylessJarvisRequestWithp3iPjrY;
            if (jsonObject != null) {
                return SkillsFirstPartyAccountsRepositoryJsonKt.toLinkedAccountsResult(jsonObject, this.$config.accountIdentity);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super OAuthLinkedAccountsResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2", f = "SkillsFirstPartyAccountsRepository.kt", l = {125}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C138312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Set<String> $accountIds;
        public final /* synthetic */ String $skillId;
        public final /* synthetic */ String $sourceSessionId;
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
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
        public final /* synthetic */ SkillsFirstPartyAccountsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138312(String str, Set<String> set, String str2, SkillsFirstPartyAccountsRepository skillsFirstPartyAccountsRepository, HtJ<? super C138312> htJ) {
            super(2, htJ);
            this.$skillId = str;
            this.$accountIds = set;
            this.$sourceSessionId = str2;
            this.this$0 = skillsFirstPartyAccountsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138312(this.$skillId, this.$accountIds, this.$sourceSessionId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                JarvisPath.FoaAuthCallback foaAuthCallback = JarvisPath.FoaAuthCallback.INSTANCE;
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                F0C<C9hr<Object>>[] f0cArr = UpdateLinkedAccountsRequestJson.$childSerializers;
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 skillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 skillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = SkillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = 1;
                this.I$1 = 1;
                this.I$2 = 0;
                this.I$3 = 1;
                this.I$4 = 0;
                this.I$5 = 0;
                this.I$6 = 0;
                this.label = 1;
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(skillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, skillsFirstPartyAccountsRepository$updateLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, true, foaAuthCallback, new UpdateLinkedAccountsRequestJson(this.$skillId, AbstractC0878AGe.A0X(this.$accountIds), this.$sourceSessionId), RequestType.POST, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            return C3cG.A0P(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SkillsFirstPartyAccountsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchLinkedAccounts(com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig r6, X.HtJ<? super java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccount>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository.AnonymousClass1
            if (r0 == 0) goto L36
            r4 = r7
            com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccounts$1 r4 = (com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L36
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L3e
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.skills.repo.OAuthLinkedAccountsResult r3 = (com.facebook.aura.skills.repo.OAuthLinkedAccountsResult) r3
            if (r3 == 0) goto L3c
            java.util.List<com.facebook.aura.skills.repo.OAuthLinkedAccount> r2 = r3.accounts
            return r2
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.fetchLinkedAccountsResult(r6, r4)
            if (r3 != r2) goto L20
            return r2
        L36:
            com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccounts$1 r4 = new com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository$fetchLinkedAccounts$1
            r4.<init>(r7)
            goto L12
        L3c:
            r2 = 0
            return r2
        L3e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.SkillsFirstPartyAccountsRepository.fetchLinkedAccounts(com.facebook.aura.skills.connect.config.FirstPartyConnectorConfig, X.HtJ):java.lang.Object");
    }

    public final Object fetchLinkedAccountsResult(FirstPartyConnectorConfig firstPartyConnectorConfig, HtJ<? super OAuthLinkedAccountsResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(firstPartyConnectorConfig, null));
    }

    public final Object updateLinkedAccounts(String str, Set<String> set, String str2, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138312(str, set, str2, this, null));
    }
}
