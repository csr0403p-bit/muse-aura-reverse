package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.settings.ConnectedDevicesViewEffect;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1", f = "HatchConnectedDevicesScreen.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $removalFailedMessage;
    public final /* synthetic */ View $view;
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, View view, String str, HtJ<? super HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConnectedDevicesViewModel;
        this.$view = view;
        this.$removalFailedMessage = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1(this.$viewModel, this.$view, this.$removalFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectedDevicesViewEffect> c22i = this.$viewModel.viewEffects;
            final View view = this.$view;
            final String str = this.$removalFailedMessage;
            C20Z<? super ConnectedDevicesViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConnectedDevicesViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConnectedDevicesViewEffect connectedDevicesViewEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(connectedDevicesViewEffect, ConnectedDevicesViewEffect.CommunityDeviceRemovalFailed.INSTANCE)) {
                        AnonymousClass007.A0m(view, AuraToast.Companion, str);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
