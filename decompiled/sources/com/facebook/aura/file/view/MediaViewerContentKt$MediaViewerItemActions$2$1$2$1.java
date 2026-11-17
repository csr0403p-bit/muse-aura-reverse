package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerItemActions$2$1$2$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ Function0<Unit> $onCopyClick;
    public final /* synthetic */ Function0<Unit> $onDeleteClick;
    public final /* synthetic */ Function0<Unit> $onDownloadClick;
    public final /* synthetic */ Function0<Unit> $onReplyClick;
    public final /* synthetic */ Function0<Unit> $onShareClick;
    public final /* synthetic */ G0U<Boolean, Unit> $setMenuExpanded;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        Function0<Unit> function0;
        C7384Etj.A0Y(auraContextMenuItem, 0);
        AnonymousClass001.A1K(false, this.$setMenuExpanded);
        int i = auraContextMenuItem.id;
        if (i == 0) {
            function0 = this.$onReplyClick;
        } else if (i == 1) {
            function0 = this.$onShareClick;
        } else if (i == 2) {
            function0 = this.$onCopyClick;
        } else if (i == 3) {
            function0 = this.$onDeleteClick;
        } else if (i != 4) {
            return;
        } else {
            function0 = this.$onDownloadClick;
        }
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerItemActions$2$1$2$1(G0U<? super Boolean, Unit> g0u, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05) {
        super(1);
        this.$setMenuExpanded = g0u;
        this.$onReplyClick = function0;
        this.$onShareClick = function02;
        this.$onDownloadClick = function03;
        this.$onCopyClick = function04;
        this.$onDeleteClick = function05;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
