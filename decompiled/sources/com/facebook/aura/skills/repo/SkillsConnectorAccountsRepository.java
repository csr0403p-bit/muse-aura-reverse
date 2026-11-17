package com.facebook.aura.skills.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C3UX;
import X.C6tn;
import X.C7384Etj;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.skills.connect.repository.AuraSkillAuthRepository;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SkillsConnectorAccountsRepository {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchLinkUrl$2", f = "SkillsConnectorAccountsRepository.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchLinkUrl$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $connectorId;
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
        public final /* synthetic */ SkillsConnectorAccountsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.this$0 = skillsConnectorAccountsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$connectorId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                JarvisPath.ConnectorAccountsLink connectorAccountsLink = new JarvisPath.ConnectorAccountsLink(C6tn.A06(this.$connectorId, HatchWebPageParserKt.UTF_8));
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillsConnectorAccountsRepository$fetchLinkUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 skillsConnectorAccountsRepository$fetchLinkUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = SkillsConnectorAccountsRepository$fetchLinkUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(skillsConnectorAccountsRepository$fetchLinkUrl$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, connectorAccountsLink, RequestType.POST, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            SkillsConnectorAccountsRepository skillsConnectorAccountsRepository = this.this$0;
            String str = this.$connectorId;
            if (HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY) == null) {
                String strA0l = AnonymousClass002.A0l(((ConnectorLinkResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).link_url);
                if (strA0l.length() > 0) {
                    AuraSkillAuthRepository.Companion.getInstance(skillsConnectorAccountsRepository.userSession).registerOAuthConnector(str, strA0l);
                    return strA0l;
                }
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchLinkedAccounts$2", f = "SkillsConnectorAccountsRepository.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchLinkedAccounts$2, reason: invalid class name and case insensitive filesystem */
    public final class C138292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends ConnectorLinkedAccount>>, Object> {
        public final /* synthetic */ String $connectorId;
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
        public final /* synthetic */ SkillsConnectorAccountsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138292(String str, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, HtJ<? super C138292> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.this$0 = skillsConnectorAccountsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138292(this.$connectorId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                JarvisPath.ConnectorAccounts connectorAccounts = new JarvisPath.ConnectorAccounts(C6tn.A06(this.$connectorId, HatchWebPageParserKt.UTF_8));
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 skillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(skillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, connectorAccounts, RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY) == null) {
                return ((ConnectorAccountsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
            }
            return null;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<ConnectorLinkedAccount>> htJ) {
            return ((C138292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends ConnectorLinkedAccount>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<ConnectorLinkedAccount>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$unlinkAccount$2", f = "SkillsConnectorAccountsRepository.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$unlinkAccount$2, reason: invalid class name and case insensitive filesystem */
    public final class C138302 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $accountId;
        public final /* synthetic */ String $connectorId;
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
        public final /* synthetic */ SkillsConnectorAccountsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138302(String str, String str2, SkillsConnectorAccountsRepository skillsConnectorAccountsRepository, HtJ<? super C138302> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$accountId = str2;
            this.this$0 = skillsConnectorAccountsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138302(this.$connectorId, this.$accountId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                JarvisPath.ConnectorAccountUnlink connectorAccountUnlink = new JarvisPath.ConnectorAccountUnlink(C6tn.A06(this.$connectorId, HatchWebPageParserKt.UTF_8), C6tn.A06(this.$accountId, HatchWebPageParserKt.UTF_8));
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillsConnectorAccountsRepository$unlinkAccount$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 skillsConnectorAccountsRepository$unlinkAccount$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = SkillsConnectorAccountsRepository$unlinkAccount$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(skillsConnectorAccountsRepository$unlinkAccount$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, connectorAccountUnlink, RequestType.POST, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            if (HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY) == null) {
                return Boolean.valueOf(((ConnectorAccountUnlinkResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).unlinked);
            }
            return false;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138302) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SkillsConnectorAccountsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* renamed from: fetchReconnectLinkUrl-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2127fetchReconnectLinkUrlBWLJW6A(java.lang.String r11, java.lang.String r12, java.lang.String r13, X.HtJ<? super X.HsJ<java.lang.String>> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1
            r9 = r10
            if (r0 == 0) goto L42
            r4 = r14
            com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1 r4 = (com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r4.label = r2
        L13:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L48
            X.Hwg.A00(r3)
        L21:
            X.HsJ r3 = (X.HsJ) r3
            java.lang.Object r0 = r3.value
            return r0
        L26:
            X.78T r0 = X.AnonymousClass002.A0s(r3)
            r10 = 0
            com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2 r5 = new com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$2
            r7 = r11
            r6 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r10
            r4.L$1 = r10
            r4.L$2 = r10
            r4.label = r1
            java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
            if (r3 != r2) goto L21
            return r2
        L42:
            com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1 r4 = new com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchReconnectLinkUrl$1
            r4.<init>(r10, r14)
            goto L13
        L48:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository.m2127fetchReconnectLinkUrlBWLJW6A(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object fetchLinkUrl(String str, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, this, null));
    }

    public final Object fetchLinkedAccounts(String str, HtJ<? super List<ConnectorLinkedAccount>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138292(str, this, null));
    }

    public final Object unlinkAccount(String str, String str2, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138302(str, str2, this, null));
    }
}
