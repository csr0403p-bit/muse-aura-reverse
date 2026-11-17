package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1", f = "HatchCustomConnectorDetailsScreen.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
    public final /* synthetic */ Function0<Unit> $onDisconnected;
    public final /* synthetic */ HatchCustomConnectorDetailsViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1(HatchCustomConnectorDetailsViewModel hatchCustomConnectorDetailsViewModel, SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, Function0<Unit> function0, HtJ<? super HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchCustomConnectorDetailsViewModel;
        this.$key = secureStorageCustomConnectorDetailsScreenKey;
        this.$onDisconnected = function0;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1(this.$viewModel, this.$key, this.$onDisconnected, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<String> c22i = this.$viewModel.disconnectCompleted;
            final SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey = this.$key;
            final Function0<Unit> function0 = this.$onDisconnected;
            C20Z<? super String> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((String) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(String str, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(str, secureStorageCustomConnectorDetailsScreenKey.name)) {
                        function0.invoke();
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
        return ((HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
