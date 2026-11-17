package com.facebook.aura.navigation.entries;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.shortcut.HatchShortcutManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SettingsEntryProviderKt$SettingsScreenContent$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $shortcutUpdatedToast;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.navigation.entries.SettingsEntryProviderKt$SettingsScreenContent$1$1$1", f = "SettingsEntryProvider.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.navigation.entries.SettingsEntryProviderKt$SettingsScreenContent$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $shortcutUpdatedToast;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, Context context, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$context = context;
            this.$shortcutUpdatedToast = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.$context, this.$shortcutUpdatedToast, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AiIdentity value = HatchGatewayServiceManager.INSTANCE.getGateway(this.$userSession).getAiIdentity().getValue();
                if (value != null) {
                    HatchShortcutManager hatchShortcutManager = HatchShortcutManager.INSTANCE;
                    Context context = this.$context;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    String str = this.$shortcutUpdatedToast;
                    this.L$0 = null;
                    this.label = 1;
                    if (hatchShortcutManager.requestPinShortcut(context, value, abstractC3358CGz, str, null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    CFK.A06("AddToHomeScreen", "aiIdentity is null, cannot create shortcut");
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsEntryProviderKt$SettingsScreenContent$1$1(C3UX c3ux, AbstractC3358CGz abstractC3358CGz, Context context, String str) {
        super(0);
        this.$coroutineScope = c3ux;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$shortcutUpdatedToast = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1J(new AnonymousClass1(this.$userSession, this.$context, this.$shortcutUpdatedToast, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
