package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C10571Hud;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC05161qu;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.WalletSetupOption;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1", f = "WalletSetupSheet.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1 extends AbstractC07127nr implements G0V<InterfaceC05161qu<Skill>, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchConnectorCatalogRepository $catalog;
    public final /* synthetic */ WalletSetupOption $option;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1(HatchConnectorCatalogRepository hatchConnectorCatalogRepository, WalletSetupOption walletSetupOption, HtJ<? super WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1> htJ) {
        super(2, htJ);
        this.$catalog = hatchConnectorCatalogRepository;
        this.$option = walletSetupOption;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1 walletSetupSheetKt$WalletSetupOptionRow$fetched$2$1 = new WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1(this.$catalog, this.$option, htJ);
        walletSetupSheetKt$WalletSetupOptionRow$fetched$2$1.L$0 = obj;
        return walletSetupSheetKt$WalletSetupOptionRow$fetched$2$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM2119fetchConnectorgIAlus;
        MutableState mutableState = (MutableState) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConnectorCatalogRepository hatchConnectorCatalogRepository = this.$catalog;
            String str = this.$option.connectorId;
            this.L$0 = null;
            this.L$1 = mutableState;
            this.label = 1;
            objM2119fetchConnectorgIAlus = hatchConnectorCatalogRepository.m2119fetchConnectorgIAlus(str, this);
            if (objM2119fetchConnectorgIAlus == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            mutableState = (MutableState) this.L$1;
            objM2119fetchConnectorgIAlus = AnonymousClass001.A0q(obj);
        }
        if (objM2119fetchConnectorgIAlus instanceof C10571Hud) {
            objM2119fetchConnectorgIAlus = null;
        }
        mutableState.Af8(objM2119fetchConnectorgIAlus);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(InterfaceC05161qu<Skill> interfaceC05161qu, HtJ<? super Unit> htJ) {
        return ((WalletSetupSheetKt$WalletSetupOptionRow$fetched$2$1) create(interfaceC05161qu, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
