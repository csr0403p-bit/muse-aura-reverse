package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.settings.ConnectedDevicesViewEffect;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1", f = "HatchDeviceDetailsScreen.kt", l = {151}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnBack$delegate;
    public final /* synthetic */ String $genericErrorMessage;
    public final /* synthetic */ String $keyRevokePendingMessage;
    public final /* synthetic */ View $view;
    public final /* synthetic */ HatchConnectedDevicesViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1(HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, View view, String str, String str2, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConnectedDevicesViewModel;
        this.$view = view;
        this.$keyRevokePendingMessage = str;
        this.$genericErrorMessage = str2;
        this.$currentOnBack$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1(this.$viewModel, this.$view, this.$keyRevokePendingMessage, this.$genericErrorMessage, this.$currentOnBack$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectedDevicesViewEffect> c22i = this.$viewModel.viewEffects;
            final View view = this.$view;
            final String str = this.$keyRevokePendingMessage;
            final String str2 = this.$genericErrorMessage;
            final C1BO<Function0<Unit>> c1bo = this.$currentOnBack$delegate;
            C20Z<? super ConnectedDevicesViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((ConnectedDevicesViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(ConnectedDevicesViewEffect connectedDevicesViewEffect, HtJ<? super Unit> htJ) {
                    if (!C7384Etj.areEqual(connectedDevicesViewEffect, ConnectedDevicesViewEffect.UnpairSucceeded.INSTANCE)) {
                        if (C7384Etj.areEqual(connectedDevicesViewEffect, ConnectedDevicesViewEffect.UnpairKeyRevokePending.INSTANCE)) {
                            AnonymousClass007.A0m(view, AuraToast.Companion, str);
                            C1BO.A0D(c1bo);
                        } else if (C7384Etj.areEqual(connectedDevicesViewEffect, ConnectedDevicesViewEffect.UnpairFailed.INSTANCE)) {
                            AnonymousClass007.A0m(view, AuraToast.Companion, str2);
                        } else if (!C7384Etj.areEqual(connectedDevicesViewEffect, ConnectedDevicesViewEffect.CommunityDeviceRemovalFailed.INSTANCE)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        C1BO.A0D(c1bo);
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
        return ((HatchDeviceDetailsScreenKt$HatchDeviceDetailsScreen$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
