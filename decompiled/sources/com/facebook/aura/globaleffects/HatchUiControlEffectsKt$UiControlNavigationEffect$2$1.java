package com.facebook.aura.globaleffects;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Intent;
import android.net.Uri;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationEffect$2$1", f = "HatchUiControlEffects.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchUiControlEffectsKt$UiControlNavigationEffect$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchIntentViewModel $intentViewModel;
    public final /* synthetic */ UiControlActionSink $sink;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchUiControlEffectsKt$UiControlNavigationEffect$2$1(UiControlActionSink uiControlActionSink, HatchIntentViewModel hatchIntentViewModel, AbstractC3358CGz abstractC3358CGz, HtJ<? super HatchUiControlEffectsKt$UiControlNavigationEffect$2$1> htJ) {
        super(2, htJ);
        this.$sink = uiControlActionSink;
        this.$intentViewModel = hatchIntentViewModel;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchUiControlEffectsKt$UiControlNavigationEffect$2$1(this.$sink, this.$intentViewModel, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<String> c22i = this.$sink.pendingUri;
            final HatchIntentViewModel hatchIntentViewModel = this.$intentViewModel;
            final AbstractC3358CGz abstractC3358CGz = this.$userSession;
            C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.globaleffects.HatchUiControlEffectsKt$UiControlNavigationEffect$2$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    hatchIntentViewModel.handleTrustedIntent(abstractC3358CGz, new Intent("android.intent.action.VIEW", Uri.parse(str)));
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
        return ((HatchUiControlEffectsKt$UiControlNavigationEffect$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
