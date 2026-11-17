package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $openDocumentPicker;
    public final /* synthetic */ Function0<Unit> $openPhotoPicker;
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        MutableState.A09(false, this.$showMenu$delegate);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, HatchSubsurface.DOT_MENU, HatchScreen.LIBRARY_HOME, HatchComponent.UPLOAD_FILE_BUTTON, null, null, null);
            function0 = this.$openDocumentPicker;
        } else {
            if (i != 1) {
                return;
            }
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, HatchSubsurface.DOT_MENU, HatchScreen.LIBRARY_HOME, HatchComponent.UPLOAD_FROM_CAMERA_ROLL_BUTTON, null, null, null);
            function0 = this.$openPhotoPicker;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$1$2$1(Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(1);
        this.$openDocumentPicker = function0;
        this.$openPhotoPicker = function02;
        this.$showMenu$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
