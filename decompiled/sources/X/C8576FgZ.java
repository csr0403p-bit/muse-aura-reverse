package X;

import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: X.FgZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8576FgZ extends AbstractC8595Fgx<FragmentActivity> implements Hr3, InterfaceC8615FhK, InterfaceC8617FhM, InterfaceC8616FhL, BOD, InterfaceC2262BMi, InterfaceC10559Hsu, A6I, InterfaceC8626Fha, InterfaceC8620FhQ {
    public final /* synthetic */ FragmentActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8576FgZ(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC8620FhQ
    public final void addMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        this.A00.addMenuProvider(interfaceC8348FcM);
    }

    @Override // X.Hr3
    public final void addOnConfigurationChangedListener(BeM<Configuration> beM) {
        this.A00.addOnConfigurationChangedListener(beM);
    }

    @Override // X.InterfaceC8617FhM
    public final void addOnMultiWindowModeChangedListener(BeM<C8622FhS> beM) {
        this.A00.addOnMultiWindowModeChangedListener(beM);
    }

    @Override // X.InterfaceC8616FhL
    public final void addOnPictureInPictureModeChangedListener(BeM<HqA> beM) {
        this.A00.addOnPictureInPictureModeChangedListener(beM);
    }

    @Override // X.InterfaceC8615FhK
    public final void addOnTrimMemoryListener(BeM<Integer> beM) {
        this.A00.addOnTrimMemoryListener(beM);
    }

    @Override // X.InterfaceC10559Hsu
    public final AbstractC8583Fgi getActivityResultRegistry() {
        return this.A00.activityResultRegistry;
    }

    @Override // X.C1HY
    public final F2N getLifecycle() {
        return this.A00.mFragmentLifecycleRegistry;
    }

    @Override // X.InterfaceC2262BMi
    public final C2186B9f getOnBackPressedDispatcher() {
        return this.A00.getOnBackPressedDispatcher();
    }

    @Override // X.A6I
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.A00.savedStateRegistryController.A00;
    }

    @Override // X.BOD
    public final BJt getViewModelStore() {
        return this.A00.getViewModelStore();
    }

    @Override // X.InterfaceC8620FhQ
    public final void removeMenuProvider(InterfaceC8348FcM interfaceC8348FcM) {
        this.A00.removeMenuProvider(interfaceC8348FcM);
    }

    @Override // X.Hr3
    public final void removeOnConfigurationChangedListener(BeM<Configuration> beM) {
        this.A00.removeOnConfigurationChangedListener(beM);
    }

    @Override // X.InterfaceC8617FhM
    public final void removeOnMultiWindowModeChangedListener(BeM<C8622FhS> beM) {
        this.A00.removeOnMultiWindowModeChangedListener(beM);
    }

    @Override // X.InterfaceC8616FhL
    public final void removeOnPictureInPictureModeChangedListener(BeM<HqA> beM) {
        this.A00.removeOnPictureInPictureModeChangedListener(beM);
    }

    @Override // X.InterfaceC8615FhK
    public final void removeOnTrimMemoryListener(BeM<Integer> beM) {
        this.A00.removeOnTrimMemoryListener(beM);
    }
}
