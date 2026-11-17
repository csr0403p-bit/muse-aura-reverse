package com.facebook.aura.skills.connect;

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
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1", f = "SkillAlreadyConnectedOrDisconnectedSheet.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ ConnectorSettingsDestinationViewModel $settings;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1(ConnectorSettingsDestinationViewModel connectorSettingsDestinationViewModel, AuraNavigator auraNavigator, HtJ<? super SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1> htJ) {
        super(2, htJ);
        this.$settings = connectorSettingsDestinationViewModel;
        this.$navigator = auraNavigator;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1(this.$settings, this.$navigator, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<ConnectorSettingsDestination> c22i = this.$settings.destination;
            final AuraNavigator auraNavigator = this.$navigator;
            C20Z<? super ConnectorSettingsDestination> c20z = new C20Z() { // from class: com.facebook.aura.skills.connect.SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1.1
                public final Object emit(ConnectorSettingsDestination connectorSettingsDestination, HtJ<? super Unit> htJ) {
                    SkillAlreadyConnectedOrDisconnectedSheetKt.navigateToSettings(auraNavigator, connectorSettingsDestination);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    SkillAlreadyConnectedOrDisconnectedSheetKt.navigateToSettings(auraNavigator, (ConnectorSettingsDestination) obj2);
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
        return ((SkillAlreadyConnectedOrDisconnectedSheetKt$SkillAlreadyConnectedOrDisconnectedSheet$1$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
