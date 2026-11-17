package com.facebook.aura.storagerecovery.data;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C60O;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0U;
import X.HsJ;
import X.HtJ;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryError;
import com.facebook.aura.storagerecovery.data.StorageRecoveryStefiPath;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.storagerecovery.data.HatchVmRecoveryTokenCache$mint$result$1", f = "HatchVmRecoveryTokenCache.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class HatchVmRecoveryTokenCache$mint$result$1 extends AbstractC07127nr implements G0U<HtJ<? super CachedTokens>, Object> {
    public final /* synthetic */ String $vmId;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public final /* synthetic */ HatchVmRecoveryTokenCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVmRecoveryTokenCache$mint$result$1(String str, HatchVmRecoveryTokenCache hatchVmRecoveryTokenCache, HtJ<? super HatchVmRecoveryTokenCache$mint$result$1> htJ) {
        super(1, htJ);
        this.$vmId = str;
        this.this$0 = hatchVmRecoveryTokenCache;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchVmRecoveryTokenCache$mint$result$1(this.$vmId, this.this$0, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws HatchStorageRecoveryError.Unavailable {
        Object objM1604executeStefiRequestWithjLovISM;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
            StorageRecoveryStefiPath.MintVmRecoveryToken mintVmRecoveryToken = StorageRecoveryStefiPath.MintVmRecoveryToken.INSTANCE;
            MintVmRecoveryTokenRequestJson mintVmRecoveryTokenRequestJson = new MintVmRecoveryTokenRequestJson(this.$vmId);
            RequestType requestType = RequestType.POST;
            C9jH c9jH = C9jH.A00;
            HatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
            HatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 1;
            this.I$1 = 0;
            this.label = 1;
            objM1604executeStefiRequestWithjLovISM = hatchHttpApiA06.m1604executeStefiRequestWithjLovISM(hatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchVmRecoveryTokenCache$mint$result$1$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, mintVmRecoveryToken, mintVmRecoveryTokenRequestJson, requestType, c9jH, true, null, false, null, this);
            if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1604executeStefiRequestWithjLovISM = AnonymousClass001.A0q(obj);
        }
        HatchVmRecoveryTokenCache hatchVmRecoveryTokenCache = this.this$0;
        String str = this.$vmId;
        if (HsJ.A00(objM1604executeStefiRequestWithjLovISM) != null) {
            throw HatchStorageRecoveryError.Unavailable.INSTANCE;
        }
        MintVmRecoveryTokenResponseJson mintVmRecoveryTokenResponseJson = (MintVmRecoveryTokenResponseJson) objM1604executeStefiRequestWithjLovISM;
        Map<String, String> map = mintVmRecoveryTokenResponseJson.tokens;
        Long l = mintVmRecoveryTokenResponseJson.notary_token_expiration_ts;
        if (l == null || l.longValue() <= 0) {
            l = null;
        }
        CachedTokens cachedTokens = new CachedTokens(map, l);
        hatchVmRecoveryTokenCache.cache.put(str, cachedTokens);
        return cachedTokens;
    }

    @Override // X.G0U
    public final Object invoke(HtJ<? super CachedTokens> htJ) {
        return ((HatchVmRecoveryTokenCache$mint$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
