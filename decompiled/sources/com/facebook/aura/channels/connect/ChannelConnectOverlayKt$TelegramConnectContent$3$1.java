package com.facebook.aura.channels.connect;

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
import com.facebook.aura.settings.HatchTelegramViewModel;
import com.facebook.aura.settings.TelegramEffect;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$3$1", f = "ChannelConnectOverlay.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ChannelConnectOverlayKt$TelegramConnectContent$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ HatchTelegramViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelConnectOverlayKt$TelegramConnectContent$3$1(HatchTelegramViewModel hatchTelegramViewModel, Context context, Function0<Unit> function0, HtJ<? super ChannelConnectOverlayKt$TelegramConnectContent$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchTelegramViewModel;
        this.$context = context;
        this.$onDismiss = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ChannelConnectOverlayKt$TelegramConnectContent$3$1(this.$viewModel, this.$context, this.$onDismiss, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            final HatchTelegramViewModel hatchTelegramViewModel = this.$viewModel;
            C22I<TelegramEffect> c22i = hatchTelegramViewModel.effect;
            final Context context = this.$context;
            final Function0<Unit> function0 = this.$onDismiss;
            C20Z<? super TelegramEffect> c20z = new C20Z() { // from class: com.facebook.aura.channels.connect.ChannelConnectOverlayKt$TelegramConnectContent$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((TelegramEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(TelegramEffect telegramEffect, HtJ<? super Unit> htJ) {
                    if (telegramEffect instanceof TelegramEffect.ShowToast) {
                        AnonymousClass006.A14(context, ((TelegramEffect.ShowToast) telegramEffect).messageResId);
                    } else if (telegramEffect instanceof TelegramEffect.OpenDeeplink) {
                        hatchTelegramViewModel.onDeeplinkLaunched(ChannelAppLauncherKt.launchChannelUrl(context, ChannelApp.TELEGRAM, ((TelegramEffect.OpenDeeplink) telegramEffect).uri));
                    } else if (telegramEffect instanceof TelegramEffect.Dismiss) {
                        function0.invoke();
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
        return ((ChannelConnectOverlayKt$TelegramConnectContent$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
