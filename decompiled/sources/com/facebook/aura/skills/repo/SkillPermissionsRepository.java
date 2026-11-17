package com.facebook.aura.skills.repo;

import X.AGH;
import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.agentpermission.ConnectorPermissionMode;
import com.facebook.aura.conversation.view.richcontent.HatchWidgetWebViewKt;
import com.facebook.aura.feed.view.FeedEditHapticsKt;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class SkillPermissionsRepository {
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillPermissionsRepository$fetchPermissions$2", f = "SkillPermissionsRepository.kt", l = {149}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillPermissionsRepository$fetchPermissions$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SkillPermissions>, Object> {
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
        public final /* synthetic */ SkillPermissionsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, SkillPermissionsRepository skillPermissionsRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.this$0 = skillPermissionsRepository;
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
                JarvisPath.ConnectorPermissions connectorPermissions = new JarvisPath.ConnectorPermissions(SkillPermissionsRepositoryKt.encodePermissionPathSegment(this.$connectorId));
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 skillPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = SkillPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
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
                objM1595executeBodylessJarvisRequestWithp3iPjrY = HatchHttpApi.INSTANCE.m1595executeBodylessJarvisRequestWithp3iPjrY(skillPermissionsRepository$fetchPermissions$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, connectorPermissions, RequestType.GET, this.this$0.userSession, null, new HxE[0], null, setA18, true, c9jHA0E, true, null, false, this);
                if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
            }
            String str = this.$connectorId;
            if (HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY) == null) {
                return ((SkillPermissionsResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain(str);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SkillPermissions> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillPermissionsRepository$fetchScopeLinkUrl$2", f = "SkillPermissionsRepository.kt", l = {150, HatchWidgetWebViewKt.HTTP_NO_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillPermissionsRepository$fetchScopeLinkUrl$2, reason: invalid class name and case insensitive filesystem */
    public final class C138262 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $accountId;
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ String $methodKey;
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
        public Object L$9;
        public int label;
        public final /* synthetic */ SkillPermissionsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138262(String str, String str2, String str3, SkillPermissionsRepository skillPermissionsRepository, HtJ<? super C138262> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$methodKey = str2;
            this.$accountId = str3;
            this.this$0 = skillPermissionsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138262(this.$connectorId, this.$methodKey, this.$accountId, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.SkillPermissionsRepository.C138262.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C138262) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillPermissionsRepository$resetPermissions$2", f = "SkillPermissionsRepository.kt", l = {173}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillPermissionsRepository$resetPermissions$2, reason: invalid class name and case insensitive filesystem */
    public final class C138272 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $connectorId;
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
        public final /* synthetic */ SkillPermissionsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138272(String str, SkillPermissionsRepository skillPermissionsRepository, HtJ<? super C138272> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.this$0 = skillPermissionsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138272(this.$connectorId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (C7BY.A0j(this.$connectorId)) {
                    return false;
                }
                JarvisPath.PermissionsConnector permissionsConnector = new JarvisPath.PermissionsConnector(SkillPermissionsRepositoryKt.encodePermissionPathSegment(this.$connectorId));
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 skillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = SkillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                SkillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 skillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = SkillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                objM1599executeJarvisRequestWithFof5HsY = HatchHttpApi.INSTANCE.m1599executeJarvisRequestWithFof5HsY(skillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, skillPermissionsRepository$resetPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, permissionsConnector, new ResetSkillPermissionsRequestJson("settings_permissions_connector_reset"), RequestType.DELETE, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            return Boolean.valueOf(!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138272) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.skills.repo.SkillPermissionsRepository$setPermissions$2", f = "SkillPermissionsRepository.kt", l = {FeedEditHapticsKt.ZIP_PULSE_AMPLITUDE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.skills.repo.SkillPermissionsRepository$setPermissions$2, reason: invalid class name and case insensitive filesystem */
    public final class C138282 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $connectorId;
        public final /* synthetic */ Map<String, ConnectorPermissionMode> $methods;
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
        public final /* synthetic */ SkillPermissionsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C138282(String str, Map<String, ? extends ConnectorPermissionMode> map, SkillPermissionsRepository skillPermissionsRepository, HtJ<? super C138282> htJ) {
            super(2, htJ);
            this.$connectorId = str;
            this.$methods = map;
            this.this$0 = skillPermissionsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C138282(this.$connectorId, this.$methods, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1599executeJarvisRequestWithFof5HsY;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (C7BY.A0j(this.$connectorId) || this.$methods.isEmpty()) {
                    return false;
                }
                JarvisPath.PermissionsConnector permissionsConnector = new JarvisPath.PermissionsConnector(SkillPermissionsRepositoryKt.encodePermissionPathSegment(this.$connectorId));
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                String str = this.$connectorId;
                Map<String, ConnectorPermissionMode> map = this.$methods;
                LinkedHashMap linkedHashMap = new LinkedHashMap(AIW.A0H(map.size()));
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    linkedHashMap.put(entry.getKey(), ((ConnectorPermissionMode) entry.getValue()).getWireValue());
                }
                Set<Integer> setA18 = AnonymousClass004.A18();
                C9jH c9jHA0E = AGH.A0E();
                SkillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 skillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1 = SkillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE;
                SkillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 skillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2 = SkillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE;
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
                objM1599executeJarvisRequestWithFof5HsY = hatchHttpApi.m1599executeJarvisRequestWithFof5HsY(skillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$1, skillPermissionsRepository$setPermissions$2$invokeSuspend$$inlined$executeJarvisRequestZ6QaZII$default$2, false, permissionsConnector, new SetSkillPermissionsRequestJson(str, linkedHashMap, "settings_permissions_connector_update"), RequestType.PATCH, this.this$0.userSession, null, null, new HxE[0], setA18, true, true, c9jHA0E, null, false, true, false, false, null, false, this);
                if (objM1599executeJarvisRequestWithFof5HsY == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1599executeJarvisRequestWithFof5HsY = AnonymousClass002.A0j(obj);
            }
            return Boolean.valueOf(!(objM1599executeJarvisRequestWithFof5HsY instanceof C10571Hud));
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C138282) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SkillPermissionsRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    public final Object fetchPermissions(String str, HtJ<? super SkillPermissions> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, this, null));
    }

    public final Object fetchScopeLinkUrl(String str, String str2, String str3, HtJ<? super String> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138262(str, str2, str3, this, null));
    }

    public final Object resetPermissions(String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138272(str, this, null));
    }

    public final Object setPermissions(String str, Map<String, ? extends ConnectorPermissionMode> map, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C138282(str, map, this, null));
    }
}
