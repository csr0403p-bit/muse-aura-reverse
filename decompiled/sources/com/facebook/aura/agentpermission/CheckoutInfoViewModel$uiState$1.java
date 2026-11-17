package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.agentpermission.CheckoutInfoTitle;
import com.facebook.aura.agentpermission.CheckoutInfoUiState;
import com.facebook.aura.gateway.CheckoutInfo;
import com.facebook.aura.gateway.CheckoutInfoState;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.CheckoutInfoViewModel$uiState$1", f = "CheckoutInfoViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class CheckoutInfoViewModel$uiState$1 extends AbstractC07127nr implements G2j<String, Map<String, ? extends CheckoutInfoState>, Boolean, HtJ<? super CheckoutInfoUiState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ boolean Z$0;
    public int label;

    public CheckoutInfoViewModel$uiState$1(HtJ<? super CheckoutInfoViewModel$uiState$1> htJ) {
        super(4, htJ);
    }

    public final Object invoke(String str, Map<String, CheckoutInfoState> map, boolean z, HtJ<? super CheckoutInfoUiState> htJ) {
        CheckoutInfoViewModel$uiState$1 checkoutInfoViewModel$uiState$1 = new CheckoutInfoViewModel$uiState$1(htJ);
        checkoutInfoViewModel$uiState$1.L$0 = str;
        checkoutInfoViewModel$uiState$1.L$1 = map;
        checkoutInfoViewModel$uiState$1.Z$0 = z;
        return checkoutInfoViewModel$uiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        Map map = (Map) this.L$1;
        boolean z = this.Z$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        CheckoutInfoTitle.Resource resourceCheckoutInfoFallbackTitle = CheckoutInfoViewModelKt.checkoutInfoFallbackTitle(str);
        if (str == null) {
            return !z ? new CheckoutInfoUiState.Loading(null, resourceCheckoutInfoFallbackTitle) : new CheckoutInfoUiState.Error(null, resourceCheckoutInfoFallbackTitle, false);
        }
        CheckoutInfoState checkoutInfoState = (CheckoutInfoState) map.get(str);
        if (checkoutInfoState != null) {
            CheckoutInfo checkoutInfo = checkoutInfoState.info;
            if (checkoutInfoState.failed) {
                return new CheckoutInfoUiState.Error(str, resourceCheckoutInfoFallbackTitle, true);
            }
            if (checkoutInfo != null) {
                return new CheckoutInfoUiState.Content(checkoutInfo, str);
            }
        }
        return new CheckoutInfoUiState.Loading(str, resourceCheckoutInfoFallbackTitle);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(String str, Map<String, ? extends CheckoutInfoState> map, Boolean bool, HtJ<? super CheckoutInfoUiState> htJ) {
        return invoke(str, (Map<String, CheckoutInfoState>) map, AnonymousClass001.A1X(bool), htJ);
    }
}
