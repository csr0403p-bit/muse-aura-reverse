package com.facebook.aura.gateway;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C06H;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9jH;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.VmEntryV2Json;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchPauseOperations {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AbstractC3358CGz userSession;

    /* loaded from: classes2.dex */
    public interface PauseResult {

        public final class Failed implements PauseResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final String getMessage() {
                return this.message;
            }
        }

        public final class Success implements PauseResult {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();
        }
    }

    /* loaded from: classes2.dex */
    public interface PauseStatusResult {

        public final class Failed implements PauseStatusResult {
            public static final int $stable = 0;
            public final String message;

            public Failed(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final String getMessage() {
                return this.message;
            }
        }

        public final class Success implements PauseStatusResult {
            public static final int $stable = 0;
            public final boolean locked;

            public final boolean getLocked() {
                return this.locked;
            }

            public Success(boolean z) {
                this.locked = z;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations", f = "HatchPauseOperations.kt", l = {131}, m = "executePauseAck", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchPauseOperations$executePauseAck$1, reason: invalid class name */
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
            return HatchPauseOperations.this.executePauseAck(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$fetchVmCredentials$2", f = "HatchPauseOperations.kt", l = {262}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchPauseOperations$fetchVmCredentials$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends String, ? extends String>>, Object> {
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
            return HatchPauseOperations.this.new AnonymousClass2(htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super HxE<String, String>> htJ) {
            return HatchPauseOperations.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            Object next;
            String str;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str2 = CH0.A01((CH0) HatchPauseOperations.this.userSession).A04;
                if (str2 == null || C7BY.A0j(str2)) {
                    CFK.A04(HatchPauseOperationsKt.TAG, "Cannot fetch VM credentials: missing access token");
                    return null;
                }
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.FetchVms fetchVms = StefiHatchPath.FetchVms.INSTANCE;
                RequestType requestType = RequestType.GET;
                C9jH c9jH = C9jH.A00;
                HatchPauseOperations$fetchVmCredentials$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchPauseOperations$fetchVmCredentials$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchPauseOperations$fetchVmCredentials$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchPauseOperations$fetchVmCredentials$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, fetchVms, requestType, null, null, c9jH, c9jH, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            if (HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A) == null) {
                List list = ((FetchLeasedVmV2ResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A).vm_list;
                if (list == null) {
                    list = C0881AGi.A00;
                }
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    VmEntryV2Json vmEntryV2Json = (VmEntryV2Json) next;
                    if (!C7BY.A0j(vmEntryV2Json.vm_ws_url) && (str = vmEntryV2Json.vm_auth_token) != null && !C7BY.A0j(str)) {
                        break;
                    }
                }
                VmEntryV2Json vmEntryV2Json2 = (VmEntryV2Json) next;
                if (vmEntryV2Json2 != null) {
                    String strA0l = AnonymousClass002.A0l(vmEntryV2Json2.vm_ws_url);
                    String str3 = vmEntryV2Json2.vm_auth_token;
                    if (str3 == null) {
                        str3 = "";
                    }
                    return C3cG.A0r(strA0l, AnonymousClass002.A0l(str3));
                }
            }
            return null;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends String, ? extends String>> htJ) {
            return invoke2(c3ux, (HtJ<? super HxE<String, String>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$lock$2", f = "HatchPauseOperations.kt", l = {93, 96}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchPauseOperations$lock$2, reason: invalid class name and case insensitive filesystem */
    public final class C121292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PauseResult>, Object> {
        public final /* synthetic */ Integer $gracePeriodSecs;
        public final /* synthetic */ byte[] $passphrase;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121292(byte[] bArr, Integer num, HtJ<? super C121292> htJ) {
            super(2, htJ);
            this.$passphrase = bArr;
            this.$gracePeriodSecs = num;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseOperations.this.new C121292(this.$passphrase, this.$gracePeriodSecs, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseOperations hatchPauseOperations = HatchPauseOperations.this;
                this.label = 1;
                obj = hatchPauseOperations.resolveCredentials(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HxE hxE = (HxE) obj;
            if (hxE == null) {
                return new PauseResult.Failed("Unable to resolve VM credentials");
            }
            String str = (String) hxE.first;
            String str2 = (String) hxE.second;
            HatchPauseOperations hatchPauseOperations2 = HatchPauseOperations.this;
            JarvisPath.VaultLuksLock vaultLuksLock = JarvisPath.VaultLuksLock.INSTANCE;
            String strBuildPauseRequestBody = HatchPauseOperationsJsonKt.buildPauseRequestBody(this.$passphrase, this.$gracePeriodSecs);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = hatchPauseOperations2.executePauseAck(vaultLuksLock, strBuildPauseRequestBody, str, str2, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PauseResult> htJ) {
            return ((C121292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$status$2", f = "HatchPauseOperations.kt", l = {180, 182}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchPauseOperations$status$2, reason: invalid class name and case insensitive filesystem */
    public final class C121302 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PauseStatusResult>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public C121302(HtJ<? super C121302> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseOperations.this.new C121302(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PauseStatusResult> htJ) {
            return HatchPauseOperations.this.new C121302(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseOperations hatchPauseOperations = HatchPauseOperations.this;
                this.label = 1;
                obj = hatchPauseOperations.resolveCredentials(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HxE hxE = (HxE) obj;
            if (hxE == null) {
                return new PauseStatusResult.Failed("Unable to resolve VM credentials");
            }
            String str = (String) hxE.first;
            String str2 = (String) hxE.second;
            Companion companion = HatchPauseOperations.Companion;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = companion.statusInternal(str, str2, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchPauseOperations$unlock$2", f = "HatchPauseOperations.kt", l = {113, 116}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchPauseOperations$unlock$2, reason: invalid class name and case insensitive filesystem */
    public final class C121312 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PauseResult>, Object> {
        public final /* synthetic */ byte[] $passphrase;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121312(byte[] bArr, HtJ<? super C121312> htJ) {
            super(2, htJ);
            this.$passphrase = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchPauseOperations.this.new C121312(this.$passphrase, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchPauseOperations hatchPauseOperations = HatchPauseOperations.this;
                this.label = 1;
                obj = hatchPauseOperations.resolveCredentials(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HxE hxE = (HxE) obj;
            if (hxE == null) {
                return new PauseResult.Failed("Unable to resolve VM credentials");
            }
            String str = (String) hxE.first;
            String str2 = (String) hxE.second;
            HatchPauseOperations hatchPauseOperations2 = HatchPauseOperations.this;
            JarvisPath.VaultLuksUnlock vaultLuksUnlock = JarvisPath.VaultLuksUnlock.INSTANCE;
            String strBuildUnpauseRequestBody = HatchPauseOperationsJsonKt.buildUnpauseRequestBody(this.$passphrase);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = hatchPauseOperations2.executePauseAck(vaultLuksUnlock, strBuildUnpauseRequestBody, str, str2, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super PauseResult> htJ) {
            return ((C121312) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchPauseOperations(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executePauseAck(com.facebook.aura.network.api.JarvisPath r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, X.HtJ<? super com.facebook.aura.gateway.HatchPauseOperations.PauseResult> r19) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchPauseOperations.executePauseAck(com.facebook.aura.network.api.JarvisPath, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object statusInternal(java.lang.String r17, java.lang.String r18, X.HtJ<? super com.facebook.aura.gateway.HatchPauseOperations.PauseStatusResult> r19) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchPauseOperations.Companion.statusInternal(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
        }

        public final Object status(String str, String str2, HtJ<? super PauseStatusResult> htJ) {
            return GAo.A00(htJ, AnonymousClass001.A0y(), new HatchPauseOperations$Companion$status$2(str, str2, null));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ Object lock$default(HatchPauseOperations hatchPauseOperations, byte[] bArr, Integer num, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return hatchPauseOperations.lock(bArr, num, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object resolveCredentials(HtJ<? super HxE<String, String>> htJ) {
        String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl();
        String strVmBoundAuthToken = VmAuthTokenKt.vmBoundAuthToken(this.userSession);
        return (C7BY.A0j(gatewayUrl) || C7BY.A0j(strVmBoundAuthToken)) ? fetchVmCredentials(htJ) : C3cG.A0r(gatewayUrl, strVmBoundAuthToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchVmCredentials(HtJ<? super HxE<String, String>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public final Object lock(byte[] bArr, Integer num, HtJ<? super PauseResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C121292(bArr, num, null));
    }

    public final Object status(HtJ<? super PauseStatusResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C121302(null));
    }

    public final Object unlock(byte[] bArr, HtJ<? super PauseResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C121312(bArr, null));
    }
}
