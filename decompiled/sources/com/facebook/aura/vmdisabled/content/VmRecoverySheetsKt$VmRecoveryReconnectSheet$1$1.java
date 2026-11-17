package com.facebook.aura.vmdisabled.content;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.vmdisabled.VmReconnectViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1", f = "VmRecoverySheets.kt", l = {160}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ VmReconnectViewModel $reconnectViewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1(VmReconnectViewModel vmReconnectViewModel, AuraNavigator auraNavigator, HtJ<? super VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1> htJ) {
        super(2, htJ);
        this.$reconnectViewModel = vmReconnectViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1(this.$reconnectViewModel, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<Unit> c22i = this.$reconnectViewModel.reconnected;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.vmdisabled.content.VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                    auraNavigator.navigate(ConversationTabScreenKey.INSTANCE, LaunchFlag.REPLACE_BACKSTACK);
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
        return ((VmRecoverySheetsKt$VmRecoveryReconnectSheet$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
