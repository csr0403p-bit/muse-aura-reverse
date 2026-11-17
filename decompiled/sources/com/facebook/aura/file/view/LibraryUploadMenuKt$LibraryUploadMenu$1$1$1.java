package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $showMenu$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$1$1$1(MutableState<Boolean> mutableState) {
        super(0);
        this.$showMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, HatchSubsurface.HEADER, HatchScreen.LIBRARY_HOME, HatchComponent.THREE_DOTS_MENU, null, null, null);
        MutableState.A09(true, this.$showMenu$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
