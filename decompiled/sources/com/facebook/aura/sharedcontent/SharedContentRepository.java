package com.facebook.aura.sharedcontent;

import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60O;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.common.url.SharedContentIabSignal;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.stefi.AuraStefiClient;
import com.facebook.aura.sharedcontent.ResolveResult;
import com.facebook.aura.sharedcontent.SaveResult;
import com.facebook.aura.sharedcontent.SharedContentStefiPath;
import com.facebook.aura.utils.HatchStringUtils;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SharedContentRepository {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.facebook.aura.sharedcontent.SharedContentRepository$resolveSharedUrl$2", f = "SharedContentRepository.kt", l = {159}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharedcontent.SharedContentRepository$resolveSharedUrl$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ResolveResult>, Object> {
        public final /* synthetic */ String $shareKey;
        public final /* synthetic */ String $slug;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$slug = str;
            this.$shareKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$slug, this.$shareKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                SharedContentStefiPath.FetchSharedUrl fetchSharedUrl = new SharedContentStefiPath.FetchSharedUrl(this.$slug, this.$shareKey);
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                SharedContentRepository$resolveSharedUrl$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 sharedContentRepository$resolveSharedUrl$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = SharedContentRepository$resolveSharedUrl$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApiA06.m1596executeBodylessStefiRequestWithtZkwj4A(sharedContentRepository$resolveSharedUrl$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, fetchSharedUrl, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            String str2 = this.$slug;
            String str3 = this.$shareKey;
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 != null) {
                String message = thA00.getMessage();
                if (message == null) {
                    message = "Request failed";
                }
                return new ResolveResult.Failed(message);
            }
            FetchSharedUrlResponseJson fetchSharedUrlResponseJson = (FetchSharedUrlResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A;
            String str4 = fetchSharedUrlResponseJson.type;
            if ("space".equals(str4)) {
                if ("cloudflare".equals(fetchSharedUrlResponseJson.share_type)) {
                    HatchStringUtils hatchStringUtils = HatchStringUtils.INSTANCE;
                    String str5 = fetchSharedUrlResponseJson.slug;
                    if (str5 == null) {
                        str5 = str2;
                    }
                    return new ResolveResult.Space(str2, hatchStringUtils.artifactDisplayName(str5), SharedContentIabSignal.INSTANCE.appendParams(HatchUrl.INSTANCE.sharedContentUrl(str2, str3)), true);
                }
                String str6 = fetchSharedUrlResponseJson.asset_id;
                if (str6 != null && str6.length() != 0) {
                    HatchStringUtils hatchStringUtils2 = HatchStringUtils.INSTANCE;
                    String str7 = fetchSharedUrlResponseJson.slug;
                    if (str7 == null) {
                        str7 = str2;
                    }
                    return new ResolveResult.Space(str2, hatchStringUtils2.artifactDisplayName(str7), FGI.A0U("https://", str6, ".s.metaaiusercontent.com"), false);
                }
            } else if (SharedContentRepositoryKt.WIRE_TYPE_ARTIFACT.equals(str4) && (str = fetchSharedUrlResponseJson.sandbox_url) != null && str.length() != 0) {
                HatchStringUtils hatchStringUtils3 = HatchStringUtils.INSTANCE;
                String str8 = fetchSharedUrlResponseJson.slug;
                if (str8 == null) {
                    str8 = str2;
                }
                return new ResolveResult.Artifact(str2, hatchStringUtils3.artifactDisplayName(str8), str);
            }
            return ResolveResult.Invalid.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ResolveResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharedcontent.SharedContentRepository$saveSpace$2", f = "SharedContentRepository.kt", l = {162}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharedcontent.SharedContentRepository$saveSpace$2, reason: invalid class name and case insensitive filesystem */
    public final class C136492 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SaveResult>, Object> {
        public final /* synthetic */ String $shortcode;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136492(String str, HtJ<? super C136492> htJ) {
            super(2, htJ);
            this.$shortcode = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136492(this.$shortcode, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super SaveResult> htJ) {
            return new C136492(this.$shortcode, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            String message;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!AuraStefiClient.INSTANCE.hasAuth()) {
                    CFK.A04(SharedContentRepositoryKt.TAG, "saveSpace called with no access token");
                    message = "Not signed in";
                    return new SaveResult.Failed(message);
                }
                RequestType requestType = RequestType.POST;
                C9jH c9jHA0E = AGH.A0E();
                SharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 sharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = SharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                SharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 sharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = SharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = HatchHttpApi.INSTANCE.m1604executeStefiRequestWithjLovISM(sharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, sharedContentRepository$saveSpace$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, new SharedContentStefiPath.ShareSave(this.$shortcode), new byte[0], requestType, c9jHA0E, true, null, false, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1604executeStefiRequestWithjLovISM = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM1604executeStefiRequestWithjLovISM);
            if (thA00 != null) {
                message = thA00.getMessage();
                if (message == null) {
                    message = "Request failed";
                }
            } else {
                if (((ShareSaveResponseJson) objM1604executeStefiRequestWithjLovISM).saved) {
                    return SaveResult.Success.INSTANCE;
                }
                message = "Server reported saved=false";
            }
            return new SaveResult.Failed(message);
        }
    }

    public final Object resolveSharedUrl(String str, String str2, HtJ<? super ResolveResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, null));
    }

    public final Object saveSpace(String str, HtJ<? super SaveResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C136492(str, null));
    }
}
