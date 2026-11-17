package com.facebook.aura.gateway;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.C3UX;
import X.C3cG;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import android.os.SystemClock;
import com.facebook.aura.gateway.HatchCvmReplacement;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.api.StefiHatchPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchCvmReplaceStateRepository {
    public static final int $stable = 0;
    public static final int HTTP_TOO_MANY_REQUESTS = 429;
    public static final HatchCvmReplaceStateRepository INSTANCE = new HatchCvmReplaceStateRepository();
    public static final Set<Integer> NOT_FOUND_HTTP_CODES = BFI.A0H(new Integer[]{400, 404});
    public static final String TAG = "HatchCvmReplaceStateRepository";

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchCvmReplaceStateRepository$read$2", f = "HatchCvmReplaceStateRepository.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchCvmReplaceStateRepository$read$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchCvmReplacement>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $vmId;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* renamed from: com.facebook.aura.gateway.HatchCvmReplaceStateRepository$read$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchCvmReplaceReadBlock.values().length];
                try {
                    AnonymousClass002.A13(HatchCvmReplaceReadBlock.RATE_LIMITED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchCvmReplaceReadBlock.NOT_FOUND, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$vmId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$vmId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchCvmReplaceReadPolicy companion;
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            int iOrdinal;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                companion = HatchCvmReplaceReadPolicy.Companion.getInstance(this.$userSession);
                HatchCvmReplaceReadBlock hatchCvmReplaceReadBlockBlockFor = companion.blockFor(this.$vmId, SystemClock.elapsedRealtime());
                if (hatchCvmReplaceReadBlockBlockFor != null && (iOrdinal = hatchCvmReplaceReadBlockBlockFor.ordinal()) != -1) {
                    if (iOrdinal == 0) {
                        return null;
                    }
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    return HatchCvmReplacement.NotFound.INSTANCE;
                }
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                StefiHatchPath.CvmReplaceState cvmReplaceState = new StefiHatchPath.CvmReplaceState(this.$vmId);
                RequestType requestType = RequestType.GET;
                C9jH c9jHA0E = AGH.A0E();
                HatchCvmReplaceStateRepository$read$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchCvmReplaceStateRepository$read$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchCvmReplaceStateRepository$read$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = companion;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchCvmReplaceStateRepository$read$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, cvmReplaceState, requestType, null, null, c9jHA0E, c9jHA0E, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                companion = (HatchCvmReplaceReadPolicy) this.L$0;
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass002.A0j(obj);
            }
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 != null) {
                CFK.A0A(HatchCvmReplaceStateRepository.TAG, "cvm-replace-state read failed", thA00);
            }
            String str = this.$vmId;
            Throwable thA002 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA002 == null) {
                companion.onReadSucceeded(str);
                HatchCvmReplacement domain = ((CvmReplaceStateResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A).toDomain(this.$vmId);
                String str2 = this.$vmId;
                if (domain instanceof HatchCvmReplacement.Unknown) {
                    CFK.A0H(HatchCvmReplaceStateRepository.TAG, "CVM replacement state rejected: reason=unknown_state vm=%s", HatcheryVMIdUtilsKt.vmIdForLog(str2));
                }
                return domain;
            }
            Integer numA0R = (!(thA002 instanceof NetworkException) || (networkException = (NetworkException) thA002) == null) ? null : C3cG.A0R(networkException.httpResponseCode);
            if (AbstractC0878AGe.A0k(HatchCvmReplaceStateRepository.NOT_FOUND_HTTP_CODES, numA0R)) {
                companion.onNotFound(str, SystemClock.elapsedRealtime());
                return HatchCvmReplacement.NotFound.INSTANCE;
            }
            if (numA0R != null && numA0R.intValue() == 429) {
                companion.onRateLimited(SystemClock.elapsedRealtime());
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchCvmReplacement> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object read(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super HatchCvmReplacement> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(abstractC3358CGz, str, null));
    }
}
