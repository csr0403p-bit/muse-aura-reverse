package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.library.repo.ArtifactSortMode;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LibraryOverflowMenuKt$LibraryOverflowMenu$1$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onDismiss;
    public final /* synthetic */ G0U<ArtifactSortMode, Unit> $onSelectSort;
    public final /* synthetic */ G0U<LibraryViewMode, Unit> $onSetViewMode;
    public final /* synthetic */ Function0<Unit> $onSystemFiles;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        G0U g0u;
        Enum r0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onDismiss.invoke();
        int i = auraContextMenuItem.id;
        if (i == 1) {
            g0u = this.$onSetViewMode;
            r0 = LibraryViewMode.GRID;
        } else if (i == 2) {
            g0u = this.$onSetViewMode;
            r0 = LibraryViewMode.LIST;
        } else if (i == 4) {
            g0u = this.$onSelectSort;
            r0 = ArtifactSortMode.LAST_OPENED;
        } else if (i == 5) {
            g0u = this.$onSelectSort;
            r0 = ArtifactSortMode.TITLE;
        } else if (i == 6) {
            this.$onSystemFiles.invoke();
            return;
        } else {
            if (i != 7) {
                return;
            }
            g0u = this.$onSelectSort;
            r0 = ArtifactSortMode.LAST_MODIFIED;
        }
        g0u.invoke(r0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LibraryOverflowMenuKt$LibraryOverflowMenu$1$1(Function0<Unit> function0, G0U<? super LibraryViewMode, Unit> g0u, G0U<? super ArtifactSortMode, Unit> g0u2, Function0<Unit> function02) {
        super(1);
        this.$onDismiss = function0;
        this.$onSetViewMode = g0u;
        this.$onSelectSort = g0u2;
        this.$onSystemFiles = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
