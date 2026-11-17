package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.G0U;
import X.G0V;
import android.graphics.Bitmap;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class InlineFilesCardKt$InlineSwipeableEntryRow$2$1 extends AbstractC7559F3s implements G0U<Bitmap, Unit> {
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineFilesCardKt$InlineSwipeableEntryRow$2$1(G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, WorkspaceEntry workspaceEntry) {
        super(1);
        this.$onNavigateToConversation = g0v;
        this.$entry = workspaceEntry;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Bitmap bitmap) {
        this.$onNavigateToConversation.invoke(this.$entry, bitmap);
    }
}
