package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.channels.ChannelApp;
import com.facebook.aura.channels.ChannelAppLauncherKt;
import com.facebook.aura.settings.WhatsAppEffect;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1", f = "HatchWhatsAppSettingsScreen.kt", l = {88}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchWhatsAppViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1(HatchWhatsAppViewModel hatchWhatsAppViewModel, Context context, HtJ<? super HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchWhatsAppViewModel;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1(this.$viewModel, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchWhatsAppViewModel hatchWhatsAppViewModel = this.$viewModel;
            C22I<WhatsAppEffect> c22i = hatchWhatsAppViewModel.effect;
            final Context context = this.$context;
            C20Z<? super WhatsAppEffect> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((WhatsAppEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(WhatsAppEffect whatsAppEffect, HtJ<? super Unit> htJ) {
                    if (whatsAppEffect instanceof WhatsAppEffect.ShowToast) {
                        AnonymousClass006.A14(context, ((WhatsAppEffect.ShowToast) whatsAppEffect).messageResId);
                    } else if (whatsAppEffect instanceof WhatsAppEffect.OpenDeeplink) {
                        hatchWhatsAppViewModel.onDeeplinkLaunched(ChannelAppLauncherKt.launchChannelUrl(context, ChannelApp.WHATSAPP, ((WhatsAppEffect.OpenDeeplink) whatsAppEffect).uri));
                    } else {
                        throw new NoWhenBranchMatchedException();
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
        return ((HatchWhatsAppSettingsScreenKt$HatchWhatsAppSettingsScreen$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
