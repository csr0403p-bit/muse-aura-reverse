package com.facebook.aura.globaleffects;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1", f = "HatchUiControlEffects.kt", l = {126}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchIdentityProvider $identityProvider;
    public final /* synthetic */ UiControlActionSink $sink;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1(UiControlActionSink uiControlActionSink, HatchIdentityProvider hatchIdentityProvider, HtJ<? super HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1> htJ) {
        super(2, htJ);
        this.$sink = uiControlActionSink;
        this.$identityProvider = hatchIdentityProvider;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1(this.$sink, this.$identityProvider, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<String> c22i = this.$sink.pendingChatThemeId;
            final HatchIdentityProvider hatchIdentityProvider = this.$identityProvider;
            C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1.1
                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    hatchIdentityProvider.applyThemeFromUiControl(str);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    hatchIdentityProvider.applyThemeFromUiControl((String) obj2);
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
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchUiControlEffectsKt$UiControlChatThemeEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
