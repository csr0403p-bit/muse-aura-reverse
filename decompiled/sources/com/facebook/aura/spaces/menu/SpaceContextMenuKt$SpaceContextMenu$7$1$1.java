package com.facebook.aura.spaces.menu;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.repo.ArtifactPlacement;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceContextMenuKt$SpaceContextMenu$7$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<ArtifactPlacement> $moveConfirmationPlacement$delegate;
    public final /* synthetic */ SpaceMenuLogOrigin $moveLogOrigin;
    public final /* synthetic */ Function0<Unit> $onMoveToLibrary;
    public final /* synthetic */ Function0<Unit> $onMoveToSpaces;
    public final /* synthetic */ ArtifactPlacement $placement;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArtifactPlacement.values().length];
            try {
                AnonymousClass002.A13(ArtifactPlacement.LIBRARY, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ArtifactPlacement.SPACES, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceContextMenuKt$SpaceContextMenu$7$1$1(SpaceMenuLogOrigin spaceMenuLogOrigin, ArtifactPlacement artifactPlacement, Function0<Unit> function0, Function0<Unit> function02, MutableState<ArtifactPlacement> mutableState) {
        super(0);
        this.$moveLogOrigin = spaceMenuLogOrigin;
        this.$placement = artifactPlacement;
        this.$onMoveToLibrary = function0;
        this.$onMoveToSpaces = function02;
        this.$moveConfirmationPlacement$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Function0<Unit> function0;
        SpaceMenuLogOrigin spaceMenuLogOrigin = this.$moveLogOrigin;
        if (spaceMenuLogOrigin != null) {
            SpaceMenuAnalytics.INSTANCE.logMoveToSpacesConfirm$fbandroid_express_aura_java_com_facebook_aura_spaces_menu_menu(spaceMenuLogOrigin);
        }
        this.$moveConfirmationPlacement$delegate.Af8(null);
        int iOrdinal = this.$placement.ordinal();
        if (iOrdinal == 0) {
            function0 = this.$onMoveToLibrary;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            function0 = this.$onMoveToSpaces;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
